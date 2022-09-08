package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A certificate used for TLS authentication and encryption.
 * This can represent either a certificate only (eg, the certificate
 * received by a client from a server), or the combination of
 * a certificate and a private key (which is needed when acting as a
 * #GTlsServerConnection).
 */
public class TlsCertificate extends org.gtk.gobject.Object {

    public TlsCertificate(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TlsCertificate */
    public static TlsCertificate castFrom(org.gtk.gobject.Object gobject) {
        return new TlsCertificate(gobject.getReference());
    }
    
    /**
     * Gets the #GTlsCertificate representing @cert's issuer, if known
     */
    public TlsCertificate getIssuer() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_certificate_get_issuer(HANDLE());
        return new TlsCertificate(References.get(RESULT, false));
    }
    
    /**
     * Returns the issuer name from the certificate.
     */
    public java.lang.String getIssuerName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_certificate_get_issuer_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the time at which the certificate became or will become invalid.
     */
    public org.gtk.glib.DateTime getNotValidAfter() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_certificate_get_not_valid_after(HANDLE());
        return new org.gtk.glib.DateTime(References.get(RESULT, true));
    }
    
    /**
     * Returns the time at which the certificate became or will become valid.
     */
    public org.gtk.glib.DateTime getNotValidBefore() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_certificate_get_not_valid_before(HANDLE());
        return new org.gtk.glib.DateTime(References.get(RESULT, true));
    }
    
    /**
     * Returns the subject name from the certificate.
     */
    public java.lang.String getSubjectName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_certificate_get_subject_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Check if two #GTlsCertificate objects represent the same certificate.
     * The raw DER byte data of the two certificates are checked for equality.
     * This has the effect that two certificates may compare equal even if
     * their #GTlsCertificate:issuer, #GTlsCertificate:private-key, or
     * #GTlsCertificate:private-key-pem properties differ.
     */
    public boolean isSame(TlsCertificate certTwo) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_certificate_is_same(HANDLE(), certTwo.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * This verifies @cert and returns a set of #GTlsCertificateFlags
     * indicating any problems found with it. This can be used to verify a
     * certificate outside the context of making a connection, or to
     * check a certificate against a CA that is not part of the system
     * CA database.
     * 
     * If @identity is not %NULL, @cert's name(s) will be compared against
     * it, and %G_TLS_CERTIFICATE_BAD_IDENTITY will be set in the return
     * value if it does not match. If @identity is %NULL, that bit will
     * never be set in the return value.
     * 
     * If @trusted_ca is not %NULL, then @cert (or one of the certificates
     * in its chain) must be signed by it, or else
     * %G_TLS_CERTIFICATE_UNKNOWN_CA will be set in the return value. If
     * @trusted_ca is %NULL, that bit will never be set in the return
     * value.
     * 
     * GLib guarantees that if certificate verification fails, at least one
     * error will be set in the return value, but it does not guarantee
     * that all possible errors will be set. Accordingly, you may not safely
     * decide to ignore any particular type of error. For example, it would
     * be incorrect to mask %G_TLS_CERTIFICATE_EXPIRED if you want to allow
     * expired certificates, because this could potentially be the only
     * error flag set even if other problems exist with the certificate.
     * 
     * Because TLS session context is not used, #GTlsCertificate may not
     * perform as many checks on the certificates as #GTlsConnection would.
     * For example, certificate constraints may not be honored, and
     * revocation checks may not be performed. The best way to verify TLS
     * certificates used by a TLS connection is to let #GTlsConnection
     * handle the verification.
     */
    public int verify(SocketConnectable identity, TlsCertificate trustedCa) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_certificate_verify(HANDLE(), identity.HANDLE(), trustedCa.HANDLE());
        return RESULT;
    }
    
}
