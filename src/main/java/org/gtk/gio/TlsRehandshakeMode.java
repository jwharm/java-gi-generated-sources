package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * When to allow rehandshaking. See
 * g_tls_connection_set_rehandshake_mode().
 * @version 2.28
 */
public class TlsRehandshakeMode extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GTlsRehandshakeMode";
    
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
