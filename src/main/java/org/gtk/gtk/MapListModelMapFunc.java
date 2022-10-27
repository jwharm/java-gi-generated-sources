package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * User function that is called to map an {@code item} of the original model to
 * an item expected by the map model.
 * <p>
 * The returned items must conform to the item type of the model they are
 * used with.
 */
@FunctionalInterface
public interface MapListModelMapFunc {
        org.gtk.gobject.Object onMapListModelMapFunc(@NotNull org.gtk.gobject.Object item);
}
