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
public enum Easing implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Linear tweening.
     */
    LINEAR(0),
    
    /**
     * Quadratic tweening.
     */
    EASE_IN_QUAD(1),
    
    /**
     * Quadratic tweening, inverse of {@code ADW_EASE_IN_QUAD}.
     */
    EASE_OUT_QUAD(2),
    
    /**
     * Quadratic tweening, combining {@code ADW_EASE_IN_QUAD} and
     *   {@code ADW_EASE_OUT_QUAD}.
     */
    EASE_IN_OUT_QUAD(3),
    
    /**
     * Cubic tweening.
     */
    EASE_IN_CUBIC(4),
    
    /**
     * Cubic tweening, inverse of {@code ADW_EASE_IN_CUBIC}.
     */
    EASE_OUT_CUBIC(5),
    
    /**
     * Cubic tweening, combining {@code ADW_EASE_IN_CUBIC} and
     *   {@code ADW_EASE_OUT_CUBIC}.
     */
    EASE_IN_OUT_CUBIC(6),
    
    /**
     * Quartic tweening.
     */
    EASE_IN_QUART(7),
    
    /**
     * Quartic tweening, inverse of {@code ADW_EASE_IN_QUART}.
     */
    EASE_OUT_QUART(8),
    
    /**
     * Quartic tweening, combining {@code ADW_EASE_IN_QUART} and
     *   {@code ADW_EASE_OUT_QUART}.
     */
    EASE_IN_OUT_QUART(9),
    
    /**
     * Quintic tweening.
     */
    EASE_IN_QUINT(10),
    
    /**
     * Quintic tweening, inverse of {@code ADW_EASE_IN_QUINT}.
     */
    EASE_OUT_QUINT(11),
    
    /**
     * Quintic tweening, combining {@code ADW_EASE_IN_QUINT} and
     *   {@code ADW_EASE_OUT_QUINT}.
     */
    EASE_IN_OUT_QUINT(12),
    
    /**
     * Sine wave tweening.
     */
    EASE_IN_SINE(13),
    
    /**
     * Sine wave tweening, inverse of {@code ADW_EASE_IN_SINE}.
     */
    EASE_OUT_SINE(14),
    
    /**
     * Sine wave tweening, combining {@code ADW_EASE_IN_SINE} and
     *   {@code ADW_EASE_OUT_SINE}.
     */
    EASE_IN_OUT_SINE(15),
    
    /**
     * Exponential tweening.
     */
    EASE_IN_EXPO(16),
    
    /**
     * Exponential tweening, inverse of {@code ADW_EASE_IN_EXPO}.
     */
    EASE_OUT_EXPO(17),
    
    /**
     * Exponential tweening, combining {@code ADW_EASE_IN_EXPO} and
     *   {@code ADW_EASE_OUT_EXPO}.
     */
    EASE_IN_OUT_EXPO(18),
    
    /**
     * Circular tweening.
     */
    EASE_IN_CIRC(19),
    
    /**
     * Circular tweening, inverse of {@code ADW_EASE_IN_CIRC}.
     */
    EASE_OUT_CIRC(20),
    
    /**
     * Circular tweening, combining {@code ADW_EASE_IN_CIRC} and
     *   {@code ADW_EASE_OUT_CIRC}.
     */
    EASE_IN_OUT_CIRC(21),
    
    /**
     * Elastic tweening, with offshoot on start.
     */
    EASE_IN_ELASTIC(22),
    
    /**
     * Elastic tweening, with offshoot on end, inverse of
     *   {@code ADW_EASE_IN_ELASTIC}.
     */
    EASE_OUT_ELASTIC(23),
    
    /**
     * Elastic tweening, with offshoot on both ends,
     *   combining {@code ADW_EASE_IN_ELASTIC} and {@code ADW_EASE_OUT_ELASTIC}.
     */
    EASE_IN_OUT_ELASTIC(24),
    
    /**
     * Overshooting cubic tweening, with backtracking on start.
     */
    EASE_IN_BACK(25),
    
    /**
     * Overshooting cubic tweening, with backtracking on end,
     *   inverse of {@code ADW_EASE_IN_BACK}.
     */
    EASE_OUT_BACK(26),
    
    /**
     * Overshooting cubic tweening, with backtracking on both
     *   ends, combining {@code ADW_EASE_IN_BACK} and {@code ADW_EASE_OUT_BACK}.
     */
    EASE_IN_OUT_BACK(27),
    
    /**
     * Exponentially decaying parabolic (bounce) tweening,
     *   on start.
     */
    EASE_IN_BOUNCE(28),
    
    /**
     * Exponentially decaying parabolic (bounce) tweening,
     *   with bounce on end, inverse of {@code ADW_EASE_IN_BOUNCE}.
     */
    EASE_OUT_BOUNCE(29),
    
    /**
     * Exponentially decaying parabolic (bounce) tweening,
     *   with bounce on both ends, combining {@code ADW_EASE_IN_BOUNCE} and
     *   {@code ADW_EASE_OUT_BOUNCE}.
     */
    EASE_IN_OUT_BOUNCE(30);
    
    private static final java.lang.String C_TYPE_NAME = "AdwEasing";
    
    private final int value;
    
    /**
     * Create a new Easing for the provided value
     * @param numeric value the enum value
     */
    Easing(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new Easing for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Easing of(int value) {
        return switch (value) {
            case 0 -> LINEAR;
            case 1 -> EASE_IN_QUAD;
            case 2 -> EASE_OUT_QUAD;
            case 3 -> EASE_IN_OUT_QUAD;
            case 4 -> EASE_IN_CUBIC;
            case 5 -> EASE_OUT_CUBIC;
            case 6 -> EASE_IN_OUT_CUBIC;
            case 7 -> EASE_IN_QUART;
            case 8 -> EASE_OUT_QUART;
            case 9 -> EASE_IN_OUT_QUART;
            case 10 -> EASE_IN_QUINT;
            case 11 -> EASE_OUT_QUINT;
            case 12 -> EASE_IN_OUT_QUINT;
            case 13 -> EASE_IN_SINE;
            case 14 -> EASE_OUT_SINE;
            case 15 -> EASE_IN_OUT_SINE;
            case 16 -> EASE_IN_EXPO;
            case 17 -> EASE_OUT_EXPO;
            case 18 -> EASE_IN_OUT_EXPO;
            case 19 -> EASE_IN_CIRC;
            case 20 -> EASE_OUT_CIRC;
            case 21 -> EASE_IN_OUT_CIRC;
            case 22 -> EASE_IN_ELASTIC;
            case 23 -> EASE_OUT_ELASTIC;
            case 24 -> EASE_IN_OUT_ELASTIC;
            case 25 -> EASE_IN_BACK;
            case 26 -> EASE_OUT_BACK;
            case 27 -> EASE_IN_OUT_BACK;
            case 28 -> EASE_IN_BOUNCE;
            case 29 -> EASE_OUT_BOUNCE;
            case 30 -> EASE_IN_OUT_BOUNCE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Computes easing with {@code easing} for {@code value}.
     * <p>
     * {@code value} should generally be in the [0, 1] range.
     * @param self an easing value
     * @param value a value to ease
     * @return the easing for {@code value}
     */
    public static double ease(org.gnome.adw.Easing self, double value) {
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
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE),
                false
        );
    }
}
