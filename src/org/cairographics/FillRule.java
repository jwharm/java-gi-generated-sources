package org.cairographics;

public enum FillRule {

    WINDING,
    
    EVEN_ODD;
    
    public static FillRule fromValue(int value) {
        return switch(value) {
            case 0 -> WINDING;
            case 1 -> EVEN_ODD;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case WINDING -> 0;
            case EVEN_ODD -> 1;
        };
    }

}
