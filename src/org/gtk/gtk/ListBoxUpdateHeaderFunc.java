package org.gtk.gtk;

/**
 * Whenever {@code row} changes or which row is before {@code row} changes this
 * is called, which lets you update the header on {@code row}.
 * <p>
 * You may remove or set a new one via {@link ListBoxRow#setHeader}
 * or just change the state of the current header widget.
 */
@FunctionalInterface
public interface ListBoxUpdateHeaderFunc {
        void onListBoxUpdateHeaderFunc(ListBoxRow row, ListBoxRow before);
}
