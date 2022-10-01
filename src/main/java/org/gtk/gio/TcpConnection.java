package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * This is the subclass of {@link SocketConnection} that is created
 * for TCP/IP sockets.
 */
public class TcpConnection extends SocketConnection {

    public TcpConnection(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TcpConnection */
    public static TcpConnection castFrom(org.gtk.gobject.Object gobject) {
        return new TcpConnection(gobject.refcounted());
    }
    
    /**
     * Checks if graceful disconnects are used. See
     * g_tcp_connection_set_graceful_disconnect().
     */
    public boolean getGracefulDisconnect() {
        var RESULT = gtk_h.g_tcp_connection_get_graceful_disconnect(handle());
        return RESULT != 0;
    }
    
    /**
     * This enables graceful disconnects on close. A graceful disconnect
     * means that we signal the receiving end that the connection is terminated
     * and wait for it to close the connection before closing the connection.
     * <p>
     * A graceful disconnect means that we can be sure that we successfully sent
     * all the outstanding data to the other end, or get an error reported.
     * However, it also means we have to wait for all the data to reach the
     * other side and for it to acknowledge this by closing the socket, which may
     * take a while. For this reason it is disabled by default.
     */
    public void setGracefulDisconnect(boolean gracefulDisconnect) {
        gtk_h.g_tcp_connection_set_graceful_disconnect(handle(), gracefulDisconnect ? 1 : 0);
    }
    
}
