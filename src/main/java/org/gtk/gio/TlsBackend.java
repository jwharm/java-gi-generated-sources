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
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TlsBackendImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TlsBackendImpl(input);
    
    /**
     * Gets the {@link org.gtk.glib.Type} of {@code backend}'s {@link TlsCertificate} implementation.
     * @return the {@link org.gtk.glib.Type} of {@code backend}'s {@link TlsCertificate}
     *   implementation.
     */
    default org.gtk.glib.Type getCertificateType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tls_backend_get_certificate_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the {@link org.gtk.glib.Type} of {@code backend}'s {@link TlsClientConnection} implementation.
     * @return the {@link org.gtk.glib.Type} of {@code backend}'s {@link TlsClientConnection}
     *   implementation.
     */
    default org.gtk.glib.Type getClientConnectionType() {
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
    default org.gtk.gio.TlsDatabase getDefaultDatabase() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_backend_get_default_database.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gio.TlsDatabase) Interop.register(RESULT, org.gtk.gio.TlsDatabase.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the {@link org.gtk.glib.Type} of {@code backend}’s {@link DtlsClientConnection} implementation.
     * @return the {@link org.gtk.glib.Type} of {@code backend}’s {@link DtlsClientConnection}
     *   implementation, or {@code G_TYPE_INVALID} if this backend doesn’t support DTLS.
     */
    default org.gtk.glib.Type getDtlsClientConnectionType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tls_backend_get_dtls_client_connection_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the {@link org.gtk.glib.Type} of {@code backend}’s {@link DtlsServerConnection} implementation.
     * @return the {@link org.gtk.glib.Type} of {@code backend}’s {@link DtlsServerConnection}
     *   implementation, or {@code G_TYPE_INVALID} if this backend doesn’t support DTLS.
     */
    default org.gtk.glib.Type getDtlsServerConnectionType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tls_backend_get_dtls_server_connection_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the {@link org.gtk.glib.Type} of {@code backend}'s {@link TlsFileDatabase} implementation.
     * @return the {@link org.gtk.glib.Type} of backend's {@link TlsFileDatabase} implementation.
     */
    default org.gtk.glib.Type getFileDatabaseType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tls_backend_get_file_database_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the {@link org.gtk.glib.Type} of {@code backend}'s {@link TlsServerConnection} implementation.
     * @return the {@link org.gtk.glib.Type} of {@code backend}'s {@link TlsServerConnection}
     *   implementation.
     */
    default org.gtk.glib.Type getServerConnectionType() {
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
        try {
            DowncallHandles.g_tls_backend_set_default_database.invokeExact(
                    handle(),
                    (Addressable) (database == null ? MemoryAddress.NULL : database.handle()));
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tls_backend_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the default {@link TlsBackend} for the system.
     * @return a {@link TlsBackend}, which will be a
     *     dummy object if no TLS backend is available
     */
    public static org.gtk.gio.TlsBackend getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_backend_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.TlsBackend) Interop.register(RESULT, org.gtk.gio.TlsBackend.fromAddress).marshal(RESULT, null);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_get_certificate_type = Interop.downcallHandle(
                "g_tls_backend_get_certificate_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_get_client_connection_type = Interop.downcallHandle(
                "g_tls_backend_get_client_connection_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_get_default_database = Interop.downcallHandle(
                "g_tls_backend_get_default_database",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_get_dtls_client_connection_type = Interop.downcallHandle(
                "g_tls_backend_get_dtls_client_connection_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_get_dtls_server_connection_type = Interop.downcallHandle(
                "g_tls_backend_get_dtls_server_connection_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_get_file_database_type = Interop.downcallHandle(
                "g_tls_backend_get_file_database_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_get_server_connection_type = Interop.downcallHandle(
                "g_tls_backend_get_server_connection_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_set_default_database = Interop.downcallHandle(
                "g_tls_backend_set_default_database",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_supports_dtls = Interop.downcallHandle(
                "g_tls_backend_supports_dtls",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_supports_tls = Interop.downcallHandle(
                "g_tls_backend_supports_tls",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_get_type = Interop.downcallHandle(
                "g_tls_backend_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_tls_backend_get_default = Interop.downcallHandle(
                "g_tls_backend_get_default",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * The TlsBackendImpl type represents a native instance of the TlsBackend interface.
     */
    class TlsBackendImpl extends org.gtk.gobject.GObject implements TlsBackend {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of TlsBackend for the provided memory address.
         * @param address the memory address of the instance
         */
        public TlsBackendImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_tls_backend_get_type != null;
    }
}
