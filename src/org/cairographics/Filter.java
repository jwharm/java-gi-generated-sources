package org.cairographics;

public enum Filter {

    FAST,
    
    GOOD,
    
    BEST,
    
    NEAREST,
    
    BILINEAR,
    
    GAUSSIAN;
    
    public static Filter fromValue(int value) {
        return switch(value) {
            case 0 -> FAST;
            case 1 -> GOOD;
            case 2 -> BEST;
            case 3 -> NEAREST;
            case 4 -> BILINEAR;
            case 5 -> GAUSSIAN;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case FAST -> 0;
            case GOOD -> 1;
            case BEST -> 2;
            case NEAREST -> 3;
            case BILINEAR -> 4;
            case GAUSSIAN -> 5;
        };
    }

}
