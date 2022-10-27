package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * @version 1.0
 */
public class SpringAnimation extends org.gnome.adw.Animation {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public SpringAnimation(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SpringAnimation */
    public static SpringAnimation castFrom(org.gtk.gobject.Object gobject) {
        return new SpringAnimation(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gtk.Widget widget, double from, double to, @NotNull org.gnome.adw.SpringParams springParams, @NotNull org.gnome.adw.AnimationTarget target) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        java.util.Objects.requireNonNull(springParams, "Parameter 'springParams' must not be null");
        java.util.Objects.requireNonNull(target, "Parameter 'target' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_spring_animation_new.invokeExact(widget.handle(), from, to, springParams.refcounted().unowned().handle(), target.refcounted().unowned().handle()), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwSpringAnimation} on {@code widget}.
     * <p>
     * The animation will animate {@code target} from {@code from} to {@code to} with the dynamics of a
     * spring described by {@code spring_params}.
     * @param widget a widget to create animation on
     * @param from a value to animate from
     * @param to a value to animate to
     * @param springParams physical parameters of the spring
     * @param target a target value to animate
     */
    public SpringAnimation(@NotNull org.gtk.gtk.Widget widget, double from, double to, @NotNull org.gnome.adw.SpringParams springParams, @NotNull org.gnome.adw.AnimationTarget target) {
        super(constructNew(widget, from, to, springParams, target));
    }
    
    /**
     * Gets whether {@code self} should be clamped.
     * @return whether {@code self} is clamped
     */
    public boolean getClamp() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_spring_animation_get_clamp.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the precision used to determine the duration of {@code self}.
     * @return the epsilon value
     */
    public double getEpsilon() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_spring_animation_get_epsilon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the estimated duration of {@code self}.
     * @return the estimated duration
     */
    public int getEstimatedDuration() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_spring_animation_get_estimated_duration.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the initial velocity of {@code self}.
     * @return the initial velocity
     */
    public double getInitialVelocity() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_spring_animation_get_initial_velocity.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the physical parameters of the spring of {@code self}.
     * @return the spring parameters
     */
    public @NotNull org.gnome.adw.SpringParams getSpringParams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_spring_animation_get_spring_params.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.SpringParams(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the value {@code self} will animate from.
     * @return the value to animate from
     */
    public double getValueFrom() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_spring_animation_get_value_from.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the value {@code self} will animate to.
     * @return the value to animate to
     */
    public double getValueTo() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_spring_animation_get_value_to.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the current velocity of {@code self}.
     * @return the current velocity
     */
    public double getVelocity() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_spring_animation_get_velocity.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets whether {@code self} should be clamped.
     * @param clamp the new value
     */
    public void setClamp(boolean clamp) {
        try {
            DowncallHandles.adw_spring_animation_set_clamp.invokeExact(handle(), clamp ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the precision used to determine the duration of {@code self}.
     * @param epsilon the new value
     */
    public void setEpsilon(double epsilon) {
        try {
            DowncallHandles.adw_spring_animation_set_epsilon.invokeExact(handle(), epsilon);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the initial velocity of {@code self}.
     * @param velocity the initial velocity
     */
    public void setInitialVelocity(double velocity) {
        try {
            DowncallHandles.adw_spring_animation_set_initial_velocity.invokeExact(handle(), velocity);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the physical parameters of the spring of {@code self}.
     * @param springParams the new spring parameters
     */
    public void setSpringParams(@NotNull org.gnome.adw.SpringParams springParams) {
        java.util.Objects.requireNonNull(springParams, "Parameter 'springParams' must not be null");
        try {
            DowncallHandles.adw_spring_animation_set_spring_params.invokeExact(handle(), springParams.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value {@code self} will animate from.
     * @param value the value to animate from
     */
    public void setValueFrom(double value) {
        try {
            DowncallHandles.adw_spring_animation_set_value_from.invokeExact(handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value {@code self} will animate to.
     * @param value the value to animate to
     */
    public void setValueTo(double value) {
        try {
            DowncallHandles.adw_spring_animation_set_value_to.invokeExact(handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_spring_animation_new = Interop.downcallHandle(
            "adw_spring_animation_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_spring_animation_get_clamp = Interop.downcallHandle(
            "adw_spring_animation_get_clamp",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_spring_animation_get_epsilon = Interop.downcallHandle(
            "adw_spring_animation_get_epsilon",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_spring_animation_get_estimated_duration = Interop.downcallHandle(
            "adw_spring_animation_get_estimated_duration",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_spring_animation_get_initial_velocity = Interop.downcallHandle(
            "adw_spring_animation_get_initial_velocity",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_spring_animation_get_spring_params = Interop.downcallHandle(
            "adw_spring_animation_get_spring_params",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_spring_animation_get_value_from = Interop.downcallHandle(
            "adw_spring_animation_get_value_from",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_spring_animation_get_value_to = Interop.downcallHandle(
            "adw_spring_animation_get_value_to",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_spring_animation_get_velocity = Interop.downcallHandle(
            "adw_spring_animation_get_velocity",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_spring_animation_set_clamp = Interop.downcallHandle(
            "adw_spring_animation_set_clamp",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_spring_animation_set_epsilon = Interop.downcallHandle(
            "adw_spring_animation_set_epsilon",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
        );
        
        private static final MethodHandle adw_spring_animation_set_initial_velocity = Interop.downcallHandle(
            "adw_spring_animation_set_initial_velocity",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
        );
        
        private static final MethodHandle adw_spring_animation_set_spring_params = Interop.downcallHandle(
            "adw_spring_animation_set_spring_params",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_spring_animation_set_value_from = Interop.downcallHandle(
            "adw_spring_animation_set_value_from",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
        );
        
        private static final MethodHandle adw_spring_animation_set_value_to = Interop.downcallHandle(
            "adw_spring_animation_set_value_to",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
        );
    }
}
