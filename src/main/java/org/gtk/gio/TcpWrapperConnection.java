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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.TcpConnection.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a TcpWrapperConnection proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TcpWrapperConnection(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TcpWrapperConnection> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TcpWrapperConnection(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.gio.IOStream baseIoStream, org.gtk.gio.Socket socket) {
        MemoryAddress RESULT;
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
    public TcpWrapperConnection(org.gtk.gio.IOStream baseIoStream, org.gtk.gio.Socket socket) {
        super(constructNew(baseIoStream, socket), Ownership.FULL);
    }
    
    /**
     * Gets {@code conn}'s base {@link IOStream}
     * @return {@code conn}'s base {@link IOStream}
     */
    public org.gtk.gio.IOStream getBaseIoStream() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tcp_wrapper_connection_get_base_io_stream.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.IOStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.IOStream.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tcp_wrapper_connection_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link TcpWrapperConnection.Builder} object constructs a {@link TcpWrapperConnection} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TcpWrapperConnection.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.TcpConnection.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link TcpWrapperConnection} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TcpWrapperConnection}.
         * @return A new instance of {@code TcpWrapperConnection} with the properties 
         *         that were set in the Builder object.
         */
        public TcpWrapperConnection build() {
            return (TcpWrapperConnection) org.gtk.gobject.GObject.newWithProperties(
                TcpWrapperConnection.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setBaseIoStream(org.gtk.gio.IOStream baseIoStream) {
            names.add("base-io-stream");
            values.add(org.gtk.gobject.Value.create(baseIoStream));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_tcp_wrapper_connection_new = Interop.downcallHandle(
            "g_tcp_wrapper_connection_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tcp_wrapper_connection_get_base_io_stream = Interop.downcallHandle(
            "g_tcp_wrapper_connection_get_base_io_stream",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_tcp_wrapper_connection_get_type = Interop.downcallHandle(
            "g_tcp_wrapper_connection_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
