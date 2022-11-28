package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DtlsClientConnection} is the client-side subclass of
 * {@link DtlsConnection}, representing a client-side DTLS connection.
 * @version 2.48
 */
public interface DtlsClientConnection extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to DtlsClientConnection if its GType is a (or inherits from) "GDtlsClientConnection".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DtlsClientConnection} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GDtlsClientConnection", a ClassCastException will be thrown.
     */
    public static DtlsClientConnection castFrom(org.gtk.gobject.Object gobject) {
            return new DtlsClientConnectionImpl(gobject.handle(), gobject.yieldOwnership());
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
            RESULT = (MemoryAddress) DowncallHandles.g_dtls_client_connection_get_accepted_cas.invokeExact(
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
    default @NotNull org.gtk.gio.SocketConnectable getServerIdentity() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dtls_client_connection_get_server_identity.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.SocketConnectable.SocketConnectableImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets {@code conn}'s validation flags
     * <p>
     * This function does not work as originally designed and is impossible
     * to use correctly. See {@link DtlsClientConnection}:validation-flags for more
     * information.
     * @return the validation flags
     * @deprecated Do not attempt to ignore validation errors.
     */
    @Deprecated
    default @NotNull org.gtk.gio.TlsCertificateFlags getValidationFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dtls_client_connection_get_validation_flags.invokeExact(
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
            DowncallHandles.g_dtls_client_connection_set_server_identity.invokeExact(
                    handle(),
                    identity.handle());
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
     * to use correctly. See {@link DtlsClientConnection}:validation-flags for more
     * information.
     * @param flags the {@link TlsCertificateFlags} to use
     * @deprecated Do not attempt to ignore validation errors.
     */
    @Deprecated
    default void setValidationFlags(@NotNull org.gtk.gio.TlsCertificateFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_dtls_client_connection_set_validation_flags.invokeExact(
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
            RESULT = (long) DowncallHandles.g_dtls_client_connection_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Creates a new {@link DtlsClientConnection} wrapping {@code base_socket} which is
     * assumed to communicate with the server identified by {@code server_identity}.
     * @param baseSocket the {@link DatagramBased} to wrap
     * @param serverIdentity the expected identity of the server
     * @return the new
     *   {@link DtlsClientConnection}, or {@code null} on error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static @NotNull org.gtk.gio.DtlsClientConnection new_(@NotNull org.gtk.gio.DatagramBased baseSocket, @Nullable org.gtk.gio.SocketConnectable serverIdentity) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(baseSocket, "Parameter 'baseSocket' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dtls_client_connection_new.invokeExact(
                    baseSocket.handle(),
                    (Addressable) (serverIdentity == null ? MemoryAddress.NULL : serverIdentity.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.DtlsClientConnection.DtlsClientConnectionImpl(RESULT, Ownership.FULL);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_client_connection_get_accepted_cas = Interop.downcallHandle(
            "g_dtls_client_connection_get_accepted_cas",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_client_connection_get_server_identity = Interop.downcallHandle(
            "g_dtls_client_connection_get_server_identity",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_client_connection_get_validation_flags = Interop.downcallHandle(
            "g_dtls_client_connection_get_validation_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_client_connection_set_server_identity = Interop.downcallHandle(
            "g_dtls_client_connection_set_server_identity",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_client_connection_set_validation_flags = Interop.downcallHandle(
            "g_dtls_client_connection_set_validation_flags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_client_connection_get_type = Interop.downcallHandle(
            "g_dtls_client_connection_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_dtls_client_connection_new = Interop.downcallHandle(
            "g_dtls_client_connection_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    class DtlsClientConnectionImpl extends org.gtk.gobject.Object implements DtlsClientConnection {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public DtlsClientConnectionImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
