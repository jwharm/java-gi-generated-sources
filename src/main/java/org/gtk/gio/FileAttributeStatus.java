package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used by g_file_set_attributes_from_info() when setting file attributes.
 */
public enum FileAttributeStatus implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Attribute value is unset (empty).
     */
    UNSET(0),
    
    /**
     * Attribute value is set.
     */
    SET(1),
    
    /**
     * Indicates an error in setting the value.
     */
    ERROR_SETTING(2);
    
    private static final java.lang.String C_TYPE_NAME = "GFileAttributeStatus";
    
    private final int value;
    
    /**
     * Create a new FileAttributeStatus for the provided value
     * @param numeric value the enum value
     */
    FileAttributeStatus(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new FileAttributeStatus for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static FileAttributeStatus of(int value) {
        return switch (value) {
            case 0 -> UNSET;
            case 1 -> SET;
            case 2 -> ERROR_SETTING;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
