package org.cairographics;

public enum FontType {

    TOY,
    
    FT,
    
    WIN32,
    
    QUARTZ,
    
    USER;
    
    public static FontType fromValue(int value) {
        return switch(value) {
            case 0 -> TOY;
            case 1 -> FT;
            case 2 -> WIN32;
            case 3 -> QUARTZ;
            case 4 -> USER;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case TOY -> 0;
            case FT -> 1;
            case WIN32 -> 2;
            case QUARTZ -> 3;
            case USER -> 4;
        };
    }

}
