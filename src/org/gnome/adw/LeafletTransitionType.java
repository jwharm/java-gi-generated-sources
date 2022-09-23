package org.gnome.adw;

/**
 * Describes the possible transitions in a {@link Leaflet} widget.
 * <p>
 * New values may be added to this enumeration over time.
 */
public enum LeafletTransitionType {

    /**
     * Cover the old page or uncover the new page, sliding from or towards the end according to orientation, text direction and children order
     */
    OVER,
    
    /**
     * Uncover the new page or cover the old page, sliding from or towards the start according to orientation, text direction and children order
     */
    UNDER,
    
    /**
     * Slide from left, right, up or down according to the orientation, text direction and the children order
     */
    SLIDE;
    
    public static LeafletTransitionType fromValue(int value) {
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
