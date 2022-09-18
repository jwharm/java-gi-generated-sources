package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A certificate used for TLS authentication and encryption.
 * This can represent either a certificate only (eg, the certificate
 * received by a client from a server), or the combination of
 * a certificate and a private key (which is needed when acting as a
 * {@link org.gtk.gio.TlsServerConnection} .
 */
public class TlsCertificate extends org.gtk.gobject.Object {

    public TlsCertificate(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TlsCertificate */
    public static TlsCertificate castFrom(org.gtk.gobject.Object gobject) {
        return new TlsCertificate(gobject.getReference());
    }
    
    private static Reference constructNewFromFile(java.lang.String file) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_tls_certificate_new_from_file(Interop.allocateNativeString(file).handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link org.gtk.gio.TlsCertificate} from the data in @file.
     * <p>
     * As of 2.72, if the filename ends in <code>.p12</code> or <code>.pfx</code> the data is loaded by
     * g_tls_certificate_new_from_pkcs12() otherwise it is loaded by
     * g_tls_certificate_new_from_pem(). See those functions for
     * exact details.
     * 
     * If @file cannot be read or parsed, the function will return <code>null</code> and
     * set @error.
     */
    public static TlsCertificate newFromFile(java.lang.String file) throws GErrorException {
        return new TlsCertificate(constructNewFromFile(file));
    }
    
    private static Reference constructNewFromFileWithPassword(java.lang.String file, java.lang.String password) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_tls_certificate_new_from_file_with_password(Interop.allocateNativeString(file).handle(), Interop.allocateNativeString(password).handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link org.gtk.gio.TlsCertificate} from the data in @file.
     * <p>
     * If @file cannot be read or parsed, the function will return <code>null</code> and
     * set @error.
     * <p>
     * Any unknown file types will error with {@link org.gtk.gio.IOErrorEnum<code>#NOT_SUPPORTED</code>  
     * Currently only <code>.p12</code> and <code>.pfx</code> files are supported.
     * See g_tls_certificate_new_from_pkcs12() for more details.
     */
    public static TlsCertificate newFromFileWithPassword(java.lang.String file, java.lang.String password) throws GErrorException {
        return new TlsCertificate(constructNewFromFileWithPassword(file, password));
    }
    
    private static Reference constructNewFromFiles(java.lang.String certFile, java.lang.String keyFile) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_tls_certificate_new_from_files(Interop.allocateNativeString(certFile).handle(), Interop.allocateNativeString(keyFile).handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link org.gtk.gio.TlsCertificate} from the PEM-encoded data in @cert_file
     * and @key_file. The returned certificate will be the first certificate
     * found in @cert_file. As of GLib 2.44, if @cert_file contains more
     * certificates it will try to load a certificate chain. All
     * certificates will be verified in the order found (top-level
     * certificate should be the last one in the file) and the
     * {@link org.gtk.gio.TlsCertificate} issuer property of each certificate will be set
     * accordingly if the verification succeeds. If any certificate in the
     * chain cannot be verified, the first certificate in the file will
     * still be returned.
     * 
     * If either file cannot be read or parsed, the function will return
     * <code>null</code> and set @error. Otherwise, this behaves like
     * g_tls_certificate_new_from_pem().
     */
    public static TlsCertificate newFromFiles(java.lang.String certFile, java.lang.String keyFile) throws GErrorException {
        return new TlsCertificate(constructNewFromFiles(certFile, keyFile));
    }
    
    private static Reference constructNewFromPem(java.lang.String data, long length) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_tls_certificate_new_from_pem(Interop.allocateNativeString(data).handle(), length, GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link org.gtk.gio.TlsCertificate} from the PEM-encoded data in @data. If
     * @data includes both a certificate and a private key, then the
     * returned certificate will include the private key data as well. (See
     * the {@link org.gtk.gio.TlsCertificate} private-key-pem property for information about
     * supported formats.)
     * 
     * The returned certificate will be the first certificate found in
     * @data. As of GLib 2.44, if @data contains more certificates it will
     * try to load a certificate chain. All certificates will be verified in
     * the order found (top-level certificate should be the last one in the
     * file) and the {@link org.gtk.gio.TlsCertificate} issuer property of each certificate
     * will be set accordingly if the verification succeeds. If any
     * certificate in the chain cannot be verified, the first certificate in
     * the file will still be returned.
     */
    public static TlsCertificate newFromPem(java.lang.String data, long length) throws GErrorException {
        return new TlsCertificate(constructNewFromPem(data, length));
    }
    
    private static Reference constructNewFromPkcs11Uris(java.lang.String pkcs11Uri, java.lang.String privateKeyPkcs11Uri) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_tls_certificate_new_from_pkcs11_uris(Interop.allocateNativeString(pkcs11Uri).handle(), Interop.allocateNativeString(privateKeyPkcs11Uri).handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link org.gtk.gio.TlsCertificate} from a
     * {@link [PKCS \\<code>#11</code> }(https://docs.oasis-open.org/pkcs11/pkcs11-base/v3.0/os/pkcs11-base-v3.0-os.html) URI.
     * <p>
     * An example @pkcs11_uri would be <code>pkcs11:model=Model;manufacturer=Manufacture;serial=1;token=My<code>20Client</code> 20Certificate;id=<code>01</code> /code>
     * 
     * Where the token&<code>#8217</code> s layout is:
     * 
     * |{@link [
     * Object 0:
     *   URL: pkcs11:model=Model;manufacturer=Manufacture;serial=1;token=My<code>20Client</code> 20Certificate;id=<code>01</code> object=private<code>20key</code> type=private
     *   Type: Private key (RSA-2048)
     *   ID: 01
     * 
     * Object 1:
     *   URL: pkcs11:model=Model;manufacturer=Manufacture;serial=1;token=My<code>20Client</code> 20Certificate;id=<code>01</code> object=Certificate<code>20for</code> 20Authentication;type=cert
     *   Type: X.509 Certificate (RSA-2048)
     *   ID: 01
     * ]}|
     * 
     * In this case the certificate and private key would both be detected and used as expected.
     * @pkcs_uri may also just reference an X.509 certificate object and then optionally
     * @private_key_pkcs11_uri allows using a private key exposed under a different URI.
     * 
     * Note that the private key is not accessed until usage and may fail or require a PIN later.
     */
    public static TlsCertificate newFromPkcs11Uris(java.lang.String pkcs11Uri, java.lang.String privateKeyPkcs11Uri) throws GErrorException {
        return new TlsCertificate(constructNewFromPkcs11Uris(pkcs11Uri, privateKeyPkcs11Uri));
    }
    
    private static Reference constructNewFromPkcs12(byte[] data, long length, java.lang.String password) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_tls_certificate_new_from_pkcs12(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), length, Interop.allocateNativeString(password).handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link org.gtk.gio.TlsCertificate} from the data in @data. It must contain
     * a certificate and matching private key.
     * 
     * If extra certificates are included they will be verified as a chain
     * and the {@link org.gtk.gio.TlsCertificate} issuer property will be set.
     * All other data will be ignored.
     * 
     * You can pass as single password for all of the data which will be
     * used both for the PKCS <code>#12</code> container as well as encrypted
     * private keys. If decryption fails it will error with
     * {@link org.gtk.gio.TlsError<code>#BAD_CERTIFICATE_PASSWORD</code>  
     * 
     * This constructor requires support in the current {@link org.gtk.gio.TlsBackend} 
     * If support is missing it will error with
     * {@link org.gtk.gio.IOErrorEnum<code>#NOT_SUPPORTED</code>  
     * 
     * Other parsing failures will error with {@link org.gtk.gio.TlsError<code>#BAD_CERTIFICATE</code>
     */
    public static TlsCertificate newFromPkcs12(byte[] data, long length, java.lang.String password) throws GErrorException {
        return new TlsCertificate(constructNewFromPkcs12(data, length, password));
    }
    
    /**
     * Gets the {@link org.gtk.gio.TlsCertificate} representing @cert&<code>#39</code> s issuer, if known
     */
    public TlsCertificate getIssuer() {
        var RESULT = gtk_h.g_tls_certificate_get_issuer(handle());
        return new TlsCertificate(References.get(RESULT, false));
    }
    
    /**
     * Returns the issuer name from the certificate.
     */
    public java.lang.String getIssuerName() {
        var RESULT = gtk_h.g_tls_certificate_get_issuer_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the time at which the certificate became or will become invalid.
     */
    public org.gtk.glib.DateTime getNotValidAfter() {
        var RESULT = gtk_h.g_tls_certificate_get_not_valid_after(handle());
        return new org.gtk.glib.DateTime(References.get(RESULT, true));
    }
    
    /**
     * Returns the time at which the certificate became or will become valid.
     */
    public org.gtk.glib.DateTime getNotValidBefore() {
        var RESULT = gtk_h.g_tls_certificate_get_not_valid_before(handle());
        return new org.gtk.glib.DateTime(References.get(RESULT, true));
    }
    
    /**
     * Returns the subject name from the certificate.
     */
    public java.lang.String getSubjectName() {
        var RESULT = gtk_h.g_tls_certificate_get_subject_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Check if two {@link org.gtk.gio.TlsCertificate} objects represent the same certificate.
     * The raw DER byte data of the two certificates are checked for equality.
     * This has the effect that two certificates may compare equal even if
     * their {@link org.gtk.gio.TlsCertificate} issuer, {@link org.gtk.gio.TlsCertificate} private-key, or
     * {@link org.gtk.gio.TlsCertificate} private-key-pem properties differ.
     */
    public boolean isSame(TlsCertificate certTwo) {
        var RESULT = gtk_h.g_tls_certificate_is_same(handle(), certTwo.handle());
        return (RESULT != 0);
    }
    
    /**
     * This verifies @cert and returns a set of {@link org.gtk.gio.TlsCertificateFlags} indicating any problems found with it. This can be used to verify a
     * certificate outside the context of making a connection, or to
     * check a certificate against a CA that is not part of the system
     * CA database.
     * 
     * If @identity is not <code>null</code>  @cert&<code>#39</code> s name(s) will be compared against
     * it, and {@link org.gtk.gio.TlsCertificateFlags<code>#BAD_IDENTITY</code>  will be set in the return
     * value if it does not match. If @identity is <code>null</code>  that bit will
     * never be set in the return value.
     * 
     * If @trusted_ca is not <code>null</code>  then @cert (or one of the certificates
     * in its chain) must be signed by it, or else
     * {@link org.gtk.gio.TlsCertificateFlags<code>#UNKNOWN_CA</code>  will be set in the return value. If
     * @trusted_ca is <code>null</code>  that bit will never be set in the return
     * value.
     * 
     * GLib guarantees that if certificate verification fails, at least one
     * error will be set in the return value, but it does not guarantee
     * that all possible errors will be set. Accordingly, you may not safely
     * decide to ignore any particular type of error. For example, it would
     * be incorrect to mask {@link org.gtk.gio.TlsCertificateFlags<code>#EXPIRED</code>  if you want to allow
     * expired certificates, because this could potentially be the only
     * error flag set even if other problems exist with the certificate.
     * 
     * Because TLS session context is not used, {@link org.gtk.gio.TlsCertificate} may not
     * perform as many checks on the certificates as {@link org.gtk.gio.TlsConnection} would.
     * For example, certificate constraints may not be honored, and
     * revocation checks may not be performed. The best way to verify TLS
     * certificates used by a TLS connection is to let {@link org.gtk.gio.TlsConnection} handle the verification.
     */
    public int verify(SocketConnectable identity, TlsCertificate trustedCa) {
        var RESULT = gtk_h.g_tls_certificate_verify(handle(), identity.handle(), trustedCa.handle());
        return RESULT;
    }
    
    /**
     * Creates one or more <code>#GTlsCertificates</code> from the PEM-encoded
     * data in @file. If @file cannot be read or parsed, the function will
     * return <code>null</code> and set @error. If @file does not contain any
     * PEM-encoded certificates, this will return an empty list and not
     * set @error.
     */
    public static org.gtk.glib.List listNewFromFile(java.lang.String file) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_tls_certificate_list_new_from_file(Interop.allocateNativeString(file).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
}
