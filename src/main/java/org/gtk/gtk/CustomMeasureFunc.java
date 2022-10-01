package org.gtk.gtk;

import io.github.jwharm.javagi.*;

/**
 * A function to be used by {@code GtkCustomLayout} to measure a widget.
 */
@FunctionalInterface
public interface CustomMeasureFunc {
        void onCustomMeasureFunc(Widget widget, Orientation orientation, int forSize, PointerInteger minimum, PointerInteger natural, PointerInteger minimumBaseline, PointerInteger naturalBaseline);
}
