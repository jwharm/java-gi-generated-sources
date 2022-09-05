package org.gtk.gtk;

/**
 * Specifies the side of the entry at which an icon is placed.
 */
public enum EntryIconPosition {

    /**
     * At the beginning of the entry (depending on the text direction).
     */
    PRIMARY,
    
    /**
     * At the end of the entry (depending on the text direction).
     */
    SECONDARY;
    
    public static EntryIconPosition fromValue(int value) {
        return switch(value) {
            case 0 -> PRIMARY;
            case 1 -> SECONDARY;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case PRIMARY -> 0;
            case SECONDARY -> 1;
        };
    }

}
