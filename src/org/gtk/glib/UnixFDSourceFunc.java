package org.gtk.glib;

/**
 * The type of functions to be called when a UNIX fd watch source
 * triggers.
 */
@FunctionalInterface
public interface UnixFDSourceFunc {
        boolean onUnixFDSourceFunc(int fd, int condition);
}
