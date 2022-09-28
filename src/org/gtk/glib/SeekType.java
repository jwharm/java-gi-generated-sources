package org.gtk.glib;

/**
 * An enumeration specifying the base position for a
 * g_io_channel_seek_position() operation.
 */
public class SeekType {

    /**
     * the current position in the file.
     */
    public static final SeekType CUR = new SeekType(0);
    
    /**
     * the start of the file.
     */
    public static final SeekType SET = new SeekType(1);
    
    /**
     * the end of the file.
     */
    public static final SeekType END = new SeekType(2);
    
    private int value;
    
    public SeekType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SeekType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
