package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Pads managed by a {@link Aggregator} subclass.
 * <p>
 * This class used to live in gst-plugins-bad and was moved to core.
 * @version 1.14
 */
public class AggregatorPad extends org.gstreamer.gst.Pad {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAggregatorPad";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Pad.getMemoryLayout().withName("parent"),
        org.gstreamer.gst.Segment.getMemoryLayout().withName("segment"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a AggregatorPad proxy instance for the provided memory address.
     * <p>
     * Because AggregatorPad is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AggregatorPad(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to AggregatorPad if its GType is a (or inherits from) "GstAggregatorPad".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code AggregatorPad} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstAggregatorPad", a ClassCastException will be thrown.
     */
    public static AggregatorPad castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), AggregatorPad.getType())) {
            return new AggregatorPad(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstAggregatorPad");
        }
    }
    
    /**
     * Drop the buffer currently queued in {@code pad}.
     * @return TRUE if there was a buffer queued in {@code pad}, or FALSE if not.
     */
    public boolean dropBuffer() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_aggregator_pad_drop_buffer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * This checks if a pad has a buffer available that will be returned by
     * a call to gst_aggregator_pad_peek_buffer() or
     * gst_aggregator_pad_pop_buffer().
     * @return {@code true} if the pad has a buffer available as the next thing.
     */
    public boolean hasBuffer() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_aggregator_pad_has_buffer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public boolean isEos() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_aggregator_pad_is_eos.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * It is only valid to call this method from {@link AggregatorClass}::aggregate()
     * @return {@code true} if the pad is inactive, {@code false} otherwise.
     *   See gst_aggregator_ignore_inactive_pads() for more info.
     */
    public boolean isInactive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_aggregator_pad_is_inactive.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public @Nullable org.gstreamer.gst.Buffer peekBuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_aggregator_pad_peek_buffer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.FULL);
    }
    
    /**
     * Steal the ref to the buffer currently queued in {@code pad}.
     * @return The buffer in {@code pad} or NULL if no buffer was
     *   queued. You should unref the buffer after usage.
     */
    public @Nullable org.gstreamer.gst.Buffer popBuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_aggregator_pad_pop_buffer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_aggregator_pad_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface BufferConsumed {
        void signalReceived(AggregatorPad sourceAggregatorPad, @NotNull org.gstreamer.gst.Buffer object);
    }
    
    public Signal<AggregatorPad.BufferConsumed> onBufferConsumed(AggregatorPad.BufferConsumed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("buffer-consumed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AggregatorPad.Callbacks.class, "signalAggregatorPadBufferConsumed",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<AggregatorPad.BufferConsumed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Pad.Build {
        
         /**
         * A {@link AggregatorPad.Build} object constructs a {@link AggregatorPad} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link AggregatorPad} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AggregatorPad} using {@link AggregatorPad#castFrom}.
         * @return A new instance of {@code AggregatorPad} with the properties 
         *         that were set in the Build object.
         */
        public AggregatorPad construct() {
            return AggregatorPad.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    AggregatorPad.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Enables the emission of signals such as {@link AggregatorPad}::buffer-consumed
         * @param emitSignals The value for the {@code emit-signals} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEmitSignals(boolean emitSignals) {
            names.add("emit-signals");
            values.add(org.gtk.gobject.Value.create(emitSignals));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_aggregator_pad_drop_buffer = Interop.downcallHandle(
            "gst_aggregator_pad_drop_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_aggregator_pad_has_buffer = Interop.downcallHandle(
            "gst_aggregator_pad_has_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_aggregator_pad_is_eos = Interop.downcallHandle(
            "gst_aggregator_pad_is_eos",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_aggregator_pad_is_inactive = Interop.downcallHandle(
            "gst_aggregator_pad_is_inactive",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_aggregator_pad_peek_buffer = Interop.downcallHandle(
            "gst_aggregator_pad_peek_buffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_aggregator_pad_pop_buffer = Interop.downcallHandle(
            "gst_aggregator_pad_pop_buffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_aggregator_pad_get_type = Interop.downcallHandle(
            "gst_aggregator_pad_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalAggregatorPadBufferConsumed(MemoryAddress sourceAggregatorPad, MemoryAddress object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (AggregatorPad.BufferConsumed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new AggregatorPad(sourceAggregatorPad, Ownership.NONE), new org.gstreamer.gst.Buffer(object, Ownership.NONE));
        }
    }
}
