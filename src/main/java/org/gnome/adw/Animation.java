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
public class Animation extends org.gtk.gobject.Object {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwAnimation";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a Animation proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Animation(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Animation if its GType is a (or inherits from) "AdwAnimation".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Animation" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwAnimation", a ClassCastException will be thrown.
     */
    public static Animation castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwAnimation"))) {
            return new Animation(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwAnimation");
        }
    }
    
    /**
     * Gets the current value of {@code self}.
     * <p>
     * The state indicates whether {@code self} is currently playing, paused, finished or
     * hasn't been started yet.
     * @return the animation value
     */
    public @NotNull org.gnome.adw.AnimationState getState() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_animation_get_state.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.AnimationState(RESULT);
    }
    
    /**
     * Gets the target {@code self} animates.
     * @return the animation target
     */
    public @NotNull org.gnome.adw.AnimationTarget getTarget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_animation_get_target.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.AnimationTarget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the current value of {@code self}.
     * @return the current value
     */
    public double getValue() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_animation_get_value.invokeExact(
                    handle());
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
    public @NotNull org.gtk.gtk.Widget getWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_animation_get_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
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
            DowncallHandles.adw_animation_pause.invokeExact(
                    handle());
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
            DowncallHandles.adw_animation_play.invokeExact(
                    handle());
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
            DowncallHandles.adw_animation_reset.invokeExact(
                    handle());
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
            DowncallHandles.adw_animation_resume.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the target {@code self} animates to {@code target}.
     * @param target an animation target
     */
    public void setTarget(@NotNull org.gnome.adw.AnimationTarget target) {
        java.util.Objects.requireNonNull(target, "Parameter 'target' must not be null");
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
            DowncallHandles.adw_animation_skip.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Done {
        void signalReceived(Animation source);
    }
    
    /**
     * This signal is emitted when the animation has been completed, either on its
     * own or via calling {@code Animation#skip}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Animation.Done> onDone(Animation.Done handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("done"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Animation.Callbacks.class, "signalAnimationDone",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Animation.Done>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_animation_get_state = Interop.downcallHandle(
            "adw_animation_get_state",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_animation_get_target = Interop.downcallHandle(
            "adw_animation_get_target",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_animation_get_value = Interop.downcallHandle(
            "adw_animation_get_value",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_animation_get_widget = Interop.downcallHandle(
            "adw_animation_get_widget",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_animation_pause = Interop.downcallHandle(
            "adw_animation_pause",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_animation_play = Interop.downcallHandle(
            "adw_animation_play",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_animation_reset = Interop.downcallHandle(
            "adw_animation_reset",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_animation_resume = Interop.downcallHandle(
            "adw_animation_resume",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_animation_set_target = Interop.downcallHandle(
            "adw_animation_set_target",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_animation_skip = Interop.downcallHandle(
            "adw_animation_skip",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalAnimationDone(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Animation.Done) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Animation(source, Ownership.UNKNOWN));
        }
    }
}
