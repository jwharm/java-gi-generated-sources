package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type to hold math kerning (cut-in) information for a glyph.
 * @version 3.4.0
 */
public class OtMathKernEntryT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_ot_math_kern_entry_t";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("max_correction_height"),
        Interop.valueLayout.C_INT.withName("kern_value")
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
     * Allocate a new {@link OtMathKernEntryT}
     * @return A new, uninitialized @{link OtMathKernEntryT}
     */
    public static OtMathKernEntryT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        OtMathKernEntryT newInstance = new OtMathKernEntryT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code max_correction_height}
     * @return The value of the field {@code max_correction_height}
     */
    public org.harfbuzz.PositionT max_correction_height$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_correction_height"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Change the value of the field {@code max_correction_height}
     * @param max_correction_height The new value of the field {@code max_correction_height}
     */
    public void max_correction_height$set(org.harfbuzz.PositionT max_correction_height) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max_correction_height"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), max_correction_height.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code kern_value}
     * @return The value of the field {@code kern_value}
     */
    public org.harfbuzz.PositionT kern_value$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("kern_value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Change the value of the field {@code kern_value}
     * @param kern_value The new value of the field {@code kern_value}
     */
    public void kern_value$set(org.harfbuzz.PositionT kern_value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("kern_value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), kern_value.getValue().intValue());
    }
    
    /**
     * Create a OtMathKernEntryT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public OtMathKernEntryT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private OtMathKernEntryT struct;
        
         /**
         * A {@link OtMathKernEntryT.Build} object constructs a {@link OtMathKernEntryT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = OtMathKernEntryT.allocate();
        }
        
         /**
         * Finish building the {@link OtMathKernEntryT} struct.
         * @return A new instance of {@code OtMathKernEntryT} with the fields 
         *         that were set in the Build object.
         */
        public OtMathKernEntryT construct() {
            return struct;
        }
        
        /**
         * The maximum height at which this entry should be used
         * @param max_correction_height The value for the {@code max_correction_height} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMaxCorrectionHeight(org.harfbuzz.PositionT max_correction_height) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("max_correction_height"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (max_correction_height == null ? MemoryAddress.NULL : max_correction_height.getValue().intValue()));
            return this;
        }
        
        /**
         * The kern value of the entry
         * @param kern_value The value for the {@code kern_value} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setKernValue(org.harfbuzz.PositionT kern_value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("kern_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (kern_value == null ? MemoryAddress.NULL : kern_value.getValue().intValue()));
            return this;
        }
    }
}
