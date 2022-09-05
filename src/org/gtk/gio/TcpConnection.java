package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * This is the subclass of #GSocketConnection that is created
 * for TCP/IP sockets.
 */
public class TcpConnection extends SocketConnection {

    public TcpConnection(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to TcpConnection */
    public static TcpConnection castFrom(org.gtk.gobject.Object gobject) {
        return new TcpConnection(gobject.getProxy());
    }
    
    /**
     * Checks if graceful disconnects are used. See
     * g_tcp_connection_set_graceful_disconnect().
     */
    public boolean getGracefulDisconnect() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_tcp_connection_get_graceful_disconnect(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * This enables graceful disconnects on close. A graceful disconnect
     * means that we signal the receiving end that the connection is terminated
     * and wait for it to close the connection before closing the connection.
     * 
     * A graceful disconnect means that we can be sure that we successfully sent
     * all the outstanding data to the other end, or get an error reported.
     * However, it also means we have to wait for all the data to reach the
     * other side and for it to acknowledge this by closing the socket, which may
     * take a while. For this reason it is disabled by default.
     */
    public void setGracefulDisconnect(boolean gracefulDisconnect) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_tcp_connection_set_graceful_disconnect(HANDLE(), gracefulDisconnect ? 1 : 0);
    }
    
}
