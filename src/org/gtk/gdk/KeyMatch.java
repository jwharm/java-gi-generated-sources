package org.gtk.gdk;

/**
 * Describes how well an event matches a given keyval and modifiers.
 * <p><code>GdkKeyMatch</code> values are returned by {@link org.gtk.gdk.KeyEvent#matches}.
 */
public enum KeyMatch {

    /**
     * The key event does not match
     */
    NONE,
    
    /**
     * The key event matches if keyboard state
     *   (specifically, the currently active group) is ignored
     */
    PARTIAL,
    
    /**
     * The key event matches
     */
    EXACT;
    
    public static KeyMatch fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> PARTIAL;
            case 2 -> EXACT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case PARTIAL -> 1;
            case EXACT -> 2;
        };
    }

}
