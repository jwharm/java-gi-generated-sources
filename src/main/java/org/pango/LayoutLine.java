package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoLayoutLine} represents one of the lines resulting from laying
 * out a paragraph via {@code PangoLayout}.
 * <p>
 * {@code PangoLayoutLine} structures are obtained by calling
 * {@link Layout#getLine} and are only valid until the text,
 * attributes, or settings of the parent {@code PangoLayout} are modified.
 */
public class LayoutLine extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.pango.Layout.getMemoryLayout().withName("layout"),
        ValueLayout.JAVA_INT.withName("start_index"),
        ValueLayout.JAVA_INT.withName("length"),
        org.gtk.glib.SList.getMemoryLayout().withName("runs"),
        ValueLayout.JAVA_INT.withName("is_paragraph_start"),
        ValueLayout.JAVA_INT.withName("resolved_dir")
    ).withName("PangoLayoutLine");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public LayoutLine(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Computes the logical and ink extents of a layout line.
     * <p>
     * See {@link Font#getGlyphExtents} for details
     * about the interpretation of the rectangles.
     * @param inkRect rectangle used to store the extents of
     *   the glyph string as drawn
     * @param logicalRect rectangle used to store the logical
     *   extents of the glyph string
     */
    public void getExtents(@NotNull Out<org.pango.Rectangle> inkRect, @NotNull Out<org.pango.Rectangle> logicalRect) {
        java.util.Objects.requireNonNull(inkRect, "Parameter 'inkRect' must not be null");
        java.util.Objects.requireNonNull(logicalRect, "Parameter 'logicalRect' must not be null");
        MemorySegment inkRectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment logicalRectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.pango_layout_line_get_extents.invokeExact(handle(), (Addressable) inkRectPOINTER.address(), (Addressable) logicalRectPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        inkRect.set(new org.pango.Rectangle(Refcounted.get(inkRectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        logicalRect.set(new org.pango.Rectangle(Refcounted.get(logicalRectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    /**
     * Computes the height of the line, as the maximum of the heights
     * of fonts used in this line.
     * <p>
     * Note that the actual baseline-to-baseline distance between lines
     * of text is influenced by other factors, such as
     * {@link Layout#setSpacing} and
     * {@link Layout#setLineSpacing}.
     * @param height return location for the line height
     */
    public void getHeight(Out<Integer> height) {
        java.util.Objects.requireNonNull(height, "Parameter 'height' must not be null");
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.pango_layout_line_get_height.invokeExact(handle(), (Addressable) heightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        height.set(heightPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    /**
     * Returns the length of the line, in bytes.
     * @return the length of the line
     */
    public int getLength() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_line_get_length.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Computes the logical and ink extents of {@code layout_line} in device units.
     * <p>
     * This function just calls {@link LayoutLine#getExtents} followed by
     * two {@link Pango#extentsToPixels} calls, rounding {@code ink_rect} and {@code logical_rect}
     * such that the rounded rectangles fully contain the unrounded one (that is,
     * passes them as first argument to {@link Pango#extentsToPixels}).
     * @param inkRect rectangle used to store the extents of
     *   the glyph string as drawn
     * @param logicalRect rectangle used to store the logical
     *   extents of the glyph string
     */
    public void getPixelExtents(@NotNull Out<org.pango.Rectangle> inkRect, @NotNull Out<org.pango.Rectangle> logicalRect) {
        java.util.Objects.requireNonNull(inkRect, "Parameter 'inkRect' must not be null");
        java.util.Objects.requireNonNull(logicalRect, "Parameter 'logicalRect' must not be null");
        MemorySegment inkRectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment logicalRectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.pango_layout_line_get_pixel_extents.invokeExact(handle(), (Addressable) inkRectPOINTER.address(), (Addressable) logicalRectPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        inkRect.set(new org.pango.Rectangle(Refcounted.get(inkRectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        logicalRect.set(new org.pango.Rectangle(Refcounted.get(logicalRectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    /**
     * Returns the resolved direction of the line.
     * @return the resolved direction of the line
     */
    public @NotNull org.pango.Direction getResolvedDirection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_line_get_resolved_direction.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Direction(RESULT);
    }
    
    /**
     * Returns the start index of the line, as byte index
     * into the text of the layout.
     * @return the start index of the line
     */
    public int getStartIndex() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_line_get_start_index.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets a list of visual ranges corresponding to a given logical range.
     * <p>
     * This list is not necessarily minimal - there may be consecutive
     * ranges which are adjacent. The ranges will be sorted from left to
     * right. The ranges are with respect to the left edge of the entire
     * layout, not with respect to the line.
     * @param startIndex Start byte index of the logical range. If this value
     *   is less than the start index for the line, then the first range
     *   will extend all the way to the leading edge of the layout. Otherwise,
     *   it will start at the leading edge of the first character.
     * @param endIndex Ending byte index of the logical range. If this value is
     *   greater than the end index for the line, then the last range will
     *   extend all the way to the trailing edge of the layout. Otherwise,
     *   it will end at the trailing edge of the last character.
     * @param ranges location to
     *   store a pointer to an array of ranges. The array will be of length
     *   {@code 2*n_ranges}, with each range starting at {@code (*ranges)[2*n]} and of
     *   width {@code (*ranges)[2*n + 1] - (*ranges)[2*n]}. This array must be freed
     *   with g_free(). The coordinates are relative to the layout and are in
     *   Pango units.
     * @param nRanges The number of ranges stored in {@code ranges}
     */
    public void getXRanges(int startIndex, int endIndex, Out<int[]> ranges, Out<Integer> nRanges) {
        java.util.Objects.requireNonNull(ranges, "Parameter 'ranges' must not be null");
        java.util.Objects.requireNonNull(nRanges, "Parameter 'nRanges' must not be null");
        MemorySegment rangesPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment nRangesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.pango_layout_line_get_x_ranges.invokeExact(handle(), startIndex, endIndex, (Addressable) rangesPOINTER.address(), (Addressable) nRangesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nRanges.set(nRangesPOINTER.get(ValueLayout.JAVA_INT, 0));
        ranges.set(MemorySegment.ofAddress(rangesPOINTER.get(ValueLayout.ADDRESS, 0), nRanges.get().intValue() * ValueLayout.JAVA_INT.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_INT));
    }
    
    /**
     * Converts an index within a line to a X position.
     * @param index byte offset of a grapheme within the layout
     * @param trailing an integer indicating the edge of the grapheme to retrieve
     *   the position of. If &gt; 0, the trailing edge of the grapheme,
     *   if 0, the leading of the grapheme
     * @param xPos location to store the x_offset (in Pango units)
     */
    public void indexToX(int index, boolean trailing, Out<Integer> xPos) {
        java.util.Objects.requireNonNull(xPos, "Parameter 'xPos' must not be null");
        MemorySegment xPosPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.pango_layout_line_index_to_x.invokeExact(handle(), index, trailing ? 1 : 0, (Addressable) xPosPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        xPos.set(xPosPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    /**
     * Returns whether this is the first line of the paragraph.
     * @return {@code true} if this is the first line
     */
    public boolean isParagraphStart() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_line_is_paragraph_start.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Increase the reference count of a {@code PangoLayoutLine} by one.
     * @return the line passed in.
     */
    public @NotNull org.pango.LayoutLine ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_layout_line_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.LayoutLine(Refcounted.get(RESULT, true));
    }
    
    /**
     * Decrease the reference count of a {@code PangoLayoutLine} by one.
     * <p>
     * If the result is zero, the line and all associated memory
     * will be freed.
     */
    public void unref() {
        try {
            DowncallHandles.pango_layout_line_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param xPos the X offset (in Pango units) from the left edge of the line.
     * @param index location to store calculated byte index for the grapheme
     *   in which the user clicked
     * @param trailing location to store an integer indicating where in the
     *   grapheme the user clicked. It will either be zero, or the number of
     *   characters in the grapheme. 0 represents the leading edge of the grapheme.
     * @return {@code false} if {@code x_pos} was outside the line, {@code true} if inside
     */
    public boolean xToIndex(int xPos, Out<Integer> index, Out<Integer> trailing) {
        java.util.Objects.requireNonNull(index, "Parameter 'index' must not be null");
        java.util.Objects.requireNonNull(trailing, "Parameter 'trailing' must not be null");
        MemorySegment indexPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment trailingPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_line_x_to_index.invokeExact(handle(), xPos, (Addressable) indexPOINTER.address(), (Addressable) trailingPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        index.set(indexPOINTER.get(ValueLayout.JAVA_INT, 0));
        trailing.set(trailingPOINTER.get(ValueLayout.JAVA_INT, 0));
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_layout_line_get_extents = Interop.downcallHandle(
            "pango_layout_line_get_extents",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_layout_line_get_height = Interop.downcallHandle(
            "pango_layout_line_get_height",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_layout_line_get_length = Interop.downcallHandle(
            "pango_layout_line_get_length",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_layout_line_get_pixel_extents = Interop.downcallHandle(
            "pango_layout_line_get_pixel_extents",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_layout_line_get_resolved_direction = Interop.downcallHandle(
            "pango_layout_line_get_resolved_direction",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_layout_line_get_start_index = Interop.downcallHandle(
            "pango_layout_line_get_start_index",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_layout_line_get_x_ranges = Interop.downcallHandle(
            "pango_layout_line_get_x_ranges",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_layout_line_index_to_x = Interop.downcallHandle(
            "pango_layout_line_index_to_x",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_layout_line_is_paragraph_start = Interop.downcallHandle(
            "pango_layout_line_is_paragraph_start",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_layout_line_ref = Interop.downcallHandle(
            "pango_layout_line_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_layout_line_unref = Interop.downcallHandle(
            "pango_layout_line_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle pango_layout_line_x_to_index = Interop.downcallHandle(
            "pango_layout_line_x_to_index",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
