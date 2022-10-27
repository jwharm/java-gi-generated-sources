package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Renders a spin button in a cell
 * <p>
 * {@code GtkCellRendererSpin} renders text in a cell like {@code GtkCellRendererText} from
 * which it is derived. But while {@code GtkCellRendererText} offers a simple entry to
 * edit the text, {@code GtkCellRendererSpin} offers a {@code GtkSpinButton} widget. Of course,
 * that means that the text has to be parseable as a floating point number.
 * <p>
 * The range of the spinbutton is taken from the adjustment property of the
 * cell renderer, which can be set explicitly or mapped to a column in the
 * tree model, like all properties of cell renders. {@code GtkCellRendererSpin}
 * also has properties for the {@code GtkCellRendererSpin:climb-rate} and the number
 * of {@code GtkCellRendererSpin:digits} to display. Other {@code GtkSpinButton} properties
 * can be set in a handler for the {@code GtkCellRenderer::editing-started} signal.
 * <p>
 * The {@code GtkCellRendererSpin} cell renderer was added in GTK 2.10.
 */
public class CellRendererSpin extends org.gtk.gtk.CellRendererText {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public CellRendererSpin(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CellRendererSpin */
    public static CellRendererSpin castFrom(org.gtk.gobject.Object gobject) {
        return new CellRendererSpin(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_cell_renderer_spin_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellRendererSpin}.
     */
    public CellRendererSpin() {
        super(constructNew());
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_renderer_spin_new = Interop.downcallHandle(
            "gtk_cell_renderer_spin_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
}
