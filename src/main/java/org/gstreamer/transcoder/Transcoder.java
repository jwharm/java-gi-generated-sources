package org.gstreamer.transcoder;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Transcoder extends org.gstreamer.gst.Object {
    
    static {
        GstTranscoder.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTranscoder";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Transcoder proxy instance for the provided memory address.
     * <p>
     * Because Transcoder is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Transcoder(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to Transcoder if its GType is a (or inherits from) "GstTranscoder".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Transcoder} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstTranscoder", a ClassCastException will be thrown.
     */
    public static Transcoder castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), Transcoder.getType())) {
            return new Transcoder(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstTranscoder");
        }
    }
    
    private static Addressable constructNew(@NotNull java.lang.String sourceUri, @NotNull java.lang.String destUri, @NotNull java.lang.String encodingProfile) {
        java.util.Objects.requireNonNull(sourceUri, "Parameter 'sourceUri' must not be null");
        java.util.Objects.requireNonNull(destUri, "Parameter 'destUri' must not be null");
        java.util.Objects.requireNonNull(encodingProfile, "Parameter 'encodingProfile' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_transcoder_new.invokeExact(
                    Interop.allocateNativeString(sourceUri),
                    Interop.allocateNativeString(destUri),
                    Interop.allocateNativeString(encodingProfile));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public Transcoder(@NotNull java.lang.String sourceUri, @NotNull java.lang.String destUri, @NotNull java.lang.String encodingProfile) {
        super(constructNew(sourceUri, destUri, encodingProfile), Ownership.NONE);
    }
    
    private static Addressable constructNewFull(@NotNull java.lang.String sourceUri, @NotNull java.lang.String destUri, @NotNull org.gstreamer.pbutils.EncodingProfile profile) {
        java.util.Objects.requireNonNull(sourceUri, "Parameter 'sourceUri' must not be null");
        java.util.Objects.requireNonNull(destUri, "Parameter 'destUri' must not be null");
        java.util.Objects.requireNonNull(profile, "Parameter 'profile' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_transcoder_new_full.invokeExact(
                    Interop.allocateNativeString(sourceUri),
                    Interop.allocateNativeString(destUri),
                    profile.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static Transcoder newFull(@NotNull java.lang.String sourceUri, @NotNull java.lang.String destUri, @NotNull org.gstreamer.pbutils.EncodingProfile profile) {
        return new Transcoder(constructNewFull(sourceUri, destUri, profile), Ownership.NONE);
    }
    
    public boolean getAvoidReencoding() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_transcoder_get_avoid_reencoding.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the URI of the destination of the transcoded stream.
     * @return a string containing the URI of the
     * destination of the transcoded stream. g_free() after usage.
     */
    public @NotNull java.lang.String getDestUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_transcoder_get_dest_uri.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Retrieves the duration of the media stream that self represents.
     * @return the duration of the transcoding media stream, in
     * nanoseconds.
     */
    public @NotNull org.gstreamer.gst.ClockTime getDuration() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_transcoder_get_duration.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * GstTranscoder API exposes a {@link org.gstreamer.gst.Bus} instance which purpose is to provide data
     * structures representing transcoder-internal events in form of {@link org.gstreamer.gst.Message}-s of
     * type GST_MESSAGE_APPLICATION.
     * <p>
     * Each message carries a "transcoder-message" field of type {@link TranscoderMessage}.
     * Further fields of the message data are specific to each possible value of
     * that enumeration.
     * <p>
     * Applications can consume the messages asynchronously within their own
     * event-loop / UI-thread etc. Note that in case the application does not
     * consume the messages, the bus will accumulate these internally and eventually
     * fill memory. To avoid that, the bus has to be set "flushing".
     * @return The transcoder message bus instance
     */
    public @NotNull org.gstreamer.gst.Bus getMessageBus() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_transcoder_get_message_bus.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Bus(RESULT, Ownership.FULL);
    }
    
    public @NotNull org.gstreamer.gst.Element getPipeline() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_transcoder_get_pipeline.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Element(RESULT, Ownership.FULL);
    }
    
    public @NotNull org.gstreamer.gst.ClockTime getPosition() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_transcoder_get_position.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    public int getPositionUpdateInterval() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_transcoder_get_position_update_interval.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the {@link TranscoderSignalAdapter} attached to {@code self} if it is attached to
     * the right {@link org.gtk.glib.MainContext}. If no {@link TranscoderSignalAdapter} has been created
     * yet, it will be created and returned, other calls will return that same
     * adapter until it is destroyed, at which point, a new one can be attached the
     * same way.
     * @param context A {@link org.gtk.glib.MainContext} on which the main-loop will process
     *                       transcoder bus messages on. Can be NULL (thread-default
     *                       context will be used then).
     * @return The {@link TranscoderSignalAdapter} to
     * connect signal handlers to.
     */
    public @Nullable org.gstreamer.transcoder.TranscoderSignalAdapter getSignalAdapter(@Nullable org.gtk.glib.MainContext context) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_transcoder_get_signal_adapter.invokeExact(
                    handle(),
                    (Addressable) (context == null ? MemoryAddress.NULL : context.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.transcoder.TranscoderSignalAdapter(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the URI of the currently-transcoding stream.
     * @return a string containing the URI of the
     * source stream. g_free() after usage.
     */
    public @NotNull java.lang.String getSourceUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_transcoder_get_source_uri.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the {@link TranscoderSignalAdapter} attached to {@code self} to emit signals from
     * its thread of emission.
     * @return The {@link TranscoderSignalAdapter} to connect signal
     * handlers to.
     */
    public @NotNull org.gstreamer.transcoder.TranscoderSignalAdapter getSyncSignalAdapter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_transcoder_get_sync_signal_adapter.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.transcoder.TranscoderSignalAdapter(RESULT, Ownership.FULL);
    }
    
    /**
     * Run the transcoder task synchonously. You can connect
     * to the 'position' signal to get information about the
     * progress of the transcoding.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean run() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_transcoder_run.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Run the transcoder task asynchronously. You should connect
     * to the 'done' signal to be notified about when the
     * transcoding is done, and to the 'error' signal to be
     * notified about any error.
     */
    public void runAsync() {
        try {
            DowncallHandles.gst_transcoder_run_async.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public void setAvoidReencoding(boolean avoidReencoding) {
        try {
            DowncallHandles.gst_transcoder_set_avoid_reencoding.invokeExact(
                    handle(),
                    avoidReencoding ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code cpu_usage} as target percentage CPU usage of the process running the
     * transcoding task. It will modulate the transcoding speed to reach that target
     * usage.
     * @param cpuUsage The percentage of the CPU the process running the transcoder
     * should try to use. It takes into account the number of cores available.
     */
    public void setCpuUsage(int cpuUsage) {
        try {
            DowncallHandles.gst_transcoder_set_cpu_usage.invokeExact(
                    handle(),
                    cpuUsage);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set interval in milliseconds between two position-updated signals.
     * Pass 0 to stop updating the position.
     * @param interval interval in ms
     */
    public void setPositionUpdateInterval(int interval) {
        try {
            DowncallHandles.gst_transcoder_set_position_update_interval.invokeExact(
                    handle(),
                    interval);
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
            RESULT = (long) DowncallHandles.gst_transcoder_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static boolean isTranscoderMessage(@NotNull org.gstreamer.gst.Message msg) {
        java.util.Objects.requireNonNull(msg, "Parameter 'msg' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_transcoder_is_transcoder_message.invokeExact(
                    msg.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link Transcoder.Build} object constructs a {@link Transcoder} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Transcoder} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Transcoder} using {@link Transcoder#castFrom}.
         * @return A new instance of {@code Transcoder} with the properties 
         *         that were set in the Build object.
         */
        public Transcoder construct() {
            return Transcoder.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Transcoder.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * See {@code encodebin}:avoid-reencoding
         * @param avoidReencoding The value for the {@code avoid-reencoding} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAvoidReencoding(boolean avoidReencoding) {
            names.add("avoid-reencoding");
            values.add(org.gtk.gobject.Value.create(avoidReencoding));
            return this;
        }
        
        public Build setDestUri(java.lang.String destUri) {
            names.add("dest-uri");
            values.add(org.gtk.gobject.Value.create(destUri));
            return this;
        }
        
        public Build setDuration(long duration) {
            names.add("duration");
            values.add(org.gtk.gobject.Value.create(duration));
            return this;
        }
        
        public Build setPipeline(org.gstreamer.gst.Element pipeline) {
            names.add("pipeline");
            values.add(org.gtk.gobject.Value.create(pipeline));
            return this;
        }
        
        public Build setPosition(long position) {
            names.add("position");
            values.add(org.gtk.gobject.Value.create(position));
            return this;
        }
        
        public Build setPositionUpdateInterval(int positionUpdateInterval) {
            names.add("position-update-interval");
            values.add(org.gtk.gobject.Value.create(positionUpdateInterval));
            return this;
        }
        
        public Build setProfile(org.gstreamer.pbutils.EncodingProfile profile) {
            names.add("profile");
            values.add(org.gtk.gobject.Value.create(profile));
            return this;
        }
        
        public Build setSrcUri(java.lang.String srcUri) {
            names.add("src-uri");
            values.add(org.gtk.gobject.Value.create(srcUri));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_transcoder_new = Interop.downcallHandle(
            "gst_transcoder_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_transcoder_new_full = Interop.downcallHandle(
            "gst_transcoder_new_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_transcoder_get_avoid_reencoding = Interop.downcallHandle(
            "gst_transcoder_get_avoid_reencoding",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_transcoder_get_dest_uri = Interop.downcallHandle(
            "gst_transcoder_get_dest_uri",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_transcoder_get_duration = Interop.downcallHandle(
            "gst_transcoder_get_duration",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_transcoder_get_message_bus = Interop.downcallHandle(
            "gst_transcoder_get_message_bus",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_transcoder_get_pipeline = Interop.downcallHandle(
            "gst_transcoder_get_pipeline",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_transcoder_get_position = Interop.downcallHandle(
            "gst_transcoder_get_position",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_transcoder_get_position_update_interval = Interop.downcallHandle(
            "gst_transcoder_get_position_update_interval",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_transcoder_get_signal_adapter = Interop.downcallHandle(
            "gst_transcoder_get_signal_adapter",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_transcoder_get_source_uri = Interop.downcallHandle(
            "gst_transcoder_get_source_uri",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_transcoder_get_sync_signal_adapter = Interop.downcallHandle(
            "gst_transcoder_get_sync_signal_adapter",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_transcoder_run = Interop.downcallHandle(
            "gst_transcoder_run",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_transcoder_run_async = Interop.downcallHandle(
            "gst_transcoder_run_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_transcoder_set_avoid_reencoding = Interop.downcallHandle(
            "gst_transcoder_set_avoid_reencoding",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_transcoder_set_cpu_usage = Interop.downcallHandle(
            "gst_transcoder_set_cpu_usage",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_transcoder_set_position_update_interval = Interop.downcallHandle(
            "gst_transcoder_set_position_update_interval",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_transcoder_get_type = Interop.downcallHandle(
            "gst_transcoder_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_transcoder_is_transcoder_message = Interop.downcallHandle(
            "gst_transcoder_is_transcoder_message",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
