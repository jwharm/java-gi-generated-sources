package org.gtk.gtk;

import io.github.jwharm.javagi.*;

/**
 * A function to be used by {@code GtkCustomLayout} to allocate a widget.
 */
@FunctionalInterface
public interface CustomAllocateFunc {
        void onCustomAllocateFunc(Widget widget, int width, int height, int baseline);
}
