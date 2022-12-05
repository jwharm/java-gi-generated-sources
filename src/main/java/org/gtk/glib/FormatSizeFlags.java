package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags to modify the format of the string returned by g_format_size_full().
 */
public class FormatSizeFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GFormatSizeFlags";
    
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
    
    /**
     * return only value, without unit; this should
     *     not be used together with {@code G_FORMAT_SIZE_LONG_FORMAT}
     *     nor {@code G_FORMAT_SIZE_ONLY_UNIT}. Since: 2.74
     */
    public static final FormatSizeFlags ONLY_VALUE = new FormatSizeFlags(8);
    
    /**
     * return only unit, without value; this should
     *     not be used together with {@code G_FORMAT_SIZE_LONG_FORMAT}
     *     nor {@code G_FORMAT_SIZE_ONLY_VALUE}. Since: 2.74
     */
    public static final FormatSizeFlags ONLY_UNIT = new FormatSizeFlags(16);
    
    public FormatSizeFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public FormatSizeFlags or(FormatSizeFlags mask) {
        return new FormatSizeFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static FormatSizeFlags combined(FormatSizeFlags mask, FormatSizeFlags... masks) {
        int value = mask.getValue();        for (FormatSizeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new FormatSizeFlags(value);
    }
}
