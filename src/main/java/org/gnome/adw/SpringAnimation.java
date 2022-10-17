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
 */
public class SpringAnimation extends Animation {

    public SpringAnimation(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SpringAnimation */
    public static SpringAnimation castFrom(org.gtk.gobject.Object gobject) {
        return new SpringAnimation(gobject.refcounted());
    }
    
    private static final MethodHandle adw_spring_animation_new = Interop.downcallHandle(
        "adw_spring_animation_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull org.gtk.gtk.Widget widget, @NotNull double from, @NotNull double to, @NotNull SpringParams springParams, @NotNull AnimationTarget target) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_spring_animation_new.invokeExact(widget.handle(), from, to, springParams.refcounted().unowned().handle(), target.refcounted().unowned().handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwSpringAnimation} on {@code widget}.
     * <p>
     * The animation will animate {@code target} from {@code from} to {@code to} with the dynamics of a
     * spring described by {@code spring_params}.
     */
    public SpringAnimation(@NotNull org.gtk.gtk.Widget widget, @NotNull double from, @NotNull double to, @NotNull SpringParams springParams, @NotNull AnimationTarget target) {
        super(constructNew(widget, from, to, springParams, target));
    }
    
    private static final MethodHandle adw_spring_animation_get_clamp = Interop.downcallHandle(
        "adw_spring_animation_get_clamp",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} should be clamped.
     */
    public boolean getClamp() {
        int RESULT;
        try {
            RESULT = (int) adw_spring_animation_get_clamp.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_spring_animation_get_epsilon = Interop.downcallHandle(
        "adw_spring_animation_get_epsilon",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the precision used to determine the duration of {@code self}.
     */
    public double getEpsilon() {
        double RESULT;
        try {
            RESULT = (double) adw_spring_animation_get_epsilon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle adw_spring_animation_get_estimated_duration = Interop.downcallHandle(
        "adw_spring_animation_get_estimated_duration",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the estimated duration of {@code self}.
     */
    public int getEstimatedDuration() {
        int RESULT;
        try {
            RESULT = (int) adw_spring_animation_get_estimated_duration.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle adw_spring_animation_get_initial_velocity = Interop.downcallHandle(
        "adw_spring_animation_get_initial_velocity",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the initial velocity of {@code self}.
     */
    public double getInitialVelocity() {
        double RESULT;
        try {
            RESULT = (double) adw_spring_animation_get_initial_velocity.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle adw_spring_animation_get_spring_params = Interop.downcallHandle(
        "adw_spring_animation_get_spring_params",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the physical parameters of the spring of {@code self}.
     */
    public @NotNull SpringParams getSpringParams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_spring_animation_get_spring_params.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SpringParams(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_spring_animation_get_value_from = Interop.downcallHandle(
        "adw_spring_animation_get_value_from",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value {@code self} will animate from.
     */
    public double getValueFrom() {
        double RESULT;
        try {
            RESULT = (double) adw_spring_animation_get_value_from.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle adw_spring_animation_get_value_to = Interop.downcallHandle(
        "adw_spring_animation_get_value_to",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value {@code self} will animate to.
     */
    public double getValueTo() {
        double RESULT;
        try {
            RESULT = (double) adw_spring_animation_get_value_to.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle adw_spring_animation_get_velocity = Interop.downcallHandle(
        "adw_spring_animation_get_velocity",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current velocity of {@code self}.
     */
    public double getVelocity() {
        double RESULT;
        try {
            RESULT = (double) adw_spring_animation_get_velocity.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle adw_spring_animation_set_clamp = Interop.downcallHandle(
        "adw_spring_animation_set_clamp",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code self} should be clamped.
     */
    public @NotNull void setClamp(@NotNull boolean clamp) {
        try {
            adw_spring_animation_set_clamp.invokeExact(handle(), clamp ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_spring_animation_set_epsilon = Interop.downcallHandle(
        "adw_spring_animation_set_epsilon",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the precision used to determine the duration of {@code self}.
     */
    public @NotNull void setEpsilon(@NotNull double epsilon) {
        try {
            adw_spring_animation_set_epsilon.invokeExact(handle(), epsilon);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_spring_animation_set_initial_velocity = Interop.downcallHandle(
        "adw_spring_animation_set_initial_velocity",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the initial velocity of {@code self}.
     */
    public @NotNull void setInitialVelocity(@NotNull double velocity) {
        try {
            adw_spring_animation_set_initial_velocity.invokeExact(handle(), velocity);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_spring_animation_set_spring_params = Interop.downcallHandle(
        "adw_spring_animation_set_spring_params",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the physical parameters of the spring of {@code self}.
     */
    public @NotNull void setSpringParams(@NotNull SpringParams springParams) {
        try {
            adw_spring_animation_set_spring_params.invokeExact(handle(), springParams.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_spring_animation_set_value_from = Interop.downcallHandle(
        "adw_spring_animation_set_value_from",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the value {@code self} will animate from.
     */
    public @NotNull void setValueFrom(@NotNull double value) {
        try {
            adw_spring_animation_set_value_from.invokeExact(handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_spring_animation_set_value_to = Interop.downcallHandle(
        "adw_spring_animation_set_value_to",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Sets the value {@code self} will animate to.
     */
    public @NotNull void setValueTo(@NotNull double value) {
        try {
            adw_spring_animation_set_value_to.invokeExact(handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
