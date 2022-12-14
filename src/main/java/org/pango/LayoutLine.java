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
public class LayoutLine extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoLayoutLine";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("layout"),
            Interop.valueLayout.C_INT.withName("start_index"),
            Interop.valueLayout.C_INT.withName("length"),
            Interop.valueLayout.ADDRESS.withName("runs"),
            Interop.valueLayout.C_INT.withName("is_paragraph_start"),
            Interop.valueLayout.C_INT.withName("resolved_dir")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link LayoutLine}
     * @return A new, uninitialized @{link LayoutLine}
     */
    public static LayoutLine allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        LayoutLine newInstance = new LayoutLine(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code layout}
     * @return The value of the field {@code layout}
     */
    public org.pango.Layout getLayout() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("layout"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return (org.pango.Layout) Interop.register(RESULT, org.pango.Layout.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code layout}
     * @param layout The new value of the field {@code layout}
     */
    public void setLayout(org.pango.Layout layout) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("layout"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (layout == null ? MemoryAddress.NULL : layout.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code start_index}
     * @return The value of the field {@code start_index}
     */
    public int getStartIndex_() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_index"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code start_index}
     * @param startIndex The new value of the field {@code start_index}
     */
    public void setStartIndex(int startIndex) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_index"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), startIndex);
        }
    }
    
    /**
     * Get the value of the field {@code length}
     * @return The value of the field {@code length}
     */
    public int getLength_() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("length"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code length}
     * @param length The new value of the field {@code length}
     */
    public void setLength(int length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("length"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), length);
        }
    }
    
    /**
     * Get the value of the field {@code runs}
     * @return The value of the field {@code runs}
     */
    public org.gtk.glib.SList getRuns() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("runs"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code runs}
     * @param runs The new value of the field {@code runs}
     */
    public void setRuns(org.gtk.glib.SList runs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("runs"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (runs == null ? MemoryAddress.NULL : runs.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code is_paragraph_start}
     * @return The value of the field {@code is_paragraph_start}
     */
    public int getIsParagraphStart() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_paragraph_start"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code is_paragraph_start}
     * @param isParagraphStart The new value of the field {@code is_paragraph_start}
     */
    public void setIsParagraphStart(int isParagraphStart) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_paragraph_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), isParagraphStart);
        }
    }
    
    /**
     * Get the value of the field {@code resolved_dir}
     * @return The value of the field {@code resolved_dir}
     */
    public int getResolvedDir() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("resolved_dir"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code resolved_dir}
     * @param resolvedDir The new value of the field {@code resolved_dir}
     */
    public void setResolvedDir(int resolvedDir) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("resolved_dir"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), resolvedDir);
        }
    }
    
    /**
     * Create a LayoutLine proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected LayoutLine(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, LayoutLine> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new LayoutLine(input);
    
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
    public void getExtents(@Nullable org.pango.Rectangle inkRect, @Nullable org.pango.Rectangle logicalRect) {
        try {
            DowncallHandles.pango_layout_line_get_extents.invokeExact(
                    handle(),
                    (Addressable) (inkRect == null ? MemoryAddress.NULL : inkRect.handle()),
                    (Addressable) (logicalRect == null ? MemoryAddress.NULL : logicalRect.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment heightPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.pango_layout_line_get_height.invokeExact(
                        handle(),
                        (Addressable) (height == null ? MemoryAddress.NULL : (Addressable) heightPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (height != null) height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
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
    public void getPixelExtents(@Nullable org.pango.Rectangle inkRect, @Nullable org.pango.Rectangle logicalRect) {
        try {
            DowncallHandles.pango_layout_line_get_pixel_extents.invokeExact(
                    handle(),
                    (Addressable) (inkRect == null ? MemoryAddress.NULL : inkRect.handle()),
                    (Addressable) (logicalRect == null ? MemoryAddress.NULL : logicalRect.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the resolved direction of the line.
     * @return the resolved direction of the line
     */
    public org.pango.Direction getResolvedDirection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_line_get_resolved_direction.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Direction.of(RESULT);
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment rangesPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment nRangesPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.pango_layout_line_get_x_ranges.invokeExact(
                        handle(),
                        startIndex,
                        endIndex,
                        (Addressable) rangesPOINTER.address(),
                        (Addressable) nRangesPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    nRanges.set(nRangesPOINTER.get(Interop.valueLayout.C_INT, 0));
            ranges.set(MemorySegment.ofAddress(rangesPOINTER.get(Interop.valueLayout.ADDRESS, 0), nRanges.get().intValue() * Interop.valueLayout.C_INT.byteSize(), SCOPE).toArray(Interop.valueLayout.C_INT));
        }
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment xPosPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.pango_layout_line_index_to_x.invokeExact(
                        handle(),
                        index,
                        Marshal.booleanToInteger.marshal(trailing, null).intValue(),
                        (Addressable) xPosPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    xPos.set(xPosPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Increase the reference count of a {@code PangoLayoutLine} by one.
     * @return the line passed in.
     */
    public @Nullable org.pango.LayoutLine ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_layout_line_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.pango.LayoutLine.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment indexPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment trailingPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.pango_layout_line_x_to_index.invokeExact(
                        handle(),
                        xPos,
                        (Addressable) indexPOINTER.address(),
                        (Addressable) trailingPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    index.set(indexPOINTER.get(Interop.valueLayout.C_INT, 0));
                    trailing.set(trailingPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_layout_line_get_extents = Interop.downcallHandle(
                "pango_layout_line_get_extents",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_line_get_height = Interop.downcallHandle(
                "pango_layout_line_get_height",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_line_get_length = Interop.downcallHandle(
                "pango_layout_line_get_length",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_line_get_pixel_extents = Interop.downcallHandle(
                "pango_layout_line_get_pixel_extents",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_line_get_resolved_direction = Interop.downcallHandle(
                "pango_layout_line_get_resolved_direction",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_line_get_start_index = Interop.downcallHandle(
                "pango_layout_line_get_start_index",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_line_get_x_ranges = Interop.downcallHandle(
                "pango_layout_line_get_x_ranges",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_line_index_to_x = Interop.downcallHandle(
                "pango_layout_line_index_to_x",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_line_is_paragraph_start = Interop.downcallHandle(
                "pango_layout_line_is_paragraph_start",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_line_ref = Interop.downcallHandle(
                "pango_layout_line_ref",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_line_unref = Interop.downcallHandle(
                "pango_layout_line_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_line_x_to_index = Interop.downcallHandle(
                "pango_layout_line_x_to_index",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link LayoutLine.Builder} object constructs a {@link LayoutLine} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link LayoutLine.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final LayoutLine struct;
        
        private Builder() {
            struct = LayoutLine.allocate();
        }
        
        /**
         * Finish building the {@link LayoutLine} struct.
         * @return A new instance of {@code LayoutLine} with the fields 
         *         that were set in the Builder object.
         */
        public LayoutLine build() {
            return struct;
        }
        
        /**
         * the layout this line belongs to, might be {@code null}
         * @param layout The value for the {@code layout} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLayout(org.pango.Layout layout) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("layout"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (layout == null ? MemoryAddress.NULL : layout.handle()));
                return this;
            }
        }
        
        /**
         * start of line as byte index into layout-&gt;text
         * @param startIndex The value for the {@code startIndex} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStartIndex(int startIndex) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("start_index"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), startIndex);
                return this;
            }
        }
        
        /**
         * length of line in bytes
         * @param length The value for the {@code length} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLength(int length) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("length"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), length);
                return this;
            }
        }
        
        /**
         * list of runs in the
         *   line, from left to right
         * @param runs The value for the {@code runs} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRuns(org.gtk.glib.SList runs) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("runs"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (runs == null ? MemoryAddress.NULL : runs.handle()));
                return this;
            }
        }
        
        /**
         * {@code TRUE} if this is the first line of the paragraph
         * @param isParagraphStart The value for the {@code isParagraphStart} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsParagraphStart(int isParagraphStart) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_paragraph_start"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), isParagraphStart);
                return this;
            }
        }
        
        /**
         * {@code Resolved} PangoDirection of line
         * @param resolvedDir The value for the {@code resolvedDir} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setResolvedDir(int resolvedDir) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("resolved_dir"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), resolvedDir);
                return this;
            }
        }
    }
}
