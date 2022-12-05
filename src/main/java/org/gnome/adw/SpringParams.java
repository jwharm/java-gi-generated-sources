package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * @version 1.0
 */
public class SpringParams extends Struct {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwSpringParams";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SpringParams}
     * @return A new, uninitialized @{link SpringParams}
     */
    public static SpringParams allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SpringParams newInstance = new SpringParams(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SpringParams proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SpringParams(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(double dampingRatio, double mass, double stiffness) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_spring_params_new.invokeExact(
                    dampingRatio,
                    mass,
                    stiffness);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * {@code SpringParams#newFull} allows to pass a raw damping value instead.
     * @param dampingRatio the damping ratio of the spring
     * @param mass the mass of the spring
     * @param stiffness the stiffness of the spring
     */
    public SpringParams(double dampingRatio, double mass, double stiffness) {
        super(constructNew(dampingRatio, mass, stiffness), Ownership.FULL);
    }
    
    private static Addressable constructNewFull(double damping, double mass, double stiffness) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_spring_params_new_full.invokeExact(
                    damping,
                    mass,
                    stiffness);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwSpringParams} from {@code mass}, {@code stiffness} and {@code damping}.
     * <p>
     * See {@link SpringParams#SpringParams} for a simplified constructor using damping ratio
     * instead of {@code damping}.
     * @param damping the damping of the spring
     * @param mass the mass of the spring
     * @param stiffness the stiffness of the spring
     * @return the newly created spring parameters
     */
    public static SpringParams newFull(double damping, double mass, double stiffness) {
        return new SpringParams(constructNewFull(damping, mass, stiffness), Ownership.FULL);
    }
    
    /**
     * Gets the damping of {@code self}.
     * @return the damping
     */
    public double getDamping() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_spring_params_get_damping.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the damping ratio of {@code self}.
     * @return the damping ratio
     */
    public double getDampingRatio() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_spring_params_get_damping_ratio.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the mass of {@code self}.
     * @return the mass
     */
    public double getMass() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_spring_params_get_mass.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the stiffness of {@code self}.
     * @return the stiffness
     */
    public double getStiffness() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_spring_params_get_stiffness.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Increases the reference count of {@code self}.
     * @return {@code self}
     */
    public @NotNull org.gnome.adw.SpringParams ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_spring_params_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.SpringParams(RESULT, Ownership.FULL);
    }
    
    /**
     * Decreases the reference count of {@code self}.
     * <p>
     * If the last reference is dropped, the structure is freed.
     */
    public void unref() {
        try {
            DowncallHandles.adw_spring_params_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_spring_params_new = Interop.downcallHandle(
            "adw_spring_params_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle adw_spring_params_new_full = Interop.downcallHandle(
            "adw_spring_params_new_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle adw_spring_params_get_damping = Interop.downcallHandle(
            "adw_spring_params_get_damping",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_spring_params_get_damping_ratio = Interop.downcallHandle(
            "adw_spring_params_get_damping_ratio",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_spring_params_get_mass = Interop.downcallHandle(
            "adw_spring_params_get_mass",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_spring_params_get_stiffness = Interop.downcallHandle(
            "adw_spring_params_get_stiffness",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_spring_params_ref = Interop.downcallHandle(
            "adw_spring_params_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_spring_params_unref = Interop.downcallHandle(
            "adw_spring_params_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }
}
