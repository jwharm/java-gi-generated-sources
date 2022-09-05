package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GUnixFDList contains a list of file descriptors.  It owns the file
 * descriptors that it contains, closing them when finalized.
 * 
 * It may be wrapped in a #GUnixFDMessage and sent over a #GSocket in
 * the %G_SOCKET_FAMILY_UNIX family by using g_socket_send_message()
 * and received using g_socket_receive_message().
 * 
 * Note that `<gio/gunixfdlist.h>` belongs to the UNIX-specific GIO
 * interfaces, thus you have to use the `gio-unix-2.0.pc` pkg-config
 * file when using it.
 */
public class UnixFDList extends org.gtk.gobject.Object {

    public UnixFDList(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to UnixFDList */
    public static UnixFDList castFrom(org.gtk.gobject.Object gobject) {
        return new UnixFDList(gobject.getProxy());
    }
    
    /**
     * Creates a new #GUnixFDList containing no file descriptors.
     */
    public UnixFDList() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_fd_list_new(), true));
    }
    
    /**
     * Creates a new #GUnixFDList containing the file descriptors given in
     * @fds.  The file descriptors become the property of the new list and
     * may no longer be used by the caller.  The array itself is owned by
     * the caller.
     * 
     * Each file descriptor in the array should be set to close-on-exec.
     * 
     * If @n_fds is -1 then @fds must be terminated with -1.
     */
    public UnixFDList(int[] fds, int nFds) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_fd_list_new_from_array(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, fds), nFds), true));
    }
    
    /**
     * Adds a file descriptor to @list.
     * 
     * The file descriptor is duplicated using dup(). You keep your copy
     * of the descriptor and the copy contained in @list will be closed
     * when @list is finalized.
     * 
     * A possible cause of failure is exceeding the per-process or
     * system-wide file descriptor limit.
     * 
     * The index of the file descriptor in the list is returned.  If you use
     * this index with g_unix_fd_list_get() then you will receive back a
     * duplicated copy of the same file descriptor.
     */
    public int append(int fd) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_fd_list_append(HANDLE(), fd, GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Gets a file descriptor out of @list.
     * 
     * @index_ specifies the index of the file descriptor to get.  It is a
     * programmer error for @index_ to be out of range; see
     * g_unix_fd_list_get_length().
     * 
     * The file descriptor is duplicated using dup() and set as
     * close-on-exec before being returned.  You must call close() on it
     * when you are done.
     * 
     * A possible cause of failure is exceeding the per-process or
     * system-wide file descriptor limit.
     */
    public int get(int index) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_fd_list_get(HANDLE(), index, GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Gets the length of @list (ie: the number of file descriptors
     * contained within).
     */
    public int getLength() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_unix_fd_list_get_length(HANDLE());
        return RESULT;
    }
    
}
