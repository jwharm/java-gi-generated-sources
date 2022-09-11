package org.gtk.glib;

@FunctionalInterface
public interface UnixFDSourceFunc {

        void onUnixFDSourceFunc(int fd, int condition);
}
