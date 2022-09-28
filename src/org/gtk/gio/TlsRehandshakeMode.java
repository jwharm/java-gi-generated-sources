package org.gtk.gio;

/**
 * When to allow rehandshaking. See
 * g_tls_connection_set_rehandshake_mode().
 */
public class TlsRehandshakeMode extends io.github.jwharm.javagi.Enumeration {

    /**
     * Never allow rehandshaking
     */
    public static final TlsRehandshakeMode NEVER = new TlsRehandshakeMode(0);
    
    /**
     * Allow safe rehandshaking only
     */
    public static final TlsRehandshakeMode SAFELY = new TlsRehandshakeMode(1);
    
    /**
     * Allow unsafe rehandshaking
     */
    public static final TlsRehandshakeMode UNSAFELY = new TlsRehandshakeMode(2);
    
    public TlsRehandshakeMode(int value) {
        super(value);
    }
    
}
