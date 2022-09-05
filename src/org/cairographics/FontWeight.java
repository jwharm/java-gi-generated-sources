package org.cairographics;

public enum FontWeight {

    NORMAL,
    
    BOLD;
    
    public static FontWeight fromValue(int value) {
        return switch(value) {
            case 0 -> NORMAL;
            case 1 -> BOLD;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NORMAL -> 0;
            case BOLD -> 1;
        };
    }

}
