package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link TlsClientConnection} is the client-side subclass of
 * {@link TlsConnection}, representing a client-side TLS connection.
 * @version 2.28
 */
public interface TlsClientConnection extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to TlsClientConnection if its GType is a (or inherits from) "GTlsClientConnection".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TlsClientConnection} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GTlsClientConnection", a ClassCastException will be thrown.
     */
    public static TlsClientConnection castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), TlsClientConnection.getType())) {
            return new TlsClientConnectionImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GTlsClientConnection");
        }
    }
    
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
     * @param source a {@link TlsClientConnection}
     */
    default void copySessionState(@NotNull org.gtk.gio.TlsClientConnection source) {
        java.util.Objects.requireNonNull(source, "Parameter 'source' must not be null");
        try {
            DowncallHandles.g_tls_client_connection_copy_session_state.invokeExact(
                    handle(),
                    source.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the list of distinguished names of the Certificate Authorities
     * that the server will accept certificates from. This will be set
     * during the TLS handshake if the server requests a certificate.
     * Otherwise, it will be {@code null}.
     * <p>
     * Each item in the list is a {@link org.gtk.glib.ByteArray} which contains the complete
     * subject DN of the certificate authority.
     * @return the list of
     * CA DNs. You should unref each element with g_byte_array_unref() and then
     * the free the list with g_list_free().
     */
    default @NotNull org.gtk.glib.List getAcceptedCas() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_client_connection_get_accepted_cas.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets {@code conn}'s expected server identity
     * @return a {@link SocketConnectable} describing the
     * expected server identity, or {@code null} if the expected identity is not
     * known.
     */
    default @Nullable org.gtk.gio.SocketConnectable getServerIdentity() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_client_connection_get_server_identity.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.SocketConnectable.SocketConnectableImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * SSL 3.0 is no longer supported. See
     * g_tls_client_connection_set_use_ssl3() for details.
     * @return {@code false}
     * @deprecated SSL 3.0 is insecure.
     */
    @Deprecated
    default boolean getUseSsl3() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tls_client_connection_get_use_ssl3.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets {@code conn}'s validation flags
     * <p>
     * This function does not work as originally designed and is impossible
     * to use correctly. See {@link TlsClientConnection}:validation-flags for more
     * information.
     * @return the validation flags
     * @deprecated Do not attempt to ignore validation errors.
     */
    @Deprecated
    default @NotNull org.gtk.gio.TlsCertificateFlags getValidationFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tls_client_connection_get_validation_flags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.TlsCertificateFlags(RESULT);
    }
    
    /**
     * Sets {@code conn}'s expected server identity, which is used both to tell
     * servers on virtual hosts which certificate to present, and also
     * to let {@code conn} know what name to look for in the certificate when
     * performing {@link TlsCertificateFlags#BAD_IDENTITY} validation, if enabled.
     * @param identity a {@link SocketConnectable} describing the expected server identity
     */
    default void setServerIdentity(@NotNull org.gtk.gio.SocketConnectable identity) {
        java.util.Objects.requireNonNull(identity, "Parameter 'identity' must not be null");
        try {
            DowncallHandles.g_tls_client_connection_set_server_identity.invokeExact(
                    handle(),
                    identity.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Since GLib 2.42.1, SSL 3.0 is no longer supported.
     * <p>
     * From GLib 2.42.1 through GLib 2.62, this function could be used to
     * force use of TLS 1.0, the lowest-supported TLS protocol version at
     * the time. In the past, this was needed to connect to broken TLS
     * servers that exhibited protocol version intolerance. Such servers
     * are no longer common, and using TLS 1.0 is no longer considered
     * acceptable.
     * <p>
     * Since GLib 2.64, this function does nothing.
     * @param useSsl3 a {@code gboolean}, ignored
     * @deprecated SSL 3.0 is insecure.
     */
    @Deprecated
    default void setUseSsl3(boolean useSsl3) {
        try {
            DowncallHandles.g_tls_client_connection_set_use_ssl3.invokeExact(
                    handle(),
                    useSsl3 ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code conn}'s validation flags, to override the default set of
     * checks performed when validating a server certificate. By default,
     * {@link TlsCertificateFlags#VALIDATE_ALL} is used.
     * <p>
     * This function does not work as originally designed and is impossible
     * to use correctly. See {@link TlsClientConnection}:validation-flags for more
     * information.
     * @param flags the {@link TlsCertificateFlags} to use
     * @deprecated Do not attempt to ignore validation errors.
     */
    @Deprecated
    default void setValidationFlags(@NotNull org.gtk.gio.TlsCertificateFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_tls_client_connection_set_validation_flags.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tls_client_connection_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Creates a new {@link TlsClientConnection} wrapping {@code base_io_stream} (which
     * must have pollable input and output streams) which is assumed to
     * communicate with the server identified by {@code server_identity}.
     * <p>
     * See the documentation for {@link TlsConnection}:base-io-stream for restrictions
     * on when application code can run operations on the {@code base_io_stream} after
     * this function has returned.
     * @param baseIoStream the {@link IOStream} to wrap
     * @param serverIdentity the expected identity of the server
     * @return the new
     * {@link TlsClientConnection}, or {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static @NotNull org.gtk.gio.TlsClientConnection new_(@NotNull org.gtk.gio.IOStream baseIoStream, @Nullable org.gtk.gio.SocketConnectable serverIdentity) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(baseIoStream, "Parameter 'baseIoStream' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_client_connection_new.invokeExact(
                    baseIoStream.handle(),
                    (Addressable) (serverIdentity == null ? MemoryAddress.NULL : serverIdentity.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.TlsClientConnection.TlsClientConnectionImpl(RESULT, Ownership.FULL);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_client_connection_copy_session_state = Interop.downcallHandle(
            "g_tls_client_connection_copy_session_state",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_client_connection_get_accepted_cas = Interop.downcallHandle(
            "g_tls_client_connection_get_accepted_cas",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_client_connection_get_server_identity = Interop.downcallHandle(
            "g_tls_client_connection_get_server_identity",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_client_connection_get_use_ssl3 = Interop.downcallHandle(
            "g_tls_client_connection_get_use_ssl3",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_client_connection_get_validation_flags = Interop.downcallHandle(
            "g_tls_client_connection_get_validation_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_client_connection_set_server_identity = Interop.downcallHandle(
            "g_tls_client_connection_set_server_identity",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_client_connection_set_use_ssl3 = Interop.downcallHandle(
            "g_tls_client_connection_set_use_ssl3",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_client_connection_set_validation_flags = Interop.downcallHandle(
            "g_tls_client_connection_set_validation_flags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_client_connection_get_type = Interop.downcallHandle(
            "g_tls_client_connection_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_client_connection_new = Interop.downcallHandle(
            "g_tls_client_connection_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    class TlsClientConnectionImpl extends org.gtk.gobject.Object implements TlsClientConnection {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public TlsClientConnectionImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
