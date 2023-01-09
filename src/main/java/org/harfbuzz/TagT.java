package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type for tag identifiers. Tags are four
 * byte integers, each byte representing a character.
 * <p>
 * Tags are used to identify tables, design-variation axes,
 * scripts, languages, font features, and baselines with
 * human-readable names.
 */
public class TagT extends io.github.jwharm.javagi.Alias<Integer> {
    
    /**
     * Create a new TagT with the provided value
     */
    public TagT(int value) {
        super(value);
    }
    
    @ApiStatus.Internal
    public static TagT[] fromNativeArray(MemoryAddress address, long length) {
        TagT[] array = new TagT[(int) length];
        long bytesSize = Interop.valueLayout.C_INT.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new TagT(address.get(Interop.valueLayout.C_INT, i * bytesSize));
        }
        return array;
    }
}
