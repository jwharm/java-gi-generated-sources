package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    public SocketControlMessage(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SocketControlMessage */
    public static SocketControlMessage castFrom(org.gtk.gobject.Object gobject) {
        return new SocketControlMessage(gobject.getReference());
    }
    
    /**
     * Returns the "level" (i.e. the originating protocol) of the control message.
     * This is often SOL_SOCKET.
     */
    public int getLevel() {
        var RESULT = gtk_h.g_socket_control_message_get_level(handle());
        return RESULT;
    }
    
    /**
     * Returns the protocol specific type of the control message.
     * For instance, for UNIX fd passing this would be SCM_RIGHTS.
     */
    public int getMsgType() {
        var RESULT = gtk_h.g_socket_control_message_get_msg_type(handle());
        return RESULT;
    }
    
    /**
     * Returns the space required for the control message, not including
     * headers or alignment.
     */
    public long getSize() {
        var RESULT = gtk_h.g_socket_control_message_get_size(handle());
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
    public void serialize(java.lang.foreign.MemoryAddress data) {
        gtk_h.g_socket_control_message_serialize(handle(), data);
    }
    
    /**
     * Tries to deserialize a socket control message of a given
     * {@code level} and {@code type}. This will ask all known (to GType) subclasses
     * of {@link SocketControlMessage} if they can understand this kind
     * of message and if so deserialize it into a {@link SocketControlMessage}.
     * <p>
     * If there is no implementation for this kind of control message, <code>null</code>
     * will be returned.
     */
    public static SocketControlMessage deserialize(int level, int type, long size, byte[] data) {
        var RESULT = gtk_h.g_socket_control_message_deserialize(level, type, size, new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle());
        return new SocketControlMessage(References.get(RESULT, true));
    }
    
}
