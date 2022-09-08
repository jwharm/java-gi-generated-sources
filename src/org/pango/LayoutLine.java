package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoLayoutLine` represents one of the lines resulting from laying
 * out a paragraph via `PangoLayout`.
 * 
 * `PangoLayoutLine` structures are obtained by calling
 * [method@Pango.Layout.get_line] and are only valid until the text,
 * attributes, or settings of the parent `PangoLayout` are modified.
 */
public class LayoutLine extends io.github.jwharm.javagi.interop.ResourceBase {

    public LayoutLine(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Computes the logical and ink extents of a layout line.
     * 
     * See [method@Pango.Font.get_glyph_extents] for details
     * about the interpretation of the rectangles.
     */
    public void getExtents(Rectangle inkRect, Rectangle logicalRect) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_line_get_extents(HANDLE(), inkRect.HANDLE(), logicalRect.HANDLE());
    }
    
    /**
     * Returns the length of the line, in bytes.
     */
    public int getLength() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_line_get_length(HANDLE());
        return RESULT;
    }
    
    /**
     * Computes the logical and ink extents of @layout_line in device units.
     * 
     * This function just calls [method@Pango.LayoutLine.get_extents] followed by
     * two [func@extents_to_pixels] calls, rounding @ink_rect and @logical_rect
     * such that the rounded rectangles fully contain the unrounded one (that is,
     * passes them as first argument to [func@extents_to_pixels]).
     */
    public void getPixelExtents(Rectangle inkRect, Rectangle logicalRect) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_line_get_pixel_extents(HANDLE(), inkRect.HANDLE(), logicalRect.HANDLE());
    }
    
    /**
     * Returns the resolved direction of the line.
     */
    public Direction getResolvedDirection() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_line_get_resolved_direction(HANDLE());
        return Direction.fromValue(RESULT);
    }
    
    /**
     * Returns the start index of the line, as byte index
     * into the text of the layout.
     */
    public int getStartIndex() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_line_get_start_index(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns whether this is the first line of the paragraph.
     */
    public boolean isParagraphStart() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_line_is_paragraph_start(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Increase the reference count of a `PangoLayoutLine` by one.
     */
    public LayoutLine ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_line_ref(HANDLE());
        return new LayoutLine(References.get(RESULT, true));
    }
    
    /**
     * Decrease the reference count of a `PangoLayoutLine` by one.
     * 
     * If the result is zero, the line and all associated memory
     * will be freed.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_line_unref(HANDLE());
    }
    
}
