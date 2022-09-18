package org.gtk.gio;

/**
 * A set of flags describing TLS certification validation. This can be
 * used to describe why a particular certificate was rejected (for
 * example, in {@link org.gtk.gio.TlsConnection} :accept-certificate).
 * 
 * GLib guarantees that if certificate verification fails, at least one
 * flag will be set, but it does not guarantee that all possible flags
 * will be set. Accordingly, you may not safely decide to ignore any
 * particular type of error. For example, it would be incorrect to mask
 * {@link org.gtk.gio.TlsCertificateFlags<code>#EXPIRED</code>  if you want to allow expired certificates,
 * because this could potentially be the only error flag set even if
 * other problems exist with the certificate.
 */
public class TlsCertificateFlags {

    /**
     * The signing certificate authority is
     *   not known.
     */
    public static final int UNKNOWN_CA = 1;
    
    /**
     * The certificate does not match the
     *   expected identity of the site that it was retrieved from.
     */
    public static final int BAD_IDENTITY = 2;
    
    /**
     * The certificate&<code>#39</code> s activation time
     *   is still in the future
     */
    public static final int NOT_ACTIVATED = 4;
    
    /**
     * The certificate has expired
     */
    public static final int EXPIRED = 8;
    
    /**
     * The certificate has been revoked
     *   according to the {@link org.gtk.gio.TlsConnection} <code>#39</code> s certificate revocation list.
     */
    public static final int REVOKED = 16;
    
    /**
     * The certificate&<code>#39</code> s algorithm is
     *   considered insecure.
     */
    public static final int INSECURE = 32;
    
    /**
     * Some other error occurred validating
     *   the certificate
     */
    public static final int GENERIC_ERROR = 64;
    
    /**
     * the combination of all of the above
     *   flags
     */
    public static final int VALIDATE_ALL = 127;
    
}
