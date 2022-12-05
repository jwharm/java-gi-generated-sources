package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link AskPasswordFlags} are used to request specific information from the
 * user, or to notify the user of their choices in an authentication
 * situation.
 */
public class AskPasswordFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GAskPasswordFlags";
    
    /**
     * operation requires a password.
     */
    public static final AskPasswordFlags NEED_PASSWORD = new AskPasswordFlags(1);
    
    /**
     * operation requires a username.
     */
    public static final AskPasswordFlags NEED_USERNAME = new AskPasswordFlags(2);
    
    /**
     * operation requires a domain.
     */
    public static final AskPasswordFlags NEED_DOMAIN = new AskPasswordFlags(4);
    
    /**
     * operation supports saving settings.
     */
    public static final AskPasswordFlags SAVING_SUPPORTED = new AskPasswordFlags(8);
    
    /**
     * operation supports anonymous users.
     */
    public static final AskPasswordFlags ANONYMOUS_SUPPORTED = new AskPasswordFlags(16);
    
    /**
     * operation takes TCRYPT parameters (Since: 2.58)
     */
    public static final AskPasswordFlags TCRYPT = new AskPasswordFlags(32);
    
    public AskPasswordFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public AskPasswordFlags or(AskPasswordFlags mask) {
        return new AskPasswordFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static AskPasswordFlags combined(AskPasswordFlags mask, AskPasswordFlags... masks) {
        int value = mask.getValue();        for (AskPasswordFlags arg : masks) {
            value |= arg.getValue();
        }
        return new AskPasswordFlags(value);
    }
}
