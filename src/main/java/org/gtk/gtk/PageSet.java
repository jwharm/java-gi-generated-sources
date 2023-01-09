package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See also gtk_print_job_set_page_set().
 */
public enum PageSet implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * All pages.
     */
    ALL(0),
    
    /**
     * Even pages.
     */
    EVEN(1),
    
    /**
     * Odd pages.
     */
    ODD(2);
    
    private static final java.lang.String C_TYPE_NAME = "GtkPageSet";
    
    private final int value;
    
    /**
     * Create a new PageSet for the provided value
     * @param numeric value the enum value
     */
    PageSet(int value) {
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
     * Create a new PageSet for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static PageSet of(int value) {
        return switch (value) {
            case 0 -> ALL;
            case 1 -> EVEN;
            case 2 -> ODD;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
