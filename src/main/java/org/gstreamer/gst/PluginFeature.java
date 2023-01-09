package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is a base class for anything that can be added to a {@link Plugin}.
 */
public class PluginFeature extends org.gstreamer.gst.GstObject {
    
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
     */
    protected PluginFeature(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PluginFeature> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PluginFeature(input);
    
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_feature_get_plugin.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.gst.Plugin) Interop.register(RESULT, org.gstreamer.gst.Plugin.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_feature_get_plugin_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the rank of a plugin feature.
     * @return The rank of the feature
     */
    public int getRank() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_plugin_feature_get_rank.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_feature_load.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.gst.PluginFeature) Interop.register(RESULT, org.gstreamer.gst.PluginFeature.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    public static org.gtk.glib.Type getType() {
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
    public static org.gtk.glib.List listCopy(org.gtk.glib.List list) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_plugin_feature_list_copy.invokeExact(list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Debug the plugin feature names in {@code list}.
     * @param list a {@link org.gtk.glib.List} of
     *     plugin features
     */
    public static void listDebug(org.gtk.glib.List list) {
        try {
            DowncallHandles.gst_plugin_feature_list_debug.invokeExact(list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unrefs each member of {@code list}, then frees the list.
     * @param list list
     *     of {@link PluginFeature}
     */
    public static void listFree(org.gtk.glib.List list) {
        try {
            DowncallHandles.gst_plugin_feature_list_free.invokeExact(list.handle());
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
     * A {@link PluginFeature.Builder} object constructs a {@link PluginFeature} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PluginFeature.Builder#build()}. 
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
         * Finish building the {@link PluginFeature} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PluginFeature}.
         * @return A new instance of {@code PluginFeature} with the properties 
         *         that were set in the Builder object.
         */
        public PluginFeature build() {
            return (PluginFeature) org.gtk.gobject.GObject.newWithProperties(
                PluginFeature.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_plugin_feature_get_type != null;
    }
}
