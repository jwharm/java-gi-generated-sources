package org.gtk.gobject;

/**
 * The type of the {@code finalize} function of {@link ObjectClass}.
 */
@FunctionalInterface
public interface ObjectFinalizeFunc {
        void onObjectFinalizeFunc(Object object);
}
