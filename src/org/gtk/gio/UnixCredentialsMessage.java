package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * This {@link org.gtk.gio.SocketControlMessage} contains a {@link org.gtk.gio.Credentials} instance.  It
 * may be sent using g_socket_send_message() and received using
 * g_socket_receive_message() over UNIX sockets (ie: sockets in the
 * {@link org.gtk.gio.SocketFamily<code>#UNIX</code>  family).
 * <p>
 * For an easier way to send and receive credentials over
 * stream-oriented UNIX sockets, see
 * g_unix_connection_send_credentials() and
 * g_unix_connection_receive_credentials(). To receive credentials of
 * a foreign process connected to a socket, use
 * g_socket_get_credentials().
 * <p>
 * Since GLib 2.72, <code>#GUnixCredentialMessage</code> is available on all platforms. It
 * requires underlying system support (such as Windows 10 with <code>AF_UNIX</code>) at run
 * time.
 * <p>
 * Before GLib 2.72, <code>&<code>#60</code> gio/gunixcredentialsmessage.h&<code>#62</code> </code> belonged to the UNIX-specific
 * GIO interfaces, thus you had to use the <code>gio-unix-2.0.pc</code> pkg-config file
 * when using it. This is no longer necessary since GLib 2.72.
 */
public class UnixCredentialsMessage extends SocketControlMessage {

    public UnixCredentialsMessage(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to UnixCredentialsMessage */
    public static UnixCredentialsMessage castFrom(org.gtk.gobject.Object gobject) {
        return new UnixCredentialsMessage(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.g_unix_credentials_message_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link org.gtk.gio.UnixCredentialsMessage} with credentials matching the current processes.
     */
    public UnixCredentialsMessage() {
        super(constructNew());
    }
    
    private static Reference constructNewWithCredentials(Credentials credentials) {
        Reference RESULT = References.get(gtk_h.g_unix_credentials_message_new_with_credentials(credentials.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link org.gtk.gio.UnixCredentialsMessage} holding @credentials.
     */
    public static UnixCredentialsMessage newWithCredentials(Credentials credentials) {
        return new UnixCredentialsMessage(constructNewWithCredentials(credentials));
    }
    
    /**
     * Gets the credentials stored in @message.
     */
    public Credentials getCredentials() {
        var RESULT = gtk_h.g_unix_credentials_message_get_credentials(handle());
        return new Credentials(References.get(RESULT, false));
    }
    
    /**
     * Checks if passing {@link org.gtk.gio.Credentials} on a {@link org.gtk.gio.Socket} is supported on this platform.
     */
    public static boolean isSupported() {
        var RESULT = gtk_h.g_unix_credentials_message_is_supported();
        return (RESULT != 0);
    }
    
}
