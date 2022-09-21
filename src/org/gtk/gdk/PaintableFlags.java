package org.gtk.gdk;

/**
 * Flags about a paintable object.
 * <p>
 * Implementations use these for optimizations such as caching.
 */
public class PaintableFlags {

    /**
     * The size is immutable.
     *   The {@code GdkPaintable::invalidate-size} signal will never be
     *   emitted.
     */
    public static final int SIZE = 1;
    
    /**
     * The content is immutable.
     *   The {@code GdkPaintable::invalidate-contents} signal will never be
     *   emitted.
     */
    public static final int CONTENTS = 2;
    
}
