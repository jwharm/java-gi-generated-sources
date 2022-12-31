package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type to hold information for a "part" component of a math-variant glyph.
 * Large variants for stretchable math glyphs (such as parentheses) can be constructed
 * on the fly from parts.
 * @version 1.3.3
 */
public class OtMathGlyphPartT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_ot_math_glyph_part_t";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("glyph"),
            Interop.valueLayout.C_INT.withName("start_connector_length"),
            Interop.valueLayout.C_INT.withName("end_connector_length"),
            Interop.valueLayout.C_INT.withName("full_advance"),
            Interop.valueLayout.C_INT.withName("flags")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link OtMathGlyphPartT}
     * @return A new, uninitialized @{link OtMathGlyphPartT}
     */
    public static OtMathGlyphPartT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        OtMathGlyphPartT newInstance = new OtMathGlyphPartT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code glyph}
     * @return The value of the field {@code glyph}
     */
    public org.harfbuzz.CodepointT getGlyph() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("glyph"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.CodepointT(RESULT);
    }
    
    /**
     * Change the value of the field {@code glyph}
     * @param glyph The new value of the field {@code glyph}
     */
    public void setGlyph(org.harfbuzz.CodepointT glyph) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("glyph"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (glyph == null ? MemoryAddress.NULL : glyph.getValue().intValue()));
    }
    
    /**
     * Get the value of the field {@code start_connector_length}
     * @return The value of the field {@code start_connector_length}
     */
    public org.harfbuzz.PositionT getStartConnectorLength() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_connector_length"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Change the value of the field {@code start_connector_length}
     * @param startConnectorLength The new value of the field {@code start_connector_length}
     */
    public void setStartConnectorLength(org.harfbuzz.PositionT startConnectorLength) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_connector_length"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startConnectorLength == null ? MemoryAddress.NULL : startConnectorLength.getValue().intValue()));
    }
    
    /**
     * Get the value of the field {@code end_connector_length}
     * @return The value of the field {@code end_connector_length}
     */
    public org.harfbuzz.PositionT getEndConnectorLength() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_connector_length"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Change the value of the field {@code end_connector_length}
     * @param endConnectorLength The new value of the field {@code end_connector_length}
     */
    public void setEndConnectorLength(org.harfbuzz.PositionT endConnectorLength) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_connector_length"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (endConnectorLength == null ? MemoryAddress.NULL : endConnectorLength.getValue().intValue()));
    }
    
    /**
     * Get the value of the field {@code full_advance}
     * @return The value of the field {@code full_advance}
     */
    public org.harfbuzz.PositionT getFullAdvance() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("full_advance"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Change the value of the field {@code full_advance}
     * @param fullAdvance The new value of the field {@code full_advance}
     */
    public void setFullAdvance(org.harfbuzz.PositionT fullAdvance) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("full_advance"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fullAdvance == null ? MemoryAddress.NULL : fullAdvance.getValue().intValue()));
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.harfbuzz.OtMathGlyphPartFlagsT getFlags() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.OtMathGlyphPartFlagsT(RESULT);
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void setFlags(org.harfbuzz.OtMathGlyphPartFlagsT flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
    }
    
    /**
     * Create a OtMathGlyphPartT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected OtMathGlyphPartT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, OtMathGlyphPartT> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new OtMathGlyphPartT(input, ownership);
    
    /**
     * A {@link OtMathGlyphPartT.Builder} object constructs a {@link OtMathGlyphPartT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link OtMathGlyphPartT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final OtMathGlyphPartT struct;
        
        private Builder() {
            struct = OtMathGlyphPartT.allocate();
        }
        
         /**
         * Finish building the {@link OtMathGlyphPartT} struct.
         * @return A new instance of {@code OtMathGlyphPartT} with the fields 
         *         that were set in the Builder object.
         */
        public OtMathGlyphPartT build() {
            return struct;
        }
        
        /**
         * The glyph index of the variant part
         * @param glyph The value for the {@code glyph} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGlyph(org.harfbuzz.CodepointT glyph) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("glyph"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (glyph == null ? MemoryAddress.NULL : glyph.getValue().intValue()));
            return this;
        }
        
        /**
         * The length of the connector on the starting side of the variant part
         * @param startConnectorLength The value for the {@code startConnectorLength} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStartConnectorLength(org.harfbuzz.PositionT startConnectorLength) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_connector_length"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startConnectorLength == null ? MemoryAddress.NULL : startConnectorLength.getValue().intValue()));
            return this;
        }
        
        /**
         * The length of the connector on the ending side of the variant part
         * @param endConnectorLength The value for the {@code endConnectorLength} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEndConnectorLength(org.harfbuzz.PositionT endConnectorLength) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_connector_length"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (endConnectorLength == null ? MemoryAddress.NULL : endConnectorLength.getValue().intValue()));
            return this;
        }
        
        /**
         * The total advance of the part
         * @param fullAdvance The value for the {@code fullAdvance} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFullAdvance(org.harfbuzz.PositionT fullAdvance) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("full_advance"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fullAdvance == null ? MemoryAddress.NULL : fullAdvance.getValue().intValue()));
            return this;
        }
        
        /**
         * {@link OtMathGlyphPartFlagsT} flags for the part
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(org.harfbuzz.OtMathGlyphPartFlagsT flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
            return this;
        }
    }
}
