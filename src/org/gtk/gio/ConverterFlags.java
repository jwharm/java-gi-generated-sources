package org.gtk.gio;

/**
 * Flags used when calling a g_converter_convert().
 */
public class ConverterFlags extends io.github.jwharm.javagi.Bitfield {

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
    
    public ConverterFlags(int value) {
        super(value);
    }
    
}
