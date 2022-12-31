package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class UnixFDMessage extends org.gtk.gio.SocketControlMessage {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GUnixFDMessage";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.SocketControlMessage.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a UnixFDMessage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected UnixFDMessage(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, UnixFDMessage> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new UnixFDMessage(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_fd_message_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link UnixFDMessage} containing an empty file descriptor
     * list.
     */
    public UnixFDMessage() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewWithFdList(org.gtk.gio.UnixFDList fdList) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_fd_message_new_with_fd_list.invokeExact(
                    fdList.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link UnixFDMessage} containing {@code list}.
     * @param fdList a {@link UnixFDList}
     * @return a new {@link UnixFDMessage}
     */
    public static UnixFDMessage newWithFdList(org.gtk.gio.UnixFDList fdList) {
        var RESULT = constructNewWithFdList(fdList);
        return (org.gtk.gio.UnixFDMessage) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.UnixFDMessage.fromAddress).marshal(RESULT, Ownership.FULL);
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
     * @param fd a valid open file descriptor
     * @return {@code true} in case of success, else {@code false} (and {@code error} is set)
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean appendFd(int fd) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_fd_message_append_fd.invokeExact(
                    handle(),
                    fd,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the {@link UnixFDList} contained in {@code message}.  This function does not
     * return a reference to the caller, but the returned list is valid for
     * the lifetime of {@code message}.
     * @return the {@link UnixFDList} from {@code message}
     */
    public org.gtk.gio.UnixFDList getFdList() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_fd_message_get_fd_list.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.UnixFDList) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.UnixFDList.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the array of file descriptors that is contained in this
     * object.
     * <p>
     * After this call, the descriptors are no longer contained in
     * {@code message}. Further calls will return an empty list (unless more
     * descriptors have been added).
     * <p>
     * The return result of this function must be freed with g_free().
     * The caller is also responsible for closing all of the file
     * descriptors.
     * <p>
     * If {@code length} is non-{@code null} then it is set to the number of file
     * descriptors in the returned array. The returned array is also
     * terminated with -1.
     * <p>
     * This function never returns {@code null}. In case there are no file
     * descriptors contained in {@code message}, an empty array is returned.
     * @param length pointer to the length of the returned
     *     array, or {@code null}
     * @return an array of file
     *     descriptors
     */
    public int[] stealFds(Out<Integer> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_unix_fd_message_steal_fds.invokeExact(
                    handle(),
                    (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_INT, 0));
        return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), length.get().intValue() * Interop.valueLayout.C_INT.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_INT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_unix_fd_message_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link UnixFDMessage.Builder} object constructs a {@link UnixFDMessage} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link UnixFDMessage.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.SocketControlMessage.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link UnixFDMessage} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link UnixFDMessage}.
         * @return A new instance of {@code UnixFDMessage} with the properties 
         *         that were set in the Builder object.
         */
        public UnixFDMessage build() {
            return (UnixFDMessage) org.gtk.gobject.GObject.newWithProperties(
                UnixFDMessage.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setFdList(org.gtk.gio.UnixFDList fdList) {
            names.add("fd-list");
            values.add(org.gtk.gobject.Value.create(fdList));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_unix_fd_message_new = Interop.downcallHandle(
            "g_unix_fd_message_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_fd_message_new_with_fd_list = Interop.downcallHandle(
            "g_unix_fd_message_new_with_fd_list",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_fd_message_append_fd = Interop.downcallHandle(
            "g_unix_fd_message_append_fd",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_fd_message_get_fd_list = Interop.downcallHandle(
            "g_unix_fd_message_get_fd_list",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_fd_message_steal_fds = Interop.downcallHandle(
            "g_unix_fd_message_steal_fds",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_unix_fd_message_get_type = Interop.downcallHandle(
            "g_unix_fd_message_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
