package org.cairographics;

public enum PatternType {

    SOLID,
    
    SURFACE,
    
    LINEAR,
    
    RADIAL,
    
    MESH,
    
    RASTER_SOURCE;
    
    public static PatternType fromValue(int value) {
        return switch(value) {
            case 0 -> SOLID;
            case 1 -> SURFACE;
            case 2 -> LINEAR;
            case 3 -> RADIAL;
            case 4 -> MESH;
            case 5 -> RASTER_SOURCE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case SOLID -> 0;
            case SURFACE -> 1;
            case LINEAR -> 2;
            case RADIAL -> 3;
            case MESH -> 4;
            case RASTER_SOURCE -> 5;
        };
    }

}
