package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * TLS (Transport Layer Security, aka SSL) and DTLS backend.
 * @version 2.28
 */
public interface TlsBackend extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Gets the {@link org.gtk.gobject.Type} of {@code backend}'s {@link TlsCertificate} implementation.
     * @return the {@link org.gtk.gobject.Type} of {@code backend}'s {@link TlsCertificate}
     *   implementation.
     */
    default @NotNull org.gtk.glib.Type getCertificateType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tls_backend_get_certificate_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the {@link org.gtk.gobject.Type} of {@code backend}'s {@link TlsClientConnection} implementation.
     * @return the {@link org.gtk.gobject.Type} of {@code backend}'s {@link TlsClientConnection}
     *   implementation.
     */
    default @NotNull org.gtk.glib.Type getClientConnectionType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tls_backend_get_client_connection_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the default {@link TlsDatabase} used to verify TLS connections.
     * @return the default database, which should be
     *               unreffed when done.
     */
    default @NotNull org.gtk.gio.TlsDatabase getDefaultDatabase() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_backend_get_default_database.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.TlsDatabase(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets the {@link org.gtk.gobject.Type} of {@code backend}’s {@link DtlsClientConnection} implementation.
     * @return the {@link org.gtk.gobject.Type} of {@code backend}’s {@link DtlsClientConnection}
     *   implementation, or {@code G_TYPE_INVALID} if this backend doesn’t support DTLS.
     */
    default @NotNull org.gtk.glib.Type getDtlsClientConnectionType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tls_backend_get_dtls_client_connection_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the {@link org.gtk.gobject.Type} of {@code backend}’s {@link DtlsServerConnection} implementation.
     * @return the {@link org.gtk.gobject.Type} of {@code backend}’s {@link DtlsServerConnection}
     *   implementation, or {@code G_TYPE_INVALID} if this backend doesn’t support DTLS.
     */
    default @NotNull org.gtk.glib.Type getDtlsServerConnectionType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tls_backend_get_dtls_server_connection_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the {@link org.gtk.gobject.Type} of {@code backend}'s {@link TlsFileDatabase} implementation.
     * @return the {@link org.gtk.gobject.Type} of backend's {@link TlsFileDatabase} implementation.
     */
    default @NotNull org.gtk.glib.Type getFileDatabaseType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tls_backend_get_file_database_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the {@link org.gtk.gobject.Type} of {@code backend}'s {@link TlsServerConnection} implementation.
     * @return the {@link org.gtk.gobject.Type} of {@code backend}'s {@link TlsServerConnection}
     *   implementation.
     */
    default @NotNull org.gtk.glib.Type getServerConnectionType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tls_backend_get_server_connection_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Set the default {@link TlsDatabase} used to verify TLS connections
     * <p>
     * Any subsequent call to g_tls_backend_get_default_database() will return
     * the database set in this call.  Existing databases and connections are not
     * modified.
     * <p>
     * Setting a {@code null} default database will reset to using the system default
     * database as if g_tls_backend_set_default_database() had never been called.
     * @param database the {@link TlsDatabase}
     */
    default void setDefaultDatabase(@Nullable org.gtk.gio.TlsDatabase database) {
        java.util.Objects.requireNonNullElse(database, MemoryAddress.NULL);
        try {
            DowncallHandles.g_tls_backend_set_default_database.invokeExact(handle(), database.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks if DTLS is supported. DTLS support may not be available even if TLS
     * support is available, and vice-versa.
     * @return whether DTLS is supported
     */
    default boolean supportsDtls() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tls_backend_supports_dtls.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if TLS is supported; if this returns {@code false} for the default
     * {@link TlsBackend}, it means no "real" TLS backend is available.
     * @return whether or not TLS is supported
     */
    default boolean supportsTls() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tls_backend_supports_tls.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the default {@link TlsBackend} for the system.
     * @return a {@link TlsBackend}, which will be a
     *     dummy object if no TLS backend is available
     */
    public static @NotNull org.gtk.gio.TlsBackend getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_backend_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.TlsBackend.TlsBackendImpl(Refcounted.get(RESULT, false));
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_get_certificate_type = Interop.downcallHandle(
            "g_tls_backend_get_certificate_type",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_get_client_connection_type = Interop.downcallHandle(
            "g_tls_backend_get_client_connection_type",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_get_default_database = Interop.downcallHandle(
            "g_tls_backend_get_default_database",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_get_dtls_client_connection_type = Interop.downcallHandle(
            "g_tls_backend_get_dtls_client_connection_type",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_get_dtls_server_connection_type = Interop.downcallHandle(
            "g_tls_backend_get_dtls_server_connection_type",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_get_file_database_type = Interop.downcallHandle(
            "g_tls_backend_get_file_database_type",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_get_server_connection_type = Interop.downcallHandle(
            "g_tls_backend_get_server_connection_type",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_set_default_database = Interop.downcallHandle(
            "g_tls_backend_set_default_database",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_supports_dtls = Interop.downcallHandle(
            "g_tls_backend_supports_dtls",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_supports_tls = Interop.downcallHandle(
            "g_tls_backend_supports_tls",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_get_default = Interop.downcallHandle(
            "g_tls_backend_get_default",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
    
    class TlsBackendImpl extends org.gtk.gobject.Object implements TlsBackend {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public TlsBackendImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
