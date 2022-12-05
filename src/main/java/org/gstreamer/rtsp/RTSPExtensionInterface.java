package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An interface representing RTSP extensions.
 */
public class RTSPExtensionInterface extends Struct {
    
    static {
        GstRtsp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPExtensionInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("detect_server"),
        Interop.valueLayout.ADDRESS.withName("before_send"),
        Interop.valueLayout.ADDRESS.withName("after_send"),
        Interop.valueLayout.ADDRESS.withName("parse_sdp"),
        Interop.valueLayout.ADDRESS.withName("setup_media"),
        Interop.valueLayout.ADDRESS.withName("configure_stream"),
        Interop.valueLayout.ADDRESS.withName("get_transports"),
        Interop.valueLayout.ADDRESS.withName("stream_select"),
        Interop.valueLayout.ADDRESS.withName("send"),
        Interop.valueLayout.ADDRESS.withName("receive_request"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link RTSPExtensionInterface}
     * @return A new, uninitialized @{link RTSPExtensionInterface}
     */
    public static RTSPExtensionInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTSPExtensionInterface newInstance = new RTSPExtensionInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gtk.gobject.TypeInterface parent$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a RTSPExtensionInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RTSPExtensionInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private RTSPExtensionInterface struct;
        
         /**
         * A {@link RTSPExtensionInterface.Build} object constructs a {@link RTSPExtensionInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = RTSPExtensionInterface.allocate();
        }
        
         /**
         * Finish building the {@link RTSPExtensionInterface} struct.
         * @return A new instance of {@code RTSPExtensionInterface} with the fields 
         *         that were set in the Build object.
         */
        public RTSPExtensionInterface construct() {
            return struct;
        }
        
        public Build setParent(org.gtk.gobject.TypeInterface parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        public Build setDetectServer(java.lang.foreign.MemoryAddress detectServer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("detect_server"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (detectServer == null ? MemoryAddress.NULL : detectServer));
            return this;
        }
        
        public Build setBeforeSend(java.lang.foreign.MemoryAddress beforeSend) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("before_send"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (beforeSend == null ? MemoryAddress.NULL : beforeSend));
            return this;
        }
        
        public Build setAfterSend(java.lang.foreign.MemoryAddress afterSend) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("after_send"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (afterSend == null ? MemoryAddress.NULL : afterSend));
            return this;
        }
        
        public Build setParseSdp(java.lang.foreign.MemoryAddress parseSdp) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parse_sdp"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parseSdp == null ? MemoryAddress.NULL : parseSdp));
            return this;
        }
        
        public Build setSetupMedia(java.lang.foreign.MemoryAddress setupMedia) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("setup_media"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setupMedia == null ? MemoryAddress.NULL : setupMedia));
            return this;
        }
        
        public Build setConfigureStream(java.lang.foreign.MemoryAddress configureStream) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("configure_stream"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (configureStream == null ? MemoryAddress.NULL : configureStream));
            return this;
        }
        
        public Build setGetTransports(java.lang.foreign.MemoryAddress getTransports) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_transports"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getTransports == null ? MemoryAddress.NULL : getTransports));
            return this;
        }
        
        public Build setStreamSelect(java.lang.foreign.MemoryAddress streamSelect) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stream_select"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (streamSelect == null ? MemoryAddress.NULL : streamSelect));
            return this;
        }
        
        public Build setSend(java.lang.foreign.MemoryAddress send) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("send"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (send == null ? MemoryAddress.NULL : send));
            return this;
        }
        
        public Build setReceiveRequest(java.lang.foreign.MemoryAddress receiveRequest) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("receive_request"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (receiveRequest == null ? MemoryAddress.NULL : receiveRequest));
            return this;
        }
        
        public Build setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
