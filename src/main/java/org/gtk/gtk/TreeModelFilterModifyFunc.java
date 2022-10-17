package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A function which calculates display values from raw values in the model.
 * It must fill {@code value} with the display value for the column {@code column} in the
 * row indicated by {@code iter}.
 * <p>
 * Since this function is called for each data access, it’s not a
 * particularly efficient operation.
 */
@FunctionalInterface
public interface TreeModelFilterModifyFunc {
        void onTreeModelFilterModifyFunc(@NotNull TreeModel model, @NotNull TreeIter iter, @NotNull Out<org.gtk.gobject.Value> value, @NotNull int column);
}
