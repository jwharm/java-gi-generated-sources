package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 */
public class TlsDatabase extends org.gtk.gobject.Object {

    public TlsDatabase(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TlsDatabase */
    public static TlsDatabase castFrom(org.gtk.gobject.Object gobject) {
        return new TlsDatabase(gobject.refcounted());
    }
    
    static final MethodHandle g_tls_database_create_certificate_handle = Interop.downcallHandle(
        "g_tls_database_create_certificate_handle",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Create a handle string for the certificate. The database will only be able
     * to create a handle for certificates that originate from the database. In
     * cases where the database cannot create a handle for a certificate, {@code null}
     * will be returned.
     * <p>
     * This handle should be stable across various instances of the application,
     * and between applications. If a certificate is modified in the database,
     * then it is not guaranteed that this handle will continue to point to it.
     */
    public java.lang.String createCertificateHandle(TlsCertificate certificate) {
        try {
            var RESULT = (MemoryAddress) g_tls_database_create_certificate_handle.invokeExact(handle(), certificate.handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_database_lookup_certificate_for_handle = Interop.downcallHandle(
        "g_tls_database_lookup_certificate_for_handle",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
     */
    public TlsCertificate lookupCertificateForHandle(java.lang.String handle, TlsInteraction interaction, TlsDatabaseLookupFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_tls_database_lookup_certificate_for_handle.invokeExact(handle(), Interop.allocateNativeString(handle).handle(), interaction.handle(), flags.getValue(), cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new TlsCertificate(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_database_lookup_certificate_for_handle_async = Interop.downcallHandle(
        "g_tls_database_lookup_certificate_for_handle_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronously look up a certificate by its handle in the database. See
     * g_tls_database_lookup_certificate_for_handle() for more information.
     */
    public void lookupCertificateForHandleAsync(java.lang.String handle, TlsInteraction interaction, TlsDatabaseLookupFlags flags, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_tls_database_lookup_certificate_for_handle_async.invokeExact(handle(), Interop.allocateNativeString(handle).handle(), interaction.handle(), flags.getValue(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_database_lookup_certificate_for_handle_finish = Interop.downcallHandle(
        "g_tls_database_lookup_certificate_for_handle_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finish an asynchronous lookup of a certificate by its handle. See
     * g_tls_database_lookup_certificate_for_handle() for more information.
     * <p>
     * If the handle is no longer valid, or does not point to a certificate in
     * this database, then {@code null} will be returned.
     */
    public TlsCertificate lookupCertificateForHandleFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_tls_database_lookup_certificate_for_handle_finish.invokeExact(handle(), result.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new TlsCertificate(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_database_lookup_certificate_issuer = Interop.downcallHandle(
        "g_tls_database_lookup_certificate_issuer",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
     */
    public TlsCertificate lookupCertificateIssuer(TlsCertificate certificate, TlsInteraction interaction, TlsDatabaseLookupFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_tls_database_lookup_certificate_issuer.invokeExact(handle(), certificate.handle(), interaction.handle(), flags.getValue(), cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new TlsCertificate(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_database_lookup_certificate_issuer_async = Interop.downcallHandle(
        "g_tls_database_lookup_certificate_issuer_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronously look up the issuer of {@code certificate} in the database. See
     * g_tls_database_lookup_certificate_issuer() for more information.
     */
    public void lookupCertificateIssuerAsync(TlsCertificate certificate, TlsInteraction interaction, TlsDatabaseLookupFlags flags, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_tls_database_lookup_certificate_issuer_async.invokeExact(handle(), certificate.handle(), interaction.handle(), flags.getValue(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_database_lookup_certificate_issuer_finish = Interop.downcallHandle(
        "g_tls_database_lookup_certificate_issuer_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finish an asynchronous lookup issuer operation. See
     * g_tls_database_lookup_certificate_issuer() for more information.
     */
    public TlsCertificate lookupCertificateIssuerFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_tls_database_lookup_certificate_issuer_finish.invokeExact(handle(), result.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new TlsCertificate(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_database_lookup_certificates_issued_by = Interop.downcallHandle(
        "g_tls_database_lookup_certificates_issued_by",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Look up certificates issued by this issuer in the database.
     * <p>
     * This function can block, use g_tls_database_lookup_certificates_issued_by_async() to perform
     * the lookup operation asynchronously.
     */
    public org.gtk.glib.List lookupCertificatesIssuedBy(byte[] issuerRawDn, TlsInteraction interaction, TlsDatabaseLookupFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_tls_database_lookup_certificates_issued_by.invokeExact(handle(), Interop.allocateNativeArray(issuerRawDn).handle(), interaction.handle(), flags.getValue(), cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.glib.List(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_database_lookup_certificates_issued_by_async = Interop.downcallHandle(
        "g_tls_database_lookup_certificates_issued_by_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronously look up certificates issued by this issuer in the database. See
     * g_tls_database_lookup_certificates_issued_by() for more information.
     * <p>
     * The database may choose to hold a reference to the issuer byte array for the duration
     * of of this asynchronous operation. The byte array should not be modified during
     * this time.
     */
    public void lookupCertificatesIssuedByAsync(byte[] issuerRawDn, TlsInteraction interaction, TlsDatabaseLookupFlags flags, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_tls_database_lookup_certificates_issued_by_async.invokeExact(handle(), Interop.allocateNativeArray(issuerRawDn).handle(), interaction.handle(), flags.getValue(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_database_lookup_certificates_issued_by_finish = Interop.downcallHandle(
        "g_tls_database_lookup_certificates_issued_by_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finish an asynchronous lookup of certificates. See
     * g_tls_database_lookup_certificates_issued_by() for more information.
     */
    public org.gtk.glib.List lookupCertificatesIssuedByFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_tls_database_lookup_certificates_issued_by_finish.invokeExact(handle(), result.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.glib.List(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_database_verify_chain = Interop.downcallHandle(
        "g_tls_database_verify_chain",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
     */
    public TlsCertificateFlags verifyChain(TlsCertificate chain, java.lang.String purpose, SocketConnectable identity, TlsInteraction interaction, TlsDatabaseVerifyFlags flags, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_tls_database_verify_chain.invokeExact(handle(), chain.handle(), Interop.allocateNativeString(purpose).handle(), identity.handle(), interaction.handle(), flags.getValue(), cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new TlsCertificateFlags(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_database_verify_chain_async = Interop.downcallHandle(
        "g_tls_database_verify_chain_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronously determines the validity of a certificate chain after
     * looking up and adding any missing certificates to the chain. See
     * g_tls_database_verify_chain() for more information.
     */
    public void verifyChainAsync(TlsCertificate chain, java.lang.String purpose, SocketConnectable identity, TlsInteraction interaction, TlsDatabaseVerifyFlags flags, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            g_tls_database_verify_chain_async.invokeExact(handle(), chain.handle(), Interop.allocateNativeString(purpose).handle(), identity.handle(), interaction.handle(), flags.getValue(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_database_verify_chain_finish = Interop.downcallHandle(
        "g_tls_database_verify_chain_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public TlsCertificateFlags verifyChainFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_tls_database_verify_chain_finish.invokeExact(handle(), result.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new TlsCertificateFlags(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}