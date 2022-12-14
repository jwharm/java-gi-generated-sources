package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A base class for animations.
 * <p>
 * {@code AdwAnimation} represents an animation on a widget. It has a target that
 * provides a value to animate, and a state indicating whether the
 * animation hasn't been started yet, is playing, paused or finished.
 * <p>
 * Currently there are two concrete animation types:
 * {@link TimedAnimation}.
 * <p>
 * {@code AdwAnimation} will automatically skip the animation if
 * {@code Animation:widget} is unmapped, or if
 * {@code Gtk.Settings:gtk-enable-animations} is {@code FALSE}.
 * <p>
 * The {@code Animation::done} signal can be used to perform an action after
 * the animation ends, for example hiding a widget after animating its
 * {@code Gtk.Widget:opacity} to 0.
 * <p>
 * {@code AdwAnimation} will be kept alive while the animation is playing. As such,
 * it's safe to create an animation, start it and immediately unref it:
 * A fire-and-forget animation:
 * <pre>{@code c
 * static void
 * animation_cb (double    value,
 *               MyObject *self)
 * {
 *   // Do something with @value
 * }
 * 
 * static void
 * my_object_animate (MyObject *self)
 * {
 *   AdwAnimationTarget *target =
 *     adw_callback_animation_target_new ((AdwAnimationTargetFunc) animation_cb,
 *                                        self, NULL);
 *   g_autoptr (AdwAnimation) animation =
 *     adw_timed_animation_new (widget, 0, 1, 250, target);
 * 
 *   adw_animation_play (animation);
 * }
 * }</pre>
 * <p>
 * If there's a chance the previous animation for the same target hasn't yet
 * finished, the previous animation should be stopped first, or the existing
 * {@code AdwAnimation} object can be reused.
 * @version 1.0
 */
public class Animation extends org.gtk.gobject.GObject {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwAnimation";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Animation proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Animation(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Animation> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Animation(input);
    
