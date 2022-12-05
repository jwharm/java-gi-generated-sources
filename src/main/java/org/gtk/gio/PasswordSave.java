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
    PasswordSave(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PasswordSave of(int value) {
        return switch (value) {
            case 0 -> NEVER;
            case 1 -> FOR_SESSION;
            case 2 -> PERMANENTLY;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
