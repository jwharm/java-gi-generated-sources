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
     * Cast object to TlsBackend if its GType is a (or inherits from) "GTlsBackend".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TlsBackend} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GTlsBackend", a ClassCastException will be thrown.
     */
    public static TlsBackend castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), TlsBackend.getType())) {
            return new TlsBackendImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GTlsBackend");
        }
    }
    
    /**
     * Gets the {@link org.gtk.gobject.Type} of {@code backend}'s {@link TlsCertificate} implementation.
     * @return the {@link org.gtk.gobject.Type} of {@code backend}'s {@link TlsCertificate}
     *   implementation.
     */
    default @NotNull org.gtk.glib.Type getCertificateType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tls_backend_get_certificate_type.invokeExact(
                    handle());
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
            RESULT = (long) DowncallHandles.g_tls_backend_get_client_connection_type.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.g_tls_backend_get_default_database.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.TlsDatabase(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the {@link org.gtk.gobject.Type} of {@code backend}’s {@link DtlsClientConnection} implementation.
     * @return the {@link org.gtk.gobject.Type} of {@code backend}’s {@link DtlsClientConnection}
     *   implementation, or {@code G_TYPE_INVALID} if this backend doesn’t support DTLS.
     */
    default @NotNull org.gtk.glib.Type getDtlsClientConnectionType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tls_backend_get_dtls_client_connection_type.invokeExact(
                    handle());
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
            RESULT = (long) DowncallHandles.g_tls_backend_get_dtls_server_connection_type.invokeExact(
                    handle());
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
            RESULT = (long) DowncallHandles.g_tls_backend_get_file_database_type.invokeExact(
                    handle());
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
            RESULT = (long) DowncallHandles.g_tls_backend_get_server_connection_type.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.g_tls_backend_supports_dtls.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.g_tls_backend_supports_tls.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
    public static @NotNull org.gtk.gio.TlsBackend getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tls_backend_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.TlsBackend.TlsBackendImpl(RESULT, Ownership.NONE);
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
    
    class TlsBackendImpl extends org.gtk.gobject.Object implements TlsBackend {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public TlsBackendImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
