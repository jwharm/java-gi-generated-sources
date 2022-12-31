package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A datatype to hold a time, measured in nanoseconds.
 */
public class ClockTime extends io.github.jwharm.javagi.Alias<Long> {
    
    public ClockTime(long value) {
        super(value);
    }
    
    @ApiStatus.Internal
    public static ClockTime[] fromNativeArray(MemoryAddress address, long length) {
        ClockTime[] array = new ClockTime[(int) length];
        long bytesSize = Interop.valueLayout.C_LONG.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new ClockTime(address.get(Interop.valueLayout.C_LONG, i * bytesSize));
        }
        return array;
    }
}
