package org.gtk.glib;

public enum TestResult {

    SUCCESS,
    
    SKIPPED,
    
    FAILURE,
    
    INCOMPLETE;
    
    public static TestResult fromValue(int value) {
        return switch(value) {
            case 0 -> SUCCESS;
            case 1 -> SKIPPED;
            case 2 -> FAILURE;
            case 3 -> INCOMPLETE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case SUCCESS -> 0;
            case SKIPPED -> 1;
            case FAILURE -> 2;
            case INCOMPLETE -> 3;
        };
    }

}
