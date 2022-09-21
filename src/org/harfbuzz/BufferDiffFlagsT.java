package org.harfbuzz;

/**
 * Flags from comparing two {@link buffer_t}'s.
 * <p>
 * Buffer with different {@link buffer_content_type_t} cannot be meaningfully
 * compared in any further detail.
 * <p>
 * For buffers with differing length, the per-glyph comparison is not
 * attempted, though we do still scan reference buffer for dotted circle and
 * {@code .notdef} glyphs.
 * <p>
 * If the buffers have the same length, we compare them glyph-by-glyph and
 * report which aspect(s) of the glyph info/position are different.
 */
public class BufferDiffFlagsT {

    /**
     * equal buffers.
     */
    public static final int EQUAL = 0;
    
    /**
     * buffers with different
     *     {@link buffer_content_type_t}.
     */
    public static final int CONTENT_TYPE_MISMATCH = 1;
    
    /**
     * buffers with differing length.
     */
    public static final int LENGTH_MISMATCH = 2;
    
    /**
     * {@code .notdef} glyph is present in the
     *     reference buffer.
     */
    public static final int NOTDEF_PRESENT = 4;
    
    /**
     * dotted circle glyph is present
     *     in the reference buffer.
     */
    public static final int DOTTED_CIRCLE_PRESENT = 8;
    
    /**
     * difference in {@link glyph_info_t}.codepoint
     */
    public static final int CODEPOINT_MISMATCH = 16;
    
    /**
     * difference in {@link glyph_info_t}.cluster
     */
    public static final int CLUSTER_MISMATCH = 32;
    
    /**
     * difference in {@link glyph_flags_t}.
     */
    public static final int GLYPH_FLAGS_MISMATCH = 64;
    
    /**
     * difference in {@link glyph_position_t}.
     */
    public static final int POSITION_MISMATCH = 128;
    
}
