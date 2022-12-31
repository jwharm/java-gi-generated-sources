package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Tracing modules will subclass {@link Tracer} and register through
 * gst_tracer_register(). Modules can attach to various hook-types - see
 * gst_tracing_register_hook(). When invoked they receive hook specific
 * contextual data, which they must not modify.
 * @version 1.8
 */
public class Tracer extends org.gstreamer.gst.GstObject {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTracer";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Tracer proxy instance for the provided memory address.
     * <p>
     * Because Tracer is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Tracer(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, Tracer> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Tracer(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_tracer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Create a new tracer-factory  capable of instantiating objects of the
     * {@code type} and add the factory to {@code plugin}.
     * @param plugin A {@link Plugin}, or {@code null} for a static typefind function
     * @param name The name for registering
     * @param type GType of tracer to register
     * @return {@code true}, if the registering succeeded, {@code false} on error
     */
    public static boolean register(@Nullable org.gstreamer.gst.Plugin plugin, java.lang.String name, org.gtk.glib.Type type) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tracer_register.invokeExact(
                    (Addressable) (plugin == null ? MemoryAddress.NULL : plugin.handle()),
                    Marshal.stringToAddress.marshal(name, null),
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * A {@link Tracer.Builder} object constructs a {@link Tracer} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Tracer.Builder#build()}. 
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
         * Finish building the {@link Tracer} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Tracer}.
         * @return A new instance of {@code Tracer} with the properties 
         *         that were set in the Builder object.
         */
        public Tracer build() {
            return (Tracer) org.gtk.gobject.GObject.newWithProperties(
                Tracer.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setParams(java.lang.String params) {
            names.add("params");
            values.add(org.gtk.gobject.Value.create(params));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_tracer_get_type = Interop.downcallHandle(
            "gst_tracer_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_tracer_register = Interop.downcallHandle(
            "gst_tracer_register",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
    }
}
