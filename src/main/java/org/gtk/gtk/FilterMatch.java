package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the known strictness of a filter.
 * <p>
 * Note that for filters where the strictness is not known,
 * {@link FilterMatch#SOME} is always an acceptable value,
 * even if a filter does match all or no items.
 */
public enum FilterMatch implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The filter matches some items,
     *   gtk_filter_match() may return {@code true} or {@code false}
     */
    SOME(0),
    
    /**
     * The filter does not match any item,
     *   gtk_filter_match() will always return {@code false}.
     */
    NONE(1),
    
    /**
     * The filter matches all items,
     *   gtk_filter_match() will alays return {@code true}.
     */
    ALL(2);
    
    private static final java.lang.String C_TYPE_NAME = "GtkFilterMatch";
    
    private final int value;
    
    /**
     * Create a new FilterMatch for the provided value
     * @param numeric value the enum value
     */
    FilterMatch(int value) {
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
     * Create a new FilterMatch for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static FilterMatch of(int value) {
        return switch (value) {
            case 0 -> SOME;
            case 1 -> NONE;
            case 2 -> ALL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
