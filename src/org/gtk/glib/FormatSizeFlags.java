package org.gtk.glib;

/**
 * Flags to modify the format of the string returned by g_format_size_full().
 */
public class FormatSizeFlags {

    /**
     * behave the same as g_format_size()
     */
    public static final int DEFAULT = 0;
    
    /**
     * include the exact number of bytes as part
     *     of the returned string.  For example, "45.6 kB (45,612 bytes)".
     */
    public static final int LONG_FORMAT = 1;
    
    /**
     * use IEC (base 1024) units with "KiB"-style
     *     suffixes. IEC units should only be used for reporting things with
     *     a strong "power of 2" basis, like RAM sizes or RAID stripe sizes.
     *     Network and storage sizes should be reported in the normal SI units.
     */
    public static final int IEC_UNITS = 2;
    
    /**
     * set the size as a quantity in bits, rather than
     *     bytes, and return units in bits. For example, ‘Mb’ rather than ‘MB’.
     */
    public static final int BITS = 4;
    
}
