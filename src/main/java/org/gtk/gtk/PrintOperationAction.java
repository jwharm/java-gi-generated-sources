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
public class PrintOperationAction extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkPrintOperationAction";
    
    /**
     * Show the print dialog.
     */
    public static final PrintOperationAction PRINT_DIALOG = new PrintOperationAction(0);
    
    /**
     * Start to print without showing
     *   the print dialog, based on the current print settings.
     */
    public static final PrintOperationAction PRINT = new PrintOperationAction(1);
    
    /**
     * Show the print preview.
     */
    public static final PrintOperationAction PREVIEW = new PrintOperationAction(2);
    
    /**
     * Export to a file. This requires
     *   the export-filename property to be set.
     */
    public static final PrintOperationAction EXPORT = new PrintOperationAction(3);
    
    public PrintOperationAction(int value) {
        super(value);
    }
}
