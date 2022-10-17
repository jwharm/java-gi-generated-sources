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
 */
public interface Swipeable extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle adw_swipeable_get_cancel_progress = Interop.downcallHandle(
        "adw_swipeable_get_cancel_progress",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the progress {@code self} will snap back to after the gesture is canceled.
     */
    default double getCancelProgress() {
        double RESULT;
        try {
            RESULT = (double) adw_swipeable_get_cancel_progress.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    @ApiStatus.Internal static final MethodHandle adw_swipeable_get_distance = Interop.downcallHandle(
        "adw_swipeable_get_distance",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the swipe distance of {@code self}.
     * <p>
     * This corresponds to how many pixels 1 unit represents.
     */
    default double getDistance() {
        double RESULT;
        try {
            RESULT = (double) adw_swipeable_get_distance.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    @ApiStatus.Internal static final MethodHandle adw_swipeable_get_progress = Interop.downcallHandle(
        "adw_swipeable_get_progress",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current progress of {@code self}.
     */
    default double getProgress() {
        double RESULT;
        try {
            RESULT = (double) adw_swipeable_get_progress.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    @ApiStatus.Internal static final MethodHandle adw_swipeable_get_snap_points = Interop.downcallHandle(
        "adw_swipeable_get_snap_points",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the snap points of {@code self}.
     * <p>
     * Each snap point represents a progress value that is considered acceptable to
     * end the swipe on.
     */
    default double[] getSnapPoints(@NotNull Out<Integer> nSnapPoints) {
        MemorySegment nSnapPointsPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_swipeable_get_snap_points.invokeExact(handle(), (Addressable) nSnapPointsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nSnapPoints.set(nSnapPointsPOINTER.get(ValueLayout.JAVA_INT, 0));
        return MemorySegment.ofAddress(RESULT.get(ValueLayout.ADDRESS, 0), nSnapPoints.get().intValue() * ValueLayout.JAVA_DOUBLE.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_DOUBLE);
    }
    
    @ApiStatus.Internal static final MethodHandle adw_swipeable_get_swipe_area = Interop.downcallHandle(
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
    default @NotNull void getSwipeArea(@NotNull NavigationDirection navigationDirection, @NotNull boolean isDrag, @NotNull Out<org.gtk.gdk.Rectangle> rect) {
        MemorySegment rectPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            adw_swipeable_get_swipe_area.invokeExact(handle(), navigationDirection.getValue(), isDrag ? 1 : 0, (Addressable) rectPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        rect.set(new org.gtk.gdk.Rectangle(Refcounted.get(rectPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    class SwipeableImpl extends org.gtk.gobject.Object implements Swipeable {
        public SwipeableImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
