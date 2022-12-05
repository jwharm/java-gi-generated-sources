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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.SocketConnection.getMemoryLayout().withName("parent_instance"),
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
     * Create a TcpConnection proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TcpConnection(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to TcpConnection if its GType is a (or inherits from) "GTcpConnection".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TcpConnection} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GTcpConnection", a ClassCastException will be thrown.
     */
    public static TcpConnection castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), TcpConnection.getType())) {
            return new TcpConnection(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GTcpConnection");
        }
    }
    
    /**
     * Checks if graceful disconnects are used. See
     * g_tcp_connection_set_graceful_disconnect().
     * @return {@code true} if graceful disconnect is used on close, {@code false} otherwise
     */
    public boolean getGracefulDisconnect() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tcp_connection_get_graceful_disconnect.invokeExact(
                    handle());
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
            DowncallHandles.g_tcp_connection_set_graceful_disconnect.invokeExact(
                    handle(),
                    gracefulDisconnect ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tcp_connection_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gio.SocketConnection.Build {
        
         /**
         * A {@link TcpConnection.Build} object constructs a {@link TcpConnection} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link TcpConnection} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TcpConnection} using {@link TcpConnection#castFrom}.
         * @return A new instance of {@code TcpConnection} with the properties 
         *         that were set in the Build object.
         */
        public TcpConnection construct() {
            return TcpConnection.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    TcpConnection.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setGracefulDisconnect(boolean gracefulDisconnect) {
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
}
