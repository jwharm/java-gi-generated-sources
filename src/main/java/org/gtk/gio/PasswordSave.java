package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link PasswordSave} is used to indicate the lifespan of a saved password.
 * <p>
 * {@code Gvfs} stores passwords in the Gnome keyring when this flag allows it
 * to, and later retrieves it again from there.
 */
public enum PasswordSave implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * never save a password.
     */
    NEVER(0),
    
    /**
     * save a password for the session.
     */
    FOR_SESSION(1),
    
    /**
     * save a password permanently.
     */
    PERMANENTLY(2);
    
    private static final java.lang.String C_TYPE_NAME = "GPasswordSave";
    
    private final int value;
    
    /**
     * Create a new PasswordSave for the provided value
     * @param numeric value the enum value
     */
    PasswordSave(int value) {
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
     * Create a new PasswordSave for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static PasswordSave of(int value) {
        return switch (value) {
            case 0 -> NEVER;
            case 1 -> FOR_SESSION;
            case 2 -> PERMANENTLY;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
