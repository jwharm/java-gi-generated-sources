package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class H265Slice extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstH265Slice";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("header"),
        Interop.valueLayout.ADDRESS.withName("nalu")
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
     * Allocate a new {@link H265Slice}
     * @return A new, uninitialized @{link H265Slice}
     */
    public static H265Slice allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        H265Slice newInstance = new H265Slice(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code header}
     * @return The value of the field {@code header}
     */
    public java.lang.foreign.MemoryAddress header$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("header"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code header}
     * @param header The new value of the field {@code header}
     */
    public void header$set(java.lang.foreign.MemoryAddress header) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("header"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) header);
    }
    
    /**
     * Get the value of the field {@code nalu}
     * @return The value of the field {@code nalu}
     */
    public java.lang.foreign.MemoryAddress nalu$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("nalu"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code nalu}
     * @param nalu The new value of the field {@code nalu}
     */
    public void nalu$set(java.lang.foreign.MemoryAddress nalu) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("nalu"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) nalu);
    }
    
    /**
     * Create a H265Slice proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public H265Slice(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private H265Slice struct;
        
         /**
         * A {@link H265Slice.Build} object constructs a {@link H265Slice} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = H265Slice.allocate();
        }
        
         /**
         * Finish building the {@link H265Slice} struct.
         * @return A new instance of {@code H265Slice} with the fields 
         *         that were set in the Build object.
         */
        public H265Slice construct() {
            return struct;
        }
        
        public Build setHeader(java.lang.foreign.MemoryAddress header) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("header"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (header == null ? MemoryAddress.NULL : (Addressable) header));
            return this;
        }
        
        public Build setNalu(java.lang.foreign.MemoryAddress nalu) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("nalu"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nalu == null ? MemoryAddress.NULL : (Addressable) nalu));
            return this;
        }
    }
}
