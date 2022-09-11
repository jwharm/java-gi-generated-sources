package org.gtk.gtk;

@FunctionalInterface
public interface ListBoxSortFunc {

        void onListBoxSortFunc(ListBoxRow row1, ListBoxRow row2);
}
