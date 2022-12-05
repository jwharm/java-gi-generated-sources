package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Determines how the size should be computed to achieve the one of the
 * visibility mode for the scrollbars.
 */
public enum PolicyType implements io.github.jwharm.javagi.Enumeration {
    /**
     * The scrollbar is always visible. The view size is
     *   independent of the content.
     */
    ALWAYS(0),
    /**
     * The scrollbar will appear and disappear as necessary.
     *   For example, when all of a {@code GtkTreeView} can not be seen.
     */
    AUTOMATIC(1),
    /**
     * The scrollbar should never appear. In this mode the
     *   content determines the size.
     */
    NEVER(2),
    /**
     * Don't show a scrollbar, but don't force the
     *   size to follow the content. This can be used e.g. to make multiple
     *   scrolled windows share a scrollbar.
     */
    EXTERNAL(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkPolicyType";
    
    private final int value;
    PolicyType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PolicyType of(int value) {
        return switch (value) {
            case 0 -> ALWAYS;
            case 1 -> AUTOMATIC;
            case 2 -> NEVER;
            case 3 -> EXTERNAL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
