package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Physical parameters of a spring for {@link SpringAnimation}.
 * <p>
 * Any spring can be described by three parameters: mass, stiffness and damping.
 * <p>
 * An undamped spring will produce an oscillatory motion which will go on
 * forever.
 * <p>
 * The frequency and amplitude of the oscillations will be determined by the
 * stiffness (how "strong" the spring is) and its mass (how much "inertia" it
 * has).
 * <p>
 * If damping is larger than 0, the amplitude of that oscillating motion will
 * exponientally decrease over time. If that damping is strong enough that the
 * spring can't complete a full oscillation, it's called an overdamped spring.
 * <p>
 * If we the spring can oscillate, it's called an underdamped spring.
 * <p>
 * The value between these two behaviors is called critical damping; a
 * critically damped spring will comes to rest in the minimum possible time
 * without producing oscillations.
 * <p>
 * The damping can be replaced by damping ratio, which produces the following
 * springs:
 * <p>
 * * 0: an undamped spring.
 * * Between 0 and 1: an underdamped spring.
 * * 1: a critically damped spring.
 * * Larger than 1: an overdamped spring.
 * <p>
 * As such
 */
public class SpringParams extends io.github.jwharm.javagi.ResourceBase {

    public SpringParams(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(double dampingRatio, double mass, double stiffness) {
        Reference RESULT = References.get(gtk_h.adw_spring_params_new(dampingRatio, mass, stiffness), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwSpringParams} from {@code mass}, {@code stiffness} and {@code damping_ratio}.
     * <p>
     * The damping value is calculated from {@code damping_ratio} and the other two
     * parameters.
     * <p>
     * * If {@code damping_ratio} is 0, the spring will not be damped and will oscillate
     *   endlessly.
     * * If {@code damping_ratio} is between 0 and 1, the spring is underdamped and will
     *   always overshoot.
     * * If {@code damping_ratio} is 1, the spring is critically damped and will reach its
     *   resting position the quickest way possible.
     * * If {@code damping_ratio} is larger than 1, the spring is overdamped and will reach
     *   its resting position faster than it can complete an oscillation.
     * <p>
     * {@link SpringParams#newFull} allows to pass a raw damping value instead.
     */
    public SpringParams(double dampingRatio, double mass, double stiffness) {
        super(constructNew(dampingRatio, mass, stiffness));
    }
    
    private static Reference constructNewFull(double damping, double mass, double stiffness) {
        Reference RESULT = References.get(gtk_h.adw_spring_params_new_full(damping, mass, stiffness), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwSpringParams} from {@code mass}, {@code stiffness} and {@code damping}.
     * <p>
     * See {@link SpringParams#new_} for a simplified constructor using damping ratio
     * instead of {@code damping}.
     */
    public static SpringParams newFull(double damping, double mass, double stiffness) {
        return new SpringParams(constructNewFull(damping, mass, stiffness));
    }
    
    /**
     * Gets the damping of {@code self}.
     */
    public double getDamping() {
        var RESULT = gtk_h.adw_spring_params_get_damping(handle());
        return RESULT;
    }
    
    /**
     * Gets the damping ratio of {@code self}.
     */
    public double getDampingRatio() {
        var RESULT = gtk_h.adw_spring_params_get_damping_ratio(handle());
        return RESULT;
    }
    
    /**
     * Gets the mass of {@code self}.
     */
    public double getMass() {
        var RESULT = gtk_h.adw_spring_params_get_mass(handle());
        return RESULT;
    }
    
    /**
     * Gets the stiffness of {@code self}.
     */
    public double getStiffness() {
        var RESULT = gtk_h.adw_spring_params_get_stiffness(handle());
        return RESULT;
    }
    
    /**
     * Increases the reference count of {@code self}.
     */
    public SpringParams ref() {
        var RESULT = gtk_h.adw_spring_params_ref(handle());
        return new SpringParams(References.get(RESULT, true));
    }
    
    /**
     * Decreases the reference count of {@code self}.
     * <p>
     * If the last reference is dropped, the structure is freed.
     */
    public void unref() {
        gtk_h.adw_spring_params_unref(handle());
    }
    
}
