package org.cairographics;

public enum Content {

    COLOR,
    
    ALPHA,
    
    COLOR_ALPHA;
    
    public static Content fromValue(int value) {
        return switch(value) {
            case 4096 -> COLOR;
            case 8192 -> ALPHA;
            case 12288 -> COLOR_ALPHA;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case COLOR -> 4096;
            case ALPHA -> 8192;
            case COLOR_ALPHA -> 12288;
        };
    }

}
