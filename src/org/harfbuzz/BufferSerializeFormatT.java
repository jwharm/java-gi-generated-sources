package org.harfbuzz;

/**
 * The buffer serialization and de-serialization format used in
 * hb_buffer_serialize_glyphs() and hb_buffer_deserialize_glyphs().
 */
public class BufferSerializeFormatT {

    /**
     * a human-readable, plain text format.
     */
    public static final BufferSerializeFormatT TEXT = new BufferSerializeFormatT(1413830740);
    
    /**
     * a machine-readable JSON format.
     */
    public static final BufferSerializeFormatT JSON = new BufferSerializeFormatT(1246973774);
    
    /**
     * invalid format.
     */
    public static final BufferSerializeFormatT INVALID = new BufferSerializeFormatT(0);
    
    private int value;
    
    public BufferSerializeFormatT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(BufferSerializeFormatT[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
