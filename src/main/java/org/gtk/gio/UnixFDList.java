package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GUnixFDList";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public UnixFDList(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to UnixFDList if its GType is a (or inherits from) "GUnixFDList".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "UnixFDList" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GUnixFDList", a ClassCastException will be thrown.
     */
    public static UnixFDList castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GUnixFDList"))) {
            return new UnixFDList(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GUnixFDList");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_unix_fd_list_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link UnixFDList} containing no file descriptors.
     */
    public UnixFDList() {
        super(constructNew());
    }
    
    private static Refcounted constructNewFromArray(int[] fds, int nFds) {
        java.util.Objects.requireNonNull(fds, "Parameter 'fds' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_unix_fd_list_new_from_array.invokeExact(
                    Interop.allocateNativeArray(fds, false),
                    nFds), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
     * @param fds the initial list of file descriptors
     * @param nFds the length of {@code fds}, or -1
     * @return a new {@link UnixFDList}
     */
    public static UnixFDList newFromArray(int[] fds, int nFds) {
        return new UnixFDList(constructNewFromArray(fds, nFds));
    }
    
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
     * @param fd a valid open file descriptor
     * @return the index of the appended fd in case of success, else -1
     *          (and {@code error} is set)
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public int append(int fd) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_fd_list_append.invokeExact(
                    handle(),
                    fd, (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
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
     * @param index the index into the list
     * @return the file descriptor, or -1 in case of error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public int get(int index) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_fd_list_get.invokeExact(
                    handle(),
                    index, (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Gets the length of {@code list} (ie: the number of file descriptors
     * contained within).
     * @return the length of {@code list}
     */
    public int getLength() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_fd_list_get_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
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
     * @param length pointer to the length of the returned
     *     array, or {@code null}
     * @return an array of file
     *     descriptors
     */
    public @NotNull int[] peekFds(Out<Integer> length) {
        java.util.Objects.requireNonNull(length, "Parameter 'length' must not be null");
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_fd_list_peek_fds.invokeExact(
                    handle(),
                    (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_INT, 0));
        return MemorySegment.ofAddress(RESULT.get(ValueLayout.ADDRESS, 0), length.get().intValue() * ValueLayout.JAVA_INT.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_INT);
    }
    
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
     * @param length pointer to the length of the returned
     *     array, or {@code null}
     * @return an array of file
     *     descriptors
     */
    public @NotNull int[] stealFds(Out<Integer> length) {
        java.util.Objects.requireNonNull(length, "Parameter 'length' must not be null");
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_fd_list_steal_fds.invokeExact(
                    handle(),
                    (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_INT, 0));
        return MemorySegment.ofAddress(RESULT.get(ValueLayout.ADDRESS, 0), length.get().intValue() * ValueLayout.JAVA_INT.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_INT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_unix_fd_list_new = Interop.downcallHandle(
            "g_unix_fd_list_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_fd_list_new_from_array = Interop.downcallHandle(
            "g_unix_fd_list_new_from_array",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_unix_fd_list_append = Interop.downcallHandle(
            "g_unix_fd_list_append",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_fd_list_get = Interop.downcallHandle(
            "g_unix_fd_list_get",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_fd_list_get_length = Interop.downcallHandle(
            "g_unix_fd_list_get_length",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_fd_list_peek_fds = Interop.downcallHandle(
            "g_unix_fd_list_peek_fds",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_fd_list_steal_fds = Interop.downcallHandle(
            "g_unix_fd_list_steal_fds",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
