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
public class PasswordSave extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GPasswordSave";
    
    /**
     * never save a password.
     */
    public static final PasswordSave NEVER = new PasswordSave(0);
    
    /**
     * save a password for the session.
     */
    public static final PasswordSave FOR_SESSION = new PasswordSave(1);
    
    /**
     * save a password permanently.
     */
    public static final PasswordSave PERMANENTLY = new PasswordSave(2);
    
    public PasswordSave(int value) {
        super(value);
    }
}
