package org.gtk.gio;

/**
 * Flags used when calling a g_converter_convert().
 */
public class ConverterFlags {

    /**
     * No flags.
     */
    public static final int NONE = 0;
    
    /**
     * At end of input data
     */
    public static final int INPUT_AT_END = 1;
    
    /**
     * Flush data
     */
    public static final int FLUSH = 2;
    
}
