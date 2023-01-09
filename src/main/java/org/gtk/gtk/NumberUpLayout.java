package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used to determine the layout of pages on a sheet when printing
 * multiple pages per sheet.
 */
public enum NumberUpLayout implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * <img src="./doc-files/layout-lrtb.png" alt="">
     */
    LRTB(0),
    
    /**
     * <img src="./doc-files/layout-lrbt.png" alt="">
     */
    LRBT(1),
    
    /**
     * <img src="./doc-files/layout-rltb.png" alt="">
     */
    RLTB(2),
    
    /**
     * <img src="./doc-files/layout-rlbt.png" alt="">
     */
    RLBT(3),
    
    /**
     * <img src="./doc-files/layout-tblr.png" alt="">
     */
    TBLR(4),
    
    /**
     * <img src="./doc-files/layout-tbrl.png" alt="">
     */
    TBRL(5),
    
    /**
     * <img src="./doc-files/layout-btlr.png" alt="">
     */
    BTLR(6),
    
    /**
     * <img src="./doc-files/layout-btrl.png" alt="">
     */
    BTRL(7);
    
    private static final java.lang.String C_TYPE_NAME = "GtkNumberUpLayout";
    
    private final int value;
    
    /**
     * Create a new NumberUpLayout for the provided value
     * @param numeric value the enum value
     */
    NumberUpLayout(int value) {
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
     * Create a new NumberUpLayout for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static NumberUpLayout of(int value) {
        return switch (value) {
            case 0 -> LRTB;
            case 1 -> LRBT;
            case 2 -> RLTB;
            case 3 -> RLBT;
            case 4 -> TBLR;
            case 5 -> TBRL;
            case 6 -> BTLR;
            case 7 -> BTRL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
