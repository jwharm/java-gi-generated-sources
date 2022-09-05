package org.gtk.gobject;

@FunctionalInterface
public interface ObjectFinalizeFunc {

    /**
     * The type of the @finalize function of #GObjectClass.
     */
    public void onObjectFinalizeFunc(Object object);
}
