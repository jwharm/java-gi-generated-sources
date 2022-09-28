package org.gtk.gtk;

/**
 * Specifies the side of the entry at which an icon is placed.
 */
public class EntryIconPosition {

    /**
     * At the beginning of the entry (depending on the text direction).
     */
    public static final EntryIconPosition PRIMARY = new EntryIconPosition(0);
    
    /**
     * At the end of the entry (depending on the text direction).
     */
    public static final EntryIconPosition SECONDARY = new EntryIconPosition(1);
    
    private int value;
    
    public EntryIconPosition(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(EntryIconPosition[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
