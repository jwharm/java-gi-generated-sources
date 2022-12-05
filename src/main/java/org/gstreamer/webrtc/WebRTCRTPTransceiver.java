package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Mostly matches the WebRTC RTCRtpTransceiver interface.
 */
public class WebRTCRTPTransceiver extends org.gstreamer.gst.Object {
    
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
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public WebRTCRTPTransceiver(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to WebRTCRTPTransceiver if its GType is a (or inherits from) "GstWebRTCRTPTransceiver".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code WebRTCRTPTransceiver} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstWebRTCRTPTransceiver", a ClassCastException will be thrown.
     */
    public static WebRTCRTPTransceiver castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), WebRTCRTPTransceiver.getType())) {
            return new WebRTCRTPTransceiver(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstWebRTCRTPTransceiver");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_webrtc_rtp_transceiver_get_type.invokeExact();
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
         * A {@link WebRTCRTPTransceiver.Build} object constructs a {@link WebRTCRTPTransceiver} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link WebRTCRTPTransceiver} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link WebRTCRTPTransceiver} using {@link WebRTCRTPTransceiver#castFrom}.
         * @return A new instance of {@code WebRTCRTPTransceiver} with the properties 
         *         that were set in the Build object.
         */
        public WebRTCRTPTransceiver construct() {
            return WebRTCRTPTransceiver.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    WebRTCRTPTransceiver.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Caps representing the codec preferences.
         * @param codecPreferences The value for the {@code codec-preferences} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCodecPreferences(org.gstreamer.gst.Caps codecPreferences) {
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
        public Build setCurrentDirection(org.gstreamer.webrtc.WebRTCRTPTransceiverDirection currentDirection) {
            names.add("current-direction");
            values.add(org.gtk.gobject.Value.create(currentDirection));
            return this;
        }
        
        /**
         * Direction of the transceiver.
         * @param direction The value for the {@code direction} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDirection(org.gstreamer.webrtc.WebRTCRTPTransceiverDirection direction) {
            names.add("direction");
            values.add(org.gtk.gobject.Value.create(direction));
            return this;
        }
        
        /**
         * The kind of media this transceiver transports
         * @param kind The value for the {@code kind} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setKind(org.gstreamer.webrtc.WebRTCKind kind) {
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
        public Build setMid(java.lang.String mid) {
            names.add("mid");
            values.add(org.gtk.gobject.Value.create(mid));
            return this;
        }
        
        public Build setMlineindex(int mlineindex) {
            names.add("mlineindex");
            values.add(org.gtk.gobject.Value.create(mlineindex));
            return this;
        }
        
        public Build setReceiver(org.gstreamer.webrtc.WebRTCRTPReceiver receiver) {
            names.add("receiver");
            values.add(org.gtk.gobject.Value.create(receiver));
            return this;
        }
        
        public Build setSender(org.gstreamer.webrtc.WebRTCRTPSender sender) {
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
