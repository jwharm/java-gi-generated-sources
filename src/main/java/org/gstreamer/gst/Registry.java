package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * One registry holds the metadata of a set of plugins.
 * <p>
 * &lt;emphasis role="bold"&gt;Design:&lt;/emphasis&gt;
 * <p>
 * The {@link Registry} object is a list of plugins and some functions for dealing
 * with them. Each {@link Plugin} is matched 1-1 with a file on disk, and may or may
 * not be loaded at a given time.
 * <p>
 * The primary source, at all times, of plugin information is each plugin file
 * itself. Thus, if an application wants information about a particular plugin,
 * or wants to search for a feature that satisfies given criteria, the primary
 * means of doing so is to load every plugin and look at the resulting
 * information that is gathered in the default registry. Clearly, this is a time
 * consuming process, so we cache information in the registry file. The format
 * and location of the cache file is internal to gstreamer.
 * <p>
 * On startup, plugins are searched for in the plugin search path. The following
 * locations are checked in this order:
 * <p>
 * * location from --gst-plugin-path commandline option.
 * * the GST_PLUGIN_PATH environment variable.
 * * the GST_PLUGIN_SYSTEM_PATH environment variable.
 * * default locations (if GST_PLUGIN_SYSTEM_PATH is not set).
 *   Those default locations are:
 *   {@code $XDG_DATA_HOME/gstreamer-$GST_API_VERSION/plugins/}
 *   and {@code $prefix/libs/gstreamer-$GST_API_VERSION/}.
 *   <a href="http://standards.freedesktop.org/basedir-spec/basedir-spec-latest.html">$XDG_DATA_HOME</a> defaults to
 *   {@code $HOME/.local/share}.
 * <p>
 * The registry cache file is loaded from
 * {@code $XDG_CACHE_HOME/gstreamer-$GST_API_VERSION/registry-$ARCH.bin}
 * (where $XDG_CACHE_HOME defaults to {@code $HOME/.cache}) or the file listed in the {@code GST_REGISTRY}
 * env var. One reason to change the registry location is for testing.
 * <p>
 * For each plugin that is found in the plugin search path, there could be 3
 * possibilities for cached information:
 * <p>
 *   * the cache may not contain information about a given file.
 *   * the cache may have stale information.
 *   * the cache may have current information.
 * <p>
 * In the first two cases, the plugin is loaded and the cache updated. In
 * addition to these cases, the cache may have entries for plugins that are not
 * relevant to the current process. These are marked as not available to the
 * current process. If the cache is updated for whatever reason, it is marked
 * dirty.
 * <p>
 * A dirty cache is written out at the end of initialization. Each entry is
 * checked to make sure the information is minimally valid. If not, the entry is
 * simply dropped.
 * <p>
 * <strong>Implementation notes:</strong><br/>
 * The "cache" and "registry" are different concepts and can represent
 * different sets of plugins. For various reasons, at init time, the cache is
 * stored in the default registry, and plugins not relevant to the current
 * process are marked with the {@link PluginFlags#CACHED} bit. These plugins are
 * removed at the end of initialization.
 */
public class Registry extends org.gstreamer.gst.GstObject {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRegistry";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("object"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Registry proxy instance for the provided memory address.
     * <p>
     * Because Registry is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Registry(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Registry> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Registry(input, ownership);
    
    /**
     * Add the feature to the registry. The feature-added signal will be emitted.
     * <p>
     * {@code feature}'s reference count will be incremented, and any floating
     * reference will be removed (see gst_object_ref_sink())
     * @param feature the feature to add
     * @return {@code true} on success.
     * <p>
     * MT safe.
     */
    public boolean addFeature(org.gstreamer.gst.PluginFeature feature) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_registry_add_feature.invokeExact(
                    handle(),
                    feature.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Add the plugin to the registry. The plugin-added signal will be emitted.
     * <p>
     * {@code plugin}'s reference count will be incremented, and any floating
     * reference will be removed (see gst_object_ref_sink())
     * @param plugin the plugin to add
     * @return {@code true} on success.
     * <p>
     * MT safe.
     */
    public boolean addPlugin(org.gstreamer.gst.Plugin plugin) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_registry_add_plugin.invokeExact(
                    handle(),
                    plugin.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks whether a plugin feature by the given name exists in
     * {@code registry} and whether its version is at least the
     * version required.
     * @param featureName the name of the feature (e.g. "oggdemux")
     * @param minMajor the minimum major version number
     * @param minMinor the minimum minor version number
     * @param minMicro the minimum micro version number
     * @return {@code true} if the feature could be found and the version is
     * the same as the required version or newer, and {@code false} otherwise.
     */
    public boolean checkFeatureVersion(java.lang.String featureName, int minMajor, int minMinor, int minMicro) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_registry_check_feature_version.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(featureName, null),
                    minMajor,
                    minMinor,
                    minMicro);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Runs a filter against all features of the plugins in the registry
     * and returns a GList with the results.
     * If the first flag is set, only the first match is
     * returned (as a list with a single object).
     * @param filter the filter to use
     * @param first only return first match
     * @return a {@link org.gtk.glib.List} of
     *     {@link PluginFeature}. Use gst_plugin_feature_list_free() after usage.
     * <p>
     * MT safe.
     */
    public org.gtk.glib.List featureFilter(org.gstreamer.gst.PluginFeatureFilter filter, boolean first) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_registry_feature_filter.invokeExact(
                    handle(),
                    (Addressable) filter.toCallback(),
                    Marshal.booleanToInteger.marshal(first, null).intValue(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Find the pluginfeature with the given name and type in the registry.
     * @param name the pluginfeature name to find
     * @param type the pluginfeature type to find
     * @return the pluginfeature with the
     *     given name and type or {@code null} if the plugin was not
     *     found. gst_object_unref() after usage.
     * <p>
     * MT safe.
     */
    public @Nullable org.gstreamer.gst.PluginFeature findFeature(java.lang.String name, org.gtk.glib.Type type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_registry_find_feature.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null),
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.PluginFeature) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.PluginFeature.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Find the plugin with the given name in the registry.
     * The plugin will be reffed; caller is responsible for unreffing.
     * @param name the plugin name to find
     * @return the plugin with the given name
     *     or {@code null} if the plugin was not found. gst_object_unref() after
     *     usage.
     * <p>
     * MT safe.
     */
    public @Nullable org.gstreamer.gst.Plugin findPlugin(java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_registry_find_plugin.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.Plugin) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.Plugin.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Retrieves a {@link org.gtk.glib.List} of {@link PluginFeature} of {@code type}.
     * @param type a {@link org.gtk.glib.Type}.
     * @return a {@link org.gtk.glib.List} of
     *     {@link PluginFeature} of {@code type}. Use gst_plugin_feature_list_free() after use
     * <p>
     * MT safe.
     */
    public org.gtk.glib.List getFeatureList(org.gtk.glib.Type type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_registry_get_feature_list.invokeExact(
                    handle(),
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Retrieves a {@link org.gtk.glib.List} of features of the plugin with name {@code name}.
     * @param name a plugin name.
     * @return a {@link org.gtk.glib.List} of
     *     {@link PluginFeature}. Use gst_plugin_feature_list_free() after usage.
     */
    public org.gtk.glib.List getFeatureListByPlugin(java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_registry_get_feature_list_by_plugin.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the registry's feature list cookie. This changes
     * every time a feature is added or removed from the registry.
     * @return the feature list cookie.
     */
    public int getFeatureListCookie() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_registry_get_feature_list_cookie.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get a copy of all plugins registered in the given registry. The refcount
     * of each element in the list in incremented.
     * @return a {@link org.gtk.glib.List} of {@link Plugin}.
     *     Use gst_plugin_list_free() after usage.
     * <p>
     * MT safe.
     */
    public org.gtk.glib.List getPluginList() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_registry_get_plugin_list.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Look up a plugin in the given registry with the given filename.
     * If found, plugin is reffed.
     * @param filename the name of the file to look up
     * @return the {@link Plugin} if found, or
     *     {@code null} if not.  gst_object_unref() after usage.
     */
    public @Nullable org.gstreamer.gst.Plugin lookup(java.lang.String filename) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_registry_lookup.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(filename, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.Plugin) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.Plugin.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Find a {@link PluginFeature} with {@code name} in {@code registry}.
     * @param name a {@link PluginFeature} name
     * @return a {@link PluginFeature} with its refcount incremented,
     *     use gst_object_unref() after usage.
     * <p>
     * MT safe.
     */
    public @Nullable org.gstreamer.gst.PluginFeature lookupFeature(java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_registry_lookup_feature.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.PluginFeature) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.PluginFeature.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Runs a filter against all plugins in the registry and returns a {@link org.gtk.glib.List} with
     * the results. If the first flag is set, only the first match is
     * returned (as a list with a single object).
     * Every plugin is reffed; use gst_plugin_list_free() after use, which
     * will unref again.
     * @param filter the filter to use
     * @param first only return first match
     * @return a {@link org.gtk.glib.List} of {@link Plugin}.
     *     Use gst_plugin_list_free() after usage.
     * <p>
     * MT safe.
     */
    public org.gtk.glib.List pluginFilter(org.gstreamer.gst.PluginFilter filter, boolean first) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_registry_plugin_filter.invokeExact(
                    handle(),
                    (Addressable) filter.toCallback(),
                    Marshal.booleanToInteger.marshal(first, null).intValue(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Remove the feature from the registry.
     * <p>
     * MT safe.
     * @param feature the feature to remove
     */
    public void removeFeature(org.gstreamer.gst.PluginFeature feature) {
        try {
            DowncallHandles.gst_registry_remove_feature.invokeExact(
                    handle(),
                    feature.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Remove the plugin from the registry.
     * <p>
     * MT safe.
     * @param plugin the plugin to remove
     */
    public void removePlugin(org.gstreamer.gst.Plugin plugin) {
        try {
            DowncallHandles.gst_registry_remove_plugin.invokeExact(
                    handle(),
                    plugin.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Scan the given path for plugins to add to the registry. The syntax of the
     * path is specific to the registry.
     * @param path the path to scan
     * @return {@code true} if registry changed
     */
    public boolean scanPath(java.lang.String path) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_registry_scan_path.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(path, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_registry_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * By default GStreamer will perform scanning and rebuilding of the
     * registry file using a helper child process.
     * <p>
     * Applications might want to disable this behaviour with the
     * gst_registry_fork_set_enabled() function, in which case new plugins
     * are scanned (and loaded) into the application process.
     * @return {@code true} if GStreamer will use the child helper process when
     * rebuilding the registry.
     */
    public static boolean forkIsEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_registry_fork_is_enabled.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Applications might want to disable/enable spawning of a child helper process
     * when rebuilding the registry. See gst_registry_fork_is_enabled() for more
     * information.
     * @param enabled whether rebuilding the registry can use a temporary child helper process.
     */
    public static void forkSetEnabled(boolean enabled) {
        try {
            DowncallHandles.gst_registry_fork_set_enabled.invokeExact(
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the singleton plugin registry. The caller does not own a
     * reference on the registry, as it is alive as long as GStreamer is
     * initialized.
     * @return the {@link Registry}.
     */
    public static org.gstreamer.gst.Registry get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_registry_get.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.Registry) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.Registry.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    @FunctionalInterface
    public interface FeatureAdded {
        void run(org.gstreamer.gst.PluginFeature feature);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceRegistry, MemoryAddress feature) {
            run((org.gstreamer.gst.PluginFeature) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(feature)), org.gstreamer.gst.PluginFeature.fromAddress).marshal(feature, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FeatureAdded.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Signals that a feature has been added to the registry (possibly
     * replacing a previously-added one by the same name)
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Registry.FeatureAdded> onFeatureAdded(Registry.FeatureAdded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("feature-added"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PluginAdded {
        void run(org.gstreamer.gst.Plugin plugin);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceRegistry, MemoryAddress plugin) {
            run((org.gstreamer.gst.Plugin) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(plugin)), org.gstreamer.gst.Plugin.fromAddress).marshal(plugin, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PluginAdded.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Signals that a plugin has been added to the registry (possibly
     * replacing a previously-added one by the same name)
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Registry.PluginAdded> onPluginAdded(Registry.PluginAdded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("plugin-added"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Registry.Builder} object constructs a {@link Registry} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Registry.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Registry} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Registry}.
         * @return A new instance of {@code Registry} with the properties 
         *         that were set in the Builder object.
         */
        public Registry build() {
            return (Registry) org.gtk.gobject.GObject.newWithProperties(
                Registry.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_registry_add_feature = Interop.downcallHandle(
            "gst_registry_add_feature",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_registry_add_plugin = Interop.downcallHandle(
            "gst_registry_add_plugin",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_registry_check_feature_version = Interop.downcallHandle(
            "gst_registry_check_feature_version",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_registry_feature_filter = Interop.downcallHandle(
            "gst_registry_feature_filter",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_registry_find_feature = Interop.downcallHandle(
            "gst_registry_find_feature",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_registry_find_plugin = Interop.downcallHandle(
            "gst_registry_find_plugin",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_registry_get_feature_list = Interop.downcallHandle(
            "gst_registry_get_feature_list",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_registry_get_feature_list_by_plugin = Interop.downcallHandle(
            "gst_registry_get_feature_list_by_plugin",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_registry_get_feature_list_cookie = Interop.downcallHandle(
            "gst_registry_get_feature_list_cookie",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_registry_get_plugin_list = Interop.downcallHandle(
            "gst_registry_get_plugin_list",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_registry_lookup = Interop.downcallHandle(
            "gst_registry_lookup",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_registry_lookup_feature = Interop.downcallHandle(
            "gst_registry_lookup_feature",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_registry_plugin_filter = Interop.downcallHandle(
            "gst_registry_plugin_filter",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_registry_remove_feature = Interop.downcallHandle(
            "gst_registry_remove_feature",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_registry_remove_plugin = Interop.downcallHandle(
            "gst_registry_remove_plugin",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_registry_scan_path = Interop.downcallHandle(
            "gst_registry_scan_path",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_registry_get_type = Interop.downcallHandle(
            "gst_registry_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_registry_fork_is_enabled = Interop.downcallHandle(
            "gst_registry_fork_is_enabled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_registry_fork_set_enabled = Interop.downcallHandle(
            "gst_registry_fork_set_enabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_registry_get = Interop.downcallHandle(
            "gst_registry_get",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
