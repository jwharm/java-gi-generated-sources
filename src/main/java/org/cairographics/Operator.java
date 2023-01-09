package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum Operator implements io.github.jwharm.javagi.Enumeration {
    
    CLEAR(0),
    
    SOURCE(1),
    
    OVER(2),
    
    IN(3),
    
    OUT(4),
    
    ATOP(5),
    
    DEST(6),
    
    DEST_OVER(7),
    
    DEST_IN(8),
    
    DEST_OUT(9),
    
    DEST_ATOP(10),
    
    XOR(11),
    
    ADD(12),
    
    SATURATE(13),
    
    MULTIPLY(14),
    
    SCREEN(15),
    
    OVERLAY(16),
    
    DARKEN(17),
    
    LIGHTEN(18),
    
    COLOR_DODGE(19),
    
    COLOR_BURN(20),
    
    HARD_LIGHT(21),
    
    SOFT_LIGHT(22),
    
    DIFFERENCE(23),
    
    EXCLUSION(24),
    
    HSL_HUE(25),
    
    HSL_SATURATION(26),
    
    HSL_COLOR(27),
    
    HSL_LUMINOSITY(28);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_operator_t";
    
    private final int value;
    
    /**
     * Create a new Operator for the provided value
     * @param numeric value the enum value
     */
    Operator(int value) {
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
     * Create a new Operator for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Operator of(int value) {
        return switch (value) {
            case 0 -> CLEAR;
            case 1 -> SOURCE;
            case 2 -> OVER;
            case 3 -> IN;
            case 4 -> OUT;
            case 5 -> ATOP;
            case 6 -> DEST;
            case 7 -> DEST_OVER;
            case 8 -> DEST_IN;
            case 9 -> DEST_OUT;
            case 10 -> DEST_ATOP;
            case 11 -> XOR;
            case 12 -> ADD;
            case 13 -> SATURATE;
            case 14 -> MULTIPLY;
            case 15 -> SCREEN;
            case 16 -> OVERLAY;
            case 17 -> DARKEN;
            case 18 -> LIGHTEN;
            case 19 -> COLOR_DODGE;
            case 20 -> COLOR_BURN;
            case 21 -> HARD_LIGHT;
            case 22 -> SOFT_LIGHT;
            case 23 -> DIFFERENCE;
            case 24 -> EXCLUSION;
            case 25 -> HSL_HUE;
            case 26 -> HSL_SATURATION;
            case 27 -> HSL_COLOR;
            case 28 -> HSL_LUMINOSITY;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
