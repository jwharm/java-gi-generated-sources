package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Renders numbers as progress bars
 * <p>
 * {@code GtkCellRendererProgress} renders a numeric value as a progress par in a cell.
 * Additionally, it can display a text on top of the progress bar.
 */
public class CellRendererProgress extends CellRenderer implements Orientable {

    public CellRendererProgress(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CellRendererProgress */
    public static CellRendererProgress castFrom(org.gtk.gobject.Object gobject) {
        return new CellRendererProgress(gobject.refcounted());
    }
    
    static final MethodHandle gtk_cell_renderer_progress_new = Interop.downcallHandle(
        "gtk_cell_renderer_progress_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_cell_renderer_progress_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkCellRendererProgress}.
     */
    public CellRendererProgress() {
        super(constructNew());
    }
    
}
