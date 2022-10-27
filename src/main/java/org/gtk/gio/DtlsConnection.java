package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DtlsConnection} is the base DTLS connection class type, which wraps
 * a {@link DatagramBased} and provides DTLS encryption on top of it. Its
 * subclasses, {@link DtlsClientConnection} and {@link DtlsServerConnection},
 * implement client-side and server-side DTLS, respectively.
 * <p>
 * For TLS support, see {@link TlsConnection}.
 * <p>
 * As DTLS is datagram based, {@link DtlsConnection} implements {@link DatagramBased},
 * presenting a datagram-socket-like API for the encrypted connection. This
 * operates over a base datagram connection, which is also a {@link DatagramBased}
 * ({@link DtlsConnection}:base-socket).
 * <p>
 * To close a DTLS connection, use g_dtls_connection_close().
 * <p>
 * Neither {@link DtlsServerConnection} or {@link DtlsClientConnection} set the peer address
 * on their base {@link DatagramBased} if it is a {@link Socket} — it is up to the caller to
 * do that if they wish. If they do not, and g_socket_close() is called on the
 * base socket, the {@link DtlsConnection} will not raise a {@link IOErrorEnum#NOT_CONNECTED}
 * error on further I/O.
 * @version 2.48
 */
public interface DtlsConnection extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Close the DTLS connection. This is equivalent to calling
     * g_dtls_connection_shutdown() to shut down both sides of the connection.
     * <p>
     * Closing a {@link DtlsConnection} waits for all buffered but untransmitted data to
     * be sent before it completes. It then sends a {@code close_notify} DTLS alert to the
     * peer and may wait for a {@code close_notify} to be received from the peer. It does
     * not close the underlying {@link DtlsConnection}:base-socket; that must be closed
     * separately.
     * <p>
     * Once {@code conn} is closed, all other operations will return {@link IOErrorEnum#CLOSED}.
     * Closing a {@link DtlsConnection} multiple times will not return an error.
     * <p>
     * {@code GDtlsConnections} will be automatically closed when the last reference is
     * dropped, but you might want to call this function to make sure resources are
     * released as early as possible.
     * <p>
     * If {@code cancellable} is cancelled, the {@link DtlsConnection} may be left
     * partially-closed and any pending untransmitted data may be lost. Call
     * g_dtls_connection_close() again to complete closing the {@link DtlsConnection}.
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return {@code true} on success, {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean close(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dtls_connection_close.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Asynchronously close the DTLS connection. See g_dtls_connection_close() for
     * more information.
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback callback to call when the close operation is complete
     */
    default void closeAsync(int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(callback, MemoryAddress.NULL);
        try {
            DowncallHandles.g_dtls_connection_close_async.invokeExact(handle(), ioPriority, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finish an asynchronous TLS close operation. See g_dtls_connection_close()
     * for more information.
     * @param result a {@link AsyncResult}
     * @return {@code true} on success, {@code false} on failure, in which
     * case {@code error} will be set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean closeFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dtls_connection_close_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Used by {@link DtlsConnection} implementations to emit the
     * {@link DtlsConnection}::accept-certificate signal.
     * @param peerCert the peer's {@link TlsCertificate}
     * @param errors the problems with {@code peer_cert}
     * @return {@code true} if one of the signal handlers has returned
     *     {@code true} to accept {@code peer_cert}
     */
    default boolean emitAcceptCertificate(@NotNull org.gtk.gio.TlsCertificate peerCert, @NotNull org.gtk.gio.TlsCertificateFlags errors) {
        java.util.Objects.requireNonNull(peerCert, "Parameter 'peerCert' must not be null");
        java.util.Objects.requireNonNull(errors, "Parameter 'errors' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dtls_connection_emit_accept_certificate.invokeExact(handle(), peerCert.handle(), errors.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets {@code conn}'s certificate, as set by
     * g_dtls_connection_set_certificate().
     * @return {@code conn}'s certificate, or {@code null}
     */
    default @Nullable org.gtk.gio.TlsCertificate getCertificate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dtls_connection_get_certificate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.TlsCertificate(Refcounted.get(RESULT, false));
    }
    
    /**
     * Query the TLS backend for TLS channel binding data of {@code type} for {@code conn}.
     * <p>
     * This call retrieves TLS channel binding data as specified in RFC
     * <a href="https://tools.ietf.org/html/rfc5056">5056</a>, RFC
     * <a href="https://tools.ietf.org/html/rfc5929">5929</a>, and related RFCs.  The
     * binding data is returned in {@code data}.  The {@code data} is resized by the callee
     * using {@link org.gtk.glib.ByteArray} buffer management and will be freed when the {@code data}
     * is destroyed by g_byte_array_unref(). If {@code data} is {@code null}, it will only
     * check whether TLS backend is able to fetch the data (e.g. whether {@code type}
     * is supported by the TLS backend). It does not guarantee that the data
     * will be available though.  That could happen if TLS connection does not
     * support {@code type} or the binding data is not available yet due to additional
     * negotiation or input required.
     * @param type {@link TlsChannelBindingType} type of data to fetch
     * @param data {@link org.gtk.glib.ByteArray} is
     *        filled with the binding data, or {@code null}
     * @return {@code true} on success, {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean getChannelBindingData(@NotNull org.gtk.gio.TlsChannelBindingType type, Out<byte[]> data) throws io.github.jwharm.javagi.GErrorException {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Returns the name of the current DTLS ciphersuite, or {@code null} if the
     * connection has not handshaked or has been closed. Beware that the TLS
     * backend may use any of multiple different naming conventions, because
     * OpenSSL and GnuTLS have their own ciphersuite naming conventions that
     * are different from each other and different from the standard, IANA-
     * registered ciphersuite names. The ciphersuite name is intended to be
     * displayed to the user for informative purposes only, and parsing it
     * is not recommended.
     * @return The name of the current DTLS ciphersuite, or {@code null}
     */
    default @Nullable java.lang.String getCiphersuiteName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dtls_connection_get_ciphersuite_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the certificate database that {@code conn} uses to verify
     * peer certificates. See g_dtls_connection_set_database().
     * @return the certificate database that {@code conn} uses or {@code null}
     */
    default @Nullable org.gtk.gio.TlsDatabase getDatabase() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dtls_connection_get_database.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.TlsDatabase(Refcounted.get(RESULT, false));
    }
    
    /**
     * Get the object that will be used to interact with the user. It will be used
     * for things like prompting the user for passwords. If {@code null} is returned, then
     * no user interaction will occur for this connection.
     * @return The interaction object.
     */
    default @Nullable org.gtk.gio.TlsInteraction getInteraction() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dtls_connection_get_interaction.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.TlsInteraction(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the name of the application-layer protocol negotiated during
     * the handshake.
     * <p>
     * If the peer did not use the ALPN extension, or did not advertise a
     * protocol that matched one of {@code conn}'s protocols, or the TLS backend
     * does not support ALPN, then this will be {@code null}. See
     * g_dtls_connection_set_advertised_protocols().
     * @return the negotiated protocol, or {@code null}
     */
    default @Nullable java.lang.String getNegotiatedProtocol() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dtls_connection_get_negotiated_protocol.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets {@code conn}'s peer's certificate after the handshake has completed
     * or failed. (It is not set during the emission of
     * {@link DtlsConnection}::accept-certificate.)
     * @return {@code conn}'s peer's certificate, or {@code null}
     */
    default @Nullable org.gtk.gio.TlsCertificate getPeerCertificate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dtls_connection_get_peer_certificate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.TlsCertificate(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the errors associated with validating {@code conn}'s peer's
     * certificate, after the handshake has completed or failed. (It is
     * not set during the emission of {@link DtlsConnection}::accept-certificate.)
     * @return {@code conn}'s peer's certificate errors
     */
    default @NotNull org.gtk.gio.TlsCertificateFlags getPeerCertificateErrors() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dtls_connection_get_peer_certificate_errors.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.TlsCertificateFlags(RESULT);
    }
    
    /**
     * Returns the current DTLS protocol version, which may be
     * {@link TlsProtocolVersion#UNKNOWN} if the connection has not handshaked, or
     * has been closed, or if the TLS backend has implemented a protocol version
     * that is not a recognized {@link TlsProtocolVersion}.
     * @return The current DTLS protocol version
     */
    default @NotNull org.gtk.gio.TlsProtocolVersion getProtocolVersion() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dtls_connection_get_protocol_version.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.TlsProtocolVersion(RESULT);
    }
    
    /**
     * Gets {@code conn} rehandshaking mode. See
     * g_dtls_connection_set_rehandshake_mode() for details.
     * @return {@link TlsRehandshakeMode#SAFELY}
     * @deprecated Changing the rehandshake mode is no longer
     *   required for compatibility. Also, rehandshaking has been removed
     *   from the TLS protocol in TLS 1.3.
     */
    @Deprecated
    default @NotNull org.gtk.gio.TlsRehandshakeMode getRehandshakeMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dtls_connection_get_rehandshake_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.TlsRehandshakeMode(RESULT);
    }
    
    /**
     * Tests whether or not {@code conn} expects a proper TLS close notification
     * when the connection is closed. See
     * g_dtls_connection_set_require_close_notify() for details.
     * @return {@code true} if {@code conn} requires a proper TLS close notification.
     */
    default boolean getRequireCloseNotify() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dtls_connection_get_require_close_notify.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Attempts a TLS handshake on {@code conn}.
     * <p>
     * On the client side, it is never necessary to call this method;
     * although the connection needs to perform a handshake after
     * connecting, {@link DtlsConnection} will handle this for you automatically
     * when you try to send or receive data on the connection. You can call
     * g_dtls_connection_handshake() manually if you want to know whether
     * the initial handshake succeeded or failed (as opposed to just
     * immediately trying to use {@code conn} to read or write, in which case,
     * if it fails, it may not be possible to tell if it failed before
     * or after completing the handshake), but beware that servers may reject
     * client authentication after the handshake has completed, so a
     * successful handshake does not indicate the connection will be usable.
     * <p>
     * Likewise, on the server side, although a handshake is necessary at
     * the beginning of the communication, you do not need to call this
     * function explicitly unless you want clearer error reporting.
     * <p>
     * Previously, calling g_dtls_connection_handshake() after the initial
     * handshake would trigger a rehandshake; however, this usage was
     * deprecated in GLib 2.60 because rehandshaking was removed from the
     * TLS protocol in TLS 1.3. Since GLib 2.64, calling this function after
     * the initial handshake will no longer do anything.
     * <p>
     * {@link DtlsConnection}::accept_certificate may be emitted during the
     * handshake.
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return success or failure
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean handshake(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dtls_connection_handshake.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Asynchronously performs a TLS handshake on {@code conn}. See
     * g_dtls_connection_handshake() for more information.
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback callback to call when the handshake is complete
     */
    default void handshakeAsync(int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(callback, MemoryAddress.NULL);
        try {
            DowncallHandles.g_dtls_connection_handshake_async.invokeExact(handle(), ioPriority, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finish an asynchronous TLS handshake operation. See
     * g_dtls_connection_handshake() for more information.
     * @param result a {@link AsyncResult}.
     * @return {@code true} on success, {@code false} on failure, in which
     * case {@code error} will be set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean handshakeFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dtls_connection_handshake_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the list of application-layer protocols to advertise that the
     * caller is willing to speak on this connection. The
     * Application-Layer Protocol Negotiation (ALPN) extension will be
     * used to negotiate a compatible protocol with the peer; use
     * g_dtls_connection_get_negotiated_protocol() to find the negotiated
     * protocol after the handshake.  Specifying {@code null} for the the value
     * of {@code protocols} will disable ALPN negotiation.
     * <p>
     * See <a href="https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids">IANA TLS ALPN Protocol IDs</a>
     * for a list of registered protocol IDs.
     * @param protocols a {@code null}-terminated
     *   array of ALPN protocol names (eg, "http/1.1", "h2"), or {@code null}
     */
    default void setAdvertisedProtocols(java.lang.String[] protocols) {
        java.util.Objects.requireNonNullElse(protocols, MemoryAddress.NULL);
        try {
            DowncallHandles.g_dtls_connection_set_advertised_protocols.invokeExact(handle(), Interop.allocateNativeArray(protocols, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This sets the certificate that {@code conn} will present to its peer
     * during the TLS handshake. For a {@link DtlsServerConnection}, it is
     * mandatory to set this, and that will normally be done at construct
     * time.
     * <p>
     * For a {@link DtlsClientConnection}, this is optional. If a handshake fails
     * with {@link TlsError#CERTIFICATE_REQUIRED}, that means that the server
     * requires a certificate, and if you try connecting again, you should
     * call this method first. You can call
     * g_dtls_client_connection_get_accepted_cas() on the failed connection
     * to get a list of Certificate Authorities that the server will
     * accept certificates from.
     * <p>
     * (It is also possible that a server will allow the connection with
     * or without a certificate; in that case, if you don't provide a
     * certificate, you can tell that the server requested one by the fact
     * that g_dtls_client_connection_get_accepted_cas() will return
     * non-{@code null}.)
     * @param certificate the certificate to use for {@code conn}
     */
    default void setCertificate(@NotNull org.gtk.gio.TlsCertificate certificate) {
        java.util.Objects.requireNonNull(certificate, "Parameter 'certificate' must not be null");
        try {
            DowncallHandles.g_dtls_connection_set_certificate.invokeExact(handle(), certificate.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the certificate database that is used to verify peer certificates.
     * This is set to the default database by default. See
     * g_tls_backend_get_default_database(). If set to {@code null}, then
     * peer certificate validation will always set the
     * {@link TlsCertificateFlags#UNKNOWN_CA} error (meaning
     * {@link DtlsConnection}::accept-certificate will always be emitted on
     * client-side connections, unless that bit is not set in
     * {@link DtlsClientConnection}:validation-flags).
     * <p>
     * There are nonintuitive security implications when using a non-default
     * database. See {@link DtlsConnection}:database for details.
     * @param database a {@link TlsDatabase}
     */
    default void setDatabase(@Nullable org.gtk.gio.TlsDatabase database) {
        java.util.Objects.requireNonNullElse(database, MemoryAddress.NULL);
        try {
            DowncallHandles.g_dtls_connection_set_database.invokeExact(handle(), database.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the object that will be used to interact with the user. It will be used
     * for things like prompting the user for passwords.
     * <p>
     * The {@code interaction} argument will normally be a derived subclass of
     * {@link TlsInteraction}. {@code null} can also be provided if no user interaction
     * should occur for this connection.
     * @param interaction an interaction object, or {@code null}
     */
    default void setInteraction(@Nullable org.gtk.gio.TlsInteraction interaction) {
        java.util.Objects.requireNonNullElse(interaction, MemoryAddress.NULL);
        try {
            DowncallHandles.g_dtls_connection_set_interaction.invokeExact(handle(), interaction.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Since GLib 2.64, changing the rehandshake mode is no longer supported
     * and will have no effect. With TLS 1.3, rehandshaking has been removed from
     * the TLS protocol, replaced by separate post-handshake authentication and
     * rekey operations.
     * @param mode the rehandshaking mode
     * @deprecated Changing the rehandshake mode is no longer
     *   required for compatibility. Also, rehandshaking has been removed
     *   from the TLS protocol in TLS 1.3.
     */
    @Deprecated
    default void setRehandshakeMode(@NotNull org.gtk.gio.TlsRehandshakeMode mode) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        try {
            DowncallHandles.g_dtls_connection_set_rehandshake_mode.invokeExact(handle(), mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether or not {@code conn} expects a proper TLS close notification
     * before the connection is closed. If this is {@code true} (the default),
     * then {@code conn} will expect to receive a TLS close notification from its
     * peer before the connection is closed, and will return a
     * {@link TlsError#EOF} error if the connection is closed without proper
     * notification (since this may indicate a network error, or
     * man-in-the-middle attack).
     * <p>
     * In some protocols, the application will know whether or not the
     * connection was closed cleanly based on application-level data
     * (because the application-level data includes a length field, or is
     * somehow self-delimiting); in this case, the close notify is
     * redundant and may be omitted. You
     * can use g_dtls_connection_set_require_close_notify() to tell {@code conn}
     * to allow an "unannounced" connection close, in which case the close
     * will show up as a 0-length read, as in a non-TLS
     * {@link DatagramBased}, and it is up to the application to check that
     * the data has been fully received.
     * <p>
     * Note that this only affects the behavior when the peer closes the
     * connection; when the application calls g_dtls_connection_close_async() on
     * {@code conn} itself, this will send a close notification regardless of the
     * setting of this property. If you explicitly want to do an unclean
     * close, you can close {@code conn}'s {@link DtlsConnection}:base-socket rather
     * than closing {@code conn} itself.
     * @param requireCloseNotify whether or not to require close notification
     */
    default void setRequireCloseNotify(boolean requireCloseNotify) {
        try {
            DowncallHandles.g_dtls_connection_set_require_close_notify.invokeExact(handle(), requireCloseNotify ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Shut down part or all of a DTLS connection.
     * <p>
     * If {@code shutdown_read} is {@code true} then the receiving side of the connection is shut
     * down, and further reading is disallowed. Subsequent calls to
     * g_datagram_based_receive_messages() will return {@link IOErrorEnum#CLOSED}.
     * <p>
     * If {@code shutdown_write} is {@code true} then the sending side of the connection is shut
     * down, and further writing is disallowed. Subsequent calls to
     * g_datagram_based_send_messages() will return {@link IOErrorEnum#CLOSED}.
     * <p>
     * It is allowed for both {@code shutdown_read} and {@code shutdown_write} to be TRUE — this
     * is equivalent to calling g_dtls_connection_close().
     * <p>
     * If {@code cancellable} is cancelled, the {@link DtlsConnection} may be left
     * partially-closed and any pending untransmitted data may be lost. Call
     * g_dtls_connection_shutdown() again to complete closing the {@link DtlsConnection}.
     * @param shutdownRead {@code true} to stop reception of incoming datagrams
     * @param shutdownWrite {@code true} to stop sending outgoing datagrams
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @return {@code true} on success, {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean shutdown(boolean shutdownRead, boolean shutdownWrite, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dtls_connection_shutdown.invokeExact(handle(), shutdownRead ? 1 : 0, shutdownWrite ? 1 : 0, cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Asynchronously shut down part or all of the DTLS connection. See
     * g_dtls_connection_shutdown() for more information.
     * @param shutdownRead {@code true} to stop reception of incoming datagrams
     * @param shutdownWrite {@code true} to stop sending outgoing datagrams
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable a {@link Cancellable}, or {@code null}
     * @param callback callback to call when the shutdown operation is complete
     */
    default void shutdownAsync(boolean shutdownRead, boolean shutdownWrite, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(callback, MemoryAddress.NULL);
        try {
            DowncallHandles.g_dtls_connection_shutdown_async.invokeExact(handle(), shutdownRead ? 1 : 0, shutdownWrite ? 1 : 0, ioPriority, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finish an asynchronous TLS shutdown operation. See
     * g_dtls_connection_shutdown() for more information.
     * @param result a {@link AsyncResult}
     * @return {@code true} on success, {@code false} on failure, in which
     * case {@code error} will be set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean shutdownFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dtls_connection_shutdown_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    @FunctionalInterface
    public interface AcceptCertificate {
        boolean signalReceived(DtlsConnection source, @NotNull org.gtk.gio.TlsCertificate peerCert, @NotNull org.gtk.gio.TlsCertificateFlags errors);
    }
    
    /**
     * Emitted during the TLS handshake after the peer certificate has
     * been received. You can examine {@code peer_cert}'s certification path by
     * calling g_tls_certificate_get_issuer() on it.
     * <p>
     * For a client-side connection, {@code peer_cert} is the server's
     * certificate, and the signal will only be emitted if the
     * certificate was not acceptable according to {@code conn}'s
     * {@link DtlsClientConnection}:validation_flags. If you would like the
     * certificate to be accepted despite {@code errors}, return {@code true} from the
     * signal handler. Otherwise, if no handler accepts the certificate,
     * the handshake will fail with {@link TlsError#BAD_CERTIFICATE}.
     * <p>
     * GLib guarantees that if certificate verification fails, this signal
     * will be emitted with at least one error will be set in {@code errors}, but
     * it does not guarantee that all possible errors will be set.
     * Accordingly, you may not safely decide to ignore any particular
     * type of error. For example, it would be incorrect to ignore
     * {@link TlsCertificateFlags#EXPIRED} if you want to allow expired
     * certificates, because this could potentially be the only error flag
     * set even if other problems exist with the certificate.
     * <p>
     * For a server-side connection, {@code peer_cert} is the certificate
     * presented by the client, if this was requested via the server's
     * {@link DtlsServerConnection}:authentication_mode. On the server side,
     * the signal is always emitted when the client presents a
     * certificate, and the certificate will only be accepted if a
     * handler returns {@code true}.
     * <p>
     * Note that if this signal is emitted as part of asynchronous I/O
     * in the main thread, then you should not attempt to interact with
     * the user before returning from the signal handler. If you want to
     * let the user decide whether or not to accept the certificate, you
     * would have to return {@code false} from the signal handler on the first
     * attempt, and then after the connection attempt returns a
     * {@link TlsError#BAD_CERTIFICATE}, you can interact with the user, and
     * if the user decides to accept the certificate, remember that fact,
     * create a new connection, and return {@code true} from the signal handler
     * the next time.
     * <p>
     * If you are doing I/O in another thread, you do not
     * need to worry about this, and can simply block in the signal
     * handler until the UI thread returns an answer.
     */
    public default Signal<DtlsConnection.AcceptCertificate> onAcceptCertificate(DtlsConnection.AcceptCertificate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("accept-certificate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DtlsConnection.Callbacks.class, "signalDtlsConnectionAcceptCertificate",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DtlsConnection.AcceptCertificate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_close = Interop.downcallHandle(
            "g_dtls_connection_close",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_close_async = Interop.downcallHandle(
            "g_dtls_connection_close_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_close_finish = Interop.downcallHandle(
            "g_dtls_connection_close_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_emit_accept_certificate = Interop.downcallHandle(
            "g_dtls_connection_emit_accept_certificate",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_get_certificate = Interop.downcallHandle(
            "g_dtls_connection_get_certificate",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_get_channel_binding_data = Interop.downcallHandle(
            "g_dtls_connection_get_channel_binding_data",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_get_ciphersuite_name = Interop.downcallHandle(
            "g_dtls_connection_get_ciphersuite_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_get_database = Interop.downcallHandle(
            "g_dtls_connection_get_database",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_get_interaction = Interop.downcallHandle(
            "g_dtls_connection_get_interaction",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_get_negotiated_protocol = Interop.downcallHandle(
            "g_dtls_connection_get_negotiated_protocol",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_get_peer_certificate = Interop.downcallHandle(
            "g_dtls_connection_get_peer_certificate",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_get_peer_certificate_errors = Interop.downcallHandle(
            "g_dtls_connection_get_peer_certificate_errors",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_get_protocol_version = Interop.downcallHandle(
            "g_dtls_connection_get_protocol_version",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_get_rehandshake_mode = Interop.downcallHandle(
            "g_dtls_connection_get_rehandshake_mode",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_get_require_close_notify = Interop.downcallHandle(
            "g_dtls_connection_get_require_close_notify",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_handshake = Interop.downcallHandle(
            "g_dtls_connection_handshake",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_handshake_async = Interop.downcallHandle(
            "g_dtls_connection_handshake_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_handshake_finish = Interop.downcallHandle(
            "g_dtls_connection_handshake_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_set_advertised_protocols = Interop.downcallHandle(
            "g_dtls_connection_set_advertised_protocols",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_set_certificate = Interop.downcallHandle(
            "g_dtls_connection_set_certificate",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_set_database = Interop.downcallHandle(
            "g_dtls_connection_set_database",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_set_interaction = Interop.downcallHandle(
            "g_dtls_connection_set_interaction",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_set_rehandshake_mode = Interop.downcallHandle(
            "g_dtls_connection_set_rehandshake_mode",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_set_require_close_notify = Interop.downcallHandle(
            "g_dtls_connection_set_require_close_notify",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_shutdown = Interop.downcallHandle(
            "g_dtls_connection_shutdown",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_shutdown_async = Interop.downcallHandle(
            "g_dtls_connection_shutdown_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_connection_shutdown_finish = Interop.downcallHandle(
            "g_dtls_connection_shutdown_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    @ApiStatus.Internal
    static class Callbacks {
        
        public static boolean signalDtlsConnectionAcceptCertificate(MemoryAddress source, MemoryAddress peerCert, int errors, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (DtlsConnection.AcceptCertificate) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new DtlsConnection.DtlsConnectionImpl(Refcounted.get(source)), new org.gtk.gio.TlsCertificate(Refcounted.get(peerCert, false)), new org.gtk.gio.TlsCertificateFlags(errors));
        }
    }
    
    class DtlsConnectionImpl extends org.gtk.gobject.Object implements DtlsConnection {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public DtlsConnectionImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
