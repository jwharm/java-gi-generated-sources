package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Renders a toggle button in a cell
 * 
 * `GtkCellRendererToggle` renders a toggle button in a cell. The
 * button is drawn as a radio or a checkbutton, depending on the
 * `GtkCellRendererToggle:radio` property.
 * When activated, it emits the `GtkCellRendererToggle::toggled` signal.
 */
public class CellRendererToggle extends CellRenderer {

    public CellRendererToggle(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CellRendererToggle */
    public static CellRendererToggle castFrom(org.gtk.gobject.Object gobject) {
        return new CellRendererToggle(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkCellRendererToggle`. Adjust rendering
     * parameters using object properties. Object properties can be set
     * globally (with g_object_set()). Also, with `GtkTreeViewColumn`, you
     * can bind a property to a value in a `GtkTreeModel`. For example, you
     * can bind the “active” property on the cell renderer to a boolean value
     * in the model, thus causing the check button to reflect the state of
     * the model.
     */
    public CellRendererToggle() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_toggle_new(), false));
    }
    
    /**
     * Returns whether the cell renderer is activatable. See
     * gtk_cell_renderer_toggle_set_activatable().
     */
    public boolean getActivatable() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_toggle_get_activatable(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the cell renderer is active. See
     * gtk_cell_renderer_toggle_set_active().
     */
    public boolean getActive() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_toggle_get_active(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether we’re rendering radio toggles rather than checkboxes.
     */
    public boolean getRadio() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_toggle_get_radio(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Makes the cell renderer activatable.
     */
    public void setActivatable(boolean setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_toggle_set_activatable(HANDLE(), setting ? 1 : 0);
    }
    
    /**
     * Activates or deactivates a cell renderer.
     */
    public void setActive(boolean setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_toggle_set_active(HANDLE(), setting ? 1 : 0);
    }
    
    /**
     * If @radio is %TRUE, the cell renderer renders a radio toggle
     * (i.e. a toggle in a group of mutually-exclusive toggles).
     * If %FALSE, it renders a check toggle (a standalone boolean option).
     * This can be set globally for the cell renderer, or changed just
     * before rendering each cell in the model (for `GtkTreeView`, you set
     * up a per-row setting using `GtkTreeViewColumn` to associate model
     * columns with cell renderer properties).
     */
    public void setRadio(boolean radio) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_toggle_set_radio(HANDLE(), radio ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ToggledHandler {
        void signalReceived(CellRendererToggle source, java.lang.String path);
    }
    
    /**
     * The ::toggled signal is emitted when the cell is toggled.
     * 
     * It is the responsibility of the application to update the model
     * with the correct value to store at @path.  Often this is simply the
     * opposite of the value currently stored at @path.
     */
    public void onToggled(ToggledHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCellRendererToggleToggled", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("toggled").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
