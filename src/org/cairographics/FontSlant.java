package org.cairographics;

public enum FontSlant {

    NORMAL,
    
    ITALIC,
    
    OBLIQUE;
    
    public static FontSlant fromValue(int value) {
        return switch(value) {
            case 0 -> NORMAL;
            case 1 -> ITALIC;
            case 2 -> OBLIQUE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NORMAL -> 0;
            case ITALIC -> 1;
            case OBLIQUE -> 2;
        };
    }

}
