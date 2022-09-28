package org.gnome.adw;

/**
 * Describes transitions types of a {@link Flap} widget.
 * <p>
 * It determines the type of animation when transitioning between children in a
 * {@link Flap} widget, as well as which areas can be swiped via
 * {@code Flap:swipe-to-close}.
 * <p>
 * New values may be added to this enum over time.
 */
public class FlapTransitionType extends io.github.jwharm.javagi.Enumeration {

    /**
     * The flap slides over the content, which is
     *   dimmed. When folded, only the flap can be swiped.
     */
    public static final FlapTransitionType OVER = new FlapTransitionType(0);
    
    /**
     * The content slides over the flap. Only the
     *   content can be swiped.
     */
    public static final FlapTransitionType UNDER = new FlapTransitionType(1);
    
    /**
     * The flap slides offscreen when hidden,
     *   neither the flap nor content overlap each other. Both widgets can be
     *   swiped.
     */
    public static final FlapTransitionType SLIDE = new FlapTransitionType(2);
    
    public FlapTransitionType(int value) {
        super(value);
    }
    
}
