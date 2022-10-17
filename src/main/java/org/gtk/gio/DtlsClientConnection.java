package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DtlsClientConnection} is the client-side subclass of
 * {@link DtlsConnection}, representing a client-side DTLS connection.
 */
public interface DtlsClientConnection extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle g_dtls_client_connection_get_accepted_cas = Interop.downcallHandle(
        "g_dtls_client_connection_get_accepted_cas",
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
            RESULT = (MemoryAddress) g_dtls_client_connection_get_accepted_cas.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle g_dtls_client_connection_get_server_identity = Interop.downcallHandle(
        "g_dtls_client_connection_get_server_identity",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code conn}'s expected server identity
     */
    default @NotNull SocketConnectable getServerIdentity() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_dtls_client_connection_get_server_identity.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SocketConnectable.SocketConnectableImpl(Refcounted.get(RESULT, false));
    }
    
    @ApiStatus.Internal static final MethodHandle g_dtls_client_connection_get_validation_flags = Interop.downcallHandle(
        "g_dtls_client_connection_get_validation_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code conn}'s validation flags
     */
    default @NotNull TlsCertificateFlags getValidationFlags() {
        int RESULT;
        try {
            RESULT = (int) g_dtls_client_connection_get_validation_flags.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TlsCertificateFlags(RESULT);
    }
    
    @ApiStatus.Internal static final MethodHandle g_dtls_client_connection_set_server_identity = Interop.downcallHandle(
        "g_dtls_client_connection_set_server_identity",
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
            g_dtls_client_connection_set_server_identity.invokeExact(handle(), identity.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle g_dtls_client_connection_set_validation_flags = Interop.downcallHandle(
        "g_dtls_client_connection_set_validation_flags",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets {@code conn}'s validation flags, to override the default set of
     * checks performed when validating a server certificate. By default,
     * {@link TlsCertificateFlags#VALIDATE_ALL} is used.
     */
    default @NotNull void setValidationFlags(@NotNull TlsCertificateFlags flags) {
        try {
            g_dtls_client_connection_set_validation_flags.invokeExact(handle(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle g_dtls_client_connection_new = Interop.downcallHandle(
        "g_dtls_client_connection_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link DtlsClientConnection} wrapping {@code base_socket} which is
     * assumed to communicate with the server identified by {@code server_identity}.
     */
    public static @NotNull DtlsClientConnection new_(@NotNull DatagramBased baseSocket, @Nullable SocketConnectable serverIdentity) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_dtls_client_connection_new.invokeExact(baseSocket.handle(), serverIdentity.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new DtlsClientConnection.DtlsClientConnectionImpl(Refcounted.get(RESULT, true));
    }
    
    class DtlsClientConnectionImpl extends org.gtk.gobject.Object implements DtlsClientConnection {
        public DtlsClientConnectionImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
