package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible values for the {@link AccessibleProperty#SORT}
 * accessible property.
 */
public enum AccessibleSort implements io.github.jwharm.javagi.Enumeration {
    /**
     * There is no defined sort applied to the column.
     */
    NONE(0),
    /**
     * Items are sorted in ascending order by this column.
     */
    ASCENDING(1),
    /**
     * Items are sorted in descending order by this column.
     */
    DESCENDING(2),
    /**
     * A sort algorithm other than ascending or
     *    descending has been applied.
     */
    OTHER(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkAccessibleSort";
    
    private final int value;
    AccessibleSort(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static AccessibleSort of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> ASCENDING;
            case 2 -> DESCENDING;
            case 3 -> OTHER;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
