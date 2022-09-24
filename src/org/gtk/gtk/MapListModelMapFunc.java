package org.gtk.gtk;

import io.github.jwharm.javagi.*;

/**
 * User function that is called to map an {@code item} of the original model to
 * an item expected by the map model.
 * <p>
 * The returned items must conform to the item type of the model they are
 * used with.
 */
@FunctionalInterface
public interface MapListModelMapFunc {
        org.gtk.gobject.Object onMapListModelMapFunc(org.gtk.gobject.Object item);
}
