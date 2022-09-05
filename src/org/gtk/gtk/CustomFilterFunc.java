package org.gtk.gtk;

@FunctionalInterface
public interface CustomFilterFunc {

    /**
     * User function that is called to determine if the @item should be matched.
     * 
     * If the filter matches the item, this function must return %TRUE. If the
     * item should be filtered out, %FALSE must be returned.
     */
    public boolean onCustomFilterFunc(org.gtk.gobject.Object item, jdk.incubator.foreign.MemoryAddress userData);
}
