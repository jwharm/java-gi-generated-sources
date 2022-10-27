package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link TcpWrapperConnection} can be used to wrap a {@link IOStream} that is
 * based on a {@link Socket}, but which is not actually a
 * {@link SocketConnection}. This is used by {@link SocketClient} so that it can
 * always return a {@link SocketConnection}, even when the connection it has
 * actually created is not directly a {@link SocketConnection}.
 * @version 2.28
 */
public class TcpWrapperConnection extends org.gtk.gio.TcpConnection {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.TcpConnection.getMemoryLayout().withName("parent_instance"),
        org.gtk.gio.TcpWrapperConnectionPrivate.getMemoryLayout().withName("priv")
    ).withName("GTcpWrapperConnection");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public TcpWrapperConnection(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TcpWrapperConnection */
    public static TcpWrapperConnection castFrom(org.gtk.gobject.Object gobject) {
        return new TcpWrapperConnection(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gio.IOStream baseIoStream, @NotNull org.gtk.gio.Socket socket) {
        java.util.Objects.requireNonNull(baseIoStream, "Parameter 'baseIoStream' must not be null");
        java.util.Objects.requireNonNull(socket, "Parameter 'socket' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_tcp_wrapper_connection_new.invokeExact(baseIoStream.handle(), socket.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Wraps {@code base_io_stream} and {@code socket} together as a {@link SocketConnection}.
     * @param baseIoStream the {@link IOStream} to wrap
     * @param socket the {@link Socket} associated with {@code base_io_stream}
     */
    public TcpWrapperConnection(@NotNull org.gtk.gio.IOStream baseIoStream, @NotNull org.gtk.gio.Socket socket) {
        super(constructNew(baseIoStream, socket));
    }
    
    /**
     * Gets {@code conn}'s base {@link IOStream}
     * @return {@code conn}'s base {@link IOStream}
     */
    public @NotNull org.gtk.gio.IOStream getBaseIoStream() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tcp_wrapper_connection_get_base_io_stream.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.IOStream(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_tcp_wrapper_connection_new = Interop.downcallHandle(
            "g_tcp_wrapper_connection_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_tcp_wrapper_connection_get_base_io_stream = Interop.downcallHandle(
            "g_tcp_wrapper_connection_get_base_io_stream",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
