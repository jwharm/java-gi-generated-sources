package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Pairs of glyph and color index.
 * @version 2.1.0
 */
public class OtColorLayerT extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_ot_color_layer_t";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("glyph"),
        ValueLayout.JAVA_INT.withName("color_index")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static OtColorLayerT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        OtColorLayerT newInstance = new OtColorLayerT(Refcounted.get(segment.address()));
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
    
    @ApiStatus.Internal
    public OtColorLayerT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
