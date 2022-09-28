package org.gtk.gio;

/**
 * The client authentication mode for a {@link TlsServerConnection}.
 */
public class TlsAuthenticationMode extends io.github.jwharm.javagi.Enumeration {

    /**
     * client authentication not required
     */
    public static final TlsAuthenticationMode NONE = new TlsAuthenticationMode(0);
    
    /**
     * client authentication is requested
     */
    public static final TlsAuthenticationMode REQUESTED = new TlsAuthenticationMode(1);
    
    /**
     * client authentication is required
     */
    public static final TlsAuthenticationMode REQUIRED = new TlsAuthenticationMode(2);
    
    public TlsAuthenticationMode(int value) {
        super(value);
    }
    
}
