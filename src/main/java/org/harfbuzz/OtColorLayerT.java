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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("glyph"),
        Interop.valueLayout.C_INT.withName("color_index")
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
     * Allocate a new {@link OtColorLayerT}
     * @return A new, uninitialized @{link OtColorLayerT}
     */
    public static OtColorLayerT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        OtColorLayerT newInstance = new OtColorLayerT(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code color_index}
     * @return The value of the field {@code color_index}
     */
    public int color_index$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("color_index"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code color_index}
     * @param color_index The new value of the field {@code color_index}
     */
    public void color_index$set(int color_index) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("color_index"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), color_index);
    }
    
    /**
     * Create a OtColorLayerT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public OtColorLayerT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private OtColorLayerT struct;
        
         /**
         * A {@link OtColorLayerT.Build} object constructs a {@link OtColorLayerT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = OtColorLayerT.allocate();
        }
        
         /**
         * Finish building the {@link OtColorLayerT} struct.
         * @return A new instance of {@code OtColorLayerT} with the fields 
         *         that were set in the Build object.
         */
        public OtColorLayerT construct() {
            return struct;
        }
        
        /**
         * the glyph ID of the layer
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
         * the palette color index of the layer
         * @param color_index The value for the {@code color_index} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setColorIndex(int color_index) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("color_index"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), color_index);
            return this;
        }
    }
}
