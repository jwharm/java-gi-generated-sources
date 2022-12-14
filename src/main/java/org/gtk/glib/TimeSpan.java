package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A value representing an interval of time, in microseconds.
 */
public class TimeSpan extends io.github.jwharm.javagi.Alias<Long> {
    
    /**
     * Create a new TimeSpan with the provided value
     */
    public TimeSpan(long value) {
        super(value);
    }
    
    @ApiStatus.Internal
    public static TimeSpan[] fromNativeArray(MemoryAddress address, long length) {
        TimeSpan[] array = new TimeSpan[(int) length];
        long bytesSize = Interop.valueLayout.C_LONG.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new TimeSpan(address.get(Interop.valueLayout.C_LONG, i * bytesSize));
        }
        return array;
    }
}
