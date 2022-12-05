package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Callback functions from a {@link RTSPWatch}.
 */
public class RTSPWatchFuncs extends Struct {
    
    static {
        GstRtsp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPWatchFuncs";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("message_received"),
        Interop.valueLayout.ADDRESS.withName("message_sent"),
        Interop.valueLayout.ADDRESS.withName("closed"),
        Interop.valueLayout.ADDRESS.withName("error"),
        Interop.valueLayout.ADDRESS.withName("tunnel_start"),
        Interop.valueLayout.ADDRESS.withName("tunnel_complete"),
        Interop.valueLayout.ADDRESS.withName("error_full"),
        Interop.valueLayout.ADDRESS.withName("tunnel_lost"),
        Interop.valueLayout.ADDRESS.withName("tunnel_http_response"),
        MemoryLayout.sequenceLayout(3, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link RTSPWatchFuncs}
     * @return A new, uninitialized @{link RTSPWatchFuncs}
     */
    public static RTSPWatchFuncs allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTSPWatchFuncs newInstance = new RTSPWatchFuncs(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a RTSPWatchFuncs proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RTSPWatchFuncs(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private RTSPWatchFuncs struct;
        
         /**
         * A {@link RTSPWatchFuncs.Build} object constructs a {@link RTSPWatchFuncs} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = RTSPWatchFuncs.allocate();
        }
        
         /**
         * Finish building the {@link RTSPWatchFuncs} struct.
         * @return A new instance of {@code RTSPWatchFuncs} with the fields 
         *         that were set in the Build object.
         */
        public RTSPWatchFuncs construct() {
            return struct;
        }
        
        public Build setMessageReceived(java.lang.foreign.MemoryAddress messageReceived) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("message_received"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (messageReceived == null ? MemoryAddress.NULL : messageReceived));
            return this;
        }
        
        public Build setMessageSent(java.lang.foreign.MemoryAddress messageSent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("message_sent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (messageSent == null ? MemoryAddress.NULL : messageSent));
            return this;
        }
        
        public Build setClosed(java.lang.foreign.MemoryAddress closed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("closed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closed == null ? MemoryAddress.NULL : closed));
            return this;
        }
        
        public Build setError(java.lang.foreign.MemoryAddress error) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("error"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (error == null ? MemoryAddress.NULL : error));
            return this;
        }
        
        public Build setTunnelStart(java.lang.foreign.MemoryAddress tunnelStart) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tunnel_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tunnelStart == null ? MemoryAddress.NULL : tunnelStart));
            return this;
        }
        
        public Build setTunnelComplete(java.lang.foreign.MemoryAddress tunnelComplete) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tunnel_complete"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tunnelComplete == null ? MemoryAddress.NULL : tunnelComplete));
            return this;
        }
        
        public Build setErrorFull(java.lang.foreign.MemoryAddress errorFull) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("error_full"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (errorFull == null ? MemoryAddress.NULL : errorFull));
            return this;
        }
        
        public Build setTunnelLost(java.lang.foreign.MemoryAddress tunnelLost) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tunnel_lost"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tunnelLost == null ? MemoryAddress.NULL : tunnelLost));
            return this;
        }
        
        public Build setTunnelHttpResponse(java.lang.foreign.MemoryAddress tunnelHttpResponse) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tunnel_http_response"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tunnelHttpResponse == null ? MemoryAddress.NULL : tunnelHttpResponse));
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
