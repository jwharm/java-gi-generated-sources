package org.cairographics;

public enum RegionOverlap {

    IN,
    
    OUT,
    
    PART;
    
    public static RegionOverlap fromValue(int value) {
        return switch(value) {
            case 0 -> IN;
            case 1 -> OUT;
            case 2 -> PART;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case IN -> 0;
            case OUT -> 1;
            case PART -> 2;
        };
    }

}
