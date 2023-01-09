package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Use gst_tracer_factory_get_list() to get a list of tracer factories known to
 * GStreamer.
 * @version 1.8
 */
public class TracerFactory extends org.gstreamer.gst.PluginFeature {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTracerFactory";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a TracerFactory proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TracerFactory(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TracerFactory> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TracerFactory(input);
    
    /**
     * Get the {@link org.gtk.glib.Type} for elements managed by this factory. The type can
     * only be retrieved if the element factory is loaded, which can be
     * assured with gst_plugin_feature_load().
     * @return the {@link org.gtk.glib.Type} for tracers managed by this factory or 0 if
     * the factory is not loaded.
     */
    public org.gtk.glib.Type getTracerType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_tracer_factory_get_tracer_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_tracer_factory_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the list of all registered tracer factories. You must free the
     * list using gst_plugin_feature_list_free().
     * <p>
     * The returned factories are sorted by factory name.
     * <p>
     * Free-function: gst_plugin_feature_list_free
     * @return the list of all
     *     registered {@link TracerFactory}.
     */
    public static org.gtk.glib.List getList() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tracer_factory_get_list.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * A {@link TracerFactory.Builder} object constructs a {@link TracerFactory} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TracerFactory.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.PluginFeature.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link TracerFactory} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TracerFactory}.
         * @return A new instance of {@code TracerFactory} with the properties 
         *         that were set in the Builder object.
         */
        public TracerFactory build() {
            return (TracerFactory) org.gtk.gobject.GObject.newWithProperties(
                TracerFactory.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_tracer_factory_get_tracer_type = Interop.downcallHandle(
                "gst_tracer_factory_get_tracer_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_tracer_factory_get_type = Interop.downcallHandle(
                "gst_tracer_factory_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_tracer_factory_get_list = Interop.downcallHandle(
                "gst_tracer_factory_get_list",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_tracer_factory_get_type != null;
    }
}
