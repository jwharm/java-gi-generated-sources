package org.gtk.gobject;

/**
 * The type of the @finalize function of {@link org.gtk.gobject.ObjectClass}
 */
@FunctionalInterface
public interface ObjectFinalizeFunc {
        void onObjectFinalizeFunc(Object object);
}
