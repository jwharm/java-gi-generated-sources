package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The client authentication mode for a {@link TlsServerConnection}.
 * @version 2.28
 */
public class TlsAuthenticationMode extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
