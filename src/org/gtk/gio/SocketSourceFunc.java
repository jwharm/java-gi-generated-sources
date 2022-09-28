package org.gtk.gio;

import io.github.jwharm.javagi.*;

/**
 * This is the function type of the callback used for the {@link org.gtk.glib.Source}
 * returned by g_socket_create_source().
 */
@FunctionalInterface
public interface SocketSourceFunc {
        boolean onSocketSourceFunc(Socket socket, org.gtk.glib.IOCondition condition);
}
