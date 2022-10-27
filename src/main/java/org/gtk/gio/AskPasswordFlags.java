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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
}
