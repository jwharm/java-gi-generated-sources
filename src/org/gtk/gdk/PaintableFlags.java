package org.gtk.gdk;

/**
 * Flags about a paintable object.
 * 
 * Implementations use these for optimizations such as caching.
 */
public class PaintableFlags {

    /**
     * The size is immutable.
     *   The {@link [signal@GdkPaintable::invalidate-size] (ref=signal)} signal will never be
     *   emitted.
     */
    public static final int SIZE = 1;
    
    /**
     * The content is immutable.
     *   The {@link [signal@GdkPaintable::invalidate-contents] (ref=signal)} signal will never be
     *   emitted.
     */
    public static final int CONTENTS = 2;
    
}
