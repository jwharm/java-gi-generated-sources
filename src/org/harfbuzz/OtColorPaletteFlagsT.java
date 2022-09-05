package org.harfbuzz;

/**
 * Flags that describe the properties of color palette.
 */
public class OtColorPaletteFlagsT {

    /**
     * Default indicating that there is nothing special
     *   to note about a color palette.
     */
    public static final int DEFAULT = 0;
    
    /**
     * Flag indicating that the color
     *   palette is appropriate to use when displaying the font on a light background such as white.
     */
    public static final int USABLE_WITH_LIGHT_BACKGROUND = 1;
    
    /**
     * Flag indicating that the color
     *   palette is appropriate to use when displaying the font on a dark background such as black.
     */
    public static final int USABLE_WITH_DARK_BACKGROUND = 2;
    
}
