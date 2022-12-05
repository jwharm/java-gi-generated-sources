package org.gstreamer.insertbin;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The object class structure.
 */
public class InsertBinClass extends Struct {
    
    static {
        GstInsertBin.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstInsertBinClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.BinClass.getMemoryLayout().withName("parent_class")
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
     * Allocate a new {@link InsertBinClass}
     * @return A new, uninitialized @{link InsertBinClass}
     */
    public static InsertBinClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        InsertBinClass newInstance = new InsertBinClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.BinClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.gst.BinClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a InsertBinClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public InsertBinClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private InsertBinClass struct;
        
         /**
         * A {@link InsertBinClass.Build} object constructs a {@link InsertBinClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = InsertBinClass.allocate();
        }
        
         /**
         * Finish building the {@link InsertBinClass} struct.
         * @return A new instance of {@code InsertBinClass} with the fields 
         *         that were set in the Build object.
         */
        public InsertBinClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gstreamer.gst.BinClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
    }
}
