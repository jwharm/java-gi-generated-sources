package org.gnome.adw;

/**
 * Describes the available easing functions for use with
 * {@link TimedAnimation}.
 * <p>
 * New values may be added to this enumeration over time.
 */
public enum Easing {

    /**
     * Linear tweening.
     */
    LINEAR,
    
    /**
     * Quadratic tweening.
     */
    EASE_IN_QUAD,
    
    /**
     * Quadratic tweening, inverse of {@code ADW_EASE_IN_QUAD}.
     */
    EASE_OUT_QUAD,
    
    /**
     * Quadratic tweening, combining {@code ADW_EASE_IN_QUAD} and
     *   {@code ADW_EASE_OUT_QUAD}.
     */
    EASE_IN_OUT_QUAD,
    
    /**
     * Cubic tweening.
     */
    EASE_IN_CUBIC,
    
    /**
     * Cubic tweening, inverse of {@code ADW_EASE_IN_CUBIC}.
     */
    EASE_OUT_CUBIC,
    
    /**
     * Cubic tweening, combining {@code ADW_EASE_IN_CUBIC} and
     *   {@code ADW_EASE_OUT_CUBIC}.
     */
    EASE_IN_OUT_CUBIC,
    
    /**
     * Quartic tweening.
     */
    EASE_IN_QUART,
    
    /**
     * Quartic tweening, inverse of {@code ADW_EASE_IN_QUART}.
     */
    EASE_OUT_QUART,
    
    /**
     * Quartic tweening, combining {@code ADW_EASE_IN_QUART} and
     *   {@code ADW_EASE_OUT_QUART}.
     */
    EASE_IN_OUT_QUART,
    
    /**
     * Quintic tweening.
     */
    EASE_IN_QUINT,
    
    /**
     * Quintic tweening, inverse of {@code ADW_EASE_IN_QUINT}.
     */
    EASE_OUT_QUINT,
    
    /**
     * Quintic tweening, combining {@code ADW_EASE_IN_QUINT} and
     *   {@code ADW_EASE_OUT_QUINT}.
     */
    EASE_IN_OUT_QUINT,
    
    /**
     * Sine wave tweening.
     */
    EASE_IN_SINE,
    
    /**
     * Sine wave tweening, inverse of {@code ADW_EASE_IN_SINE}.
     */
    EASE_OUT_SINE,
    
    /**
     * Sine wave tweening, combining {@code ADW_EASE_IN_SINE} and
     *   {@code ADW_EASE_OUT_SINE}.
     */
    EASE_IN_OUT_SINE,
    
    /**
     * Exponential tweening.
     */
    EASE_IN_EXPO,
    
    /**
     * Exponential tweening, inverse of {@code ADW_EASE_IN_EXPO}.
     */
    EASE_OUT_EXPO,
    
    /**
     * Exponential tweening, combining {@code ADW_EASE_IN_EXPO} and
     *   {@code ADW_EASE_OUT_EXPO}.
     */
    EASE_IN_OUT_EXPO,
    
    /**
     * Circular tweening.
     */
    EASE_IN_CIRC,
    
    /**
     * Circular tweening, inverse of {@code ADW_EASE_IN_CIRC}.
     */
    EASE_OUT_CIRC,
    
    /**
     * Circular tweening, combining {@code ADW_EASE_IN_CIRC} and
     *   {@code ADW_EASE_OUT_CIRC}.
     */
    EASE_IN_OUT_CIRC,
    
    /**
     * Elastic tweening, with offshoot on start.
     */
    EASE_IN_ELASTIC,
    
    /**
     * Elastic tweening, with offshoot on end, inverse of
     *   {@code ADW_EASE_IN_ELASTIC}.
     */
    EASE_OUT_ELASTIC,
    
    /**
     * Elastic tweening, with offshoot on both ends,
     *   combining {@code ADW_EASE_IN_ELASTIC} and {@code ADW_EASE_OUT_ELASTIC}.
     */
    EASE_IN_OUT_ELASTIC,
    
    /**
     * Overshooting cubic tweening, with backtracking on start.
     */
    EASE_IN_BACK,
    
    /**
     * Overshooting cubic tweening, with backtracking on end,
     *   inverse of {@code ADW_EASE_IN_BACK}.
     */
    EASE_OUT_BACK,
    
    /**
     * Overshooting cubic tweening, with backtracking on both
     *   ends, combining {@code ADW_EASE_IN_BACK} and {@code ADW_EASE_OUT_BACK}.
     */
    EASE_IN_OUT_BACK,
    
    /**
     * Exponentially decaying parabolic (bounce) tweening,
     *   on start.
     */
    EASE_IN_BOUNCE,
    
    /**
     * Exponentially decaying parabolic (bounce) tweening,
     *   with bounce on end, inverse of {@code ADW_EASE_IN_BOUNCE}.
     */
    EASE_OUT_BOUNCE,
    
    /**
     * Exponentially decaying parabolic (bounce) tweening,
     *   with bounce on both ends, combining {@code ADW_EASE_IN_BOUNCE} and
     *   {@code ADW_EASE_OUT_BOUNCE}.
     */
    EASE_IN_OUT_BOUNCE;
    
    public static Easing fromValue(int value) {
        return switch(value) {
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
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case LINEAR -> 0;
            case EASE_IN_QUAD -> 1;
            case EASE_OUT_QUAD -> 2;
            case EASE_IN_OUT_QUAD -> 3;
            case EASE_IN_CUBIC -> 4;
            case EASE_OUT_CUBIC -> 5;
            case EASE_IN_OUT_CUBIC -> 6;
            case EASE_IN_QUART -> 7;
            case EASE_OUT_QUART -> 8;
            case EASE_IN_OUT_QUART -> 9;
            case EASE_IN_QUINT -> 10;
            case EASE_OUT_QUINT -> 11;
            case EASE_IN_OUT_QUINT -> 12;
            case EASE_IN_SINE -> 13;
            case EASE_OUT_SINE -> 14;
            case EASE_IN_OUT_SINE -> 15;
            case EASE_IN_EXPO -> 16;
            case EASE_OUT_EXPO -> 17;
            case EASE_IN_OUT_EXPO -> 18;
            case EASE_IN_CIRC -> 19;
            case EASE_OUT_CIRC -> 20;
            case EASE_IN_OUT_CIRC -> 21;
            case EASE_IN_ELASTIC -> 22;
            case EASE_OUT_ELASTIC -> 23;
            case EASE_IN_OUT_ELASTIC -> 24;
            case EASE_IN_BACK -> 25;
            case EASE_OUT_BACK -> 26;
            case EASE_IN_OUT_BACK -> 27;
            case EASE_IN_BOUNCE -> 28;
            case EASE_OUT_BOUNCE -> 29;
            case EASE_IN_OUT_BOUNCE -> 30;
        };
    }

}
