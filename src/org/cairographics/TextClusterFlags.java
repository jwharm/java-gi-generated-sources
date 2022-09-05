package org.cairographics;

public enum TextClusterFlags {

    BACKWARD;
    
    public static TextClusterFlags fromValue(int value) {
        return switch(value) {
            case 1 -> BACKWARD;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case BACKWARD -> 1;
        };
    }

}
