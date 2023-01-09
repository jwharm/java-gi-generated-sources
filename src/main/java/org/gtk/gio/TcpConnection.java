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
    
    private static final java.lang.String C_TYPE_NAME = "GTcpConnection";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.SocketConnection.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a TcpConnection proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TcpConnection(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TcpConnection> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TcpConnection(input);
    
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
            DowncallHandles.g_tcp_connection_set_graceful_disconnect.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(gracefulDisconnect, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tcp_connection_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link TcpConnection.Builder} object constructs a {@link TcpConnection} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TcpConnection.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.SocketConnection.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link TcpConnection} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TcpConnection}.
         * @return A new instance of {@code TcpConnection} with the properties 
         *         that were set in the Builder object.
         */
        public TcpConnection build() {
            return (TcpConnection) org.gtk.gobject.GObject.newWithProperties(
                TcpConnection.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setGracefulDisconnect(boolean gracefulDisconnect) {
            names.add("graceful-disconnect");
            values.add(org.gtk.gobject.Value.create(gracefulDisconnect));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_tcp_connection_get_graceful_disconnect = Interop.downcallHandle(
                "g_tcp_connection_get_graceful_disconnect",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tcp_connection_set_graceful_disconnect = Interop.downcallHandle(
                "g_tcp_connection_set_graceful_disconnect",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_tcp_connection_get_type = Interop.downcallHandle(
                "g_tcp_connection_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_tcp_connection_get_type != null;
    }
}
