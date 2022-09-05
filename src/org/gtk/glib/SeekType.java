package org.gtk.glib;

/**
 * An enumeration specifying the base position for a
 * g_io_channel_seek_position() operation.
 */
public enum SeekType {

    /**
     * the current position in the file.
     */
    CUR,
    
    /**
     * the start of the file.
     */
    SET,
    
    /**
     * the end of the file.
     */
    END;
    
    public static SeekType fromValue(int value) {
        return switch(value) {
            case 0 -> CUR;
            case 1 -> SET;
            case 2 -> END;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case CUR -> 0;
            case SET -> 1;
            case END -> 2;
        };
    }

}
