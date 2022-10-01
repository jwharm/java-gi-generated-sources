package org.gtk.gio;

/**
 * Results returned from g_converter_convert().
 */
public class ConverterResult extends io.github.jwharm.javagi.Enumeration {

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
    
    public ConverterResult(int value) {
        super(value);
    }
    
}
