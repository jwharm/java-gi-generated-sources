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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
