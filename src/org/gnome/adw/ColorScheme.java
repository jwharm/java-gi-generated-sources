package org.gnome.adw;

/**
 * Application color schemes for {@code StyleManager:color-scheme}.
 */
public enum ColorScheme {

    /**
     * Inherit the parent color-scheme. When set on the
     *   {@code AdwStyleManager} returned by {@link StyleManager#getDefault}, it's
     *   equivalent to {@code ADW_COLOR_SCHEME_PREFER_LIGHT}.
     */
    DEFAULT,
    
    /**
     * Always use light appearance.
     */
    FORCE_LIGHT,
    
    /**
     * Use light appearance unless the system
     *   prefers dark colors.
     */
    PREFER_LIGHT,
    
    /**
     * Use dark appearance unless the system prefers
     *   prefers light colors.
     */
    PREFER_DARK,
    
    /**
     * Always use dark appearance.
     */
    FORCE_DARK;
    
    public static ColorScheme fromValue(int value) {
        return switch(value) {
            case 0 -> DEFAULT;
            case 1 -> FORCE_LIGHT;
            case 2 -> PREFER_LIGHT;
            case 3 -> PREFER_DARK;
            case 4 -> FORCE_DARK;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case DEFAULT -> 0;
            case FORCE_LIGHT -> 1;
            case PREFER_LIGHT -> 2;
            case PREFER_DARK -> 3;
            case FORCE_DARK -> 4;
        };
    }

}
