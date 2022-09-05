package org.cairographics;

public enum SubpixelOrder {

    DEFAULT,
    
    RGB,
    
    BGR,
    
    VRGB,
    
    VBGR;
    
    public static SubpixelOrder fromValue(int value) {
        return switch(value) {
            case 0 -> DEFAULT;
            case 1 -> RGB;
            case 2 -> BGR;
            case 3 -> VRGB;
            case 4 -> VBGR;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case DEFAULT -> 0;
            case RGB -> 1;
            case BGR -> 2;
            case VRGB -> 3;
            case VBGR -> 4;
        };
    }

}
