package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link UnixInputStream} implements {@link InputStream} for reading from a UNIX
 * file descriptor, including asynchronous operations. (If the file
 * descriptor refers to a socket or pipe, this will use poll() to do
 * asynchronous I/O. If it refers to a regular file, it will fall back
 * to doing asynchronous I/O in another thread.)
 * <p>
 * Note that {@code <gio/gunixinputstream.h>} belongs to the UNIX-specific GIO
 * interfaces, thus you have to use the {@code gio-unix-2.0.pc} pkg-config
 * file when using it.
 */
public class UnixInputStream extends org.gtk.gio.InputStream implements org.gtk.gio.FileDescriptorBased, org.gtk.gio.PollableInputStream {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GUnixInputStream";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.InputStream.getMemoryLayout().withName("parent_instance"),
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
    public org.gtk.gio.InputStream parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gio.InputStream(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public UnixInputStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to UnixInputStream if its GType is a (or inherits from) "GUnixInputStream".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "UnixInputStream" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GUnixInputStream", a ClassCastException will be thrown.
     */
    public static UnixInputStream castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GUnixInputStream"))) {
            return new UnixInputStream(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GUnixInputStream");
        }
    }
    
    private static Refcounted constructNew(int fd, boolean closeFd) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_unix_input_stream_new.invokeExact(
                    fd,
                    closeFd ? 1 : 0), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link UnixInputStream} for the given {@code fd}.
     * <p>
     * If {@code close_fd} is {@code true}, the file descriptor will be closed
     * when the stream is closed.
     * @param fd a UNIX file descriptor
     * @param closeFd {@code true} to close the file descriptor when done
     */
    public UnixInputStream(int fd, boolean closeFd) {
        super(constructNew(fd, closeFd));
    }
    
    /**
     * Returns whether the file descriptor of {@code stream} will be
     * closed when the stream is closed.
     * @return {@code true} if the file descriptor is closed when done
     */
    public boolean getCloseFd() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_input_stream_get_close_fd.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Return the UNIX file descriptor that the stream reads from.
     * @return The file descriptor of {@code stream}
     */
    public int getFd() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_input_stream_get_fd.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets whether the file descriptor of {@code stream} shall be closed
     * when the stream is closed.
     * @param closeFd {@code true} to close the file descriptor when done
     */
    public void setCloseFd(boolean closeFd) {
        try {
            DowncallHandles.g_unix_input_stream_set_close_fd.invokeExact(
                    handle(),
                    closeFd ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_unix_input_stream_new = Interop.downcallHandle(
            "g_unix_input_stream_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_unix_input_stream_get_close_fd = Interop.downcallHandle(
            "g_unix_input_stream_get_close_fd",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_input_stream_get_fd = Interop.downcallHandle(
            "g_unix_input_stream_get_fd",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_input_stream_set_close_fd = Interop.downcallHandle(
            "g_unix_input_stream_set_close_fd",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
