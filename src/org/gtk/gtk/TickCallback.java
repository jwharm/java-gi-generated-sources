package org.gtk.gtk;

@FunctionalInterface
public interface TickCallback {

    /**
     * Callback type for adding a function to update animations. See gtk_widget_add_tick_callback().
     */
    public boolean onTickCallback(Widget widget, org.gtk.gdk.FrameClock frameClock, jdk.incubator.foreign.MemoryAddress userData);
}
