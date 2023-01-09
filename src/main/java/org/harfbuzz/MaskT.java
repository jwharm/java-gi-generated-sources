package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for bitmasks.
 */
public class MaskT extends io.github.jwharm.javagi.Alias<Integer> {
    
    /**
     * Create a new MaskT with the provided value
     */
    public MaskT(int value) {
        super(value);
    }
    
    @ApiStatus.Internal
    public static MaskT[] fromNativeArray(MemoryAddress address, long length) {
        MaskT[] array = new MaskT[(int) length];
        long bytesSize = Interop.valueLayout.C_INT.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new MaskT(address.get(Interop.valueLayout.C_INT, i * bytesSize));
        }
        return array;
    }
}
