package org.gtk.gio;

/**
 * Flags used when calling a g_converter_convert().
 */
public class ConverterFlags {

    /**
     * No flags.
     */
    public static final ConverterFlags NONE = new ConverterFlags(0);
    
    /**
     * At end of input data
     */
    public static final ConverterFlags INPUT_AT_END = new ConverterFlags(1);
    
    /**
     * Flush data
     */
    public static final ConverterFlags FLUSH = new ConverterFlags(2);
    
    private int value;
    
    public ConverterFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ConverterFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public ConverterFlags combined(ConverterFlags mask) {
        return new ConverterFlags(this.getValue() | mask.getValue());
    }
    
    public static ConverterFlags combined(ConverterFlags mask, ConverterFlags... masks) {
        int value = mask.getValue();
        for (ConverterFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ConverterFlags(value);
    }
    
}
