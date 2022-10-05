package org.gtk.gtk;

import io.github.jwharm.javagi.*;

/**
 * Whenever {@code drawing_area} needs to redraw, this function will be called.
 * <p>
 * This function should exclusively redraw the contents of the drawing area
 * and must not call any widget functions that cause changes.
 */
@FunctionalInterface
public interface DrawingAreaDrawFunc {
        void onDrawingAreaDrawFunc(DrawingArea drawingArea, org.cairographics.Context cr, int width, int height);
}