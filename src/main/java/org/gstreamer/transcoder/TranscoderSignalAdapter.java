package org.gstreamer.transcoder;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Transforms {@link Transcoder} bus messages to signals from the adapter object.
 * @version 1.20
 */
public class TranscoderSignalAdapter extends org.gtk.gobject.GObject {
    
    static {
        GstTranscoder.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTranscoderSignalAdapter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a TranscoderSignalAdapter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TranscoderSignalAdapter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TranscoderSignalAdapter> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TranscoderSignalAdapter(input, ownership);
    
    public @Nullable org.gstreamer.transcoder.Transcoder getTranscoder() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_transcoder_signal_adapter_get_transcoder.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.transcoder.Transcoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.transcoder.Transcoder.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_transcoder_signal_adapter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Done {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceTranscoderSignalAdapter) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Done.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<TranscoderSignalAdapter.Done> onDone(TranscoderSignalAdapter.Done handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("done"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DurationChanged {
        void run(long object);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceTranscoderSignalAdapter, long object) {
            run(object);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DurationChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<TranscoderSignalAdapter.DurationChanged> onDurationChanged(TranscoderSignalAdapter.DurationChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("duration-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Error {
        void run(org.gtk.glib.Error object, org.gstreamer.gst.Structure p0);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceTranscoderSignalAdapter, MemoryAddress object, MemoryAddress p0) {
            run(org.gtk.glib.Error.fromAddress.marshal(object, Ownership.NONE), org.gstreamer.gst.Structure.fromAddress.marshal(p0, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Error.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<TranscoderSignalAdapter.Error> onError(TranscoderSignalAdapter.Error handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("error"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PositionUpdated {
        void run(long object);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceTranscoderSignalAdapter, long object) {
            run(object);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PositionUpdated.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<TranscoderSignalAdapter.PositionUpdated> onPositionUpdated(TranscoderSignalAdapter.PositionUpdated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("position-updated"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface StateChanged {
        void run(org.gstreamer.transcoder.TranscoderState object);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceTranscoderSignalAdapter, int object) {
            run(org.gstreamer.transcoder.TranscoderState.of(object));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StateChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<TranscoderSignalAdapter.StateChanged> onStateChanged(TranscoderSignalAdapter.StateChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("state-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Warning {
        void run(org.gtk.glib.Error object, org.gstreamer.gst.Structure p0);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceTranscoderSignalAdapter, MemoryAddress object, MemoryAddress p0) {
            run(org.gtk.glib.Error.fromAddress.marshal(object, Ownership.NONE), org.gstreamer.gst.Structure.fromAddress.marshal(p0, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Warning.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<TranscoderSignalAdapter.Warning> onWarning(TranscoderSignalAdapter.Warning handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("warning"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link TranscoderSignalAdapter.Builder} object constructs a {@link TranscoderSignalAdapter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TranscoderSignalAdapter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link TranscoderSignalAdapter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TranscoderSignalAdapter}.
         * @return A new instance of {@code TranscoderSignalAdapter} with the properties 
         *         that were set in the Builder object.
         */
        public TranscoderSignalAdapter build() {
            return (TranscoderSignalAdapter) org.gtk.gobject.GObject.newWithProperties(
                TranscoderSignalAdapter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The {@link Transcoder} tracked by the adapter.
         * @param transcoder The value for the {@code transcoder} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTranscoder(org.gstreamer.transcoder.Transcoder transcoder) {
            names.add("transcoder");
            values.add(org.gtk.gobject.Value.create(transcoder));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_transcoder_signal_adapter_get_transcoder = Interop.downcallHandle(
            "gst_transcoder_signal_adapter_get_transcoder",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_transcoder_signal_adapter_get_type = Interop.downcallHandle(
            "gst_transcoder_signal_adapter_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
