package org.gnome.adw;

/**
 * Describes the adaptive modes of {@link ViewSwitcher}.
 */
public enum ViewSwitcherPolicy {

    /**
     * Force the narrow mode
     */
    NARROW,
    
    /**
     * Force the wide mode
     */
    WIDE;
    
    public static ViewSwitcherPolicy fromValue(int value) {
        return switch(value) {
            case 0 -> NARROW;
            case 1 -> WIDE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NARROW -> 0;
            case WIDE -> 1;
        };
    }

}
