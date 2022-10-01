package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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

    public UnixOutputStream(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to UnixOutputStream */
    public static UnixOutputStream castFrom(org.gtk.gobject.Object gobject) {
        return new UnixOutputStream(gobject.getReference());
    }
    
    private static Reference constructNew(int fd, boolean closeFd) {
        Reference RESULT = References.get(gtk_h.g_unix_output_stream_new(fd, closeFd ? 1 : 0), true);
        return RESULT;
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
    
    /**
     * Returns whether the file descriptor of {@code stream} will be
     * closed when the stream is closed.
     */
    public boolean getCloseFd() {
        var RESULT = gtk_h.g_unix_output_stream_get_close_fd(handle());
        return RESULT != 0;
    }
    
    /**
     * Return the UNIX file descriptor that the stream writes to.
     */
    public int getFd() {
        var RESULT = gtk_h.g_unix_output_stream_get_fd(handle());
        return RESULT;
    }
    
    /**
     * Sets whether the file descriptor of {@code stream} shall be closed
     * when the stream is closed.
     */
    public void setCloseFd(boolean closeFd) {
        gtk_h.g_unix_output_stream_set_close_fd(handle(), closeFd ? 1 : 0);
    }
    
}
