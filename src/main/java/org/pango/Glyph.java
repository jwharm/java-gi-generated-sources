package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoGlyph} represents a single glyph in the output form of a string.
 */
public class Glyph extends io.github.jwharm.javagi.Alias<Integer> {
    
    /**
     * Create a new Glyph with the provided value
     */
    public Glyph(int value) {
        super(value);
    }
    
    @ApiStatus.Internal
    public static Glyph[] fromNativeArray(MemoryAddress address, long length) {
        Glyph[] array = new Glyph[(int) length];
        long bytesSize = Interop.valueLayout.C_INT.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new Glyph(address.get(Interop.valueLayout.C_INT, i * bytesSize));
        }
        return array;
    }
}
