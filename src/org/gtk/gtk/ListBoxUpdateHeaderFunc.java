package org.gtk.gtk;

@FunctionalInterface
public interface ListBoxUpdateHeaderFunc {

        void onListBoxUpdateHeaderFunc(ListBoxRow row, ListBoxRow before);
}
