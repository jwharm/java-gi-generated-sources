package org.gtk.gtk;

/**
 * Possible transitions between pages in a {@code GtkStack} widget.
 * <p>
 * New values may be added to this enumeration over time.
 */
public enum StackTransitionType {

    /**
     * No transition
     */
    NONE,
    
    /**
     * A cross-fade
     */
    CROSSFADE,
    
    /**
     * Slide from left to right
     */
    SLIDE_RIGHT,
    
    /**
     * Slide from right to left
     */
    SLIDE_LEFT,
    
    /**
     * Slide from bottom up
     */
    SLIDE_UP,
    
    /**
     * Slide from top down
     */
    SLIDE_DOWN,
    
    /**
     * Slide from left or right according to the children order
     */
    SLIDE_LEFT_RIGHT,
    
    /**
     * Slide from top down or bottom up according to the order
     */
    SLIDE_UP_DOWN,
    
    /**
     * Cover the old page by sliding up
     */
    OVER_UP,
    
    /**
     * Cover the old page by sliding down
     */
    OVER_DOWN,
    
    /**
     * Cover the old page by sliding to the left
     */
    OVER_LEFT,
    
    /**
     * Cover the old page by sliding to the right
     */
    OVER_RIGHT,
    
    /**
     * Uncover the new page by sliding up
     */
    UNDER_UP,
    
    /**
     * Uncover the new page by sliding down
     */
    UNDER_DOWN,
    
    /**
     * Uncover the new page by sliding to the left
     */
    UNDER_LEFT,
    
    /**
     * Uncover the new page by sliding to the right
     */
    UNDER_RIGHT,
    
    /**
     * Cover the old page sliding up or uncover the new page sliding down, according to order
     */
    OVER_UP_DOWN,
    
    /**
     * Cover the old page sliding down or uncover the new page sliding up, according to order
     */
    OVER_DOWN_UP,
    
    /**
     * Cover the old page sliding left or uncover the new page sliding right, according to order
     */
    OVER_LEFT_RIGHT,
    
    /**
     * Cover the old page sliding right or uncover the new page sliding left, according to order
     */
    OVER_RIGHT_LEFT,
    
    /**
     * Pretend the pages are sides of a cube and rotate that cube to the left
     */
    ROTATE_LEFT,
    
    /**
     * Pretend the pages are sides of a cube and rotate that cube to the right
     */
    ROTATE_RIGHT,
    
    /**
     * Pretend the pages are sides of a cube and rotate that cube to the left or right according to the children order
     */
    ROTATE_LEFT_RIGHT;
    
    public static StackTransitionType fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> CROSSFADE;
            case 2 -> SLIDE_RIGHT;
            case 3 -> SLIDE_LEFT;
            case 4 -> SLIDE_UP;
            case 5 -> SLIDE_DOWN;
            case 6 -> SLIDE_LEFT_RIGHT;
            case 7 -> SLIDE_UP_DOWN;
            case 8 -> OVER_UP;
            case 9 -> OVER_DOWN;
            case 10 -> OVER_LEFT;
            case 11 -> OVER_RIGHT;
            case 12 -> UNDER_UP;
            case 13 -> UNDER_DOWN;
            case 14 -> UNDER_LEFT;
            case 15 -> UNDER_RIGHT;
            case 16 -> OVER_UP_DOWN;
            case 17 -> OVER_DOWN_UP;
            case 18 -> OVER_LEFT_RIGHT;
            case 19 -> OVER_RIGHT_LEFT;
            case 20 -> ROTATE_LEFT;
            case 21 -> ROTATE_RIGHT;
            case 22 -> ROTATE_LEFT_RIGHT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case CROSSFADE -> 1;
            case SLIDE_RIGHT -> 2;
            case SLIDE_LEFT -> 3;
            case SLIDE_UP -> 4;
            case SLIDE_DOWN -> 5;
            case SLIDE_LEFT_RIGHT -> 6;
            case SLIDE_UP_DOWN -> 7;
            case OVER_UP -> 8;
            case OVER_DOWN -> 9;
            case OVER_LEFT -> 10;
            case OVER_RIGHT -> 11;
            case UNDER_UP -> 12;
            case UNDER_DOWN -> 13;
            case UNDER_LEFT -> 14;
            case UNDER_RIGHT -> 15;
            case OVER_UP_DOWN -> 16;
            case OVER_DOWN_UP -> 17;
            case OVER_LEFT_RIGHT -> 18;
            case OVER_RIGHT_LEFT -> 19;
            case ROTATE_LEFT -> 20;
            case ROTATE_RIGHT -> 21;
            case ROTATE_LEFT_RIGHT -> 22;
        };
    }

}
