package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class WebRTCICETransport extends org.gstreamer.gst.Object {
    
    static {
        GstWebRTC.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCICETransport";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a WebRTCICETransport proxy instance for the provided memory address.
     * <p>
     * Because WebRTCICETransport is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public WebRTCICETransport(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to WebRTCICETransport if its GType is a (or inherits from) "GstWebRTCICETransport".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code WebRTCICETransport} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstWebRTCICETransport", a ClassCastException will be thrown.
     */
    public static WebRTCICETransport castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), WebRTCICETransport.getType())) {
            return new WebRTCICETransport(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstWebRTCICETransport");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_webrtc_ice_transport_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface OnNewCandidate {
        void signalReceived(WebRTCICETransport sourceWebRTCICETransport, @NotNull java.lang.String object);
    }
    
    public Signal<WebRTCICETransport.OnNewCandidate> onOnNewCandidate(WebRTCICETransport.OnNewCandidate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("on-new-candidate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(WebRTCICETransport.Callbacks.class, "signalWebRTCICETransportOnNewCandidate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<WebRTCICETransport.OnNewCandidate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface OnSelectedCandidatePairChange {
        void signalReceived(WebRTCICETransport sourceWebRTCICETransport);
    }
    
    public Signal<WebRTCICETransport.OnSelectedCandidatePairChange> onOnSelectedCandidatePairChange(WebRTCICETransport.OnSelectedCandidatePairChange handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("on-selected-candidate-pair-change"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(WebRTCICETransport.Callbacks.class, "signalWebRTCICETransportOnSelectedCandidatePairChange",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<WebRTCICETransport.OnSelectedCandidatePairChange>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link WebRTCICETransport.Build} object constructs a {@link WebRTCICETransport} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link WebRTCICETransport} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link WebRTCICETransport} using {@link WebRTCICETransport#castFrom}.
         * @return A new instance of {@code WebRTCICETransport} with the properties 
         *         that were set in the Build object.
         */
        public WebRTCICETransport construct() {
            return WebRTCICETransport.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    WebRTCICETransport.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setComponent(org.gstreamer.webrtc.WebRTCICEComponent component) {
            names.add("component");
            values.add(org.gtk.gobject.Value.create(component));
            return this;
        }
        
        public Build setGatheringState(org.gstreamer.webrtc.WebRTCICEGatheringState gatheringState) {
            names.add("gathering-state");
            values.add(org.gtk.gobject.Value.create(gatheringState));
            return this;
        }
        
        public Build setState(org.gstreamer.webrtc.WebRTCICEConnectionState state) {
            names.add("state");
            values.add(org.gtk.gobject.Value.create(state));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_webrtc_ice_transport_get_type = Interop.downcallHandle(
            "gst_webrtc_ice_transport_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalWebRTCICETransportOnNewCandidate(MemoryAddress sourceWebRTCICETransport, MemoryAddress object, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (WebRTCICETransport.OnNewCandidate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new WebRTCICETransport(sourceWebRTCICETransport, Ownership.NONE), Interop.getStringFrom(object));
        }
        
        public static void signalWebRTCICETransportOnSelectedCandidatePairChange(MemoryAddress sourceWebRTCICETransport, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (WebRTCICETransport.OnSelectedCandidatePairChange) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new WebRTCICETransport(sourceWebRTCICETransport, Ownership.NONE));
        }
    }
}
