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
public class Plugin extends org.gstreamer.gst.Object {
    
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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Plugin(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Plugin if its GType is a (or inherits from) "GstPlugin".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Plugin} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstPlugin", a ClassCastException will be thrown.
     */
    public static Plugin castFrom(org.gtk.gobject.Object gobject) {
            return new Plugin(gobject.handle(), gobject.yieldOwnership());
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
    public void addDependency(@Nullable java.lang.String[] envVars, @Nullable java.lang.String[] paths, @Nullable java.lang.String[] names, @NotNull org.gstreamer.gst.PluginDependencyFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.gst_plugin_add_dependency.invokeExact(
                    handle(),
                    (Addressable) (envVars == null ? MemoryAddress.NULL : Interop.allocateNativeArray(envVars, false)),
                    (Addressable) (paths == null ? MemoryAddress.NULL : Interop.allocateNativeArray(paths, false)),
                    (Addressable) (names == null ? MemoryAddress.NULL : Interop.allocateNativeArray(names, false)),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public void addDependencySimple(@Nullable java.lang.String envVars, @Nullable java.lang.String paths, @Nullable java.lang.String names, @NotNull org.gstreamer.gst.PluginDependencyFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.gst_plugin_add_dependency_simple.invokeExact(
                    handle(),
                    (Addressable) (envVars == null ? MemoryAddress.NULL : Interop.allocateNativeString(envVars)),
                    (Addressable) (paths == null ? MemoryAddress.NULL : Interop.allocateNativeString(paths)),
                    (Addressable) (names == null ? MemoryAddress.NULL : Interop.allocateNativeString(names)),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_get_cache_data.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Structure(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the long descriptive name of the plugin
     * @return the long name of the plugin
     */
    public @NotNull java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_get_description.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * get the filename of the plugin
     * @return the filename of the plugin
     */
    public @Nullable java.lang.String getFilename() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_get_filename.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * get the license of the plugin
     * @return the license of the plugin
     */
    public @NotNull java.lang.String getLicense() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_get_license.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the short name of the plugin
     * @return the name of the plugin
     */
    public @NotNull java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * get the URL where the plugin comes from
     * @return the origin of the plugin
     */
    public @NotNull java.lang.String getOrigin() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_get_origin.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * get the package the plugin belongs to.
     * @return the package of the plugin
     */
    public @NotNull java.lang.String getPackage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_get_package.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_get_release_date_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * get the source module the plugin belongs to.
     * @return the source of the plugin
     */
    public @NotNull java.lang.String getSource() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_get_source.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * get the version of the plugin
     * @return the version of the plugin
     */
    public @NotNull java.lang.String getVersion() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_get_version.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * queries if the plugin is loaded into memory
     * @return {@code true} is loaded, {@code false} otherwise
     */
    public boolean isLoaded() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_plugin_is_loaded.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_load.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Plugin(RESULT, Ownership.FULL);
    }
    
    /**
     * Adds plugin specific data to cache. Passes the ownership of the structure to
     * the {@code plugin}.
     * <p>
     * The cache is flushed every time the registry is rebuilt.
     * @param cacheData a structure containing the data to cache
     */
    public void setCacheData(@NotNull org.gstreamer.gst.Structure cacheData) {
        java.util.Objects.requireNonNull(cacheData, "Parameter 'cacheData' must not be null");
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
    public static @NotNull org.gtk.glib.Type getType() {
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
    public static void listFree(@NotNull org.gtk.glib.List list) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        try {
            DowncallHandles.gst_plugin_list_free.invokeExact(
                    list.handle());
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
    public static @Nullable org.gstreamer.gst.Plugin loadByName(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_load_by_name.invokeExact(
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Plugin(RESULT, Ownership.FULL);
    }
    
    /**
     * Loads the given plugin and refs it.  Caller needs to unref after use.
     * @param filename the plugin filename to load
     * @return a reference to the existing loaded GstPlugin, a
     * reference to the newly-loaded GstPlugin, or {@code null} if an error occurred.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static @NotNull org.gstreamer.gst.Plugin loadFile(@NotNull java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(filename, "Parameter 'filename' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_load_file.invokeExact(
                    Interop.allocateNativeString(filename),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gstreamer.gst.Plugin(RESULT, Ownership.FULL);
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
    public static boolean registerStatic(int majorVersion, int minorVersion, @NotNull java.lang.String name, @NotNull java.lang.String description, @NotNull org.gstreamer.gst.PluginInitFunc initFunc, @NotNull java.lang.String version, @NotNull java.lang.String license, @NotNull java.lang.String source, @NotNull java.lang.String package_, @NotNull java.lang.String origin) {
        throw new UnsupportedOperationException("Operation not supported yet");
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
    public static boolean registerStaticFull(int majorVersion, int minorVersion, @NotNull java.lang.String name, @NotNull java.lang.String description, @NotNull org.gstreamer.gst.PluginInitFullFunc initFullFunc, @NotNull java.lang.String version, @NotNull java.lang.String license, @NotNull java.lang.String source, @NotNull java.lang.String package_, @NotNull java.lang.String origin) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(description, "Parameter 'description' must not be null");
        java.util.Objects.requireNonNull(initFullFunc, "Parameter 'initFullFunc' must not be null");
        java.util.Objects.requireNonNull(version, "Parameter 'version' must not be null");
        java.util.Objects.requireNonNull(license, "Parameter 'license' must not be null");
        java.util.Objects.requireNonNull(source, "Parameter 'source' must not be null");
        java.util.Objects.requireNonNull(package_, "Parameter 'package_' must not be null");
        java.util.Objects.requireNonNull(origin, "Parameter 'origin' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_plugin_register_static_full.invokeExact(
                    majorVersion,
                    minorVersion,
                    Interop.allocateNativeString(name),
                    Interop.allocateNativeString(description),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gst.Callbacks.class, "cbPluginInitFullFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    Interop.allocateNativeString(version),
                    Interop.allocateNativeString(license),
                    Interop.allocateNativeString(source),
                    Interop.allocateNativeString(package_),
                    Interop.allocateNativeString(origin),
                    (Addressable) (Interop.registerCallback(initFullFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link Plugin.Build} object constructs a {@link Plugin} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Plugin} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Plugin} using {@link Plugin#castFrom}.
         * @return A new instance of {@code Plugin} with the properties 
         *         that were set in the Build object.
         */
        public Plugin construct() {
            return Plugin.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Plugin.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
