package org.gtk.glib;

@FunctionalInterface
public interface FreeFunc {

    /**
     * Declares a type of function which takes an arbitrary
     * data pointer argument and has no return value. It is
     * not currently used in GLib or GTK+.
     */
    public void onFreeFunc(jdk.incubator.foreign.MemoryAddress data);
}
