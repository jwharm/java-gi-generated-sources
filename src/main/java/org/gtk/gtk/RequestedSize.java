package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Represents a request of a screen object in a given orientation. These
 * are primarily used in container implementations when allocating a natural
 * size for children calling. See {@link Gtk#distributeNaturalAllocation}.
 */
public class RequestedSize extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkRequestedSize";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("data"),
        Interop.valueLayout.C_INT.withName("minimum_size"),
        Interop.valueLayout.C_INT.withName("natural_size")
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
     * Allocate a new {@link RequestedSize}
     * @return A new, uninitialized @{link RequestedSize}
     */
    public static RequestedSize allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RequestedSize newInstance = new RequestedSize(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public java.lang.foreign.MemoryAddress data$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void data$set(java.lang.foreign.MemoryAddress data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) data);
    }
    
    /**
     * Get the value of the field {@code minimum_size}
     * @return The value of the field {@code minimum_size}
     */
    public int minimum_size$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("minimum_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code minimum_size}
     * @param minimum_size The new value of the field {@code minimum_size}
     */
    public void minimum_size$set(int minimum_size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("minimum_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), minimum_size);
    }
    
    /**
     * Get the value of the field {@code natural_size}
     * @return The value of the field {@code natural_size}
     */
    public int natural_size$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("natural_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code natural_size}
     * @param natural_size The new value of the field {@code natural_size}
     */
    public void natural_size$set(int natural_size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("natural_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), natural_size);
    }
    
    /**
     * Create a RequestedSize proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RequestedSize(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private RequestedSize struct;
        
         /**
         * A {@link RequestedSize.Build} object constructs a {@link RequestedSize} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = RequestedSize.allocate();
        }
        
         /**
         * Finish building the {@link RequestedSize} struct.
         * @return A new instance of {@code RequestedSize} with the fields 
         *         that were set in the Build object.
         */
        public RequestedSize construct() {
            return struct;
        }
        
        /**
         * A client pointer
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setData(java.lang.foreign.MemoryAddress data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
            return this;
        }
        
        /**
         * The minimum size needed for allocation in a given orientation
         * @param minimum_size The value for the {@code minimum_size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMinimumSize(int minimum_size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("minimum_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), minimum_size);
            return this;
        }
        
        /**
         * The natural size for allocation in a given orientation
         * @param natural_size The value for the {@code natural_size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNaturalSize(int natural_size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("natural_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), natural_size);
            return this;
        }
    }
}
