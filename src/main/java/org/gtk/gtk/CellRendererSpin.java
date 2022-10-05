package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
public class CellRendererSpin extends CellRendererText {

    public CellRendererSpin(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CellRendererSpin */
    public static CellRendererSpin castFrom(org.gtk.gobject.Object gobject) {
        return new CellRendererSpin(gobject.refcounted());
    }
    
    static final MethodHandle gtk_cell_renderer_spin_new = Interop.downcallHandle(
        "gtk_cell_renderer_spin_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_cell_renderer_spin_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkCellRendererSpin}.
     */
    public CellRendererSpin() {
        super(constructNew());
    }
    
}
