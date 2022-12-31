package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An object to track the receiving aspect of the stream
 * <p>
 * Mostly matches the WebRTC RTCRtpReceiver interface.
 */
public class WebRTCRTPReceiver extends org.gstreamer.gst.GstObject {
    
    static {
        GstWebRTC.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCRTPReceiver";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a WebRTCRTPReceiver proxy instance for the provided memory address.
     * <p>
     * Because WebRTCRTPReceiver is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected WebRTCRTPReceiver(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, WebRTCRTPReceiver> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new WebRTCRTPReceiver(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_webrtc_rtp_receiver_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link WebRTCRTPReceiver.Builder} object constructs a {@link WebRTCRTPReceiver} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link WebRTCRTPReceiver.Builder#build()}. 
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
         * Finish building the {@link WebRTCRTPReceiver} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link WebRTCRTPReceiver}.
         * @return A new instance of {@code WebRTCRTPReceiver} with the properties 
         *         that were set in the Builder object.
         */
        public WebRTCRTPReceiver build() {
            return (WebRTCRTPReceiver) org.gtk.gobject.GObject.newWithProperties(
                WebRTCRTPReceiver.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The DTLS transport for this receiver
         * @param transport The value for the {@code transport} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTransport(org.gstreamer.webrtc.WebRTCDTLSTransport transport) {
            names.add("transport");
            values.add(org.gtk.gobject.Value.create(transport));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_webrtc_rtp_receiver_get_type = Interop.downcallHandle(
            "gst_webrtc_rtp_receiver_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
