package org.gtk.gio;

/**
 * This is the function type of the callback used for the {@link org.gtk.glib.Source}
 * returned by g_socket_create_source().
 */
@FunctionalInterface
public interface SocketSourceFunc {
        boolean onSocketSourceFunc(Socket socket, int condition);
}
