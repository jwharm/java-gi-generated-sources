package org.gstreamer.play;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PlaySignalAdapter extends org.gtk.gobject.GObject {
    
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
    protected PlaySignalAdapter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PlaySignalAdapter> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PlaySignalAdapter(input, ownership);
    
    private static MemoryAddress constructNew(org.gstreamer.play.Play play) {
        MemoryAddress RESULT;
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
    public PlaySignalAdapter(org.gstreamer.play.Play play) {
        super(constructNew(play), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewSyncEmit(org.gstreamer.play.Play play) {
        MemoryAddress RESULT;
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
    public static PlaySignalAdapter newSyncEmit(org.gstreamer.play.Play play) {
        var RESULT = constructNewSyncEmit(play);
        return (org.gstreamer.play.PlaySignalAdapter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.play.PlaySignalAdapter.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewWithMainContext(org.gstreamer.play.Play play, org.gtk.glib.MainContext context) {
        MemoryAddress RESULT;
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
    public static PlaySignalAdapter newWithMainContext(org.gstreamer.play.Play play, org.gtk.glib.MainContext context) {
        var RESULT = constructNewWithMainContext(play, context);
        return (org.gstreamer.play.PlaySignalAdapter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.play.PlaySignalAdapter.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    public org.gstreamer.play.Play getPlay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_play_signal_adapter_get_play.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.play.Play) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.play.Play.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
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
        void run(int object);

        @ApiStatus.Internal default void upcall(MemoryAddress sourcePlaySignalAdapter, int object) {
            run(object);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Buffering.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<PlaySignalAdapter.Buffering> onBuffering(PlaySignalAdapter.Buffering handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("buffering"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DurationChanged {
        void run(long object);

        @ApiStatus.Internal default void upcall(MemoryAddress sourcePlaySignalAdapter, long object) {
            run(object);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DurationChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<PlaySignalAdapter.DurationChanged> onDurationChanged(PlaySignalAdapter.DurationChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("duration-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface EndOfStream {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourcePlaySignalAdapter) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EndOfStream.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<PlaySignalAdapter.EndOfStream> onEndOfStream(PlaySignalAdapter.EndOfStream handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("end-of-stream"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Error {
        void run(org.gtk.glib.Error object, org.gstreamer.gst.Structure p0);

        @ApiStatus.Internal default void upcall(MemoryAddress sourcePlaySignalAdapter, MemoryAddress object, MemoryAddress p0) {
            run(org.gtk.glib.Error.fromAddress.marshal(object, Ownership.NONE), org.gstreamer.gst.Structure.fromAddress.marshal(p0, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Error.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<PlaySignalAdapter.Error> onError(PlaySignalAdapter.Error handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("error"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MediaInfoUpdated {
        void run(org.gstreamer.play.PlayMediaInfo object);

        @ApiStatus.Internal default void upcall(MemoryAddress sourcePlaySignalAdapter, MemoryAddress object) {
            run((org.gstreamer.play.PlayMediaInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gstreamer.play.PlayMediaInfo.fromAddress).marshal(object, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MediaInfoUpdated.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<PlaySignalAdapter.MediaInfoUpdated> onMediaInfoUpdated(PlaySignalAdapter.MediaInfoUpdated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("media-info-updated"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MuteChanged {
        void run(boolean object);

        @ApiStatus.Internal default void upcall(MemoryAddress sourcePlaySignalAdapter, int object) {
            run(Marshal.integerToBoolean.marshal(object, null).booleanValue());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MuteChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<PlaySignalAdapter.MuteChanged> onMuteChanged(PlaySignalAdapter.MuteChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("mute-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PositionUpdated {
        void run(long object);

        @ApiStatus.Internal default void upcall(MemoryAddress sourcePlaySignalAdapter, long object) {
            run(object);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PositionUpdated.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<PlaySignalAdapter.PositionUpdated> onPositionUpdated(PlaySignalAdapter.PositionUpdated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("position-updated"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SeekDone {
        void run(long object);

        @ApiStatus.Internal default void upcall(MemoryAddress sourcePlaySignalAdapter, long object) {
            run(object);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SeekDone.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<PlaySignalAdapter.SeekDone> onSeekDone(PlaySignalAdapter.SeekDone handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("seek-done"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface StateChanged {
        void run(org.gstreamer.play.PlayState object);

        @ApiStatus.Internal default void upcall(MemoryAddress sourcePlaySignalAdapter, int object) {
            run(org.gstreamer.play.PlayState.of(object));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StateChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<PlaySignalAdapter.StateChanged> onStateChanged(PlaySignalAdapter.StateChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("state-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface UriLoaded {
        void run(java.lang.String object);

        @ApiStatus.Internal default void upcall(MemoryAddress sourcePlaySignalAdapter, MemoryAddress object) {
            run(Marshal.addressToString.marshal(object, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UriLoaded.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<PlaySignalAdapter.UriLoaded> onUriLoaded(PlaySignalAdapter.UriLoaded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("uri-loaded"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface VideoDimensionsChanged {
        void run(int object, int p0);

        @ApiStatus.Internal default void upcall(MemoryAddress sourcePlaySignalAdapter, int object, int p0) {
            run(object, p0);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VideoDimensionsChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<PlaySignalAdapter.VideoDimensionsChanged> onVideoDimensionsChanged(PlaySignalAdapter.VideoDimensionsChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("video-dimensions-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface VolumeChanged {
        void run(double object);

        @ApiStatus.Internal default void upcall(MemoryAddress sourcePlaySignalAdapter, double object) {
            run(object);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VolumeChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<PlaySignalAdapter.VolumeChanged> onVolumeChanged(PlaySignalAdapter.VolumeChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("volume-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Warning {
        void run(org.gtk.glib.Error object, org.gstreamer.gst.Structure p0);

        @ApiStatus.Internal default void upcall(MemoryAddress sourcePlaySignalAdapter, MemoryAddress object, MemoryAddress p0) {
            run(org.gtk.glib.Error.fromAddress.marshal(object, Ownership.NONE), org.gstreamer.gst.Structure.fromAddress.marshal(p0, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Warning.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<PlaySignalAdapter.Warning> onWarning(PlaySignalAdapter.Warning handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("warning"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link PlaySignalAdapter.Builder} object constructs a {@link PlaySignalAdapter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PlaySignalAdapter.Builder#build()}. 
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
         * Finish building the {@link PlaySignalAdapter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PlaySignalAdapter}.
         * @return A new instance of {@code PlaySignalAdapter} with the properties 
         *         that were set in the Builder object.
         */
        public PlaySignalAdapter build() {
            return (PlaySignalAdapter) org.gtk.gobject.GObject.newWithProperties(
                PlaySignalAdapter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setPlay(org.gstreamer.play.Play play) {
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
}
