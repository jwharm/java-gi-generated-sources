package org.gtk.gtk;

/**
 * Defines how content overflowing a given area should be handled.
 * <p>
 * This is used in {@link Widget#setOverflow}. The
 * {@code Gtk.Widget:overflow} property is modeled after the
 * CSS overflow property, but implements it only partially.
 */
public enum Overflow {

    /**
     * No change is applied. Content is drawn at the specified
     *   position.
     */
    VISIBLE,
    
    /**
     * Content is clipped to the bounds of the area. Content
     *   outside the area is not drawn and cannot be interacted with.
     */
    HIDDEN;
    
    public static Overflow fromValue(int value) {
        return switch(value) {
            case 0 -> VISIBLE;
            case 1 -> HIDDEN;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case VISIBLE -> 0;
            case HIDDEN -> 1;
        };
    }

}
