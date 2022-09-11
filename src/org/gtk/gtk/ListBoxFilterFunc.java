package org.gtk.gtk;

@FunctionalInterface
public interface ListBoxFilterFunc {

        void onListBoxFilterFunc(ListBoxRow row);
}
