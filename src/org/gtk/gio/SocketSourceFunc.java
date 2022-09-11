package org.gtk.gio;

@FunctionalInterface
public interface SocketSourceFunc {

        void onSocketSourceFunc(Socket socket, int condition);
}
