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
    public static final BufferDiffFlagsT EQUAL = new BufferDiffFlagsT(0);
    
    /**
     * buffers with different
     *     {@link buffer_content_type_t}.
     */
    public static final BufferDiffFlagsT CONTENT_TYPE_MISMATCH = new BufferDiffFlagsT(1);
    
    /**
     * buffers with differing length.
     */
    public static final BufferDiffFlagsT LENGTH_MISMATCH = new BufferDiffFlagsT(2);
    
    /**
     * {@code .notdef} glyph is present in the
     *     reference buffer.
     */
    public static final BufferDiffFlagsT NOTDEF_PRESENT = new BufferDiffFlagsT(4);
    
    /**
     * dotted circle glyph is present
     *     in the reference buffer.
     */
    public static final BufferDiffFlagsT DOTTED_CIRCLE_PRESENT = new BufferDiffFlagsT(8);
    
    /**
     * difference in {@link glyph_info_t}.codepoint
     */
    public static final BufferDiffFlagsT CODEPOINT_MISMATCH = new BufferDiffFlagsT(16);
    
    /**
     * difference in {@link glyph_info_t}.cluster
     */
    public static final BufferDiffFlagsT CLUSTER_MISMATCH = new BufferDiffFlagsT(32);
    
    /**
     * difference in {@link glyph_flags_t}.
     */
    public static final BufferDiffFlagsT GLYPH_FLAGS_MISMATCH = new BufferDiffFlagsT(64);
    
    /**
     * difference in {@link glyph_position_t}.
     */
    public static final BufferDiffFlagsT POSITION_MISMATCH = new BufferDiffFlagsT(128);
    
    private int value;
    
    public BufferDiffFlagsT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(BufferDiffFlagsT[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public BufferDiffFlagsT combined(BufferDiffFlagsT mask) {
        return new BufferDiffFlagsT(this.getValue() | mask.getValue());
    }
    
    public static BufferDiffFlagsT combined(BufferDiffFlagsT mask, BufferDiffFlagsT... masks) {
        int value = mask.getValue();
        for (BufferDiffFlagsT arg : masks) {
            value |= arg.getValue();
        }
        return new BufferDiffFlagsT(value);
    }
    
}
