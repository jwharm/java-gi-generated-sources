package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags for g_tls_database_verify_chain().
 * @version 2.30
 */
public class TlsDatabaseVerifyFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GTlsDatabaseVerifyFlags";
    
    /**
     * No verification flags
     */
    public static final TlsDatabaseVerifyFlags NONE = new TlsDatabaseVerifyFlags(0);
    
    /**
     * Create a new TlsDatabaseVerifyFlags with the provided value
     */
    public TlsDatabaseVerifyFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public TlsDatabaseVerifyFlags or(TlsDatabaseVerifyFlags... masks) {
        int value = this.getValue();
        for (TlsDatabaseVerifyFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TlsDatabaseVerifyFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static TlsDatabaseVerifyFlags combined(TlsDatabaseVerifyFlags mask, TlsDatabaseVerifyFlags... masks) {
        int value = mask.getValue();
        for (TlsDatabaseVerifyFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TlsDatabaseVerifyFlags(value);
    }
}
