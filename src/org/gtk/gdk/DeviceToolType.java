package org.gtk.gdk;

/**
 * Indicates the specific type of tool being used being a tablet. Such as an
 * airbrush, pencil, etc.
 */
public enum DeviceToolType {

    /**
     * Tool is of an unknown type.
     */
    UNKNOWN,
    
    /**
     * Tool is a standard tablet stylus.
     */
    PEN,
    
    /**
     * Tool is standard tablet eraser.
     */
    ERASER,
    
    /**
     * Tool is a brush stylus.
     */
    BRUSH,
    
    /**
     * Tool is a pencil stylus.
     */
    PENCIL,
    
    /**
     * Tool is an airbrush stylus.
     */
    AIRBRUSH,
    
    /**
     * Tool is a mouse.
     */
    MOUSE,
    
    /**
     * Tool is a lens cursor.
     */
    LENS;
    
    public static DeviceToolType fromValue(int value) {
        return switch(value) {
            case 0 -> UNKNOWN;
            case 1 -> PEN;
            case 2 -> ERASER;
            case 3 -> BRUSH;
            case 4 -> PENCIL;
            case 5 -> AIRBRUSH;
            case 6 -> MOUSE;
            case 7 -> LENS;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case UNKNOWN -> 0;
            case PEN -> 1;
            case ERASER -> 2;
            case BRUSH -> 3;
            case PENCIL -> 4;
            case AIRBRUSH -> 5;
            case MOUSE -> 6;
            case LENS -> 7;
        };
    }

}
