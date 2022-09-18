package org.gtk.gio;

/**
 * Various flags for the password.
 */
public class TlsPasswordFlags {

    /**
     * No flags
     */
    public static final int NONE = 0;
    
    /**
     * The password was wrong, and the user should retry.
     */
    public static final int RETRY = 2;
    
    /**
     * Hint to the user that the password has been
     *    wrong many times, and the user may not have many chances left.
     */
    public static final int MANY_TRIES = 4;
    
    /**
     * Hint to the user that this is the last try to get
     *    this password right.
     */
    public static final int FINAL_TRY = 8;
    
    /**
     * For PKCS <code>#11</code>  the user PIN is required.
     *    Since: 2.70.
     */
    public static final int PKCS11_USER = 16;
    
    /**
     * For PKCS <code>#11</code>  the security officer
     *    PIN is required. Since: 2.70.
     */
    public static final int PKCS11_SECURITY_OFFICER = 32;
    
    /**
     * For PKCS <code>#11</code>  the context-specific
     *    PIN is required. Since: 2.70.
     */
    public static final int PKCS11_CONTEXT_SPECIFIC = 64;
    
}
