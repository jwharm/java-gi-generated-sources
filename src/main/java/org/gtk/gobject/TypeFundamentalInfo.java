package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A structure that provides information to the type system which is
 * used specifically for managing fundamental types.
 */
public class TypeFundamentalInfo extends Struct {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTypeFundamentalInfo";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("type_flags")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TypeFundamentalInfo}
     * @return A new, uninitialized @{link TypeFundamentalInfo}
     */
    public static TypeFundamentalInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TypeFundamentalInfo newInstance = new TypeFundamentalInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code type_flags}
     * @return The value of the field {@code type_flags}
     */
    public org.gtk.gobject.TypeFundamentalFlags getTypeFlags() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type_flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gobject.TypeFundamentalFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code type_flags}
     * @param typeFlags The new value of the field {@code type_flags}
     */
    public void setTypeFlags(org.gtk.gobject.TypeFundamentalFlags typeFlags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type_flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (typeFlags == null ? MemoryAddress.NULL : typeFlags.getValue()));
    }
    
    /**
     * Create a TypeFundamentalInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TypeFundamentalInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TypeFundamentalInfo> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TypeFundamentalInfo(input, ownership);
    
    /**
     * A {@link TypeFundamentalInfo.Builder} object constructs a {@link TypeFundamentalInfo} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TypeFundamentalInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TypeFundamentalInfo struct;
        
        private Builder() {
            struct = TypeFundamentalInfo.allocate();
        }
        
         /**
         * Finish building the {@link TypeFundamentalInfo} struct.
         * @return A new instance of {@code TypeFundamentalInfo} with the fields 
         *         that were set in the Builder object.
         */
        public TypeFundamentalInfo build() {
            return struct;
        }
        
        /**
         * {@link TypeFundamentalFlags} describing the characteristics of the fundamental type
         * @param typeFlags The value for the {@code typeFlags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTypeFlags(org.gtk.gobject.TypeFundamentalFlags typeFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (typeFlags == null ? MemoryAddress.NULL : typeFlags.getValue()));
            return this;
        }
    }
}
