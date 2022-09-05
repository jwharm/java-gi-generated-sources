package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * This #GSocketControlMessage contains a #GUnixFDList.
 * It may be sent using g_socket_send_message() and received using
 * g_socket_receive_message() over UNIX sockets (ie: sockets in the
 * %G_SOCKET_FAMILY_UNIX family). The file descriptors are copied
 * between processes by the kernel.
 * 
 * For an easier way to send and receive file descriptors over
 * stream-oriented UNIX sockets, see g_unix_connection_send_fd() and
 * g_unix_connection_receive_fd().
 * 
 * Note that `<gio/gunixfdmessage.h>` belongs to the UNIX-specific GIO
 * interfaces, thus you have to use the `gio-unix-2.0.pc` pkg-config
 * file when using it.
 */
public class UnixFDMessage extends SocketControlMessage {

    public UnixFDMessage(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to UnixFDMessage */
    public static UnixFDMessage castFrom(org.gtk.gobject.Object gobject) {
        return new UnixFDMessage(gobject.getProxy());
    }
    
    /**
     * Creates a new #GUnixFDMessage containing an empty file descriptor
     * list.
     */
    public UnixFDMessage() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_fd_message_new(), true));
    }
    
    /**
     * Creates a new #GUnixFDMessage containing @list.
     */
    public UnixFDMessage(UnixFDList fdList) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_fd_message_new_with_fd_list(fdList.HANDLE()), true));
    }
    
    /**
     * Adds a file descriptor to @message.
     * 
     * The file descriptor is duplicated using dup(). You keep your copy
     * of the descriptor and the copy contained in @message will be closed
     * when @message is finalized.
     * 
     * A possible cause of failure is exceeding the per-process or
     * system-wide file descriptor limit.
     */
    public boolean appendFd(int fd) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_fd_message_append_fd(HANDLE(), fd, GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets the #GUnixFDList contained in @message.  This function does not
     * return a reference to the caller, but the returned list is valid for
     * the lifetime of @message.
     */
    public UnixFDList getFdList() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_fd_message_get_fd_list(HANDLE());
        return new UnixFDList(ProxyFactory.getProxy(RESULT, false));
    }
    
}
