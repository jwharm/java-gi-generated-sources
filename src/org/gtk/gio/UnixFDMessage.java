package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * This {@link SocketControlMessage} contains a {@link UnixFDList}.
 * It may be sent using g_socket_send_message() and received using
 * g_socket_receive_message() over UNIX sockets (ie: sockets in the
 * {@link SocketFamily#UNIX} family). The file descriptors are copied
 * between processes by the kernel.
 * <p>
 * For an easier way to send and receive file descriptors over
 * stream-oriented UNIX sockets, see g_unix_connection_send_fd() and
 * g_unix_connection_receive_fd().
 * <p>
 * Note that {@code <gio/gunixfdmessage.h>} belongs to the UNIX-specific GIO
 * interfaces, thus you have to use the {@code gio-unix-2.0.pc} pkg-config
 * file when using it.
 */
public class UnixFDMessage extends SocketControlMessage {

    public UnixFDMessage(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to UnixFDMessage */
    public static UnixFDMessage castFrom(org.gtk.gobject.Object gobject) {
        return new UnixFDMessage(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.g_unix_fd_message_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link UnixFDMessage} containing an empty file descriptor
     * list.
     */
    public UnixFDMessage() {
        super(constructNew());
    }
    
    private static Reference constructNewWithFdList(UnixFDList fdList) {
        Reference RESULT = References.get(gtk_h.g_unix_fd_message_new_with_fd_list(fdList.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link UnixFDMessage} containing {@code list}.
     */
    public static UnixFDMessage newWithFdList(UnixFDList fdList) {
        return new UnixFDMessage(constructNewWithFdList(fdList));
    }
    
    /**
     * Adds a file descriptor to {@code message}.
     * <p>
     * The file descriptor is duplicated using dup(). You keep your copy
     * of the descriptor and the copy contained in {@code message} will be closed
     * when {@code message} is finalized.
     * <p>
     * A possible cause of failure is exceeding the per-process or
     * system-wide file descriptor limit.
     */
    public boolean appendFd(int fd) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_unix_fd_message_append_fd(handle(), fd, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets the {@link UnixFDList} contained in {@code message}.  This function does not
     * return a reference to the caller, but the returned list is valid for
     * the lifetime of {@code message}.
     */
    public UnixFDList getFdList() {
        var RESULT = gtk_h.g_unix_fd_message_get_fd_list(handle());
        return new UnixFDList(References.get(RESULT, false));
    }
    
}
