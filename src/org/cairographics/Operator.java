package org.cairographics;

public enum Operator {

    CLEAR,
    
    SOURCE,
    
    OVER,
    
    IN,
    
    OUT,
    
    ATOP,
    
    DEST,
    
    DEST_OVER,
    
    DEST_IN,
    
    DEST_OUT,
    
    DEST_ATOP,
    
    XOR,
    
    ADD,
    
    SATURATE,
    
    MULTIPLY,
    
    SCREEN,
    
    OVERLAY,
    
    DARKEN,
    
    LIGHTEN,
    
    COLOR_DODGE,
    
    COLOR_BURN,
    
    HARD_LIGHT,
    
    SOFT_LIGHT,
    
    DIFFERENCE,
    
    EXCLUSION,
    
    HSL_HUE,
    
    HSL_SATURATION,
    
    HSL_COLOR,
    
    HSL_LUMINOSITY;
    
    public static Operator fromValue(int value) {
        return switch(value) {
            case 0 -> CLEAR;
            case 1 -> SOURCE;
            case 2 -> OVER;
            case 3 -> IN;
            case 4 -> OUT;
            case 5 -> ATOP;
            case 6 -> DEST;
            case 7 -> DEST_OVER;
            case 8 -> DEST_IN;
            case 9 -> DEST_OUT;
            case 10 -> DEST_ATOP;
            case 11 -> XOR;
            case 12 -> ADD;
            case 13 -> SATURATE;
            case 14 -> MULTIPLY;
            case 15 -> SCREEN;
            case 16 -> OVERLAY;
            case 17 -> DARKEN;
            case 18 -> LIGHTEN;
            case 19 -> COLOR_DODGE;
            case 20 -> COLOR_BURN;
            case 21 -> HARD_LIGHT;
            case 22 -> SOFT_LIGHT;
            case 23 -> DIFFERENCE;
            case 24 -> EXCLUSION;
            case 25 -> HSL_HUE;
            case 26 -> HSL_SATURATION;
            case 27 -> HSL_COLOR;
            case 28 -> HSL_LUMINOSITY;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case CLEAR -> 0;
            case SOURCE -> 1;
            case OVER -> 2;
            case IN -> 3;
            case OUT -> 4;
            case ATOP -> 5;
            case DEST -> 6;
            case DEST_OVER -> 7;
            case DEST_IN -> 8;
            case DEST_OUT -> 9;
            case DEST_ATOP -> 10;
            case XOR -> 11;
            case ADD -> 12;
            case SATURATE -> 13;
            case MULTIPLY -> 14;
            case SCREEN -> 15;
            case OVERLAY -> 16;
            case DARKEN -> 17;
            case LIGHTEN -> 18;
            case COLOR_DODGE -> 19;
            case COLOR_BURN -> 20;
            case HARD_LIGHT -> 21;
            case SOFT_LIGHT -> 22;
            case DIFFERENCE -> 23;
            case EXCLUSION -> 24;
            case HSL_HUE -> 25;
            case HSL_SATURATION -> 26;
            case HSL_COLOR -> 27;
            case HSL_LUMINOSITY -> 28;
        };
    }

}
