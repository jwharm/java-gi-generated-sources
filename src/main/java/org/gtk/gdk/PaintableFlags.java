package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags about a paintable object.
 * <p>
 * Implementations use these for optimizations such as caching.
 */
public class PaintableFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GdkPaintableFlags";
    
    /**
     * The size is immutable.
     *   The {@code GdkPaintable::invalidate-size} signal will never be
     *   emitted.
     */
    public static final PaintableFlags SIZE = new PaintableFlags(1);
    
    /**
     * The content is immutable.
     *   The {@code GdkPaintable::invalidate-contents} signal will never be
     *   emitted.
     */
    public static final PaintableFlags CONTENTS = new PaintableFlags(2);
    
    public PaintableFlags(int value) {
        super(value);
    }
}
