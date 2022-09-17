package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GTlsConnection is the base TLS connection class type, which wraps
 * a #GIOStream and provides TLS encryption on top of it. Its
 * subclasses, #GTlsClientConnection and #GTlsServerConnection,
 * implement client-side and server-side TLS, respectively.
 * 
 * For DTLS (Datagram TLS) support, see #GDtlsConnection.
 */
public class TlsConnection extends IOStream {

    public TlsConnection(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TlsConnection */
    public static TlsConnection castFrom(org.gtk.gobject.Object gobject) {
        return new TlsConnection(gobject.getReference());
    }
    
    /**
     * Used by #GTlsConnection implementations to emit the
     * #GTlsConnection::accept-certificate signal.
     */
    public boolean emitAcceptCertificate(TlsCertificate peerCert, int errors) {
        var RESULT = gtk_h.g_tls_connection_emit_accept_certificate(handle(), peerCert.handle(), errors);
        return (RESULT != 0);
    }
    
    /**
     * Gets @conn&#39;s certificate, as set by
     * g_tls_connection_set_certificate().
     */
    public TlsCertificate getCertificate() {
        var RESULT = gtk_h.g_tls_connection_get_certificate(handle());
        return new TlsCertificate(References.get(RESULT, false));
    }
    
    /**
     * Query the TLS backend for TLS channel binding data of @type for @conn.
     * 
     * This call retrieves TLS channel binding data as specified in RFC
     * {@link [5056]}(https://tools.ietf.org/html/rfc5056), RFC
     * {@link [5929]}(https://tools.ietf.org/html/rfc5929), and related RFCs.  The
     * binding data is returned in @data.  The @data is resized by the callee
     * using #GByteArray buffer management and will be freed when the @data
     * is destroyed by g_byte_array_unref(). If @data is <code>NULL,</code> it will only
     * check whether TLS backend is able to fetch the data (e.g. whether @type
     * is supported by the TLS backend). It does not guarantee that the data
     * will be available though.  That could happen if TLS connection does not
     * support @type or the binding data is not available yet due to additional
     * negotiation or input required.
     */
    public boolean getChannelBindingData(TlsChannelBindingType type, byte[] data) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_tls_connection_get_channel_binding_data(handle(), type.getValue(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Returns the name of the current TLS ciphersuite, or <code>null</code> if the
     * connection has not handshaked or has been closed. Beware that the TLS
     * backend may use any of multiple different naming conventions, because
     * OpenSSL and GnuTLS have their own ciphersuite naming conventions that
     * are different from each other and different from the standard, IANA-
     * registered ciphersuite names. The ciphersuite name is intended to be
     * displayed to the user for informative purposes only, and parsing it
     * is not recommended.
     */
    public java.lang.String getCiphersuiteName() {
        var RESULT = gtk_h.g_tls_connection_get_ciphersuite_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the certificate database that @conn uses to verify
     * peer certificates. See g_tls_connection_set_database().
     */
    public TlsDatabase getDatabase() {
        var RESULT = gtk_h.g_tls_connection_get_database(handle());
        return new TlsDatabase(References.get(RESULT, false));
    }
    
    /**
     * Get the object that will be used to interact with the user. It will be used
     * for things like prompting the user for passwords. If <code>null</code> is returned, then
     * no user interaction will occur for this connection.
     */
    public TlsInteraction getInteraction() {
        var RESULT = gtk_h.g_tls_connection_get_interaction(handle());
        return new TlsInteraction(References.get(RESULT, false));
    }
    
    /**
     * Gets the name of the application-layer protocol negotiated during
     * the handshake.
     * 
     * If the peer did not use the ALPN extension, or did not advertise a
     * protocol that matched one of @conn&#39;s protocols, or the TLS backend
     * does not support ALPN, then this will be <code>NULL.</code> See
     * g_tls_connection_set_advertised_protocols().
     */
    public java.lang.String getNegotiatedProtocol() {
        var RESULT = gtk_h.g_tls_connection_get_negotiated_protocol(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @conn&#39;s peer&#39;s certificate after the handshake has completed
     * or failed. (It is not set during the emission of
     * #GTlsConnection::accept-certificate.)
     */
    public TlsCertificate getPeerCertificate() {
        var RESULT = gtk_h.g_tls_connection_get_peer_certificate(handle());
        return new TlsCertificate(References.get(RESULT, false));
    }
    
    /**
     * Gets the errors associated with validating @conn&#39;s peer&#39;s
     * certificate, after the handshake has completed or failed. (It is
     * not set during the emission of #GTlsConnection::accept-certificate.)
     * 
     * See #GTlsConnection:peer-certificate-errors for more information.
     */
    public int getPeerCertificateErrors() {
        var RESULT = gtk_h.g_tls_connection_get_peer_certificate_errors(handle());
        return RESULT;
    }
    
    /**
     * Returns the current TLS protocol version, which may be
     * {@link org.gtk.gio.TlsProtocolVersion#UNKNOWN} if the connection has not handshaked, or
     * has been closed, or if the TLS backend has implemented a protocol version
     * that is not a recognized #GTlsProtocolVersion.
     */
    public TlsProtocolVersion getProtocolVersion() {
        var RESULT = gtk_h.g_tls_connection_get_protocol_version(handle());
        return TlsProtocolVersion.fromValue(RESULT);
    }
    
    /**
     * Tests whether or not @conn expects a proper TLS close notification
     * when the connection is closed. See
     * g_tls_connection_set_require_close_notify() for details.
     */
    public boolean getRequireCloseNotify() {
        var RESULT = gtk_h.g_tls_connection_get_require_close_notify(handle());
        return (RESULT != 0);
    }
    
    /**
     * Attempts a TLS handshake on @conn.
     * 
     * On the client side, it is never necessary to call this method;
     * although the connection needs to perform a handshake after
     * connecting (or after sending a &#34;STARTTLS&#34;-type command),
     * #GTlsConnection will handle this for you automatically when you try
     * to send or receive data on the connection. You can call
     * g_tls_connection_handshake() manually if you want to know whether
     * the initial handshake succeeded or failed (as opposed to just
     * immediately trying to use @conn to read or write, in which case,
     * if it fails, it may not be possible to tell if it failed before or
     * after completing the handshake), but beware that servers may reject
     * client authentication after the handshake has completed, so a
     * successful handshake does not indicate the connection will be usable.
     * 
     * Likewise, on the server side, although a handshake is necessary at
     * the beginning of the communication, you do not need to call this
     * function explicitly unless you want clearer error reporting.
     * 
     * Previously, calling g_tls_connection_handshake() after the initial
     * handshake would trigger a rehandshake; however, this usage was
     * deprecated in GLib 2.60 because rehandshaking was removed from the
     * TLS protocol in TLS 1.3. Since GLib 2.64, calling this function after
     * the initial handshake will no longer do anything.
     * 
     * When using a #GTlsConnection created by #GSocketClient, the
     * #GSocketClient performs the initial handshake, so calling this
     * function manually is not recommended.
     * 
     * #GTlsConnection::accept_certificate may be emitted during the
     * handshake.
     */
    public boolean handshake(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_tls_connection_handshake(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Asynchronously performs a TLS handshake on @conn. See
     * g_tls_connection_handshake() for more information.
     */
    public void handshakeAsync(int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_tls_connection_handshake_async(handle(), ioPriority, cancellable.handle(), 
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
     * g_tls_connection_handshake() for more information.
     */
    public boolean handshakeFinish(AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_tls_connection_handshake_finish(handle(), result.handle(), GERROR);
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
     * g_tls_connection_get_negotiated_protocol() to find the negotiated
     * protocol after the handshake.  Specifying <code>null</code> for the the value
     * of @protocols will disable ALPN negotiation.
     * 
     * See {@link [IANA TLS ALPN Protocol IDs]}(https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids)
     * for a list of registered protocol IDs.
     */
    public void setAdvertisedProtocols(java.lang.String[] protocols) {
        gtk_h.g_tls_connection_set_advertised_protocols(handle(), Interop.allocateNativeArray(protocols).handle());
    }
    
    /**
     * This sets the certificate that @conn will present to its peer
     * during the TLS handshake. For a #GTlsServerConnection, it is
     * mandatory to set this, and that will normally be done at construct
     * time.
     * 
     * For a #GTlsClientConnection, this is optional. If a handshake fails
     * with <code>G_TLS_ERROR_CERTIFICATE_REQUIRED,</code> that means that the server
     * requires a certificate, and if you try connecting again, you should
     * call this method first. You can call
     * g_tls_client_connection_get_accepted_cas() on the failed connection
     * to get a list of Certificate Authorities that the server will
     * accept certificates from.
     * 
     * (It is also possible that a server will allow the connection with
     * or without a certificate; in that case, if you don&#39;t provide a
     * certificate, you can tell that the server requested one by the fact
     * that g_tls_client_connection_get_accepted_cas() will return
     * non-that means that the server
     * requires a certificate, and if you try connecting again, you should
     * call this method first. You can call
     * g_tls_client_connection_get_accepted_cas() on the failed connection
     * to get a list of Certificate Authorities that the server will
     * accept certificates from.
     * 
     * (It is also possible that a server will allow the connection with
     * or without a certificate; in that case, if you don&#39;t provide a
     * certificate, you can tell that the server requested one by the fact
     * that g_tls_client_connection_get_accepted_cas() will return
     * non-%NULL.)
     */
    public void setCertificate(TlsCertificate certificate) {
        gtk_h.g_tls_connection_set_certificate(handle(), certificate.handle());
    }
    
    /**
     * Sets the certificate database that is used to verify peer certificates.
     * This is set to the default database by default. See
     * g_tls_backend_get_default_database(). If set to <code>NULL,</code> then
     * peer certificate validation will always set the
     * {@link org.gtk.gio.TlsCertificateFlags#UNKNOWN_CA} error (meaning
     * #GTlsConnection::accept-certificate will always be emitted on
     * client-side connections, unless that bit is not set in
     * #GTlsClientConnection:validation-flags).
     * 
     * There are nonintuitive security implications when using a non-default
     * database. See #GDtlsConnection:database for details.
     */
    public void setDatabase(TlsDatabase database) {
        gtk_h.g_tls_connection_set_database(handle(), database.handle());
    }
    
    /**
     * Set the object that will be used to interact with the user. It will be used
     * for things like prompting the user for passwords.
     * 
     * The @interaction argument will normally be a derived subclass of
     * #GTlsInteraction. <code>null</code> can also be provided if no user interaction
     * should occur for this connection.
     */
    public void setInteraction(TlsInteraction interaction) {
        gtk_h.g_tls_connection_set_interaction(handle(), interaction.handle());
    }
    
    /**
     * Sets whether or not @conn expects a proper TLS close notification
     * before the connection is closed. If this is <code>true</code> (the default),
     * then @conn will expect to receive a TLS close notification from its
     * peer before the connection is closed, and will return a
     * {@link org.gtk.gio.TlsError#EOF} error if the connection is closed without proper
     * notification (since this may indicate a network error, or
     * man-in-the-middle attack).
     * 
     * In some protocols, the application will know whether or not the
     * connection was closed cleanly based on application-level data
     * (because the application-level data includes a length field, or is
     * somehow self-delimiting); in this case, the close notify is
     * redundant and sometimes omitted. (TLS 1.1 explicitly allows this;
     * in TLS 1.0 it is technically an error, but often done anyway.) You
     * can use g_tls_connection_set_require_close_notify() to tell @conn
     * to allow an &#34;unannounced&#34; connection close, in which case the close
     * will show up as a 0-length read, as in a non-TLS
     * #GSocketConnection, and it is up to the application to check that
     * the data has been fully received.
     * 
     * Note that this only affects the behavior when the peer closes the
     * connection; when the application calls g_io_stream_close() itself
     * on @conn, this will send a close notification regardless of the
     * setting of this property. If you explicitly want to do an unclean
     * close, you can close @conn&#39;s #GTlsConnection:base-io-stream rather
     * than closing @conn itself, but note that this may only be done when no other
     * operations are pending on @conn or the base I/O stream.
     */
    public void setRequireCloseNotify(boolean requireCloseNotify) {
        gtk_h.g_tls_connection_set_require_close_notify(handle(), requireCloseNotify ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface AcceptCertificateHandler {
        boolean signalReceived(TlsConnection source, TlsCertificate peerCert, int errors);
    }
    
    /**
     * Emitted during the TLS handshake after the peer certificate has
     * been received. You can examine @peer_cert&#39;s certification path by
     * calling g_tls_certificate_get_issuer() on it.
     * 
     * For a client-side connection, @peer_cert is the server&#39;s
     * certificate, and the signal will only be emitted if the
     * certificate was not acceptable according to @conn&#39;s
     * #GTlsClientConnection:validation_flags. If you would like the
     * certificate to be accepted despite @errors, return <code>true</code> from the
     * signal handler. Otherwise, if no handler accepts the certificate,
     * the handshake will fail with <code>G_TLS_ERROR_BAD_CERTIFICATE.
     * 
     * GLib</code> guarantees that if certificate verification fails, this signal
     * will be emitted with at least one error will be set in @errors, but
     * it does not guarantee that all possible errors will be set.
     * Accordingly, you may not safely decide to ignore any particular
     * type of error. For example, it would be incorrect to ignore
     * {@link org.gtk.gio.TlsCertificateFlags#EXPIRED} if you want to allow expired
     * certificates, because this could potentially be the only error flag
     * set even if other problems exist with the certificate.
     * 
     * For a server-side connection, @peer_cert is the certificate
     * presented by the client, if this was requested via the server&#39;s
     * #GTlsServerConnection:authentication_mode. On the server side,
     * the signal is always emitted when the client presents a
     * certificate, and the certificate will only be accepted if a
     * handler returns <code>TRUE.
     * 
     * Note</code> that if this signal is emitted as part of asynchronous I/O
     * in the main thread, then you should not attempt to interact with
     * the user before returning from the signal handler. If you want to
     * let the user decide whether or not to accept the certificate, you
     * would have to return <code>false</code> from the signal handler on the first
     * attempt, and then after the connection attempt returns a
     * <code>G_TLS_ERROR_BAD_CERTIFICATE,</code> you can interact with the user, and
     * if the user decides to accept the certificate, remember that fact,
     * create a new connection, and return <code>true</code> from the signal handler
     * the next time.
     * 
     * If you are doing I/O in another thread, you do not
     * need to worry about this, and can simply block in the signal
     * handler until the UI thread returns an answer.
     */
    public SignalHandle onAcceptCertificate(AcceptCertificateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTlsConnectionAcceptCertificate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("accept-certificate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
