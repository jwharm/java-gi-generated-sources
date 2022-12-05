package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Mpeg2Slice extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpeg2Slice";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("quant_matrix"),
        Interop.valueLayout.ADDRESS.withName("pic_hdr"),
        Interop.valueLayout.ADDRESS.withName("pic_ext"),
        Interop.valueLayout.ADDRESS.withName("header"),
        Interop.valueLayout.ADDRESS.withName("packet"),
        Interop.valueLayout.C_INT.withName("sc_offset"),
        Interop.valueLayout.C_INT.withName("size")
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
     * Allocate a new {@link Mpeg2Slice}
     * @return A new, uninitialized @{link Mpeg2Slice}
     */
    public static Mpeg2Slice allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Mpeg2Slice newInstance = new Mpeg2Slice(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Mpeg2Slice proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Mpeg2Slice(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Mpeg2Slice struct;
        
         /**
         * A {@link Mpeg2Slice.Build} object constructs a {@link Mpeg2Slice} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Mpeg2Slice.allocate();
        }
        
         /**
         * Finish building the {@link Mpeg2Slice} struct.
         * @return A new instance of {@code Mpeg2Slice} with the fields 
         *         that were set in the Build object.
         */
        public Mpeg2Slice construct() {
            return struct;
        }
        
        public Build setQuantMatrix(java.lang.foreign.MemoryAddress quantMatrix) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("quant_matrix"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (quantMatrix == null ? MemoryAddress.NULL : (Addressable) quantMatrix));
            return this;
        }
        
        public Build setPicHdr(java.lang.foreign.MemoryAddress picHdr) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pic_hdr"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (picHdr == null ? MemoryAddress.NULL : (Addressable) picHdr));
            return this;
        }
        
        public Build setPicExt(java.lang.foreign.MemoryAddress picExt) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pic_ext"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (picExt == null ? MemoryAddress.NULL : (Addressable) picExt));
            return this;
        }
        
        public Build setHeader(java.lang.foreign.MemoryAddress header) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("header"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (header == null ? MemoryAddress.NULL : (Addressable) header));
            return this;
        }
        
        public Build setPacket(java.lang.foreign.MemoryAddress packet) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("packet"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (packet == null ? MemoryAddress.NULL : (Addressable) packet));
            return this;
        }
        
        public Build setScOffset(int scOffset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sc_offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), scOffset);
            return this;
        }
        
        public Build setSize(int size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
            return this;
        }
    }
}
