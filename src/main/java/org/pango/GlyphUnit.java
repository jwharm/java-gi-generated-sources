package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoGlyphUnit} type is used to store dimensions within
 * Pango.
 * <p>
 * Dimensions are stored in 1/PANGO_SCALE of a device unit.
 * (A device unit might be a pixel for screen display, or
 * a point on a printer.) PANGO_SCALE is currently 1024, and
 * may change in the future (unlikely though), but you should not
 * depend on its exact value.
 * <p>
 * The PANGO_PIXELS() macro can be used to convert from glyph units
 * into device units with correct rounding.
 */
public class GlyphUnit extends io.github.jwharm.javagi.Alias<Integer> {
    
    /**
     * Create a new GlyphUnit with the provided value
     */
    public GlyphUnit(int value) {
        super(value);
    }
    
    @ApiStatus.Internal
    public static GlyphUnit[] fromNativeArray(MemoryAddress address, long length) {
        GlyphUnit[] array = new GlyphUnit[(int) length];
        long bytesSize = Interop.valueLayout.C_INT.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new GlyphUnit(address.get(Interop.valueLayout.C_INT, i * bytesSize));
        }
        return array;
    }
}
