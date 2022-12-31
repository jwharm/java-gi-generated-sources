package org.gstreamer.transcoder;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Transcoder extends org.gstreamer.gst.GstObject {
    
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
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Transcoder(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, Transcoder> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Transcoder(input, ownership);
    
    private static MemoryAddress constructNew(java.lang.String sourceUri, java.lang.String destUri, java.lang.String encodingProfile) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_transcoder_new.invokeExact(
                    Marshal.stringToAddress.marshal(sourceUri, null),
                    Marshal.stringToAddress.marshal(destUri, null),
                    Marshal.stringToAddress.marshal(encodingProfile, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public Transcoder(java.lang.String sourceUri, java.lang.String destUri, java.lang.String encodingProfile) {
        super(constructNew(sourceUri, destUri, encodingProfile), Ownership.NONE);
    }
    
    private static MemoryAddress constructNewFull(java.lang.String sourceUri, java.lang.String destUri, org.gstreamer.pbutils.EncodingProfile profile) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_transcoder_new_full.invokeExact(
                    Marshal.stringToAddress.marshal(sourceUri, null),
                    Marshal.stringToAddress.marshal(destUri, null),
                    profile.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static Transcoder newFull(java.lang.String sourceUri, java.lang.String destUri, org.gstreamer.pbutils.EncodingProfile profile) {
        var RESULT = constructNewFull(sourceUri, destUri, profile);
        return (org.gstreamer.transcoder.Transcoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.transcoder.Transcoder.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    public boolean getAvoidReencoding() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_transcoder_get_avoid_reencoding.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the URI of the destination of the transcoded stream.
     * @return a string containing the URI of the
     * destination of the transcoded stream. g_free() after usage.
     */
    public java.lang.String getDestUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_transcoder_get_dest_uri.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Retrieves the duration of the media stream that self represents.
     * @return the duration of the transcoding media stream, in
     * nanoseconds.
     */
    public org.gstreamer.gst.ClockTime getDuration() {
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
    public org.gstreamer.gst.Bus getMessageBus() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_transcoder_get_message_bus.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.Bus) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.Bus.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    public org.gstreamer.gst.Element getPipeline() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_transcoder_get_pipeline.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.Element) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.Element.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    public org.gstreamer.gst.ClockTime getPosition() {
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
        return (org.gstreamer.transcoder.TranscoderSignalAdapter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.transcoder.TranscoderSignalAdapter.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the URI of the currently-transcoding stream.
     * @return a string containing the URI of the
     * source stream. g_free() after usage.
     */
    public java.lang.String getSourceUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_transcoder_get_source_uri.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the {@link TranscoderSignalAdapter} attached to {@code self} to emit signals from
     * its thread of emission.
     * @return The {@link TranscoderSignalAdapter} to connect signal
     * handlers to.
     */
    public org.gstreamer.transcoder.TranscoderSignalAdapter getSyncSignalAdapter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_transcoder_get_sync_signal_adapter.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.transcoder.TranscoderSignalAdapter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.transcoder.TranscoderSignalAdapter.fromAddress).marshal(RESULT, Ownership.FULL);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
                    Marshal.booleanToInteger.marshal(avoidReencoding, null).intValue());
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_transcoder_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static boolean isTranscoderMessage(org.gstreamer.gst.Message msg) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_transcoder_is_transcoder_message.invokeExact(
                    msg.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * A {@link Transcoder.Builder} object constructs a {@link Transcoder} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Transcoder.Builder#build()}. 
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
         * Finish building the {@link Transcoder} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Transcoder}.
         * @return A new instance of {@code Transcoder} with the properties 
         *         that were set in the Builder object.
         */
        public Transcoder build() {
            return (Transcoder) org.gtk.gobject.GObject.newWithProperties(
                Transcoder.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * See {@code encodebin}:avoid-reencoding
         * @param avoidReencoding The value for the {@code avoid-reencoding} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAvoidReencoding(boolean avoidReencoding) {
            names.add("avoid-reencoding");
            values.add(org.gtk.gobject.Value.create(avoidReencoding));
            return this;
        }
        
        public Builder setDestUri(java.lang.String destUri) {
            names.add("dest-uri");
            values.add(org.gtk.gobject.Value.create(destUri));
            return this;
        }
        
        public Builder setDuration(long duration) {
            names.add("duration");
            values.add(org.gtk.gobject.Value.create(duration));
            return this;
        }
        
        public Builder setPipeline(org.gstreamer.gst.Element pipeline) {
            names.add("pipeline");
            values.add(org.gtk.gobject.Value.create(pipeline));
            return this;
        }
        
        public Builder setPosition(long position) {
            names.add("position");
            values.add(org.gtk.gobject.Value.create(position));
            return this;
        }
        
        public Builder setPositionUpdateInterval(int positionUpdateInterval) {
            names.add("position-update-interval");
            values.add(org.gtk.gobject.Value.create(positionUpdateInterval));
            return this;
        }
        
        public Builder setProfile(org.gstreamer.pbutils.EncodingProfile profile) {
            names.add("profile");
            values.add(org.gtk.gobject.Value.create(profile));
            return this;
        }
        
        public Builder setSrcUri(java.lang.String srcUri) {
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
