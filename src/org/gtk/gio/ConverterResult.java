package org.gtk.gio;

/**
 * Results returned from g_converter_convert().
 */
public class ConverterResult {

    /**
     * There was an error during conversion.
     */
    public static final ConverterResult ERROR = new ConverterResult(0);
    
    /**
     * Some data was consumed or produced
     */
    public static final ConverterResult CONVERTED = new ConverterResult(1);
    
    /**
     * The conversion is finished
     */
    public static final ConverterResult FINISHED = new ConverterResult(2);
    
    /**
     * Flushing is finished
     */
    public static final ConverterResult FLUSHED = new ConverterResult(3);
    
    private int value;
    
    public ConverterResult(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ConverterResult[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
