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
    
    private static final java.lang.String C_TYPE_NAME = "GTcpWrapperConnection";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.TcpConnection.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gio.TcpConnection parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gio.TcpConnection(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a TcpWrapperConnection proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TcpWrapperConnection(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to TcpWrapperConnection if its GType is a (or inherits from) "GTcpWrapperConnection".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "TcpWrapperConnection" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GTcpWrapperConnection", a ClassCastException will be thrown.
     */
    public static TcpWrapperConnection castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GTcpWrapperConnection"))) {
            return new TcpWrapperConnection(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GTcpWrapperConnection");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gio.IOStream baseIoStream, @NotNull org.gtk.gio.Socket socket) {
        java.util.Objects.requireNonNull(baseIoStream, "Parameter 'baseIoStream' must not be null");
        java.util.Objects.requireNonNull(socket, "Parameter 'socket' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tcp_wrapper_connection_new.invokeExact(
                    baseIoStream.handle(),
                    socket.handle());
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
        super(constructNew(baseIoStream, socket), Ownership.FULL);
    }
    
    /**
     * Gets {@code conn}'s base {@link IOStream}
     * @return {@code conn}'s base {@link IOStream}
     */
    public @NotNull org.gtk.gio.IOStream getBaseIoStream() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tcp_wrapper_connection_get_base_io_stream.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.IOStream(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_tcp_wrapper_connection_new = Interop.downcallHandle(
            "g_tcp_wrapper_connection_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tcp_wrapper_connection_get_base_io_stream = Interop.downcallHandle(
            "g_tcp_wrapper_connection_get_base_io_stream",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
