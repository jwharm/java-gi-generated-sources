package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GTlsClientConnection is the client-side subclass of
 * #GTlsConnection, representing a client-side TLS connection.
 */
public interface TlsClientConnection extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Possibly copies session state from one connection to another, for use
     * in TLS session resumption. This is not normally needed, but may be
     * used when the same session needs to be used between different
     * endpoints, as is required by some protocols, such as FTP over TLS.
     * @source should have already completed a handshake and, since TLS 1.3,
     * it should have been used to read data at least once. @conn should not
     * have completed a handshake.
     * 
     * It is not possible to know whether a call to this function will
     * actually do anything. Because session resumption is normally used
     * only for performance benefit, the TLS backend might not implement
     * this function. Even if implemented, it may not actually succeed in
     * allowing @conn to resume @source's TLS session, because the server
     * may not have sent a session resumption token to @source, or it may
     * refuse to accept the token from @conn. There is no way to know
     * whether a call to this function is actually successful.
     * 
     * Using this function is not required to benefit from session
     * resumption. If the TLS backend supports session resumption, the
     * session will be resumed automatically if it is possible to do so
     * without weakening the privacy guarantees normally provided by TLS,
     * without need to call this function. For example, with TLS 1.3,
     * a session ticket will be automatically copied from any
     * #GTlsClientConnection that has previously received session tickets
     * from the server, provided a ticket is available that has not
     * previously been used for session resumption, since session ticket
     * reuse would be a privacy weakness. Using this function causes the
     * ticket to be copied without regard for privacy considerations.
     */
    public default void copySessionState(TlsClientConnection source) {
        gtk_h.g_tls_client_connection_copy_session_state(handle(), source.handle());
    }
    
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
        var RESULT = gtk_h.g_tls_client_connection_get_accepted_cas(handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Gets @conn's expected server identity
     */
    public default SocketConnectable getServerIdentity() {
        var RESULT = gtk_h.g_tls_client_connection_get_server_identity(handle());
        return new SocketConnectable.SocketConnectableImpl(References.get(RESULT, false));
    }
    
    /**
     * Sets @conn's expected server identity, which is used both to tell
     * servers on virtual hosts which certificate to present, and also
     * to let @conn know what name to look for in the certificate when
     * performing %G_TLS_CERTIFICATE_BAD_IDENTITY validation, if enabled.
     */
    public default void setServerIdentity(SocketConnectable identity) {
        gtk_h.g_tls_client_connection_set_server_identity(handle(), identity.handle());
    }
    
    class TlsClientConnectionImpl extends org.gtk.gobject.Object implements TlsClientConnection {
        public TlsClientConnectionImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
