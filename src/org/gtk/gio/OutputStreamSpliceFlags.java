package org.gtk.gio;

/**
 * GOutputStreamSpliceFlags determine how streams should be spliced.
 */
public class OutputStreamSpliceFlags {

    /**
     * Do not close either stream.
     */
    public static final OutputStreamSpliceFlags NONE = new OutputStreamSpliceFlags(0);
    
    /**
     * Close the source stream after
     *     the splice.
     */
    public static final OutputStreamSpliceFlags CLOSE_SOURCE = new OutputStreamSpliceFlags(1);
    
    /**
     * Close the target stream after
     *     the splice.
     */
    public static final OutputStreamSpliceFlags CLOSE_TARGET = new OutputStreamSpliceFlags(2);
    
    private int value;
    
    public OutputStreamSpliceFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(OutputStreamSpliceFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public OutputStreamSpliceFlags combined(OutputStreamSpliceFlags mask) {
        return new OutputStreamSpliceFlags(this.getValue() | mask.getValue());
    }
    
    public static OutputStreamSpliceFlags combined(OutputStreamSpliceFlags mask, OutputStreamSpliceFlags... masks) {
        int value = mask.getValue();
        for (OutputStreamSpliceFlags arg : masks) {
            value |= arg.getValue();
        }
        return new OutputStreamSpliceFlags(value);
    }
    
}
