package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type to hold math-variant information for a glyph.
 * @version 1.3.3
 */
public class OtMathGlyphVariantT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_ot_math_glyph_variant_t";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("glyph"),
        Interop.valueLayout.C_INT.withName("advance")
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
     * Allocate a new {@link OtMathGlyphVariantT}
     * @return A new, uninitialized @{link OtMathGlyphVariantT}
     */
    public static OtMathGlyphVariantT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        OtMathGlyphVariantT newInstance = new OtMathGlyphVariantT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code glyph}
     * @return The value of the field {@code glyph}
     */
    public org.harfbuzz.CodepointT glyph$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("glyph"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.CodepointT(RESULT);
    }
    
    /**
     * Change the value of the field {@code glyph}
     * @param glyph The new value of the field {@code glyph}
     */
    public void glyph$set(org.harfbuzz.CodepointT glyph) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("glyph"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), glyph.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code advance}
     * @return The value of the field {@code advance}
     */
    public org.harfbuzz.PositionT advance$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("advance"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Change the value of the field {@code advance}
     * @param advance The new value of the field {@code advance}
     */
    public void advance$set(org.harfbuzz.PositionT advance) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("advance"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), advance.getValue().intValue());
    }
    
    /**
     * Create a OtMathGlyphVariantT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public OtMathGlyphVariantT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private OtMathGlyphVariantT struct;
        
         /**
         * A {@link OtMathGlyphVariantT.Build} object constructs a {@link OtMathGlyphVariantT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = OtMathGlyphVariantT.allocate();
        }
        
         /**
         * Finish building the {@link OtMathGlyphVariantT} struct.
         * @return A new instance of {@code OtMathGlyphVariantT} with the fields 
         *         that were set in the Build object.
         */
        public OtMathGlyphVariantT construct() {
            return struct;
        }
        
        /**
         * The glyph index of the variant
         * @param glyph The value for the {@code glyph} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGlyph(org.harfbuzz.CodepointT glyph) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("glyph"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (glyph == null ? MemoryAddress.NULL : glyph.getValue().intValue()));
            return this;
        }
        
        /**
         * The advance width of the variant
         * @param advance The value for the {@code advance} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAdvance(org.harfbuzz.PositionT advance) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("advance"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (advance == null ? MemoryAddress.NULL : advance.getValue().intValue()));
            return this;
        }
    }
}
