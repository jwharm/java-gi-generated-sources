package org.cairographics;

public enum Format {

    INVALID,
    
    ARGB32,
    
    RGB24,
    
    A8,
    
    A1,
    
    RGB16_565,
    
    RGB30;
    
    public static Format fromValue(int value) {
        return switch(value) {
            case -1 -> INVALID;
            case 0 -> ARGB32;
            case 1 -> RGB24;
            case 2 -> A8;
            case 3 -> A1;
            case 4 -> RGB16_565;
            case 5 -> RGB30;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INVALID -> -1;
            case ARGB32 -> 0;
            case RGB24 -> 1;
            case A8 -> 2;
            case A1 -> 3;
            case RGB16_565 -> 4;
            case RGB30 -> 5;
        };
    }

}
