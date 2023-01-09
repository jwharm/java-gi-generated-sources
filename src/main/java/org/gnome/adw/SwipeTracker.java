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
public class SwipeTracker extends org.gtk.gobject.GObject implements org.gtk.gtk.Orientable {
    
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
     */
    protected SwipeTracker(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SwipeTracker> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SwipeTracker(input);
    
    private static MemoryAddress constructNew(org.gnome.adw.Swipeable swipeable) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_swipe_tracker_new.invokeExact(swipeable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwSwipeTracker} for {@code widget}.
     * @param swipeable a widget to add the tracker on
     */
    public SwipeTracker(org.gnome.adw.Swipeable swipeable) {
        super(constructNew(swipeable));
        this.takeOwnership();
    }
    
    /**
     * Gets whether to allow swiping for more than one snap point at a time.
     * @return whether long swipes are allowed
     */
    public boolean getAllowLongSwipes() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_swipe_tracker_get_allow_long_swipes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets whether {@code self} can be dragged with mouse pointer.
     * @return whether mouse dragging is allowed
     */
    public boolean getAllowMouseDrag() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_swipe_tracker_get_allow_mouse_drag.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets whether {@code self} is enabled.
     * @return whether {@code self} is enabled
     */
    public boolean getEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_swipe_tracker_get_enabled.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets whether {@code self} is reversing the swipe direction.
     * @return whether the direction is reversed
     */
    public boolean getReversed() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_swipe_tracker_get_reversed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the widget {@code self} is attached to.
     * @return the swipeable widget
     */
    public org.gnome.adw.Swipeable getSwipeable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_swipe_tracker_get_swipeable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gnome.adw.Swipeable) Interop.register(RESULT, org.gnome.adw.Swipeable.fromAddress).marshal(RESULT, null);
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
                    Marshal.booleanToInteger.marshal(allowLongSwipes, null).intValue());
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
                    Marshal.booleanToInteger.marshal(allowMouseDrag, null).intValue());
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
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
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
                    Marshal.booleanToInteger.marshal(reversed, null).intValue());
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_swipe_tracker_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code BeginSwipe} callback.
     */
    @FunctionalInterface
    public interface BeginSwipe {
    
        /**
         * This signal is emitted right before a swipe will be started, after the
         * drag threshold has been passed.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSwipeTracker) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), BeginSwipe.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * This signal is emitted right before a swipe will be started, after the
     * drag threshold has been passed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SwipeTracker.BeginSwipe> onBeginSwipe(SwipeTracker.BeginSwipe handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("begin-swipe", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code EndSwipe} callback.
     */
    @FunctionalInterface
    public interface EndSwipe {
    
        /**
         * This signal is emitted as soon as the gesture has stopped.
         * <p>
         * The user is expected to animate the deceleration from the current progress
         * value to {@code to} with an animation using {@code velocity} as the initial velocity,
         * provided in pixels per second. {@link SpringAnimation} is usually a good
         * fit for this.
         */
        void run(double velocity, double to);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSwipeTracker, double velocity, double to) {
            run(velocity, to);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EndSwipe.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("end-swipe", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Prepare} callback.
     */
    @FunctionalInterface
    public interface Prepare {
    
        /**
         * This signal is emitted when a possible swipe is detected.
         * <p>
         * The {@code direction} value can be used to restrict the swipe to a certain
         * direction.
         */
        void run(org.gnome.adw.NavigationDirection direction);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSwipeTracker, int direction) {
            run(org.gnome.adw.NavigationDirection.of(direction));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Prepare.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("prepare", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code UpdateSwipe} callback.
     */
    @FunctionalInterface
    public interface UpdateSwipe {
    
        /**
         * This signal is emitted every time the progress value changes.
         */
        void run(double progress);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceSwipeTracker, double progress) {
            run(progress);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UpdateSwipe.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * This signal is emitted every time the progress value changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<SwipeTracker.UpdateSwipe> onUpdateSwipe(SwipeTracker.UpdateSwipe handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("update-swipe", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link SwipeTracker.Builder} object constructs a {@link SwipeTracker} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SwipeTracker.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link SwipeTracker} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SwipeTracker}.
         * @return A new instance of {@code SwipeTracker} with the properties 
         *         that were set in the Builder object.
         */
        public SwipeTracker build() {
            return (SwipeTracker) org.gtk.gobject.GObject.newWithProperties(
                SwipeTracker.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether to allow swiping for more than one snap point at a time.
         * <p>
         * If the value is {@code FALSE}, each swipe can only move to the adjacent snap
         * points.
         * @param allowLongSwipes The value for the {@code allow-long-swipes} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAllowLongSwipes(boolean allowLongSwipes) {
            names.add("allow-long-swipes");
            values.add(org.gtk.gobject.Value.create(allowLongSwipes));
            return this;
        }
        
        /**
         * Whether to allow dragging with mouse pointer.
         * @param allowMouseDrag The value for the {@code allow-mouse-drag} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAllowMouseDrag(boolean allowMouseDrag) {
            names.add("allow-mouse-drag");
            values.add(org.gtk.gobject.Value.create(allowMouseDrag));
            return this;
        }
        
        /**
         * Whether the swipe tracker is enabled.
         * <p>
         * When it's not enabled, no events will be processed. Usually widgets will
         * want to expose this via a property.
         * @param enabled The value for the {@code enabled} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEnabled(boolean enabled) {
            names.add("enabled");
            values.add(org.gtk.gobject.Value.create(enabled));
            return this;
        }
        
        /**
         * Whether to reverse the swipe direction.
         * <p>
         * If the swipe tracker is horizontal, it can be used for supporting RTL text
         * direction.
         * @param reversed The value for the {@code reversed} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setReversed(boolean reversed) {
            names.add("reversed");
            values.add(org.gtk.gobject.Value.create(reversed));
            return this;
        }
        
        /**
         * The widget the swipe tracker is attached to.
         * @param swipeable The value for the {@code swipeable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSwipeable(org.gnome.adw.Swipeable swipeable) {
            names.add("swipeable");
            values.add(org.gtk.gobject.Value.create(swipeable));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_swipe_tracker_new = Interop.downcallHandle(
                "adw_swipe_tracker_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_swipe_tracker_get_allow_long_swipes = Interop.downcallHandle(
                "adw_swipe_tracker_get_allow_long_swipes",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_swipe_tracker_get_allow_mouse_drag = Interop.downcallHandle(
                "adw_swipe_tracker_get_allow_mouse_drag",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_swipe_tracker_get_enabled = Interop.downcallHandle(
                "adw_swipe_tracker_get_enabled",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_swipe_tracker_get_reversed = Interop.downcallHandle(
                "adw_swipe_tracker_get_reversed",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_swipe_tracker_get_swipeable = Interop.downcallHandle(
                "adw_swipe_tracker_get_swipeable",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_swipe_tracker_set_allow_long_swipes = Interop.downcallHandle(
                "adw_swipe_tracker_set_allow_long_swipes",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle adw_swipe_tracker_set_allow_mouse_drag = Interop.downcallHandle(
                "adw_swipe_tracker_set_allow_mouse_drag",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle adw_swipe_tracker_set_enabled = Interop.downcallHandle(
                "adw_swipe_tracker_set_enabled",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle adw_swipe_tracker_set_reversed = Interop.downcallHandle(
                "adw_swipe_tracker_set_reversed",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle adw_swipe_tracker_shift_position = Interop.downcallHandle(
                "adw_swipe_tracker_shift_position",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle adw_swipe_tracker_get_type = Interop.downcallHandle(
                "adw_swipe_tracker_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.adw_swipe_tracker_get_type != null;
    }
}
