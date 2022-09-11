package org.gtk.gtk;

/**
 * Compare two rows to determine which should be first.
 */
@FunctionalInterface
public interface ListBoxSortFunc {
        int onListBoxSortFunc(ListBoxRow row1, ListBoxRow row2);
}
