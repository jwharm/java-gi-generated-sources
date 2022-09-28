package org.harfbuzz;

/**
 * The type of {@link buffer_t} contents.
 */
public class BufferContentTypeT {

    /**
     * Initial value for new buffer.
     */
    public static final BufferContentTypeT INVALID = new BufferContentTypeT(0);
    
    /**
     * The buffer contains input characters (before shaping).
     */
    public static final BufferContentTypeT UNICODE = new BufferContentTypeT(1);
    
    /**
     * The buffer contains output glyphs (after shaping).
     */
    public static final BufferContentTypeT GLYPHS = new BufferContentTypeT(2);
    
    private int value;
    
    public BufferContentTypeT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(BufferContentTypeT[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
