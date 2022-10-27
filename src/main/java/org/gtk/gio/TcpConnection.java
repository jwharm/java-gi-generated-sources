package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is the subclass of {@link SocketConnection} that is created
 * for TCP/IP sockets.
 * @version 2.22
 */
public class TcpConnection extends org.gtk.gio.SocketConnection {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.SocketConnection.getMemoryLayout().withName("parent_instance"),
        org.gtk.gio.TcpConnectionPrivate.getMemoryLayout().withName("priv")
    ).withName("GTcpConnection");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
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
     * @return {@code true} if graceful disconnect is used on close, {@code false} otherwise
     */
    public boolean getGracefulDisconnect() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tcp_connection_get_graceful_disconnect.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param gracefulDisconnect Whether to do graceful disconnects or not
     */
    public void setGracefulDisconnect(boolean gracefulDisconnect) {
        try {
            DowncallHandles.g_tcp_connection_set_graceful_disconnect.invokeExact(handle(), gracefulDisconnect ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_tcp_connection_get_graceful_disconnect = Interop.downcallHandle(
            "g_tcp_connection_get_graceful_disconnect",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tcp_connection_set_graceful_disconnect = Interop.downcallHandle(
            "g_tcp_connection_set_graceful_disconnect",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
