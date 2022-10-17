package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link TlsClientConnection} is the client-side subclass of
 * {@link TlsConnection}, representing a client-side TLS connection.
 */
public interface TlsClientConnection extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle g_tls_client_connection_copy_session_state = Interop.downcallHandle(
        "g_tls_client_connection_copy_session_state",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Possibly copies session state from one connection to another, for use
     * in TLS session resumption. This is not normally needed, but may be
     * used when the same session needs to be used between different
     * endpoints, as is required by some protocols, such as FTP over TLS.
     * {@code source} should have already completed a handshake and, since TLS 1.3,
     * it should have been used to read data at least once. {@code conn} should not
     * have completed a handshake.
     * <p>
     * It is not possible to know whether a call to this function will
     * actually do anything. Because session resumption is normally used
     * only for performance benefit, the TLS backend might not implement
     * this function. Even if implemented, it may not actually succeed in
     * allowing {@code conn} to resume {@code source}'s TLS session, because the server
     * may not have sent a session resumption token to {@code source}, or it may
     * refuse to accept the token from {@code conn}. There is no way to know
     * whether a call to this function is actually successful.
     * <p>
     * Using this function is not required to benefit from session
     * resumption. If the TLS backend supports session resumption, the
     * session will be resumed automatically if it is possible to do so
     * without weakening the privacy guarantees normally provided by TLS,
     * without need to call this function. For example, with TLS 1.3,
     * a session ticket will be automatically copied from any
     * {@link TlsClientConnection} that has previously received session tickets
     * from the server, provided a ticket is available that has not
     * previously been used for session resumption, since session ticket
     * reuse would be a privacy weakness. Using this function causes the
     * ticket to be copied without regard for privacy considerations.
     */
    default @NotNull void copySessionState(@NotNull TlsClientConnection source) {
        try {
            g_tls_client_connection_copy_session_state.invokeExact(handle(), source.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle g_tls_client_connection_get_accepted_cas = Interop.downcallHandle(
        "g_tls_client_connection_get_accepted_cas",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the list of distinguished names of the Certificate Authorities
     * that the server will accept certificates from. This will be set
     * during the TLS handshake if the server requests a certificate.
     * Otherwise, it will be {@code null}.
     * <p>
     * Each item in the list is a {@link org.gtk.glib.ByteArray} which contains the complete
     * subject DN of the certificate authority.
     */
    default @NotNull org.gtk.glib.List getAcceptedCas() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_tls_client_connection_get_accepted_cas.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle g_tls_client_connection_get_server_identity = Interop.downcallHandle(
        "g_tls_client_connection_get_server_identity",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code conn}'s expected server identity
     */
    default @Nullable SocketConnectable getServerIdentity() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_tls_client_connection_get_server_identity.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SocketConnectable.SocketConnectableImpl(Refcounted.get(RESULT, false));
    }
    
    @ApiStatus.Internal static final MethodHandle g_tls_client_connection_set_server_identity = Interop.downcallHandle(
        "g_tls_client_connection_set_server_identity",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code conn}'s expected server identity, which is used both to tell
     * servers on virtual hosts which certificate to present, and also
     * to let {@code conn} know what name to look for in the certificate when
     * performing {@link TlsCertificateFlags#BAD_IDENTITY} validation, if enabled.
     */
    default @NotNull void setServerIdentity(@NotNull SocketConnectable identity) {
        try {
            g_tls_client_connection_set_server_identity.invokeExact(handle(), identity.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle g_tls_client_connection_new = Interop.downcallHandle(
        "g_tls_client_connection_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link TlsClientConnection} wrapping {@code base_io_stream} (which
     * must have pollable input and output streams) which is assumed to
     * communicate with the server identified by {@code server_identity}.
     * <p>
     * See the documentation for {@link TlsConnection}:base-io-stream for restrictions
     * on when application code can run operations on the {@code base_io_stream} after
     * this function has returned.
     */
    public static @NotNull TlsClientConnection new_(@NotNull IOStream baseIoStream, @Nullable SocketConnectable serverIdentity) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_tls_client_connection_new.invokeExact(baseIoStream.handle(), serverIdentity.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new TlsClientConnection.TlsClientConnectionImpl(Refcounted.get(RESULT, true));
    }
    
    class TlsClientConnectionImpl extends org.gtk.gobject.Object implements TlsClientConnection {
        public TlsClientConnectionImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
