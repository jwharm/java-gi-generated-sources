package org.harfbuzz;

/**
 * Flags for {@link buffer_t}.
 */
public class BufferFlagsT {

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
    
    private int value;
    
    public BufferFlagsT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(BufferFlagsT[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public BufferFlagsT combined(BufferFlagsT mask) {
        return new BufferFlagsT(this.getValue() | mask.getValue());
    }
    
    public static BufferFlagsT combined(BufferFlagsT mask, BufferFlagsT... masks) {
        int value = mask.getValue();
        for (BufferFlagsT arg : masks) {
            value |= arg.getValue();
        }
        return new BufferFlagsT(value);
    }
    
}
