package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link org.gtk.gio.TcpWrapperConnection} can be used to wrap a {@link org.gtk.gio.IOStream} that is
 * based on a {@link org.gtk.gio.Socket}  but which is not actually a
 * {@link org.gtk.gio.SocketConnection}  This is used by {@link org.gtk.gio.SocketClient} so that it can
 * always return a {@link org.gtk.gio.SocketConnection}  even when the connection it has
 * actually created is not directly a {@link org.gtk.gio.SocketConnection}
 */
public class TcpWrapperConnection extends TcpConnection {

    public TcpWrapperConnection(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TcpWrapperConnection */
    public static TcpWrapperConnection castFrom(org.gtk.gobject.Object gobject) {
        return new TcpWrapperConnection(gobject.getReference());
    }
    
    private static Reference constructNew(IOStream baseIoStream, Socket socket) {
        Reference RESULT = References.get(gtk_h.g_tcp_wrapper_connection_new(baseIoStream.handle(), socket.handle()), true);
        return RESULT;
    }
    
    /**
     * Wraps @base_io_stream and @socket together as a {@link org.gtk.gio.SocketConnection}
     */
    public TcpWrapperConnection(IOStream baseIoStream, Socket socket) {
        super(constructNew(baseIoStream, socket));
    }
    
    /**
     * Gets @conn&<code>#39</code> s base s base #GIOStream
     */
    public IOStream getBaseIoStream() {
        var RESULT = gtk_h.g_tcp_wrapper_connection_get_base_io_stream(handle());
        return new IOStream(References.get(RESULT, false));
    }
    
}
