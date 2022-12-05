package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PlaySignalAdapter extends org.gtk.gobject.Object {
    
    static {
        GstPlay.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlaySignalAdapter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PlaySignalAdapter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PlaySignalAdapter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PlaySignalAdapter if its GType is a (or inherits from) "GstPlaySignalAdapter".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PlaySignalAdapter} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstPlaySignalAdapter", a ClassCastException will be thrown.
     */
    public static PlaySignalAdapter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), PlaySignalAdapter.getType())) {
            return new PlaySignalAdapter(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstPlaySignalAdapter");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.play.Play play) {
        java.util.Objects.requireNonNull(play, "Parameter 'play' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_signal_adapter_new.invokeExact(
                    play.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * A bus-watching {@link org.gtk.glib.Source} will be created and attached to the the
     * thread-default {@link org.gtk.glib.MainContext}. The attached callback will emit the
     * corresponding signal for the message received. Matching signals for play
     * messages from the bus will be emitted by it on the created adapter object.
     * @param play {@link Play} instance to emit signals for.
     */
    public PlaySignalAdapter(@NotNull org.gstreamer.play.Play play) {
        super(constructNew(play), Ownership.FULL);
    }
    
    private static Addressable constructNewSyncEmit(@NotNull org.gstreamer.play.Play play) {
        java.util.Objects.requireNonNull(play, "Parameter 'play' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_signal_adapter_new_sync_emit.invokeExact(
                    play.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create an adapter that synchronously emits its signals, from the thread in
     * which the messages have been posted.
     * @param play {@link Play} instance to emit signals for.
     * @return A new {@link PlaySignalAdapter} to connect signal handlers to.
     */
    public static PlaySignalAdapter newSyncEmit(@NotNull org.gstreamer.play.Play play) {
        return new PlaySignalAdapter(constructNewSyncEmit(play), Ownership.FULL);
    }
    
    private static Addressable constructNewWithMainContext(@NotNull org.gstreamer.play.Play play, @NotNull org.gtk.glib.MainContext context) {
        java.util.Objects.requireNonNull(play, "Parameter 'play' must not be null");
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_signal_adapter_new_with_main_context.invokeExact(
                    play.handle(),
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * A bus-watching {@link org.gtk.glib.Source} will be created and attached to the {@code context}. The
     * attached callback will emit the corresponding signal for the message
     * received. Matching signals for play messages from the bus will be emitted by
     * it on the created adapter object.
     * @param play {@link Play} instance to emit signals for.
     * @param context A {@link org.gtk.glib.MainContext} on which the main-loop will process play bus messages on.
     * @return A new {@link PlaySignalAdapter} to connect signal handlers to.
     */
    public static PlaySignalAdapter newWithMainContext(@NotNull org.gstreamer.play.Play play, @NotNull org.gtk.glib.MainContext context) {
        return new PlaySignalAdapter(constructNewWithMainContext(play, context), Ownership.FULL);
    }
    
    public @NotNull org.gstreamer.play.Play getPlay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_signal_adapter_get_play.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.play.Play(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_play_signal_adapter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Buffering {
        void signalReceived(PlaySignalAdapter sourcePlaySignalAdapter, int object);
    }
    
    public Signal<PlaySignalAdapter.Buffering> onBuffering(PlaySignalAdapter.Buffering handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("buffering"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PlaySignalAdapter.Callbacks.class, "signalPlaySignalAdapterBuffering",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PlaySignalAdapter.Buffering>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DurationChanged {
        void signalReceived(PlaySignalAdapter sourcePlaySignalAdapter, long object);
    }
    
    public Signal<PlaySignalAdapter.DurationChanged> onDurationChanged(PlaySignalAdapter.DurationChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("duration-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PlaySignalAdapter.Callbacks.class, "signalPlaySignalAdapterDurationChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, long.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PlaySignalAdapter.DurationChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface EndOfStream {
        void signalReceived(PlaySignalAdapter sourcePlaySignalAdapter);
    }
    
    public Signal<PlaySignalAdapter.EndOfStream> onEndOfStream(PlaySignalAdapter.EndOfStream handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("end-of-stream"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PlaySignalAdapter.Callbacks.class, "signalPlaySignalAdapterEndOfStream",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PlaySignalAdapter.EndOfStream>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Error {
        void signalReceived(PlaySignalAdapter sourcePlaySignalAdapter, @NotNull org.gtk.glib.Error object, @NotNull org.gstreamer.gst.Structure p0);
    }
    
    public Signal<PlaySignalAdapter.Error> onError(PlaySignalAdapter.Error handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("error"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PlaySignalAdapter.Callbacks.class, "signalPlaySignalAdapterError",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PlaySignalAdapter.Error>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MediaInfoUpdated {
        void signalReceived(PlaySignalAdapter sourcePlaySignalAdapter, @NotNull org.gstreamer.play.PlayMediaInfo object);
    }
    
    public Signal<PlaySignalAdapter.MediaInfoUpdated> onMediaInfoUpdated(PlaySignalAdapter.MediaInfoUpdated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("media-info-updated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PlaySignalAdapter.Callbacks.class, "signalPlaySignalAdapterMediaInfoUpdated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PlaySignalAdapter.MediaInfoUpdated>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MuteChanged {
        void signalReceived(PlaySignalAdapter sourcePlaySignalAdapter, boolean object);
    }
    
    public Signal<PlaySignalAdapter.MuteChanged> onMuteChanged(PlaySignalAdapter.MuteChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("mute-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PlaySignalAdapter.Callbacks.class, "signalPlaySignalAdapterMuteChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PlaySignalAdapter.MuteChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PositionUpdated {
        void signalReceived(PlaySignalAdapter sourcePlaySignalAdapter, long object);
    }
    
    public Signal<PlaySignalAdapter.PositionUpdated> onPositionUpdated(PlaySignalAdapter.PositionUpdated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("position-updated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PlaySignalAdapter.Callbacks.class, "signalPlaySignalAdapterPositionUpdated",
                        MethodType.methodType(void.class, MemoryAddress.class, long.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PlaySignalAdapter.PositionUpdated>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SeekDone {
        void signalReceived(PlaySignalAdapter sourcePlaySignalAdapter, long object);
    }
    
    public Signal<PlaySignalAdapter.SeekDone> onSeekDone(PlaySignalAdapter.SeekDone handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("seek-done"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PlaySignalAdapter.Callbacks.class, "signalPlaySignalAdapterSeekDone",
                        MethodType.methodType(void.class, MemoryAddress.class, long.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PlaySignalAdapter.SeekDone>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface StateChanged {
        void signalReceived(PlaySignalAdapter sourcePlaySignalAdapter, @NotNull org.gstreamer.play.PlayState object);
    }
    
    public Signal<PlaySignalAdapter.StateChanged> onStateChanged(PlaySignalAdapter.StateChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("state-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PlaySignalAdapter.Callbacks.class, "signalPlaySignalAdapterStateChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PlaySignalAdapter.StateChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface UriLoaded {
        void signalReceived(PlaySignalAdapter sourcePlaySignalAdapter, @NotNull java.lang.String object);
    }
    
    public Signal<PlaySignalAdapter.UriLoaded> onUriLoaded(PlaySignalAdapter.UriLoaded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("uri-loaded"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PlaySignalAdapter.Callbacks.class, "signalPlaySignalAdapterUriLoaded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PlaySignalAdapter.UriLoaded>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface VideoDimensionsChanged {
        void signalReceived(PlaySignalAdapter sourcePlaySignalAdapter, int object, int p0);
    }
    
    public Signal<PlaySignalAdapter.VideoDimensionsChanged> onVideoDimensionsChanged(PlaySignalAdapter.VideoDimensionsChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("video-dimensions-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PlaySignalAdapter.Callbacks.class, "signalPlaySignalAdapterVideoDimensionsChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PlaySignalAdapter.VideoDimensionsChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface VolumeChanged {
        void signalReceived(PlaySignalAdapter sourcePlaySignalAdapter, double object);
    }
    
    public Signal<PlaySignalAdapter.VolumeChanged> onVolumeChanged(PlaySignalAdapter.VolumeChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("volume-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PlaySignalAdapter.Callbacks.class, "signalPlaySignalAdapterVolumeChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PlaySignalAdapter.VolumeChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Warning {
        void signalReceived(PlaySignalAdapter sourcePlaySignalAdapter, @NotNull org.gtk.glib.Error object, @NotNull org.gstreamer.gst.Structure p0);
    }
    
    public Signal<PlaySignalAdapter.Warning> onWarning(PlaySignalAdapter.Warning handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("warning"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PlaySignalAdapter.Callbacks.class, "signalPlaySignalAdapterWarning",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PlaySignalAdapter.Warning>(handle(), RESULT);
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
         * A {@link PlaySignalAdapter.Build} object constructs a {@link PlaySignalAdapter} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PlaySignalAdapter} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PlaySignalAdapter} using {@link PlaySignalAdapter#castFrom}.
         * @return A new instance of {@code PlaySignalAdapter} with the properties 
         *         that were set in the Build object.
         */
        public PlaySignalAdapter construct() {
            return PlaySignalAdapter.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PlaySignalAdapter.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setPlay(org.gstreamer.play.Play play) {
            names.add("play");
            values.add(org.gtk.gobject.Value.create(play));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_play_signal_adapter_new = Interop.downcallHandle(
            "gst_play_signal_adapter_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_signal_adapter_new_sync_emit = Interop.downcallHandle(
            "gst_play_signal_adapter_new_sync_emit",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_signal_adapter_new_with_main_context = Interop.downcallHandle(
            "gst_play_signal_adapter_new_with_main_context",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_signal_adapter_get_play = Interop.downcallHandle(
            "gst_play_signal_adapter_get_play",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_play_signal_adapter_get_type = Interop.downcallHandle(
            "gst_play_signal_adapter_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalPlaySignalAdapterBuffering(MemoryAddress sourcePlaySignalAdapter, int object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PlaySignalAdapter.Buffering) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PlaySignalAdapter(sourcePlaySignalAdapter, Ownership.NONE), object);
        }
        
        public static void signalPlaySignalAdapterDurationChanged(MemoryAddress sourcePlaySignalAdapter, long object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PlaySignalAdapter.DurationChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PlaySignalAdapter(sourcePlaySignalAdapter, Ownership.NONE), object);
        }
        
        public static void signalPlaySignalAdapterEndOfStream(MemoryAddress sourcePlaySignalAdapter, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PlaySignalAdapter.EndOfStream) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PlaySignalAdapter(sourcePlaySignalAdapter, Ownership.NONE));
        }
        
        public static void signalPlaySignalAdapterError(MemoryAddress sourcePlaySignalAdapter, MemoryAddress object, MemoryAddress p0, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PlaySignalAdapter.Error) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PlaySignalAdapter(sourcePlaySignalAdapter, Ownership.NONE), new org.gtk.glib.Error(object, Ownership.NONE), new org.gstreamer.gst.Structure(p0, Ownership.NONE));
        }
        
        public static void signalPlaySignalAdapterMediaInfoUpdated(MemoryAddress sourcePlaySignalAdapter, MemoryAddress object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PlaySignalAdapter.MediaInfoUpdated) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PlaySignalAdapter(sourcePlaySignalAdapter, Ownership.NONE), new org.gstreamer.play.PlayMediaInfo(object, Ownership.NONE));
        }
        
        public static void signalPlaySignalAdapterMuteChanged(MemoryAddress sourcePlaySignalAdapter, int object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PlaySignalAdapter.MuteChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PlaySignalAdapter(sourcePlaySignalAdapter, Ownership.NONE), object != 0);
        }
        
        public static void signalPlaySignalAdapterPositionUpdated(MemoryAddress sourcePlaySignalAdapter, long object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PlaySignalAdapter.PositionUpdated) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PlaySignalAdapter(sourcePlaySignalAdapter, Ownership.NONE), object);
        }
        
        public static void signalPlaySignalAdapterSeekDone(MemoryAddress sourcePlaySignalAdapter, long object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PlaySignalAdapter.SeekDone) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PlaySignalAdapter(sourcePlaySignalAdapter, Ownership.NONE), object);
        }
        
        public static void signalPlaySignalAdapterStateChanged(MemoryAddress sourcePlaySignalAdapter, int object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PlaySignalAdapter.StateChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PlaySignalAdapter(sourcePlaySignalAdapter, Ownership.NONE), org.gstreamer.play.PlayState.of(object));
        }
        
        public static void signalPlaySignalAdapterUriLoaded(MemoryAddress sourcePlaySignalAdapter, MemoryAddress object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PlaySignalAdapter.UriLoaded) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PlaySignalAdapter(sourcePlaySignalAdapter, Ownership.NONE), Interop.getStringFrom(object));
        }
        
        public static void signalPlaySignalAdapterVideoDimensionsChanged(MemoryAddress sourcePlaySignalAdapter, int object, int p0, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PlaySignalAdapter.VideoDimensionsChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PlaySignalAdapter(sourcePlaySignalAdapter, Ownership.NONE), object, p0);
        }
        
        public static void signalPlaySignalAdapterVolumeChanged(MemoryAddress sourcePlaySignalAdapter, double object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PlaySignalAdapter.VolumeChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PlaySignalAdapter(sourcePlaySignalAdapter, Ownership.NONE), object);
        }
        
        public static void signalPlaySignalAdapterWarning(MemoryAddress sourcePlaySignalAdapter, MemoryAddress object, MemoryAddress p0, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PlaySignalAdapter.Warning) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PlaySignalAdapter(sourcePlaySignalAdapter, Ownership.NONE), new org.gtk.glib.Error(object, Ownership.NONE), new org.gstreamer.gst.Structure(p0, Ownership.NONE));
        }
    }
}
