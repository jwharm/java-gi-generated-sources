package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class WebRTCSCTPTransport extends org.gstreamer.gst.GstObject {
    
    static {
        GstWebRTC.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCSCTPTransport";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a WebRTCSCTPTransport proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected WebRTCSCTPTransport(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, WebRTCSCTPTransport> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new WebRTCSCTPTransport(input);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_webrtc_sctp_transport_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link WebRTCSCTPTransport.Builder} object constructs a {@link WebRTCSCTPTransport} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link WebRTCSCTPTransport.Builder#build()}. 
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
         * Finish building the {@link WebRTCSCTPTransport} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link WebRTCSCTPTransport}.
         * @return A new instance of {@code WebRTCSCTPTransport} with the properties 
         *         that were set in the Builder object.
         */
        public WebRTCSCTPTransport build() {
            return (WebRTCSCTPTransport) org.gtk.gobject.GObject.newWithProperties(
                WebRTCSCTPTransport.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setMaxChannels(int maxChannels) {
            names.add("max-channels");
            values.add(org.gtk.gobject.Value.create(maxChannels));
            return this;
        }
        
        public Builder setMaxMessageSize(long maxMessageSize) {
            names.add("max-message-size");
            values.add(org.gtk.gobject.Value.create(maxMessageSize));
            return this;
        }
        
        public Builder setState(org.gstreamer.webrtc.WebRTCSCTPTransportState state) {
            names.add("state");
            values.add(org.gtk.gobject.Value.create(state));
            return this;
        }
        
        public Builder setTransport(org.gstreamer.webrtc.WebRTCDTLSTransport transport) {
            names.add("transport");
            values.add(org.gtk.gobject.Value.create(transport));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_webrtc_sctp_transport_get_type = Interop.downcallHandle(
                "gst_webrtc_sctp_transport_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_webrtc_sctp_transport_get_type != null;
    }
}
