package org.gtk.gtk;

/**
 * Used to reference the layers of {@code GtkTextView} for the purpose of customized
 * drawing with the ::snapshot_layer vfunc.
 */
public class TextViewLayer {

    /**
     * The layer rendered below the text (but above the background).
     */
    public static final TextViewLayer BELOW_TEXT = new TextViewLayer(0);
    
    /**
     * The layer rendered above the text.
     */
    public static final TextViewLayer ABOVE_TEXT = new TextViewLayer(1);
    
    private int value;
    
    public TextViewLayer(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TextViewLayer[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
