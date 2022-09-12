package org.gtk.gobject;

/**
 * The type of the @finalize function of #GObjectClass.
 */
@FunctionalInterface
public interface ObjectFinalizeFunc {
        void onObjectFinalizeFunc(Object object);
}
