package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Renders a toggle button in a cell
 * <p>
 * {@code GtkCellRendererToggle} renders a toggle button in a cell. The
 * button is drawn as a radio or a checkbutton, depending on the
 * {@code GtkCellRendererToggle:radio} property.
 * When activated, it emits the {@code GtkCellRendererToggle::toggled} signal.
 */
public class CellRendererToggle extends CellRenderer {

    public CellRendererToggle(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CellRendererToggle */
    public static CellRendererToggle castFrom(org.gtk.gobject.Object gobject) {
        return new CellRendererToggle(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_cell_renderer_toggle_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellRendererToggle}. Adjust rendering
     * parameters using object properties. Object properties can be set
     * globally (with g_object_set()). Also, with {@code GtkTreeViewColumn}, you
     * can bind a property to a value in a {@code GtkTreeModel}. For example, you
     * can bind the “active” property on the cell renderer to a boolean value
     * in the model, thus causing the check button to reflect the state of
     * the model.
     */
    public CellRendererToggle() {
        super(constructNew());
    }
    
    /**
     * Returns whether the cell renderer is activatable. See
     * gtk_cell_renderer_toggle_set_activatable().
     */
    public boolean getActivatable() {
        var RESULT = gtk_h.gtk_cell_renderer_toggle_get_activatable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the cell renderer is active. See
     * gtk_cell_renderer_toggle_set_active().
     */
    public boolean getActive() {
        var RESULT = gtk_h.gtk_cell_renderer_toggle_get_active(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether we’re rendering radio toggles rather than checkboxes.
     */
    public boolean getRadio() {
        var RESULT = gtk_h.gtk_cell_renderer_toggle_get_radio(handle());
        return (RESULT != 0);
    }
    
    /**
     * Makes the cell renderer activatable.
     */
    public void setActivatable(boolean setting) {
        gtk_h.gtk_cell_renderer_toggle_set_activatable(handle(), setting ? 1 : 0);
    }
    
    /**
     * Activates or deactivates a cell renderer.
     */
    public void setActive(boolean setting) {
        gtk_h.gtk_cell_renderer_toggle_set_active(handle(), setting ? 1 : 0);
    }
    
    /**
     * If {@code radio} is <code>true</code>, the cell renderer renders a radio toggle
     * (i.e. a toggle in a group of mutually-exclusive toggles).
     * If <code>false</code>, it renders a check toggle (a standalone boolean option).
     * This can be set globally for the cell renderer, or changed just
     * before rendering each cell in the model (for {@code GtkTreeView}, you set
     * up a per-row setting using {@code GtkTreeViewColumn} to associate model
     * columns with cell renderer properties).
     */
    public void setRadio(boolean radio) {
        gtk_h.gtk_cell_renderer_toggle_set_radio(handle(), radio ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ToggledHandler {
        void signalReceived(CellRendererToggle source, java.lang.String path);
    }
    
    /**
     * The ::toggled signal is emitted when the cell is toggled.
     * <p>
     * It is the responsibility of the application to update the model
     * with the correct value to store at {@code path}.  Often this is simply the
     * opposite of the value currently stored at {@code path}.
     */
    public SignalHandle onToggled(ToggledHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCellRendererToggleToggled", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("toggled").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
