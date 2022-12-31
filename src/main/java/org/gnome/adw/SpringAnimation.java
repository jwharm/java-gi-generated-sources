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
    
    private static final java.lang.String C_TYPE_NAME = "AdwSpringAnimation";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a SpringAnimation proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SpringAnimation(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SpringAnimation> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SpringAnimation(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.gtk.Widget widget, double from, double to, org.gnome.adw.SpringParams springParams, org.gnome.adw.AnimationTarget target) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_spring_animation_new.invokeExact(
                    widget.handle(),
                    from,
                    to,
                    springParams.handle(),
                    target.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        springParams.yieldOwnership();
        target.yieldOwnership();
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
    public SpringAnimation(org.gtk.gtk.Widget widget, double from, double to, org.gnome.adw.SpringParams springParams, org.gnome.adw.AnimationTarget target) {
        super(constructNew(widget, from, to, springParams, target), Ownership.NONE);
    }
    
    /**
     * Gets whether {@code self} should be clamped.
     * @return whether {@code self} is clamped
     */
    public boolean getClamp() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_spring_animation_get_clamp.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the precision of the spring.
     * @return the epsilon value
     */
    public double getEpsilon() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_spring_animation_get_epsilon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the estimated duration of {@code self}.
     * <p>
     * Can be {@code DURATION_INFINITE} if the spring damping is set to 0.
     * @return the estimated duration
     */
    public int getEstimatedDuration() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_spring_animation_get_estimated_duration.invokeExact(
                    handle());
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
            RESULT = (double) DowncallHandles.adw_spring_animation_get_initial_velocity.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the physical parameters of the spring of {@code self}.
     * @return the spring parameters
     */
    public org.gnome.adw.SpringParams getSpringParams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_spring_animation_get_spring_params.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gnome.adw.SpringParams.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the value {@code self} will animate from.
     * @return the value to animate from
     */
    public double getValueFrom() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_spring_animation_get_value_from.invokeExact(
                    handle());
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
            RESULT = (double) DowncallHandles.adw_spring_animation_get_value_to.invokeExact(
                    handle());
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
            RESULT = (double) DowncallHandles.adw_spring_animation_get_velocity.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets whether {@code self} should be clamped.
     * <p>
     * If set to {@code TRUE}, the animation will abruptly end as soon as it reaches the
     * final value, preventing overshooting.
     * <p>
     * It won't prevent overshooting {@code SpringAnimation:value-from} if a
     * relative negative {@code SpringAnimation:initial-velocity} is set.
     * @param clamp the new value
     */
    public void setClamp(boolean clamp) {
        try {
            DowncallHandles.adw_spring_animation_set_clamp.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(clamp, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the precision of the spring.
     * <p>
     * The level of precision used to determine when the animation has come to a
     * rest, that is, when the amplitude of the oscillations becomes smaller than
     * this value.
     * <p>
     * If the epsilon value is too small, the animation will take a long time to
     * stop after the animated value has stopped visibly changing.
     * <p>
     * If the epsilon value is too large, the animation will end prematurely.
     * <p>
     * The default value is 0.001.
     * @param epsilon the new value
     */
    public void setEpsilon(double epsilon) {
        try {
            DowncallHandles.adw_spring_animation_set_epsilon.invokeExact(
                    handle(),
                    epsilon);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the initial velocity of {@code self}.
     * <p>
     * Initial velocity affects only the animation curve, but not its duration.
     * @param velocity the initial velocity
     */
    public void setInitialVelocity(double velocity) {
        try {
            DowncallHandles.adw_spring_animation_set_initial_velocity.invokeExact(
                    handle(),
                    velocity);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the physical parameters of the spring of {@code self}.
     * @param springParams the new spring parameters
     */
    public void setSpringParams(org.gnome.adw.SpringParams springParams) {
        try {
            DowncallHandles.adw_spring_animation_set_spring_params.invokeExact(
                    handle(),
                    springParams.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value {@code self} will animate from.
     * <p>
     * The animation will start at this value and end at
     * {@code SpringAnimation:value-to}.
     * @param value the value to animate from
     */
    public void setValueFrom(double value) {
        try {
            DowncallHandles.adw_spring_animation_set_value_from.invokeExact(
                    handle(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value {@code self} will animate to.
     * <p>
     * The animation will start at {@code SpringAnimation:value-from} and end at
     * this value.
     * @param value the value to animate to
     */
    public void setValueTo(double value) {
        try {
            DowncallHandles.adw_spring_animation_set_value_to.invokeExact(
                    handle(),
                    value);
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
            RESULT = (long) DowncallHandles.adw_spring_animation_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link SpringAnimation.Builder} object constructs a {@link SpringAnimation} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SpringAnimation.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gnome.adw.Animation.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link SpringAnimation} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SpringAnimation}.
         * @return A new instance of {@code SpringAnimation} with the properties 
         *         that were set in the Builder object.
         */
        public SpringAnimation build() {
            return (SpringAnimation) org.gtk.gobject.GObject.newWithProperties(
                SpringAnimation.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether the animation should be clamped.
         * <p>
         * If set to {@code TRUE}, the animation will abruptly end as soon as it reaches the
         * final value, preventing overshooting.
         * <p>
         * It won't prevent overshooting {@code SpringAnimation:value-from} if a
         * relative negative {@code SpringAnimation:initial-velocity} is set.
         * @param clamp The value for the {@code clamp} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setClamp(boolean clamp) {
            names.add("clamp");
            values.add(org.gtk.gobject.Value.create(clamp));
            return this;
        }
        
        /**
         * Precision of the spring.
         * <p>
         * The level of precision used to determine when the animation has come to a
         * rest, that is, when the amplitude of the oscillations becomes smaller than
         * this value.
         * <p>
         * If the epsilon value is too small, the animation will take a long time to
         * stop after the animated value has stopped visibly changing.
         * <p>
         * If the epsilon value is too large, the animation will end prematurely.
         * <p>
         * The default value is 0.001.
         * @param epsilon The value for the {@code epsilon} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEpsilon(double epsilon) {
            names.add("epsilon");
            values.add(org.gtk.gobject.Value.create(epsilon));
            return this;
        }
        
        /**
         * Estimated duration of the animation, in milliseconds.
         * <p>
         * Can be {@code DURATION_INFINITE} if the spring damping is set to 0.
         * @param estimatedDuration The value for the {@code estimated-duration} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEstimatedDuration(int estimatedDuration) {
            names.add("estimated-duration");
            values.add(org.gtk.gobject.Value.create(estimatedDuration));
            return this;
        }
        
        /**
         * The initial velocity to start the animation with.
         * <p>
         * Initial velocity affects only the animation curve, but not its duration.
         * @param initialVelocity The value for the {@code initial-velocity} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInitialVelocity(double initialVelocity) {
            names.add("initial-velocity");
            values.add(org.gtk.gobject.Value.create(initialVelocity));
            return this;
        }
        
        /**
         * Physical parameters describing the spring.
         * @param springParams The value for the {@code spring-params} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSpringParams(org.gnome.adw.SpringParams springParams) {
            names.add("spring-params");
            values.add(org.gtk.gobject.Value.create(springParams));
            return this;
        }
        
        /**
         * The value to animate from.
         * <p>
         * The animation will start at this value and end at
         * {@code SpringAnimation:value-to}.
         * @param valueFrom The value for the {@code value-from} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValueFrom(double valueFrom) {
            names.add("value-from");
            values.add(org.gtk.gobject.Value.create(valueFrom));
            return this;
        }
        
        /**
         * The value to animate to.
         * <p>
         * The animation will start at {@code SpringAnimation:value-from} and end
         * at this value.
         * @param valueTo The value for the {@code value-to} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValueTo(double valueTo) {
            names.add("value-to");
            values.add(org.gtk.gobject.Value.create(valueTo));
            return this;
        }
        
        /**
         * Current velocity of the animation.
         * @param velocity The value for the {@code velocity} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVelocity(double velocity) {
            names.add("velocity");
            values.add(org.gtk.gobject.Value.create(velocity));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_spring_animation_new = Interop.downcallHandle(
            "adw_spring_animation_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_spring_animation_get_clamp = Interop.downcallHandle(
            "adw_spring_animation_get_clamp",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_spring_animation_get_epsilon = Interop.downcallHandle(
            "adw_spring_animation_get_epsilon",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_spring_animation_get_estimated_duration = Interop.downcallHandle(
            "adw_spring_animation_get_estimated_duration",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_spring_animation_get_initial_velocity = Interop.downcallHandle(
            "adw_spring_animation_get_initial_velocity",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_spring_animation_get_spring_params = Interop.downcallHandle(
            "adw_spring_animation_get_spring_params",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_spring_animation_get_value_from = Interop.downcallHandle(
            "adw_spring_animation_get_value_from",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_spring_animation_get_value_to = Interop.downcallHandle(
            "adw_spring_animation_get_value_to",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_spring_animation_get_velocity = Interop.downcallHandle(
            "adw_spring_animation_get_velocity",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_spring_animation_set_clamp = Interop.downcallHandle(
            "adw_spring_animation_set_clamp",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_spring_animation_set_epsilon = Interop.downcallHandle(
            "adw_spring_animation_set_epsilon",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle adw_spring_animation_set_initial_velocity = Interop.downcallHandle(
            "adw_spring_animation_set_initial_velocity",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle adw_spring_animation_set_spring_params = Interop.downcallHandle(
            "adw_spring_animation_set_spring_params",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_spring_animation_set_value_from = Interop.downcallHandle(
            "adw_spring_animation_set_value_from",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle adw_spring_animation_set_value_to = Interop.downcallHandle(
            "adw_spring_animation_set_value_to",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle adw_spring_animation_get_type = Interop.downcallHandle(
            "adw_spring_animation_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
