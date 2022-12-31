package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class WebRTCICETransport extends org.gstreamer.gst.GstObject {
    
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
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected WebRTCICETransport(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, WebRTCICETransport> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new WebRTCICETransport(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
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
        void run(java.lang.String object);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceWebRTCICETransport, MemoryAddress object) {
            run(Marshal.addressToString.marshal(object, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OnNewCandidate.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<WebRTCICETransport.OnNewCandidate> onOnNewCandidate(WebRTCICETransport.OnNewCandidate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("on-new-candidate"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface OnSelectedCandidatePairChange {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceWebRTCICETransport) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OnSelectedCandidatePairChange.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<WebRTCICETransport.OnSelectedCandidatePairChange> onOnSelectedCandidatePairChange(WebRTCICETransport.OnSelectedCandidatePairChange handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("on-selected-candidate-pair-change"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link WebRTCICETransport.Builder} object constructs a {@link WebRTCICETransport} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link WebRTCICETransport.Builder#build()}. 
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
         * Finish building the {@link WebRTCICETransport} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link WebRTCICETransport}.
         * @return A new instance of {@code WebRTCICETransport} with the properties 
         *         that were set in the Builder object.
         */
        public WebRTCICETransport build() {
            return (WebRTCICETransport) org.gtk.gobject.GObject.newWithProperties(
                WebRTCICETransport.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setComponent(org.gstreamer.webrtc.WebRTCICEComponent component) {
            names.add("component");
            values.add(org.gtk.gobject.Value.create(component));
            return this;
        }
        
        public Builder setGatheringState(org.gstreamer.webrtc.WebRTCICEGatheringState gatheringState) {
            names.add("gathering-state");
            values.add(org.gtk.gobject.Value.create(gatheringState));
            return this;
        }
        
        public Builder setState(org.gstreamer.webrtc.WebRTCICEConnectionState state) {
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
}
