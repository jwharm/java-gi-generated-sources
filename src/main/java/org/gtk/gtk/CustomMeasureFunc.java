package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A function to be used by {@code GtkCustomLayout} to measure a widget.
 */
@FunctionalInterface
public interface CustomMeasureFunc {
        void onCustomMeasureFunc(@NotNull Widget widget, @NotNull Orientation orientation, @NotNull int forSize, @NotNull Out<Integer> minimum, @NotNull Out<Integer> natural, @NotNull Out<Integer> minimumBaseline, @NotNull Out<Integer> naturalBaseline);
}
