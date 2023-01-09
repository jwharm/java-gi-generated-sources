package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Integer type representing a year.
 * <p>
 * The {@code G_DATE_BAD_YEAR} value is the invalid value. The year
 * must be 1 or higher; negative (<a href="https://en.wikipedia.org/wiki/Common_Era">BCE</a>)
 * years are not allowed.
 * <p>
 * The year is represented with four digits.
 */
public class DateYear extends io.github.jwharm.javagi.Alias<Short> {
    
    /**
     * Create a new DateYear with the provided value
     */
    public DateYear(short value) {
        super(value);
    }
    
    @ApiStatus.Internal
    public static DateYear[] fromNativeArray(MemoryAddress address, long length) {
        DateYear[] array = new DateYear[(int) length];
        long bytesSize = Interop.valueLayout.C_SHORT.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new DateYear(address.get(Interop.valueLayout.C_SHORT, i * bytesSize));
        }
        return array;
    }
}
