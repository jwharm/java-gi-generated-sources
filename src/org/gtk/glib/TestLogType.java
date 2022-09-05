package org.gtk.glib;

public enum TestLogType {

    NONE,
    
    ERROR,
    
    START_BINARY,
    
    LIST_CASE,
    
    SKIP_CASE,
    
    START_CASE,
    
    STOP_CASE,
    
    MIN_RESULT,
    
    MAX_RESULT,
    
    MESSAGE,
    
    START_SUITE,
    
    STOP_SUITE;
    
    public static TestLogType fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> ERROR;
            case 2 -> START_BINARY;
            case 3 -> LIST_CASE;
            case 4 -> SKIP_CASE;
            case 5 -> START_CASE;
            case 6 -> STOP_CASE;
            case 7 -> MIN_RESULT;
            case 8 -> MAX_RESULT;
            case 9 -> MESSAGE;
            case 10 -> START_SUITE;
            case 11 -> STOP_SUITE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case ERROR -> 1;
            case START_BINARY -> 2;
            case LIST_CASE -> 3;
            case SKIP_CASE -> 4;
            case START_CASE -> 5;
            case STOP_CASE -> 6;
            case MIN_RESULT -> 7;
            case MAX_RESULT -> 8;
            case MESSAGE -> 9;
            case START_SUITE -> 10;
            case STOP_SUITE -> 11;
        };
    }

}
