package org.gtk.gio;

/**
 * Flags for g_tls_database_verify_chain().
 */
public class TlsDatabaseVerifyFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * No verification flags
     */
    public static final TlsDatabaseVerifyFlags NONE = new TlsDatabaseVerifyFlags(0);
    
    public TlsDatabaseVerifyFlags(int value) {
        super(value);
    }
    
}
