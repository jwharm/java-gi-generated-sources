package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link UnixOutputStream} implements {@link OutputStream} for writing to a UNIX
 * file descriptor, including asynchronous operations. (If the file
 * descriptor refers to a socket or pipe, this will use poll() to do
 * asynchronous I/O. If it refers to a regular file, it will fall back
 * to doing asynchronous I/O in another thread.)
 * <p>
 * Note that {@code <gio/gunixoutputstream.h>} belongs to the UNIX-specific GIO
 * interfaces, thus you have to use the {@code gio-unix-2.0.pc} pkg-config file
 * when using it.
 */
public class UnixOutputStream extends OutputStream implements FileDescriptorBased, PollableOutputStream {

    public UnixOutputStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to UnixOutputStream */
    public static UnixOutputStream castFrom(org.gtk.gobject.Object gobject) {
        return new UnixOutputStream(gobject.refcounted());
    }
    
    static final MethodHandle g_unix_output_stream_new = Interop.downcallHandle(
        "g_unix_output_stream_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(int fd, boolean closeFd) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_unix_output_stream_new.invokeExact(fd, closeFd ? 1 : 0), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link UnixOutputStream} for the given {@code fd}.
     * <p>
     * If {@code close_fd}, is {@code true}, the file descriptor will be closed when
     * the output stream is destroyed.
     */
    public UnixOutputStream(int fd, boolean closeFd) {
        super(constructNew(fd, closeFd));
    }
    
    static final MethodHandle g_unix_output_stream_get_close_fd = Interop.downcallHandle(
        "g_unix_output_stream_get_close_fd",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the file descriptor of {@code stream} will be
     * closed when the stream is closed.
     */
    public boolean getCloseFd() {
        try {
            var RESULT = (int) g_unix_output_stream_get_close_fd.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_output_stream_get_fd = Interop.downcallHandle(
        "g_unix_output_stream_get_fd",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Return the UNIX file descriptor that the stream writes to.
     */
    public int getFd() {
        try {
            var RESULT = (int) g_unix_output_stream_get_fd.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_unix_output_stream_set_close_fd = Interop.downcallHandle(
        "g_unix_output_stream_set_close_fd",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the file descriptor of {@code stream} shall be closed
     * when the stream is closed.
     */
    public void setCloseFd(boolean closeFd) {
        try {
            g_unix_output_stream_set_close_fd.invokeExact(handle(), closeFd ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
