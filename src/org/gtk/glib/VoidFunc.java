package org.gtk.glib;

@FunctionalInterface
public interface VoidFunc {

    /**
     * Declares a type of function which takes no arguments
     * and has no return value. It is used to specify the type
     * function passed to g_atexit().
     */
    public void onVoidFunc();
}
