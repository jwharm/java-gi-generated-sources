package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * TLS (Transport Layer Security, aka SSL) and DTLS backend.
 */
public interface TlsBackend extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle g_tls_backend_get_certificate_type = Interop.downcallHandle(
        "g_tls_backend_get_certificate_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link org.gtk.glib.Type} of {@code backend}'s {@link TlsCertificate} implementation.
     */
    public default org.gtk.gobject.Type getCertificateType() {
        try {
            var RESULT = (long) g_tls_backend_get_certificate_type.invokeExact(handle());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_backend_get_client_connection_type = Interop.downcallHandle(
        "g_tls_backend_get_client_connection_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link org.gtk.glib.Type} of {@code backend}'s {@link TlsClientConnection} implementation.
     */
    public default org.gtk.gobject.Type getClientConnectionType() {
        try {
            var RESULT = (long) g_tls_backend_get_client_connection_type.invokeExact(handle());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_backend_get_default_database = Interop.downcallHandle(
        "g_tls_backend_get_default_database",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default {@link TlsDatabase} used to verify TLS connections.
     */
    public default TlsDatabase getDefaultDatabase() {
        try {
            var RESULT = (MemoryAddress) g_tls_backend_get_default_database.invokeExact(handle());
            return new TlsDatabase(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_backend_get_dtls_client_connection_type = Interop.downcallHandle(
        "g_tls_backend_get_dtls_client_connection_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link org.gtk.glib.Type} of {@code backend}’s {@link DtlsClientConnection} implementation.
     */
    public default org.gtk.gobject.Type getDtlsClientConnectionType() {
        try {
            var RESULT = (long) g_tls_backend_get_dtls_client_connection_type.invokeExact(handle());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_backend_get_dtls_server_connection_type = Interop.downcallHandle(
        "g_tls_backend_get_dtls_server_connection_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link org.gtk.glib.Type} of {@code backend}’s {@link DtlsServerConnection} implementation.
     */
    public default org.gtk.gobject.Type getDtlsServerConnectionType() {
        try {
            var RESULT = (long) g_tls_backend_get_dtls_server_connection_type.invokeExact(handle());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_backend_get_file_database_type = Interop.downcallHandle(
        "g_tls_backend_get_file_database_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link org.gtk.glib.Type} of {@code backend}'s {@link TlsFileDatabase} implementation.
     */
    public default org.gtk.gobject.Type getFileDatabaseType() {
        try {
            var RESULT = (long) g_tls_backend_get_file_database_type.invokeExact(handle());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_backend_get_server_connection_type = Interop.downcallHandle(
        "g_tls_backend_get_server_connection_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@link org.gtk.glib.Type} of {@code backend}'s {@link TlsServerConnection} implementation.
     */
    public default org.gtk.gobject.Type getServerConnectionType() {
        try {
            var RESULT = (long) g_tls_backend_get_server_connection_type.invokeExact(handle());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_backend_set_default_database = Interop.downcallHandle(
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
    public default void setDefaultDatabase(TlsDatabase database) {
        try {
            g_tls_backend_set_default_database.invokeExact(handle(), database.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_backend_supports_dtls = Interop.downcallHandle(
        "g_tls_backend_supports_dtls",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if DTLS is supported. DTLS support may not be available even if TLS
     * support is available, and vice-versa.
     */
    public default boolean supportsDtls() {
        try {
            var RESULT = (int) g_tls_backend_supports_dtls.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_backend_supports_tls = Interop.downcallHandle(
        "g_tls_backend_supports_tls",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if TLS is supported; if this returns {@code false} for the default
     * {@link TlsBackend}, it means no "real" TLS backend is available.
     */
    public default boolean supportsTls() {
        try {
            var RESULT = (int) g_tls_backend_supports_tls.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tls_backend_get_default = Interop.downcallHandle(
        "g_tls_backend_get_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default {@link TlsBackend} for the system.
     */
    public static TlsBackend getDefault() {
        try {
            var RESULT = (MemoryAddress) g_tls_backend_get_default.invokeExact();
            return new TlsBackend.TlsBackendImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    class TlsBackendImpl extends org.gtk.gobject.Object implements TlsBackend {
        public TlsBackendImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
