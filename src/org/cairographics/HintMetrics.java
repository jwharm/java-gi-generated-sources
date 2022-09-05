package org.cairographics;

public enum HintMetrics {

    DEFAULT,
    
    OFF,
    
    ON;
    
    public static HintMetrics fromValue(int value) {
        return switch(value) {
            case 0 -> DEFAULT;
            case 1 -> OFF;
            case 2 -> ON;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case DEFAULT -> 0;
            case OFF -> 1;
            case ON -> 2;
        };
    }

}
