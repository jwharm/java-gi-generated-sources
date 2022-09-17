package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GDtlsClientConnection is the client-side subclass of
 * #GDtlsConnection, representing a client-side DTLS connection.
 */
public interface DtlsClientConnection extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Gets the list of distinguished names of the Certificate Authorities
     * that the server will accept certificates from. This will be set
     * during the TLS handshake if the server requests a certificate.
     * Otherwise, it will be <code>NULL.
     * 
     * Each</code> item in the list is a #GByteArray which contains the complete
     * subject DN of the certificate authority.
     */
    public default org.gtk.glib.List getAcceptedCas() {
        var RESULT = gtk_h.g_dtls_client_connection_get_accepted_cas(handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Gets @conn&#39;s expected server identity
     */
    public default SocketConnectable getServerIdentity() {
        var RESULT = gtk_h.g_dtls_client_connection_get_server_identity(handle());
        return new SocketConnectable.SocketConnectableImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets @conn&#39;s validation flags
     */
    public default int getValidationFlags() {
        var RESULT = gtk_h.g_dtls_client_connection_get_validation_flags(handle());
        return RESULT;
    }
    
    /**
     * Sets @conn&#39;s expected server identity, which is used both to tell
     * servers on virtual hosts which certificate to present, and also
     * to let @conn know what name to look for in the certificate when
     * performing {@link org.gtk.gio.TlsCertificateFlags#BAD_IDENTITY} validation, if enabled.
     */
    public default void setServerIdentity(SocketConnectable identity) {
        gtk_h.g_dtls_client_connection_set_server_identity(handle(), identity.handle());
    }
    
    /**
     * Sets @conn&#39;s validation flags, to override the default set of
     * checks performed when validating a server certificate. By default,
     * {@link org.gtk.gio.TlsCertificateFlags#VALIDATE_ALL} is used.
     */
    public default void setValidationFlags(int flags) {
        gtk_h.g_dtls_client_connection_set_validation_flags(handle(), flags);
    }
    
    /**
     * Creates a new #GDtlsClientConnection wrapping @base_socket which is
     * assumed to communicate with the server identified by @server_identity.
     */
    public static DtlsClientConnection new_(DatagramBased baseSocket, SocketConnectable serverIdentity) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dtls_client_connection_new(baseSocket.handle(), serverIdentity.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new DtlsClientConnection.DtlsClientConnectionImpl(References.get(RESULT, true));
    }
    
    class DtlsClientConnectionImpl extends org.gtk.gobject.Object implements DtlsClientConnection {
        public DtlsClientConnectionImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
