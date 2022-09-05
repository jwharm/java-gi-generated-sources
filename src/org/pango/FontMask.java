package org.pango;

/**
 * The bits in a `PangoFontMask` correspond to the set fields in a
 * `PangoFontDescription`.
 */
public class FontMask {

    /**
     * the font family is specified.
     */
    public static final int FAMILY = 1;
    
    /**
     * the font style is specified.
     */
    public static final int STYLE = 2;
    
    /**
     * the font variant is specified.
     */
    public static final int VARIANT = 4;
    
    /**
     * the font weight is specified.
     */
    public static final int WEIGHT = 8;
    
    /**
     * the font stretch is specified.
     */
    public static final int STRETCH = 16;
    
    /**
     * the font size is specified.
     */
    public static final int SIZE = 32;
    
    /**
     * the font gravity is specified (Since: 1.16.)
     */
    public static final int GRAVITY = 64;
    
    /**
     * OpenType font variations are specified (Since: 1.42)
     */
    public static final int VARIATIONS = 128;
    
}
