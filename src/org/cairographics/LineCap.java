package org.cairographics;

public enum LineCap {

    BUTT,
    
    ROUND,
    
    SQUARE;
    
    public static LineCap fromValue(int value) {
        return switch(value) {
            case 0 -> BUTT;
            case 1 -> ROUND;
            case 2 -> SQUARE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case BUTT -> 0;
            case ROUND -> 1;
            case SQUARE -> 2;
        };
    }

}
