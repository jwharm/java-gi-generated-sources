package org.gtk.glib;

public enum SliceConfig {

    ALWAYS_MALLOC,
    
    BYPASS_MAGAZINES,
    
    WORKING_SET_MSECS,
    
    COLOR_INCREMENT,
    
    CHUNK_SIZES,
    
    CONTENTION_COUNTER;
    
    public static SliceConfig fromValue(int value) {
        return switch(value) {
            case 1 -> ALWAYS_MALLOC;
            case 2 -> BYPASS_MAGAZINES;
            case 3 -> WORKING_SET_MSECS;
            case 4 -> COLOR_INCREMENT;
            case 5 -> CHUNK_SIZES;
            case 6 -> CONTENTION_COUNTER;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case ALWAYS_MALLOC -> 1;
            case BYPASS_MAGAZINES -> 2;
            case WORKING_SET_MSECS -> 3;
            case COLOR_INCREMENT -> 4;
            case CHUNK_SIZES -> 5;
            case CONTENTION_COUNTER -> 6;
        };
    }

}
