package org.harfbuzz;

/**
 * Flags that describe the properties of color palette.
 */
public class OtColorPaletteFlagsT {

    /**
     * Default indicating that there is nothing special
     *   to note about a color palette.
     */
    public static final OtColorPaletteFlagsT DEFAULT = new OtColorPaletteFlagsT(0);
    
    /**
     * Flag indicating that the color
     *   palette is appropriate to use when displaying the font on a light background such as white.
     */
    public static final OtColorPaletteFlagsT USABLE_WITH_LIGHT_BACKGROUND = new OtColorPaletteFlagsT(1);
    
    /**
     * Flag indicating that the color
     *   palette is appropriate to use when displaying the font on a dark background such as black.
     */
    public static final OtColorPaletteFlagsT USABLE_WITH_DARK_BACKGROUND = new OtColorPaletteFlagsT(2);
    
    private int value;
    
    public OtColorPaletteFlagsT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(OtColorPaletteFlagsT[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public OtColorPaletteFlagsT combined(OtColorPaletteFlagsT mask) {
        return new OtColorPaletteFlagsT(this.getValue() | mask.getValue());
    }
    
    public static OtColorPaletteFlagsT combined(OtColorPaletteFlagsT mask, OtColorPaletteFlagsT... masks) {
        int value = mask.getValue();
        for (OtColorPaletteFlagsT arg : masks) {
            value |= arg.getValue();
        }
        return new OtColorPaletteFlagsT(value);
    }
    
}
