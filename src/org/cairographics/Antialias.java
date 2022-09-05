package org.cairographics;

public enum Antialias {

    DEFAULT,
    
    NONE,
    
    GRAY,
    
    SUBPIXEL,
    
    FAST,
    
    GOOD,
    
    BEST;
    
    public static Antialias fromValue(int value) {
        return switch(value) {
            case 0 -> DEFAULT;
            case 1 -> NONE;
            case 2 -> GRAY;
            case 3 -> SUBPIXEL;
            case 4 -> FAST;
            case 5 -> GOOD;
            case 6 -> BEST;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case DEFAULT -> 0;
            case NONE -> 1;
            case GRAY -> 2;
            case SUBPIXEL -> 3;
            case FAST -> 4;
            case GOOD -> 5;
            case BEST -> 6;
        };
    }

}
