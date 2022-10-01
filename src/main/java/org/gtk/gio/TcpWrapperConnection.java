package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link TcpWrapperConnection} can be used to wrap a {@link IOStream} that is
 * based on a {@link Socket}, but which is not actually a
 * {@link SocketConnection}. This is used by {@link SocketClient} so that it can
 * always return a {@link SocketConnection}, even when the connection it has
 * actually created is not directly a {@link SocketConnection}.
 */
public class TcpWrapperConnection extends TcpConnection {

    public TcpWrapperConnection(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TcpWrapperConnection */
    public static TcpWrapperConnection castFrom(org.gtk.gobject.Object gobject) {
        return new TcpWrapperConnection(gobject.refcounted());
    }
    
    private static Refcounted constructNew(IOStream baseIoStream, Socket socket) {
        Refcounted RESULT = Refcounted.get(gtk_h.g_tcp_wrapper_connection_new(baseIoStream.handle(), socket.handle()), true);
        return RESULT;
    }
    
    /**
     * Wraps {@code base_io_stream} and {@code socket} together as a {@link SocketConnection}.
     */
    public TcpWrapperConnection(IOStream baseIoStream, Socket socket) {
        super(constructNew(baseIoStream, socket));
    }
    
    /**
     * Gets {@code conn}'s base {@link IOStream}
     */
    public IOStream getBaseIoStream() {
        var RESULT = gtk_h.g_tcp_wrapper_connection_get_base_io_stream(handle());
        return new IOStream(Refcounted.get(RESULT, false));
    }
    
}
