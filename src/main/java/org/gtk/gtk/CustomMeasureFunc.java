package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function to be used by {@code GtkCustomLayout} to measure a widget.
 */
@FunctionalInterface
public interface CustomMeasureFunc {
        void onCustomMeasureFunc(@NotNull org.gtk.gtk.Widget widget, @NotNull org.gtk.gtk.Orientation orientation, int forSize, Out<Integer> minimum, Out<Integer> natural, Out<Integer> minimumBaseline, Out<Integer> naturalBaseline);
}
