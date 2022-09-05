package org.gtk.glib;

@FunctionalInterface
public interface UnixFDSourceFunc {

    /**
     * The type of functions to be called when a UNIX fd watch source
     * triggers.
     */
    public boolean onUnixFDSourceFunc(int fd, int condition, jdk.incubator.foreign.MemoryAddress userData);
}
