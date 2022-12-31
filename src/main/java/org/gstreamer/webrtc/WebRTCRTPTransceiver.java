package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Mostly matches the WebRTC RTCRtpTransceiver interface.
 */
public class WebRTCRTPTransceiver extends org.gstreamer.gst.GstObject {
    
    static {
        GstWebRTC.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCRTPTransceiver";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a WebRTCRTPTransceiver proxy instance for the provided memory address.
     * <p>
     * Because WebRTCRTPTransceiver is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected WebRTCRTPTransceiver(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, WebRTCRTPTransceiver> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new WebRTCRTPTransceiver(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_webrtc_rtp_transceiver_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link WebRTCRTPTransceiver.Builder} object constructs a {@link WebRTCRTPTransceiver} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link WebRTCRTPTransceiver.Builder#build()}. 
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
         * Finish building the {@link WebRTCRTPTransceiver} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link WebRTCRTPTransceiver}.
         * @return A new instance of {@code WebRTCRTPTransceiver} with the properties 
         *         that were set in the Builder object.
         */
        public WebRTCRTPTransceiver build() {
            return (WebRTCRTPTransceiver) org.gtk.gobject.GObject.newWithProperties(
                WebRTCRTPTransceiver.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Caps representing the codec preferences.
         * @param codecPreferences The value for the {@code codec-preferences} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCodecPreferences(org.gstreamer.gst.Caps codecPreferences) {
            names.add("codec-preferences");
            values.add(org.gtk.gobject.Value.create(codecPreferences));
            return this;
        }
        
        /**
         * The transceiver's current directionality, or none if the
         * transceiver is stopped or has never participated in an exchange
         * of offers and answers. To change the transceiver's
         * directionality, set the value of the direction property.
         * @param currentDirection The value for the {@code current-direction} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCurrentDirection(org.gstreamer.webrtc.WebRTCRTPTransceiverDirection currentDirection) {
            names.add("current-direction");
            values.add(org.gtk.gobject.Value.create(currentDirection));
            return this;
        }
        
        /**
         * Direction of the transceiver.
         * @param direction The value for the {@code direction} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDirection(org.gstreamer.webrtc.WebRTCRTPTransceiverDirection direction) {
            names.add("direction");
            values.add(org.gtk.gobject.Value.create(direction));
            return this;
        }
        
        /**
         * The kind of media this transceiver transports
         * @param kind The value for the {@code kind} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKind(org.gstreamer.webrtc.WebRTCKind kind) {
            names.add("kind");
            values.add(org.gtk.gobject.Value.create(kind));
            return this;
        }
        
        /**
         * The media ID of the m-line associated with this transceiver. This
         * association is established, when possible, whenever either a
         * local or remote description is applied. This field is null if
         * neither a local or remote description has been applied, or if its
         * associated m-line is rejected by either a remote offer or any
         * answer.
         * @param mid The value for the {@code mid} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMid(java.lang.String mid) {
            names.add("mid");
            values.add(org.gtk.gobject.Value.create(mid));
            return this;
        }
        
        public Builder setMlineindex(int mlineindex) {
            names.add("mlineindex");
            values.add(org.gtk.gobject.Value.create(mlineindex));
            return this;
        }
        
        public Builder setReceiver(org.gstreamer.webrtc.WebRTCRTPReceiver receiver) {
            names.add("receiver");
            values.add(org.gtk.gobject.Value.create(receiver));
            return this;
        }
        
        public Builder setSender(org.gstreamer.webrtc.WebRTCRTPSender sender) {
            names.add("sender");
            values.add(org.gtk.gobject.Value.create(sender));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_webrtc_rtp_transceiver_get_type = Interop.downcallHandle(
            "gst_webrtc_rtp_transceiver_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
