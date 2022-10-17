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
 */
public class SocketControlMessage extends org.gtk.gobject.Object {

    public SocketControlMessage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SocketControlMessage */
    public static SocketControlMessage castFrom(org.gtk.gobject.Object gobject) {
        return new SocketControlMessage(gobject.refcounted());
    }
    
    private static final MethodHandle g_socket_control_message_get_level = Interop.downcallHandle(
        "g_socket_control_message_get_level",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the "level" (i.e. the originating protocol) of the control message.
     * This is often SOL_SOCKET.
     */
    public int getLevel() {
        int RESULT;
        try {
            RESULT = (int) g_socket_control_message_get_level.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_socket_control_message_get_msg_type = Interop.downcallHandle(
        "g_socket_control_message_get_msg_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the protocol specific type of the control message.
     * For instance, for UNIX fd passing this would be SCM_RIGHTS.
     */
    public int getMsgType() {
        int RESULT;
        try {
            RESULT = (int) g_socket_control_message_get_msg_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_socket_control_message_get_size = Interop.downcallHandle(
        "g_socket_control_message_get_size",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the space required for the control message, not including
     * headers or alignment.
     */
    public long getSize() {
        long RESULT;
        try {
            RESULT = (long) g_socket_control_message_get_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_socket_control_message_serialize = Interop.downcallHandle(
        "g_socket_control_message_serialize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts the data in the message to bytes placed in the
     * message.
     * <p>
     * {@code data} is guaranteed to have enough space to fit the size
     * returned by g_socket_control_message_get_size() on this
     * object.
     */
    public @NotNull void serialize(@NotNull java.lang.foreign.MemoryAddress data) {
        try {
            g_socket_control_message_serialize.invokeExact(handle(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_socket_control_message_deserialize = Interop.downcallHandle(
        "g_socket_control_message_deserialize",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Tries to deserialize a socket control message of a given
     * {@code level} and {@code type}. This will ask all known (to GType) subclasses
     * of {@link SocketControlMessage} if they can understand this kind
     * of message and if so deserialize it into a {@link SocketControlMessage}.
     * <p>
     * If there is no implementation for this kind of control message, {@code null}
     * will be returned.
     */
    public static @NotNull SocketControlMessage deserialize(@NotNull int level, @NotNull int type, @NotNull long size, @NotNull byte[] data) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_socket_control_message_deserialize.invokeExact(level, type, size, Interop.allocateNativeArray(data));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SocketControlMessage(Refcounted.get(RESULT, true));
    }
    
}
