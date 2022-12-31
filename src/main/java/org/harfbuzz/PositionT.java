package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for holding a single coordinate value.
 * Contour points and other multi-dimensional data are
 * stored as tuples of {@link PositionT}'s.
 */
public class PositionT extends io.github.jwharm.javagi.Alias<Integer> {
    
    public PositionT(int value) {
        super(value);
    }
    
    @ApiStatus.Internal
    public static PositionT[] fromNativeArray(MemoryAddress address, long length) {
        PositionT[] array = new PositionT[(int) length];
        long bytesSize = Interop.valueLayout.C_INT.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new PositionT(address.get(Interop.valueLayout.C_INT, i * bytesSize));
        }
        return array;
    }
}
