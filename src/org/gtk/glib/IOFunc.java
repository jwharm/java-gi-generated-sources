package org.gtk.glib;

/**
 * Specifies the type of function passed to g_io_add_watch() or
 * g_io_add_watch_full(), which is called when the requested condition
 * on a #GIOChannel is satisfied.
 */
@FunctionalInterface
public interface IOFunc {
        boolean onIOFunc(IOChannel source, int condition);
}
