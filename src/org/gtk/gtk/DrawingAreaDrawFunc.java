package org.gtk.gtk;

@FunctionalInterface
public interface DrawingAreaDrawFunc {

        void onDrawingAreaDrawFunc(DrawingArea drawingArea, org.cairographics.Context cr, int width, int height);
}
