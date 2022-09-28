package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoLayoutLine} represents one of the lines resulting from laying
 * out a paragraph via {@code PangoLayout}.
 * <p>
 * {@code PangoLayoutLine} structures are obtained by calling
 * {@link Layout#getLine} and are only valid until the text,
 * attributes, or settings of the parent {@code PangoLayout} are modified.
 */
public class LayoutLine extends io.github.jwharm.javagi.ResourceBase {

    public LayoutLine(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public LayoutLine() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.PangoLayoutLine.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Computes the logical and ink extents of a layout line.
     * <p>
     * See {@link Font#getGlyphExtents} for details
     * about the interpretation of the rectangles.
     */
    public void getExtents(Rectangle inkRect, Rectangle logicalRect) {
        gtk_h.pango_layout_line_get_extents(handle(), inkRect.handle(), logicalRect.handle());
    }
    
    /**
     * Computes the height of the line, as the maximum of the heights
     * of fonts used in this line.
     * <p>
     * Note that the actual baseline-to-baseline distance between lines
     * of text is influenced by other factors, such as
     * {@link Layout#setSpacing} and
     * {@link Layout#setLineSpacing}.
     */
    public void getHeight(PointerInteger height) {
        gtk_h.pango_layout_line_get_height(handle(), height.handle());
    }
    
    /**
     * Returns the length of the line, in bytes.
     */
    public int getLength() {
        var RESULT = gtk_h.pango_layout_line_get_length(handle());
        return RESULT;
    }
    
    /**
     * Computes the logical and ink extents of {@code layout_line} in device units.
     * <p>
     * This function just calls {@link LayoutLine#getExtents} followed by
     * two {@code logical_rect
     * such that the rounded rectangles fully contain the unrounded one (that is,
     * passes them as first argument to [func@extents_to_pixels}).
     */
    public void getPixelExtents(Rectangle inkRect, Rectangle logicalRect) {
        gtk_h.pango_layout_line_get_pixel_extents(handle(), inkRect.handle(), logicalRect.handle());
    }
    
    /**
     * Returns the resolved direction of the line.
     */
    public Direction getResolvedDirection() {
        var RESULT = gtk_h.pango_layout_line_get_resolved_direction(handle());
        return new Direction(RESULT);
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
     * Gets a list of visual ranges corresponding to a given logical range.
     * <p>
     * This list is not necessarily minimal - there may be consecutive
     * ranges which are adjacent. The ranges will be sorted from left to
     * right. The ranges are with respect to the left edge of the entire
     * layout, not with respect to the line.
     */
    public void getXRanges(int startIndex, int endIndex, int[] ranges, PointerInteger nRanges) {
        gtk_h.pango_layout_line_get_x_ranges(handle(), startIndex, endIndex, new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, ranges)).handle(), nRanges.handle());
    }
    
    /**
     * Converts an index within a line to a X position.
     */
    public void indexToX(int index, boolean trailing, PointerInteger xPos) {
        gtk_h.pango_layout_line_index_to_x(handle(), index, trailing ? 1 : 0, xPos.handle());
    }
    
    /**
     * Returns whether this is the first line of the paragraph.
     */
    public boolean isParagraphStart() {
        var RESULT = gtk_h.pango_layout_line_is_paragraph_start(handle());
        return (RESULT != 0);
    }
    
    /**
     * Increase the reference count of a {@code PangoLayoutLine} by one.
     */
    public LayoutLine ref() {
        var RESULT = gtk_h.pango_layout_line_ref(handle());
        return new LayoutLine(References.get(RESULT, true));
    }
    
    /**
     * Decrease the reference count of a {@code PangoLayoutLine} by one.
     * <p>
     * If the result is zero, the line and all associated memory
     * will be freed.
     */
    public void unref() {
        gtk_h.pango_layout_line_unref(handle());
    }
    
    /**
     * Converts from x offset to the byte index of the corresponding character
     * within the text of the layout.
     * <p>
     * If {@code x_pos} is outside the line, {@code index_} and {@code trailing} will point to the very
     * first or very last position in the line. This determination is based on the
     * resolved direction of the paragraph; for example, if the resolved direction
     * is right-to-left, then an X position to the right of the line (after it)
     * results in 0 being stored in {@code index_} and {@code trailing}. An X position to the
     * left of the line results in {@code index_} pointing to the (logical) last grapheme
     * in the line and {@code trailing} being set to the number of characters in that
     * grapheme. The reverse is true for a left-to-right line.
     */
    public boolean xToIndex(int xPos, PointerInteger index, PointerInteger trailing) {
        var RESULT = gtk_h.pango_layout_line_x_to_index(handle(), xPos, index.handle(), trailing.handle());
        return (RESULT != 0);
    }
    
}
