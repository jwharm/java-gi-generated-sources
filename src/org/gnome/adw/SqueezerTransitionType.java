package org.gnome.adw;

/**
 * Describes the possible transitions in a {@link Squeezer} widget.
 */
public enum SqueezerTransitionType {

    /**
     * No transition
     */
    NONE,
    
    /**
     * A cross-fade
     */
    CROSSFADE;
    
    public static SqueezerTransitionType fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> CROSSFADE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case CROSSFADE -> 1;
        };
    }

}
