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
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SwipeableImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SwipeableImpl(input, ownership);
    
    /**
     * Gets the progress {@code self} will snap back to after the gesture is canceled.
     * @return the cancel progress, unitless
     */
    default double getCancelProgress() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_swipeable_get_cancel_progress.invokeExact(
                    handle());
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
            RESULT = (double) DowncallHandles.adw_swipeable_get_distance.invokeExact(
                    handle());
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
            RESULT = (double) DowncallHandles.adw_swipeable_get_progress.invokeExact(
                    handle());
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
    default double[] getSnapPoints(Out<Integer> nSnapPoints) {
        MemorySegment nSnapPointsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_swipeable_get_snap_points.invokeExact(
                    handle(),
                    (Addressable) nSnapPointsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nSnapPoints.set(nSnapPointsPOINTER.get(Interop.valueLayout.C_INT, 0));
        return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), nSnapPoints.get().intValue() * Interop.valueLayout.C_DOUBLE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_DOUBLE);
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
    default void getSwipeArea(org.gnome.adw.NavigationDirection navigationDirection, boolean isDrag, org.gtk.gdk.Rectangle rect) {
        try {
            DowncallHandles.adw_swipeable_get_swipe_area.invokeExact(
                    handle(),
                    navigationDirection.getValue(),
                    Marshal.booleanToInteger.marshal(isDrag, null).intValue(),
                    rect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_swipeable_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle adw_swipeable_get_cancel_progress = Interop.downcallHandle(
            "adw_swipeable_get_cancel_progress",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle adw_swipeable_get_distance = Interop.downcallHandle(
            "adw_swipeable_get_distance",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle adw_swipeable_get_progress = Interop.downcallHandle(
            "adw_swipeable_get_progress",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle adw_swipeable_get_snap_points = Interop.downcallHandle(
            "adw_swipeable_get_snap_points",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle adw_swipeable_get_swipe_area = Interop.downcallHandle(
            "adw_swipeable_get_swipe_area",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle adw_swipeable_get_type = Interop.downcallHandle(
            "adw_swipeable_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class SwipeableImpl extends org.gtk.gobject.GObject implements Swipeable {
        
        static {
            Adw.javagi$ensureInitialized();
        }
        
        public SwipeableImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
