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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CellRendererSpinner proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CellRendererSpinner(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CellRendererSpinner if its GType is a (or inherits from) "GtkCellRendererSpinner".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CellRendererSpinner} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCellRendererSpinner", a ClassCastException will be thrown.
     */
    public static CellRendererSpinner castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkCellRendererSpinner"))) {
            return new CellRendererSpinner(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCellRendererSpinner");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_renderer_spinner_new.invokeExact();
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
        super(constructNew(), Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_renderer_spinner_new = Interop.downcallHandle(
            "gtk_cell_renderer_spinner_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
    }
}
