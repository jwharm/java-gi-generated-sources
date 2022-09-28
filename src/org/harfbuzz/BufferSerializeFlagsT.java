package org.harfbuzz;

/**
 * Flags that control what glyph information are serialized in hb_buffer_serialize_glyphs().
 */
public class BufferSerializeFlagsT {

    /**
     * serialize glyph names, clusters and positions.
     */
    public static final BufferSerializeFlagsT DEFAULT = new BufferSerializeFlagsT(0);
    
    /**
     * do not serialize glyph cluster.
     */
    public static final BufferSerializeFlagsT NO_CLUSTERS = new BufferSerializeFlagsT(1);
    
    /**
     * do not serialize glyph position information.
     */
    public static final BufferSerializeFlagsT NO_POSITIONS = new BufferSerializeFlagsT(2);
    
    /**
     * do no serialize glyph name.
     */
    public static final BufferSerializeFlagsT NO_GLYPH_NAMES = new BufferSerializeFlagsT(4);
    
    /**
     * serialize glyph extents.
     */
    public static final BufferSerializeFlagsT GLYPH_EXTENTS = new BufferSerializeFlagsT(8);
    
    /**
     * serialize glyph flags. Since: 1.5.0
     */
    public static final BufferSerializeFlagsT GLYPH_FLAGS = new BufferSerializeFlagsT(16);
    
    /**
     * do not serialize glyph advances,
     *  glyph offsets will reflect absolute glyph positions. Since: 1.8.0
     */
    public static final BufferSerializeFlagsT NO_ADVANCES = new BufferSerializeFlagsT(32);
    
    private int value;
    
    public BufferSerializeFlagsT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(BufferSerializeFlagsT[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public BufferSerializeFlagsT combined(BufferSerializeFlagsT mask) {
        return new BufferSerializeFlagsT(this.getValue() | mask.getValue());
    }
    
    public static BufferSerializeFlagsT combined(BufferSerializeFlagsT mask, BufferSerializeFlagsT... masks) {
        int value = mask.getValue();
        for (BufferSerializeFlagsT arg : masks) {
            value |= arg.getValue();
        }
        return new BufferSerializeFlagsT(value);
    }
    
}
