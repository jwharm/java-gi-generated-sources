package org.gtk.gtk;

@FunctionalInterface
public interface ListBoxFilterFunc {

    /**
     * Will be called whenever the row changes or is added and lets you control
     * if the row should be visible or not.
     */
    public boolean onListBoxFilterFunc(ListBoxRow row, jdk.incubator.foreign.MemoryAddress userData);
}
