package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Integer representing a day of the month; between 1 and 31.
 * <p>
 * The {@code G_DATE_BAD_DAY} value represents an invalid day of the month.
 */
public class DateDay extends io.github.jwharm.javagi.Alias<Byte> {
    
    /**
     * Create a new DateDay with the provided value
     */
    public DateDay(byte value) {
        super(value);
    }
    
    @ApiStatus.Internal
    public static DateDay[] fromNativeArray(MemoryAddress address, long length) {
        DateDay[] array = new DateDay[(int) length];
        long bytesSize = Interop.valueLayout.C_BYTE.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new DateDay(address.get(Interop.valueLayout.C_BYTE, i * bytesSize));
        }
        return array;
    }
}
