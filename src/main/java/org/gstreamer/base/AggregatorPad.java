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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Pad.getMemoryLayout().withName("parent"),
            org.gstreamer.gst.Segment.getMemoryLayout().withName("segment"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a AggregatorPad proxy instance for the provided memory address.
     * <p>
     * Because AggregatorPad is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AggregatorPad(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, AggregatorPad> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AggregatorPad(input, ownership);
    
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean isEos() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_aggregator_pad_is_eos.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public @Nullable org.gstreamer.gst.Buffer peekBuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_aggregator_pad_peek_buffer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.FULL);
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
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
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
        void run(org.gstreamer.gst.Buffer object);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceAggregatorPad, MemoryAddress object) {
            run(org.gstreamer.gst.Buffer.fromAddress.marshal(object, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(BufferConsumed.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<AggregatorPad.BufferConsumed> onBufferConsumed(AggregatorPad.BufferConsumed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("buffer-consumed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link AggregatorPad.Builder} object constructs a {@link AggregatorPad} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AggregatorPad.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.Pad.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AggregatorPad} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AggregatorPad}.
         * @return A new instance of {@code AggregatorPad} with the properties 
         *         that were set in the Builder object.
         */
        public AggregatorPad build() {
            return (AggregatorPad) org.gtk.gobject.GObject.newWithProperties(
                AggregatorPad.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Enables the emission of signals such as {@link AggregatorPad}::buffer-consumed
         * @param emitSignals The value for the {@code emit-signals} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEmitSignals(boolean emitSignals) {
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
}
