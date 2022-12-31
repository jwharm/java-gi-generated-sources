package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A set of flags describing TLS certification validation. This can be
 * used to describe why a particular certificate was rejected (for
 * example, in {@link TlsConnection}::accept-certificate).
 * <p>
 * GLib guarantees that if certificate verification fails, at least one
 * flag will be set, but it does not guarantee that all possible flags
 * will be set. Accordingly, you may not safely decide to ignore any
 * particular type of error. For example, it would be incorrect to mask
 * {@link TlsCertificateFlags#EXPIRED} if you want to allow expired certificates,
 * because this could potentially be the only error flag set even if
 * other problems exist with the certificate.
 * @version 2.28
 */
public class TlsCertificateFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GTlsCertificateFlags";
    
    /**
     * No flags set. Since: 2.74
     */
    public static final TlsCertificateFlags NO_FLAGS = new TlsCertificateFlags(0);
    
    /**
     * The signing certificate authority is
     *   not known.
     */
    public static final TlsCertificateFlags UNKNOWN_CA = new TlsCertificateFlags(1);
    
    /**
     * The certificate does not match the
     *   expected identity of the site that it was retrieved from.
     */
    public static final TlsCertificateFlags BAD_IDENTITY = new TlsCertificateFlags(2);
    
    /**
     * The certificate's activation time
     *   is still in the future
     */
    public static final TlsCertificateFlags NOT_ACTIVATED = new TlsCertificateFlags(4);
    
    /**
     * The certificate has expired
     */
    public static final TlsCertificateFlags EXPIRED = new TlsCertificateFlags(8);
    
    /**
     * The certificate has been revoked
     *   according to the {@link TlsConnection}'s certificate revocation list.
     */
    public static final TlsCertificateFlags REVOKED = new TlsCertificateFlags(16);
    
    /**
     * The certificate's algorithm is
     *   considered insecure.
     */
    public static final TlsCertificateFlags INSECURE = new TlsCertificateFlags(32);
    
    /**
     * Some other error occurred validating
     *   the certificate
     */
    public static final TlsCertificateFlags GENERIC_ERROR = new TlsCertificateFlags(64);
    
    /**
     * the combination of all of the above
     *   flags
     */
    public static final TlsCertificateFlags VALIDATE_ALL = new TlsCertificateFlags(127);
    
    public TlsCertificateFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public TlsCertificateFlags or(TlsCertificateFlags... masks) {
        int value = this.getValue();
        for (TlsCertificateFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TlsCertificateFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static TlsCertificateFlags combined(TlsCertificateFlags mask, TlsCertificateFlags... masks) {
        int value = mask.getValue();
        for (TlsCertificateFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TlsCertificateFlags(value);
    }
}
