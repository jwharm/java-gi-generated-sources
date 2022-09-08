package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * TLS (Transport Layer Security, aka SSL) and DTLS backend.
 */
public interface TlsBackend extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Gets the #GType of @backend's #GTlsCertificate implementation.
     */
    public default org.gtk.gobject.Type getCertificateType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_backend_get_certificate_type(HANDLE());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Gets the #GType of @backend's #GTlsClientConnection implementation.
     */
    public default org.gtk.gobject.Type getClientConnectionType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_backend_get_client_connection_type(HANDLE());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Gets the default #GTlsDatabase used to verify TLS connections.
     */
    public default TlsDatabase getDefaultDatabase() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_backend_get_default_database(HANDLE());
        return new TlsDatabase(References.get(RESULT, true));
    }
    
    /**
     * Gets the #GType of @backend’s #GDtlsClientConnection implementation.
     */
    public default org.gtk.gobject.Type getDtlsClientConnectionType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_backend_get_dtls_client_connection_type(HANDLE());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Gets the #GType of @backend’s #GDtlsServerConnection implementation.
     */
    public default org.gtk.gobject.Type getDtlsServerConnectionType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_backend_get_dtls_server_connection_type(HANDLE());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Gets the #GType of @backend's #GTlsFileDatabase implementation.
     */
    public default org.gtk.gobject.Type getFileDatabaseType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_backend_get_file_database_type(HANDLE());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Gets the #GType of @backend's #GTlsServerConnection implementation.
     */
    public default org.gtk.gobject.Type getServerConnectionType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_backend_get_server_connection_type(HANDLE());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Set the default #GTlsDatabase used to verify TLS connections
     * 
     * Any subsequent call to g_tls_backend_get_default_database() will return
     * the database set in this call.  Existing databases and connections are not
     * modified.
     * 
     * Setting a %NULL default database will reset to using the system default
     * database as if g_tls_backend_set_default_database() had never been called.
     */
    public default void setDefaultDatabase(TlsDatabase database) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_backend_set_default_database(HANDLE(), database.HANDLE());
    }
    
    /**
     * Checks if DTLS is supported. DTLS support may not be available even if TLS
     * support is available, and vice-versa.
     */
    public default boolean supportsDtls() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_backend_supports_dtls(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if TLS is supported; if this returns %FALSE for the default
     * #GTlsBackend, it means no "real" TLS backend is available.
     */
    public default boolean supportsTls() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tls_backend_supports_tls(HANDLE());
        return (RESULT != 0);
    }
    
    class TlsBackendImpl extends org.gtk.gobject.Object implements TlsBackend {
        public TlsBackendImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
