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
public class GlyphPositionT extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_glyph_position_t";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("x_advance"),
        ValueLayout.JAVA_INT.withName("y_advance"),
        ValueLayout.JAVA_INT.withName("x_offset"),
        ValueLayout.JAVA_INT.withName("y_offset"),
        org.harfbuzz.VarIntT.getMemoryLayout().withName("var")
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
    
    public static GlyphPositionT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GlyphPositionT newInstance = new GlyphPositionT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code x_advance}
     * @return The value of the field {@code x_advance}
     */
    public org.harfbuzz.PositionT x_advance$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x_advance"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Change the value of the field {@code x_advance}
     * @param x_advance The new value of the field {@code x_advance}
     */
    public void x_advance$set(org.harfbuzz.PositionT x_advance) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x_advance"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), x_advance.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code y_advance}
     * @return The value of the field {@code y_advance}
     */
    public org.harfbuzz.PositionT y_advance$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y_advance"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Change the value of the field {@code y_advance}
     * @param y_advance The new value of the field {@code y_advance}
     */
    public void y_advance$set(org.harfbuzz.PositionT y_advance) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y_advance"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), y_advance.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code x_offset}
     * @return The value of the field {@code x_offset}
     */
    public org.harfbuzz.PositionT x_offset$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x_offset"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Change the value of the field {@code x_offset}
     * @param x_offset The new value of the field {@code x_offset}
     */
    public void x_offset$set(org.harfbuzz.PositionT x_offset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x_offset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), x_offset.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code y_offset}
     * @return The value of the field {@code y_offset}
     */
    public org.harfbuzz.PositionT y_offset$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y_offset"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Change the value of the field {@code y_offset}
     * @param y_offset The new value of the field {@code y_offset}
     */
    public void y_offset$set(org.harfbuzz.PositionT y_offset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y_offset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), y_offset.getValue().intValue());
    }
    
    /**
     * Create a GlyphPositionT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GlyphPositionT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
