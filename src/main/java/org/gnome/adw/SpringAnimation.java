package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A spring-based {@link Animation}.
 * <p>
 * {@code AdwSpringAnimation} implements an animation driven by a physical model of a
 * spring described by {@code SpringParams}, with a resting position in
 * {@code SpringAnimation:value-to}, stretched to
 * {@code SpringAnimation:value-from}.
 * <p>
 * Since the animation is physically simulated, spring animations don't have a
 * fixed duration. The animation will stop when the simulated spring comes to a
 * rest - when the amplitude of the oscillations becomes smaller than
 * {@code SpringAnimation:epsilon}, or immediately when it reaches
 * {@code SpringAnimation:value-to} if
 * {@code SpringAnimation:clamp} is set to {@code TRUE}. The estimated duration can
 * be obtained with {@code SpringAnimation:estimated-duration}.
 * <p>
 * Due to the nature of spring-driven motion the animation can overshoot
 * {@code SpringAnimation:value-to} before coming to a rest. Whether the
 * animation will overshoot or not depends on the damping ratio of the spring.
 * See {@code SpringParams} for more information about specific damping ratio
 * values.
 * <p>
 * If {@code SpringAnimation:clamp} is {@code TRUE}, the animation will abruptly
 * end as soon as it reaches the final value, preventing overshooting.
 * <p>
 * Animations can have an initial velocity value, set via
 * {@code SpringAnimation:initial-velocity}, which adjusts the curve without
 * changing the duration. This makes spring animations useful for deceleration
 * at the end of gestures.
 * <p>
 * If the initial and final values are equal, and the initial velocity is not 0,
 * the animation value will bounce and return to its resting position.
 */
public class SpringAnimation extends Animation {

    public SpringAnimation(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SpringAnimation */
    public static SpringAnimation castFrom(org.gtk.gobject.Object gobject) {
        return new SpringAnimation(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.gtk.Widget widget, double from, double to, SpringParams springParams, AnimationTarget target) {
        Reference RESULT = References.get(gtk_h.adw_spring_animation_new(widget.handle(), from, to, springParams.getReference().unowned().handle(), target.getReference().unowned().handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwSpringAnimation} on {@code widget}.
     * <p>
     * The animation will animate {@code target} from {@code from} to {@code to} with the dynamics of a
     * spring described by {@code spring_params}.
     */
    public SpringAnimation(org.gtk.gtk.Widget widget, double from, double to, SpringParams springParams, AnimationTarget target) {
        super(constructNew(widget, from, to, springParams, target));
    }
    
    /**
     * Gets whether {@code self} should be clamped.
     */
    public boolean getClamp() {
        var RESULT = gtk_h.adw_spring_animation_get_clamp(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the precision used to determine the duration of {@code self}.
     */
    public double getEpsilon() {
        var RESULT = gtk_h.adw_spring_animation_get_epsilon(handle());
        return RESULT;
    }
    
    /**
     * Gets the estimated duration of {@code self}.
     */
    public int getEstimatedDuration() {
        var RESULT = gtk_h.adw_spring_animation_get_estimated_duration(handle());
        return RESULT;
    }
    
    /**
     * Gets the initial velocity of {@code self}.
     */
    public double getInitialVelocity() {
        var RESULT = gtk_h.adw_spring_animation_get_initial_velocity(handle());
        return RESULT;
    }
    
    /**
     * Gets the physical parameters of the spring of {@code self}.
     */
    public SpringParams getSpringParams() {
        var RESULT = gtk_h.adw_spring_animation_get_spring_params(handle());
        return new SpringParams(References.get(RESULT, false));
    }
    
    /**
     * Gets the value {@code self} will animate from.
     */
    public double getValueFrom() {
        var RESULT = gtk_h.adw_spring_animation_get_value_from(handle());
        return RESULT;
    }
    
    /**
     * Gets the value {@code self} will animate to.
     */
    public double getValueTo() {
        var RESULT = gtk_h.adw_spring_animation_get_value_to(handle());
        return RESULT;
    }
    
    /**
     * Gets the current velocity of {@code self}.
     */
    public double getVelocity() {
        var RESULT = gtk_h.adw_spring_animation_get_velocity(handle());
        return RESULT;
    }
    
    /**
     * Sets whether {@code self} should be clamped.
     */
    public void setClamp(boolean clamp) {
        gtk_h.adw_spring_animation_set_clamp(handle(), clamp ? 1 : 0);
    }
    
    /**
     * Sets the precision used to determine the duration of {@code self}.
     */
    public void setEpsilon(double epsilon) {
        gtk_h.adw_spring_animation_set_epsilon(handle(), epsilon);
    }
    
    /**
     * Sets the initial velocity of {@code self}.
     */
    public void setInitialVelocity(double velocity) {
        gtk_h.adw_spring_animation_set_initial_velocity(handle(), velocity);
    }
    
    /**
     * Sets the physical parameters of the spring of {@code self}.
     */
    public void setSpringParams(SpringParams springParams) {
        gtk_h.adw_spring_animation_set_spring_params(handle(), springParams.handle());
    }
    
    /**
     * Sets the value {@code self} will animate from.
     */
    public void setValueFrom(double value) {
        gtk_h.adw_spring_animation_set_value_from(handle(), value);
    }
    
    /**
     * Sets the value {@code self} will animate to.
     */
    public void setValueTo(double value) {
        gtk_h.adw_spring_animation_set_value_to(handle(), value);
    }
    
}