    /**
     * Gets the current value of {@code self}.
     * <p>
     * The state indicates whether {@code self} is currently playing, paused, finished or
     * hasn't been started yet.
     * @return the animation value
     */
    public org.gnome.adw.AnimationState getState() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_animation_get_state.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gnome.adw.AnimationState.of(RESULT);
    }
    
    /**
     * Gets the target {@code self} animates.
     * @return the animation target
     */
    public org.gnome.adw.AnimationTarget getTarget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_animation_get_target.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gnome.adw.AnimationTarget) Interop.register(RESULT, org.gnome.adw.AnimationTarget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the current value of {@code self}.
     * @return the current value
     */
    public double getValue() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_animation_get_value.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the widget {@code self} was created for.
     * <p>
     * It provides the frame clock for the animation. It's not strictly necessary
     * for this widget to be same as the one being animated.
     * <p>
     * The widget must be mapped in order for the animation to work. If it's not
     * mapped, or if it gets unmapped during an ongoing animation, the animation
     * will be automatically skipped.
     * @return the animation widget
     */
    public org.gtk.gtk.Widget getWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_animation_get_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Pauses a playing animation for {@code self}.
     * <p>
     * Does nothing if the current state of {@code self} isn't {@code ADW_ANIMATION_PLAYING}.
     * <p>
     * Sets {@code Animation:state} to {@code ADW_ANIMATION_PAUSED}.
     */
    public void pause() {
        try {
            DowncallHandles.adw_animation_pause.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Starts the animation for {@code self}.
     * <p>
     * If the animation is playing, paused or has been completed, restarts it from
     * the beginning. This allows to easily play an animation regardless of whether
     * it's already playing or not.
     * <p>
     * Sets {@code Animation:state} to {@code ADW_ANIMATION_PLAYING}.
     * <p>
     * The animation will be automatically skipped if {@code Animation:widget} is
     * unmapped, or if {@code Gtk.Settings:gtk-enable-animations} is {@code FALSE}.
     * <p>
     * As such, it's not guaranteed that the animation will actually run. For
     * example, when using {@link org.gtk.glib.GLib#idleAdd} and starting an animation
     * immediately afterwards, it's entirely possible that the idle callback will
     * run after the animation has already finished, and not while it's playing.
     */
    public void play() {
        try {
            DowncallHandles.adw_animation_play.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Resets the animation for {@code self}.
     * <p>
     * Sets {@code Animation:state} to {@code ADW_ANIMATION_IDLE}.
     */
    public void reset() {
        try {
            DowncallHandles.adw_animation_reset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Resumes a paused animation for {@code self}.
     * <p>
     * This function must only be used if the animation has been paused with
     * {@code Animation#pause}.
     * <p>
     * Sets {@code Animation:state} to {@code ADW_ANIMATION_PLAYING}.
     */
    public void resume() {
        try {
            DowncallHandles.adw_animation_resume.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the target {@code self} animates to {@code target}.
     * @param target an animation target
     */
    public void setTarget(org.gnome.adw.AnimationTarget target) {
        try {
            DowncallHandles.adw_animation_set_target.invokeExact(
                    handle(),
                    target.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Skips the animation for {@code self}.
     * <p>
     * If the animation hasn't been started yet, is playing, or is paused, instantly
     * skips the animation to the end and causes {@code Animation::done} to be
     * emitted.
     * <p>
     * Sets {@code Animation:state} to {@code ADW_ANIMATION_FINISHED}.
     */
    public void skip() {
        try {
            DowncallHandles.adw_animation_skip.invokeExact(handle());
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
            RESULT = (long) DowncallHandles.adw_animation_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Done} callback.
     */
    @FunctionalInterface
    public interface Done {
    
        /**
         * This signal is emitted when the animation has been completed, either on its
         * own or via calling {@code Animation#skip}.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceAnimation) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Done.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * This signal is emitted when the animation has been completed, either on its
     * own or via calling {@code Animation#skip}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Animation.Done> onDone(Animation.Done handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("done", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Animation.Builder} object constructs a {@link Animation} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Animation.Builder#build()}. 
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
         * Finish building the {@link Animation} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Animation}.
         * @return A new instance of {@code Animation} with the properties 
         *         that were set in the Builder object.
         */
        public Animation build() {
            return (Animation) org.gtk.gobject.GObject.newWithProperties(
                Animation.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The animation state.
         * <p>
         * The state indicates whether the animation is currently playing, paused,
         * finished or hasn't been started yet.
         * @param state The value for the {@code state} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setState(org.gnome.adw.AnimationState state) {
            names.add("state");
            values.add(org.gtk.gobject.Value.create(state));
            return this;
        }
        
        /**
         * The target to animate.
         * @param target The value for the {@code target} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTarget(org.gnome.adw.AnimationTarget target) {
            names.add("target");
            values.add(org.gtk.gobject.Value.create(target));
            return this;
        }
        
        /**
         * The current value of the animation.
         * @param value The value for the {@code value} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValue(double value) {
            names.add("value");
            values.add(org.gtk.gobject.Value.create(value));
            return this;
        }
        
        /**
         * The animation widget.
         * <p>
         * It provides the frame clock for the animation. It's not strictly necessary
         * for this widget to be same as the one being animated.
         * <p>
         * The widget must be mapped in order for the animation to work. If it's not
         * mapped, or if it gets unmapped during an ongoing animation, the animation
         * will be automatically skipped.
         * @param widget The value for the {@code widget} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWidget(org.gtk.gtk.Widget widget) {
            names.add("widget");
            values.add(org.gtk.gobject.Value.create(widget));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_animation_get_state = Interop.downcallHandle(
                "adw_animation_get_state",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_animation_get_target = Interop.downcallHandle(
                "adw_animation_get_target",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_animation_get_value = Interop.downcallHandle(
                "adw_animation_get_value",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_animation_get_widget = Interop.downcallHandle(
                "adw_animation_get_widget",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_animation_pause = Interop.downcallHandle(
                "adw_animation_pause",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_animation_play = Interop.downcallHandle(
                "adw_animation_play",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_animation_reset = Interop.downcallHandle(
                "adw_animation_reset",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_animation_resume = Interop.downcallHandle(
                "adw_animation_resume",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_animation_set_target = Interop.downcallHandle(
                "adw_animation_set_target",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_animation_skip = Interop.downcallHandle(
                "adw_animation_skip",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_animation_get_type = Interop.downcallHandle(
                "adw_animation_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.adw_animation_get_type != null;
    }
}
