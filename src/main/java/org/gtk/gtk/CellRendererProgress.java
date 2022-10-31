package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Renders numbers as progress bars
 * <p>
 * {@code GtkCellRendererProgress} renders a numeric value as a progress par in a cell.
 * Additionally, it can display a text on top of the progress bar.
 */
public class CellRendererProgress extends org.gtk.gtk.CellRenderer implements org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellRendererProgress";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public CellRendererProgress(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to CellRendererProgress if its GType is a (or inherits from) "GtkCellRendererProgress".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "CellRendererProgress" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCellRendererProgress", a ClassCastException will be thrown.
     */
    public static CellRendererProgress castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkCellRendererProgress"))) {
            return new CellRendererProgress(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCellRendererProgress");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_cell_renderer_progress_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellRendererProgress}.
     */
    public CellRendererProgress() {
        super(constructNew());
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_renderer_progress_new = Interop.downcallHandle(
            "gtk_cell_renderer_progress_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
}
