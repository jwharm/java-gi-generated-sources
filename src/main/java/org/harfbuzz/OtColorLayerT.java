package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Pairs of glyph and color index.
 * <p>
 * A color index of 0xFFFF does not refer to a palette
 * color, but indicates that the foreground color should
 * be used.
 * @version 2.1.0
 */
public class OtColorLayerT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_ot_color_layer_t";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("glyph"),
            Interop.valueLayout.C_INT.withName("color_index")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link OtColorLayerT}
     * @return A new, uninitialized @{link OtColorLayerT}
     */
    public static OtColorLayerT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        OtColorLayerT newInstance = new OtColorLayerT(segment.address());
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
     * Get the value of the field {@code color_index}
     * @return The value of the field {@code color_index}
     */
    public int getColorIndex() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("color_index"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code color_index}
     * @param colorIndex The new value of the field {@code color_index}
     */
    public void setColorIndex(int colorIndex) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("color_index"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), colorIndex);
        }
    }
    
    /**
     * Create a OtColorLayerT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected OtColorLayerT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, OtColorLayerT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new OtColorLayerT(input);
    
    /**
     * A {@link OtColorLayerT.Builder} object constructs a {@link OtColorLayerT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link OtColorLayerT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final OtColorLayerT struct;
        
        private Builder() {
            struct = OtColorLayerT.allocate();
        }
        
        /**
         * Finish building the {@link OtColorLayerT} struct.
         * @return A new instance of {@code OtColorLayerT} with the fields 
         *         that were set in the Builder object.
         */
        public OtColorLayerT build() {
            return struct;
        }
        
        /**
         * the glyph ID of the layer
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
         * the palette color index of the layer
         * @param colorIndex The value for the {@code colorIndex} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setColorIndex(int colorIndex) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("color_index"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), colorIndex);
                return this;
            }
        }
    }
}
