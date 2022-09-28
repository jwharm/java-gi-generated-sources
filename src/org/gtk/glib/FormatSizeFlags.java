package org.gtk.glib;

/**
 * Flags to modify the format of the string returned by g_format_size_full().
 */
public class FormatSizeFlags {

    /**
     * behave the same as g_format_size()
     */
    public static final FormatSizeFlags DEFAULT = new FormatSizeFlags(0);
    
    /**
     * include the exact number of bytes as part
     *     of the returned string.  For example, "45.6 kB (45,612 bytes)".
     */
    public static final FormatSizeFlags LONG_FORMAT = new FormatSizeFlags(1);
    
    /**
     * use IEC (base 1024) units with "KiB"-style
     *     suffixes. IEC units should only be used for reporting things with
     *     a strong "power of 2" basis, like RAM sizes or RAID stripe sizes.
     *     Network and storage sizes should be reported in the normal SI units.
     */
    public static final FormatSizeFlags IEC_UNITS = new FormatSizeFlags(2);
    
    /**
     * set the size as a quantity in bits, rather than
     *     bytes, and return units in bits. For example, ‘Mb’ rather than ‘MB’.
     */
    public static final FormatSizeFlags BITS = new FormatSizeFlags(4);
    
    private int value;
    
    public FormatSizeFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(FormatSizeFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public FormatSizeFlags combined(FormatSizeFlags mask) {
        return new FormatSizeFlags(this.getValue() | mask.getValue());
    }
    
    public static FormatSizeFlags combined(FormatSizeFlags mask, FormatSizeFlags... masks) {
        int value = mask.getValue();
        for (FormatSizeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new FormatSizeFlags(value);
    }
    
}
