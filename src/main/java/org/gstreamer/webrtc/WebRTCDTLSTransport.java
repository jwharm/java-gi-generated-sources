package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class WebRTCDTLSTransport extends org.gstreamer.gst.Object {
    
    static {
        GstWebRTC.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCDTLSTransport";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a WebRTCDTLSTransport proxy instance for the provided memory address.
     * <p>
     * Because WebRTCDTLSTransport is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public WebRTCDTLSTransport(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to WebRTCDTLSTransport if its GType is a (or inherits from) "GstWebRTCDTLSTransport".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code WebRTCDTLSTransport} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstWebRTCDTLSTransport", a ClassCastException will be thrown.
     */
    public static WebRTCDTLSTransport castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), WebRTCDTLSTransport.getType())) {
            return new WebRTCDTLSTransport(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstWebRTCDTLSTransport");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_webrtc_dtls_transport_get_type.invokeExact();
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
         * A {@link WebRTCDTLSTransport.Build} object constructs a {@link WebRTCDTLSTransport} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link WebRTCDTLSTransport} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link WebRTCDTLSTransport} using {@link WebRTCDTLSTransport#castFrom}.
         * @return A new instance of {@code WebRTCDTLSTransport} with the properties 
         *         that were set in the Build object.
         */
        public WebRTCDTLSTransport construct() {
            return WebRTCDTLSTransport.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    WebRTCDTLSTransport.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setCertificate(java.lang.String certificate) {
            names.add("certificate");
            values.add(org.gtk.gobject.Value.create(certificate));
            return this;
        }
        
        public Build setClient(boolean client) {
            names.add("client");
            values.add(org.gtk.gobject.Value.create(client));
            return this;
        }
        
        public Build setRemoteCertificate(java.lang.String remoteCertificate) {
            names.add("remote-certificate");
            values.add(org.gtk.gobject.Value.create(remoteCertificate));
            return this;
        }
        
        public Build setSessionId(int sessionId) {
            names.add("session-id");
            values.add(org.gtk.gobject.Value.create(sessionId));
            return this;
        }
        
        public Build setState(org.gstreamer.webrtc.WebRTCDTLSTransportState state) {
            names.add("state");
            values.add(org.gtk.gobject.Value.create(state));
            return this;
        }
        
        public Build setTransport(org.gstreamer.webrtc.WebRTCICETransport transport) {
            names.add("transport");
            values.add(org.gtk.gobject.Value.create(transport));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_webrtc_dtls_transport_get_type = Interop.downcallHandle(
            "gst_webrtc_dtls_transport_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
