package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A datatype to hold the handle to an outstanding sync or async clock callback.
 */
public class ClockID extends io.github.jwharm.javagi.Alias<java.lang.foreign.MemoryAddress> {
    
    public ClockID(java.lang.foreign.MemoryAddress value) {
        super(value);
    }
    
    @ApiStatus.Internal
    public static ClockID[] fromNativeArray(MemoryAddress address, long length) {
        ClockID[] array = new ClockID[(int) length];
        long bytesSize = Interop.valueLayout.ADDRESS.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new ClockID(address.get(Interop.valueLayout.ADDRESS, i * bytesSize));
        }
        return array;
    }
}
