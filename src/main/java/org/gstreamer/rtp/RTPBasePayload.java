package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides a base class for RTP payloaders
 */
public class RTPBasePayload extends org.gstreamer.gst.Element {
    
    static {
        GstRtp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTPBasePayload";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Element.getMemoryLayout().withName("element"),
            Interop.valueLayout.ADDRESS.withName("sinkpad"),
            Interop.valueLayout.ADDRESS.withName("srcpad"),
            Interop.valueLayout.C_INT.withName("ts_base"),
            Interop.valueLayout.C_SHORT.withName("seqnum_base"),
            MemoryLayout.paddingLayout(16),
            Interop.valueLayout.ADDRESS.withName("media"),
            Interop.valueLayout.ADDRESS.withName("encoding_name"),
            Interop.valueLayout.C_INT.withName("dynamic"),
            Interop.valueLayout.C_INT.withName("clock_rate"),
            Interop.valueLayout.C_INT.withName("ts_offset"),
            Interop.valueLayout.C_INT.withName("timestamp"),
            Interop.valueLayout.C_SHORT.withName("seqnum_offset"),
            Interop.valueLayout.C_SHORT.withName("seqnum"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.C_LONG.withName("max_ptime"),
            Interop.valueLayout.C_INT.withName("pt"),
            Interop.valueLayout.C_INT.withName("ssrc"),
            Interop.valueLayout.C_INT.withName("current_ssrc"),
            Interop.valueLayout.C_INT.withName("mtu"),
            org.gstreamer.gst.Segment.getMemoryLayout().withName("segment"),
            Interop.valueLayout.C_LONG.withName("min_ptime"),
            Interop.valueLayout.C_LONG.withName("ptime"),
            Interop.valueLayout.C_LONG.withName("ptime_multiple"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a RTPBasePayload proxy instance for the provided memory address.
     * <p>
     * Because RTPBasePayload is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RTPBasePayload(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, RTPBasePayload> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RTPBasePayload(input, ownership);
    
    /**
     * Allocate a new {@link org.gstreamer.gst.Buffer} with enough data to hold an RTP packet with
     * minimum {@code csrc_count} CSRCs, a payload length of {@code payload_len} and padding of
     * {@code pad_len}. If {@code payload} has {@link RTPBasePayload}:source-info {@code true} additional
     * CSRCs may be allocated and filled with RTP source information.
     * @param payloadLen the length of the payload
     * @param padLen the amount of padding
     * @param csrcCount the minimum number of CSRC entries
     * @return A newly allocated buffer that can hold an RTP packet with given
     * parameters.
     */
    public org.gstreamer.gst.Buffer allocateOutputBuffer(int payloadLen, byte padLen, byte csrcCount) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtp_base_payload_allocate_output_buffer.invokeExact(
                    handle(),
                    payloadLen,
                    padLen,
                    csrcCount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Count the total number of RTP sources found in the meta of {@code buffer}, which
     * will be automically added by gst_rtp_base_payload_allocate_output_buffer().
     * If {@link RTPBasePayload}:source-info is {@code false} the count will be 0.
     * @param buffer a {@link org.gstreamer.gst.Buffer}, typically the buffer to payload
     * @return The number of sources.
     */
    public int getSourceCount(org.gstreamer.gst.Buffer buffer) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_base_payload_get_source_count.invokeExact(
                    handle(),
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Check if the packet with {@code size} and {@code duration} would exceed the configured
     * maximum size.
     * @param size the size of the packet
     * @param duration the duration of the packet
     * @return {@code true} if the packet of {@code size} and {@code duration} would exceed the
     * configured MTU or max_ptime.
     */
    public boolean isFilled(int size, org.gstreamer.gst.ClockTime duration) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_base_payload_is_filled.invokeExact(
                    handle(),
                    size,
                    duration.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Queries whether the payloader will add contributing sources (CSRCs) to the
     * RTP header from {@link RTPSourceMeta}.
     * @return {@code true} if source-info is enabled.
     */
    public boolean isSourceInfoEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_base_payload_is_source_info_enabled.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Push {@code buffer} to the peer element of the payloader. The SSRC, payload type,
     * seqnum and timestamp of the RTP buffer will be updated first.
     * <p>
     * This function takes ownership of {@code buffer}.
     * @param buffer a {@link org.gstreamer.gst.Buffer}
     * @return a {@link org.gstreamer.gst.FlowReturn}.
     */
    public org.gstreamer.gst.FlowReturn push(org.gstreamer.gst.Buffer buffer) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_base_payload_push.invokeExact(
                    handle(),
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buffer.yieldOwnership();
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Push {@code list} to the peer element of the payloader. The SSRC, payload type,
     * seqnum and timestamp of the RTP buffer will be updated first.
     * <p>
     * This function takes ownership of {@code list}.
     * @param list a {@link org.gstreamer.gst.BufferList}
     * @return a {@link org.gstreamer.gst.FlowReturn}.
     */
    public org.gstreamer.gst.FlowReturn pushList(org.gstreamer.gst.BufferList list) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_base_payload_push_list.invokeExact(
                    handle(),
                    list.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        list.yieldOwnership();
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Set the rtp options of the payloader. These options will be set in the caps
     * of the payloader. Subclasses must call this method before calling
     * gst_rtp_base_payload_push() or gst_rtp_base_payload_set_outcaps().
     * @param media the media type (typically "audio" or "video")
     * @param dynamic if the payload type is dynamic
     * @param encodingName the encoding name
     * @param clockRate the clock rate of the media
     */
    public void setOptions(java.lang.String media, boolean dynamic, java.lang.String encodingName, int clockRate) {
        try {
            DowncallHandles.gst_rtp_base_payload_set_options.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(media, null),
                    Marshal.booleanToInteger.marshal(dynamic, null).intValue(),
                    Marshal.stringToAddress.marshal(encodingName, null),
                    clockRate);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Configure the output caps with the optional parameters.
     * <p>
     * Variable arguments should be in the form field name, field type
     * (as a GType), value(s).  The last variable argument should be NULL.
     * @param fieldname the first field name or {@code null}
     * @param varargs field values
     * @return {@code true} if the caps could be set.
     */
    public boolean setOutcaps(java.lang.String fieldname, java.lang.Object... varargs) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_base_payload_set_outcaps.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(fieldname, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Configure the output caps with the optional fields.
     * @param s a {@link org.gstreamer.gst.Structure} with the caps fields
     * @return {@code true} if the caps could be set.
     */
    public boolean setOutcapsStructure(@Nullable org.gstreamer.gst.Structure s) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_base_payload_set_outcaps_structure.invokeExact(
                    handle(),
                    (Addressable) (s == null ? MemoryAddress.NULL : s.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Enable or disable adding contributing sources to RTP packets from
     * {@link RTPSourceMeta}.
     * @param enable whether to add contributing sources to RTP packets
     */
    public void setSourceInfoEnabled(boolean enable) {
        try {
            DowncallHandles.gst_rtp_base_payload_set_source_info_enabled.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enable, null).intValue());
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
            RESULT = (long) DowncallHandles.gst_rtp_base_payload_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface AddExtension {
        void run(org.gstreamer.rtp.RTPHeaderExtension ext);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceRTPBasePayload, MemoryAddress ext) {
            run((org.gstreamer.rtp.RTPHeaderExtension) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(ext)), org.gstreamer.rtp.RTPHeaderExtension.fromAddress).marshal(ext, Ownership.FULL));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AddExtension.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Add {@code ext} as an extension for writing part of an RTP header extension onto
     * outgoing RTP packets.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<RTPBasePayload.AddExtension> onAddExtension(RTPBasePayload.AddExtension handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("add-extension"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ClearExtensions {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceRTPBasePayload) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ClearExtensions.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Clear all RTP header extensions used by this payloader.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<RTPBasePayload.ClearExtensions> onClearExtensions(RTPBasePayload.ClearExtensions handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("clear-extensions"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RequestExtension {
        org.gstreamer.rtp.RTPHeaderExtension run(int extId, java.lang.String extUri);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress sourceRTPBasePayload, int extId, MemoryAddress extUri) {
            var RESULT = run(extId, Marshal.addressToString.marshal(extUri, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RequestExtension.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * The returned {@code ext} must be configured with the correct {@code ext_id} and with the
     * necessary attributes as required by the extension implementation.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<RTPBasePayload.RequestExtension> onRequestExtension(RTPBasePayload.RequestExtension handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("request-extension"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link RTPBasePayload.Builder} object constructs a {@link RTPBasePayload} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link RTPBasePayload.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.Element.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link RTPBasePayload} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link RTPBasePayload}.
         * @return A new instance of {@code RTPBasePayload} with the properties 
         *         that were set in the Builder object.
         */
        public RTPBasePayload build() {
            return (RTPBasePayload) org.gtk.gobject.GObject.newWithProperties(
                RTPBasePayload.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * If enabled, the payloader will automatically try to enable all the
         * RTP header extensions provided in the src caps, saving the application
         * the need to handle these extensions manually using the
         * GstRTPBasePayload::request-extension: signal.
         * @param autoHeaderExtension The value for the {@code auto-header-extension} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAutoHeaderExtension(boolean autoHeaderExtension) {
            names.add("auto-header-extension");
            values.add(org.gtk.gobject.Value.create(autoHeaderExtension));
            return this;
        }
        
        public Builder setMaxPtime(long maxPtime) {
            names.add("max-ptime");
            values.add(org.gtk.gobject.Value.create(maxPtime));
            return this;
        }
        
        /**
         * Minimum duration of the packet data in ns (can't go above MTU)
         * @param minPtime The value for the {@code min-ptime} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMinPtime(long minPtime) {
            names.add("min-ptime");
            values.add(org.gtk.gobject.Value.create(minPtime));
            return this;
        }
        
        public Builder setMtu(int mtu) {
            names.add("mtu");
            values.add(org.gtk.gobject.Value.create(mtu));
            return this;
        }
        
        /**
         * Make the payloader timestamp packets according to the Rate-Control=no
         * behaviour specified in the ONVIF replay spec.
         * @param onvifNoRateControl The value for the {@code onvif-no-rate-control} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOnvifNoRateControl(boolean onvifNoRateControl) {
            names.add("onvif-no-rate-control");
            values.add(org.gtk.gobject.Value.create(onvifNoRateControl));
            return this;
        }
        
        /**
         * Try to use the offset fields to generate perfect RTP timestamps. When this
         * option is disabled, RTP timestamps are generated from GST_BUFFER_PTS of
         * each payloaded buffer. The PTSes of buffers may not necessarily increment
         * with the amount of data in each input buffer, consider e.g. the case where
         * the buffer arrives from a network which means that the PTS is unrelated to
         * the amount of data. Because the RTP timestamps are generated from
         * GST_BUFFER_PTS this can result in RTP timestamps that also don't increment
         * with the amount of data in the payloaded packet. To circumvent this it is
         * possible to set the perfect rtptime option enabled. When this option is
         * enabled the payloader will increment the RTP timestamps based on
         * GST_BUFFER_OFFSET which relates to the amount of data in each packet
         * rather than the GST_BUFFER_PTS of each buffer and therefore the RTP
         * timestamps will more closely correlate with the amount of data in each
         * buffer. Currently GstRTPBasePayload is limited to handling perfect RTP
         * timestamps for audio streams.
         * @param perfectRtptime The value for the {@code perfect-rtptime} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPerfectRtptime(boolean perfectRtptime) {
            names.add("perfect-rtptime");
            values.add(org.gtk.gobject.Value.create(perfectRtptime));
            return this;
        }
        
        public Builder setPt(int pt) {
            names.add("pt");
            values.add(org.gtk.gobject.Value.create(pt));
            return this;
        }
        
        /**
         * Force buffers to be multiples of this duration in ns (0 disables)
         * @param ptimeMultiple The value for the {@code ptime-multiple} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPtimeMultiple(long ptimeMultiple) {
            names.add("ptime-multiple");
            values.add(org.gtk.gobject.Value.create(ptimeMultiple));
            return this;
        }
        
        /**
         * Make the RTP packets' timestamps be scaled with the segment's rate
         * (corresponding to RTSP speed parameter). Disabling this property means
         * the timestamps will not be affected by the set delivery speed (RTSP speed).
         * <p>
         * Example: A server wants to allow streaming a recorded video in double
         * speed but still have the timestamps correspond to the position in the
         * video. This is achieved by the client setting RTSP Speed to 2 while the
         * server has this property disabled.
         * @param scaleRtptime The value for the {@code scale-rtptime} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScaleRtptime(boolean scaleRtptime) {
            names.add("scale-rtptime");
            values.add(org.gtk.gobject.Value.create(scaleRtptime));
            return this;
        }
        
        public Builder setSeqnum(int seqnum) {
            names.add("seqnum");
            values.add(org.gtk.gobject.Value.create(seqnum));
            return this;
        }
        
        public Builder setSeqnumOffset(int seqnumOffset) {
            names.add("seqnum-offset");
            values.add(org.gtk.gobject.Value.create(seqnumOffset));
            return this;
        }
        
        /**
         * Enable writing the CSRC field in allocated RTP header based on RTP source
         * information found in the input buffer's {@link RTPSourceMeta}.
         * @param sourceInfo The value for the {@code source-info} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSourceInfo(boolean sourceInfo) {
            names.add("source-info");
            values.add(org.gtk.gobject.Value.create(sourceInfo));
            return this;
        }
        
        public Builder setSsrc(int ssrc) {
            names.add("ssrc");
            values.add(org.gtk.gobject.Value.create(ssrc));
            return this;
        }
        
        /**
         * Various payloader statistics retrieved atomically (and are therefore
         * synchroized with each other), these can be used e.g. to generate an
         * RTP-Info header. This property return a GstStructure named
         * application/x-rtp-payload-stats containing the following fields relating to
         * the last processed buffer and current state of the stream being payloaded:
         * <p>
         *   * {@code clock-rate} :{@code G_TYPE_UINT}, clock-rate of the stream
         *   * {@code running-time} :{@code G_TYPE_UINT64}, running time
         *   * {@code seqnum} :{@code G_TYPE_UINT}, sequence number, same as {@link RTPBasePayload}:seqnum
         *   * {@code timestamp} :{@code G_TYPE_UINT}, RTP timestamp, same as {@link RTPBasePayload}:timestamp
         *   * {@code ssrc} :{@code G_TYPE_UINT}, The SSRC in use
         *   * {@code pt} :{@code G_TYPE_UINT}, The Payload type in use, same as {@link RTPBasePayload}:pt
         *   * {@code seqnum-offset} :{@code G_TYPE_UINT}, The current offset added to the seqnum
         *   * {@code timestamp-offset} :{@code G_TYPE_UINT}, The current offset added to the timestamp
         * @param stats The value for the {@code stats} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStats(org.gstreamer.gst.Structure stats) {
            names.add("stats");
            values.add(org.gtk.gobject.Value.create(stats));
            return this;
        }
        
        public Builder setTimestamp(int timestamp) {
            names.add("timestamp");
            values.add(org.gtk.gobject.Value.create(timestamp));
            return this;
        }
        
        public Builder setTimestampOffset(int timestampOffset) {
            names.add("timestamp-offset");
            values.add(org.gtk.gobject.Value.create(timestampOffset));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_rtp_base_payload_allocate_output_buffer = Interop.downcallHandle(
            "gst_rtp_base_payload_allocate_output_buffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gst_rtp_base_payload_get_source_count = Interop.downcallHandle(
            "gst_rtp_base_payload_get_source_count",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_base_payload_is_filled = Interop.downcallHandle(
            "gst_rtp_base_payload_is_filled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_rtp_base_payload_is_source_info_enabled = Interop.downcallHandle(
            "gst_rtp_base_payload_is_source_info_enabled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_base_payload_push = Interop.downcallHandle(
            "gst_rtp_base_payload_push",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_base_payload_push_list = Interop.downcallHandle(
            "gst_rtp_base_payload_push_list",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_base_payload_set_options = Interop.downcallHandle(
            "gst_rtp_base_payload_set_options",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtp_base_payload_set_outcaps = Interop.downcallHandle(
            "gst_rtp_base_payload_set_outcaps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_rtp_base_payload_set_outcaps_structure = Interop.downcallHandle(
            "gst_rtp_base_payload_set_outcaps_structure",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_base_payload_set_source_info_enabled = Interop.downcallHandle(
            "gst_rtp_base_payload_set_source_info_enabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtp_base_payload_get_type = Interop.downcallHandle(
            "gst_rtp_base_payload_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
