package org.gtk.gtk;

/**
 * Represents the packing location of a children in its parent.
 * <p>
 * See {@link WindowControls} for example.
 */
public class PackType {

    /**
     * The child is packed into the start of the widget
     */
    public static final PackType START = new PackType(0);
    
    /**
     * The child is packed into the end of the widget
     */
    public static final PackType END = new PackType(1);
    
    private int value;
    
    public PackType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(PackType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
