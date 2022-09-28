package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
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
        return RESULT != 0;
    }
    
    /**
     * Returns whether the cell renderer is active. See
     * gtk_cell_renderer_toggle_set_active().
     */
    public boolean getActive() {
        var RESULT = gtk_h.gtk_cell_renderer_toggle_get_active(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether we’re rendering radio toggles rather than checkboxes.
     */
    public boolean getRadio() {
        var RESULT = gtk_h.gtk_cell_renderer_toggle_get_radio(handle());
        return RESULT != 0;
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
     * If {@code radio} is {@code true}, the cell renderer renders a radio toggle
     * (i.e. a toggle in a group of mutually-exclusive toggles).
     * If {@code false}, it renders a check toggle (a standalone boolean option).
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("toggled").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellRendererToggle.class, "__signalCellRendererToggleToggled",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalCellRendererToggleToggled(MemoryAddress source, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (CellRendererToggle.ToggledHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new CellRendererToggle(References.get(source)), path.getUtf8String(0));
    }
    
}
