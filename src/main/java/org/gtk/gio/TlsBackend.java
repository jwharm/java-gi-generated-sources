package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * TLS (Transport Layer Security, aka SSL) and DTLS backend.
 */
public interface TlsBackend extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle g_tls_backend_get_certificate_type = Interop.downcallHandle(
        "g_tls_backend_get_certificate_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link org.gtk.glib.Type} of {@code backend}'s {@link TlsCertificate} implementation.
     */
    default @NotNull org.gtk.gobject.Type getCertificateType() {
        long RESULT;
        try {
            RESULT = (long) g_tls_backend_get_certificate_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    @ApiStatus.Internal static final MethodHandle g_tls_backend_get_client_connection_type = Interop.downcallHandle(
        "g_tls_backend_get_client_connection_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link org.gtk.glib.Type} of {@code backend}'s {@link TlsClientConnection} implementation.
     */
    default @NotNull org.gtk.gobject.Type getClientConnectionType() {
        long RESULT;
        try {
            RESULT = (long) g_tls_backend_get_client_connection_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    @ApiStatus.Internal static final MethodHandle g_tls_backend_get_default_database = Interop.downcallHandle(
        "g_tls_backend_get_default_database",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default {@link TlsDatabase} used to verify TLS connections.
     */
    default @NotNull TlsDatabase getDefaultDatabase() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_tls_backend_get_default_database.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TlsDatabase(Refcounted.get(RESULT, true));
    }
    
    @ApiStatus.Internal static final MethodHandle g_tls_backend_get_dtls_client_connection_type = Interop.downcallHandle(
        "g_tls_backend_get_dtls_client_connection_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link org.gtk.glib.Type} of {@code backend}’s {@link DtlsClientConnection} implementation.
     */
    default @NotNull org.gtk.gobject.Type getDtlsClientConnectionType() {
        long RESULT;
        try {
            RESULT = (long) g_tls_backend_get_dtls_client_connection_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    @ApiStatus.Internal static final MethodHandle g_tls_backend_get_dtls_server_connection_type = Interop.downcallHandle(
        "g_tls_backend_get_dtls_server_connection_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link org.gtk.glib.Type} of {@code backend}’s {@link DtlsServerConnection} implementation.
     */
    default @NotNull org.gtk.gobject.Type getDtlsServerConnectionType() {
        long RESULT;
        try {
            RESULT = (long) g_tls_backend_get_dtls_server_connection_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    @ApiStatus.Internal static final MethodHandle g_tls_backend_get_file_database_type = Interop.downcallHandle(
        "g_tls_backend_get_file_database_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link org.gtk.glib.Type} of {@code backend}'s {@link TlsFileDatabase} implementation.
     */
    default @NotNull org.gtk.gobject.Type getFileDatabaseType() {
        long RESULT;
        try {
            RESULT = (long) g_tls_backend_get_file_database_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    @ApiStatus.Internal static final MethodHandle g_tls_backend_get_server_connection_type = Interop.downcallHandle(
        "g_tls_backend_get_server_connection_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link org.gtk.glib.Type} of {@code backend}'s {@link TlsServerConnection} implementation.
     */
    default @NotNull org.gtk.gobject.Type getServerConnectionType() {
        long RESULT;
        try {
            RESULT = (long) g_tls_backend_get_server_connection_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    @ApiStatus.Internal static final MethodHandle g_tls_backend_set_default_database = Interop.downcallHandle(
        "g_tls_backend_set_default_database",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set the default {@link TlsDatabase} used to verify TLS connections
     * <p>
     * Any subsequent call to g_tls_backend_get_default_database() will return
     * the database set in this call.  Existing databases and connections are not
     * modified.
     * <p>
     * Setting a {@code null} default database will reset to using the system default
     * database as if g_tls_backend_set_default_database() had never been called.
     */
    default @NotNull void setDefaultDatabase(@Nullable TlsDatabase database) {
        try {
            g_tls_backend_set_default_database.invokeExact(handle(), database.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal static final MethodHandle g_tls_backend_supports_dtls = Interop.downcallHandle(
        "g_tls_backend_supports_dtls",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if DTLS is supported. DTLS support may not be available even if TLS
     * support is available, and vice-versa.
     */
    default boolean supportsDtls() {
        int RESULT;
        try {
            RESULT = (int) g_tls_backend_supports_dtls.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_tls_backend_supports_tls = Interop.downcallHandle(
        "g_tls_backend_supports_tls",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if TLS is supported; if this returns {@code false} for the default
     * {@link TlsBackend}, it means no "real" TLS backend is available.
     */
    default boolean supportsTls() {
        int RESULT;
        try {
            RESULT = (int) g_tls_backend_supports_tls.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @ApiStatus.Internal static final MethodHandle g_tls_backend_get_default = Interop.downcallHandle(
        "g_tls_backend_get_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default {@link TlsBackend} for the system.
     */
    public static @NotNull TlsBackend getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_tls_backend_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TlsBackend.TlsBackendImpl(Refcounted.get(RESULT, false));
    }
    
    class TlsBackendImpl extends org.gtk.gobject.Object implements TlsBackend {
        public TlsBackendImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
