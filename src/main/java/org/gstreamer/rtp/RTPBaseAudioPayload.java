package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides a base class for audio RTP payloaders for frame or sample based
 * audio codecs (constant bitrate)
 * <p>
 * This class derives from GstRTPBasePayload. It can be used for payloading
 * audio codecs. It will only work with constant bitrate codecs. It supports
 * both frame based and sample based codecs. It takes care of packing up the
 * audio data into RTP packets and filling up the headers accordingly. The
 * payloading is done based on the maximum MTU (mtu) and the maximum time per
 * packet (max-ptime). The general idea is to divide large data buffers into
 * smaller RTP packets. The RTP packet size is the minimum of either the MTU,
 * max-ptime (if set) or available data. The RTP packet size is always larger or
 * equal to min-ptime (if set). If min-ptime is not set, any residual data is
 * sent in a last RTP packet. In the case of frame based codecs, the resulting
 * RTP packets always contain full frames.
 * <p>
 * <strong>Usage</strong><br/>
 * To use this base class, your child element needs to call either
 * gst_rtp_base_audio_payload_set_frame_based() or
 * gst_rtp_base_audio_payload_set_sample_based(). This is usually done in the
 * element's {@code _init()} function. Then, the child element must call either
 * gst_rtp_base_audio_payload_set_frame_options(),
 * gst_rtp_base_audio_payload_set_sample_options() or
 * gst_rtp_base_audio_payload_set_samplebits_options. Since
 * GstRTPBaseAudioPayload derives from GstRTPBasePayload, the child element
 * must set any variables or call/override any functions required by that base
 * class. The child element does not need to override any other functions
 * specific to GstRTPBaseAudioPayload.
 */
public class RTPBaseAudioPayload extends org.gstreamer.rtp.RTPBasePayload {
    
    static {
        GstRtp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTPBaseAudioPayload";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.rtp.RTPBasePayload.getMemoryLayout().withName("payload"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            Interop.valueLayout.C_LONG.withName("base_ts"),
            Interop.valueLayout.C_INT.withName("frame_size"),
            Interop.valueLayout.C_INT.withName("frame_duration"),
            Interop.valueLayout.C_INT.withName("sample_size"),
            MemoryLayout.paddingLayout(224),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a RTPBaseAudioPayload proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RTPBaseAudioPayload(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTPBaseAudioPayload> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RTPBaseAudioPayload(input);
    
    /**
     * Create an RTP buffer and store {@code payload_len} bytes of the adapter as the
     * payload. Set the timestamp on the new buffer to {@code timestamp} before pushing
     * the buffer downstream.
     * <p>
     * If {@code payload_len} is -1, all pending bytes will be flushed. If {@code timestamp} is
     * -1, the timestamp will be calculated automatically.
     * @param payloadLen length of payload
     * @param timestamp a {@link org.gstreamer.gst.ClockTime}
     * @return a {@link org.gstreamer.gst.FlowReturn}
     */
    public org.gstreamer.gst.FlowReturn flush(int payloadLen, org.gstreamer.gst.ClockTime timestamp) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_base_audio_payload_flush.invokeExact(
                    handle(),
                    payloadLen,
                    timestamp.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Gets the internal adapter used by the depayloader.
     * @return a {@link org.gstreamer.base.Adapter}.
     */
    public org.gstreamer.base.Adapter getAdapter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtp_base_audio_payload_get_adapter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.base.Adapter) Interop.register(RESULT, org.gstreamer.base.Adapter.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Create an RTP buffer and store {@code payload_len} bytes of {@code data} as the
     * payload. Set the timestamp on the new buffer to {@code timestamp} before pushing
     * the buffer downstream.
     * @param data data to set as payload
     * @param payloadLen length of payload
     * @param timestamp a {@link org.gstreamer.gst.ClockTime}
     * @return a {@link org.gstreamer.gst.FlowReturn}
     */
    public org.gstreamer.gst.FlowReturn push(byte[] data, int payloadLen, org.gstreamer.gst.ClockTime timestamp) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_rtp_base_audio_payload_push.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(data, false, SCOPE),
                        payloadLen,
                        timestamp.getValue().longValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.gst.FlowReturn.of(RESULT);
        }
    }
    
    /**
     * Tells {@link RTPBaseAudioPayload} that the child element is for a frame based
     * audio codec
     */
    public void setFrameBased() {
        try {
            DowncallHandles.gst_rtp_base_audio_payload_set_frame_based.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the options for frame based audio codecs.
     * @param frameDuration The duraction of an audio frame in milliseconds.
     * @param frameSize The size of an audio frame in bytes.
     */
    public void setFrameOptions(int frameDuration, int frameSize) {
        try {
            DowncallHandles.gst_rtp_base_audio_payload_set_frame_options.invokeExact(
                    handle(),
                    frameDuration,
                    frameSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Tells {@link RTPBaseAudioPayload} that the child element is for a sample based
     * audio codec
     */
    public void setSampleBased() {
        try {
            DowncallHandles.gst_rtp_base_audio_payload_set_sample_based.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the options for sample based audio codecs.
     * @param sampleSize Size per sample in bytes.
     */
    public void setSampleOptions(int sampleSize) {
        try {
            DowncallHandles.gst_rtp_base_audio_payload_set_sample_options.invokeExact(
                    handle(),
                    sampleSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the options for sample based audio codecs.
     * @param sampleSize Size per sample in bits.
     */
    public void setSamplebitsOptions(int sampleSize) {
        try {
            DowncallHandles.gst_rtp_base_audio_payload_set_samplebits_options.invokeExact(
                    handle(),
                    sampleSize);
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
            RESULT = (long) DowncallHandles.gst_rtp_base_audio_payload_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link RTPBaseAudioPayload.Builder} object constructs a {@link RTPBaseAudioPayload} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link RTPBaseAudioPayload.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.rtp.RTPBasePayload.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link RTPBaseAudioPayload} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link RTPBaseAudioPayload}.
         * @return A new instance of {@code RTPBaseAudioPayload} with the properties 
         *         that were set in the Builder object.
         */
        public RTPBaseAudioPayload build() {
            return (RTPBaseAudioPayload) org.gtk.gobject.GObject.newWithProperties(
                RTPBaseAudioPayload.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setBufferList(boolean bufferList) {
            names.add("buffer-list");
            values.add(org.gtk.gobject.Value.create(bufferList));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_rtp_base_audio_payload_flush = Interop.downcallHandle(
                "gst_rtp_base_audio_payload_flush",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_rtp_base_audio_payload_get_adapter = Interop.downcallHandle(
                "gst_rtp_base_audio_payload_get_adapter",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtp_base_audio_payload_push = Interop.downcallHandle(
                "gst_rtp_base_audio_payload_push",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_rtp_base_audio_payload_set_frame_based = Interop.downcallHandle(
                "gst_rtp_base_audio_payload_set_frame_based",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtp_base_audio_payload_set_frame_options = Interop.downcallHandle(
                "gst_rtp_base_audio_payload_set_frame_options",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_rtp_base_audio_payload_set_sample_based = Interop.downcallHandle(
                "gst_rtp_base_audio_payload_set_sample_based",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_rtp_base_audio_payload_set_sample_options = Interop.downcallHandle(
                "gst_rtp_base_audio_payload_set_sample_options",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_rtp_base_audio_payload_set_samplebits_options = Interop.downcallHandle(
                "gst_rtp_base_audio_payload_set_samplebits_options",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_rtp_base_audio_payload_get_type = Interop.downcallHandle(
                "gst_rtp_base_audio_payload_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_rtp_base_audio_payload_get_type != null;
    }
}
