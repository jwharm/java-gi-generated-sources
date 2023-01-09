package org.gtk.graphene;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Simd4F extends Struct {
    
    static {
        Graphene.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "graphene_simd4f_t";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_FLOAT.withName("x"),
            Interop.valueLayout.C_FLOAT.withName("y"),
            Interop.valueLayout.C_FLOAT.withName("z"),
            Interop.valueLayout.C_FLOAT.withName("w")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Simd4F}
     * @return A new, uninitialized @{link Simd4F}
     */
    public static Simd4F allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Simd4F newInstance = new Simd4F(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Simd4F proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Simd4F(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Simd4F> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Simd4F(input);
    
    /**
     * A {@link Simd4F.Builder} object constructs a {@link Simd4F} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Simd4F.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Simd4F struct;
        
        private Builder() {
            struct = Simd4F.allocate();
        }
        
        /**
         * Finish building the {@link Simd4F} struct.
         * @return A new instance of {@code Simd4F} with the fields 
         *         that were set in the Builder object.
         */
        public Simd4F build() {
            return struct;
        }
        
        public Builder setX(float x) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("x"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), x);
                return this;
            }
        }
        
        public Builder setY(float y) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("y"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), y);
                return this;
            }
        }
        
        public Builder setZ(float z) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("z"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), z);
                return this;
            }
        }
        
        public Builder setW(float w) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("w"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), w);
                return this;
            }
        }
    }
}
