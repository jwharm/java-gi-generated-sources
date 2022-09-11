package org.gtk.glib;

/**
 * Specifies the type of function which is called when a data element
 * is destroyed. It is passed the pointer to the data element and
 * should free any memory and resources allocated for it.
 */
@FunctionalInterface
public interface DestroyNotify {
        void onDestroyNotify();
}
