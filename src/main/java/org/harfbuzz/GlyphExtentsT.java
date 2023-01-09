package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Glyph extent values, measured in font units.
 * <p>
 * Note that {@code height} is negative, in coordinate systems that grow up.
 */
public class GlyphExtentsT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_glyph_extents_t";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("x_bearing"),
            Interop.valueLayout.C_INT.withName("y_bearing"),
            Interop.valueLayout.C_INT.withName("width"),
            Interop.valueLayout.C_INT.withName("height")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GlyphExtentsT}
     * @return A new, uninitialized @{link GlyphExtentsT}
     */
    public static GlyphExtentsT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        GlyphExtentsT newInstance = new GlyphExtentsT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code x_bearing}
     * @return The value of the field {@code x_bearing}
     */
    public org.harfbuzz.PositionT getXBearing() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("x_bearing"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.harfbuzz.PositionT(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code x_bearing}
     * @param xBearing The new value of the field {@code x_bearing}
     */
    public void setXBearing(org.harfbuzz.PositionT xBearing) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("x_bearing"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (xBearing == null ? MemoryAddress.NULL : xBearing.getValue().intValue()));
        }
    }
    
    /**
     * Get the value of the field {@code y_bearing}
     * @return The value of the field {@code y_bearing}
     */
    public org.harfbuzz.PositionT getYBearing() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y_bearing"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.harfbuzz.PositionT(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code y_bearing}
     * @param yBearing The new value of the field {@code y_bearing}
     */
    public void setYBearing(org.harfbuzz.PositionT yBearing) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y_bearing"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (yBearing == null ? MemoryAddress.NULL : yBearing.getValue().intValue()));
        }
    }
    
    /**
     * Get the value of the field {@code width}
     * @return The value of the field {@code width}
     */
    public org.harfbuzz.PositionT getWidth() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("width"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.harfbuzz.PositionT(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code width}
     * @param width The new value of the field {@code width}
     */
    public void setWidth(org.harfbuzz.PositionT width) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("width"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (width == null ? MemoryAddress.NULL : width.getValue().intValue()));
        }
    }
    
    /**
     * Get the value of the field {@code height}
     * @return The value of the field {@code height}
     */
    public org.harfbuzz.PositionT getHeight() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("height"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.harfbuzz.PositionT(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code height}
     * @param height The new value of the field {@code height}
     */
    public void setHeight(org.harfbuzz.PositionT height) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("height"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (height == null ? MemoryAddress.NULL : height.getValue().intValue()));
        }
    }
    
    /**
     * Create a GlyphExtentsT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GlyphExtentsT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GlyphExtentsT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GlyphExtentsT(input);
    
    /**
     * A {@link GlyphExtentsT.Builder} object constructs a {@link GlyphExtentsT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GlyphExtentsT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GlyphExtentsT struct;
        
        private Builder() {
            struct = GlyphExtentsT.allocate();
        }
        
        /**
         * Finish building the {@link GlyphExtentsT} struct.
         * @return A new instance of {@code GlyphExtentsT} with the fields 
         *         that were set in the Builder object.
         */
        public GlyphExtentsT build() {
            return struct;
        }
        
        /**
         * Distance from the x-origin to the left extremum of the glyph.
         * @param xBearing The value for the {@code xBearing} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setXBearing(org.harfbuzz.PositionT xBearing) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("x_bearing"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (xBearing == null ? MemoryAddress.NULL : xBearing.getValue().intValue()));
                return this;
            }
        }
        
        /**
         * Distance from the top extremum of the glyph to the y-origin.
         * @param yBearing The value for the {@code yBearing} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setYBearing(org.harfbuzz.PositionT yBearing) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("y_bearing"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (yBearing == null ? MemoryAddress.NULL : yBearing.getValue().intValue()));
                return this;
            }
        }
        
        /**
         * Distance from the left extremum of the glyph to the right extremum.
         * @param width The value for the {@code width} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWidth(org.harfbuzz.PositionT width) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("width"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (width == null ? MemoryAddress.NULL : width.getValue().intValue()));
                return this;
            }
        }
        
        /**
         * Distance from the top extremum of the glyph to the bottom extremum.
         * @param height The value for the {@code height} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHeight(org.harfbuzz.PositionT height) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("height"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (height == null ? MemoryAddress.NULL : height.getValue().intValue()));
                return this;
            }
        }
    }
}
