package org.gstreamer.check;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CheckABIStruct extends Struct {
    
    static {
        GstCheck.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstCheckABIStruct";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("name"),
            Interop.valueLayout.C_INT.withName("size"),
            Interop.valueLayout.C_INT.withName("abi_size")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link CheckABIStruct}
     * @return A new, uninitialized @{link CheckABIStruct}
     */
    public static CheckABIStruct allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CheckABIStruct newInstance = new CheckABIStruct(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code name}
     * @return The value of the field {@code name}
     */
    public java.lang.String getName() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code name}
     * @param name The new value of the field {@code name}
     */
    public void setName(java.lang.String name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)));
    }
    
    /**
     * Get the value of the field {@code size}
     * @return The value of the field {@code size}
     */
    public int getSize() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code size}
     * @param size The new value of the field {@code size}
     */
    public void setSize(int size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
    }
    
    /**
     * Get the value of the field {@code abi_size}
     * @return The value of the field {@code abi_size}
     */
    public int getAbiSize() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("abi_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code abi_size}
     * @param abiSize The new value of the field {@code abi_size}
     */
    public void setAbiSize(int abiSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("abi_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), abiSize);
    }
    
    /**
     * Create a CheckABIStruct proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CheckABIStruct(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CheckABIStruct> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CheckABIStruct(input, ownership);
    
    /**
     * A {@link CheckABIStruct.Builder} object constructs a {@link CheckABIStruct} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link CheckABIStruct.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final CheckABIStruct struct;
        
        private Builder() {
            struct = CheckABIStruct.allocate();
        }
        
         /**
         * Finish building the {@link CheckABIStruct} struct.
         * @return A new instance of {@code CheckABIStruct} with the fields 
         *         that were set in the Builder object.
         */
        public CheckABIStruct build() {
            return struct;
        }
        
        /**
         * The name of the structure
         * @param name The value for the {@code name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setName(java.lang.String name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)));
            return this;
        }
        
        /**
         * The current size of a structure
         * @param size The value for the {@code size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSize(int size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
            return this;
        }
        
        /**
         * The reference size of the structure
         * @param abiSize The value for the {@code abiSize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAbiSize(int abiSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("abi_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), abiSize);
            return this;
        }
    }
}
