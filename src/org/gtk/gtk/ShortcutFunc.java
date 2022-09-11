package org.gtk.gtk;

@FunctionalInterface
public interface ShortcutFunc {

        void onShortcutFunc(Widget widget, org.gtk.glib.Variant args);
}
