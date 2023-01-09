package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link GlyphPositionT} is the structure that holds the positions of the
 * glyph in both horizontal and vertical directions. All positions in
 * {@link GlyphPositionT} are relative to the current point.
 */
public class GlyphPositionT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_glyph_position_t";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("x_advance"),
            Interop.valueLayout.C_INT.withName("y_advance"),
            Interop.valueLayout.C_INT.withName("x_offset"),
            Interop.valueLayout.C_INT.withName("y_offset"),
            org.harfbuzz.VarIntT.getMemoryLayout().withName("var")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GlyphPositionT}
     * @return A new, uninitialized @{link GlyphPositionT}
     */
    public static GlyphPositionT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        GlyphPositionT newInstance = new GlyphPositionT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code x_advance}
     * @return The value of the field {@code x_advance}
     */
    public org.harfbuzz.PositionT getXAdvance() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("x_advance"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.harfbuzz.PositionT(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code x_advance}
     * @param xAdvance The new value of the field {@code x_advance}
     */
    public void setXAdvance(org.harfbuzz.PositionT xAdvance) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("x_advance"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (xAdvance == null ? MemoryAddress.NULL : xAdvance.getValue().intValue()));
        }
    }
    
    /**
     * Get the value of the field {@code y_advance}
     * @return The value of the field {@code y_advance}
     */
    public org.harfbuzz.PositionT getYAdvance() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y_advance"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.harfbuzz.PositionT(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code y_advance}
     * @param yAdvance The new value of the field {@code y_advance}
     */
    public void setYAdvance(org.harfbuzz.PositionT yAdvance) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y_advance"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (yAdvance == null ? MemoryAddress.NULL : yAdvance.getValue().intValue()));
        }
    }
    
    /**
     * Get the value of the field {@code x_offset}
     * @return The value of the field {@code x_offset}
     */
    public org.harfbuzz.PositionT getXOffset() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("x_offset"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.harfbuzz.PositionT(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code x_offset}
     * @param xOffset The new value of the field {@code x_offset}
     */
    public void setXOffset(org.harfbuzz.PositionT xOffset) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("x_offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (xOffset == null ? MemoryAddress.NULL : xOffset.getValue().intValue()));
        }
    }
    
    /**
     * Get the value of the field {@code y_offset}
     * @return The value of the field {@code y_offset}
     */
    public org.harfbuzz.PositionT getYOffset() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y_offset"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.harfbuzz.PositionT(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code y_offset}
     * @param yOffset The new value of the field {@code y_offset}
     */
    public void setYOffset(org.harfbuzz.PositionT yOffset) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y_offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (yOffset == null ? MemoryAddress.NULL : yOffset.getValue().intValue()));
        }
    }
    
    /**
     * Create a GlyphPositionT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GlyphPositionT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GlyphPositionT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GlyphPositionT(input);
    
    /**
     * A {@link GlyphPositionT.Builder} object constructs a {@link GlyphPositionT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GlyphPositionT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GlyphPositionT struct;
        
        private Builder() {
            struct = GlyphPositionT.allocate();
        }
        
        /**
         * Finish building the {@link GlyphPositionT} struct.
         * @return A new instance of {@code GlyphPositionT} with the fields 
         *         that were set in the Builder object.
         */
        public GlyphPositionT build() {
            return struct;
        }
        
        /**
         * how much the line advances after drawing this glyph when setting
         *             text in horizontal direction.
         * @param xAdvance The value for the {@code xAdvance} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setXAdvance(org.harfbuzz.PositionT xAdvance) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("x_advance"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (xAdvance == null ? MemoryAddress.NULL : xAdvance.getValue().intValue()));
                return this;
            }
        }
        
        /**
         * how much the line advances after drawing this glyph when setting
         *             text in vertical direction.
         * @param yAdvance The value for the {@code yAdvance} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setYAdvance(org.harfbuzz.PositionT yAdvance) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("y_advance"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (yAdvance == null ? MemoryAddress.NULL : yAdvance.getValue().intValue()));
                return this;
            }
        }
        
        /**
         * how much the glyph moves on the X-axis before drawing it, this
         *            should not affect how much the line advances.
         * @param xOffset The value for the {@code xOffset} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setXOffset(org.harfbuzz.PositionT xOffset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("x_offset"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (xOffset == null ? MemoryAddress.NULL : xOffset.getValue().intValue()));
                return this;
            }
        }
        
        /**
         * how much the glyph moves on the Y-axis before drawing it, this
         *            should not affect how much the line advances.
         * @param yOffset The value for the {@code yOffset} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setYOffset(org.harfbuzz.PositionT yOffset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("y_offset"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (yOffset == null ? MemoryAddress.NULL : yOffset.getValue().intValue()));
                return this;
            }
        }
        
        public Builder setVar(org.harfbuzz.VarIntT var) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("var"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (var == null ? MemoryAddress.NULL : var.handle()));
                return this;
            }
        }
    }
}
