package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the available easing functions for use with
 * {@link TimedAnimation}.
 * <p>
 * New values may be added to this enumeration over time.
 * @version 1.0
 */
public class Easing extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "AdwEasing";
    
    /**
     * Linear tweening.
     */
    public static final Easing LINEAR = new Easing(0);
    
    /**
     * Quadratic tweening.
     */
    public static final Easing EASE_IN_QUAD = new Easing(1);
    
    /**
     * Quadratic tweening, inverse of {@code ADW_EASE_IN_QUAD}.
     */
    public static final Easing EASE_OUT_QUAD = new Easing(2);
    
    /**
     * Quadratic tweening, combining {@code ADW_EASE_IN_QUAD} and
     *   {@code ADW_EASE_OUT_QUAD}.
     */
    public static final Easing EASE_IN_OUT_QUAD = new Easing(3);
    
    /**
     * Cubic tweening.
     */
    public static final Easing EASE_IN_CUBIC = new Easing(4);
    
    /**
     * Cubic tweening, inverse of {@code ADW_EASE_IN_CUBIC}.
     */
    public static final Easing EASE_OUT_CUBIC = new Easing(5);
    
    /**
     * Cubic tweening, combining {@code ADW_EASE_IN_CUBIC} and
     *   {@code ADW_EASE_OUT_CUBIC}.
     */
    public static final Easing EASE_IN_OUT_CUBIC = new Easing(6);
    
    /**
     * Quartic tweening.
     */
    public static final Easing EASE_IN_QUART = new Easing(7);
    
    /**
     * Quartic tweening, inverse of {@code ADW_EASE_IN_QUART}.
     */
    public static final Easing EASE_OUT_QUART = new Easing(8);
    
    /**
     * Quartic tweening, combining {@code ADW_EASE_IN_QUART} and
     *   {@code ADW_EASE_OUT_QUART}.
     */
    public static final Easing EASE_IN_OUT_QUART = new Easing(9);
    
    /**
     * Quintic tweening.
     */
    public static final Easing EASE_IN_QUINT = new Easing(10);
    
    /**
     * Quintic tweening, inverse of {@code ADW_EASE_IN_QUINT}.
     */
    public static final Easing EASE_OUT_QUINT = new Easing(11);
    
    /**
     * Quintic tweening, combining {@code ADW_EASE_IN_QUINT} and
     *   {@code ADW_EASE_OUT_QUINT}.
     */
    public static final Easing EASE_IN_OUT_QUINT = new Easing(12);
    
    /**
     * Sine wave tweening.
     */
    public static final Easing EASE_IN_SINE = new Easing(13);
    
    /**
     * Sine wave tweening, inverse of {@code ADW_EASE_IN_SINE}.
     */
    public static final Easing EASE_OUT_SINE = new Easing(14);
    
    /**
     * Sine wave tweening, combining {@code ADW_EASE_IN_SINE} and
     *   {@code ADW_EASE_OUT_SINE}.
     */
    public static final Easing EASE_IN_OUT_SINE = new Easing(15);
    
    /**
     * Exponential tweening.
     */
    public static final Easing EASE_IN_EXPO = new Easing(16);
    
    /**
     * Exponential tweening, inverse of {@code ADW_EASE_IN_EXPO}.
     */
    public static final Easing EASE_OUT_EXPO = new Easing(17);
    
    /**
     * Exponential tweening, combining {@code ADW_EASE_IN_EXPO} and
     *   {@code ADW_EASE_OUT_EXPO}.
     */
    public static final Easing EASE_IN_OUT_EXPO = new Easing(18);
    
    /**
     * Circular tweening.
     */
    public static final Easing EASE_IN_CIRC = new Easing(19);
    
    /**
     * Circular tweening, inverse of {@code ADW_EASE_IN_CIRC}.
     */
    public static final Easing EASE_OUT_CIRC = new Easing(20);
    
    /**
     * Circular tweening, combining {@code ADW_EASE_IN_CIRC} and
     *   {@code ADW_EASE_OUT_CIRC}.
     */
    public static final Easing EASE_IN_OUT_CIRC = new Easing(21);
    
    /**
     * Elastic tweening, with offshoot on start.
     */
    public static final Easing EASE_IN_ELASTIC = new Easing(22);
    
    /**
     * Elastic tweening, with offshoot on end, inverse of
     *   {@code ADW_EASE_IN_ELASTIC}.
     */
    public static final Easing EASE_OUT_ELASTIC = new Easing(23);
    
    /**
     * Elastic tweening, with offshoot on both ends,
     *   combining {@code ADW_EASE_IN_ELASTIC} and {@code ADW_EASE_OUT_ELASTIC}.
     */
    public static final Easing EASE_IN_OUT_ELASTIC = new Easing(24);
    
    /**
     * Overshooting cubic tweening, with backtracking on start.
     */
    public static final Easing EASE_IN_BACK = new Easing(25);
    
    /**
     * Overshooting cubic tweening, with backtracking on end,
     *   inverse of {@code ADW_EASE_IN_BACK}.
     */
    public static final Easing EASE_OUT_BACK = new Easing(26);
    
    /**
     * Overshooting cubic tweening, with backtracking on both
     *   ends, combining {@code ADW_EASE_IN_BACK} and {@code ADW_EASE_OUT_BACK}.
     */
    public static final Easing EASE_IN_OUT_BACK = new Easing(27);
    
    /**
     * Exponentially decaying parabolic (bounce) tweening,
     *   on start.
     */
    public static final Easing EASE_IN_BOUNCE = new Easing(28);
    
    /**
     * Exponentially decaying parabolic (bounce) tweening,
     *   with bounce on end, inverse of {@code ADW_EASE_IN_BOUNCE}.
     */
    public static final Easing EASE_OUT_BOUNCE = new Easing(29);
    
    /**
     * Exponentially decaying parabolic (bounce) tweening,
     *   with bounce on both ends, combining {@code ADW_EASE_IN_BOUNCE} and
     *   {@code ADW_EASE_OUT_BOUNCE}.
     */
    public static final Easing EASE_IN_OUT_BOUNCE = new Easing(30);
    
    public Easing(int value) {
        super(value);
    }
    
    /**
     * Computes easing with {@code easing} for {@code value}.
     * <p>
     * {@code value} should generally be in the [0, 1] range.
     * @param self an easing value
     * @param value a value to ease
     * @return the easing for {@code value}
     */
    public static double ease(@NotNull org.gnome.adw.Easing self, double value) {
        java.util.Objects.requireNonNull(self, "Parameter 'self' must not be null");
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_easing_ease.invokeExact(
                    self.getValue(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_easing_ease = Interop.downcallHandle(
            "adw_easing_ease",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE)
        );
    }
}
