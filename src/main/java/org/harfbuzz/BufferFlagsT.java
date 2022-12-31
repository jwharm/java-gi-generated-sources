package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags for {@link BufferT}.
 * @version 0.9.20
 */
public class BufferFlagsT extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "hb_buffer_flags_t";
    
    /**
     * the default buffer flag.
     */
    public static final BufferFlagsT DEFAULT = new BufferFlagsT(0);
    
    /**
     * flag indicating that special handling of the beginning
     *                      of text paragraph can be applied to this buffer. Should usually
     *                      be set, unless you are passing to the buffer only part
     *                      of the text without the full context.
     */
    public static final BufferFlagsT BOT = new BufferFlagsT(1);
    
    /**
     * flag indicating that special handling of the end of text
     *                      paragraph can be applied to this buffer, similar to
     *                      {@code HB_BUFFER_FLAG_BOT}.
     */
    public static final BufferFlagsT EOT = new BufferFlagsT(2);
    
    /**
     * flag indication that character with Default_Ignorable
     *                      Unicode property should use the corresponding glyph
     *                      from the font, instead of hiding them (done by
     *                      replacing them with the space glyph and zeroing the
     *                      advance width.)  This flag takes precedence over
     *                      {@code HB_BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES}.
     */
    public static final BufferFlagsT PRESERVE_DEFAULT_IGNORABLES = new BufferFlagsT(4);
    
    /**
     * flag indication that character with Default_Ignorable
     *                      Unicode property should be removed from glyph string
     *                      instead of hiding them (done by replacing them with the
     *                      space glyph and zeroing the advance width.)
     *                      {@code HB_BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES} takes
     *                      precedence over this flag. Since: 1.8.0
     */
    public static final BufferFlagsT REMOVE_DEFAULT_IGNORABLES = new BufferFlagsT(8);
    
    /**
     * flag indicating that a dotted circle should
     *                      not be inserted in the rendering of incorrect
     *                      character sequences (such at &lt;0905 093E&gt;). Since: 2.4.0
     */
    public static final BufferFlagsT DO_NOT_INSERT_DOTTED_CIRCLE = new BufferFlagsT(16);
    
    /**
     * flag indicating that the hb_shape() call and its variants
     *                      should perform various verification processes on the results
     *                      of the shaping operation on the buffer.  If the verification
     *                      fails, then either a buffer message is sent, if a message
     *                      handler is installed on the buffer, or a message is written
     *                      to standard error.  In either case, the shaping result might
     *                      be modified to show the failed output. Since: 3.4.0
     */
    public static final BufferFlagsT VERIFY = new BufferFlagsT(32);
    
    /**
     * flag indicating that the {@code HB_GLYPH_FLAG_UNSAFE_TO_CONCAT}
     *                      glyph-flag should be produced by the shaper. By default
     *                      it will not be produced since it incurs a cost. Since: 4.0.0
     */
    public static final BufferFlagsT PRODUCE_UNSAFE_TO_CONCAT = new BufferFlagsT(64);
    
    /**
     * flag indicating that the {@code HB_GLYPH_FLAG_SAFE_TO_INSERT_TATWEEL}
     *                      glyph-flag should be produced by the shaper. By default
     *                      it will not be produced. Since: 5.1.0
     */
    public static final BufferFlagsT PRODUCE_SAFE_TO_INSERT_TATWEEL = new BufferFlagsT(128);
    
    /**
     * All currently defined flags: Since: 4.4.0
     */
    public static final BufferFlagsT DEFINED = new BufferFlagsT(255);
    
    public BufferFlagsT(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public BufferFlagsT or(BufferFlagsT... masks) {
        int value = this.getValue();
        for (BufferFlagsT arg : masks) {
            value |= arg.getValue();
        }
        return new BufferFlagsT(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static BufferFlagsT combined(BufferFlagsT mask, BufferFlagsT... masks) {
        int value = mask.getValue();
        for (BufferFlagsT arg : masks) {
            value |= arg.getValue();
        }
        return new BufferFlagsT(value);
    }
}
