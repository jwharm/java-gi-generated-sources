package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An object to track the sending aspect of the stream
 * <p>
 * Mostly matches the WebRTC RTCRtpSender interface.
 */
public class WebRTCRTPSender extends org.gstreamer.gst.GstObject {
    
    static {
        GstWebRTC.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCRTPSender";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a WebRTCRTPSender proxy instance for the provided memory address.
     * <p>
     * Because WebRTCRTPSender is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected WebRTCRTPSender(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, WebRTCRTPSender> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new WebRTCRTPSender(input, ownership);
    
    /**
     * Sets the content of the IPv4 Type of Service (ToS), also known as DSCP
     * (Differentiated Services Code Point).
     * This also sets the Traffic Class field of IPv6.
     * @param priority The priority of this sender
     */
    public void setPriority(org.gstreamer.webrtc.WebRTCPriorityType priority) {
        try {
            DowncallHandles.gst_webrtc_rtp_sender_set_priority.invokeExact(
                    handle(),
                    priority.getValue());
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
            RESULT = (long) DowncallHandles.gst_webrtc_rtp_sender_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link WebRTCRTPSender.Builder} object constructs a {@link WebRTCRTPSender} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link WebRTCRTPSender.Builder#build()}. 
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
         * Finish building the {@link WebRTCRTPSender} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link WebRTCRTPSender}.
         * @return A new instance of {@code WebRTCRTPSender} with the properties 
         *         that were set in the Builder object.
         */
        public WebRTCRTPSender build() {
            return (WebRTCRTPSender) org.gtk.gobject.GObject.newWithProperties(
                WebRTCRTPSender.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The priority from which to set the DSCP field on packets
         * @param priority The value for the {@code priority} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPriority(org.gstreamer.webrtc.WebRTCPriorityType priority) {
            names.add("priority");
            values.add(org.gtk.gobject.Value.create(priority));
            return this;
        }
        
        /**
         * The DTLS transport for this sender
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
        
        private static final MethodHandle gst_webrtc_rtp_sender_set_priority = Interop.downcallHandle(
            "gst_webrtc_rtp_sender_set_priority",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_webrtc_rtp_sender_get_type = Interop.downcallHandle(
            "gst_webrtc_rtp_sender_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
