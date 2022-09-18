package org.gtk.gtk;

/**
 * Whenever @row changes or which row is before @row changes this
 * is called, which lets you update the header on @row.
 * 
 * You may remove or set a new one via {@link org.gtk.gtk.ListBoxRow<code>#setHeader</code> 
 * or just change the state of the current header widget.
 */
@FunctionalInterface
public interface ListBoxUpdateHeaderFunc {
        void onListBoxUpdateHeaderFunc(ListBoxRow row, ListBoxRow before);
}
