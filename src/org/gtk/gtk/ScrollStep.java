package org.gtk.gtk;

/**
 * Passed as argument to various keybinding signals.
 */
public enum ScrollStep {

    /**
     * Scroll in steps.
     */
    STEPS,
    
    /**
     * Scroll by pages.
     */
    PAGES,
    
    /**
     * Scroll to ends.
     */
    ENDS,
    
    /**
     * Scroll in horizontal steps.
     */
    HORIZONTAL_STEPS,
    
    /**
     * Scroll by horizontal pages.
     */
    HORIZONTAL_PAGES,
    
    /**
     * Scroll to the horizontal ends.
     */
    HORIZONTAL_ENDS;
    
    public static ScrollStep fromValue(int value) {
        return switch(value) {
            case 0 -> STEPS;
            case 1 -> PAGES;
            case 2 -> ENDS;
            case 3 -> HORIZONTAL_STEPS;
            case 4 -> HORIZONTAL_PAGES;
            case 5 -> HORIZONTAL_ENDS;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case STEPS -> 0;
            case PAGES -> 1;
            case ENDS -> 2;
            case HORIZONTAL_STEPS -> 3;
            case HORIZONTAL_PAGES -> 4;
            case HORIZONTAL_ENDS -> 5;
        };
    }

}
