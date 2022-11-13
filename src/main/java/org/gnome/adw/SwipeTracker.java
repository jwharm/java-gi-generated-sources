package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A swipe tracker used in {@link Carousel} and {@link Leaflet}.
 * <p>
 * The {@code AdwSwipeTracker} object can be used for implementing widgets with swipe
 * gestures. It supports touch-based swipes, pointer dragging, and touchpad
 * scrolling.
 * <p>
 * The widgets will probably want to expose the {@code SwipeTracker:enabled}
 * property. If they expect to use horizontal orientation,
 * {@code SwipeTracker:reversed} can be used for supporting RTL text
 * direction.
 * @version 1.0
 */
public class SwipeTracker extends org.gtk.gobject.Object implements org.gtk.gtk.Orientable {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwSwipeTracker";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a SwipeTracker proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SwipeTracker(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to SwipeTracker if its GType is a (or inherits from) "AdwSwipeTracker".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code SwipeTracker} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwSwipeTracker", a ClassCastException will be thrown.
     */
    public static SwipeTracker castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwSwipeTracker"))) {
            return new SwipeTracker(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwSwipeTracker");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gnome.adw.Swipeable swipeable) {
        java.util.Objects.requireNonNull(swipeable, "Parameter 'swipeable' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_swipe_tracker_new.invokeExact(
                    swipeable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwSwipeTracker} for {@code widget}.
     * @param swipeable a widget to add the tracker on
     */
    public SwipeTracker(@NotNull org.gnome.adw.Swipeable swipeable) {
        super(constructNew(swipeable), Ownership.FULL);
    }
    
    /**
     * Gets whether to allow swiping for more than one snap point at a time.
     * @return whether long swipes are allowed
     */
    public boolean getAllowLongSwipes() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_swipe_tracker_get_allow_long_swipes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} can be dragged with mouse pointer.
     * @return whether mouse dragging is allowed
     */
    public boolean getAllowMouseDrag() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_swipe_tracker_get_allow_mouse_drag.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} is enabled.
     * @return whether {@code self} is enabled
     */
    public boolean getEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_swipe_tracker_get_enabled.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} is reversing the swipe direction.
     * @return whether the direction is reversed
     */
    public boolean getReversed() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_swipe_tracker_get_reversed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the widget {@code self} is attached to.
     * @return the swipeable widget
     */
    public @NotNull org.gnome.adw.Swipeable getSwipeable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_swipe_tracker_get_swipeable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.Swipeable.SwipeableImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets whether to allow swiping for more than one snap point at a time.
     * <p>
     * If the value is {@code FALSE}, each swipe can only move to the adjacent snap
     * points.
     * @param allowLongSwipes whether to allow long swipes
     */
    public void setAllowLongSwipes(boolean allowLongSwipes) {
        try {
            DowncallHandles.adw_swipe_tracker_set_allow_long_swipes.invokeExact(
                    handle(),
                    allowLongSwipes ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} can be dragged with mouse pointer.
     * @param allowMouseDrag whether to allow mouse dragging
     */
    public void setAllowMouseDrag(boolean allowMouseDrag) {
        try {
            DowncallHandles.adw_swipe_tracker_set_allow_mouse_drag.invokeExact(
                    handle(),
                    allowMouseDrag ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} is enabled.
     * <p>
     * When it's not enabled, no events will be processed. Usually widgets will want
     * to expose this via a property.
     * @param enabled whether {@code self} is enabled
     */
    public void setEnabled(boolean enabled) {
        try {
            DowncallHandles.adw_swipe_tracker_set_enabled.invokeExact(
                    handle(),
                    enabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to reverse the swipe direction.
     * <p>
     * If the swipe tracker is horizontal, it can be used for supporting RTL text
     * direction.
     * @param reversed whether to reverse the swipe direction
     */
    public void setReversed(boolean reversed) {
        try {
            DowncallHandles.adw_swipe_tracker_set_reversed.invokeExact(
                    handle(),
                    reversed ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Moves the current progress value by {@code delta}.
     * <p>
     * This can be used to adjust the current position if snap points move during
     * the gesture.
     * @param delta the position delta
     */
    public void shiftPosition(double delta) {
        try {
            DowncallHandles.adw_swipe_tracker_shift_position.invokeExact(
                    handle(),
                    delta);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface BeginSwipe {
        void signalReceived(SwipeTracker source);
    }
    
    /**
     * This signal is emitted right before a swipe will be started, after the
     * drag threshold has been passed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SwipeTracker.BeginSwipe> onBeginSwipe(SwipeTracker.BeginSwipe handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("begin-swipe"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SwipeTracker.Callbacks.class, "signalSwipeTrackerBeginSwipe",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SwipeTracker.BeginSwipe>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface EndSwipe {
        void signalReceived(SwipeTracker source, double velocity, double to);
    }
    
    /**
     * This signal is emitted as soon as the gesture has stopped.
     * <p>
     * The user is expected to animate the deceleration from the current progress
     * value to {@code to} with an animation using {@code velocity} as the initial velocity,
     * provided in pixels per second. {@link SpringAnimation} is usually a good
     * fit for this.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SwipeTracker.EndSwipe> onEndSwipe(SwipeTracker.EndSwipe handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("end-swipe"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SwipeTracker.Callbacks.class, "signalSwipeTrackerEndSwipe",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SwipeTracker.EndSwipe>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Prepare {
        void signalReceived(SwipeTracker source, @NotNull org.gnome.adw.NavigationDirection direction);
    }
    
    /**
     * This signal is emitted when a possible swipe is detected.
     * <p>
     * The {@code direction} value can be used to restrict the swipe to a certain
     * direction.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SwipeTracker.Prepare> onPrepare(SwipeTracker.Prepare handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("prepare"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SwipeTracker.Callbacks.class, "signalSwipeTrackerPrepare",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SwipeTracker.Prepare>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface UpdateSwipe {
        void signalReceived(SwipeTracker source, double progress);
    }
    
    /**
     * This signal is emitted every time the progress value changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SwipeTracker.UpdateSwipe> onUpdateSwipe(SwipeTracker.UpdateSwipe handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("update-swipe"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SwipeTracker.Callbacks.class, "signalSwipeTrackerUpdateSwipe",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SwipeTracker.UpdateSwipe>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_swipe_tracker_new = Interop.downcallHandle(
            "adw_swipe_tracker_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_swipe_tracker_get_allow_long_swipes = Interop.downcallHandle(
            "adw_swipe_tracker_get_allow_long_swipes",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_swipe_tracker_get_allow_mouse_drag = Interop.downcallHandle(
            "adw_swipe_tracker_get_allow_mouse_drag",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_swipe_tracker_get_enabled = Interop.downcallHandle(
            "adw_swipe_tracker_get_enabled",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_swipe_tracker_get_reversed = Interop.downcallHandle(
            "adw_swipe_tracker_get_reversed",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_swipe_tracker_get_swipeable = Interop.downcallHandle(
            "adw_swipe_tracker_get_swipeable",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_swipe_tracker_set_allow_long_swipes = Interop.downcallHandle(
            "adw_swipe_tracker_set_allow_long_swipes",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_swipe_tracker_set_allow_mouse_drag = Interop.downcallHandle(
            "adw_swipe_tracker_set_allow_mouse_drag",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_swipe_tracker_set_enabled = Interop.downcallHandle(
            "adw_swipe_tracker_set_enabled",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_swipe_tracker_set_reversed = Interop.downcallHandle(
            "adw_swipe_tracker_set_reversed",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_swipe_tracker_shift_position = Interop.downcallHandle(
            "adw_swipe_tracker_shift_position",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalSwipeTrackerBeginSwipe(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SwipeTracker.BeginSwipe) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SwipeTracker(source, Ownership.UNKNOWN));
        }
        
        public static void signalSwipeTrackerEndSwipe(MemoryAddress source, double velocity, double to, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SwipeTracker.EndSwipe) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SwipeTracker(source, Ownership.UNKNOWN), velocity, to);
        }
        
        public static void signalSwipeTrackerPrepare(MemoryAddress source, int direction, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SwipeTracker.Prepare) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SwipeTracker(source, Ownership.UNKNOWN), new org.gnome.adw.NavigationDirection(direction));
        }
        
        public static void signalSwipeTrackerUpdateSwipe(MemoryAddress source, double progress, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SwipeTracker.UpdateSwipe) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SwipeTracker(source, Ownership.UNKNOWN), progress);
        }
    }
}
