package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link org.gtk.gio.DtlsServerConnection} is the server-side subclass of {@link org.gtk.gio.DtlsConnection} 
 * representing a server-side DTLS connection.
 */
public interface DtlsServerConnection extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Creates a new {@link org.gtk.gio.DtlsServerConnection} wrapping @base_socket.
     */
    public static DtlsServerConnection new_(DatagramBased baseSocket, TlsCertificate certificate) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dtls_server_connection_new(baseSocket.handle(), certificate.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new DtlsServerConnection.DtlsServerConnectionImpl(References.get(RESULT, true));
    }
    
    class DtlsServerConnectionImpl extends org.gtk.gobject.Object implements DtlsServerConnection {
        public DtlsServerConnectionImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
