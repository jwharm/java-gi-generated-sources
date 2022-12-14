package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A certificate used for TLS authentication and encryption.
 * This can represent either a certificate only (eg, the certificate
 * received by a client from a server), or the combination of
 * a certificate and a private key (which is needed when acting as a
 * {@link TlsServerConnection}).
 * @version 2.28
 */
public class TlsCertificate extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTlsCertificate";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a TlsCertificate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TlsCertificate(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TlsCertificate> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TlsCertificate(input);
    
    private static MemoryAddress constructNewFromFile(java.lang.String file) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_tls_certificate_new_from_file.invokeExact(Marshal.stringToAddress.marshal(file, SCOPE),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a {@link TlsCertificate} from the data in {@code file}.
     * <p>
     * As of 2.72, if the filename ends in {@code .p12} or {@code .pfx} the data is loaded by
     * g_tls_certificate_new_from_pkcs12() otherwise it is loaded by
     * g_tls_certificate_new_from_pem(). See those functions for
     * exact details.
     * <p>
     * If {@code file} cannot be read or parsed, the function will return {@code null} and
     * set {@code error}.
     * @param file file containing a certificate to import
     * @return the new certificate, or {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static TlsCertificate newFromFile(java.lang.String file) throws GErrorException {
        var RESULT = constructNewFromFile(file);
        var OBJECT = (org.gtk.gio.TlsCertificate) Interop.register(RESULT, org.gtk.gio.TlsCertificate.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromFileWithPassword(java.lang.String file, java.lang.String password) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_tls_certificate_new_from_file_with_password.invokeExact(
                        Marshal.stringToAddress.marshal(file, SCOPE),
                        Marshal.stringToAddress.marshal(password, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a {@link TlsCertificate} from the data in {@code file}.
     * <p>
     * If {@code file} cannot be read or parsed, the function will return {@code null} and
     * set {@code error}.
     * <p>
     * Any unknown file types will error with {@link IOErrorEnum#NOT_SUPPORTED}.
     * Currently only {@code .p12} and {@code .pfx} files are supported.
     * See g_tls_certificate_new_from_pkcs12() for more details.
     * @param file file containing a certificate to import
     * @param password password for PKCS {@code 12} files
     * @return the new certificate, or {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static TlsCertificate newFromFileWithPassword(java.lang.String file, java.lang.String password) throws GErrorException {
        var RESULT = constructNewFromFileWithPassword(file, password);
        var OBJECT = (org.gtk.gio.TlsCertificate) Interop.register(RESULT, org.gtk.gio.TlsCertificate.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromFiles(java.lang.String certFile, java.lang.String keyFile) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_tls_certificate_new_from_files.invokeExact(
                        Marshal.stringToAddress.marshal(certFile, SCOPE),
                        Marshal.stringToAddress.marshal(keyFile, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a {@link TlsCertificate} from the PEM-encoded data in {@code cert_file}
     * and {@code key_file}. The returned certificate will be the first certificate
     * found in {@code cert_file}. As of GLib 2.44, if {@code cert_file} contains more
     * certificates it will try to load a certificate chain. All
     * certificates will be verified in the order found (top-level
     * certificate should be the last one in the file) and the
     * {@link TlsCertificate}:issuer property of each certificate will be set
     * accordingly if the verification succeeds. If any certificate in the
     * chain cannot be verified, the first certificate in the file will
     * still be returned.
     * <p>
     * If either file cannot be read or parsed, the function will return
     * {@code null} and set {@code error}. Otherwise, this behaves like
     * g_tls_certificate_new_from_pem().
     * @param certFile file containing one or more PEM-encoded
     *     certificates to import
     * @param keyFile file containing a PEM-encoded private key
     *     to import
     * @return the new certificate, or {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static TlsCertificate newFromFiles(java.lang.String certFile, java.lang.String keyFile) throws GErrorException {
        var RESULT = constructNewFromFiles(certFile, keyFile);
        var OBJECT = (org.gtk.gio.TlsCertificate) Interop.register(RESULT, org.gtk.gio.TlsCertificate.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromPem(java.lang.String data, long length) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_tls_certificate_new_from_pem.invokeExact(
                        Marshal.stringToAddress.marshal(data, SCOPE),
                        length,
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a {@link TlsCertificate} from the PEM-encoded data in {@code data}. If
     * {@code data} includes both a certificate and a private key, then the
     * returned certificate will include the private key data as well. (See
     * the {@link TlsCertificate}:private-key-pem property for information about
     * supported formats.)
     * <p>
     * The returned certificate will be the first certificate found in
     * {@code data}. As of GLib 2.44, if {@code data} contains more certificates it will
     * try to load a certificate chain. All certificates will be verified in
     * the order found (top-level certificate should be the last one in the
     * file) and the {@link TlsCertificate}:issuer property of each certificate
     * will be set accordingly if the verification succeeds. If any
     * certificate in the chain cannot be verified, the first certificate in
     * the file will still be returned.
     * @param data PEM-encoded certificate data
     * @param length the length of {@code data}, or -1 if it's 0-terminated.
     * @return the new certificate, or {@code null} if {@code data} is invalid
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static TlsCertificate newFromPem(java.lang.String data, long length) throws GErrorException {
        var RESULT = constructNewFromPem(data, length);
        var OBJECT = (org.gtk.gio.TlsCertificate) Interop.register(RESULT, org.gtk.gio.TlsCertificate.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromPkcs11Uris(java.lang.String pkcs11Uri, @Nullable java.lang.String privateKeyPkcs11Uri) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_tls_certificate_new_from_pkcs11_uris.invokeExact(
                        Marshal.stringToAddress.marshal(pkcs11Uri, SCOPE),
                        (Addressable) (privateKeyPkcs11Uri == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(privateKeyPkcs11Uri, SCOPE)),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a {@link TlsCertificate} from a
     * <a href="https://docs.oasis-open.org/pkcs11/pkcs11-base/v3.0/os/pkcs11-base-v3.0-os.html">PKCS \\#11</a> URI.
     * <p>
     * An example {@code pkcs11_uri} would be {@code pkcs11:model=Model;manufacturer=Manufacture;serial=1;token=My%20Client%20Certificate;id=%01}
     * <p>
     * Where the token???s layout is:
     * <pre>{@code 
     * Object 0:
     *   URL: pkcs11:model=Model;manufacturer=Manufacture;serial=1;token=My%20Client%20Certificate;id=%01;object=private%20key;type=private
     *   Type: Private key (RSA-2048)
     *   ID: 01
     * 
     * Object 1:
     *   URL: pkcs11:model=Model;manufacturer=Manufacture;serial=1;token=My%20Client%20Certificate;id=%01;object=Certificate%20for%20Authentication;type=cert
     *   Type: X.509 Certificate (RSA-2048)
     *   ID: 01
     * }</pre>
     * <p>
     * In this case the certificate and private key would both be detected and used as expected.
     * {@code pkcs_uri} may also just reference an X.509 certificate object and then optionally
     * {@code private_key_pkcs11_uri} allows using a private key exposed under a different URI.
     * <p>
     * Note that the private key is not accessed until usage and may fail or require a PIN later.
     * @param pkcs11Uri A PKCS \\{@code 11} URI
     * @param privateKeyPkcs11Uri A PKCS \\{@code 11} URI
     * @return the new certificate, or {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static TlsCertificate newFromPkcs11Uris(java.lang.String pkcs11Uri, @Nullable java.lang.String privateKeyPkcs11Uri) throws GErrorException {
        var RESULT = constructNewFromPkcs11Uris(pkcs11Uri, privateKeyPkcs11Uri);
        var OBJECT = (org.gtk.gio.TlsCertificate) Interop.register(RESULT, org.gtk.gio.TlsCertificate.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromPkcs12(byte[] data, long length, @Nullable java.lang.String password) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_tls_certificate_new_from_pkcs12.invokeExact(
                        Interop.allocateNativeArray(data, false, SCOPE),
                        length,
                        (Addressable) (password == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(password, SCOPE)),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a {@link TlsCertificate} from the data in {@code data}. It must contain
     * a certificate and matching private key.
     * <p>
     * If extra certificates are included they will be verified as a chain
     * and the {@link TlsCertificate}:issuer property will be set.
     * All other data will be ignored.
     * <p>
     * You can pass as single password for all of the data which will be
     * used both for the PKCS {@code 12} container as well as encrypted
     * private keys. If decryption fails it will error with
     * {@link TlsError#BAD_CERTIFICATE_PASSWORD}.
     * <p>
     * This constructor requires support in the current {@link TlsBackend}.
     * If support is missing it will error with
     * {@link IOErrorEnum#NOT_SUPPORTED}.
     * <p>
     * Other parsing failures will error with {@link TlsError#BAD_CERTIFICATE}.
     * @param data DER-encoded PKCS {@code 12} format certificate data
     * @param length the length of {@code data}
     * @param password optional password for encrypted certificate data
     * @return the new certificate, or {@code null} if {@code data} is invalid
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static TlsCertificate newFromPkcs12(byte[] data, long length, @Nullable java.lang.String password) throws GErrorException {
        var RESULT = constructNewFromPkcs12(data, length, password);
        var OBJECT = (org.gtk.gio.TlsCertificate) Interop.register(RESULT, org.gtk.gio.TlsCertificate.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the value of {@link TlsCertificate}:dns-names.
     * @return A {@link org.gtk.glib.PtrArray} of
     * {@link org.gtk.glib.Bytes} elements, or {@code null} if it's not available.
     */
    public @Nullable PointerProxy<org.gtk.glib.Bytes> getDnsNames() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_tls_certificate_get_dns_names.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerProxy<org.gtk.glib.Bytes>(RESULT, org.gtk.glib.Bytes.fromAddress);
        }
    }
    
    /**
     * Gets the value of {@link TlsCertificate}:ip-addresses.
     * @return A {@link org.gtk.glib.PtrArray}
     * of {@link InetAddress} elements, or {@code null} if it's not available.
     */
    public @Nullable PointerProxy<org.gtk.gio.InetAddress> getIpAddresses() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_tls_certificate_get_ip_addresses.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerProxy<org.gtk.gio.InetAddress>(RESULT, org.gtk.gio.InetAddress.fromAddress);
        }
    }
    
    /**
     * Gets the {@link TlsCertificate} representing {@code cert}'s issuer, if known
     * @return The certificate of {@code cert}'s issuer,
     * or {@code null} if {@code cert} is self-signed or signed with an unknown
     * certificate.
     */
    public @Nullable org.gtk.gio.TlsCertificate getIssuer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_certificate_get_issuer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.TlsCertificate) Interop.register(RESULT, org.gtk.gio.TlsCertificate.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns the issuer name from the certificate.
     * @return The issuer name, or {@code null} if it's not available.
     */
    public @Nullable java.lang.String getIssuerName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_certificate_get_issuer_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the time at which the certificate became or will become invalid.
     * @return The not-valid-after date, or {@code null} if it's not available.
     */
    public @Nullable org.gtk.glib.DateTime getNotValidAfter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_certificate_get_not_valid_after.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.DateTime.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Returns the time at which the certificate became or will become valid.
     * @return The not-valid-before date, or {@code null} if it's not available.
     */
    public @Nullable org.gtk.glib.DateTime getNotValidBefore() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_certificate_get_not_valid_before.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.DateTime.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Returns the subject name from the certificate.
     * @return The subject name, or {@code null} if it's not available.
     */
    public @Nullable java.lang.String getSubjectName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_certificate_get_subject_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Check if two {@link TlsCertificate} objects represent the same certificate.
     * The raw DER byte data of the two certificates are checked for equality.
     * This has the effect that two certificates may compare equal even if
     * their {@link TlsCertificate}:issuer, {@link TlsCertificate}:private-key, or
     * {@link TlsCertificate}:private-key-pem properties differ.
     * @param certTwo second certificate to compare
     * @return whether the same or not
     */
    public boolean isSame(org.gtk.gio.TlsCertificate certTwo) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tls_certificate_is_same.invokeExact(
                    handle(),
                    certTwo.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * This verifies {@code cert} and returns a set of {@link TlsCertificateFlags}
     * indicating any problems found with it. This can be used to verify a
     * certificate outside the context of making a connection, or to
     * check a certificate against a CA that is not part of the system
     * CA database.
     * <p>
     * If {@code cert} is valid, {@link TlsCertificateFlags#NO_FLAGS} is returned.
     * <p>
     * If {@code identity} is not {@code null}, {@code cert}'s name(s) will be compared against
     * it, and {@link TlsCertificateFlags#BAD_IDENTITY} will be set in the return
     * value if it does not match. If {@code identity} is {@code null}, that bit will
     * never be set in the return value.
     * <p>
     * If {@code trusted_ca} is not {@code null}, then {@code cert} (or one of the certificates
     * in its chain) must be signed by it, or else
     * {@link TlsCertificateFlags#UNKNOWN_CA} will be set in the return value. If
     * {@code trusted_ca} is {@code null}, that bit will never be set in the return
     * value.
     * <p>
     * GLib guarantees that if certificate verification fails, at least one
     * error will be set in the return value, but it does not guarantee
     * that all possible errors will be set. Accordingly, you may not safely
     * decide to ignore any particular type of error. For example, it would
     * be incorrect to mask {@link TlsCertificateFlags#EXPIRED} if you want to allow
     * expired certificates, because this could potentially be the only
     * error flag set even if other problems exist with the certificate.
     * <p>
     * Because TLS session context is not used, {@link TlsCertificate} may not
     * perform as many checks on the certificates as {@link TlsConnection} would.
     * For example, certificate constraints may not be honored, and
     * revocation checks may not be performed. The best way to verify TLS
     * certificates used by a TLS connection is to let {@link TlsConnection}
     * handle the verification.
     * @param identity the expected peer identity
     * @param trustedCa the certificate of a trusted authority
     * @return the appropriate {@link TlsCertificateFlags}
     */
    public org.gtk.gio.TlsCertificateFlags verify(@Nullable org.gtk.gio.SocketConnectable identity, @Nullable org.gtk.gio.TlsCertificate trustedCa) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tls_certificate_verify.invokeExact(
                    handle(),
                    (Addressable) (identity == null ? MemoryAddress.NULL : identity.handle()),
                    (Addressable) (trustedCa == null ? MemoryAddress.NULL : trustedCa.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.TlsCertificateFlags(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tls_certificate_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Creates one or more {@code GTlsCertificates} from the PEM-encoded
     * data in {@code file}. If {@code file} cannot be read or parsed, the function will
     * return {@code null} and set {@code error}. If {@code file} does not contain any
     * PEM-encoded certificates, this will return an empty list and not
     * set {@code error}.
     * @param file file containing PEM-encoded certificates to import
     * @return a
     * {@link org.gtk.glib.List} containing {@link TlsCertificate} objects. You must free the list
     * and its contents when you are done with it.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static org.gtk.glib.List listNewFromFile(java.lang.String file) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_tls_certificate_list_new_from_file.invokeExact(Marshal.stringToAddress.marshal(file, SCOPE),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * A {@link TlsCertificate.Builder} object constructs a {@link TlsCertificate} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TlsCertificate.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link TlsCertificate} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TlsCertificate}.
         * @return A new instance of {@code TlsCertificate} with the properties 
         *         that were set in the Builder object.
         */
        public TlsCertificate build() {
            return (TlsCertificate) org.gtk.gobject.GObject.newWithProperties(
                TlsCertificate.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The PEM (ASCII) encoded representation of the certificate.
         * This property and the {@link TlsCertificate}:certificate
         * property represent the same data, just in different forms.
         * @param certificatePem The value for the {@code certificate-pem} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCertificatePem(java.lang.String certificatePem) {
            names.add("certificate-pem");
            values.add(org.gtk.gobject.Value.create(certificatePem));
            return this;
        }
        
        /**
         * A {@link TlsCertificate} representing the entity that issued this
         * certificate. If {@code null}, this means that the certificate is either
         * self-signed, or else the certificate of the issuer is not
         * available.
         * <p>
         * Beware the issuer certificate may not be the same as the
         * certificate that would actually be used to construct a valid
         * certification path during certificate verification.
         * <a href="https://datatracker.ietf.org/doc/html/rfc4158">RFC 4158</a> explains
         * why an issuer certificate cannot be naively assumed to be part of the
         * the certification path (though GLib's TLS backends may not follow the
         * path building strategies outlined in this RFC). Due to the complexity
         * of certification path building, GLib does not provide any way to know
         * which certification path will actually be used. Accordingly, this
         * property cannot be used to make security-related decisions. Only
         * GLib itself should make security decisions about TLS certificates.
         * @param issuer The value for the {@code issuer} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIssuer(org.gtk.gio.TlsCertificate issuer) {
            names.add("issuer");
            values.add(org.gtk.gobject.Value.create(issuer));
            return this;
        }
        
        /**
         * The issuer from the certificate,
         * {@code null} if unavailable.
         * @param issuerName The value for the {@code issuer-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIssuerName(java.lang.String issuerName) {
            names.add("issuer-name");
            values.add(org.gtk.gobject.Value.create(issuerName));
            return this;
        }
        
        /**
         * The time at which this cert is no longer valid,
         * {@code null} if unavailable.
         * @param notValidAfter The value for the {@code not-valid-after} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNotValidAfter(org.gtk.glib.DateTime notValidAfter) {
            names.add("not-valid-after");
            values.add(org.gtk.gobject.Value.create(notValidAfter));
            return this;
        }
        
        /**
         * The time at which this cert is considered to be valid,
         * {@code null} if unavailable.
         * @param notValidBefore The value for the {@code not-valid-before} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNotValidBefore(org.gtk.glib.DateTime notValidBefore) {
            names.add("not-valid-before");
            values.add(org.gtk.gobject.Value.create(notValidBefore));
            return this;
        }
        
        /**
         * An optional password used when constructed with GTlsCertificate:pkcs12-data.
         * @param password The value for the {@code password} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPassword(java.lang.String password) {
            names.add("password");
            values.add(org.gtk.gobject.Value.create(password));
            return this;
        }
        
        /**
         * A URI referencing the <a href="https://docs.oasis-open.org/pkcs11/pkcs11-base/v3.0/os/pkcs11-base-v3.0-os.html">PKCS \\#11</a>
         * objects containing an X.509 certificate and optionally a private key.
         * <p>
         * If {@code null}, the certificate is either not backed by PKCS \\{@code 11} or the
         * {@link TlsBackend} does not support PKCS \\{@code 11}.
         * @param pkcs11Uri The value for the {@code pkcs11-uri} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPkcs11Uri(java.lang.String pkcs11Uri) {
            names.add("pkcs11-uri");
            values.add(org.gtk.gobject.Value.create(pkcs11Uri));
            return this;
        }
        
        /**
         * The PEM (ASCII) encoded representation of the certificate's
         * private key in either <a href="https://datatracker.ietf.org/doc/html/rfc8017">PKCS \\#1 format</a>
         * ("{@code BEGIN RSA PRIVATE KEY}") or unencrypted
         * <a href="https://datatracker.ietf.org/doc/html/rfc5208">PKCS \\#8 format</a>
         * ("{@code BEGIN PRIVATE KEY}"). PKCS \\{@code 8} format is supported since 2.32;
         * earlier releases only support PKCS \\{@code 1}. You can use the {@code openssl rsa}
         * tool to convert PKCS \\{@code 8} keys to PKCS \\{@code 1}.
         * <p>
         * This property (or the {@link TlsCertificate}:private-key property)
         * can be set when constructing a key (for example, from a file).
         * Since GLib 2.70, it is now also readable; however, be aware that if
         * the private key is backed by a PKCS \\{@code 11} URI - for example, if it
         * is stored on a smartcard - then this property will be {@code null}. If so,
         * the private key must be referenced via its PKCS \\{@code 11} URI,
         * {@link TlsCertificate}:private-key-pkcs11-uri. You must check both
         * properties to see if the certificate really has a private key.
         * When this property is read, the output format will be unencrypted
         * PKCS \\{@code 8}.
         * @param privateKeyPem The value for the {@code private-key-pem} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPrivateKeyPem(java.lang.String privateKeyPem) {
            names.add("private-key-pem");
            values.add(org.gtk.gobject.Value.create(privateKeyPem));
            return this;
        }
        
        /**
         * A URI referencing a <a href="https://docs.oasis-open.org/pkcs11/pkcs11-base/v3.0/os/pkcs11-base-v3.0-os.html">PKCS \\#11</a>
         * object containing a private key.
         * @param privateKeyPkcs11Uri The value for the {@code private-key-pkcs11-uri} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPrivateKeyPkcs11Uri(java.lang.String privateKeyPkcs11Uri) {
            names.add("private-key-pkcs11-uri");
            values.add(org.gtk.gobject.Value.create(privateKeyPkcs11Uri));
            return this;
        }
        
        /**
         * The subject from the cert,
         * {@code null} if unavailable.
         * @param subjectName The value for the {@code subject-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSubjectName(java.lang.String subjectName) {
            names.add("subject-name");
            values.add(org.gtk.gobject.Value.create(subjectName));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_tls_certificate_new_from_file = Interop.downcallHandle(
                "g_tls_certificate_new_from_file",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tls_certificate_new_from_file_with_password = Interop.downcallHandle(
                "g_tls_certificate_new_from_file_with_password",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tls_certificate_new_from_files = Interop.downcallHandle(
                "g_tls_certificate_new_from_files",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tls_certificate_new_from_pem = Interop.downcallHandle(
                "g_tls_certificate_new_from_pem",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tls_certificate_new_from_pkcs11_uris = Interop.downcallHandle(
                "g_tls_certificate_new_from_pkcs11_uris",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tls_certificate_new_from_pkcs12 = Interop.downcallHandle(
                "g_tls_certificate_new_from_pkcs12",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tls_certificate_get_dns_names = Interop.downcallHandle(
                "g_tls_certificate_get_dns_names",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tls_certificate_get_ip_addresses = Interop.downcallHandle(
                "g_tls_certificate_get_ip_addresses",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tls_certificate_get_issuer = Interop.downcallHandle(
                "g_tls_certificate_get_issuer",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tls_certificate_get_issuer_name = Interop.downcallHandle(
                "g_tls_certificate_get_issuer_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tls_certificate_get_not_valid_after = Interop.downcallHandle(
                "g_tls_certificate_get_not_valid_after",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tls_certificate_get_not_valid_before = Interop.downcallHandle(
                "g_tls_certificate_get_not_valid_before",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tls_certificate_get_subject_name = Interop.downcallHandle(
                "g_tls_certificate_get_subject_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tls_certificate_is_same = Interop.downcallHandle(
                "g_tls_certificate_is_same",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tls_certificate_verify = Interop.downcallHandle(
                "g_tls_certificate_verify",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tls_certificate_get_type = Interop.downcallHandle(
                "g_tls_certificate_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_tls_certificate_list_new_from_file = Interop.downcallHandle(
                "g_tls_certificate_list_new_from_file",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_tls_certificate_get_type != null;
    }
}
