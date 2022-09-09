package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * This #GSocketControlMessage contains a #GCredentials instance.  It
 * may be sent using g_socket_send_message() and received using
 * g_socket_receive_message() over UNIX sockets (ie: sockets in the
 * %G_SOCKET_FAMILY_UNIX family).
 * 
 * For an easier way to send and receive credentials over
 * stream-oriented UNIX sockets, see
 * g_unix_connection_send_credentials() and
 * g_unix_connection_receive_credentials(). To receive credentials of
 * a foreign process connected to a socket, use
 * g_socket_get_credentials().
 * 
 * Since GLib 2.72, #GUnixCredentialMessage is available on all platforms. It
 * requires underlying system support (such as Windows 10 with `AF_UNIX`) at run
 * time.
 * 
 * Before GLib 2.72, `<gio/gunixcredentialsmessage.h>` belonged to the UNIX-specific
 * GIO interfaces, thus you had to use the `gio-unix-2.0.pc` pkg-config file
 * when using it. This is no longer necessary since GLib 2.72.
 */
public class UnixCredentialsMessage extends SocketControlMessage {

    public UnixCredentialsMessage(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to UnixCredentialsMessage */
    public static UnixCredentialsMessage castFrom(org.gtk.gobject.Object gobject) {
        return new UnixCredentialsMessage(gobject.getReference());
    }
    
    /**
     * Creates a new #GUnixCredentialsMessage with credentials matching the current processes.
     */
    public UnixCredentialsMessage() {
        super(References.get(gtk_h.g_unix_credentials_message_new(), true));
    }
    
    /**
     * Creates a new #GUnixCredentialsMessage holding @credentials.
     */
    public static UnixCredentialsMessage newWithCredentials(Credentials credentials) {
        return new UnixCredentialsMessage(References.get(gtk_h.g_unix_credentials_message_new_with_credentials(credentials.handle()), true));
    }
    
    /**
     * Gets the credentials stored in @message.
     */
    public Credentials getCredentials() {
        var RESULT = gtk_h.g_unix_credentials_message_get_credentials(handle());
        return new Credentials(References.get(RESULT, false));
    }
    
}
