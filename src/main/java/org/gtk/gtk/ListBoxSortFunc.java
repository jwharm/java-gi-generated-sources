package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Compare two rows to determine which should be first.
 */
@FunctionalInterface
public interface ListBoxSortFunc {
        int onListBoxSortFunc(@NotNull ListBoxRow row1, @NotNull ListBoxRow row2);
}
