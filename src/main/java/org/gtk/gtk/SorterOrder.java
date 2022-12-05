package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the type of order that a {@code GtkSorter} may produce.
 */
public enum SorterOrder implements io.github.jwharm.javagi.Enumeration {
    /**
     * A partial order. Any {@code GtkOrdering} is possible.
     */
    PARTIAL(0),
    /**
     * No order, all elements are considered equal.
     *   gtk_sorter_compare() will only return {@link Ordering#EQUAL}.
     */
    NONE(1),
    /**
     * A total order. gtk_sorter_compare() will only
     *   return {@link Ordering#EQUAL} if an item is compared with itself. Two
     *   different items will never cause this value to be returned.
     */
    TOTAL(2);
    
    private static final java.lang.String C_TYPE_NAME = "GtkSorterOrder";
    
    private final int value;
    SorterOrder(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SorterOrder of(int value) {
        return switch (value) {
            case 0 -> PARTIAL;
            case 1 -> NONE;
            case 2 -> TOTAL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
