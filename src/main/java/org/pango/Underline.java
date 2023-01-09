package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code PangoUnderline} enumeration is used to specify whether text
 * should be underlined, and if so, the type of underlining.
 */
public enum Underline implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * no underline should be drawn
     */
    NONE(0),
    
    /**
     * a single underline should be drawn
     */
    SINGLE(1),
    
    /**
     * a double underline should be drawn
     */
    DOUBLE(2),
    
    /**
     * a single underline should be drawn at a
     *   position beneath the ink extents of the text being
     *   underlined. This should be used only for underlining
     *   single characters, such as for keyboard accelerators.
     *   {@link Underline#SINGLE} should be used for extended
     *   portions of text.
     */
    LOW(3),
    
    /**
     * an underline indicating an error should
     *   be drawn below. The exact style of rendering is up to the
     *   {@code PangoRenderer} in use, but typical styles include wavy
     *   or dotted lines.
     *   This underline is typically used to indicate an error such
     *   as a possible mispelling; in some cases a contrasting color
     *   may automatically be used. This type of underlining is
     *   available since Pango 1.4.
     */
    ERROR(4),
    
    /**
     * Like {@code PANGO_UNDERLINE_SINGLE}, but
     *   drawn continuously across multiple runs. This type
     *   of underlining is available since Pango 1.46.
     */
    SINGLE_LINE(5),
    
    /**
     * Like {@code PANGO_UNDERLINE_DOUBLE}, but
     *   drawn continuously across multiple runs. This type
     *   of underlining is available since Pango 1.46.
     */
    DOUBLE_LINE(6),
    
    /**
     * Like {@code PANGO_UNDERLINE_ERROR}, but
     *   drawn continuously across multiple runs. This type
     *   of underlining is available since Pango 1.46.
     */
    ERROR_LINE(7);
    
    private static final java.lang.String C_TYPE_NAME = "PangoUnderline";
    
    private final int value;
    
    /**
     * Create a new Underline for the provided value
     * @param numeric value the enum value
     */
    Underline(int value) {
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
     * Create a new Underline for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static Underline of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> SINGLE;
            case 2 -> DOUBLE;
            case 3 -> LOW;
            case 4 -> ERROR;
            case 5 -> SINGLE_LINE;
            case 6 -> DOUBLE_LINE;
            case 7 -> ERROR_LINE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
