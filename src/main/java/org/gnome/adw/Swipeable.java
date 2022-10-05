package org.gnome.adw;

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

    static final MethodHandle adw_swipeable_get_cancel_progress = Interop.downcallHandle(
        "adw_swipeable_get_cancel_progress",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the progress {@code self} will snap back to after the gesture is canceled.
     */
    public default double getCancelProgress() {
        try {
            var RESULT = (double) adw_swipeable_get_cancel_progress.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_swipeable_get_distance = Interop.downcallHandle(
        "adw_swipeable_get_distance",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the swipe distance of {@code self}.
     * <p>
     * This corresponds to how many pixels 1 unit represents.
     */
    public default double getDistance() {
        try {
            var RESULT = (double) adw_swipeable_get_distance.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_swipeable_get_progress = Interop.downcallHandle(
        "adw_swipeable_get_progress",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current progress of {@code self}.
     */
    public default double getProgress() {
        try {
            var RESULT = (double) adw_swipeable_get_progress.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_swipeable_get_snap_points = Interop.downcallHandle(
        "adw_swipeable_get_snap_points",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the snap points of {@code self}.
     * <p>
     * Each snap point represents a progress value that is considered acceptable to
     * end the swipe on.
     */
    public default PointerIterator<Double> getSnapPoints(PointerInteger nSnapPoints) {
        try {
            var RESULT = (MemoryAddress) adw_swipeable_get_snap_points.invokeExact(handle(), nSnapPoints.handle());
            return new PointerDouble(RESULT).iterator();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_swipeable_get_swipe_area = Interop.downcallHandle(
        "adw_swipeable_get_swipe_area",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
        try {
            adw_swipeable_get_swipe_area.invokeExact(handle(), navigationDirection.getValue(), isDrag ? 1 : 0, rect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    class SwipeableImpl extends org.gtk.gobject.Object implements Swipeable {
        public SwipeableImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
