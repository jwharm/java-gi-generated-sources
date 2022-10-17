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
 */
public class TcpWrapperConnection extends TcpConnection {

    public TcpWrapperConnection(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TcpWrapperConnection */
    public static TcpWrapperConnection castFrom(org.gtk.gobject.Object gobject) {
        return new TcpWrapperConnection(gobject.refcounted());
    }
    
    private static final MethodHandle g_tcp_wrapper_connection_new = Interop.downcallHandle(
        "g_tcp_wrapper_connection_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull IOStream baseIoStream, @NotNull Socket socket) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_tcp_wrapper_connection_new.invokeExact(baseIoStream.handle(), socket.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Wraps {@code base_io_stream} and {@code socket} together as a {@link SocketConnection}.
     */
    public TcpWrapperConnection(@NotNull IOStream baseIoStream, @NotNull Socket socket) {
        super(constructNew(baseIoStream, socket));
    }
    
    private static final MethodHandle g_tcp_wrapper_connection_get_base_io_stream = Interop.downcallHandle(
        "g_tcp_wrapper_connection_get_base_io_stream",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets {@code conn}'s base {@link IOStream}
     */
    public @NotNull IOStream getBaseIoStream() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_tcp_wrapper_connection_get_base_io_stream.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new IOStream(Refcounted.get(RESULT, false));
    }
    
}
