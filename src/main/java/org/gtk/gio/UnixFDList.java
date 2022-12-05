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
 * Before 2.74, {@code <gio/gunixfdlist.h>} belonged to the UNIX-specific GIO
 * interfaces, thus you had to use the {@code gio-unix-2.0.pc} pkg-config file when
 * using it.
 * <p>
 * Since 2.74, the API is available for Windows.
 */
public class UnixFDList extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GUnixFDList";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a UnixFDList proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public UnixFDList(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to UnixFDList if its GType is a (or inherits from) "GUnixFDList".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code UnixFDList} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GUnixFDList", a ClassCastException will be thrown.
     */
    public static UnixFDList castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), UnixFDList.getType())) {
            return new UnixFDList(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GUnixFDList");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_fd_list_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link UnixFDList} containing no file descriptors.
     */
    public UnixFDList() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static Addressable constructNewFromArray(@NotNull int[] fds, int nFds) {
        java.util.Objects.requireNonNull(fds, "Parameter 'fds' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_fd_list_new_from_array.invokeExact(
                    Interop.allocateNativeArray(fds, false),
                    nFds);
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
    public static UnixFDList newFromArray(@NotNull int[] fds, int nFds) {
        return new UnixFDList(constructNewFromArray(fds, nFds), Ownership.FULL);
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
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_fd_list_append.invokeExact(
                    handle(),
                    fd,
                    (Addressable) GERROR);
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
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_fd_list_get.invokeExact(
                    handle(),
                    index,
                    (Addressable) GERROR);
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
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_fd_list_peek_fds.invokeExact(
                    handle(),
                    (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(Interop.valueLayout.C_INT, 0));
        return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), length.get().intValue() * Interop.valueLayout.C_INT.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_INT);
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
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_fd_list_steal_fds.invokeExact(
                    handle(),
                    (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(Interop.valueLayout.C_INT, 0));
        return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), length.get().intValue() * Interop.valueLayout.C_INT.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_INT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_unix_fd_list_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link UnixFDList.Build} object constructs a {@link UnixFDList} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link UnixFDList} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link UnixFDList} using {@link UnixFDList#castFrom}.
         * @return A new instance of {@code UnixFDList} with the properties 
         *         that were set in the Build object.
         */
        public UnixFDList construct() {
            return UnixFDList.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    UnixFDList.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_unix_fd_list_new = Interop.downcallHandle(
            "g_unix_fd_list_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_fd_list_new_from_array = Interop.downcallHandle(
            "g_unix_fd_list_new_from_array",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_unix_fd_list_append = Interop.downcallHandle(
            "g_unix_fd_list_append",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_fd_list_get = Interop.downcallHandle(
            "g_unix_fd_list_get",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_fd_list_get_length = Interop.downcallHandle(
            "g_unix_fd_list_get_length",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_fd_list_peek_fds = Interop.downcallHandle(
            "g_unix_fd_list_peek_fds",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_fd_list_steal_fds = Interop.downcallHandle(
            "g_unix_fd_list_steal_fds",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_fd_list_get_type = Interop.downcallHandle(
            "g_unix_fd_list_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
