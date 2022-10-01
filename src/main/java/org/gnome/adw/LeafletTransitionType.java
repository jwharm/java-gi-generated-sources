package org.gnome.adw;

/**
 * Describes the possible transitions in a {@link Leaflet} widget.
 * <p>
 * New values may be added to this enumeration over time.
 */
public class LeafletTransitionType extends io.github.jwharm.javagi.Enumeration {

    /**
     * Cover the old page or uncover the new page, sliding from or towards the end according to orientation, text direction and children order
     */
    public static final LeafletTransitionType OVER = new LeafletTransitionType(0);
    
    /**
     * Uncover the new page or cover the old page, sliding from or towards the start according to orientation, text direction and children order
     */
    public static final LeafletTransitionType UNDER = new LeafletTransitionType(1);
    
    /**
     * Slide from left, right, up or down according to the orientation, text direction and the children order
     */
    public static final LeafletTransitionType SLIDE = new LeafletTransitionType(2);
    
    public LeafletTransitionType(int value) {
        super(value);
    }
    
}
