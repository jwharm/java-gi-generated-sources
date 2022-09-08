package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GSocketControlMessage is a special-purpose utility message that
 * can be sent to or received from a #GSocket. These types of
 * messages are often called "ancillary data".
 * 
 * The message can represent some sort of special instruction to or
 * information from the socket or can represent a special kind of
 * transfer to the peer (for example, sending a file descriptor over
 * a UNIX socket).
 * 
 * These messages are sent with g_socket_send_message() and received
 * with g_socket_receive_message().
 * 
 * To extend the set of control message that can be sent, subclass this
 * class and override the get_size, get_level, get_type and serialize
 * methods.
 * 
 * To extend the set of control messages that can be received, subclass
 * this class and implement the deserialize method. Also, make sure your
 * class is registered with the GType typesystem before calling
 * g_socket_receive_message() to read such a message.
 */
public class SocketControlMessage extends org.gtk.gobject.Object {

    public SocketControlMessage(io.github.jwharm.javagi.interop.Reference reference) {
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_control_message_get_level(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the protocol specific type of the control message.
     * For instance, for UNIX fd passing this would be SCM_RIGHTS.
     */
    public int getMsgType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_control_message_get_msg_type(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the space required for the control message, not including
     * headers or alignment.
     */
    public long getSize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_control_message_get_size(HANDLE());
        return RESULT;
    }
    
    /**
     * Converts the data in the message to bytes placed in the
     * message.
     * 
     * @data is guaranteed to have enough space to fit the size
     * returned by g_socket_control_message_get_size() on this
     * object.
     */
    public void serialize(jdk.incubator.foreign.MemoryAddress data) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_socket_control_message_serialize(HANDLE(), data);
    }
    
}
