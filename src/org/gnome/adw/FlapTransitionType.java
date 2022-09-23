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
public enum FlapTransitionType {

    /**
     * The flap slides over the content, which is
     *   dimmed. When folded, only the flap can be swiped.
     */
    OVER,
    
    /**
     * The content slides over the flap. Only the
     *   content can be swiped.
     */
    UNDER,
    
    /**
     * The flap slides offscreen when hidden,
     *   neither the flap nor content overlap each other. Both widgets can be
     *   swiped.
     */
    SLIDE;
    
    public static FlapTransitionType fromValue(int value) {
        return switch(value) {
            case 0 -> OVER;
            case 1 -> UNDER;
            case 2 -> SLIDE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case OVER -> 0;
            case UNDER -> 1;
            case SLIDE -> 2;
        };
    }

}
