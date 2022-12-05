package org.gstreamer.transcoder;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Transforms {@link Transcoder} bus messages to signals from the adapter object.
 * @version 1.20
 */
public class TranscoderSignalAdapter extends org.gtk.gobject.Object {
    
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
    @ApiStatus.Internal
    public TranscoderSignalAdapter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to TranscoderSignalAdapter if its GType is a (or inherits from) "GstTranscoderSignalAdapter".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TranscoderSignalAdapter} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstTranscoderSignalAdapter", a ClassCastException will be thrown.
     */
    public static TranscoderSignalAdapter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), TranscoderSignalAdapter.getType())) {
            return new TranscoderSignalAdapter(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstTranscoderSignalAdapter");
        }
    }
    
    public @Nullable org.gstreamer.transcoder.Transcoder getTranscoder() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_transcoder_signal_adapter_get_transcoder.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.transcoder.Transcoder(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
        void signalReceived(TranscoderSignalAdapter sourceTranscoderSignalAdapter);
    }
    
    public Signal<TranscoderSignalAdapter.Done> onDone(TranscoderSignalAdapter.Done handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("done"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TranscoderSignalAdapter.Callbacks.class, "signalTranscoderSignalAdapterDone",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TranscoderSignalAdapter.Done>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DurationChanged {
        void signalReceived(TranscoderSignalAdapter sourceTranscoderSignalAdapter, long object);
    }
    
    public Signal<TranscoderSignalAdapter.DurationChanged> onDurationChanged(TranscoderSignalAdapter.DurationChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("duration-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TranscoderSignalAdapter.Callbacks.class, "signalTranscoderSignalAdapterDurationChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, long.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TranscoderSignalAdapter.DurationChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Error {
        void signalReceived(TranscoderSignalAdapter sourceTranscoderSignalAdapter, @NotNull org.gtk.glib.Error object, @NotNull org.gstreamer.gst.Structure p0);
    }
    
    public Signal<TranscoderSignalAdapter.Error> onError(TranscoderSignalAdapter.Error handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("error"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TranscoderSignalAdapter.Callbacks.class, "signalTranscoderSignalAdapterError",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TranscoderSignalAdapter.Error>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PositionUpdated {
        void signalReceived(TranscoderSignalAdapter sourceTranscoderSignalAdapter, long object);
    }
    
    public Signal<TranscoderSignalAdapter.PositionUpdated> onPositionUpdated(TranscoderSignalAdapter.PositionUpdated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("position-updated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TranscoderSignalAdapter.Callbacks.class, "signalTranscoderSignalAdapterPositionUpdated",
                        MethodType.methodType(void.class, MemoryAddress.class, long.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TranscoderSignalAdapter.PositionUpdated>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface StateChanged {
        void signalReceived(TranscoderSignalAdapter sourceTranscoderSignalAdapter, @NotNull org.gstreamer.transcoder.TranscoderState object);
    }
    
    public Signal<TranscoderSignalAdapter.StateChanged> onStateChanged(TranscoderSignalAdapter.StateChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("state-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TranscoderSignalAdapter.Callbacks.class, "signalTranscoderSignalAdapterStateChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TranscoderSignalAdapter.StateChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Warning {
        void signalReceived(TranscoderSignalAdapter sourceTranscoderSignalAdapter, @NotNull org.gtk.glib.Error object, @NotNull org.gstreamer.gst.Structure p0);
    }
    
    public Signal<TranscoderSignalAdapter.Warning> onWarning(TranscoderSignalAdapter.Warning handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("warning"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TranscoderSignalAdapter.Callbacks.class, "signalTranscoderSignalAdapterWarning",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TranscoderSignalAdapter.Warning>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link TranscoderSignalAdapter.Build} object constructs a {@link TranscoderSignalAdapter} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link TranscoderSignalAdapter} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TranscoderSignalAdapter} using {@link TranscoderSignalAdapter#castFrom}.
         * @return A new instance of {@code TranscoderSignalAdapter} with the properties 
         *         that were set in the Build object.
         */
        public TranscoderSignalAdapter construct() {
            return TranscoderSignalAdapter.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    TranscoderSignalAdapter.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The {@link Transcoder} tracked by the adapter.
         * @param transcoder The value for the {@code transcoder} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTranscoder(org.gstreamer.transcoder.Transcoder transcoder) {
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
    
    private static class Callbacks {
        
        public static void signalTranscoderSignalAdapterDone(MemoryAddress sourceTranscoderSignalAdapter, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (TranscoderSignalAdapter.Done) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TranscoderSignalAdapter(sourceTranscoderSignalAdapter, Ownership.NONE));
        }
        
        public static void signalTranscoderSignalAdapterDurationChanged(MemoryAddress sourceTranscoderSignalAdapter, long object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (TranscoderSignalAdapter.DurationChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TranscoderSignalAdapter(sourceTranscoderSignalAdapter, Ownership.NONE), object);
        }
        
        public static void signalTranscoderSignalAdapterError(MemoryAddress sourceTranscoderSignalAdapter, MemoryAddress object, MemoryAddress p0, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (TranscoderSignalAdapter.Error) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TranscoderSignalAdapter(sourceTranscoderSignalAdapter, Ownership.NONE), new org.gtk.glib.Error(object, Ownership.NONE), new org.gstreamer.gst.Structure(p0, Ownership.NONE));
        }
        
        public static void signalTranscoderSignalAdapterPositionUpdated(MemoryAddress sourceTranscoderSignalAdapter, long object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (TranscoderSignalAdapter.PositionUpdated) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TranscoderSignalAdapter(sourceTranscoderSignalAdapter, Ownership.NONE), object);
        }
        
        public static void signalTranscoderSignalAdapterStateChanged(MemoryAddress sourceTranscoderSignalAdapter, int object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (TranscoderSignalAdapter.StateChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TranscoderSignalAdapter(sourceTranscoderSignalAdapter, Ownership.NONE), org.gstreamer.transcoder.TranscoderState.of(object));
        }
        
        public static void signalTranscoderSignalAdapterWarning(MemoryAddress sourceTranscoderSignalAdapter, MemoryAddress object, MemoryAddress p0, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (TranscoderSignalAdapter.Warning) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TranscoderSignalAdapter(sourceTranscoderSignalAdapter, Ownership.NONE), new org.gtk.glib.Error(object, Ownership.NONE), new org.gstreamer.gst.Structure(p0, Ownership.NONE));
        }
    }
}
