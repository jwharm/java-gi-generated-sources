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
 * {@code SpringAnimation}.
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
 * 
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
 */
public class Animation extends org.gtk.gobject.Object {

    public Animation(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Animation */
    public static Animation castFrom(org.gtk.gobject.Object gobject) {
        return new Animation(gobject.refcounted());
    }
    
    private static final MethodHandle adw_animation_get_state = Interop.downcallHandle(
        "adw_animation_get_state",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current value of {@code self}.
     * <p>
     * The state indicates whether {@code self} is currently playing, paused, finished or
     * hasn't been started yet.
     */
    public @NotNull AnimationState getState() {
        int RESULT;
        try {
            RESULT = (int) adw_animation_get_state.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new AnimationState(RESULT);
    }
    
    private static final MethodHandle adw_animation_get_target = Interop.downcallHandle(
        "adw_animation_get_target",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the target {@code self} animates.
     */
    public @NotNull AnimationTarget getTarget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_animation_get_target.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new AnimationTarget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_animation_get_value = Interop.downcallHandle(
        "adw_animation_get_value",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current value of {@code self}.
     */
    public double getValue() {
        double RESULT;
        try {
            RESULT = (double) adw_animation_get_value.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle adw_animation_get_widget = Interop.downcallHandle(
        "adw_animation_get_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the widget {@code self} was created for.
     */
    public @NotNull org.gtk.gtk.Widget getWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_animation_get_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_animation_pause = Interop.downcallHandle(
        "adw_animation_pause",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Pauses a playing animation for {@code self}.
     * <p>
     * Does nothing if the current state of {@code self} isn't {@code ADW_ANIMATION_PLAYING}.
     * <p>
     * Sets {@code Animation:state} to {@code ADW_ANIMATION_PAUSED}.
     */
    public @NotNull void pause() {
        try {
            adw_animation_pause.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_animation_play = Interop.downcallHandle(
        "adw_animation_play",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
     * example, when using {@link GLib#idleAdd} and starting an animation
     * immediately afterwards, it's entirely possible that the idle callback will
     * run after the animation has already finished, and not while it's playing.
     */
    public @NotNull void play() {
        try {
            adw_animation_play.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_animation_reset = Interop.downcallHandle(
        "adw_animation_reset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Resets the animation for {@code self}.
     * <p>
     * Sets {@code Animation:state} to {@code ADW_ANIMATION_IDLE}.
     */
    public @NotNull void reset() {
        try {
            adw_animation_reset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_animation_resume = Interop.downcallHandle(
        "adw_animation_resume",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Resumes a paused animation for {@code self}.
     * <p>
     * This function must only be used if the animation has been paused with
     * {@link Animation#pause}.
     * <p>
     * Sets {@code Animation:state} to {@code ADW_ANIMATION_PLAYING}.
     */
    public @NotNull void resume() {
        try {
            adw_animation_resume.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_animation_skip = Interop.downcallHandle(
        "adw_animation_skip",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Skips the animation for {@code self}.
     * <p>
     * If the animation hasn't been started yet, is playing, or is paused, instantly
     * skips the animation to the end and causes {@code Animation::done} to be
     * emitted.
     * <p>
     * Sets {@code Animation:state} to {@code ADW_ANIMATION_FINISHED}.
     */
    public @NotNull void skip() {
        try {
            adw_animation_skip.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DoneHandler {
        void signalReceived(Animation source);
    }
    
    /**
     * This signal is emitted when the animation has been completed, either on its
     * own or via calling {@link Animation#skip}.
     */
    public SignalHandle onDone(DoneHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("done"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Animation.Callbacks.class, "signalAnimationDone",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalAnimationDone(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Animation.DoneHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Animation(Refcounted.get(source)));
        }
        
    }
}
