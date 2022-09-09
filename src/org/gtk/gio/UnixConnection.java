package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * This is the subclass of #GSocketConnection that is created
 * for UNIX domain sockets.
 * 
 * It contains functions to do some of the UNIX socket specific
 * functionality like passing file descriptors.
 * 
 * Since GLib 2.72, #GUnixConnection is available on all platforms. It requires
 * underlying system support (such as Windows 10 with `AF_UNIX`) at run time.
 * 
 * Before GLib 2.72, `<gio/gunixconnection.h>` belonged to the UNIX-specific GIO
 * interfaces, thus you had to use the `gio-unix-2.0.pc` pkg-config file when
 * using it. This is no longer necessary since GLib 2.72.
 */
public class UnixConnection extends SocketConnection {

    public UnixConnection(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to UnixConnection */
    public static UnixConnection castFrom(org.gtk.gobject.Object gobject) {
        return new UnixConnection(gobject.getReference());
    }
    
    /**
     * Receives credentials from the sending end of the connection.  The
     * sending end has to call g_unix_connection_send_credentials() (or
     * similar) for this to work.
     * 
     * As well as reading the credentials this also reads (and discards) a
     * single byte from the stream, as this is required for credentials
     * passing to work on some implementations.
     * 
     * This method can be expected to be available on the following platforms:
     * 
     * - Linux since GLib 2.26
     * - FreeBSD since GLib 2.26
     * - GNU/kFreeBSD since GLib 2.36
     * - Solaris, Illumos and OpenSolaris since GLib 2.40
     * - GNU/Hurd since GLib 2.40
     * 
     * Other ways to exchange credentials with a foreign peer includes the
     * #GUnixCredentialsMessage type and g_socket_get_credentials() function.
     */
    public Credentials receiveCredentials(Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_unix_connection_receive_credentials(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Credentials(References.get(RESULT, true));
    }
    
    /**
     * Finishes an asynchronous receive credentials operation started with
     * g_unix_connection_receive_credentials_async().
     */
    public Credentials receiveCredentialsFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_unix_connection_receive_credentials_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Credentials(References.get(RESULT, true));
    }
    
    /**
     * Receives a file descriptor from the sending end of the connection.
     * The sending end has to call g_unix_connection_send_fd() for this
     * to work.
     * 
     * As well as reading the fd this also reads a single byte from the
     * stream, as this is required for fd passing to work on some
     * implementations.
     */
    public int receiveFd(Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_unix_connection_receive_fd(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Passes the credentials of the current user the receiving side
     * of the connection. The receiving end has to call
     * g_unix_connection_receive_credentials() (or similar) to accept the
     * credentials.
     * 
     * As well as sending the credentials this also writes a single NUL
     * byte to the stream, as this is required for credentials passing to
     * work on some implementations.
     * 
     * This method can be expected to be available on the following platforms:
     * 
     * - Linux since GLib 2.26
     * - FreeBSD since GLib 2.26
     * - GNU/kFreeBSD since GLib 2.36
     * - Solaris, Illumos and OpenSolaris since GLib 2.40
     * - GNU/Hurd since GLib 2.40
     * 
     * Other ways to exchange credentials with a foreign peer includes the
     * #GUnixCredentialsMessage type and g_socket_get_credentials() function.
     */
    public boolean sendCredentials(Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_unix_connection_send_credentials(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Finishes an asynchronous send credentials operation started with
     * g_unix_connection_send_credentials_async().
     */
    public boolean sendCredentialsFinish(AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_unix_connection_send_credentials_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Passes a file descriptor to the receiving side of the
     * connection. The receiving end has to call g_unix_connection_receive_fd()
     * to accept the file descriptor.
     * 
     * As well as sending the fd this also writes a single byte to the
     * stream, as this is required for fd passing to work on some
     * implementations.
     */
    public boolean sendFd(int fd, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_unix_connection_send_fd(handle(), fd, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
}
