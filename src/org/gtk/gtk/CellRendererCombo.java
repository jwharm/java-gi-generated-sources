package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Renders a combobox in a cell
 * 
 * `GtkCellRendererCombo` renders text in a cell like `GtkCellRendererText` from
 * which it is derived. But while `GtkCellRendererText` offers a simple entry to
 * edit the text, `GtkCellRendererCombo` offers a `GtkComboBox`
 * widget to edit the text. The values to display in the combo box are taken from
 * the tree model specified in the `GtkCellRendererCombo`:model property.
 * 
 * The combo cell renderer takes care of adding a text cell renderer to the combo
 * box and sets it to display the column specified by its
 * `GtkCellRendererCombo`:text-column property. Further properties of the combo box
 * can be set in a handler for the `GtkCellRenderer::editing-started` signal.
 */
public class CellRendererCombo extends CellRendererText {

    public CellRendererCombo(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CellRendererCombo */
    public static CellRendererCombo castFrom(org.gtk.gobject.Object gobject) {
        return new CellRendererCombo(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_cell_renderer_combo_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new `GtkCellRendererCombo`.
     * Adjust how text is drawn using object properties.
     * Object properties can be set globally (with g_object_set()).
     * Also, with `GtkTreeViewColumn`, you can bind a property to a value
     * in a `GtkTreeModel`. For example, you can bind the “text” property
     * on the cell renderer to a string value in the model, thus rendering
     * a different string in each row of the `GtkTreeView`.
     */
    public CellRendererCombo() {
        super(constructNew());
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(CellRendererCombo source, java.lang.String pathString, TreeIter newIter);
    }
    
    /**
     * This signal is emitted each time after the user selected an item in
     * the combo box, either by using the mouse or the arrow keys.  Contrary
     * to GtkComboBox, GtkCellRendererCombo::changed is not emitted for
     * changes made to a selected item in the entry.  The argument @new_iter
     * corresponds to the newly selected item in the combo box and it is relative
     * to the GtkTreeModel set via the model property on GtkCellRendererCombo.
     * 
     * Note that as soon as you change the model displayed in the tree view,
     * the tree view will immediately cease the editing operating.  This
     * means that you most probably want to refrain from changing the model
     * until the combo cell renderer emits the edited or editing_canceled signal.
     */
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCellRendererComboChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
