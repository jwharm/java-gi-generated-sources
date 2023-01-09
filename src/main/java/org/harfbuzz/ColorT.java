package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for holding color values. Colors are eight bits per
 * channel RGB plus alpha transparency.
 */
public class ColorT extends io.github.jwharm.javagi.Alias<Integer> {
    
    /**
     * Create a new ColorT with the provided value
     */
    public ColorT(int value) {
        super(value);
    }
    
    @ApiStatus.Internal
    public static ColorT[] fromNativeArray(MemoryAddress address, long length) {
        ColorT[] array = new ColorT[(int) length];
        long bytesSize = Interop.valueLayout.C_INT.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new ColorT(address.get(Interop.valueLayout.C_INT, i * bytesSize));
        }
        return array;
    }
}
