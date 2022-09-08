package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GDtlsClientConnection is the client-side subclass of
 * #GDtlsConnection, representing a client-side DTLS connection.
 */
public interface DtlsClientConnection extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Gets the list of distinguished names of the Certificate Authorities
     * that the server will accept certificates from. This will be set
     * during the TLS handshake if the server requests a certificate.
     * Otherwise, it will be %NULL.
     * 
     * Each item in the list is a #GByteArray which contains the complete
     * subject DN of the certificate authority.
     */
    public default org.gtk.glib.List getAcceptedCas() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dtls_client_connection_get_accepted_cas(HANDLE());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Gets @conn's expected server identity
     */
    public default SocketConnectable getServerIdentity() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dtls_client_connection_get_server_identity(HANDLE());
        return new SocketConnectable.SocketConnectableImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets @conn's validation flags
     */
    public default int getValidationFlags() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dtls_client_connection_get_validation_flags(HANDLE());
        return RESULT;
    }
    
    /**
     * Sets @conn's expected server identity, which is used both to tell
     * servers on virtual hosts which certificate to present, and also
     * to let @conn know what name to look for in the certificate when
     * performing %G_TLS_CERTIFICATE_BAD_IDENTITY validation, if enabled.
     */
    public default void setServerIdentity(SocketConnectable identity) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dtls_client_connection_set_server_identity(HANDLE(), identity.HANDLE());
    }
    
    /**
     * Sets @conn's validation flags, to override the default set of
     * checks performed when validating a server certificate. By default,
     * %G_TLS_CERTIFICATE_VALIDATE_ALL is used.
     */
    public default void setValidationFlags(int flags) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dtls_client_connection_set_validation_flags(HANDLE(), flags);
    }
    
    class DtlsClientConnectionImpl extends org.gtk.gobject.Object implements DtlsClientConnection {
        public DtlsClientConnectionImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
