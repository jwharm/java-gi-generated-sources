package org.gtk.gtk;

/**
 * Flags that influence the behavior of {@link Widget#pick}.
 */
public class PickFlags {

    /**
     * The default behavior, include widgets that are receiving events
     */
    public static final PickFlags DEFAULT = new PickFlags(0);
    
    /**
     * Include widgets that are insensitive
     */
    public static final PickFlags INSENSITIVE = new PickFlags(1);
    
    /**
     * Include widgets that are marked as non-targetable. See {@code Widget:can-target}
     */
    public static final PickFlags NON_TARGETABLE = new PickFlags(2);
    
    private int value;
    
    public PickFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(PickFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public PickFlags combined(PickFlags mask) {
        return new PickFlags(this.getValue() | mask.getValue());
    }
    
    public static PickFlags combined(PickFlags mask, PickFlags... masks) {
        int value = mask.getValue();
        for (PickFlags arg : masks) {
            value |= arg.getValue();
        }
        return new PickFlags(value);
    }
    
}
