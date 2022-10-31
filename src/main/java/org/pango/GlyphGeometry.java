package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoGlyphGeometry} structure contains width and positioning
 * information for a single glyph.
 * <p>
 * Note that {@code width} is not guaranteed to be the same as the glyph
 * extents. Kerning and other positioning applied during shaping will
 * affect both the {@code width} and the {@code x_offset} for the glyphs in the
 * glyph string that results from shaping.
 * <p>
 * The information in this struct is intended for rendering the glyphs,
 * as follows:
 * <p>
 * 1. Assume the current point is (x, y)
 * 2. Render the current glyph at (x + x_offset, y + y_offset),
 * 3. Advance the current point to (x + width, y)
 * 4. Render the next glyph
 */
public class GlyphGeometry extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoGlyphGeometry";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("x_offset"),
        ValueLayout.JAVA_INT.withName("y_offset")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static GlyphGeometry allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GlyphGeometry newInstance = new GlyphGeometry(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code width}
     * @return The value of the field {@code width}
     */
    public org.pango.GlyphUnit width$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("width"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.pango.GlyphUnit(RESULT);
    }
    
    /**
     * Change the value of the field {@code width}
     * @param width The new value of the field {@code width}
     */
    public void width$set(org.pango.GlyphUnit width) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("width"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), width.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code x_offset}
     * @return The value of the field {@code x_offset}
     */
    public org.pango.GlyphUnit x_offset$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x_offset"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.pango.GlyphUnit(RESULT);
    }
    
    /**
     * Change the value of the field {@code x_offset}
     * @param x_offset The new value of the field {@code x_offset}
     */
    public void x_offset$set(org.pango.GlyphUnit x_offset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x_offset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), x_offset.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code y_offset}
     * @return The value of the field {@code y_offset}
     */
    public org.pango.GlyphUnit y_offset$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y_offset"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.pango.GlyphUnit(RESULT);
    }
    
    /**
     * Change the value of the field {@code y_offset}
     * @param y_offset The new value of the field {@code y_offset}
     */
    public void y_offset$set(org.pango.GlyphUnit y_offset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y_offset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), y_offset.getValue().intValue());
    }
    
    @ApiStatus.Internal
    public GlyphGeometry(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
