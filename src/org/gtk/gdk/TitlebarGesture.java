package org.gtk.gdk;

public enum TitlebarGesture {

    DOUBLE_CLICK,
    
    RIGHT_CLICK,
    
    MIDDLE_CLICK;
    
    public static TitlebarGesture fromValue(int value) {
        return switch(value) {
            case 1 -> DOUBLE_CLICK;
            case 2 -> RIGHT_CLICK;
            case 3 -> MIDDLE_CLICK;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case DOUBLE_CLICK -> 1;
            case RIGHT_CLICK -> 2;
            case MIDDLE_CLICK -> 3;
        };
    }

}
