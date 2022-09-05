package org.cairographics;

public enum Extend {

    NONE,
    
    REPEAT,
    
    REFLECT,
    
    PAD;
    
    public static Extend fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> REPEAT;
            case 2 -> REFLECT;
            case 3 -> PAD;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case REPEAT -> 1;
            case REFLECT -> 2;
            case PAD -> 3;
        };
    }

}
