package org.gtk.glib;

/**
 * Specifies the type of functions passed to g_list_foreach() and
 * g_slist_foreach().
 */
@FunctionalInterface
public interface Func {
        void onFunc();
}
