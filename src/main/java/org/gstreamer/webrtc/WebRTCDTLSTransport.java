package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class WebRTCDTLSTransport extends org.gstreamer.gst.GstObject {
    
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
     * @param address   The memory address of the native object
     */
    protected WebRTCDTLSTransport(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, WebRTCDTLSTransport> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new WebRTCDTLSTransport(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_webrtc_dtls_transport_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link WebRTCDTLSTransport.Builder} object constructs a {@link WebRTCDTLSTransport} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link WebRTCDTLSTransport.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link WebRTCDTLSTransport} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link WebRTCDTLSTransport}.
         * @return A new instance of {@code WebRTCDTLSTransport} with the properties 
         *         that were set in the Builder object.
         */
        public WebRTCDTLSTransport build() {
            return (WebRTCDTLSTransport) org.gtk.gobject.GObject.newWithProperties(
                WebRTCDTLSTransport.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setCertificate(java.lang.String certificate) {
            names.add("certificate");
            values.add(org.gtk.gobject.Value.create(certificate));
            return this;
        }
        
        public Builder setClient(boolean client) {
            names.add("client");
            values.add(org.gtk.gobject.Value.create(client));
            return this;
        }
        
        public Builder setRemoteCertificate(java.lang.String remoteCertificate) {
            names.add("remote-certificate");
            values.add(org.gtk.gobject.Value.create(remoteCertificate));
            return this;
        }
        
        public Builder setSessionId(int sessionId) {
            names.add("session-id");
            values.add(org.gtk.gobject.Value.create(sessionId));
            return this;
        }
        
        public Builder setState(org.gstreamer.webrtc.WebRTCDTLSTransportState state) {
            names.add("state");
            values.add(org.gtk.gobject.Value.create(state));
            return this;
        }
        
        public Builder setTransport(org.gstreamer.webrtc.WebRTCICETransport transport) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_webrtc_dtls_transport_get_type != null;
    }
}
