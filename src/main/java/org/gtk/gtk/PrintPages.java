package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See also gtk_print_job_set_pages()
 */
public enum PrintPages implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * All pages.
     */
    ALL(0),
    
    /**
     * Current page.
     */
    CURRENT(1),
    
    /**
     * Range of pages.
     */
    RANGES(2),
    
    /**
     * Selected pages.
     */
    SELECTION(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkPrintPages";
    
    private final int value;
    
    /**
     * Create a new PrintPages for the provided value
     * @param numeric value the enum value
     */
    PrintPages(int value) {
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
     * Create a new PrintPages for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static PrintPages of(int value) {
        return switch (value) {
            case 0 -> ALL;
            case 1 -> CURRENT;
            case 2 -> RANGES;
            case 3 -> SELECTION;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
