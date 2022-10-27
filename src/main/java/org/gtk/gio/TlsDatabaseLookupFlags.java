package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags for g_tls_database_lookup_certificate_for_handle(),
 * g_tls_database_lookup_certificate_issuer(),
 * and g_tls_database_lookup_certificates_issued_by().
 * @version 2.30
 */
public class TlsDatabaseLookupFlags extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * No lookup flags
     */
    public static final TlsDatabaseLookupFlags NONE = new TlsDatabaseLookupFlags(0);
    
    /**
     * Restrict lookup to certificates that have
     *     a private key.
     */
    public static final TlsDatabaseLookupFlags KEYPAIR = new TlsDatabaseLookupFlags(1);
    
    public TlsDatabaseLookupFlags(int value) {
        super(value);
    }
}
