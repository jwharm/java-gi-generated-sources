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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.BinClass.getMemoryLayout().withName("parent_class")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link InsertBinClass}
     * @return A new, uninitialized @{link InsertBinClass}
     */
    public static InsertBinClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        InsertBinClass newInstance = new InsertBinClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.BinClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.BinClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.BinClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Create a InsertBinClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected InsertBinClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, InsertBinClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new InsertBinClass(input);
    
    /**
     * A {@link InsertBinClass.Builder} object constructs a {@link InsertBinClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link InsertBinClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final InsertBinClass struct;
        
        private Builder() {
            struct = InsertBinClass.allocate();
        }
        
        /**
         * Finish building the {@link InsertBinClass} struct.
         * @return A new instance of {@code InsertBinClass} with the fields 
         *         that were set in the Builder object.
         */
        public InsertBinClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gstreamer.gst.BinClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
    }
}
