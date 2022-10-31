package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Results returned from g_converter_convert().
 * @version 2.24
 */
public class ConverterResult extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GConverterResult";
    
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
