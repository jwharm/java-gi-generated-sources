package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base class for RTP depayloaders.
 */
public class RTPBaseDepayloadClass extends Struct {
    
    static {
        GstRtp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTPBaseDepayloadClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ElementClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("set_caps"),
        Interop.valueLayout.ADDRESS.withName("process"),
        Interop.valueLayout.ADDRESS.withName("packet_lost"),
        Interop.valueLayout.ADDRESS.withName("handle_event"),
        Interop.valueLayout.ADDRESS.withName("process_rtp_packet"),
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
     * Allocate a new {@link RTPBaseDepayloadClass}
     * @return A new, uninitialized @{link RTPBaseDepayloadClass}
     */
    public static RTPBaseDepayloadClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTPBaseDepayloadClass newInstance = new RTPBaseDepayloadClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ElementClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.gst.ElementClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a RTPBaseDepayloadClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RTPBaseDepayloadClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private RTPBaseDepayloadClass struct;
        
         /**
         * A {@link RTPBaseDepayloadClass.Build} object constructs a {@link RTPBaseDepayloadClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = RTPBaseDepayloadClass.allocate();
        }
        
         /**
         * Finish building the {@link RTPBaseDepayloadClass} struct.
         * @return A new instance of {@code RTPBaseDepayloadClass} with the fields 
         *         that were set in the Build object.
         */
        public RTPBaseDepayloadClass construct() {
            return struct;
        }
        
        /**
         * the parent class
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gstreamer.gst.ElementClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setSetCaps(java.lang.foreign.MemoryAddress setCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps));
            return this;
        }
        
        public Build setProcess(java.lang.foreign.MemoryAddress process) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("process"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (process == null ? MemoryAddress.NULL : process));
            return this;
        }
        
        public Build setPacketLost(java.lang.foreign.MemoryAddress packetLost) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("packet_lost"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (packetLost == null ? MemoryAddress.NULL : packetLost));
            return this;
        }
        
        public Build setHandleEvent(java.lang.foreign.MemoryAddress handleEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleEvent == null ? MemoryAddress.NULL : handleEvent));
            return this;
        }
        
        public Build setProcessRtpPacket(java.lang.foreign.MemoryAddress processRtpPacket) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("process_rtp_packet"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (processRtpPacket == null ? MemoryAddress.NULL : processRtpPacket));
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
