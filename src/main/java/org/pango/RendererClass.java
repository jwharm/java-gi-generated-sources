package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Class structure for {@code PangoRenderer}.
 * <p>
 * The following vfuncs take user space coordinates in Pango units
 * and have default implementations:
 * <ul>
 * <li>draw_glyphs
 * <li>draw_rectangle
 * <li>draw_error_underline
 * <li>draw_shape
 * <li>draw_glyph_item
 * </ul>
 * <p>
 * The default draw_shape implementation draws nothing.
 * <p>
 * The following vfuncs take device space coordinates as doubles
 * and must be implemented:
 * <ul>
 * <li>draw_trapezoid
 * <li>draw_glyph
 * </ul>
 * @version 1.8
 */
public class RendererClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoRendererClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("draw_glyphs"),
        Interop.valueLayout.ADDRESS.withName("draw_rectangle"),
        Interop.valueLayout.ADDRESS.withName("draw_error_underline"),
        Interop.valueLayout.ADDRESS.withName("draw_shape"),
        Interop.valueLayout.ADDRESS.withName("draw_trapezoid"),
        Interop.valueLayout.ADDRESS.withName("draw_glyph"),
        Interop.valueLayout.ADDRESS.withName("part_changed"),
        Interop.valueLayout.ADDRESS.withName("begin"),
        Interop.valueLayout.ADDRESS.withName("end"),
        Interop.valueLayout.ADDRESS.withName("prepare_run"),
        Interop.valueLayout.ADDRESS.withName("draw_glyph_item"),
        Interop.valueLayout.ADDRESS.withName("_pango_reserved2"),
        Interop.valueLayout.ADDRESS.withName("_pango_reserved3"),
        Interop.valueLayout.ADDRESS.withName("_pango_reserved4")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static RendererClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RendererClass newInstance = new RendererClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public RendererClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
