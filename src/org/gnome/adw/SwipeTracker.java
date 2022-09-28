package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A swipe tracker used in {@code Leaflet}.
 * <p>
 * The {@code AdwSwipeTracker} object can be used for implementing widgets with swipe
 * gestures. It supports touch-based swipes, pointer dragging, and touchpad
 * scrolling.
 * <p>
 * The widgets will probably want to expose the {@code SwipeTracker:enabled}
 * property. If they expect to use horizontal orientation,
 * {@code SwipeTracker:reversed} can be used for supporting RTL text
 * direction.
 */
public class SwipeTracker extends org.gtk.gobject.Object implements org.gtk.gtk.Orientable {

    public SwipeTracker(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SwipeTracker */
    public static SwipeTracker castFrom(org.gtk.gobject.Object gobject) {
        return new SwipeTracker(gobject.getReference());
    }
    
    private static Reference constructNew(Swipeable swipeable) {
        Reference RESULT = References.get(gtk_h.adw_swipe_tracker_new(swipeable.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwSwipeTracker} for {@code widget}.
     */
    public SwipeTracker(Swipeable swipeable) {
        super(constructNew(swipeable));
    }
    
    /**
     * Gets whether to allow swiping for more than one snap point at a time.
     */
    public boolean getAllowLongSwipes() {
        var RESULT = gtk_h.adw_swipe_tracker_get_allow_long_swipes(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} can be dragged with mouse pointer.
     */
    public boolean getAllowMouseDrag() {
        var RESULT = gtk_h.adw_swipe_tracker_get_allow_mouse_drag(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} is enabled.
     */
    public boolean getEnabled() {
        var RESULT = gtk_h.adw_swipe_tracker_get_enabled(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} is reversing the swipe direction.
     */
    public boolean getReversed() {
        var RESULT = gtk_h.adw_swipe_tracker_get_reversed(handle());
        return RESULT != 0;
    }
    
    /**
     * Get the widget {@code self} is attached to.
     */
    public Swipeable getSwipeable() {
        var RESULT = gtk_h.adw_swipe_tracker_get_swipeable(handle());
        return new Swipeable.SwipeableImpl(References.get(RESULT, false));
    }
    
    /**
     * Sets whether to allow swiping for more than one snap point at a time.
     */
    public void setAllowLongSwipes(boolean allowLongSwipes) {
        gtk_h.adw_swipe_tracker_set_allow_long_swipes(handle(), allowLongSwipes ? 1 : 0);
    }
    
    /**
     * Sets whether {@code self} can be dragged with mouse pointer.
     */
    public void setAllowMouseDrag(boolean allowMouseDrag) {
        gtk_h.adw_swipe_tracker_set_allow_mouse_drag(handle(), allowMouseDrag ? 1 : 0);
    }
    
    /**
     * Sets whether {@code self} is enabled.
     */
    public void setEnabled(boolean enabled) {
        gtk_h.adw_swipe_tracker_set_enabled(handle(), enabled ? 1 : 0);
    }
    
    /**
     * Sets whether to reverse the swipe direction.
     */
    public void setReversed(boolean reversed) {
        gtk_h.adw_swipe_tracker_set_reversed(handle(), reversed ? 1 : 0);
    }
    
    /**
     * Moves the current progress value by {@code delta}.
     * <p>
     * This can be used to adjust the current position if snap points move during
     * the gesture.
     */
    public void shiftPosition(double delta) {
        gtk_h.adw_swipe_tracker_shift_position(handle(), delta);
    }
    
    @FunctionalInterface
    public interface BeginSwipeHandler {
        void signalReceived(SwipeTracker source);
    }
    
    /**
     * This signal is emitted right before a swipe will be started, after the
     * drag threshold has been passed.
     */
    public SignalHandle onBeginSwipe(BeginSwipeHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("begin-swipe").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SwipeTracker.Callbacks.class, "signalSwipeTrackerBeginSwipe",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface EndSwipeHandler {
        void signalReceived(SwipeTracker source, double velocity, double to);
    }
    
    /**
     * This signal is emitted as soon as the gesture has stopped.
     * <p>
     * The user is expected to animate the deceleration from the current progress
     * value to {@code to} with an animation using {@code velocity} as the initial velocity,
     * provided in pixels per second. {@link SpringAnimation} is usually a good
     * fit for this.
     */
    public SignalHandle onEndSwipe(EndSwipeHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("end-swipe").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SwipeTracker.Callbacks.class, "signalSwipeTrackerEndSwipe",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PrepareHandler {
        void signalReceived(SwipeTracker source, NavigationDirection direction);
    }
    
    /**
     * This signal is emitted when a possible swipe is detected.
     * <p>
     * The {@code direction} value can be used to restrict the swipe to a certain
     * direction.
     */
    public SignalHandle onPrepare(PrepareHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("prepare").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SwipeTracker.Callbacks.class, "signalSwipeTrackerPrepare",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface UpdateSwipeHandler {
        void signalReceived(SwipeTracker source, double progress);
    }
    
    /**
     * This signal is emitted every time the progress value changes.
     */
    public SignalHandle onUpdateSwipe(UpdateSwipeHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("update-swipe").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SwipeTracker.Callbacks.class, "signalSwipeTrackerUpdateSwipe",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalSwipeTrackerBeginSwipe(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SwipeTracker.BeginSwipeHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SwipeTracker(References.get(source)));
        }
        
        public static void signalSwipeTrackerEndSwipe(MemoryAddress source, double velocity, double to, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SwipeTracker.EndSwipeHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SwipeTracker(References.get(source)), velocity, to);
        }
        
        public static void signalSwipeTrackerPrepare(MemoryAddress source, int direction, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SwipeTracker.PrepareHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SwipeTracker(References.get(source)), new NavigationDirection(direction));
        }
        
        public static void signalSwipeTrackerUpdateSwipe(MemoryAddress source, double progress, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SwipeTracker.UpdateSwipeHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SwipeTracker(References.get(source)), progress);
        }
        
    }
}
