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
public class WebRTCRTPSender extends org.gstreamer.gst.Object {
    
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
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public WebRTCRTPSender(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to WebRTCRTPSender if its GType is a (or inherits from) "GstWebRTCRTPSender".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code WebRTCRTPSender} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstWebRTCRTPSender", a ClassCastException will be thrown.
     */
    public static WebRTCRTPSender castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), WebRTCRTPSender.getType())) {
            return new WebRTCRTPSender(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstWebRTCRTPSender");
        }
    }
    
    /**
     * Sets the content of the IPv4 Type of Service (ToS), also known as DSCP
     * (Differentiated Services Code Point).
     * This also sets the Traffic Class field of IPv6.
     * @param priority The priority of this sender
     */
    public void setPriority(@NotNull org.gstreamer.webrtc.WebRTCPriorityType priority) {
        java.util.Objects.requireNonNull(priority, "Parameter 'priority' must not be null");
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_webrtc_rtp_sender_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link WebRTCRTPSender.Build} object constructs a {@link WebRTCRTPSender} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link WebRTCRTPSender} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link WebRTCRTPSender} using {@link WebRTCRTPSender#castFrom}.
         * @return A new instance of {@code WebRTCRTPSender} with the properties 
         *         that were set in the Build object.
         */
        public WebRTCRTPSender construct() {
            return WebRTCRTPSender.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    WebRTCRTPSender.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The priority from which to set the DSCP field on packets
         * @param priority The value for the {@code priority} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPriority(org.gstreamer.webrtc.WebRTCPriorityType priority) {
            names.add("priority");
            values.add(org.gtk.gobject.Value.create(priority));
            return this;
        }
        
        /**
         * The DTLS transport for this sender
         * @param transport The value for the {@code transport} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTransport(org.gstreamer.webrtc.WebRTCDTLSTransport transport) {
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
