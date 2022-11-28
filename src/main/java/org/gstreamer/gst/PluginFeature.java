package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is a base class for anything that can be added to a {@link Plugin}.
 */
public class PluginFeature extends org.gstreamer.gst.Object {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPluginFeature";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PluginFeature proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PluginFeature(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PluginFeature if its GType is a (or inherits from) "GstPluginFeature".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PluginFeature} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstPluginFeature", a ClassCastException will be thrown.
     */
    public static PluginFeature castFrom(org.gtk.gobject.Object gobject) {
            return new PluginFeature(gobject.handle(), gobject.yieldOwnership());
    }
    
    /**
     * Checks whether the given plugin feature is at least
     *  the required version
     * @param minMajor minimum required major version
     * @param minMinor minimum required minor version
     * @param minMicro minimum required micro version
     * @return {@code true} if the plugin feature has at least
     *  the required version, otherwise {@code false}.
     */
    public boolean checkVersion(int minMajor, int minMinor, int minMicro) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_plugin_feature_check_version.invokeExact(
                    handle(),
                    minMajor,
                    minMinor,
                    minMicro);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the plugin that provides this feature.
     * @return the plugin that provides this
     *     feature, or {@code null}.  Unref with gst_object_unref() when no
     *     longer needed.
     */
    public @Nullable org.gstreamer.gst.Plugin getPlugin() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_feature_get_plugin.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Plugin(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the name of the plugin that provides this feature.
     * @return the name of the plugin that provides this
     *     feature, or {@code null} if the feature is not associated with a
     *     plugin.
     */
    public @Nullable java.lang.String getPluginName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_feature_get_plugin_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the rank of a plugin feature.
     * @return The rank of the feature
     */
    public int getRank() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_plugin_feature_get_rank.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Loads the plugin containing {@code feature} if it's not already loaded. {@code feature} is
     * unaffected; use the return value instead.
     * <p>
     * Normally this function is used like this:
     * <pre>{@code <!-- language="C" -->
     * GstPluginFeature *loaded_feature;
     * 
     * loaded_feature = gst_plugin_feature_load (feature);
     * // presumably, we're no longer interested in the potentially-unloaded feature
     * gst_object_unref (feature);
     * feature = loaded_feature;
     * }</pre>
     * @return a reference to the loaded
     * feature, or {@code null} on error
     */
    public @Nullable org.gstreamer.gst.PluginFeature load() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_feature_load.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.PluginFeature(RESULT, Ownership.FULL);
    }
    
    /**
     * Specifies a rank for a plugin feature, so that autoplugging uses
     * the most appropriate feature.
     * @param rank rank value - higher number means more priority rank
     */
    public void setRank(int rank) {
        try {
            DowncallHandles.gst_plugin_feature_set_rank.invokeExact(
                    handle(),
                    rank);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_plugin_feature_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Copies the list of features. Caller should call {@code gst_plugin_feature_list_free}
     * when done with the list.
     * @param list list
     *     of {@link PluginFeature}
     * @return a copy of {@code list},
     *     with each feature's reference count incremented.
     */
    public static @NotNull org.gtk.glib.List listCopy(@NotNull org.gtk.glib.List list) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_feature_list_copy.invokeExact(
                    list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Debug the plugin feature names in {@code list}.
     * @param list a {@link org.gtk.glib.List} of
     *     plugin features
     */
    public static void listDebug(@NotNull org.gtk.glib.List list) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        try {
            DowncallHandles.gst_plugin_feature_list_debug.invokeExact(
                    list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unrefs each member of {@code list}, then frees the list.
     * @param list list
     *     of {@link PluginFeature}
     */
    public static void listFree(@NotNull org.gtk.glib.List list) {
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        try {
            DowncallHandles.gst_plugin_feature_list_free.invokeExact(
                    list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        list.yieldOwnership();
    }
    
    /**
     * Compares the two given {@link PluginFeature} instances. This function can be
     * used as a {@link org.gtk.glib.CompareFunc} when sorting by rank and then by name.
     * @param p1 a {@link PluginFeature}
     * @param p2 a {@link PluginFeature}
     * @return negative value if the rank of p1 &gt; the rank of p2 or the ranks are
     * equal but the name of p1 comes before the name of p2; zero if the rank
     * and names are equal; positive value if the rank of p1 &lt; the rank of p2 or the
     * ranks are equal but the name of p2 comes before the name of p1
     */
    public static int rankCompareFunc(@Nullable java.lang.foreign.MemoryAddress p1, @Nullable java.lang.foreign.MemoryAddress p2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_plugin_feature_rank_compare_func.invokeExact(
                    (Addressable) (p1 == null ? MemoryAddress.NULL : (Addressable) p1),
                    (Addressable) (p2 == null ? MemoryAddress.NULL : (Addressable) p2));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link PluginFeature.Build} object constructs a {@link PluginFeature} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PluginFeature} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PluginFeature} using {@link PluginFeature#castFrom}.
         * @return A new instance of {@code PluginFeature} with the properties 
         *         that were set in the Build object.
         */
        public PluginFeature construct() {
            return PluginFeature.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PluginFeature.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_plugin_feature_check_version = Interop.downcallHandle(
            "gst_plugin_feature_check_version",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_plugin_feature_get_plugin = Interop.downcallHandle(
            "gst_plugin_feature_get_plugin",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_plugin_feature_get_plugin_name = Interop.downcallHandle(
            "gst_plugin_feature_get_plugin_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_plugin_feature_get_rank = Interop.downcallHandle(
            "gst_plugin_feature_get_rank",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_plugin_feature_load = Interop.downcallHandle(
            "gst_plugin_feature_load",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_plugin_feature_set_rank = Interop.downcallHandle(
            "gst_plugin_feature_set_rank",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_plugin_feature_get_type = Interop.downcallHandle(
            "gst_plugin_feature_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_plugin_feature_list_copy = Interop.downcallHandle(
            "gst_plugin_feature_list_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_plugin_feature_list_debug = Interop.downcallHandle(
            "gst_plugin_feature_list_debug",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_plugin_feature_list_free = Interop.downcallHandle(
            "gst_plugin_feature_list_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_plugin_feature_rank_compare_func = Interop.downcallHandle(
            "gst_plugin_feature_rank_compare_func",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
