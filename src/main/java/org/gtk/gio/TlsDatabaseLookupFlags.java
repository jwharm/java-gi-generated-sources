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
public enum TlsDatabaseLookupFlags implements io.github.jwharm.javagi.Enumeration {
    /**
     * No lookup flags
     */
    NONE(0),
    /**
     * Restrict lookup to certificates that have
     *     a private key.
     */
    KEYPAIR(1);
    
    private static final java.lang.String C_TYPE_NAME = "GTlsDatabaseLookupFlags";
    
    private final int value;
    TlsDatabaseLookupFlags(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TlsDatabaseLookupFlags of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> KEYPAIR;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
