package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags for {@link GlyphInfoT}.
 * @version 1.5.0
 */
public class GlyphFlagsT extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "hb_glyph_flags_t";
    
    /**
     * Indicates that if input text is broken at the
     * 				   beginning of the cluster this glyph is part of,
     * 				   then both sides need to be re-shaped, as the
     * 				   result might be different.
     * 				   On the flip side, it means that when this
     * 				   flag is not present, then it is safe to break
     * 				   the glyph-run at the beginning of this
     * 				   cluster, and the two sides will represent the
     * 				   exact same result one would get if breaking
     * 				   input text at the beginning of this cluster
     * 				   and shaping the two sides separately.
     * 				   This can be used to optimize paragraph
     * 				   layout, by avoiding re-shaping of each line
     * 				   after line-breaking.
     */
    public static final GlyphFlagsT UNSAFE_TO_BREAK = new GlyphFlagsT(1);
    
    /**
     * Indicates that if input text is changed on one
     * 				   side of the beginning of the cluster this glyph
     * 				   is part of, then the shaping results for the
     * 				   other side might change.
     * 				   Note that the absence of this flag will NOT by
     * 				   itself mean that it IS safe to concat text.
     * 				   Only two pieces of text both of which clear of
     * 				   this flag can be concatenated safely.
     * 				   This can be used to optimize paragraph
     * 				   layout, by avoiding re-shaping of each line
     * 				   after line-breaking, by limiting the
     * 				   reshaping to a small piece around the
     * 				   breaking positin only, even if the breaking
     * 				   position carries the
     * 				   {@code HB_GLYPH_FLAG_UNSAFE_TO_BREAK} or when
     * 				   hyphenation or other text transformation
     * 				   happens at line-break position, in the following
     * 				   way:
     * 				   1. Iterate back from the line-break position
     * 				   until the first cluster start position that is
     * 				   NOT unsafe-to-concat, 2. shape the segment from
     * 				   there till the end of line, 3. check whether the
     * 				   resulting glyph-run also is clear of the
     * 				   unsafe-to-concat at its start-of-text position;
     * 				   if it is, just splice it into place and the line
     * 				   is shaped; If not, move on to a position further
     * 				   back that is clear of unsafe-to-concat and retry
     * 				   from there, and repeat.
     * 				   At the start of next line a similar algorithm can
     * 				   be implemented. That is: 1. Iterate forward from
     * 				   the line-break position until the first cluster
     * 				   start position that is NOT unsafe-to-concat, 2.
     * 				   shape the segment from beginning of the line to
     * 				   that position, 3. check whether the resulting
     * 				   glyph-run also is clear of the unsafe-to-concat
     * 				   at its end-of-text position; if it is, just splice
     * 				   it into place and the beginning is shaped; If not,
     * 				   move on to a position further forward that is clear
     * 				   of unsafe-to-concat and retry up to there, and repeat.
     * 				   A slight complication will arise in the
     * 				   implementation of the algorithm above,
     * 				   because while our buffer API has a way to
     * 				   return flags for position corresponding to
     * 				   start-of-text, there is currently no position
     * 				   corresponding to end-of-text.  This limitation
     * 				   can be alleviated by shaping more text than needed
     * 				   and looking for unsafe-to-concat flag within text
     * 				   clusters.
     * 				   The {@code HB_GLYPH_FLAG_UNSAFE_TO_BREAK} flag will
     * 				   always imply this flag.
     * 			   To use this flag, you must enable the buffer flag
     * 			   {@code HB_BUFFER_FLAG_PRODUCE_UNSAFE_TO_CONCAT} during
     * 			   shaping, otherwise the buffer flag will not be
     * 			   reliably produced.
     * 				   Since: 4.0.0
     */
    public static final GlyphFlagsT UNSAFE_TO_CONCAT = new GlyphFlagsT(2);
    
    /**
     * In scripts that use elongation (Arabic,
     * 				   Mongolian, Syriac, etc.), this flag signifies
     * 				   that it is safe to insert a U+0640 TATWEEL
     * 				   character before this cluster for elongation.
     * 				   This flag does not determine the
     * 				   script-specific elongation places, but only
     * 				   when it is safe to do the elongation without
     * 				   interrupting text shaping.
     * 				   Since: 5.1.0
     */
    public static final GlyphFlagsT SAFE_TO_INSERT_TATWEEL = new GlyphFlagsT(4);
    
    /**
     * All the currently defined flags.
     */
    public static final GlyphFlagsT DEFINED = new GlyphFlagsT(7);
    
    /**
     * Create a new GlyphFlagsT with the provided value
     */
    public GlyphFlagsT(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public GlyphFlagsT or(GlyphFlagsT... masks) {
        int value = this.getValue();
        for (GlyphFlagsT arg : masks) {
            value |= arg.getValue();
        }
        return new GlyphFlagsT(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static GlyphFlagsT combined(GlyphFlagsT mask, GlyphFlagsT... masks) {
        int value = mask.getValue();
        for (GlyphFlagsT arg : masks) {
            value |= arg.getValue();
        }
        return new GlyphFlagsT(value);
    }
}
