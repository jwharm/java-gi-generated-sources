package org.harfbuzz;

/**
 * The direction of a text segment or buffer.
 * <p>
 * A segment can also be tested for horizontal or vertical
 * orientation (irrespective of specific direction) with
 * HB_DIRECTION_IS_HORIZONTAL() or HB_DIRECTION_IS_VERTICAL().
 */
public enum DirectionT {

    /**
     * Initial, unset direction.
     */
    INVALID,
    
    /**
     * Text is set horizontally from left to right.
     */
    LTR,
    
    /**
     * Text is set horizontally from right to left.
     */
    RTL,
    
    /**
     * Text is set vertically from top to bottom.
     */
    TTB,
    
    /**
     * Text is set vertically from bottom to top.
     */
    BTT;
    
    public static DirectionT fromValue(int value) {
        return switch(value) {
            case 0 -> INVALID;
            case 4 -> LTR;
            case 5 -> RTL;
            case 6 -> TTB;
            case 7 -> BTT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INVALID -> 0;
            case LTR -> 4;
            case RTL -> 5;
            case TTB -> 6;
            case BTT -> 7;
        };
    }

}
