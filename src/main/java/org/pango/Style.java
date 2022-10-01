package org.pango;

/**
 * An enumeration specifying the various slant styles possible for a font.
 */
public class Style extends io.github.jwharm.javagi.Enumeration {

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
    
    public Style(int value) {
        super(value);
    }
    
}
