package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link TlsConnection} is the base TLS connection class type, which wraps
 * a {@link IOStream} and provides TLS encryption on top of it. Its
 * subclasses, {@link TlsClientConnection} and {@link TlsServerConnection},
 * implement client-side and server-side TLS, respectively.
 * <p>
 * For DTLS (Datagram TLS) support, see {@link DtlsConnection}.
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
     * Used by {@link TlsConnection} implementations to emit the
     * {@link TlsConnection}::accept-certificate signal.
     */
    public boolean emitAcceptCertificate(TlsCertificate peerCert, TlsCertificateFlags errors) {
        var RESULT = gtk_h.g_tls_connection_emit_accept_certificate(handle(), peerCert.handle(), errors.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Gets {@code conn}'s certificate, as set by
     * g_tls_connection_set_certificate().
     */
    public TlsCertificate getCertificate() {
        var RESULT = gtk_h.g_tls_connection_get_certificate(handle());
        return new TlsCertificate(References.get(RESULT, false));
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
     * Returns the name of the current TLS ciphersuite, or {@code null} if the
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
     * Gets the certificate database that {@code conn} uses to verify
     * peer certificates. See g_tls_connection_set_database().
     */
    public TlsDatabase getDatabase() {
        var RESULT = gtk_h.g_tls_connection_get_database(handle());
        return new TlsDatabase(References.get(RESULT, false));
    }
    
    /**
     * Get the object that will be used to interact with the user. It will be used
     * for things like prompting the user for passwords. If {@code null} is returned, then
     * no user interaction will occur for this connection.
     */
    public TlsInteraction getInteraction() {
        var RESULT = gtk_h.g_tls_connection_get_interaction(handle());
        return new TlsInteraction(References.get(RESULT, false));
    }
    
    /**
     * Gets the name of the application-layer protocol negotiated during
     * the handshake.
     * <p>
     * If the peer did not use the ALPN extension, or did not advertise a
     * protocol that matched one of {@code conn}'s protocols, or the TLS backend
     * does not support ALPN, then this will be {@code null}. See
     * g_tls_connection_set_advertised_protocols().
     */
    public java.lang.String getNegotiatedProtocol() {
        var RESULT = gtk_h.g_tls_connection_get_negotiated_protocol(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets {@code conn}'s peer's certificate after the handshake has completed
     * or failed. (It is not set during the emission of
     * {@link TlsConnection}::accept-certificate.)
     */
    public TlsCertificate getPeerCertificate() {
        var RESULT = gtk_h.g_tls_connection_get_peer_certificate(handle());
        return new TlsCertificate(References.get(RESULT, false));
    }
    
    /**
     * Gets the errors associated with validating {@code conn}'s peer's
     * certificate, after the handshake has completed or failed. (It is
     * not set during the emission of {@link TlsConnection}::accept-certificate.)
     * <p>
     * See {@link TlsConnection}:peer-certificate-errors for more information.
     */
    public TlsCertificateFlags getPeerCertificateErrors() {
        var RESULT = gtk_h.g_tls_connection_get_peer_certificate_errors(handle());
        return new TlsCertificateFlags(RESULT);
    }
    
    /**
     * Returns the current TLS protocol version, which may be
     * {@link TlsProtocolVersion#UNKNOWN} if the connection has not handshaked, or
     * has been closed, or if the TLS backend has implemented a protocol version
     * that is not a recognized {@link TlsProtocolVersion}.
     */
    public TlsProtocolVersion getProtocolVersion() {
        var RESULT = gtk_h.g_tls_connection_get_protocol_version(handle());
        return new TlsProtocolVersion(RESULT);
    }
    
    /**
     * Tests whether or not {@code conn} expects a proper TLS close notification
     * when the connection is closed. See
     * g_tls_connection_set_require_close_notify() for details.
     */
    public boolean getRequireCloseNotify() {
        var RESULT = gtk_h.g_tls_connection_get_require_close_notify(handle());
        return (RESULT != 0);
    }
    
    /**
     * Attempts a TLS handshake on {@code conn}.
     * <p>
     * On the client side, it is never necessary to call this method;
     * although the connection needs to perform a handshake after
     * connecting (or after sending a "STARTTLS"-type command),
     * {@link TlsConnection} will handle this for you automatically when you try
     * to send or receive data on the connection. You can call
     * g_tls_connection_handshake() manually if you want to know whether
     * the initial handshake succeeded or failed (as opposed to just
     * immediately trying to use {@code conn} to read or write, in which case,
     * if it fails, it may not be possible to tell if it failed before or
     * after completing the handshake), but beware that servers may reject
     * client authentication after the handshake has completed, so a
     * successful handshake does not indicate the connection will be usable.
     * <p>
     * Likewise, on the server side, although a handshake is necessary at
     * the beginning of the communication, you do not need to call this
     * function explicitly unless you want clearer error reporting.
     * <p>
     * Previously, calling g_tls_connection_handshake() after the initial
     * handshake would trigger a rehandshake; however, this usage was
     * deprecated in GLib 2.60 because rehandshaking was removed from the
     * TLS protocol in TLS 1.3. Since GLib 2.64, calling this function after
     * the initial handshake will no longer do anything.
     * <p>
     * When using a {@link TlsConnection} created by {@link SocketClient}, the
     * {@link SocketClient} performs the initial handshake, so calling this
     * function manually is not recommended.
     * <p>
     * {@link TlsConnection}::accept_certificate may be emitted during the
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
     * Asynchronously performs a TLS handshake on {@code conn}. See
     * g_tls_connection_handshake() for more information.
     */
    public void handshakeAsync(int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_tls_connection_handshake_async(handle(), ioPriority, cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
     * protocol after the handshake.  Specifying {@code null} for the the value
     * of {@code protocols} will disable ALPN negotiation.
     * <p>
     * See <a href="https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml#alpn-protocol-ids">IANA TLS ALPN Protocol IDs</a>
     * for a list of registered protocol IDs.
     */
    public void setAdvertisedProtocols(java.lang.String[] protocols) {
        gtk_h.g_tls_connection_set_advertised_protocols(handle(), Interop.allocateNativeArray(protocols).handle());
    }
    
    /**
     * This sets the certificate that {@code conn} will present to its peer
     * during the TLS handshake. For a {@link TlsServerConnection}, it is
     * mandatory to set this, and that will normally be done at construct
     * time.
     * <p>
     * For a {@link TlsClientConnection}, this is optional. If a handshake fails
     * with {@link TlsError#CERTIFICATE_REQUIRED}, that means that the server
     * requires a certificate, and if you try connecting again, you should
     * call this method first. You can call
     * g_tls_client_connection_get_accepted_cas() on the failed connection
     * to get a list of Certificate Authorities that the server will
     * accept certificates from.
     * <p>
     * (It is also possible that a server will allow the connection with
     * or without a certificate; in that case, if you don't provide a
     * certificate, you can tell that the server requested one by the fact
     * that g_tls_client_connection_get_accepted_cas() will return
     * non-{@code null}.)
     */
    public void setCertificate(TlsCertificate certificate) {
        gtk_h.g_tls_connection_set_certificate(handle(), certificate.handle());
    }
    
    /**
     * Sets the certificate database that is used to verify peer certificates.
     * This is set to the default database by default. See
     * g_tls_backend_get_default_database(). If set to {@code null}, then
     * peer certificate validation will always set the
     * {@link TlsCertificateFlags#UNKNOWN_CA} error (meaning
     * {@link TlsConnection}::accept-certificate will always be emitted on
     * client-side connections, unless that bit is not set in
     * {@link TlsClientConnection}:validation-flags).
     * <p>
     * There are nonintuitive security implications when using a non-default
     * database. See {@link DtlsConnection}:database for details.
     */
    public void setDatabase(TlsDatabase database) {
        gtk_h.g_tls_connection_set_database(handle(), database.handle());
    }
    
    /**
     * Set the object that will be used to interact with the user. It will be used
     * for things like prompting the user for passwords.
     * <p>
     * The {@code interaction} argument will normally be a derived subclass of
     * {@link TlsInteraction}. {@code null} can also be provided if no user interaction
     * should occur for this connection.
     */
    public void setInteraction(TlsInteraction interaction) {
        gtk_h.g_tls_connection_set_interaction(handle(), interaction.handle());
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
     * redundant and sometimes omitted. (TLS 1.1 explicitly allows this;
     * in TLS 1.0 it is technically an error, but often done anyway.) You
     * can use g_tls_connection_set_require_close_notify() to tell {@code conn}
     * to allow an "unannounced" connection close, in which case the close
     * will show up as a 0-length read, as in a non-TLS
     * {@link SocketConnection}, and it is up to the application to check that
     * the data has been fully received.
     * <p>
     * Note that this only affects the behavior when the peer closes the
     * connection; when the application calls g_io_stream_close() itself
     * on {@code conn}, this will send a close notification regardless of the
     * setting of this property. If you explicitly want to do an unclean
     * close, you can close {@code conn}'s {@link TlsConnection}:base-io-stream rather
     * than closing {@code conn} itself, but note that this may only be done when no other
     * operations are pending on {@code conn} or the base I/O stream.
     */
    public void setRequireCloseNotify(boolean requireCloseNotify) {
        gtk_h.g_tls_connection_set_require_close_notify(handle(), requireCloseNotify ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface AcceptCertificateHandler {
        boolean signalReceived(TlsConnection source, TlsCertificate peerCert, TlsCertificateFlags errors);
    }
    
    /**
     * Emitted during the TLS handshake after the peer certificate has
     * been received. You can examine {@code peer_cert}'s certification path by
     * calling g_tls_certificate_get_issuer() on it.
     * <p>
     * For a client-side connection, {@code peer_cert} is the server's
     * certificate, and the signal will only be emitted if the
     * certificate was not acceptable according to {@code conn}'s
     * {@link TlsClientConnection}:validation_flags. If you would like the
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
     * {@link TlsServerConnection}:authentication_mode. On the server side,
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
    public SignalHandle onAcceptCertificate(AcceptCertificateHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("accept-certificate").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TlsConnection.class, "__signalTlsConnectionAcceptCertificate",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static boolean __signalTlsConnectionAcceptCertificate(MemoryAddress source, MemoryAddress peerCert, int errors, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TlsConnection.AcceptCertificateHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new TlsConnection(References.get(source)), new TlsCertificate(References.get(peerCert, false)), new TlsCertificateFlags(errors));
    }
    
}
