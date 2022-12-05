package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link TlsDatabase} is used to look up certificates and other information
 * from a certificate or key store. It is an abstract base class which
 * TLS library specific subtypes override.
 * <p>
 * A {@link TlsDatabase} may be accessed from multiple threads by the TLS backend.
 * All implementations are required to be fully thread-safe.
 * <p>
 * Most common client applications will not directly interact with
 * {@link TlsDatabase}. It is used internally by {@link TlsConnection}.
 * @version 2.30
 */
public class TlsDatabase extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTlsDatabase";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a TlsDatabase proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TlsDatabase(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to TlsDatabase if its GType is a (or inherits from) "GTlsDatabase".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TlsDatabase} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GTlsDatabase", a ClassCastException will be thrown.
     */
    public static TlsDatabase castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), TlsDatabase.getType())) {
            return new TlsDatabase(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GTlsDatabase");
        }
    }
    
    /**
     * Create a handle string for the certificate. The database will only be able
     * to create a handle for certificates that originate from the database. In
     * cases where the database cannot create a handle for a certificate, {@code null}
     * will be returned.
     * <p>
     * This handle should be stable across various instances of the application,
     * and between applications. If a certificate is modified in the database,
     * then it is not guaranteed that this handle will continue to point to it.
     * @param certificate certificate for which to create a handle.
     * @return a newly allocated string containing the
     * handle.
     */
    public @Nullable java.lang.String createCertificateHandle(@NotNull org.gtk.gio.TlsCertificate certificate) {
        java.util.Objects.requireNonNull(certificate, "Parameter 'certificate' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_database_create_certificate_handle.invokeExact(
                    handle(),
                    certificate.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Look up a certificate by its handle.
     * <p>
     * The handle should have been created by calling
     * g_tls_database_create_certificate_handle() on a {@link TlsDatabase} object of
     * the same TLS backend. The handle is designed to remain valid across
     * instantiations of the database.
     * <p>
     * If the handle is no longer valid, or does not point to a certificate in
     * this database, then {@code null} will be returned.
     * <p>
     * This function can block, use g_tls_database_lookup_certificate_for_handle_async() to perform
     * the lookup operation asynchronously.
     * @param handle a certificate handle
     * @param interaction used to interact with the user if necessary
     * @param flags Flags which affect the lookup.
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return a newly allocated
     * {@link TlsCertificate}, or {@code null}. Use g_object_unref() to release the certificate.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @Nullable org.gtk.gio.TlsCertificate lookupCertificateForHandle(@NotNull java.lang.String handle, @Nullable org.gtk.gio.TlsInteraction interaction, @NotNull org.gtk.gio.TlsDatabaseLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(handle, "Parameter 'handle' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_database_lookup_certificate_for_handle.invokeExact(
                    handle(),
                    Interop.allocateNativeString(handle),
                    (Addressable) (interaction == null ? MemoryAddress.NULL : interaction.handle()),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.TlsCertificate(RESULT, Ownership.FULL);
    }
    
    /**
     * Asynchronously look up a certificate by its handle in the database. See
     * g_tls_database_lookup_certificate_for_handle() for more information.
     * @param handle a certificate handle
     * @param interaction used to interact with the user if necessary
     * @param flags Flags which affect the lookup.
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback callback to call when the operation completes
     */
    public void lookupCertificateForHandleAsync(@NotNull java.lang.String handle, @Nullable org.gtk.gio.TlsInteraction interaction, @NotNull org.gtk.gio.TlsDatabaseLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(handle, "Parameter 'handle' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_tls_database_lookup_certificate_for_handle_async.invokeExact(
                    handle(),
                    Interop.allocateNativeString(handle),
                    (Addressable) (interaction == null ? MemoryAddress.NULL : interaction.handle()),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finish an asynchronous lookup of a certificate by its handle. See
     * g_tls_database_lookup_certificate_for_handle() for more information.
     * <p>
     * If the handle is no longer valid, or does not point to a certificate in
     * this database, then {@code null} will be returned.
     * @param result a {@link AsyncResult}.
     * @return a newly allocated {@link TlsCertificate} object.
     * Use g_object_unref() to release the certificate.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.TlsCertificate lookupCertificateForHandleFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_database_lookup_certificate_for_handle_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.TlsCertificate(RESULT, Ownership.FULL);
    }
    
    /**
     * Look up the issuer of {@code certificate} in the database. The
     * {@link TlsCertificate}:issuer property of {@code certificate} is not modified, and
     * the two certificates are not hooked into a chain.
     * <p>
     * This function can block. Use g_tls_database_lookup_certificate_issuer_async()
     * to perform the lookup operation asynchronously.
     * <p>
     * Beware this function cannot be used to build certification paths. The
     * issuer certificate returned by this function may not be the same as
     * the certificate that would actually be used to construct a valid
     * certification path during certificate verification.
     * <a href="https://datatracker.ietf.org/doc/html/rfc4158">RFC 4158</a> explains
     * why an issuer certificate cannot be naively assumed to be part of the
     * the certification path (though GLib's TLS backends may not follow the
     * path building strategies outlined in this RFC). Due to the complexity
     * of certification path building, GLib does not provide any way to know
     * which certification path will actually be used when verifying a TLS
     * certificate. Accordingly, this function cannot be used to make
     * security-related decisions. Only GLib itself should make security
     * decisions about TLS certificates.
     * @param certificate a {@link TlsCertificate}
     * @param interaction used to interact with the user if necessary
     * @param flags flags which affect the lookup operation
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return a newly allocated issuer {@link TlsCertificate},
     * or {@code null}. Use g_object_unref() to release the certificate.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.TlsCertificate lookupCertificateIssuer(@NotNull org.gtk.gio.TlsCertificate certificate, @Nullable org.gtk.gio.TlsInteraction interaction, @NotNull org.gtk.gio.TlsDatabaseLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(certificate, "Parameter 'certificate' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_database_lookup_certificate_issuer.invokeExact(
                    handle(),
                    certificate.handle(),
                    (Addressable) (interaction == null ? MemoryAddress.NULL : interaction.handle()),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.TlsCertificate(RESULT, Ownership.FULL);
    }
    
    /**
     * Asynchronously look up the issuer of {@code certificate} in the database. See
     * g_tls_database_lookup_certificate_issuer() for more information.
     * @param certificate a {@link TlsCertificate}
     * @param interaction used to interact with the user if necessary
     * @param flags flags which affect the lookup operation
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback callback to call when the operation completes
     */
    public void lookupCertificateIssuerAsync(@NotNull org.gtk.gio.TlsCertificate certificate, @Nullable org.gtk.gio.TlsInteraction interaction, @NotNull org.gtk.gio.TlsDatabaseLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(certificate, "Parameter 'certificate' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_tls_database_lookup_certificate_issuer_async.invokeExact(
                    handle(),
                    certificate.handle(),
                    (Addressable) (interaction == null ? MemoryAddress.NULL : interaction.handle()),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finish an asynchronous lookup issuer operation. See
     * g_tls_database_lookup_certificate_issuer() for more information.
     * @param result a {@link AsyncResult}.
     * @return a newly allocated issuer {@link TlsCertificate},
     * or {@code null}. Use g_object_unref() to release the certificate.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.TlsCertificate lookupCertificateIssuerFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_database_lookup_certificate_issuer_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.TlsCertificate(RESULT, Ownership.FULL);
    }
    
    /**
     * Look up certificates issued by this issuer in the database.
     * <p>
     * This function can block, use g_tls_database_lookup_certificates_issued_by_async() to perform
     * the lookup operation asynchronously.
     * @param issuerRawDn a {@link org.gtk.glib.ByteArray} which holds the DER encoded issuer DN.
     * @param interaction used to interact with the user if necessary
     * @param flags Flags which affect the lookup operation.
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return a newly allocated list of {@link TlsCertificate}
     * objects. Use g_object_unref() on each certificate, and g_list_free() on the release the list.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.glib.List lookupCertificatesIssuedBy(@NotNull byte[] issuerRawDn, @Nullable org.gtk.gio.TlsInteraction interaction, @NotNull org.gtk.gio.TlsDatabaseLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(issuerRawDn, "Parameter 'issuerRawDn' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_database_lookup_certificates_issued_by.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(issuerRawDn, false),
                    (Addressable) (interaction == null ? MemoryAddress.NULL : interaction.handle()),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Asynchronously look up certificates issued by this issuer in the database. See
     * g_tls_database_lookup_certificates_issued_by() for more information.
     * <p>
     * The database may choose to hold a reference to the issuer byte array for the duration
     * of of this asynchronous operation. The byte array should not be modified during
     * this time.
     * @param issuerRawDn a {@link org.gtk.glib.ByteArray} which holds the DER encoded issuer DN.
     * @param interaction used to interact with the user if necessary
     * @param flags Flags which affect the lookup operation.
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback callback to call when the operation completes
     */
    public void lookupCertificatesIssuedByAsync(@NotNull byte[] issuerRawDn, @Nullable org.gtk.gio.TlsInteraction interaction, @NotNull org.gtk.gio.TlsDatabaseLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(issuerRawDn, "Parameter 'issuerRawDn' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_tls_database_lookup_certificates_issued_by_async.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(issuerRawDn, false),
                    (Addressable) (interaction == null ? MemoryAddress.NULL : interaction.handle()),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finish an asynchronous lookup of certificates. See
     * g_tls_database_lookup_certificates_issued_by() for more information.
     * @param result a {@link AsyncResult}.
     * @return a newly allocated list of {@link TlsCertificate}
     * objects. Use g_object_unref() on each certificate, and g_list_free() on the release the list.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.glib.List lookupCertificatesIssuedByFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_database_lookup_certificates_issued_by_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Determines the validity of a certificate chain, outside the context
     * of a TLS session.
     * <p>
     * {@code chain} is a chain of {@link TlsCertificate} objects each pointing to the next
     * certificate in the chain by its {@link TlsCertificate}:issuer property.
     * <p>
     * {@code purpose} describes the purpose (or usage) for which the certificate
     * is being used. Typically {@code purpose} will be set to {@code G_TLS_DATABASE_PURPOSE_AUTHENTICATE_SERVER}
     * which means that the certificate is being used to authenticate a server
     * (and we are acting as the client).
     * <p>
     * The {@code identity} is used to ensure the server certificate is valid for
     * the expected peer identity. If the identity does not match the
     * certificate, {@link TlsCertificateFlags#BAD_IDENTITY} will be set in the
     * return value. If {@code identity} is {@code null}, that bit will never be set in
     * the return value. The peer identity may also be used to check for
     * pinned certificates (trust exceptions) in the database. These may
     * override the normal verification process on a host-by-host basis.
     * <p>
     * Currently there are no {@code flags}, and {@link TlsDatabaseVerifyFlags#NONE} should be
     * used.
     * <p>
     * If {@code chain} is found to be valid, then the return value will be 0. If
     * {@code chain} is found to be invalid, then the return value will indicate at
     * least one problem found. If the function is unable to determine
     * whether {@code chain} is valid (for example, because {@code cancellable} is
     * triggered before it completes) then the return value will be
     * {@link TlsCertificateFlags#GENERIC_ERROR} and {@code error} will be set accordingly.
     * {@code error} is not set when {@code chain} is successfully analyzed but found to
     * be invalid.
     * <p>
     * GLib guarantees that if certificate verification fails, at least one
     * error will be set in the return value, but it does not guarantee
     * that all possible errors will be set. Accordingly, you may not safely
     * decide to ignore any particular type of error. For example, it would
     * be incorrect to mask {@link TlsCertificateFlags#EXPIRED} if you want to allow
     * expired certificates, because this could potentially be the only
     * error flag set even if other problems exist with the certificate.
     * <p>
     * Prior to GLib 2.48, GLib's default TLS backend modified {@code chain} to
     * represent the certification path built by {@link TlsDatabase} during
     * certificate verification by adjusting the {@link TlsCertificate}:issuer
     * property of each certificate in {@code chain}. Since GLib 2.48, this no
     * longer occurs, so you cannot rely on {@link TlsCertificate}:issuer to
     * represent the actual certification path used during certificate
     * verification.
     * <p>
     * Because TLS session context is not used, {@link TlsDatabase} may not
     * perform as many checks on the certificates as {@link TlsConnection} would.
     * For example, certificate constraints may not be honored, and
     * revocation checks may not be performed. The best way to verify TLS
     * certificates used by a TLS connection is to let {@link TlsConnection}
     * handle the verification.
     * <p>
     * The TLS backend may attempt to look up and add missing certificates
     * to the chain. This may involve HTTP requests to download missing
     * certificates.
     * <p>
     * This function can block. Use g_tls_database_verify_chain_async() to
     * perform the verification operation asynchronously.
     * @param chain a {@link TlsCertificate} chain
     * @param purpose the purpose that this certificate chain will be used for.
     * @param identity the expected peer identity
     * @param interaction used to interact with the user if necessary
     * @param flags additional verify flags
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return the appropriate {@link TlsCertificateFlags} which represents the
     * result of verification.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.TlsCertificateFlags verifyChain(@NotNull org.gtk.gio.TlsCertificate chain, @NotNull java.lang.String purpose, @Nullable org.gtk.gio.SocketConnectable identity, @Nullable org.gtk.gio.TlsInteraction interaction, @NotNull org.gtk.gio.TlsDatabaseVerifyFlags flags, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(chain, "Parameter 'chain' must not be null");
        java.util.Objects.requireNonNull(purpose, "Parameter 'purpose' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tls_database_verify_chain.invokeExact(
                    handle(),
                    chain.handle(),
                    Interop.allocateNativeString(purpose),
                    (Addressable) (identity == null ? MemoryAddress.NULL : identity.handle()),
                    (Addressable) (interaction == null ? MemoryAddress.NULL : interaction.handle()),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.TlsCertificateFlags(RESULT);
    }
    
    /**
     * Asynchronously determines the validity of a certificate chain after
     * looking up and adding any missing certificates to the chain. See
     * g_tls_database_verify_chain() for more information.
     * @param chain a {@link TlsCertificate} chain
     * @param purpose the purpose that this certificate chain will be used for.
     * @param identity the expected peer identity
     * @param interaction used to interact with the user if necessary
     * @param flags additional verify flags
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback callback to call when the operation completes
     */
    public void verifyChainAsync(@NotNull org.gtk.gio.TlsCertificate chain, @NotNull java.lang.String purpose, @Nullable org.gtk.gio.SocketConnectable identity, @Nullable org.gtk.gio.TlsInteraction interaction, @NotNull org.gtk.gio.TlsDatabaseVerifyFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(chain, "Parameter 'chain' must not be null");
        java.util.Objects.requireNonNull(purpose, "Parameter 'purpose' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_tls_database_verify_chain_async.invokeExact(
                    handle(),
                    chain.handle(),
                    Interop.allocateNativeString(purpose),
                    (Addressable) (identity == null ? MemoryAddress.NULL : identity.handle()),
                    (Addressable) (interaction == null ? MemoryAddress.NULL : interaction.handle()),
                    flags.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finish an asynchronous verify chain operation. See
     * g_tls_database_verify_chain() for more information.
     * <p>
     * If {@code chain} is found to be valid, then the return value will be 0. If
     * {@code chain} is found to be invalid, then the return value will indicate
     * the problems found. If the function is unable to determine whether
     * {@code chain} is valid or not (eg, because {@code cancellable} is triggered
     * before it completes) then the return value will be
     * {@link TlsCertificateFlags#GENERIC_ERROR} and {@code error} will be set
     * accordingly. {@code error} is not set when {@code chain} is successfully analyzed
     * but found to be invalid.
     * @param result a {@link AsyncResult}.
     * @return the appropriate {@link TlsCertificateFlags} which represents the
     * result of verification.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.TlsCertificateFlags verifyChainFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tls_database_verify_chain_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.TlsCertificateFlags(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tls_database_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link TlsDatabase.Build} object constructs a {@link TlsDatabase} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link TlsDatabase} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TlsDatabase} using {@link TlsDatabase#castFrom}.
         * @return A new instance of {@code TlsDatabase} with the properties 
         *         that were set in the Build object.
         */
        public TlsDatabase construct() {
            return TlsDatabase.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    TlsDatabase.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_tls_database_create_certificate_handle = Interop.downcallHandle(
            "g_tls_database_create_certificate_handle",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_database_lookup_certificate_for_handle = Interop.downcallHandle(
            "g_tls_database_lookup_certificate_for_handle",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_database_lookup_certificate_for_handle_async = Interop.downcallHandle(
            "g_tls_database_lookup_certificate_for_handle_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_database_lookup_certificate_for_handle_finish = Interop.downcallHandle(
            "g_tls_database_lookup_certificate_for_handle_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_database_lookup_certificate_issuer = Interop.downcallHandle(
            "g_tls_database_lookup_certificate_issuer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_database_lookup_certificate_issuer_async = Interop.downcallHandle(
            "g_tls_database_lookup_certificate_issuer_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_database_lookup_certificate_issuer_finish = Interop.downcallHandle(
            "g_tls_database_lookup_certificate_issuer_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_database_lookup_certificates_issued_by = Interop.downcallHandle(
            "g_tls_database_lookup_certificates_issued_by",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_database_lookup_certificates_issued_by_async = Interop.downcallHandle(
            "g_tls_database_lookup_certificates_issued_by_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_database_lookup_certificates_issued_by_finish = Interop.downcallHandle(
            "g_tls_database_lookup_certificates_issued_by_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_database_verify_chain = Interop.downcallHandle(
            "g_tls_database_verify_chain",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_database_verify_chain_async = Interop.downcallHandle(
            "g_tls_database_verify_chain_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_database_verify_chain_finish = Interop.downcallHandle(
            "g_tls_database_verify_chain_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tls_database_get_type = Interop.downcallHandle(
            "g_tls_database_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
