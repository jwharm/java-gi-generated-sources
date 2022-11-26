package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Simd4X4F extends Struct {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_simd4x4f_t";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.graphene.Simd4F.getMemoryLayout().withName("x"),
        org.gtk.graphene.Simd4F.getMemoryLayout().withName("y"),
        org.gtk.graphene.Simd4F.getMemoryLayout().withName("z"),
        org.gtk.graphene.Simd4F.getMemoryLayout().withName("w")
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
     * Allocate a new {@link Simd4X4F}
     * @return A new, uninitialized @{link Simd4X4F}
     */
    public static Simd4X4F allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Simd4X4F newInstance = new Simd4X4F(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Simd4X4F proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Simd4X4F(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Simd4X4F struct;
        
         /**
         * A {@link Simd4X4F.Build} object constructs a {@link Simd4X4F} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Simd4X4F.allocate();
        }
        
         /**
         * Finish building the {@link Simd4X4F} struct.
         * @return A new instance of {@code Simd4X4F} with the fields 
         *         that were set in the Build object.
         */
        public Simd4X4F construct() {
            return struct;
        }
        
        public Build setX(org.gtk.graphene.Simd4F x) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("x"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (x == null ? MemoryAddress.NULL : x.handle()));
            return this;
        }
        
        public Build setY(org.gtk.graphene.Simd4F y) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (y == null ? MemoryAddress.NULL : y.handle()));
            return this;
        }
        
        public Build setZ(org.gtk.graphene.Simd4F z) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("z"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (z == null ? MemoryAddress.NULL : z.handle()));
            return this;
        }
        
        public Build setW(org.gtk.graphene.Simd4F w) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("w"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (w == null ? MemoryAddress.NULL : w.handle()));
            return this;
        }
    }
}
