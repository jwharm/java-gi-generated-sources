package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags for g_tls_interaction_request_certificate(),
 * g_tls_interaction_request_certificate_async(), and
 * g_tls_interaction_invoke_request_certificate().
 * @version 2.40
 */
public enum TlsCertificateRequestFlags implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No flags
     */
    NONE(0);
    
    private static final java.lang.String C_TYPE_NAME = "GTlsCertificateRequestFlags";
    
    private final int value;
    
    /**
     * Create a new TlsCertificateRequestFlags for the provided value
     * @param numeric value the enum value
     */
    TlsCertificateRequestFlags(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new TlsCertificateRequestFlags for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TlsCertificateRequestFlags of(int value) {
        return switch (value) {
            case 0 -> NONE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
