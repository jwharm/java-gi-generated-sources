package org.gtk.gtk;

/**
 * Scrolling types.
 */
public enum ScrollType {

    /**
     * No scrolling.
     */
    NONE,
    
    /**
     * Jump to new location.
     */
    JUMP,
    
    /**
     * Step backward.
     */
    STEP_BACKWARD,
    
    /**
     * Step forward.
     */
    STEP_FORWARD,
    
    /**
     * Page backward.
     */
    PAGE_BACKWARD,
    
    /**
     * Page forward.
     */
    PAGE_FORWARD,
    
    /**
     * Step up.
     */
    STEP_UP,
    
    /**
     * Step down.
     */
    STEP_DOWN,
    
    /**
     * Page up.
     */
    PAGE_UP,
    
    /**
     * Page down.
     */
    PAGE_DOWN,
    
    /**
     * Step to the left.
     */
    STEP_LEFT,
    
    /**
     * Step to the right.
     */
    STEP_RIGHT,
    
    /**
     * Page to the left.
     */
    PAGE_LEFT,
    
    /**
     * Page to the right.
     */
    PAGE_RIGHT,
    
    /**
     * Scroll to start.
     */
    START,
    
    /**
     * Scroll to end.
     */
    END;
    
    public static ScrollType fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> JUMP;
            case 2 -> STEP_BACKWARD;
            case 3 -> STEP_FORWARD;
            case 4 -> PAGE_BACKWARD;
            case 5 -> PAGE_FORWARD;
            case 6 -> STEP_UP;
            case 7 -> STEP_DOWN;
            case 8 -> PAGE_UP;
            case 9 -> PAGE_DOWN;
            case 10 -> STEP_LEFT;
            case 11 -> STEP_RIGHT;
            case 12 -> PAGE_LEFT;
            case 13 -> PAGE_RIGHT;
            case 14 -> START;
            case 15 -> END;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case JUMP -> 1;
            case STEP_BACKWARD -> 2;
            case STEP_FORWARD -> 3;
            case PAGE_BACKWARD -> 4;
            case PAGE_FORWARD -> 5;
            case STEP_UP -> 6;
            case STEP_DOWN -> 7;
            case PAGE_UP -> 8;
            case PAGE_DOWN -> 9;
            case STEP_LEFT -> 10;
            case STEP_RIGHT -> 11;
            case PAGE_LEFT -> 12;
            case PAGE_RIGHT -> 13;
            case START -> 14;
            case END -> 15;
        };
    }

}
