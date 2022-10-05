package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A time-based {@link Animation}.
 * <p>
 * {@code AdwTimedAnimation} implements a simple animation interpolating the given
 * value from {@code TimedAnimation:value-from} to
 * {@code TimedAnimation:value-to} over
 * {@code TimedAnimation:duration} milliseconds using the curve described by
 * {@code TimedAnimation:easing}.
 * <p>
 * If {@code TimedAnimation:reverse} is set to {@code TRUE}, {@code AdwTimedAnimation}
 * will instead animate from {@code TimedAnimation:value-to} to
 * {@code TimedAnimation:value-from}, and the easing curve will be inverted.
 * <p>
 * The animation can repeat a certain amount of times, or endlessly, depending
 * on the {@code TimedAnimation:repeat-count} value. If
 * {@code TimedAnimation:alternate} is set to {@code TRUE}, it will also change the
 * direction every other iteration.
 */
public class TimedAnimation extends Animation {

    public TimedAnimation(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TimedAnimation */
    public static TimedAnimation castFrom(org.gtk.gobject.Object gobject) {
        return new TimedAnimation(gobject.refcounted());
    }
    
    static final MethodHandle adw_timed_animation_new = Interop.downcallHandle(
        "adw_timed_animation_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(org.gtk.gtk.Widget widget, double from, double to, int duration, AnimationTarget target) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_timed_animation_new.invokeExact(widget.handle(), from, to, duration, target.refcounted().unowned().handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwTimedAnimation} on {@code widget} to animate {@code target} from {@code from}
     * to {@code to}.
     */
    public TimedAnimation(org.gtk.gtk.Widget widget, double from, double to, int duration, AnimationTarget target) {
        super(constructNew(widget, from, to, duration, target));
    }
    
    static final MethodHandle adw_timed_animation_get_alternate = Interop.downcallHandle(
        "adw_timed_animation_get_alternate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} changes direction on every iteration.
     */
    public boolean getAlternate() {
        try {
            var RESULT = (int) adw_timed_animation_get_alternate.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_timed_animation_get_duration = Interop.downcallHandle(
        "adw_timed_animation_get_duration",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the duration of {@code self}.
     */
    public int getDuration() {
        try {
            var RESULT = (int) adw_timed_animation_get_duration.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_timed_animation_get_easing = Interop.downcallHandle(
        "adw_timed_animation_get_easing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the easing function {@code self} uses.
     */
    public Easing getEasing() {
        try {
            var RESULT = (int) adw_timed_animation_get_easing.invokeExact(handle());
            return new Easing(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_timed_animation_get_repeat_count = Interop.downcallHandle(
        "adw_timed_animation_get_repeat_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of times {@code self} will play.
     */
    public int getRepeatCount() {
        try {
            var RESULT = (int) adw_timed_animation_get_repeat_count.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_timed_animation_get_reverse = Interop.downcallHandle(
        "adw_timed_animation_get_reverse",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} plays backwards.
     */
    public boolean getReverse() {
        try {
            var RESULT = (int) adw_timed_animation_get_reverse.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_timed_animation_get_value_from = Interop.downcallHandle(
        "adw_timed_animation_get_value_from",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value {@code self} will animate from.
     */
    public double getValueFrom() {
        try {
            var RESULT = (double) adw_timed_animation_get_value_from.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_timed_animation_get_value_to = Interop.downcallHandle(
        "adw_timed_animation_get_value_to",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value {@code self} will animate to.
     */
    public double getValueTo() {
        try {
            var RESULT = (double) adw_timed_animation_get_value_to.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_timed_animation_set_alternate = Interop.downcallHandle(
        "adw_timed_animation_set_alternate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code self} changes direction on every iteration.
     */
    public void setAlternate(boolean alternate) {
        try {
            adw_timed_animation_set_alternate.invokeExact(handle(), alternate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_timed_animation_set_duration = Interop.downcallHandle(
        "adw_timed_animation_set_duration",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the duration of {@code self}.
     * <p>
     * If the animation repeats more than once, sets the duration of one iteration.
     */
    public void setDuration(int duration) {
        try {
            adw_timed_animation_set_duration.invokeExact(handle(), duration);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_timed_animation_set_easing = Interop.downcallHandle(
        "adw_timed_animation_set_easing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the easing function {@code self} will use.
     * <p>
     * See {@code Easing} for the description of specific easing functions.
     */
    public void setEasing(Easing easing) {
        try {
            adw_timed_animation_set_easing.invokeExact(handle(), easing.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_timed_animation_set_repeat_count = Interop.downcallHandle(
        "adw_timed_animation_set_repeat_count",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the number of times {@code self} will play.
     * <p>
     * If set to 0, {@code self} will repeat endlessly.
     */
    public void setRepeatCount(int repeatCount) {
        try {
            adw_timed_animation_set_repeat_count.invokeExact(handle(), repeatCount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_timed_animation_set_reverse = Interop.downcallHandle(
        "adw_timed_animation_set_reverse",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code self} plays backwards.
     */
    public void setReverse(boolean reverse) {
        try {
            adw_timed_animation_set_reverse.invokeExact(handle(), reverse ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_timed_animation_set_value_from = Interop.downcallHandle(
        "adw_timed_animation_set_value_from",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the value {@code self} will animate from.
     */
    public void setValueFrom(double value) {
        try {
            adw_timed_animation_set_value_from.invokeExact(handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_timed_animation_set_value_to = Interop.downcallHandle(
        "adw_timed_animation_set_value_to",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the value {@code self} will animate to.
     */
    public void setValueTo(double value) {
        try {
            adw_timed_animation_set_value_to.invokeExact(handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
