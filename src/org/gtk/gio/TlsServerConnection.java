package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link org.gtk.gio.TlsServerConnection} is the server-side subclass of {@link org.gtk.gio.TlsConnection} 
 * representing a server-side TLS connection.
 */
public interface TlsServerConnection extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Creates a new {@link org.gtk.gio.TlsServerConnection} wrapping @base_io_stream (which
     * must have pollable input and output streams).
     * 
     * See the documentation for {@link org.gtk.gio.TlsConnection} base-io-stream for restrictions
     * on when application code can run operations on the @base_io_stream after
     * this function has returned.
     */
    public static TlsServerConnection new_(IOStream baseIoStream, TlsCertificate certificate) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_tls_server_connection_new(baseIoStream.handle(), certificate.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new TlsServerConnection.TlsServerConnectionImpl(References.get(RESULT, true));
    }
    
    class TlsServerConnectionImpl extends org.gtk.gobject.Object implements TlsServerConnection {
        public TlsServerConnectionImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
