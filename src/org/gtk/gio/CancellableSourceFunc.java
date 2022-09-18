package org.gtk.gio;

/**
 * This is the function type of the callback used for the {@link org.gtk.glib.Source} returned by g_cancellable_source_new().
 */
@FunctionalInterface
public interface CancellableSourceFunc {
        boolean onCancellableSourceFunc(Cancellable cancellable);
}
