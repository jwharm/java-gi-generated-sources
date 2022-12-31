package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for booleans.
 */
public class BoolT extends io.github.jwharm.javagi.Alias<Integer> {
    
    public BoolT(int value) {
        super(value);
    }
    
    @ApiStatus.Internal
    public static BoolT[] fromNativeArray(MemoryAddress address, long length) {
        BoolT[] array = new BoolT[(int) length];
        long bytesSize = Interop.valueLayout.C_INT.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new BoolT(address.get(Interop.valueLayout.C_INT, i * bytesSize));
        }
        return array;
    }
}
