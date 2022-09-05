package org.gtk.gtk;

/**
 * The mode of the size group determines the directions in which the size
 * group affects the requested sizes of its component widgets.
 */
public enum SizeGroupMode {

    /**
     * group has no effect
     */
    NONE,
    
    /**
     * group affects horizontal requisition
     */
    HORIZONTAL,
    
    /**
     * group affects vertical requisition
     */
    VERTICAL,
    
    /**
     * group affects both horizontal and vertical requisition
     */
    BOTH;
    
    public static SizeGroupMode fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> HORIZONTAL;
            case 2 -> VERTICAL;
            case 3 -> BOTH;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case HORIZONTAL -> 1;
            case VERTICAL -> 2;
            case BOTH -> 3;
        };
    }

}
