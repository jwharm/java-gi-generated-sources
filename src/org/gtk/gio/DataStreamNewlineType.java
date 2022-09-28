package org.gtk.gio;

/**
 * {@link DataStreamNewlineType} is used when checking for or setting the line endings for a given file.
 */
public class DataStreamNewlineType {

    /**
     * Selects "LF" line endings, common on most modern UNIX platforms.
     */
    public static final DataStreamNewlineType LF = new DataStreamNewlineType(0);
    
    /**
     * Selects "CR" line endings.
     */
    public static final DataStreamNewlineType CR = new DataStreamNewlineType(1);
    
    /**
     * Selects "CR, LF" line ending, common on Microsoft Windows.
     */
    public static final DataStreamNewlineType CR_LF = new DataStreamNewlineType(2);
    
    /**
     * Automatically try to handle any line ending type.
     */
    public static final DataStreamNewlineType ANY = new DataStreamNewlineType(3);
    
    private int value;
    
    public DataStreamNewlineType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DataStreamNewlineType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
