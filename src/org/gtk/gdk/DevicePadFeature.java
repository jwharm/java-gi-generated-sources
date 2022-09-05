package org.gtk.gdk;

/**
 * A pad feature.
 */
public enum DevicePadFeature {

    /**
     * a button
     */
    BUTTON,
    
    /**
     * a ring-shaped interactive area
     */
    RING,
    
    /**
     * a straight interactive area
     */
    STRIP;
    
    public static DevicePadFeature fromValue(int value) {
        return switch(value) {
            case 0 -> BUTTON;
            case 1 -> RING;
            case 2 -> STRIP;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case BUTTON -> 0;
            case RING -> 1;
            case STRIP -> 2;
        };
    }

}
