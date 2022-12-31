package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A datatype to hold a time difference, measured in nanoseconds.
 */
public class ClockTimeDiff extends io.github.jwharm.javagi.Alias<Long> {
    
    public ClockTimeDiff(long value) {
        super(value);
    }
    
    @ApiStatus.Internal
    public static ClockTimeDiff[] fromNativeArray(MemoryAddress address, long length) {
        ClockTimeDiff[] array = new ClockTimeDiff[(int) length];
        long bytesSize = Interop.valueLayout.C_LONG.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new ClockTimeDiff(address.get(Interop.valueLayout.C_LONG, i * bytesSize));
        }
        return array;
    }
}
