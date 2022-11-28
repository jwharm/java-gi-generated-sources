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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TcpWrapperConnection} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GTcpWrapperConnection", a ClassCastException will be thrown.
     */
    public static TcpWrapperConnection castFrom(org.gtk.gobject.Object gobject) {
            return new TcpWrapperConnection(gobject.handle(), gobject.yieldOwnership());
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_tcp_wrapper_connection_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gio.TcpConnection.Build {
        
         /**
         * A {@link TcpWrapperConnection.Build} object constructs a {@link TcpWrapperConnection} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link TcpWrapperConnection} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TcpWrapperConnection} using {@link TcpWrapperConnection#castFrom}.
         * @return A new instance of {@code TcpWrapperConnection} with the properties 
         *         that were set in the Build object.
         */
        public TcpWrapperConnection construct() {
            return TcpWrapperConnection.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    TcpWrapperConnection.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setBaseIoStream(org.gtk.gio.IOStream baseIoStream) {
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
