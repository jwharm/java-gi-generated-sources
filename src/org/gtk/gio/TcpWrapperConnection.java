package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GTcpWrapperConnection can be used to wrap a #GIOStream that is
 * based on a #GSocket, but which is not actually a
 * #GSocketConnection. This is used by #GSocketClient so that it can
 * always return a #GSocketConnection, even when the connection it has
 * actually created is not directly a #GSocketConnection.
 */
public class TcpWrapperConnection extends TcpConnection {

    public TcpWrapperConnection(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to TcpWrapperConnection */
    public static TcpWrapperConnection castFrom(org.gtk.gobject.Object gobject) {
        return new TcpWrapperConnection(gobject.getProxy());
    }
    
    /**
     * Wraps @base_io_stream and @socket together as a #GSocketConnection.
     */
    public TcpWrapperConnection(IOStream baseIoStream, Socket socket) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_tcp_wrapper_connection_new(baseIoStream.HANDLE(), socket.HANDLE()), true));
    }
    
    /**
     * Gets @conn's base #GIOStream
     */
    public IOStream getBaseIoStream() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tcp_wrapper_connection_get_base_io_stream(HANDLE());
        return new IOStream(ProxyFactory.get(RESULT, false));
    }
    
}
