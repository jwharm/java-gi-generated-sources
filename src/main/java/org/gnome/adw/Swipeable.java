package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An interface for swipeable widgets.
 * <p>
 * The {@code AdwSwipeable} interface is implemented by all swipeable widgets.
 * <p>
 * See {@link SwipeTracker} for details about implementing it.
 * @version 1.0
 */
public interface Swipeable extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Gets the progress {@code self} will snap back to after the gesture is canceled.
     * @return the cancel progress, unitless
     */
    default double getCancelProgress() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_swipeable_get_cancel_progress.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the swipe distance of {@code self}.
     * <p>
     * This corresponds to how many pixels 1 unit represents.
     * @return the swipe distance in pixels
     */
    default double getDistance() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_swipeable_get_distance.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the current progress of {@code self}.
     * @return the current progress, unitless
     */
    default double getProgress() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_swipeable_get_progress.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the snap points of {@code self}.
     * <p>
     * Each snap point represents a progress value that is considered acceptable to
     * end the swipe on.
     * @param nSnapPoints location to return the number of the snap points
     * @return the snap points
     */
    default @NotNull double[] getSnapPoints(Out<Integer> nSnapPoints) {
        java.util.Objects.requireNonNull(nSnapPoints, "Parameter 'nSnapPoints' must not be null");
        MemorySegment nSnapPointsPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_swipeable_get_snap_points.invokeExact(handle(), (Addressable) nSnapPointsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nSnapPoints.set(nSnapPointsPOINTER.get(ValueLayout.JAVA_INT, 0));
        return MemorySegment.ofAddress(RESULT.get(ValueLayout.ADDRESS, 0), nSnapPoints.get().intValue() * ValueLayout.JAVA_DOUBLE.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_DOUBLE);
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
     * @param navigationDirection the direction of the swipe
     * @param isDrag whether the swipe is caused by a dragging gesture
     * @param rect a pointer to a rectangle to store the swipe area
     */
    default void getSwipeArea(@NotNull org.gnome.adw.NavigationDirection navigationDirection, boolean isDrag, @NotNull Out<org.gtk.gdk.Rectangle> rect) {
        java.util.Objects.requireNonNull(navigationDirection, "Parameter 'navigationDirection' must not be null");
        java.util.Objects.requireNonNull(rect, "Parameter 'rect' must not be null");
        MemorySegment rectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.adw_swipeable_get_swipe_area.invokeExact(handle(), navigationDirection.getValue(), isDrag ? 1 : 0, (Addressable) rectPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        rect.set(new org.gtk.gdk.Rectangle(Refcounted.get(rectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle adw_swipeable_get_cancel_progress = Interop.downcallHandle(
            "adw_swipeable_get_cancel_progress",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle adw_swipeable_get_distance = Interop.downcallHandle(
            "adw_swipeable_get_distance",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle adw_swipeable_get_progress = Interop.downcallHandle(
            "adw_swipeable_get_progress",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle adw_swipeable_get_snap_points = Interop.downcallHandle(
            "adw_swipeable_get_snap_points",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        @ApiStatus.Internal
        static final MethodHandle adw_swipeable_get_swipe_area = Interop.downcallHandle(
            "adw_swipeable_get_swipe_area",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
    
    class SwipeableImpl extends org.gtk.gobject.Object implements Swipeable {
        
        static {
            Adw.javagi$ensureInitialized();
        }
        
        public SwipeableImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
