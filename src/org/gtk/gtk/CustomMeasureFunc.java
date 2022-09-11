package org.gtk.gtk;

@FunctionalInterface
public interface CustomMeasureFunc {

        void onCustomMeasureFunc(Widget widget, Orientation orientation, int forSize, int minimum, int natural, int minimumBaseline);
}
