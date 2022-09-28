package org.pango;

/**
 * {@code PangoEllipsizeMode} describes what sort of ellipsization
 * should be applied to text.
 * <p>
 * In the ellipsization process characters are removed from the
 * text in order to make it fit to a given width and replaced
 * with an ellipsis.
 */
public class EllipsizeMode {

    /**
     * No ellipsization
     */
    public static final EllipsizeMode NONE = new EllipsizeMode(0);
    
    /**
     * Omit characters at the start of the text
     */
    public static final EllipsizeMode START = new EllipsizeMode(1);
    
    /**
     * Omit characters in the middle of the text
     */
    public static final EllipsizeMode MIDDLE = new EllipsizeMode(2);
    
    /**
     * Omit characters at the end of the text
     */
    public static final EllipsizeMode END = new EllipsizeMode(3);
    
    private int value;
    
    public EllipsizeMode(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(EllipsizeMode[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
