package org.cairographics;

public enum PathDataType {

    MOVE_TO,
    
    LINE_TO,
    
    CURVE_TO,
    
    CLOSE_PATH;
    
    public static PathDataType fromValue(int value) {
        return switch(value) {
            case 0 -> MOVE_TO;
            case 1 -> LINE_TO;
            case 2 -> CURVE_TO;
            case 3 -> CLOSE_PATH;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case MOVE_TO -> 0;
            case LINE_TO -> 1;
            case CURVE_TO -> 2;
            case CLOSE_PATH -> 3;
        };
    }

}
