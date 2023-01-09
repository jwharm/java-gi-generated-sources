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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("data"),
            Interop.valueLayout.C_INT.withName("minimum_size"),
            Interop.valueLayout.C_INT.withName("natural_size")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RequestedSize}
     * @return A new, uninitialized @{link RequestedSize}
     */
    public static RequestedSize allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        RequestedSize newInstance = new RequestedSize(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public java.lang.foreign.MemoryAddress getData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void setData(java.lang.foreign.MemoryAddress data) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
        }
    }
    
    /**
     * Get the value of the field {@code minimum_size}
     * @return The value of the field {@code minimum_size}
     */
    public int getMinimumSize() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("minimum_size"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code minimum_size}
     * @param minimumSize The new value of the field {@code minimum_size}
     */
    public void setMinimumSize(int minimumSize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("minimum_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), minimumSize);
        }
    }
    
    /**
     * Get the value of the field {@code natural_size}
     * @return The value of the field {@code natural_size}
     */
    public int getNaturalSize() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("natural_size"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code natural_size}
     * @param naturalSize The new value of the field {@code natural_size}
     */
    public void setNaturalSize(int naturalSize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("natural_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), naturalSize);
        }
    }
    
    /**
     * Create a RequestedSize proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RequestedSize(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RequestedSize> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RequestedSize(input);
    
    /**
     * A {@link RequestedSize.Builder} object constructs a {@link RequestedSize} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RequestedSize.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RequestedSize struct;
        
        private Builder() {
            struct = RequestedSize.allocate();
        }
        
        /**
         * Finish building the {@link RequestedSize} struct.
         * @return A new instance of {@code RequestedSize} with the fields 
         *         that were set in the Builder object.
         */
        public RequestedSize build() {
            return struct;
        }
        
        /**
         * A client pointer
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setData(java.lang.foreign.MemoryAddress data) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
                return this;
            }
        }
        
        /**
         * The minimum size needed for allocation in a given orientation
         * @param minimumSize The value for the {@code minimumSize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMinimumSize(int minimumSize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("minimum_size"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), minimumSize);
                return this;
            }
        }
        
        /**
         * The natural size for allocation in a given orientation
         * @param naturalSize The value for the {@code naturalSize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNaturalSize(int naturalSize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("natural_size"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), naturalSize);
                return this;
            }
        }
    }
}
