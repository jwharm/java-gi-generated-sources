package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <p>
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

    public Animation(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Animation */
    public static Animation castFrom(org.gtk.gobject.Object gobject) {
        return new Animation(gobject.getReference());
    }
    
    /**
     * Gets the current value of {@code self}.
     * <p>
     * The state indicates whether {@code self} is currently playing, paused, finished or
     * hasn't been started yet.
     */
    public AnimationState getState() {
        var RESULT = gtk_h.adw_animation_get_state(handle());
        return AnimationState.fromValue(RESULT);
    }
    
    /**
     * Gets the target {@code self} animates.
     */
    public AnimationTarget getTarget() {
        var RESULT = gtk_h.adw_animation_get_target(handle());
        return new AnimationTarget(References.get(RESULT, false));
    }
    
    /**
     * Gets the current value of {@code self}.
     */
    public double getValue() {
        var RESULT = gtk_h.adw_animation_get_value(handle());
        return RESULT;
    }
    
    /**
     * Gets the widget {@code self} was created for.
     */
    public org.gtk.gtk.Widget getWidget() {
        var RESULT = gtk_h.adw_animation_get_widget(handle());
        return new org.gtk.gtk.Widget(References.get(RESULT, false));
    }
    
    /**
     * Pauses a playing animation for {@code self}.
     * <p>
     * Does nothing if the current state of {@code self} isn't {@code ADW_ANIMATION_PLAYING}.
     * <p>
     * Sets {@code Animation:state} to {@code ADW_ANIMATION_PAUSED}.
     */
    public void pause() {
        gtk_h.adw_animation_pause(handle());
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
     * example, when using {@link GLib#idleAdd} and starting an animation
     * immediately afterwards, it's entirely possible that the idle callback will
     * run after the animation has already finished, and not while it's playing.
     */
    public void play() {
        gtk_h.adw_animation_play(handle());
    }
    
    /**
     * Resets the animation for {@code self}.
     * <p>
     * Sets {@code Animation:state} to {@code ADW_ANIMATION_IDLE}.
     */
    public void reset() {
        gtk_h.adw_animation_reset(handle());
    }
    
    /**
     * Resumes a paused animation for {@code self}.
     * <p>
     * This function must only be used if the animation has been paused with
     * {@link animation.pause#null}.
     * <p>
     * Sets {@code Animation:state} to {@code ADW_ANIMATION_PLAYING}.
     */
    public void resume() {
        gtk_h.adw_animation_resume(handle());
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
        gtk_h.adw_animation_skip(handle());
    }
    
    @FunctionalInterface
    public interface DoneHandler {
        void signalReceived(Animation source);
    }
    
    /**
     * This signal is emitted when the animation has been completed, either on its
     * own or via calling {@link animation.skip#null}.
     */
    public SignalHandle onDone(DoneHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("done").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Animation.class, "__signalAnimationDone",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalAnimationDone(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Animation.DoneHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Animation(References.get(source)));
    }
    
}
