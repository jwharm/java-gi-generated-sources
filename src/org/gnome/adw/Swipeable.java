package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An interface for swipeable widgets.
 * <p>
 * The {@code AdwSwipeable} interface is implemented by all swipeable widgets.
 * <p>
 * See {@link SwipeTracker} for details about implementing it.
 */
public interface Swipeable extends io.github.jwharm.javagi.Proxy {

    /**
     * Gets the progress {@code self} will snap back to after the gesture is canceled.
     */
    public default double getCancelProgress() {
        var RESULT = gtk_h.adw_swipeable_get_cancel_progress(handle());
        return RESULT;
    }
    
    /**
     * Gets the swipe distance of {@code self}.
     * <p>
     * This corresponds to how many pixels 1 unit represents.
     */
    public default double getDistance() {
        var RESULT = gtk_h.adw_swipeable_get_distance(handle());
        return RESULT;
    }
    
    /**
     * Gets the current progress of {@code self}.
     */
    public default double getProgress() {
        var RESULT = gtk_h.adw_swipeable_get_progress(handle());
        return RESULT;
    }
    
    /**
     * Gets the snap points of {@code self}.
     * <p>
     * Each snap point represents a progress value that is considered acceptable to
     * end the swipe on.
     */
    public default PointerIterator<Double> getSnapPoints(PointerInteger nSnapPoints) {
        var RESULT = gtk_h.adw_swipeable_get_snap_points(handle(), nSnapPoints.handle());
        return new PointerDouble(RESULT).iterator();
    }
    
    /**
     * Gets the area {@code self} can start a swipe from for the given direction and
     * gesture type.
     * <p>
     * This can be used to restrict swipes to only be possible from a certain area,
     * for example, to only allow edge swipes, or to have a draggable element and
     * ignore swipes elsewhere.
     * <p>
     * If not implemented, the default implementation returns the allocation of
     * {@code self}, allowing swipes from anywhere.
     */
    public default void getSwipeArea(NavigationDirection navigationDirection, boolean isDrag, org.gtk.gdk.Rectangle rect) {
        gtk_h.adw_swipeable_get_swipe_area(handle(), navigationDirection.getValue(), isDrag ? 1 : 0, rect.handle());
    }
    
    class SwipeableImpl extends org.gtk.gobject.Object implements Swipeable {
        public SwipeableImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
