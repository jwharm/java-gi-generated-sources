package org.cairographics;

public enum HintStyle {

    DEFAULT,
    
    NONE,
    
    SLIGHT,
    
    MEDIUM,
    
    FULL;
    
    public static HintStyle fromValue(int value) {
        return switch(value) {
            case 0 -> DEFAULT;
            case 1 -> NONE;
            case 2 -> SLIGHT;
            case 3 -> MEDIUM;
            case 4 -> FULL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case DEFAULT -> 0;
            case NONE -> 1;
            case SLIGHT -> 2;
            case MEDIUM -> 3;
            case FULL -> 4;
        };
    }

}
