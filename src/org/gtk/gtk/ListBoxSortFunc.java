package org.gtk.gtk;

@FunctionalInterface
public interface ListBoxSortFunc {

    /**
     * Compare two rows to determine which should be first.
     */
    public int onListBoxSortFunc(ListBoxRow row1, ListBoxRow row2, jdk.incubator.foreign.MemoryAddress userData);
}
