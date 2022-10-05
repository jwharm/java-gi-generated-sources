package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link UnixFDList} contains a list of file descriptors.  It owns the file
 * descriptors that it contains, closing them when finalized.
 * <p>
 * It may be wrapped in a {@link UnixFDMessage} and sent over a {@link Socket} in
 * the {@link SocketFamily#UNIX} family by using g_socket_send_message()
 * and received using g_socket_receive_message().
 * <p>
 * Note that {@code <gio/gunixfdlist.h>} belongs to the UNIX-specific GIO
 * interfaces, thus you have to use the {@code gio-unix-2.0.pc} pkg-config
 * file when using it.
 */
public class UnixFDList extends org.gtk.gobject.Object {

    public UnixFDList(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to UnixFDList */
    public static UnixFDList castFrom(org.gtk.gobject.Object gobject) {
        return new UnixFDList(gobject.refcounted());
    }
    
    static final MethodHandle g_unix_fd_list_new = Interop.downcallHandle(
        "g_unix_fd_list_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_unix_fd_list_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link UnixFDList} containing no file descriptors.
     */
    public UnixFDList() {
        super(constructNew());
    }
    
    static final MethodHandle g_unix_fd_list_new_from_array = Interop.downcallHandle(
        "g_unix_fd_list_new_from_array",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewFromArray(int[] fds, int nFds) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_unix_fd_list_new_from_array.invokeExact(Interop.allocateNativeArray(fds).handle(), nFds), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link UnixFDList} containing the file descriptors given in
     * {@code fds}.  The file descriptors become the property of the new list and
     * may no longer be used by the caller.  The array itself is owned by
     * the caller.
     * <p>
     * Each file descriptor in the array should be set to close-on-exec.
     * <p>
     * If {@code n_fds} is -1 then {@code fds} must be terminated with -1.
     */
    public static UnixFDList newFromArray(int[] fds, int nFds) {
        return new UnixFDList(constructNewFromArray(fds, nFds));
    }
    
    static final MethodHandle g_unix_fd_list_append = Interop.downcallHandle(
        "g_unix_fd_list_append",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds a file descriptor to {@code list}.
     * <p>
     * The file descriptor is duplicated using dup(). You keep your copy
     * of the descriptor and the copy contained in {@code list} will be closed
     * when {@code list} is finalized.
     * <p>
     * A possible cause of failure is exceeding the per-process or
     * system-wide file descriptor limit.
     * <p>
     * The index of the file descriptor in the list is returned.  If you use
     * this index with g_unix_fd_list_get() then you will receive back a
     * duplicated copy of the same file descriptor.
     */
    public int append(int fd) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_unix_fd_list_append.invokeExact(handle(), fd, GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_fd_list_get = Interop.downcallHandle(
        "g_unix_fd_list_get",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets a file descriptor out of {@code list}.
     * <p>
     * {@code index_} specifies the index of the file descriptor to get.  It is a
     * programmer error for {@code index_} to be out of range; see
     * g_unix_fd_list_get_length().
     * <p>
     * The file descriptor is duplicated using dup() and set as
     * close-on-exec before being returned.  You must call close() on it
     * when you are done.
     * <p>
     * A possible cause of failure is exceeding the per-process or
     * system-wide file descriptor limit.
     */
    public int get(int index) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_unix_fd_list_get.invokeExact(handle(), index, GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_fd_list_get_length = Interop.downcallHandle(
        "g_unix_fd_list_get_length",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the length of {@code list} (ie: the number of file descriptors
     * contained within).
     */
    public int getLength() {
        try {
            var RESULT = (int) g_unix_fd_list_get_length.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_fd_list_peek_fds = Interop.downcallHandle(
        "g_unix_fd_list_peek_fds",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the array of file descriptors that is contained in this
     * object.
     * <p>
     * After this call, the descriptors remain the property of {@code list}.  The
     * caller must not close them and must not free the array.  The array is
     * valid only until {@code list} is changed in any way.
     * <p>
     * If {@code length} is non-{@code null} then it is set to the number of file
     * descriptors in the returned array. The returned array is also
     * terminated with -1.
     * <p>
     * This function never returns {@code null}. In case there are no file
     * descriptors contained in {@code list}, an empty array is returned.
     */
    public PointerIterator<Integer> peekFds(PointerInteger length) {
        try {
            var RESULT = (MemoryAddress) g_unix_fd_list_peek_fds.invokeExact(handle(), length.handle());
            return new PointerInteger(RESULT).iterator();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_fd_list_steal_fds = Interop.downcallHandle(
        "g_unix_fd_list_steal_fds",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the array of file descriptors that is contained in this
     * object.
     * <p>
     * After this call, the descriptors are no longer contained in
     * {@code list}. Further calls will return an empty list (unless more
     * descriptors have been added).
     * <p>
     * The return result of this function must be freed with g_free().
     * The caller is also responsible for closing all of the file
     * descriptors.  The file descriptors in the array are set to
     * close-on-exec.
     * <p>
     * If {@code length} is non-{@code null} then it is set to the number of file
     * descriptors in the returned array. The returned array is also
     * terminated with -1.
     * <p>
     * This function never returns {@code null}. In case there are no file
     * descriptors contained in {@code list}, an empty array is returned.
     */
    public PointerIterator<Integer> stealFds(PointerInteger length) {
        try {
            var RESULT = (MemoryAddress) g_unix_fd_list_steal_fds.invokeExact(handle(), length.handle());
            return new PointerInteger(RESULT).iterator();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
