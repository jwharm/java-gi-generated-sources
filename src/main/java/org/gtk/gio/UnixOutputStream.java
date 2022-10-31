package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class UnixOutputStream extends org.gtk.gio.OutputStream implements org.gtk.gio.FileDescriptorBased, org.gtk.gio.PollableOutputStream {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GUnixOutputStream";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.OutputStream.getMemoryLayout().withName("parent_instance"),
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
    public org.gtk.gio.OutputStream parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gio.OutputStream(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public UnixOutputStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to UnixOutputStream if its GType is a (or inherits from) "GUnixOutputStream".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "UnixOutputStream" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GUnixOutputStream", a ClassCastException will be thrown.
     */
    public static UnixOutputStream castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GUnixOutputStream"))) {
            return new UnixOutputStream(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GUnixOutputStream");
        }
    }
    
    private static Refcounted constructNew(int fd, boolean closeFd) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_unix_output_stream_new.invokeExact(
                    fd,
                    closeFd ? 1 : 0), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link UnixOutputStream} for the given {@code fd}.
     * <p>
     * If {@code close_fd}, is {@code true}, the file descriptor will be closed when
     * the output stream is destroyed.
     * @param fd a UNIX file descriptor
     * @param closeFd {@code true} to close the file descriptor when done
     */
    public UnixOutputStream(int fd, boolean closeFd) {
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
            RESULT = (int) DowncallHandles.g_unix_output_stream_get_close_fd.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Return the UNIX file descriptor that the stream writes to.
     * @return The file descriptor of {@code stream}
     */
    public int getFd() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_unix_output_stream_get_fd.invokeExact(
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
            DowncallHandles.g_unix_output_stream_set_close_fd.invokeExact(
                    handle(),
                    closeFd ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_unix_output_stream_new = Interop.downcallHandle(
            "g_unix_output_stream_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_unix_output_stream_get_close_fd = Interop.downcallHandle(
            "g_unix_output_stream_get_close_fd",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_output_stream_get_fd = Interop.downcallHandle(
            "g_unix_output_stream_get_fd",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_unix_output_stream_set_close_fd = Interop.downcallHandle(
            "g_unix_output_stream_set_close_fd",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
