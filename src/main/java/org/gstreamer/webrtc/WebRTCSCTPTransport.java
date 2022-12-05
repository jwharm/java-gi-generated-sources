package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class WebRTCSCTPTransport extends org.gstreamer.gst.Object {
    
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
     * <p>
     * Because WebRTCSCTPTransport is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public WebRTCSCTPTransport(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to WebRTCSCTPTransport if its GType is a (or inherits from) "GstWebRTCSCTPTransport".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code WebRTCSCTPTransport} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstWebRTCSCTPTransport", a ClassCastException will be thrown.
     */
    public static WebRTCSCTPTransport castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), WebRTCSCTPTransport.getType())) {
            return new WebRTCSCTPTransport(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstWebRTCSCTPTransport");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_webrtc_sctp_transport_get_type.invokeExact();
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
         * A {@link WebRTCSCTPTransport.Build} object constructs a {@link WebRTCSCTPTransport} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link WebRTCSCTPTransport} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link WebRTCSCTPTransport} using {@link WebRTCSCTPTransport#castFrom}.
         * @return A new instance of {@code WebRTCSCTPTransport} with the properties 
         *         that were set in the Build object.
         */
        public WebRTCSCTPTransport construct() {
            return WebRTCSCTPTransport.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    WebRTCSCTPTransport.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setMaxChannels(int maxChannels) {
            names.add("max-channels");
            values.add(org.gtk.gobject.Value.create(maxChannels));
            return this;
        }
        
        public Build setMaxMessageSize(long maxMessageSize) {
            names.add("max-message-size");
            values.add(org.gtk.gobject.Value.create(maxMessageSize));
            return this;
        }
        
        public Build setState(org.gstreamer.webrtc.WebRTCSCTPTransportState state) {
            names.add("state");
            values.add(org.gtk.gobject.Value.create(state));
            return this;
        }
        
        public Build setTransport(org.gstreamer.webrtc.WebRTCDTLSTransport transport) {
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
}
