package org.gtk.gtk;

/**
 * Specifies the granularity of font selection
 * that is desired in a {@code GtkFontChooser}.
 * <p>
 * This enumeration may be extended in the future; applications should
 * ignore unknown values.
 */
public class FontChooserLevel {

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
    
    private int value;
    
    public FontChooserLevel(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(FontChooserLevel[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public FontChooserLevel combined(FontChooserLevel mask) {
        return new FontChooserLevel(this.getValue() | mask.getValue());
    }
    
    public static FontChooserLevel combined(FontChooserLevel mask, FontChooserLevel... masks) {
        int value = mask.getValue();
        for (FontChooserLevel arg : masks) {
            value |= arg.getValue();
        }
        return new FontChooserLevel(value);
    }
    
}
