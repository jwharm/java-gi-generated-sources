package org.gtk.gtk;

/**
 * Specifies the granularity of font selection
 * that is desired in a `GtkFontChooser`.
 * 
 * This enumeration may be extended in the future; applications should
 * ignore unknown values.
 */
public class FontChooserLevel {

    /**
     * Allow selecting a font family
     */
    public static final int FAMILY = 0;
    
    /**
     * Allow selecting a specific font face
     */
    public static final int STYLE = 1;
    
    /**
     * Allow selecting a specific font size
     */
    public static final int SIZE = 2;
    
    /**
     * Allow changing OpenType font variation axes
     */
    public static final int VARIATIONS = 4;
    
    /**
     * Allow selecting specific OpenType font features
     */
    public static final int FEATURES = 8;
    
}
