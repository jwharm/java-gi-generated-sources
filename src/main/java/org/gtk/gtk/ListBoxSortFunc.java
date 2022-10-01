package org.gtk.gtk;

import io.github.jwharm.javagi.*;

/**
 * Compare two rows to determine which should be first.
 */
@FunctionalInterface
public interface ListBoxSortFunc {
        int onListBoxSortFunc(ListBoxRow row1, ListBoxRow row2);
}
