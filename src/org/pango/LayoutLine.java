package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>PangoLayoutLine</code> represents one of the lines resulting from laying
 * out a paragraph via <code>PangoLayout</code>.
 * <p><code>PangoLayoutLine</code> structures are obtained by calling
 * {@link org.pango.Layout#getLine} and are only valid until the text,
 * attributes, or settings of the parent <code>PangoLayout</code> are modified.
 */
public class LayoutLine extends io.github.jwharm.javagi.ResourceBase {

    public LayoutLine(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Computes the logical and ink extents of a layout line.
     * 
     * See {@link org.pango.Font#getGlyphExtents} for details
     * about the interpretation of the rectangles.
     */
    public void getExtents(Rectangle inkRect, Rectangle logicalRect) {
        gtk_h.pango_layout_line_get_extents(handle(), inkRect.handle(), logicalRect.handle());
    }
    
    /**
     * Returns the length of the line, in bytes.
     */
    public int getLength() {
        var RESULT = gtk_h.pango_layout_line_get_length(handle());
        return RESULT;
    }
    
    /**
     * Computes the logical and ink extents of @layout_line in device units.
     * 
     * This function just calls {@link org.pango.LayoutLine#getExtents} followed by
     * two {@link [func@extents_to_pixels]} calls, rounding @ink_rect and @logical_rect
     * such that the rounded rectangles fully contain the unrounded one (that is,
     * passes them as first argument to {@link [func@extents_to_pixels]}).
     */
    public void getPixelExtents(Rectangle inkRect, Rectangle logicalRect) {
        gtk_h.pango_layout_line_get_pixel_extents(handle(), inkRect.handle(), logicalRect.handle());
    }
    
    /**
     * Returns the resolved direction of the line.
     */
    public Direction getResolvedDirection() {
        var RESULT = gtk_h.pango_layout_line_get_resolved_direction(handle());
        return Direction.fromValue(RESULT);
    }
    
    /**
     * Returns the start index of the line, as byte index
     * into the text of the layout.
     */
    public int getStartIndex() {
        var RESULT = gtk_h.pango_layout_line_get_start_index(handle());
        return RESULT;
    }
    
    /**
     * Returns whether this is the first line of the paragraph.
     */
    public boolean isParagraphStart() {
        var RESULT = gtk_h.pango_layout_line_is_paragraph_start(handle());
        return (RESULT != 0);
    }
    
    /**
     * Increase the reference count of a <code>PangoLayoutLine</code> by one.
     */
    public LayoutLine ref() {
        var RESULT = gtk_h.pango_layout_line_ref(handle());
        return new LayoutLine(References.get(RESULT, true));
    }
    
    /**
     * Decrease the reference count of a <code>PangoLayoutLine</code> by one.
     * 
     * If the result is zero, the line and all associated memory
     * will be freed.
     */
    public void unref() {
        gtk_h.pango_layout_line_unref(handle());
    }
    
}
