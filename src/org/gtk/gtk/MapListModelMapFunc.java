package org.gtk.gtk;

@FunctionalInterface
public interface MapListModelMapFunc {

    /**
     * User function that is called to map an @item of the original model to
     * an item expected by the map model.
     * 
     * The returned items must conform to the item type of the model they are
     * used with.
     */
    public org.gtk.gobject.Object onMapListModelMapFunc(org.gtk.gobject.Object item, jdk.incubator.foreign.MemoryAddress userData);
}
