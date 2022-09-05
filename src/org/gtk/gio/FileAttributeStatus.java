package org.gtk.gio;

/**
 * Used by g_file_set_attributes_from_info() when setting file attributes.
 */
public enum FileAttributeStatus {

    /**
     * Attribute value is unset (empty).
     */
    UNSET,
    
    /**
     * Attribute value is set.
     */
    SET,
    
    /**
     * Indicates an error in setting the value.
     */
    ERROR_SETTING;
    
    public static FileAttributeStatus fromValue(int value) {
        return switch(value) {
            case 0 -> UNSET;
            case 1 -> SET;
            case 2 -> ERROR_SETTING;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case UNSET -> 0;
            case SET -> 1;
            case ERROR_SETTING -> 2;
        };
    }

}
