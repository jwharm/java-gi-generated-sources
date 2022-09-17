package org.gtk.gtk;

/**
 * A function to be used by <code>GtkCustomLayout</code> to measure a widget.
 */
@FunctionalInterface
public interface CustomMeasureFunc {
        void onCustomMeasureFunc(Widget widget, Orientation orientation, int forSize, int minimum, int natural, int minimumBaseline, int naturalBaseline);
}
