package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GStreamer is extensible, so {@link Element} instances can be loaded at runtime.
 * A plugin system can provide one or more of the basic GStreamer
 * {@link PluginFeature} subclasses.
 * <p>
 * A plugin should export a symbol {@code gst_plugin_desc} that is a
 * struct of type {@link PluginDesc}.
 * the plugin loader will check the version of the core library the plugin was
 * linked against and will create a new {@link Plugin}. It will then call the
 * {@link PluginInitFunc} function that was provided in the
 * {@code gst_plugin_desc}.
 * <p>
 * Once you have a handle to a {@link Plugin} (e.g. from the {@link Registry}), you
 * can add any object that subclasses {@link PluginFeature}.
 * <p>
 * Usually plugins are always automatically loaded so you don't need to call
 * gst_plugin_load() explicitly to bring it into memory. There are options to
 * statically link plugins to an app or even use GStreamer without a plugin
 * repository in which case gst_plugin_load() can be needed to bring the plugin
 * into memory.
 */
public class Plugin extends org.gstreamer.gst.GstObject {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlugin";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Plugin proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Plugin(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Plugin> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Plugin(input);
    
    /**
     * Make GStreamer aware of external dependencies which affect the feature
     * set of this plugin (ie. the elements or typefinders associated with it).
     * <p>
     * GStreamer will re-inspect plugins with external dependencies whenever any
     * of the external dependencies change. This is useful for plugins which wrap
     * other plugin systems, e.g. a plugin which wraps a plugin-based visualisation
     * library and makes visualisations available as GStreamer elements, or a
     * codec loader which exposes elements and/or caps dependent on what external
     * codec libraries are currently installed.
     * @param envVars {@code null}-terminated array of environment variables affecting the
     *     feature set of the plugin (e.g. an environment variable containing
     *     paths where to look for additional modules/plugins of a library),
     *     or {@code null}. Environment variable names may be followed by a path component
     *      which will be added to the content of the environment variable, e.g.
     *      "HOME/.mystuff/plugins".
     * @param paths {@code null}-terminated array of directories/paths where dependent files
     *     may be, or {@code null}.
     * @param names {@code null}-terminated array of file names (or file name suffixes,
     *     depending on {@code flags}) to be used in combination with the paths from
     *     {@code paths} and/or the paths extracted from the environment variables in
     *     {@code env_vars}, or {@code null}.
     * @param flags optional flags, or {@code GST_PLUGIN_DEPENDENCY_FLAG_NONE}
     */
    public void addDependency(@Nullable java.lang.String[] envVars, @Nullable java.lang.String[] paths, @Nullable java.lang.String[] names, org.gstreamer.gst.PluginDependencyFlags flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_plugin_add_dependency.invokeExact(
                        handle(),
                        (Addressable) (envVars == null ? MemoryAddress.NULL : Interop.allocateNativeArray(envVars, false, SCOPE)),
                        (Addressable) (paths == null ? MemoryAddress.NULL : Interop.allocateNativeArray(paths, false, SCOPE)),
                        (Addressable) (names == null ? MemoryAddress.NULL : Interop.allocateNativeArray(names, false, SCOPE)),
                        flags.getValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Make GStreamer aware of external dependencies which affect the feature
     * set of this plugin (ie. the elements or typefinders associated with it).
     * <p>
     * GStreamer will re-inspect plugins with external dependencies whenever any
     * of the external dependencies change. This is useful for plugins which wrap
     * other plugin systems, e.g. a plugin which wraps a plugin-based visualisation
     * library and makes visualisations available as GStreamer elements, or a
     * codec loader which exposes elements and/or caps dependent on what external
     * codec libraries are currently installed.
     * <p>
     * Convenience wrapper function for gst_plugin_add_dependency() which
     * takes simple strings as arguments instead of string arrays, with multiple
     * arguments separated by predefined delimiters (see above).
     * @param envVars one or more environment variables (separated by ':', ';' or ','),
     *      or {@code null}. Environment variable names may be followed by a path component
     *      which will be added to the content of the environment variable, e.g.
     *      "HOME/.mystuff/plugins:MYSTUFF_PLUGINS_PATH"
     * @param paths one ore more directory paths (separated by ':' or ';' or ','),
     *      or {@code null}. Example: "/usr/lib/mystuff/plugins"
     * @param names one or more file names or file name suffixes (separated by commas),
     *      or {@code null}
     * @param flags optional flags, or {@code GST_PLUGIN_DEPENDENCY_FLAG_NONE}
     */
    public void addDependencySimple(@Nullable java.lang.String envVars, @Nullable java.lang.String paths, @Nullable java.lang.String names, org.gstreamer.gst.PluginDependencyFlags flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_plugin_add_dependency_simple.invokeExact(
                        handle(),
                        (Addressable) (envVars == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(envVars, SCOPE)),
                        (Addressable) (paths == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(paths, SCOPE)),
                        (Addressable) (names == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(names, SCOPE)),
                        flags.getValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Gets the plugin specific data cache. If it is {@code null} there is no cached data
     * stored. This is the case when the registry is getting rebuilt.
     * @return The cached data as a
     * {@link Structure} or {@code null}.
     */
    public @Nullable org.gstreamer.gst.Structure getCacheData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_get_cache_data.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Get the long descriptive name of the plugin
     * @return the long name of the plugin
     */
    public java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_get_description.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * get the filename of the plugin
     * @return the filename of the plugin
     */
    public @Nullable java.lang.String getFilename() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_get_filename.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * get the license of the plugin
     * @return the license of the plugin
     */
    public java.lang.String getLicense() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_get_license.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the short name of the plugin
     * @return the name of the plugin
     */
    public java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_get_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * get the URL where the plugin comes from
     * @return the origin of the plugin
     */
    public java.lang.String getOrigin() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_get_origin.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * get the package the plugin belongs to.
     * @return the package of the plugin
     */
    public java.lang.String getPackage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_get_package.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the release date (and possibly time) in form of a string, if available.
     * <p>
     * For normal GStreamer plugin releases this will usually just be a date in
     * the form of "YYYY-MM-DD", while pre-releases and builds from git may contain
     * a time component after the date as well, in which case the string will be
     * formatted like "YYYY-MM-DDTHH:MMZ" (e.g. "2012-04-30T09:30Z").
     * <p>
     * There may be plugins that do not have a valid release date set on them.
     * @return the date string of the plugin, or {@code null} if not
     * available.
     */
    public @Nullable java.lang.String getReleaseDateString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_get_release_date_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * get the source module the plugin belongs to.
     * @return the source of the plugin
     */
    public java.lang.String getSource() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_get_source.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * get the version of the plugin
     * @return the version of the plugin
     */
    public java.lang.String getVersion() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_get_version.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * queries if the plugin is loaded into memory
     * @return {@code true} is loaded, {@code false} otherwise
     */
    public boolean isLoaded() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_plugin_is_loaded.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Loads {@code plugin}. Note that the <em>return value</em> is the loaded plugin; {@code plugin} is
     * untouched. The normal use pattern of this function goes like this:
     * <pre>{@code 
     * GstPlugin *loaded_plugin;
     * loaded_plugin = gst_plugin_load (plugin);
     * // presumably, we're no longer interested in the potentially-unloaded plugin
     * gst_object_unref (plugin);
     * plugin = loaded_plugin;
     * }</pre>
     * @return a reference to a loaded plugin, or
     * {@code null} on error.
     */
    public @Nullable org.gstreamer.gst.Plugin load() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_load.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.gst.Plugin) Interop.register(RESULT, org.gstreamer.gst.Plugin.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Adds plugin specific data to cache. Passes the ownership of the structure to
     * the {@code plugin}.
     * <p>
     * The cache is flushed every time the registry is rebuilt.
     * @param cacheData a structure containing the data to cache
     */
    public void setCacheData(org.gstreamer.gst.Structure cacheData) {
        try {
            DowncallHandles.gst_plugin_set_cache_data.invokeExact(
                    handle(),
                    cacheData.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        cacheData.yieldOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_plugin_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Unrefs each member of {@code list}, then frees the list.
     * @param list list of {@link Plugin}
     */
    public static void listFree(org.gtk.glib.List list) {
        try {
            DowncallHandles.gst_plugin_list_free.invokeExact(list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        list.yieldOwnership();
    }
    
    /**
     * Load the named plugin. Refs the plugin.
     * @param name name of plugin to load
     * @return a reference to a loaded plugin, or
     * {@code null} on error.
     */
    public static @Nullable org.gstreamer.gst.Plugin loadByName(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_plugin_load_by_name.invokeExact(Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = (org.gstreamer.gst.Plugin) Interop.register(RESULT, org.gstreamer.gst.Plugin.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Loads the given plugin and refs it.  Caller needs to unref after use.
     * @param filename the plugin filename to load
     * @return a reference to the existing loaded GstPlugin, a
     * reference to the newly-loaded GstPlugin, or {@code null} if an error occurred.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static org.gstreamer.gst.Plugin loadFile(java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_plugin_load_file.invokeExact(Marshal.stringToAddress.marshal(filename, SCOPE),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = (org.gstreamer.gst.Plugin) Interop.register(RESULT, org.gstreamer.gst.Plugin.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Registers a static plugin, ie. a plugin which is private to an application
     * or library and contained within the application or library (as opposed to
     * being shipped as a separate module file).
     * <p>
     * You must make sure that GStreamer has been initialised (with gst_init() or
     * via gst_init_get_option_group()) before calling this function.
     * @param majorVersion the major version number of the GStreamer core that the
     *     plugin was compiled for, you can just use GST_VERSION_MAJOR here
     * @param minorVersion the minor version number of the GStreamer core that the
     *     plugin was compiled for, you can just use GST_VERSION_MINOR here
     * @param name a unique name of the plugin (ideally prefixed with an application- or
     *     library-specific namespace prefix in order to avoid name conflicts in
     *     case a similar plugin with the same name ever gets added to GStreamer)
     * @param description description of the plugin
     * @param initFunc pointer to the init function of this plugin.
     * @param version version string of the plugin
     * @param license effective license of plugin. Must be one of the approved licenses
     *     (see {@link PluginDesc} above) or the plugin will not be registered.
     * @param source source module plugin belongs to
     * @param package_ shipped package plugin belongs to
     * @param origin URL to provider of plugin
     * @return {@code true} if the plugin was registered correctly, otherwise {@code false}.
     */
    public static boolean registerStatic(int majorVersion, int minorVersion, java.lang.String name, java.lang.String description, org.gstreamer.gst.PluginInitFunc initFunc, java.lang.String version, java.lang.String license, java.lang.String source, java.lang.String package_, java.lang.String origin) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_plugin_register_static.invokeExact(
                        majorVersion,
                        minorVersion,
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        Marshal.stringToAddress.marshal(description, SCOPE),
                        (Addressable) initFunc.toCallback(),
                        Marshal.stringToAddress.marshal(version, SCOPE),
                        Marshal.stringToAddress.marshal(license, SCOPE),
                        Marshal.stringToAddress.marshal(source, SCOPE),
                        Marshal.stringToAddress.marshal(package_, SCOPE),
                        Marshal.stringToAddress.marshal(origin, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Registers a static plugin, ie. a plugin which is private to an application
     * or library and contained within the application or library (as opposed to
     * being shipped as a separate module file) with a {@link PluginInitFullFunc}
     * which allows user data to be passed to the callback function (useful
     * for bindings).
     * <p>
     * You must make sure that GStreamer has been initialised (with gst_init() or
     * via gst_init_get_option_group()) before calling this function.
     * @param majorVersion the major version number of the GStreamer core that the
     *     plugin was compiled for, you can just use GST_VERSION_MAJOR here
     * @param minorVersion the minor version number of the GStreamer core that the
     *     plugin was compiled for, you can just use GST_VERSION_MINOR here
     * @param name a unique name of the plugin (ideally prefixed with an application- or
     *     library-specific namespace prefix in order to avoid name conflicts in
     *     case a similar plugin with the same name ever gets added to GStreamer)
     * @param description description of the plugin
     * @param initFullFunc pointer to the init function with user data
     *     of this plugin.
     * @param version version string of the plugin
     * @param license effective license of plugin. Must be one of the approved licenses
     *     (see {@link PluginDesc} above) or the plugin will not be registered.
     * @param source source module plugin belongs to
     * @param package_ shipped package plugin belongs to
     * @param origin URL to provider of plugin
     * @return {@code true} if the plugin was registered correctly, otherwise {@code false}.
     */
    public static boolean registerStaticFull(int majorVersion, int minorVersion, java.lang.String name, java.lang.String description, org.gstreamer.gst.PluginInitFullFunc initFullFunc, java.lang.String version, java.lang.String license, java.lang.String source, java.lang.String package_, java.lang.String origin) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_plugin_register_static_full.invokeExact(
                        majorVersion,
                        minorVersion,
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        Marshal.stringToAddress.marshal(description, SCOPE),
                        (Addressable) initFullFunc.toCallback(),
                        Marshal.stringToAddress.marshal(version, SCOPE),
                        Marshal.stringToAddress.marshal(license, SCOPE),
                        Marshal.stringToAddress.marshal(source, SCOPE),
                        Marshal.stringToAddress.marshal(package_, SCOPE),
                        Marshal.stringToAddress.marshal(origin, SCOPE),
                        (Addressable) MemoryAddress.NULL);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * A {@link Plugin.Builder} object constructs a {@link Plugin} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Plugin.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Plugin} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Plugin}.
         * @return A new instance of {@code Plugin} with the properties 
         *         that were set in the Builder object.
         */
        public Plugin build() {
            return (Plugin) org.gtk.gobject.GObject.newWithProperties(
                Plugin.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_plugin_add_dependency = Interop.downcallHandle(
                "gst_plugin_add_dependency",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_plugin_add_dependency_simple = Interop.downcallHandle(
                "gst_plugin_add_dependency_simple",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_plugin_get_cache_data = Interop.downcallHandle(
                "gst_plugin_get_cache_data",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_plugin_get_description = Interop.downcallHandle(
                "gst_plugin_get_description",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_plugin_get_filename = Interop.downcallHandle(
                "gst_plugin_get_filename",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_plugin_get_license = Interop.downcallHandle(
                "gst_plugin_get_license",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_plugin_get_name = Interop.downcallHandle(
                "gst_plugin_get_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_plugin_get_origin = Interop.downcallHandle(
                "gst_plugin_get_origin",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_plugin_get_package = Interop.downcallHandle(
                "gst_plugin_get_package",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_plugin_get_release_date_string = Interop.downcallHandle(
                "gst_plugin_get_release_date_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_plugin_get_source = Interop.downcallHandle(
                "gst_plugin_get_source",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_plugin_get_version = Interop.downcallHandle(
                "gst_plugin_get_version",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_plugin_is_loaded = Interop.downcallHandle(
                "gst_plugin_is_loaded",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_plugin_load = Interop.downcallHandle(
                "gst_plugin_load",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_plugin_set_cache_data = Interop.downcallHandle(
                "gst_plugin_set_cache_data",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_plugin_get_type = Interop.downcallHandle(
                "gst_plugin_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_plugin_list_free = Interop.downcallHandle(
                "gst_plugin_list_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_plugin_load_by_name = Interop.downcallHandle(
                "gst_plugin_load_by_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_plugin_load_file = Interop.downcallHandle(
                "gst_plugin_load_file",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_plugin_register_static = Interop.downcallHandle(
                "gst_plugin_register_static",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_plugin_register_static_full = Interop.downcallHandle(
                "gst_plugin_register_static_full",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_plugin_get_type != null;
    }
}
