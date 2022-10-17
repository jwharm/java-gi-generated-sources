package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A function to be used by {@code GtkCustomLayout} to allocate a widget.
 */
@FunctionalInterface
public interface CustomAllocateFunc {
        void onCustomAllocateFunc(@NotNull Widget widget, @NotNull int width, @NotNull int height, @NotNull int baseline);
}
