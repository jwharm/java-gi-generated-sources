package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure used for scatter/gather data output.
 * You generally pass in an array of {@code GOutputVectors}
 * and the operation will use all the buffers as if they were
 * one buffer.
 * @version 2.22
 */
public class OutputVector extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GOutputVector";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("buffer"),
            Interop.valueLayout.C_LONG.withName("size")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link OutputVector}
     * @return A new, uninitialized @{link OutputVector}
     */
    public static OutputVector allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        OutputVector newInstance = new OutputVector(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code buffer}
     * @return The value of the field {@code buffer}
     */
    public java.lang.foreign.MemoryAddress getBuffer() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code buffer}
     * @param buffer The new value of the field {@code buffer}
     */
    public void setBuffer(java.lang.foreign.MemoryAddress buffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (buffer == null ? MemoryAddress.NULL : (Addressable) buffer));
    }
    
    /**
     * Get the value of the field {@code size}
     * @return The value of the field {@code size}
     */
    public long getSize() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code size}
     * @param size The new value of the field {@code size}
     */
    public void setSize(long size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
    }
    
    /**
     * Create a OutputVector proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected OutputVector(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, OutputVector> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new OutputVector(input, ownership);
    
    /**
     * A {@link OutputVector.Builder} object constructs a {@link OutputVector} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link OutputVector.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final OutputVector struct;
        
        private Builder() {
            struct = OutputVector.allocate();
        }
        
         /**
         * Finish building the {@link OutputVector} struct.
         * @return A new instance of {@code OutputVector} with the fields 
         *         that were set in the Builder object.
         */
        public OutputVector build() {
            return struct;
        }
        
        /**
         * Pointer to a buffer of data to read.
         * @param buffer The value for the {@code buffer} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBuffer(java.lang.foreign.MemoryAddress buffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (buffer == null ? MemoryAddress.NULL : (Addressable) buffer));
            return this;
        }
        
        /**
         * the size of {@code buffer}.
         * @param size The value for the {@code size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSize(long size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
            return this;
        }
    }
}
