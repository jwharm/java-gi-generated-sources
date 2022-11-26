package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoLayoutRun} represents a single run within a {@code PangoLayoutLine}.
 * <p>
 * It is simply an alternate name for {@code Pango.GlyphItem}.
 * See the {@code Pango.GlyphItem} docs for details on the fields.
 */
public class LayoutRun extends org.pango.GlyphItem {
    
    /**
     * Create a LayoutRun proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public LayoutRun(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}
