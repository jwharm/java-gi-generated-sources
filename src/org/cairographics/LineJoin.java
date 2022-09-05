package org.cairographics;

public enum LineJoin {

    MITER,
    
    ROUND,
    
    BEVEL;
    
    public static LineJoin fromValue(int value) {
        return switch(value) {
            case 0 -> MITER;
            case 1 -> ROUND;
            case 2 -> BEVEL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case MITER -> 0;
            case ROUND -> 1;
            case BEVEL -> 2;
        };
    }

}
