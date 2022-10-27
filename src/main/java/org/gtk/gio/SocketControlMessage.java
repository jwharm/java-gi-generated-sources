package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link SocketControlMessage} is a special-purpose utility message that
 * can be sent to or received from a {@link Socket}. These types of
 * messages are often called "ancillary data".
 * <p>
 * The message can represent some sort of special instruction to or
 * information from the socket or can represent a special kind of
 * transfer to the peer (for example, sending a file descriptor over
 * a UNIX socket).
 * <p>
 * These messages are sent with g_socket_send_message() and received
 * with g_socket_receive_message().
 * <p>
 * To extend the set of control message that can be sent, subclass this
 * class and override the get_size, get_level, get_type and serialize
 * methods.
 * <p>
 * To extend the set of control messages that can be received, subclass
 * this class and implement the deserialize method. Also, make sure your
 * class is registered with the GType typesystem before calling
 * g_socket_receive_message() to read such a message.
 * @version 2.22
 */
public class SocketControlMessage extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        org.gtk.gio.SocketControlMessagePrivate.getMemoryLayout().withName("priv")
    ).withName("GSocketControlMessage");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public SocketControlMessage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SocketControlMessage */
    public static SocketControlMessage castFrom(org.gtk.gobject.Object gobject) {
        return new SocketControlMessage(gobject.refcounted());
    }
    
    /**
     * Returns the "level" (i.e. the originating protocol) of the control message.
     * This is often SOL_SOCKET.
     * @return an integer describing the level
     */
    public int getLevel() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_control_message_get_level.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the protocol specific type of the control message.
     * For instance, for UNIX fd passing this would be SCM_RIGHTS.
     * @return an integer describing the type of control message
     */
    public int getMsgType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_control_message_get_msg_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the space required for the control message, not including
     * headers or alignment.
     * @return The number of bytes required.
     */
    public long getSize() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_socket_control_message_get_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Converts the data in the message to bytes placed in the
     * message.
     * <p>
     * {@code data} is guaranteed to have enough space to fit the size
     * returned by g_socket_control_message_get_size() on this
     * object.
     * @param data A buffer to write data to
     */
    public void serialize(@NotNull java.lang.foreign.MemoryAddress data) {
        try {
            DowncallHandles.g_socket_control_message_serialize.invokeExact(handle(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Tries to deserialize a socket control message of a given
     * {@code level} and {@code type}. This will ask all known (to GType) subclasses
     * of {@link SocketControlMessage} if they can understand this kind
     * of message and if so deserialize it into a {@link SocketControlMessage}.
     * <p>
     * If there is no implementation for this kind of control message, {@code null}
     * will be returned.
     * @param level a socket level
     * @param type a socket control message type for the given {@code level}
     * @param size the size of the data in bytes
     * @param data pointer to the message data
     * @return the deserialized message or {@code null}
     */
    public static @NotNull org.gtk.gio.SocketControlMessage deserialize(int level, int type, long size, byte[] data) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_control_message_deserialize.invokeExact(level, type, size, Interop.allocateNativeArray(data, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.SocketControlMessage(Refcounted.get(RESULT, true));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_socket_control_message_get_level = Interop.downcallHandle(
            "g_socket_control_message_get_level",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_control_message_get_msg_type = Interop.downcallHandle(
            "g_socket_control_message_get_msg_type",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_control_message_get_size = Interop.downcallHandle(
            "g_socket_control_message_get_size",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_control_message_serialize = Interop.downcallHandle(
            "g_socket_control_message_serialize",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_socket_control_message_deserialize = Interop.downcallHandle(
            "g_socket_control_message_deserialize",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
    }
}
