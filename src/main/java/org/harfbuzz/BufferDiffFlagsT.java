package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags from comparing two {@link BufferT}'s.
 * <p>
 * Buffer with different {@link BufferContentTypeT} cannot be meaningfully
 * compared in any further detail.
 * <p>
 * For buffers with differing length, the per-glyph comparison is not
 * attempted, though we do still scan reference buffer for dotted circle and
 * {@code .notdef} glyphs.
 * <p>
 * If the buffers have the same length, we compare them glyph-by-glyph and
 * report which aspect(s) of the glyph info/position are different.
 * @version 1.5.0
 */
public class BufferDiffFlagsT extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "hb_buffer_diff_flags_t";
    
    /**
     * equal buffers.
     */
    public static final BufferDiffFlagsT EQUAL = new BufferDiffFlagsT(0);
    
    /**
     * buffers with different
     *     {@link BufferContentTypeT}.
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
     * difference in {@link GlyphInfoT}.codepoint
     */
    public static final BufferDiffFlagsT CODEPOINT_MISMATCH = new BufferDiffFlagsT(16);
    
    /**
     * difference in {@link GlyphInfoT}.cluster
     */
    public static final BufferDiffFlagsT CLUSTER_MISMATCH = new BufferDiffFlagsT(32);
    
    /**
     * difference in {@link GlyphFlagsT}.
     */
    public static final BufferDiffFlagsT GLYPH_FLAGS_MISMATCH = new BufferDiffFlagsT(64);
    
    /**
     * difference in {@link GlyphPositionT}.
     */
    public static final BufferDiffFlagsT POSITION_MISMATCH = new BufferDiffFlagsT(128);
    
    public BufferDiffFlagsT(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public BufferDiffFlagsT or(BufferDiffFlagsT mask) {
        return new BufferDiffFlagsT(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static BufferDiffFlagsT combined(BufferDiffFlagsT mask, BufferDiffFlagsT... masks) {
        int value = mask.getValue();        for (BufferDiffFlagsT arg : masks) {
            value |= arg.getValue();
        }
        return new BufferDiffFlagsT(value);
    }
}
