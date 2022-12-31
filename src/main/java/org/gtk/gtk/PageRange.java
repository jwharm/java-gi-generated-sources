package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A range of pages to print.
 * <p>
 * See also {@link PrintSettings#setPageRanges}.
 */
public class PageRange extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPageRange";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("start"),
            Interop.valueLayout.C_INT.withName("end")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PageRange}
     * @return A new, uninitialized @{link PageRange}
     */
    public static PageRange allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PageRange newInstance = new PageRange(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code start}
     * @return The value of the field {@code start}
     */
    public int getStart() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code start}
     * @param start The new value of the field {@code start}
     */
    public void setStart(int start) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), start);
    }
    
    /**
     * Get the value of the field {@code end}
     * @return The value of the field {@code end}
     */
    public int getEnd() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code end}
     * @param end The new value of the field {@code end}
     */
    public void setEnd(int end) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), end);
    }
    
    /**
     * Create a PageRange proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PageRange(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PageRange> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PageRange(input, ownership);
    
    /**
     * A {@link PageRange.Builder} object constructs a {@link PageRange} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PageRange.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PageRange struct;
        
        private Builder() {
            struct = PageRange.allocate();
        }
        
         /**
         * Finish building the {@link PageRange} struct.
         * @return A new instance of {@code PageRange} with the fields 
         *         that were set in the Builder object.
         */
        public PageRange build() {
            return struct;
        }
        
        /**
         * start of page range.
         * @param start The value for the {@code start} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStart(int start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), start);
            return this;
        }
        
        /**
         * end of page range.
         * @param end The value for the {@code end} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEnd(int end) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), end);
            return this;
        }
    }
}
