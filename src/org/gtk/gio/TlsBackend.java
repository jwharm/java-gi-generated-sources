package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * TLS (Transport Layer Security, aka SSL) and DTLS backend.
 */
public interface TlsBackend extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Gets the #GType of @backend&#39;s #GTlsCertificate implementation.
     */
    public default org.gtk.gobject.Type getCertificateType() {
        var RESULT = gtk_h.g_tls_backend_get_certificate_type(handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Gets the #GType of @backend&#39;s #GTlsClientConnection implementation.
     */
    public default org.gtk.gobject.Type getClientConnectionType() {
        var RESULT = gtk_h.g_tls_backend_get_client_connection_type(handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Gets the default #GTlsDatabase used to verify TLS connections.
     */
    public default TlsDatabase getDefaultDatabase() {
        var RESULT = gtk_h.g_tls_backend_get_default_database(handle());
        return new TlsDatabase(References.get(RESULT, true));
    }
    
    /**
     * Gets the #GType of @backend&#8217;s #GDtlsClientConnection implementation.
     */
    public default org.gtk.gobject.Type getDtlsClientConnectionType() {
        var RESULT = gtk_h.g_tls_backend_get_dtls_client_connection_type(handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Gets the #GType of @backend&#8217;s #GDtlsServerConnection implementation.
     */
    public default org.gtk.gobject.Type getDtlsServerConnectionType() {
        var RESULT = gtk_h.g_tls_backend_get_dtls_server_connection_type(handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Gets the #GType of @backend&#39;s #GTlsFileDatabase implementation.
     */
    public default org.gtk.gobject.Type getFileDatabaseType() {
        var RESULT = gtk_h.g_tls_backend_get_file_database_type(handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Gets the #GType of @backend&#39;s #GTlsServerConnection implementation.
     */
    public default org.gtk.gobject.Type getServerConnectionType() {
        var RESULT = gtk_h.g_tls_backend_get_server_connection_type(handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Set the default #GTlsDatabase used to verify TLS connections
     * 
     * Any subsequent call to g_tls_backend_get_default_database() will return
     * the database set in this call.  Existing databases and connections are not
     * modified.
     * 
     * Setting a <code>null</code> default database will reset to using the system default
     * database as if g_tls_backend_set_default_database() had never been called.
     */
    public default void setDefaultDatabase(TlsDatabase database) {
        gtk_h.g_tls_backend_set_default_database(handle(), database.handle());
    }
    
    /**
     * Checks if DTLS is supported. DTLS support may not be available even if TLS
     * support is available, and vice-versa.
     */
    public default boolean supportsDtls() {
        var RESULT = gtk_h.g_tls_backend_supports_dtls(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if TLS is supported; if this returns <code>false</code> for the default
     * #GTlsBackend, it means no &#34;real&#34; TLS backend is available.
     */
    public default boolean supportsTls() {
        var RESULT = gtk_h.g_tls_backend_supports_tls(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the default #GTlsBackend for the system.
     */
    public static TlsBackend getDefault() {
        var RESULT = gtk_h.g_tls_backend_get_default();
        return new TlsBackend.TlsBackendImpl(References.get(RESULT, false));
    }
    
    class TlsBackendImpl extends org.gtk.gobject.Object implements TlsBackend {
        public TlsBackendImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
