package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Various flags for the password.
 * @version 2.30
 */
public class TlsPasswordFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GTlsPasswordFlags";
    
    /**
     * No flags
     */
    public static final TlsPasswordFlags NONE = new TlsPasswordFlags(0);
    
    /**
     * The password was wrong, and the user should retry.
     */
    public static final TlsPasswordFlags RETRY = new TlsPasswordFlags(2);
    
    /**
     * Hint to the user that the password has been
     *    wrong many times, and the user may not have many chances left.
     */
    public static final TlsPasswordFlags MANY_TRIES = new TlsPasswordFlags(4);
    
    /**
     * Hint to the user that this is the last try to get
     *    this password right.
     */
    public static final TlsPasswordFlags FINAL_TRY = new TlsPasswordFlags(8);
    
    /**
     * For PKCS {@code 11}, the user PIN is required.
     *    Since: 2.70.
     */
    public static final TlsPasswordFlags PKCS11_USER = new TlsPasswordFlags(16);
    
    /**
     * For PKCS {@code 11}, the security officer
     *    PIN is required. Since: 2.70.
     */
    public static final TlsPasswordFlags PKCS11_SECURITY_OFFICER = new TlsPasswordFlags(32);
    
    /**
     * For PKCS {@code 11}, the context-specific
     *    PIN is required. Since: 2.70.
     */
    public static final TlsPasswordFlags PKCS11_CONTEXT_SPECIFIC = new TlsPasswordFlags(64);
    
    public TlsPasswordFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public TlsPasswordFlags combined(TlsPasswordFlags mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static TlsPasswordFlags combined(TlsPasswordFlags mask, TlsPasswordFlags... masks) {
        for (TlsPasswordFlags arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
