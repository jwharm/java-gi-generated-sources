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
public class TlsCertificateRequestFlags extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GTlsCertificateRequestFlags";
    
    /**
     * No flags
     */
    public static final TlsCertificateRequestFlags NONE = new TlsCertificateRequestFlags(0);
    
    public TlsCertificateRequestFlags(int value) {
        super(value);
    }
}
