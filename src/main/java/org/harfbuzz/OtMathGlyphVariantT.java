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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("glyph"),
            Interop.valueLayout.C_INT.withName("advance")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link OtMathGlyphVariantT}
     * @return A new, uninitialized @{link OtMathGlyphVariantT}
     */
    public static OtMathGlyphVariantT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        OtMathGlyphVariantT newInstance = new OtMathGlyphVariantT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code glyph}
     * @return The value of the field {@code glyph}
     */
    public org.harfbuzz.CodepointT getGlyph() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("glyph"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.harfbuzz.CodepointT(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code glyph}
     * @param glyph The new value of the field {@code glyph}
     */
    public void setGlyph(org.harfbuzz.CodepointT glyph) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("glyph"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (glyph == null ? MemoryAddress.NULL : glyph.getValue().intValue()));
        }
    }
    
    /**
     * Get the value of the field {@code advance}
     * @return The value of the field {@code advance}
     */
    public org.harfbuzz.PositionT getAdvance() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("advance"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.harfbuzz.PositionT(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code advance}
     * @param advance The new value of the field {@code advance}
     */
    public void setAdvance(org.harfbuzz.PositionT advance) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("advance"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (advance == null ? MemoryAddress.NULL : advance.getValue().intValue()));
        }
    }
    
    /**
     * Create a OtMathGlyphVariantT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected OtMathGlyphVariantT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, OtMathGlyphVariantT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new OtMathGlyphVariantT(input);
    
    /**
     * A {@link OtMathGlyphVariantT.Builder} object constructs a {@link OtMathGlyphVariantT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link OtMathGlyphVariantT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final OtMathGlyphVariantT struct;
        
        private Builder() {
            struct = OtMathGlyphVariantT.allocate();
        }
        
        /**
         * Finish building the {@link OtMathGlyphVariantT} struct.
         * @return A new instance of {@code OtMathGlyphVariantT} with the fields 
         *         that were set in the Builder object.
         */
        public OtMathGlyphVariantT build() {
            return struct;
        }
        
        /**
         * The glyph index of the variant
         * @param glyph The value for the {@code glyph} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGlyph(org.harfbuzz.CodepointT glyph) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("glyph"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (glyph == null ? MemoryAddress.NULL : glyph.getValue().intValue()));
                return this;
            }
        }
        
        /**
         * The advance width of the variant
         * @param advance The value for the {@code advance} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAdvance(org.harfbuzz.PositionT advance) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("advance"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (advance == null ? MemoryAddress.NULL : advance.getValue().intValue()));
                return this;
            }
        }
    }
}
