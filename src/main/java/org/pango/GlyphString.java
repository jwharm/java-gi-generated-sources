package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoGlyphString} is used to store strings of glyphs with geometry
 * and visual attribute information.
 * <p>
 * The storage for the glyph information is owned by the structure
 * which simplifies memory management.
 */
public class GlyphString extends io.github.jwharm.javagi.ResourceBase {

    public GlyphString(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle pango_glyph_string_new = Interop.downcallHandle(
        "pango_glyph_string_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) pango_glyph_string_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create a new {@code PangoGlyphString}.
     */
    public GlyphString() {
        super(constructNew());
    }
    
    private static final MethodHandle pango_glyph_string_copy = Interop.downcallHandle(
        "pango_glyph_string_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copy a glyph string and associated storage.
     */
    public @Nullable GlyphString copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_glyph_string_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new GlyphString(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_glyph_string_extents = Interop.downcallHandle(
        "pango_glyph_string_extents",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compute the logical and ink extents of a glyph string.
     * <p>
     * See the documentation for {@link Font#getGlyphExtents} for details
     * about the interpretation of the rectangles.
     * <p>
     * Examples of logical (red) and ink (green) rects:
     * <p>
     * <img src="./doc-files/rects2.png" alt="](rects1.png) ![">
     */
    public @NotNull void extents(@NotNull Font font, @NotNull Out<Rectangle> inkRect, @NotNull Out<Rectangle> logicalRect) {
        MemorySegment inkRectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment logicalRectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            pango_glyph_string_extents.invokeExact(handle(), font.handle(), (Addressable) inkRectPOINTER.address(), (Addressable) logicalRectPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        inkRect.set(new Rectangle(Refcounted.get(inkRectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        logicalRect.set(new Rectangle(Refcounted.get(logicalRectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle pango_glyph_string_extents_range = Interop.downcallHandle(
        "pango_glyph_string_extents_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the extents of a sub-portion of a glyph string.
     * <p>
     * The extents are relative to the start of the glyph string range
     * (the origin of their coordinate system is at the start of the range,
     * not at the start of the entire glyph string).
     */
    public @NotNull void extentsRange(@NotNull int start, @NotNull int end, @NotNull Font font, @NotNull Out<Rectangle> inkRect, @NotNull Out<Rectangle> logicalRect) {
        MemorySegment inkRectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment logicalRectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            pango_glyph_string_extents_range.invokeExact(handle(), start, end, font.handle(), (Addressable) inkRectPOINTER.address(), (Addressable) logicalRectPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        inkRect.set(new Rectangle(Refcounted.get(inkRectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        logicalRect.set(new Rectangle(Refcounted.get(logicalRectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle pango_glyph_string_free = Interop.downcallHandle(
        "pango_glyph_string_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Free a glyph string and associated storage.
     */
    public @NotNull void free() {
        try {
            pango_glyph_string_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_glyph_string_get_logical_widths = Interop.downcallHandle(
        "pango_glyph_string_get_logical_widths",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Given a {@code PangoGlyphString} and corresponding text, determine the width
     * corresponding to each character.
     * <p>
     * When multiple characters compose a single cluster, the width of the
     * entire cluster is divided equally among the characters.
     * <p>
     * See also {@link GlyphItem#getLogicalWidths}.
     */
    public @NotNull void getLogicalWidths(@NotNull java.lang.String text, @NotNull int length, @NotNull int embeddingLevel, @NotNull int[] logicalWidths) {
        try {
            pango_glyph_string_get_logical_widths.invokeExact(handle(), Interop.allocateNativeString(text), length, embeddingLevel, Interop.allocateNativeArray(logicalWidths));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_glyph_string_get_width = Interop.downcallHandle(
        "pango_glyph_string_get_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the logical width of the glyph string.
     * <p>
     * This can also be computed using {@link GlyphString#extents}.
     * However, since this only computes the width, it's much faster. This
     * is in fact only a convenience function that computes the sum of
     * {@code geometry}.width for each glyph in the {@code glyphs}.
     */
    public int getWidth() {
        int RESULT;
        try {
            RESULT = (int) pango_glyph_string_get_width.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle pango_glyph_string_index_to_x = Interop.downcallHandle(
        "pango_glyph_string_index_to_x",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts from character position to x position.
     * <p>
     * The X position is measured from the left edge of the run.
     * Character positions are obtained using font metrics for ligatures
     * where available, and computed by dividing up each cluster
     * into equal portions, otherwise.
     * <p>
     * &lt;picture&gt;
     *   &lt;source srcset="glyphstring-positions-dark.png" media="(prefers-color-scheme: dark)"&gt;
     *   &lt;img alt="Glyph positions" src="glyphstring-positions-light.png"&gt;
     * &lt;/picture&gt;
     */
    public @NotNull void indexToX(@NotNull java.lang.String text, @NotNull int length, @NotNull Analysis analysis, @NotNull int index, @NotNull boolean trailing, @NotNull Out<Integer> xPos) {
        MemorySegment xPosPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            pango_glyph_string_index_to_x.invokeExact(handle(), Interop.allocateNativeString(text), length, analysis.handle(), index, trailing ? 1 : 0, (Addressable) xPosPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        xPos.set(xPosPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    private static final MethodHandle pango_glyph_string_index_to_x_full = Interop.downcallHandle(
        "pango_glyph_string_index_to_x_full",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts from character position to x position.
     * <p>
     * This variant of {@link GlyphString#indexToX} additionally
     * accepts a {@code PangoLogAttr} array. The grapheme boundary information
     * in it can be used to disambiguate positioning inside some complex
     * clusters.
     */
    public @NotNull void indexToXFull(@NotNull java.lang.String text, @NotNull int length, @NotNull Analysis analysis, @Nullable LogAttr attrs, @NotNull int index, @NotNull boolean trailing, @NotNull Out<Integer> xPos) {
        MemorySegment xPosPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            pango_glyph_string_index_to_x_full.invokeExact(handle(), Interop.allocateNativeString(text), length, analysis.handle(), attrs.handle(), index, trailing ? 1 : 0, (Addressable) xPosPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        xPos.set(xPosPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    private static final MethodHandle pango_glyph_string_set_size = Interop.downcallHandle(
        "pango_glyph_string_set_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Resize a glyph string to the given length.
     */
    public @NotNull void setSize(@NotNull int newLen) {
        try {
            pango_glyph_string_set_size.invokeExact(handle(), newLen);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_glyph_string_x_to_index = Interop.downcallHandle(
        "pango_glyph_string_x_to_index",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convert from x offset to character position.
     * <p>
     * Character positions are computed by dividing up each cluster into
     * equal portions. In scripts where positioning within a cluster is
     * not allowed (such as Thai), the returned value may not be a valid
     * cursor position; the caller must combine the result with the logical
     * attributes for the text to compute the valid cursor position.
     */
    public @NotNull void xToIndex(@NotNull java.lang.String text, @NotNull int length, @NotNull Analysis analysis, @NotNull int xPos, @NotNull Out<Integer> index, @NotNull Out<Integer> trailing) {
        MemorySegment indexPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment trailingPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            pango_glyph_string_x_to_index.invokeExact(handle(), Interop.allocateNativeString(text), length, analysis.handle(), xPos, (Addressable) indexPOINTER.address(), (Addressable) trailingPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        index.set(indexPOINTER.get(ValueLayout.JAVA_INT, 0));
        trailing.set(trailingPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
}
