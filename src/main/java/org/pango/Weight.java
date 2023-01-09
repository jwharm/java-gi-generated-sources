package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enumeration specifying the weight (boldness) of a font.
 * <p>
 * Weight is specified as a numeric value ranging from 100 to 1000.
 * This enumeration simply provides some common, predefined values.
 */
public enum Weight implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * the thin weight (= 100) Since: 1.24
     */
    THIN(100),
    
    /**
     * the ultralight weight (= 200)
     */
    ULTRALIGHT(200),
    
    /**
     * the light weight (= 300)
     */
    LIGHT(300),
    
    /**
     * the semilight weight (= 350) Since: 1.36.7
     */
    SEMILIGHT(350),
    
    /**
     * the book weight (= 380) Since: 1.24)
     */
    BOOK(380),
    
    /**
     * the default weight (= 400)
     */
    NORMAL(400),
    
    /**
     * the medium weight (= 500) Since: 1.24
     */
    MEDIUM(500),
    
    /**
     * the semibold weight (= 600)
     */
    SEMIBOLD(600),
    
    /**
     * the bold weight (= 700)
     */
    BOLD(700),
    
    /**
     * the ultrabold weight (= 800)
     */
    ULTRABOLD(800),
    
    /**
     * the heavy weight (= 900)
     */
    HEAVY(900),
    
    /**
     * the ultraheavy weight (= 1000) Since: 1.24
     */
    ULTRAHEAVY(1000);
    
    private static final java.lang.String C_TYPE_NAME = "PangoWeight";
    
    private final int value;
    
    /**
     * Create a new Weight for the provided value
     * @param numeric value the enum value
     */
    Weight(int value) {
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
     * Create a new Weight for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Weight of(int value) {
        return switch (value) {
            case 100 -> THIN;
            case 200 -> ULTRALIGHT;
            case 300 -> LIGHT;
            case 350 -> SEMILIGHT;
            case 380 -> BOOK;
            case 400 -> NORMAL;
            case 500 -> MEDIUM;
            case 600 -> SEMIBOLD;
            case 700 -> BOLD;
            case 800 -> ULTRABOLD;
            case 900 -> HEAVY;
            case 1000 -> ULTRAHEAVY;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
