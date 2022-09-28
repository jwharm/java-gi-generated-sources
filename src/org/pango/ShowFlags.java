package org.pango;

/**
 * These flags affect how Pango treats characters that are normally
 * not visible in the output.
 */
public class ShowFlags {

    /**
     * No special treatment for invisible characters
     */
    public static final ShowFlags NONE = new ShowFlags(0);
    
    /**
     * Render spaces, tabs and newlines visibly
     */
    public static final ShowFlags SPACES = new ShowFlags(1);
    
    /**
     * Render line breaks visibly
     */
    public static final ShowFlags LINE_BREAKS = new ShowFlags(2);
    
    /**
     * Render default-ignorable Unicode
     *   characters visibly
     */
    public static final ShowFlags IGNORABLES = new ShowFlags(4);
    
    private int value;
    
    public ShowFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ShowFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public ShowFlags combined(ShowFlags mask) {
        return new ShowFlags(this.getValue() | mask.getValue());
    }
    
    public static ShowFlags combined(ShowFlags mask, ShowFlags... masks) {
        int value = mask.getValue();
        for (ShowFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ShowFlags(value);
    }
    
}
