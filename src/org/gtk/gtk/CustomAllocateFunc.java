package org.gtk.gtk;

@FunctionalInterface
public interface CustomAllocateFunc {

    /**
     * A function to be used by `GtkCustomLayout` to allocate a widget.
     */
    public void onCustomAllocateFunc(Widget widget, int width, int height, int baseline);
}
