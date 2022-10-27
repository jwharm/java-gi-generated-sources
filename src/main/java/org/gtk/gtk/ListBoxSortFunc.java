package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Compare two rows to determine which should be first.
 */
@FunctionalInterface
public interface ListBoxSortFunc {
        int onListBoxSortFunc(@NotNull org.gtk.gtk.ListBoxRow row1, @NotNull org.gtk.gtk.ListBoxRow row2);
}
