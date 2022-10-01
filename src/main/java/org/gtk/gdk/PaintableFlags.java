package org.gtk.gdk;

/**
 * Flags about a paintable object.
 * <p>
 * Implementations use these for optimizations such as caching.
 */
public class PaintableFlags extends io.github.jwharm.javagi.Bitfield {

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
