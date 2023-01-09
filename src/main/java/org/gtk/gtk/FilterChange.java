package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes changes in a filter in more detail and allows objects
 * using the filter to optimize refiltering items.
 * <p>
 * If you are writing an implementation and are not sure which
 * value to pass, {@link FilterChange#DIFFERENT} is always a correct
 * choice.
 */
public enum FilterChange implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The filter change cannot be
     *   described with any of the other enumeration values.
     */
    DIFFERENT(0),
    
    /**
     * The filter is less strict than
     *   it was before: All items that it used to return {@code true} for
     *   still return {@code true}, others now may, too.
     */
    LESS_STRICT(1),
    
    /**
     * The filter is more strict than
     *   it was before: All items that it used to return {@code false} for
     *   still return {@code false}, others now may, too.
     */
    MORE_STRICT(2);
    
    private static final java.lang.String C_TYPE_NAME = "GtkFilterChange";
    
    private final int value;
    
    /**
     * Create a new FilterChange for the provided value
     * @param numeric value the enum value
     */
    FilterChange(int value) {
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
     * Create a new FilterChange for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static FilterChange of(int value) {
        return switch (value) {
            case 0 -> DIFFERENT;
            case 1 -> LESS_STRICT;
            case 2 -> MORE_STRICT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
