package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes changes in a sorter in more detail and allows users
 * to optimize resorting.
 */
public enum SorterChange implements io.github.jwharm.javagi.Enumeration {
    /**
     * The sorter change cannot be described
     *   by any of the other enumeration values
     */
    DIFFERENT(0),
    /**
     * The sort order was inverted. Comparisons
     *   that returned {@link Ordering#SMALLER} now return {@link Ordering#LARGER}
     *   and vice versa. Other comparisons return the same values as before.
     */
    INVERTED(1),
    /**
     * The sorter is less strict: Comparisons
     *   may now return {@link Ordering#EQUAL} that did not do so before.
     */
    LESS_STRICT(2),
    /**
     * The sorter is more strict: Comparisons
     *   that did return {@link Ordering#EQUAL} may not do so anymore.
     */
    MORE_STRICT(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkSorterChange";
    
    private final int value;
    SorterChange(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SorterChange of(int value) {
        return switch (value) {
            case 0 -> DIFFERENT;
            case 1 -> INVERTED;
            case 2 -> LESS_STRICT;
            case 3 -> MORE_STRICT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
