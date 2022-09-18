package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link org.gtk.gio.UnixInputStream} implements {@link org.gtk.gio.InputStream} for reading from a UNIX
 * file descriptor, including asynchronous operations. (If the file
 * descriptor refers to a socket or pipe, this will use poll() to do
 * asynchronous I/O. If it refers to a regular file, it will fall back
 * to doing asynchronous I/O in another thread.)
 * <p>
 * Note that <code>&<code>#60</code> gio/gunixinputstream.h&<code>#62</code> </code> belongs to the UNIX-specific GIO
 * interfaces, thus you have to use the <code>gio-unix-2.0.pc</code> pkg-config
 * file when using it.
 */
public class UnixInputStream extends InputStream implements FileDescriptorBased, PollableInputStream {

    public UnixInputStream(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to UnixInputStream */
    public static UnixInputStream castFrom(org.gtk.gobject.Object gobject) {
        return new UnixInputStream(gobject.getReference());
    }
    
    private static Reference constructNew(int fd, boolean closeFd) {
        Reference RESULT = References.get(gtk_h.g_unix_input_stream_new(fd, closeFd ? 1 : 0), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link org.gtk.gio.UnixInputStream} for the given @fd.
     * 
     * If @close_fd is <code>true</code>  the file descriptor will be closed
     * when the stream is closed.
     */
    public UnixInputStream(int fd, boolean closeFd) {
        super(constructNew(fd, closeFd));
    }
    
    /**
     * Returns whether the file descriptor of @stream will be
     * closed when the stream is closed.
     */
    public boolean getCloseFd() {
        var RESULT = gtk_h.g_unix_input_stream_get_close_fd(handle());
        return (RESULT != 0);
    }
    
    /**
     * Return the UNIX file descriptor that the stream reads from.
     */
    public int getFd() {
        var RESULT = gtk_h.g_unix_input_stream_get_fd(handle());
        return RESULT;
    }
    
    /**
     * Sets whether the file descriptor of @stream shall be closed
     * when the stream is closed.
     */
    public void setCloseFd(boolean closeFd) {
        gtk_h.g_unix_input_stream_set_close_fd(handle(), closeFd ? 1 : 0);
    }
    
}
