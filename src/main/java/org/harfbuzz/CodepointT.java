package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for holding Unicode codepoints. Also
 * used to hold glyph IDs.
 */
public class CodepointT extends io.github.jwharm.javagi.Alias<Integer> {
    
    public CodepointT(int value) {
        super(value);
    }
    
    @ApiStatus.Internal
    public static CodepointT[] fromNativeArray(MemoryAddress address, long length) {
        CodepointT[] array = new CodepointT[(int) length];
        long bytesSize = Interop.valueLayout.C_INT.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new CodepointT(address.get(Interop.valueLayout.C_INT, i * bytesSize));
        }
        return array;
    }
}
