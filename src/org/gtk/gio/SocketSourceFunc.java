package org.gtk.gio;

@FunctionalInterface
public interface SocketSourceFunc {

    /**
     * This is the function type of the callback used for the #GSource
     * returned by g_socket_create_source().
     */
    public boolean onSocketSourceFunc(Socket socket, int condition, jdk.incubator.foreign.MemoryAddress userData);
}
