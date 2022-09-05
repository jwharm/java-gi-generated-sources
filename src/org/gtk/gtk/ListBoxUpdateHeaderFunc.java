package org.gtk.gtk;

@FunctionalInterface
public interface ListBoxUpdateHeaderFunc {

    /**
     * Whenever @row changes or which row is before @row changes this
     * is called, which lets you update the header on @row.
     * 
     * You may remove or set a new one via [method@Gtk.ListBoxRow.set_header]
     * or just change the state of the current header widget.
     */
    public void onListBoxUpdateHeaderFunc(ListBoxRow row, ListBoxRow before, jdk.incubator.foreign.MemoryAddress userData);
}
