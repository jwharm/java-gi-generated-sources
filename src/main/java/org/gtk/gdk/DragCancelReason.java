package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used in {@code GdkDrag} to the reason of a cancelled DND operation.
 */
public enum DragCancelReason implements io.github.jwharm.javagi.Enumeration {
    /**
     * There is no suitable drop target.
     */
    NO_TARGET(0),
    /**
     * Drag cancelled by the user
     */
    USER_CANCELLED(1),
    /**
     * Unspecified error.
     */
    ERROR(2);
    
    private static final java.lang.String C_TYPE_NAME = "GdkDragCancelReason";
    
    private final int value;
    DragCancelReason(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static DragCancelReason of(int value) {
        return switch (value) {
            case 0 -> NO_TARGET;
            case 1 -> USER_CANCELLED;
            case 2 -> ERROR;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
