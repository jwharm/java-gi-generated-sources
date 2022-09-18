package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link org.gtk.gio.DtlsConnection} is the base DTLS connection class type, which wraps
 * a {@link org.gtk.gio.DatagramBased} and provides DTLS encryption on top of it. Its
 * subclasses, {@link org.gtk.gio.DtlsClientConnection} and {@link org.gtk.gio.DtlsServerConnection} 
 * implement client-side and server-side DTLS, respectively.
 * 
 * For TLS support, see {@link org.gtk.gio.TlsConnection} 
 * 
 * As DTLS is datagram based, {@link org.gtk.gio.DtlsConnection} implements {@link org.gtk.gio.DatagramBased} 
 * presenting a datagram-socket-like API for the encrypted connection. This
 * operates over a base datagram connection, which is also a {@link org.gtk.gio.DatagramBased} ({@link org.gtk.gio.DtlsConnection} base-socket).
 * 
 * To close a DTLS connection, use g_dtls_connection_close().
 * 
 * Neither {@link org.gtk.gio.DtlsServerConnection} or {@link org.gtk.gio.DtlsClientConnection} set the peer address
 * on their base {@link org.gtk.gio.DatagramBased} if it is a {@link org.gtk.gio.Socket} &<code>#8212</code>  it is up to the caller to
 * do that if they wish. If they do not, and g_socket_close() is called on the
 * base socket, the {@link org.gtk.gio.DtlsConnection} will not raise a {@link org.gtk.gio.IOErrorEnum<code>#NOT_CONNECTED</code>  error on further I/O.
 */
public interface DtlsConnection extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Close the DTLS connection. This is equivalent to calling
     * g_dtls_connection_shutdown() to shut down both sides of the connection.
     * <p>
     * Closing a {@link org.gtk.gio.DtlsConnection} waits for all buffered but untransmitted data to
     * be sent before it completes. It then sends a <code>close_notify</code> DTLS alert to the
     * peer and may wait for a <code>close_notify</code> to be received from the peer. It does
     * not close the underlying {@link org.gtk.gio.DtlsConnection} base-socket; that must be closed
     * separately.
     * 
     * Once @conn is closed, all other operations will return {@link org.gtk.gio.IOErrorEnum<code>#CLOSED</code>  
     * Closing a {@link org.gtk.gio.DtlsConnection} multiple times will not return an error.
     * 
     * <code>#GDtlsConnections</code> will be automatically closed when the last reference is
     * dropped, but you might want to call this function to make sure resources are
     * released as early as possible.
     * 
     * If @cancellable is cancelled, the {@link org.gtk.gio.DtlsConnection} may be left
     * partially-closed and any pending untransmitted data may be lost. Call
     * g_dtls_connection_close() again to complete closing the {@link org.gtk.gio.DtlsConnection}
     */
    public default boolean close(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dtls_connection_close(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Asynchronously close the DTLS connection. See g_dtls_connection_close() for
     * more information.
     */
    public default void closeAsync(int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dtls_connection_close_async(handle(), ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finish an asynchronous TLS close operation. See g_dtls_connection_close()
     * for more information.
     */
    public default boolean closeFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dtls_connection_close_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Used by {@link org.gtk.gio.DtlsConnection} implementations to emit the
     * {@link org.gtk.gio.DtlsConnection} :accept-certificate signal.
     */
    public default boolean emitAcceptCertificate(TlsCertificate peerCert, int errors) {
        var RESULT = gtk_h.g_dtls_connection_emit_accept_certificate(handle(), peerCert.handle(), errors);
        return (RESULT != 0);
    }
    
    /**
     * Gets @conn&<code>#39</code> s certificate, as set by
     * g_dtls_connection_set_certificate().
     */
    public default TlsCertificate getCertificate() {
        var RESULT = gtk_h.g_dtls_connection_get_certificate(handle());
        return new TlsCertificate(References.get(RESULT, false));
    }
    
    /**
     * Query the TLS backend for TLS channel binding data of @type for @conn.
     * 
     * This call retrieves TLS channel binding data as specified in RFC
     * {@link [5056]}(https://tools.ietf.org/html/rfc5056), RFC
     * {@link [5929]}(https://tools.ietf.org/html/rfc5929), and related RFCs.  The
     * binding data is returned in @data.  The @data is resized by the callee
     * using {@link org.gtk.glib.ByteArray} buffer management and will be freed when the @data
     * is destroyed by g_byte_array_unref(). If @data is <code>null</code>  it will only
     * check whether TLS backend is able to fetch the data (e.g. whether @type
     * is supported by the TLS backend). It does not guarantee that the data
     * will be available though.  That could happen if TLS connection does not
     * support @type or the binding data is not available yet due to additional
     * negotiation or input required.
     */
    public default boolean getChannelBindingData(TlsChannelBindingType type, byte[] data) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dtls_connection_get_channel_binding_data(handle(), type.getValue(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Returns the name of the current DTLS ciphersuite, or <code>null</code> if the
     * connection has not handshaked or has been closed. Beware that the TLS
     * backend may use any of multiple different naming conventions, because
     * OpenSSL and GnuTLS have their own ciphersuite naming conventions that
     * are different from each other and different from the standard, IANA-
     * registered ciphersuite names. The ciphersuite name is intended to be
     * displayed to the user for informative purposes only, and parsing it
     * is not recommended.
     */
    public default java.lang.String getCiphersuiteName() {
        var RESULT = gtk_h.g_dtls_connection_get_ciphersuite_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the certificate database that @conn uses to verify
     * peer certificates. See g_dtls_connection_set_database().
     */
    public default TlsDatabase getDatabase() {
        var RESULT = gtk_h.g_dtls_connection_get_database(handle());
        return new TlsDatabase(References.get(RESULT, false));
    }
    
    /**
     * Get the object that will be used to interact with the user. It will be used
     * for things like prompting the user for passwords. If <code>null</code> is returned, then
     * no user interaction will occur for this connection.
     */
    public default TlsInteraction getInteraction() {
        var RESULT = gtk_h.g_dtls_connection_get_interaction(handle());
        return new TlsInteraction(References.get(RESULT, false));
    }
    
    /**
     * Gets the name of the application-layer protocol negotiated during
     * the handshake.
     * 
     * If the peer did not use the ALPN extension, or did not advertise a
     * protocol that matched one of @conn&<code>#39</code> s protocols, or the TLS backend
     * does not support ALPN, then this will be <code>null</code>  See
     * g_dtls_connection_set_advertised_protocols().
     */
    public default java.lang.String getNegotiatedProtocol() {
        var RESULT = gtk_h.g_dtls_connection_get_negotiated_protocol(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @conn&<code>#39</code> s peer&<code>#39</code> s certificate after the handshake has completed
     * or failed. (It is not set during the emission of
     * {@link org.gtk.gio.DtlsConnection} :accept-certificate.)
     */
    public default TlsCertificate getPeerCertificate() {
        var RESULT = gtk_h.g_dtls_connection_get_peer_certificate(handle());
        return new TlsCertificate(References.get(RESULT, false));
    }
    
    /**
     * Gets the errors associated with validating @conn&<code>#39</code> s peer&<code>#39</code> s
     * certificate, after the handshake has completed or failed. (It is
     * not set during the emission of {@link org.gtk.gio.DtlsConnection} :accept-certificate.)
     */
    public default int getPeerCertificateErrors() {
        var RESULT = gtk_h.g_dtls_connection_get_peer_certificate_errors(handle());
        return RESULT;
    }
    
    /**
     * Returns the current DTLS protocol version, which may be
     * {@link org.gtk.gio.TlsProtocolVersion<code>#UNKNOWN</code>  if the connection has not handshaked, or
     * has been closed, or if the TLS backend has implemented a protocol version
     * that is not a recognized {@link org.gtk.gio.TlsProtocolVersion}
     */
    public default TlsProtocolVersion getProtocolVersion() {
        var RESULT = gtk_h.g_dtls_connection_get_protocol_version(handle());
        return TlsProtocolVersion.fromValue(RESULT);
    }
    
    /**
     * Tests whether or not @conn expects a proper TLS close notification
     * when the connection is closed. See
     * g_dtls_connection_set_require_close_notify() for details.
     */
    public default boolean getRequireCloseNotify() {
        var RESULT = gtk_h.g_dtls_connection_get_require_close_notify(handle());
        return (RESULT != 0);
    }
    
    /**
     * Attempts a TLS handshake on @conn.
     * 
     * On the client side, it is never necessary to call this method;
     * although the connection needs to perform a handshake after
     * connecting, {@link org.gtk.gio.DtlsConnection} will handle this for you automatically
     * when you try to send or receive data on the connection. You can call
     * g_dtls_connection_handshake() manually if you want to know whether
     * the initial handshake succeeded or failed (as opposed to just
     * immediately trying to use @conn to read or write, in which case,
     * if it fails, it may not be possible to tell if it failed before
     * or after completing the handshake), but beware that servers may reject
     * client authentication after the handshake has completed, so a
     * successful handshake does not indicate the connection will be usable.
     * 
     * Likewise, on the server side, although a handshake is necessary at
     * the beginning of the communication, you do not need to call this
     * function explicitly unless you want clearer error reporting.
     * 
     * Previously, calling g_dtls_connection_handshake() after the initial
     * handshake would trigger a rehandshake; however, this usage was
     * deprecated in GLib 2.60 because rehandshaking was removed from the
     * TLS protocol in TLS 1.3. Since GLib 2.64, calling this function after
     * the initial handshake will no longer do anything.
     * 
     * {@link org.gtk.gio.DtlsConnection} :accept_certificate may be emitted during the
     * handshake.
     */
    public default boolean handshake(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dtls_connection_handshake(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Asynchronously performs a TLS handshake on @conn. See
     * g_dtls_connection_handshake() for more information.
     */
    public default void handshakeAsync(int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dtls_connection_handshake_async(handle(), ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finish an asynchronous TLS handshake operation. See
     * g_dtls_connection_handshake() for more information.
     */
    public default boolean handshakeFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dtls_connection_handshake_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets the list of application-layer protocols to advertise that the
     * caller is willing to speak on this connection. The
     * Application-Layer Protocol Negotiation (ALPN) extension will be
     * used to negotiate a compatible protocol with the peer; use
     * g_dtls_connection_get_negotiated_protocol() to find the negotiated
     * protocol after the handshake.  Specifying <code>null</code> for the the value
     * of @protocols will disable ALPN negotiation.
     * 
     * See {@link [IANA TLS ALPN Protocol IDs]}(https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml<code>#alpn</code> protocol-ids)
     * for a list of registered protocol IDs.
     */
    public default void setAdvertisedProtocols(java.lang.String[] protocols) {
        gtk_h.g_dtls_connection_set_advertised_protocols(handle(), Interop.allocateNativeArray(protocols).handle());
    }
    
    /**
     * This sets the certificate that @conn will present to its peer
     * during the TLS handshake. For a {@link org.gtk.gio.DtlsServerConnection}  it is
     * mandatory to set this, and that will normally be done at construct
     * time.
     * 
     * For a {@link org.gtk.gio.DtlsClientConnection}  this is optional. If a handshake fails
     * with {@link org.gtk.gio.TlsError<code>#CERTIFICATE_REQUIRED</code>   that means that the server
     * requires a certificate, and if you try connecting again, you should
     * call this method first. You can call
     * g_dtls_client_connection_get_accepted_cas() on the failed connection
     * to get a list of Certificate Authorities that the server will
     * accept certificates from.
     * 
     * (It is also possible that a server will allow the connection with
     * or without a certificate; in that case, if you don&<code>#39</code> t provide a
     * certificate, you can tell that the server requested one by the fact
     * that g_dtls_client_connection_get_accepted_cas() will return
     * non-<code>null</code> )
     */
    public default void setCertificate(TlsCertificate certificate) {
        gtk_h.g_dtls_connection_set_certificate(handle(), certificate.handle());
    }
    
    /**
     * Sets the certificate database that is used to verify peer certificates.
     * This is set to the default database by default. See
     * g_tls_backend_get_default_database(). If set to <code>null</code>  then
     * peer certificate validation will always set the
     * {@link org.gtk.gio.TlsCertificateFlags<code>#UNKNOWN_CA</code>  error (meaning
     * {@link org.gtk.gio.DtlsConnection} :accept-certificate will always be emitted on
     * client-side connections, unless that bit is not set in
     * {@link org.gtk.gio.DtlsClientConnection} validation-flags).
     * 
     * There are nonintuitive security implications when using a non-default
     * database. See {@link org.gtk.gio.DtlsConnection} database for details.
     */
    public default void setDatabase(TlsDatabase database) {
        gtk_h.g_dtls_connection_set_database(handle(), database.handle());
    }
    
    /**
     * Set the object that will be used to interact with the user. It will be used
     * for things like prompting the user for passwords.
     * 
     * The @interaction argument will normally be a derived subclass of
     * {@link org.gtk.gio.TlsInteraction}  <code>null</code> can also be provided if no user interaction
     * should occur for this connection.
     */
    public default void setInteraction(TlsInteraction interaction) {
        gtk_h.g_dtls_connection_set_interaction(handle(), interaction.handle());
    }
    
    /**
     * Sets whether or not @conn expects a proper TLS close notification
     * before the connection is closed. If this is <code>true</code> (the default),
     * then @conn will expect to receive a TLS close notification from its
     * peer before the connection is closed, and will return a
     * {@link org.gtk.gio.TlsError<code>#EOF</code>  error if the connection is closed without proper
     * notification (since this may indicate a network error, or
     * man-in-the-middle attack).
     * 
     * In some protocols, the application will know whether or not the
     * connection was closed cleanly based on application-level data
     * (because the application-level data includes a length field, or is
     * somehow self-delimiting); in this case, the close notify is
     * redundant and may be omitted. You
     * can use g_dtls_connection_set_require_close_notify() to tell @conn
     * to allow an &<code>#34</code> unannounced&<code>#34</code>  connection close, in which case the close
     * will show up as a 0-length read, as in a non-TLS
     * {@link org.gtk.gio.DatagramBased}  and it is up to the application to check that
     * the data has been fully received.
     * 
     * Note that this only affects the behavior when the peer closes the
     * connection; when the application calls g_dtls_connection_close_async() on
     * @conn itself, this will send a close notification regardless of the
     * setting of this property. If you explicitly want to do an unclean
     * close, you can close @conn&<code>#39</code> s {@link org.gtk.gio.DtlsConnection} base-socket rather
     * than closing @conn itself.
     */
    public default void setRequireCloseNotify(boolean requireCloseNotify) {
        gtk_h.g_dtls_connection_set_require_close_notify(handle(), requireCloseNotify ? 1 : 0);
    }
    
    /**
     * Shut down part or all of a DTLS connection.
     * 
     * If @shutdown_read is <code>true</code> then the receiving side of the connection is shut
     * down, and further reading is disallowed. Subsequent calls to
     * g_datagram_based_receive_messages() will return {@link org.gtk.gio.IOErrorEnum<code>#CLOSED</code>  
     * 
     * If @shutdown_write is <code>true</code> then the sending side of the connection is shut
     * down, and further writing is disallowed. Subsequent calls to
     * g_datagram_based_send_messages() will return {@link org.gtk.gio.IOErrorEnum<code>#CLOSED</code>  
     * 
     * It is allowed for both @shutdown_read and @shutdown_write to be TRUE &<code>#8212</code>  this
     * is equivalent to calling g_dtls_connection_close().
     * 
     * If @cancellable is cancelled, the {@link org.gtk.gio.DtlsConnection} may be left
     * partially-closed and any pending untransmitted data may be lost. Call
     * g_dtls_connection_shutdown() again to complete closing the {@link org.gtk.gio.DtlsConnection}
     */
    public default boolean shutdown(boolean shutdownRead, boolean shutdownWrite, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dtls_connection_shutdown(handle(), shutdownRead ? 1 : 0, shutdownWrite ? 1 : 0, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Asynchronously shut down part or all of the DTLS connection. See
     * g_dtls_connection_shutdown() for more information.
     */
    public default void shutdownAsync(boolean shutdownRead, boolean shutdownWrite, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_dtls_connection_shutdown_async(handle(), shutdownRead ? 1 : 0, shutdownWrite ? 1 : 0, ioPriority, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finish an asynchronous TLS shutdown operation. See
     * g_dtls_connection_shutdown() for more information.
     */
    public default boolean shutdownFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dtls_connection_shutdown_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    @FunctionalInterface
    public interface AcceptCertificateHandler {
        boolean signalReceived(DtlsConnection source, TlsCertificate peerCert, int errors);
    }
    
    /**
     * Emitted during the TLS handshake after the peer certificate has
     * been received. You can examine @peer_cert&<code>#39</code> s certification path by
     * calling g_tls_certificate_get_issuer() on it.
     * 
     * For a client-side connection, @peer_cert is the server&<code>#39</code> s
     * certificate, and the signal will only be emitted if the
     * certificate was not acceptable according to @conn&<code>#39</code> s
     * {@link org.gtk.gio.DtlsClientConnection} validation_flags. If you would like the
     * certificate to be accepted despite @errors, return <code>true</code> from the
     * signal handler. Otherwise, if no handler accepts the certificate,
     * the handshake will fail with {@link org.gtk.gio.TlsError<code>#BAD_CERTIFICATE</code>  
     * 
     * GLib guarantees that if certificate verification fails, this signal
     * will be emitted with at least one error will be set in @errors, but
     * it does not guarantee that all possible errors will be set.
     * Accordingly, you may not safely decide to ignore any particular
     * type of error. For example, it would be incorrect to ignore
     * {@link org.gtk.gio.TlsCertificateFlags<code>#EXPIRED</code>  if you want to allow expired
     * certificates, because this could potentially be the only error flag
     * set even if other problems exist with the certificate.
     * 
     * For a server-side connection, @peer_cert is the certificate
     * presented by the client, if this was requested via the server&<code>#39</code> s
     * {@link org.gtk.gio.DtlsServerConnection} authentication_mode. On the server side,
     * the signal is always emitted when the client presents a
     * certificate, and the certificate will only be accepted if a
     * handler returns <code>true</code> 
     * 
     * Note that if this signal is emitted as part of asynchronous I/O
     * in the main thread, then you should not attempt to interact with
     * the user before returning from the signal handler. If you want to
     * let the user decide whether or not to accept the certificate, you
     * would have to return <code>false</code> from the signal handler on the first
     * attempt, and then after the connection attempt returns a
     * {@link org.gtk.gio.TlsError<code>#BAD_CERTIFICATE</code>   you can interact with the user, and
     * if the user decides to accept the certificate, remember that fact,
     * create a new connection, and return <code>true</code> from the signal handler
     * the next time.
     * 
     * If you are doing I/O in another thread, you do not
     * need to worry about this, and can simply block in the signal
     * handler until the UI thread returns an answer.
     */
    public default SignalHandle onAcceptCertificate(AcceptCertificateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDtlsConnectionAcceptCertificate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("accept-certificate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class DtlsConnectionImpl extends org.gtk.gobject.Object implements DtlsConnection {
        public DtlsConnectionImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
