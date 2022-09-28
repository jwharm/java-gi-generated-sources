package org.pango;

/**
 * An enumeration specifying the various slant styles possible for a font.
 */
public class Style {

    /**
     * the font is upright.
     */
    public static final Style NORMAL = new Style(0);
    
    /**
     * the font is slanted, but in a roman style.
     */
    public static final Style OBLIQUE = new Style(1);
    
    /**
     * the font is slanted in an italic style.
     */
    public static final Style ITALIC = new Style(2);
    
    private int value;
    
    public Style(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(Style[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
