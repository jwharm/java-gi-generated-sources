package org.gtk.gtk;

@FunctionalInterface
public interface ShortcutFunc {

    /**
     * Prototype for shortcuts based on user callbacks.
     */
    public boolean onShortcutFunc(Widget widget, org.gtk.glib.Variant args, jdk.incubator.foreign.MemoryAddress userData);
}
