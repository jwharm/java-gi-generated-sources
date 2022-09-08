package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GUnixInputStream implements #GInputStream for reading from a UNIX
 * file descriptor, including asynchronous operations. (If the file
 * descriptor refers to a socket or pipe, this will use poll() to do
 * asynchronous I/O. If it refers to a regular file, it will fall back
 * to doing asynchronous I/O in another thread.)
 * 
 * Note that `<gio/gunixinputstream.h>` belongs to the UNIX-specific GIO
 * interfaces, thus you have to use the `gio-unix-2.0.pc` pkg-config
 * file when using it.
 */
public class UnixInputStream extends InputStream implements FileDescriptorBased, PollableInputStream {

    public UnixInputStream(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to UnixInputStream */
    public static UnixInputStream castFrom(org.gtk.gobject.Object gobject) {
        return new UnixInputStream(gobject.getReference());
    }
    
    /**
     * Creates a new #GUnixInputStream for the given @fd.
     * 
     * If @close_fd is %TRUE, the file descriptor will be closed
     * when the stream is closed.
     */
    public UnixInputStream(int fd, boolean closeFd) {
        super(References.get(gtk_h.g_unix_input_stream_new(fd, closeFd ? 1 : 0), true));
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
