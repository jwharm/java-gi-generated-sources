package org.gtk.gtk;

/**
 * Describes where {@link [class@Shortcut]}s added to a
 * {@link [class@ShortcutController]} get handled.
 */
public enum ShortcutScope {

    /**
     * Shortcuts are handled inside
     *   the widget the controller belongs to.
     */
    LOCAL,
    
    /**
     * Shortcuts are handled by
     *   the first ancestor that is a {@link [iface@ShortcutManager] (ref=iface)}
     */
    MANAGED,
    
    /**
     * Shortcuts are handled by
     *   the root widget.
     */
    GLOBAL;
    
    public static ShortcutScope fromValue(int value) {
        return switch(value) {
            case 0 -> LOCAL;
            case 1 -> MANAGED;
            case 2 -> GLOBAL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case LOCAL -> 0;
            case MANAGED -> 1;
            case GLOBAL -> 2;
        };
    }

}
