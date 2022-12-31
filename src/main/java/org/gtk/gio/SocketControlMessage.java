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
public class SocketControlMessage extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSocketControlMessage";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a SocketControlMessage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SocketControlMessage(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SocketControlMessage> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SocketControlMessage(input, ownership);
    
    /**
     * Returns the "level" (i.e. the originating protocol) of the control message.
     * This is often SOL_SOCKET.
     * @return an integer describing the level
     */
    public int getLevel() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_socket_control_message_get_level.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.g_socket_control_message_get_msg_type.invokeExact(
                    handle());
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
            RESULT = (long) DowncallHandles.g_socket_control_message_get_size.invokeExact(
                    handle());
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
     */
    public void serialize() {
        try {
            DowncallHandles.g_socket_control_message_serialize.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL);
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
            RESULT = (long) DowncallHandles.g_socket_control_message_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
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
    public static org.gtk.gio.SocketControlMessage deserialize(int level, int type, long size, byte[] data) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_socket_control_message_deserialize.invokeExact(
                    level,
                    type,
                    size,
                    Interop.allocateNativeArray(data, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.SocketControlMessage) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.SocketControlMessage.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * A {@link SocketControlMessage.Builder} object constructs a {@link SocketControlMessage} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SocketControlMessage.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link SocketControlMessage} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SocketControlMessage}.
         * @return A new instance of {@code SocketControlMessage} with the properties 
         *         that were set in the Builder object.
         */
        public SocketControlMessage build() {
            return (SocketControlMessage) org.gtk.gobject.GObject.newWithProperties(
                SocketControlMessage.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_socket_control_message_get_level = Interop.downcallHandle(
            "g_socket_control_message_get_level",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_control_message_get_msg_type = Interop.downcallHandle(
            "g_socket_control_message_get_msg_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_control_message_get_size = Interop.downcallHandle(
            "g_socket_control_message_get_size",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_control_message_serialize = Interop.downcallHandle(
            "g_socket_control_message_serialize",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_socket_control_message_get_type = Interop.downcallHandle(
            "g_socket_control_message_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_socket_control_message_deserialize = Interop.downcallHandle(
            "g_socket_control_message_deserialize",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
