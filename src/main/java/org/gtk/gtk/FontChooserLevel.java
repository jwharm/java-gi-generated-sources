package org.gtk.gtk;

/**
 * Specifies the granularity of font selection
 * that is desired in a {@code GtkFontChooser}.
 * <p>
 * This enumeration may be extended in the future; applications should
 * ignore unknown values.
 */
public class FontChooserLevel extends io.github.jwharm.javagi.Bitfield {

    /**
     * Allow selecting a font family
     */
    public static final FontChooserLevel FAMILY = new FontChooserLevel(0);
    
    /**
     * Allow selecting a specific font face
     */
    public static final FontChooserLevel STYLE = new FontChooserLevel(1);
    
    /**
     * Allow selecting a specific font size
     */
    public static final FontChooserLevel SIZE = new FontChooserLevel(2);
    
    /**
     * Allow changing OpenType font variation axes
     */
    public static final FontChooserLevel VARIATIONS = new FontChooserLevel(4);
    
    /**
     * Allow selecting specific OpenType font features
     */
    public static final FontChooserLevel FEATURES = new FontChooserLevel(8);
    
    public FontChooserLevel(int value) {
        super(value);
    }
    
}
