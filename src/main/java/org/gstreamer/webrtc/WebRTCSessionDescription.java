package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See &lt;https://www.w3.org/TR/webrtc/{@code rtcsessiondescription}-class&gt;
 */
public class WebRTCSessionDescription extends Struct {
    
    static {
        GstWebRTC.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCSessionDescription";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("sdp")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link WebRTCSessionDescription}
     * @return A new, uninitialized @{link WebRTCSessionDescription}
     */
    public static WebRTCSessionDescription allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        WebRTCSessionDescription newInstance = new WebRTCSessionDescription(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gstreamer.webrtc.WebRTCSDPType type$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.webrtc.WebRTCSDPType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void type$set(org.gstreamer.webrtc.WebRTCSDPType type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), type.getValue());
    }
    
    /**
     * Get the value of the field {@code sdp}
     * @return The value of the field {@code sdp}
     */
    public org.gstreamer.sdp.SDPMessage sdp$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sdp"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.sdp.SDPMessage(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code sdp}
     * @param sdp The new value of the field {@code sdp}
     */
    public void sdp$set(org.gstreamer.sdp.SDPMessage sdp) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sdp"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), sdp.handle());
    }
    
    /**
     * Create a WebRTCSessionDescription proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public WebRTCSessionDescription(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.webrtc.WebRTCSDPType type, @NotNull org.gstreamer.sdp.SDPMessage sdp) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(sdp, "Parameter 'sdp' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_webrtc_session_description_new.invokeExact(
                    type.getValue(),
                    sdp.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        sdp.yieldOwnership();
        return RESULT;
    }
    
    public WebRTCSessionDescription(@NotNull org.gstreamer.webrtc.WebRTCSDPType type, @NotNull org.gstreamer.sdp.SDPMessage sdp) {
        super(constructNew(type, sdp), Ownership.FULL);
    }
    
    public @NotNull org.gstreamer.webrtc.WebRTCSessionDescription copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_webrtc_session_description_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.webrtc.WebRTCSessionDescription(RESULT, Ownership.FULL);
    }
    
    /**
     * Free {@code desc} and all associated resources
     */
    public void free() {
        try {
            DowncallHandles.gst_webrtc_session_description_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_webrtc_session_description_new = Interop.downcallHandle(
            "gst_webrtc_session_description_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_webrtc_session_description_copy = Interop.downcallHandle(
            "gst_webrtc_session_description_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_webrtc_session_description_free = Interop.downcallHandle(
            "gst_webrtc_session_description_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private WebRTCSessionDescription struct;
        
         /**
         * A {@link WebRTCSessionDescription.Build} object constructs a {@link WebRTCSessionDescription} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = WebRTCSessionDescription.allocate();
        }
        
         /**
         * Finish building the {@link WebRTCSessionDescription} struct.
         * @return A new instance of {@code WebRTCSessionDescription} with the fields 
         *         that were set in the Build object.
         */
        public WebRTCSessionDescription construct() {
            return struct;
        }
        
        /**
         * the {@link WebRTCSDPType} of the description
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setType(org.gstreamer.webrtc.WebRTCSDPType type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
            return this;
        }
        
        /**
         * the {@link org.gstreamer.sdp.SDPMessage} of the description
         * @param sdp The value for the {@code sdp} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSdp(org.gstreamer.sdp.SDPMessage sdp) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sdp"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sdp == null ? MemoryAddress.NULL : sdp.handle()));
            return this;
        }
    }
}
