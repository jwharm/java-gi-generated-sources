package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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

    public TimedAnimation(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TimedAnimation */
    public static TimedAnimation castFrom(org.gtk.gobject.Object gobject) {
        return new TimedAnimation(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.gtk.Widget widget, double from, double to, int duration, AnimationTarget target) {
        Reference RESULT = References.get(gtk_h.adw_timed_animation_new(widget.handle(), from, to, duration, target.getReference().unowned().handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwTimedAnimation} on {@code widget} to animate {@code target} from {@code from}
     * to {@code to}.
     */
    public TimedAnimation(org.gtk.gtk.Widget widget, double from, double to, int duration, AnimationTarget target) {
        super(constructNew(widget, from, to, duration, target));
    }
    
    /**
     * Gets whether {@code self} changes direction on every iteration.
     */
    public boolean getAlternate() {
        var RESULT = gtk_h.adw_timed_animation_get_alternate(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the duration of {@code self}.
     */
    public int getDuration() {
        var RESULT = gtk_h.adw_timed_animation_get_duration(handle());
        return RESULT;
    }
    
    /**
     * Gets the easing function {@code self} uses.
     */
    public Easing getEasing() {
        var RESULT = gtk_h.adw_timed_animation_get_easing(handle());
        return new Easing(RESULT);
    }
    
    /**
     * Gets the number of times {@code self} will play.
     */
    public int getRepeatCount() {
        var RESULT = gtk_h.adw_timed_animation_get_repeat_count(handle());
        return RESULT;
    }
    
    /**
     * Gets whether {@code self} plays backwards.
     */
    public boolean getReverse() {
        var RESULT = gtk_h.adw_timed_animation_get_reverse(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the value {@code self} will animate from.
     */
    public double getValueFrom() {
        var RESULT = gtk_h.adw_timed_animation_get_value_from(handle());
        return RESULT;
    }
    
    /**
     * Gets the value {@code self} will animate to.
     */
    public double getValueTo() {
        var RESULT = gtk_h.adw_timed_animation_get_value_to(handle());
        return RESULT;
    }
    
    /**
     * Sets whether {@code self} changes direction on every iteration.
     */
    public void setAlternate(boolean alternate) {
        gtk_h.adw_timed_animation_set_alternate(handle(), alternate ? 1 : 0);
    }
    
    /**
     * Sets the duration of {@code self}.
     * <p>
     * If the animation repeats more than once, sets the duration of one iteration.
     */
    public void setDuration(int duration) {
        gtk_h.adw_timed_animation_set_duration(handle(), duration);
    }
    
    /**
     * Sets the easing function {@code self} will use.
     * <p>
     * See {@code Easing} for the description of specific easing functions.
     */
    public void setEasing(Easing easing) {
        gtk_h.adw_timed_animation_set_easing(handle(), easing.getValue());
    }
    
    /**
     * Sets the number of times {@code self} will play.
     * <p>
     * If set to 0, {@code self} will repeat endlessly.
     */
    public void setRepeatCount(int repeatCount) {
        gtk_h.adw_timed_animation_set_repeat_count(handle(), repeatCount);
    }
    
    /**
     * Sets whether {@code self} plays backwards.
     */
    public void setReverse(boolean reverse) {
        gtk_h.adw_timed_animation_set_reverse(handle(), reverse ? 1 : 0);
    }
    
    /**
     * Sets the value {@code self} will animate from.
     */
    public void setValueFrom(double value) {
        gtk_h.adw_timed_animation_set_value_from(handle(), value);
    }
    
    /**
     * Sets the value {@code self} will animate to.
     */
    public void setValueTo(double value) {
        gtk_h.adw_timed_animation_set_value_to(handle(), value);
    }
    
}
