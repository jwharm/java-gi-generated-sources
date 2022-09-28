package org.gtk.gio;

/**
 * GIOStreamSpliceFlags determine how streams should be spliced.
 */
public class IOStreamSpliceFlags {

    /**
     * Do not close either stream.
     */
    public static final IOStreamSpliceFlags NONE = new IOStreamSpliceFlags(0);
    
    /**
     * Close the first stream after
     *     the splice.
     */
    public static final IOStreamSpliceFlags CLOSE_STREAM1 = new IOStreamSpliceFlags(1);
    
    /**
     * Close the second stream after
     *     the splice.
     */
    public static final IOStreamSpliceFlags CLOSE_STREAM2 = new IOStreamSpliceFlags(2);
    
    /**
     * Wait for both splice operations to finish
     *     before calling the callback.
     */
    public static final IOStreamSpliceFlags WAIT_FOR_BOTH = new IOStreamSpliceFlags(4);
    
    private int value;
    
    public IOStreamSpliceFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(IOStreamSpliceFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public IOStreamSpliceFlags combined(IOStreamSpliceFlags mask) {
        return new IOStreamSpliceFlags(this.getValue() | mask.getValue());
    }
    
    public static IOStreamSpliceFlags combined(IOStreamSpliceFlags mask, IOStreamSpliceFlags... masks) {
        int value = mask.getValue();
        for (IOStreamSpliceFlags arg : masks) {
            value |= arg.getValue();
        }
        return new IOStreamSpliceFlags(value);
    }
    
}
