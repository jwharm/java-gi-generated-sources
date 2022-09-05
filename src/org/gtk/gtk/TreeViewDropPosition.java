package org.gtk.gtk;

/**
 * An enum for determining where a dropped row goes.
 */
public enum TreeViewDropPosition {

    /**
     * dropped row is inserted before
     */
    BEFORE,
    
    /**
     * dropped row is inserted after
     */
    AFTER,
    
    /**
     * dropped row becomes a child or is inserted before
     */
    INTO_OR_BEFORE,
    
    /**
     * dropped row becomes a child or is inserted after
     */
    INTO_OR_AFTER;
    
    public static TreeViewDropPosition fromValue(int value) {
        return switch(value) {
            case 0 -> BEFORE;
            case 1 -> AFTER;
            case 2 -> INTO_OR_BEFORE;
            case 3 -> INTO_OR_AFTER;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case BEFORE -> 0;
            case AFTER -> 1;
            case INTO_OR_BEFORE -> 2;
            case INTO_OR_AFTER -> 3;
        };
    }

}
