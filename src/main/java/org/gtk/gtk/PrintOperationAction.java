package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Determines what action the print operation should perform.
 * <p>
 * A parameter of this typs is passed to {@link PrintOperation#run}.
 */
public enum PrintOperationAction implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Show the print dialog.
     */
    PRINT_DIALOG(0),
    
    /**
     * Start to print without showing
     *   the print dialog, based on the current print settings.
     */
    PRINT(1),
    
    /**
     * Show the print preview.
     */
    PREVIEW(2),
    
    /**
     * Export to a file. This requires
     *   the export-filename property to be set.
     */
    EXPORT(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkPrintOperationAction";
    
    private final int value;
    
    /**
     * Create a new PrintOperationAction for the provided value
     * @param numeric value the enum value
     */
    PrintOperationAction(int value) {
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
     * Create a new PrintOperationAction for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static PrintOperationAction of(int value) {
        return switch (value) {
            case 0 -> PRINT_DIALOG;
            case 1 -> PRINT;
            case 2 -> PREVIEW;
            case 3 -> EXPORT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
