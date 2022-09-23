package org.gnome.adw;

/**
 * Describes title centering behavior of a {@link HeaderBar} widget.
 */
public enum CenteringPolicy {

    /**
     * Keep the title centered when possible
     */
    LOOSE,
    
    /**
     * Keep the title centered at all cost
     */
    STRICT;
    
    public static CenteringPolicy fromValue(int value) {
        return switch(value) {
            case 0 -> LOOSE;
            case 1 -> STRICT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case LOOSE -> 0;
            case STRICT -> 1;
        };
    }

}
