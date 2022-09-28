package org.pango;

/**
 * {@code PangoWrapMode} describes how to wrap the lines of a {@code PangoLayout}
 * to the desired width.
 * <p>
 * For {@code PANGO_WRAP_WORD}, Pango uses break opportunities that are determined
 * by the Unicode line breaking algorithm. For {@code PANGO_WRAP_CHAR}, Pango allows
 * breaking at grapheme boundaries that are determined by the Unicode text
 * segmentation algorithm.
 */
public class WrapMode {

    /**
     * wrap lines at word boundaries.
     */
    public static final WrapMode WORD = new WrapMode(0);
    
    /**
     * wrap lines at character boundaries.
     */
    public static final WrapMode CHAR = new WrapMode(1);
    
    /**
     * wrap lines at word boundaries, but fall back to
     *   character boundaries if there is not enough space for a full word.
     */
    public static final WrapMode WORD_CHAR = new WrapMode(2);
    
    private int value;
    
    public WrapMode(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(WrapMode[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
