package org.pango;

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

    public LayoutLine(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle pango_layout_line_get_extents = Interop.downcallHandle(
        "pango_layout_line_get_extents",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the logical and ink extents of a layout line.
     * <p>
     * See {@link Font#getGlyphExtents} for details
     * about the interpretation of the rectangles.
     */
    public void getExtents(Rectangle inkRect, Rectangle logicalRect) {
        try {
            pango_layout_line_get_extents.invokeExact(handle(), inkRect.handle(), logicalRect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_line_get_height = Interop.downcallHandle(
        "pango_layout_line_get_height",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            pango_layout_line_get_height.invokeExact(handle(), height.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_line_get_length = Interop.downcallHandle(
        "pango_layout_line_get_length",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the length of the line, in bytes.
     */
    public int getLength() {
        try {
            var RESULT = (int) pango_layout_line_get_length.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_line_get_pixel_extents = Interop.downcallHandle(
        "pango_layout_line_get_pixel_extents",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the logical and ink extents of {@code layout_line} in device units.
     * <p>
     * This function just calls {@link LayoutLine#getExtents} followed by
     * two {@code logical_rect
     * such that the rounded rectangles fully contain the unrounded one (that is,
     * passes them as first argument to [func@extents_to_pixels}).
     */
    public void getPixelExtents(Rectangle inkRect, Rectangle logicalRect) {
        try {
            pango_layout_line_get_pixel_extents.invokeExact(handle(), inkRect.handle(), logicalRect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_line_get_resolved_direction = Interop.downcallHandle(
        "pango_layout_line_get_resolved_direction",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the resolved direction of the line.
     */
    public Direction getResolvedDirection() {
        try {
            var RESULT = (int) pango_layout_line_get_resolved_direction.invokeExact(handle());
            return new Direction(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_line_get_start_index = Interop.downcallHandle(
        "pango_layout_line_get_start_index",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the start index of the line, as byte index
     * into the text of the layout.
     */
    public int getStartIndex() {
        try {
            var RESULT = (int) pango_layout_line_get_start_index.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_line_get_x_ranges = Interop.downcallHandle(
        "pango_layout_line_get_x_ranges",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a list of visual ranges corresponding to a given logical range.
     * <p>
     * This list is not necessarily minimal - there may be consecutive
     * ranges which are adjacent. The ranges will be sorted from left to
     * right. The ranges are with respect to the left edge of the entire
     * layout, not with respect to the line.
     */
    public void getXRanges(int startIndex, int endIndex, int[] ranges, PointerInteger nRanges) {
        try {
            pango_layout_line_get_x_ranges.invokeExact(handle(), startIndex, endIndex, Interop.allocateNativeArray(ranges).handle(), nRanges.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_line_index_to_x = Interop.downcallHandle(
        "pango_layout_line_index_to_x",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts an index within a line to a X position.
     */
    public void indexToX(int index, boolean trailing, PointerInteger xPos) {
        try {
            pango_layout_line_index_to_x.invokeExact(handle(), index, trailing ? 1 : 0, xPos.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_line_is_paragraph_start = Interop.downcallHandle(
        "pango_layout_line_is_paragraph_start",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether this is the first line of the paragraph.
     */
    public boolean isParagraphStart() {
        try {
            var RESULT = (int) pango_layout_line_is_paragraph_start.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_line_ref = Interop.downcallHandle(
        "pango_layout_line_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increase the reference count of a {@code PangoLayoutLine} by one.
     */
    public LayoutLine ref() {
        try {
            var RESULT = (MemoryAddress) pango_layout_line_ref.invokeExact(handle());
            return new LayoutLine(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_line_unref = Interop.downcallHandle(
        "pango_layout_line_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decrease the reference count of a {@code PangoLayoutLine} by one.
     * <p>
     * If the result is zero, the line and all associated memory
     * will be freed.
     */
    public void unref() {
        try {
            pango_layout_line_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_line_x_to_index = Interop.downcallHandle(
        "pango_layout_line_x_to_index",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (int) pango_layout_line_x_to_index.invokeExact(handle(), xPos, index.handle(), trailing.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
