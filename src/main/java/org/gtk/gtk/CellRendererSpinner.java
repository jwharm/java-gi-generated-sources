package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Renders a spinning animation in a cell
 * <p>
 * {@code GtkCellRendererSpinner} renders a spinning animation in a cell, very
 * similar to {@code GtkSpinner}. It can often be used as an alternative
 * to a {@code GtkCellRendererProgress} for displaying indefinite activity,
 * instead of actual progress.
 * <p>
 * To start the animation in a cell, set the {@code GtkCellRendererSpinner:active}
 * property to {@code true} and increment the {@code GtkCellRendererSpinner:pulse} property
 * at regular intervals. The usual way to set the cell renderer properties
 * for each cell is to bind them to columns in your tree model using e.g.
 * gtk_tree_view_column_add_attribute().
 */
public class CellRendererSpinner extends org.gtk.gtk.CellRenderer {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellRendererSpinner";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public CellRendererSpinner(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to CellRendererSpinner if its GType is a (or inherits from) "GtkCellRendererSpinner".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "CellRendererSpinner" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCellRendererSpinner", a ClassCastException will be thrown.
     */
    public static CellRendererSpinner castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkCellRendererSpinner"))) {
            return new CellRendererSpinner(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCellRendererSpinner");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_cell_renderer_spinner_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns a new cell renderer which will show a spinner to indicate
     * activity.
     */
    public CellRendererSpinner() {
        super(constructNew());
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_renderer_spinner_new = Interop.downcallHandle(
            "gtk_cell_renderer_spinner_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
}
