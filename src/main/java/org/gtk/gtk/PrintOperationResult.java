package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The result of a print operation.
 * <p>
 * A value of this type is returned by {@link PrintOperation#run}.
 */
public enum PrintOperationResult implements io.github.jwharm.javagi.Enumeration {
    /**
     * An error has occurred.
     */
    ERROR(0),
    /**
     * The print settings should be stored.
     */
    APPLY(1),
    /**
     * The print operation has been canceled,
     *   the print settings should not be stored.
     */
    CANCEL(2),
    /**
     * The print operation is not complete
     *   yet. This value will only be returned when running asynchronously.
     */
    IN_PROGRESS(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkPrintOperationResult";
    
    private final int value;
    PrintOperationResult(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PrintOperationResult of(int value) {
        return switch (value) {
            case 0 -> ERROR;
            case 1 -> APPLY;
            case 2 -> CANCEL;
            case 3 -> IN_PROGRESS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
