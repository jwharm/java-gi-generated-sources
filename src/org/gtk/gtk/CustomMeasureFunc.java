package org.gtk.gtk;

@FunctionalInterface
public interface CustomMeasureFunc {

    /**
     * A function to be used by `GtkCustomLayout` to measure a widget.
     */
    public void onCustomMeasureFunc(Widget widget, Orientation orientation, int forSize, int minimum, int natural, int minimumBaseline, int naturalBaseline);
}
