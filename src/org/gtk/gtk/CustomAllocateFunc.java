package org.gtk.gtk;

/**
 * A function to be used by {@code GtkCustomLayout} to allocate a widget.
 */
@FunctionalInterface
public interface CustomAllocateFunc {
        void onCustomAllocateFunc(Widget widget, int width, int height, int baseline);
}
