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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("type"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("sdp")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link WebRTCSessionDescription}
     * @return A new, uninitialized @{link WebRTCSessionDescription}
     */
    public static WebRTCSessionDescription allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        WebRTCSessionDescription newInstance = new WebRTCSessionDescription(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gstreamer.webrtc.WebRTCSDPType getType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.webrtc.WebRTCSDPType.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void setType(org.gstreamer.webrtc.WebRTCSDPType type) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code sdp}
     * @return The value of the field {@code sdp}
     */
    public org.gstreamer.sdp.SDPMessage getSdp() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sdp"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.sdp.SDPMessage.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code sdp}
     * @param sdp The new value of the field {@code sdp}
     */
    public void setSdp(org.gstreamer.sdp.SDPMessage sdp) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sdp"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sdp == null ? MemoryAddress.NULL : sdp.handle()));
        }
    }
    
    /**
     * Create a WebRTCSessionDescription proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected WebRTCSessionDescription(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, WebRTCSessionDescription> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new WebRTCSessionDescription(input);
    
    private static MemoryAddress constructNew(org.gstreamer.webrtc.WebRTCSDPType type, org.gstreamer.sdp.SDPMessage sdp) {
        MemoryAddress RESULT;
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
    
    public WebRTCSessionDescription(org.gstreamer.webrtc.WebRTCSDPType type, org.gstreamer.sdp.SDPMessage sdp) {
        super(constructNew(type, sdp));
        this.takeOwnership();
    }
    
    public org.gstreamer.webrtc.WebRTCSessionDescription copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_webrtc_session_description_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.webrtc.WebRTCSessionDescription.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Free {@code desc} and all associated resources
     */
    public void free() {
        try {
            DowncallHandles.gst_webrtc_session_description_free.invokeExact(handle());
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
     * A {@link WebRTCSessionDescription.Builder} object constructs a {@link WebRTCSessionDescription} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link WebRTCSessionDescription.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final WebRTCSessionDescription struct;
        
        private Builder() {
            struct = WebRTCSessionDescription.allocate();
        }
        
        /**
         * Finish building the {@link WebRTCSessionDescription} struct.
         * @return A new instance of {@code WebRTCSessionDescription} with the fields 
         *         that were set in the Builder object.
         */
        public WebRTCSessionDescription build() {
            return struct;
        }
        
        /**
         * the {@link WebRTCSDPType} of the description
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setType(org.gstreamer.webrtc.WebRTCSDPType type) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
                return this;
            }
        }
        
        /**
         * the {@link org.gstreamer.sdp.SDPMessage} of the description
         * @param sdp The value for the {@code sdp} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSdp(org.gstreamer.sdp.SDPMessage sdp) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("sdp"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sdp == null ? MemoryAddress.NULL : sdp.handle()));
                return this;
            }
        }
    }
}
