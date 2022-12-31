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
public class GlyphString extends Struct {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoGlyphString";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("num_glyphs"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("glyphs"),
            Interop.valueLayout.ADDRESS.withName("log_clusters"),
            Interop.valueLayout.C_INT.withName("space")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GlyphString}
     * @return A new, uninitialized @{link GlyphString}
     */
    public static GlyphString allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GlyphString newInstance = new GlyphString(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code num_glyphs}
     * @return The value of the field {@code num_glyphs}
     */
    public int getNumGlyphs() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("num_glyphs"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code num_glyphs}
     * @param numGlyphs The new value of the field {@code num_glyphs}
     */
    public void setNumGlyphs(int numGlyphs) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("num_glyphs"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), numGlyphs);
    }
    
    /**
     * Get the value of the field {@code glyphs}
     * @return The value of the field {@code glyphs}
     */
    public PointerProxy<org.pango.GlyphInfo> getGlyphs() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("glyphs"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.pango.GlyphInfo>(RESULT, org.pango.GlyphInfo.fromAddress);
    }
    
    /**
     * Change the value of the field {@code glyphs}
     * @param glyphs The new value of the field {@code glyphs}
     */
    public void setGlyphs(org.pango.GlyphInfo[] glyphs) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("glyphs"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (glyphs == null ? MemoryAddress.NULL : Interop.allocateNativeArray(glyphs, org.pango.GlyphInfo.getMemoryLayout(), false)));
    }
    
    /**
     * Get the value of the field {@code log_clusters}
     * @return The value of the field {@code log_clusters}
     */
    public PointerInteger getLogClusters() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("log_clusters"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerInteger(RESULT);
    }
    
    /**
     * Change the value of the field {@code log_clusters}
     * @param logClusters The new value of the field {@code log_clusters}
     */
    public void setLogClusters(PointerInteger logClusters) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("log_clusters"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (logClusters == null ? MemoryAddress.NULL : logClusters.handle()));
    }
    
    /**
     * Create a GlyphString proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GlyphString(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GlyphString> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GlyphString(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_glyph_string_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@code PangoGlyphString}.
     */
    public GlyphString() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Copy a glyph string and associated storage.
     * @return the newly allocated {@code PangoGlyphString}
     */
    public @Nullable org.pango.GlyphString copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_glyph_string_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.GlyphString.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Compute the logical and ink extents of a glyph string.
     * <p>
     * See the documentation for {@link Font#getGlyphExtents} for details
     * about the interpretation of the rectangles.
     * <p>
     * Examples of logical (red) and ink (green) rects:
     * <p>
     * <img src="./doc-files/rects1.png" alt=""> <img src="./doc-files/rects2.png" alt="">
     * @param font a {@code PangoFont}
     * @param inkRect rectangle used to store the extents of the glyph string as drawn
     * @param logicalRect rectangle used to store the logical extents of the glyph string
     */
    public void extents(org.pango.Font font, @Nullable org.pango.Rectangle inkRect, @Nullable org.pango.Rectangle logicalRect) {
        try {
            DowncallHandles.pango_glyph_string_extents.invokeExact(
                    handle(),
                    font.handle(),
                    (Addressable) (inkRect == null ? MemoryAddress.NULL : inkRect.handle()),
                    (Addressable) (logicalRect == null ? MemoryAddress.NULL : logicalRect.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the extents of a sub-portion of a glyph string.
     * <p>
     * The extents are relative to the start of the glyph string range
     * (the origin of their coordinate system is at the start of the range,
     * not at the start of the entire glyph string).
     * @param start start index
     * @param end end index (the range is the set of bytes with
     *   indices such that start &lt;= index &lt; end)
     * @param font a {@code PangoFont}
     * @param inkRect rectangle used to
     *   store the extents of the glyph string range as drawn
     * @param logicalRect rectangle used to
     *   store the logical extents of the glyph string range
     */
    public void extentsRange(int start, int end, org.pango.Font font, @Nullable org.pango.Rectangle inkRect, @Nullable org.pango.Rectangle logicalRect) {
        try {
            DowncallHandles.pango_glyph_string_extents_range.invokeExact(
                    handle(),
                    start,
                    end,
                    font.handle(),
                    (Addressable) (inkRect == null ? MemoryAddress.NULL : inkRect.handle()),
                    (Addressable) (logicalRect == null ? MemoryAddress.NULL : logicalRect.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Free a glyph string and associated storage.
     */
    public void free() {
        try {
            DowncallHandles.pango_glyph_string_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Given a {@code PangoGlyphString} and corresponding text, determine the width
     * corresponding to each character.
     * <p>
     * When multiple characters compose a single cluster, the width of the
     * entire cluster is divided equally among the characters.
     * <p>
     * See also {@link GlyphItem#getLogicalWidths}.
     * @param text the text corresponding to the glyphs
     * @param length the length of {@code text}, in bytes
     * @param embeddingLevel the embedding level of the string
     * @param logicalWidths an array whose length is the number of
     *   characters in text (equal to {@code g_utf8_strlen (text, length)} unless
     *   text has {@code NUL} bytes) to be filled in with the resulting character widths.
     */
    public void getLogicalWidths(java.lang.String text, int length, int embeddingLevel, int[] logicalWidths) {
        try {
            DowncallHandles.pango_glyph_string_get_logical_widths.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(text, null),
                    length,
                    embeddingLevel,
                    Interop.allocateNativeArray(logicalWidths, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the logical width of the glyph string.
     * <p>
     * This can also be computed using {@link GlyphString#extents}.
     * However, since this only computes the width, it's much faster. This
     * is in fact only a convenience function that computes the sum of
     * {@code geometry}.width for each glyph in the {@code glyphs}.
     * @return the logical width of the glyph string.
     */
    public int getWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_glyph_string_get_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
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
     * @param text the text for the run
     * @param length the number of bytes (not characters) in {@code text}.
     * @param analysis the analysis information return from {@link Pango#itemize}
     * @param index the byte index within {@code text}
     * @param trailing whether we should compute the result for the beginning ({@code false})
     *   or end ({@code true}) of the character.
     * @param xPos location to store result
     */
    public void indexToX(java.lang.String text, int length, org.pango.Analysis analysis, int index, boolean trailing, Out<Integer> xPos) {
        MemorySegment xPosPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.pango_glyph_string_index_to_x.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(text, null),
                    length,
                    analysis.handle(),
                    index,
                    Marshal.booleanToInteger.marshal(trailing, null).intValue(),
                    (Addressable) xPosPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        xPos.set(xPosPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Converts from character position to x position.
     * <p>
     * This variant of {@link GlyphString#indexToX} additionally
     * accepts a {@code PangoLogAttr} array. The grapheme boundary information
     * in it can be used to disambiguate positioning inside some complex
     * clusters.
     * @param text the text for the run
     * @param length the number of bytes (not characters) in {@code text}.
     * @param analysis the analysis information return from {@link Pango#itemize}
     * @param attrs {@code PangoLogAttr} array for {@code text}
     * @param index the byte index within {@code text}
     * @param trailing whether we should compute the result for the beginning ({@code false})
     *   or end ({@code true}) of the character.
     * @param xPos location to store result
     */
    public void indexToXFull(java.lang.String text, int length, org.pango.Analysis analysis, @Nullable org.pango.LogAttr attrs, int index, boolean trailing, Out<Integer> xPos) {
        MemorySegment xPosPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.pango_glyph_string_index_to_x_full.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(text, null),
                    length,
                    analysis.handle(),
                    (Addressable) (attrs == null ? MemoryAddress.NULL : attrs.handle()),
                    index,
                    Marshal.booleanToInteger.marshal(trailing, null).intValue(),
                    (Addressable) xPosPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        xPos.set(xPosPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Resize a glyph string to the given length.
     * @param newLen the new length of the string
     */
    public void setSize(int newLen) {
        try {
            DowncallHandles.pango_glyph_string_set_size.invokeExact(
                    handle(),
                    newLen);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convert from x offset to character position.
     * <p>
     * Character positions are computed by dividing up each cluster into
     * equal portions. In scripts where positioning within a cluster is
     * not allowed (such as Thai), the returned value may not be a valid
     * cursor position; the caller must combine the result with the logical
     * attributes for the text to compute the valid cursor position.
     * @param text the text for the run
     * @param length the number of bytes (not characters) in text.
     * @param analysis the analysis information return from {@link Pango#itemize}
     * @param xPos the x offset (in Pango units)
     * @param index location to store calculated byte index within {@code text}
     * @param trailing location to store a boolean indicating whether the
     *   user clicked on the leading or trailing edge of the character
     */
    public void xToIndex(java.lang.String text, int length, org.pango.Analysis analysis, int xPos, Out<Integer> index, Out<Integer> trailing) {
        MemorySegment indexPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment trailingPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.pango_glyph_string_x_to_index.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(text, null),
                    length,
                    analysis.handle(),
                    xPos,
                    (Addressable) indexPOINTER.address(),
                    (Addressable) trailingPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        index.set(indexPOINTER.get(Interop.valueLayout.C_INT, 0));
        trailing.set(trailingPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_glyph_string_new = Interop.downcallHandle(
            "pango_glyph_string_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_glyph_string_copy = Interop.downcallHandle(
            "pango_glyph_string_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_glyph_string_extents = Interop.downcallHandle(
            "pango_glyph_string_extents",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_glyph_string_extents_range = Interop.downcallHandle(
            "pango_glyph_string_extents_range",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_glyph_string_free = Interop.downcallHandle(
            "pango_glyph_string_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_glyph_string_get_logical_widths = Interop.downcallHandle(
            "pango_glyph_string_get_logical_widths",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_glyph_string_get_width = Interop.downcallHandle(
            "pango_glyph_string_get_width",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_glyph_string_index_to_x = Interop.downcallHandle(
            "pango_glyph_string_index_to_x",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_glyph_string_index_to_x_full = Interop.downcallHandle(
            "pango_glyph_string_index_to_x_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle pango_glyph_string_set_size = Interop.downcallHandle(
            "pango_glyph_string_set_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle pango_glyph_string_x_to_index = Interop.downcallHandle(
            "pango_glyph_string_x_to_index",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link GlyphString.Builder} object constructs a {@link GlyphString} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GlyphString.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GlyphString struct;
        
        private Builder() {
            struct = GlyphString.allocate();
        }
        
         /**
         * Finish building the {@link GlyphString} struct.
         * @return A new instance of {@code GlyphString} with the fields 
         *         that were set in the Builder object.
         */
        public GlyphString build() {
            return struct;
        }
        
        /**
         * number of glyphs in this glyph string
         * @param numGlyphs The value for the {@code numGlyphs} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNumGlyphs(int numGlyphs) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("num_glyphs"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), numGlyphs);
            return this;
        }
        
        /**
         * array of glyph information
         * @param glyphs The value for the {@code glyphs} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGlyphs(org.pango.GlyphInfo[] glyphs) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("glyphs"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (glyphs == null ? MemoryAddress.NULL : Interop.allocateNativeArray(glyphs, org.pango.GlyphInfo.getMemoryLayout(), false)));
            return this;
        }
        
        /**
         * logical cluster info, indexed by the byte index
         *   within the text corresponding to the glyph string
         * @param logClusters The value for the {@code logClusters} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLogClusters(PointerInteger logClusters) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("log_clusters"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (logClusters == null ? MemoryAddress.NULL : logClusters.handle()));
            return this;
        }
        
        public Builder setSpace(int space) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("space"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), space);
            return this;
        }
    }
}
