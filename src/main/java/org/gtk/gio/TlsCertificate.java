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
public class TlsCertificate extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        org.gtk.gio.TlsCertificatePrivate.getMemoryLayout().withName("priv")
    ).withName("GTlsCertificate");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public TlsCertificate(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TlsCertificate */
    public static TlsCertificate castFrom(org.gtk.gobject.Object gobject) {
        return new TlsCertificate(gobject.refcounted());
    }
    
    private static Refcounted constructNewFromFile(@NotNull java.lang.String file) throws GErrorException {
        java.util.Objects.requireNonNull(file, "Parameter 'file' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_tls_certificate_new_from_file.invokeExact(Interop.allocateNativeString(file), (Addressable) GERROR), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
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
    public static TlsCertificate newFromFile(@NotNull java.lang.String file) throws GErrorException {
        return new TlsCertificate(constructNewFromFile(file));
    }
    
    private static Refcounted constructNewFromFileWithPassword(@NotNull java.lang.String file, @NotNull java.lang.String password) throws GErrorException {
        java.util.Objects.requireNonNull(file, "Parameter 'file' must not be null");
        java.util.Objects.requireNonNull(password, "Parameter 'password' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_tls_certificate_new_from_file_with_password.invokeExact(Interop.allocateNativeString(file), Interop.allocateNativeString(password), (Addressable) GERROR), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
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
    public static TlsCertificate newFromFileWithPassword(@NotNull java.lang.String file, @NotNull java.lang.String password) throws GErrorException {
        return new TlsCertificate(constructNewFromFileWithPassword(file, password));
    }
    
    private static Refcounted constructNewFromFiles(@NotNull java.lang.String certFile, @NotNull java.lang.String keyFile) throws GErrorException {
        java.util.Objects.requireNonNull(certFile, "Parameter 'certFile' must not be null");
        java.util.Objects.requireNonNull(keyFile, "Parameter 'keyFile' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_tls_certificate_new_from_files.invokeExact(Interop.allocateNativeString(certFile), Interop.allocateNativeString(keyFile), (Addressable) GERROR), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
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
    public static TlsCertificate newFromFiles(@NotNull java.lang.String certFile, @NotNull java.lang.String keyFile) throws GErrorException {
        return new TlsCertificate(constructNewFromFiles(certFile, keyFile));
    }
    
    private static Refcounted constructNewFromPem(@NotNull java.lang.String data, long length) throws GErrorException {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_tls_certificate_new_from_pem.invokeExact(Interop.allocateNativeString(data), length, (Addressable) GERROR), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
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
    public static TlsCertificate newFromPem(@NotNull java.lang.String data, long length) throws GErrorException {
        return new TlsCertificate(constructNewFromPem(data, length));
    }
    
    private static Refcounted constructNewFromPkcs11Uris(@NotNull java.lang.String pkcs11Uri, @Nullable java.lang.String privateKeyPkcs11Uri) throws GErrorException {
        java.util.Objects.requireNonNull(pkcs11Uri, "Parameter 'pkcs11Uri' must not be null");
        java.util.Objects.requireNonNullElse(privateKeyPkcs11Uri, MemoryAddress.NULL);
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_tls_certificate_new_from_pkcs11_uris.invokeExact(Interop.allocateNativeString(pkcs11Uri), Interop.allocateNativeString(privateKeyPkcs11Uri), (Addressable) GERROR), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link TlsCertificate} from a
     * <a href="https://docs.oasis-open.org/pkcs11/pkcs11-base/v3.0/os/pkcs11-base-v3.0-os.html">PKCS \\#11</a> URI.
     * <p>
     * An example {@code pkcs11_uri} would be {@code pkcs11:model=Model;manufacturer=Manufacture;serial=1;token=My%20Client%20Certificate;id=%01}
     * <p>
     * Where the token’s layout is:
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
    public static TlsCertificate newFromPkcs11Uris(@NotNull java.lang.String pkcs11Uri, @Nullable java.lang.String privateKeyPkcs11Uri) throws GErrorException {
        return new TlsCertificate(constructNewFromPkcs11Uris(pkcs11Uri, privateKeyPkcs11Uri));
    }
    
    private static Refcounted constructNewFromPkcs12(byte[] data, long length, @Nullable java.lang.String password) throws GErrorException {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        java.util.Objects.requireNonNullElse(password, MemoryAddress.NULL);
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_tls_certificate_new_from_pkcs12.invokeExact(Interop.allocateNativeArray(data, false), length, Interop.allocateNativeString(password), (Addressable) GERROR), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
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
        return new TlsCertificate(constructNewFromPkcs12(data, length, password));
    }
    
    /**
     * Gets the value of {@link TlsCertificate}:dns-names.
     * @return A {@link org.gtk.glib.PtrArray} of
     * {@link org.gtk.glib.Bytes} elements, or {@code null} if it's not available.
     */
    public @Nullable PointerProxy<org.gtk.glib.Bytes> getDnsNames() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_certificate_get_dns_names.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerProxy<org.gtk.glib.Bytes>(RESULT, org.gtk.glib.Bytes.class);
    }
    
    /**
     * Gets the value of {@link TlsCertificate}:ip-addresses.
     * @return A {@link org.gtk.glib.PtrArray}
     * of {@link InetAddress} elements, or {@code null} if it's not available.
     */
    public @Nullable PointerProxy<org.gtk.gio.InetAddress> getIpAddresses() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_certificate_get_ip_addresses.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerProxy<org.gtk.gio.InetAddress>(RESULT, org.gtk.gio.InetAddress.class);
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
        return new org.gtk.gio.TlsCertificate(Refcounted.get(RESULT, false));
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
        return RESULT.getUtf8String(0);
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
        return new org.gtk.glib.DateTime(Refcounted.get(RESULT, true));
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
        return new org.gtk.glib.DateTime(Refcounted.get(RESULT, true));
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
        return RESULT.getUtf8String(0);
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
    public boolean isSame(@NotNull org.gtk.gio.TlsCertificate certTwo) {
        java.util.Objects.requireNonNull(certTwo, "Parameter 'certTwo' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tls_certificate_is_same.invokeExact(handle(), certTwo.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * This verifies {@code cert} and returns a set of {@link TlsCertificateFlags}
     * indicating any problems found with it. This can be used to verify a
     * certificate outside the context of making a connection, or to
     * check a certificate against a CA that is not part of the system
     * CA database.
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
    public @NotNull org.gtk.gio.TlsCertificateFlags verify(@Nullable org.gtk.gio.SocketConnectable identity, @Nullable org.gtk.gio.TlsCertificate trustedCa) {
        java.util.Objects.requireNonNullElse(identity, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(trustedCa, MemoryAddress.NULL);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tls_certificate_verify.invokeExact(handle(), identity.handle(), trustedCa.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.TlsCertificateFlags(RESULT);
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
    public static @NotNull org.gtk.glib.List listNewFromFile(@NotNull java.lang.String file) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(file, "Parameter 'file' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_certificate_list_new_from_file.invokeExact(Interop.allocateNativeString(file), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, true));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_tls_certificate_new_from_file = Interop.downcallHandle(
            "g_tls_certificate_new_from_file",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_certificate_new_from_file_with_password = Interop.downcallHandle(
            "g_tls_certificate_new_from_file_with_password",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_certificate_new_from_files = Interop.downcallHandle(
            "g_tls_certificate_new_from_files",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_certificate_new_from_pem = Interop.downcallHandle(
            "g_tls_certificate_new_from_pem",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_certificate_new_from_pkcs11_uris = Interop.downcallHandle(
            "g_tls_certificate_new_from_pkcs11_uris",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_certificate_new_from_pkcs12 = Interop.downcallHandle(
            "g_tls_certificate_new_from_pkcs12",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_certificate_get_dns_names = Interop.downcallHandle(
            "g_tls_certificate_get_dns_names",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_certificate_get_ip_addresses = Interop.downcallHandle(
            "g_tls_certificate_get_ip_addresses",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_certificate_get_issuer = Interop.downcallHandle(
            "g_tls_certificate_get_issuer",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_certificate_get_issuer_name = Interop.downcallHandle(
            "g_tls_certificate_get_issuer_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_certificate_get_not_valid_after = Interop.downcallHandle(
            "g_tls_certificate_get_not_valid_after",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_certificate_get_not_valid_before = Interop.downcallHandle(
            "g_tls_certificate_get_not_valid_before",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_certificate_get_subject_name = Interop.downcallHandle(
            "g_tls_certificate_get_subject_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_certificate_is_same = Interop.downcallHandle(
            "g_tls_certificate_is_same",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_certificate_verify = Interop.downcallHandle(
            "g_tls_certificate_verify",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tls_certificate_list_new_from_file = Interop.downcallHandle(
            "g_tls_certificate_list_new_from_file",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
