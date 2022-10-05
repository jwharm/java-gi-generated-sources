package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Renders a combobox in a cell
 * <p>
 * {@code GtkCellRendererCombo} renders text in a cell like {@code GtkCellRendererText} from
 * which it is derived. But while {@code GtkCellRendererText} offers a simple entry to
 * edit the text, {@code GtkCellRendererCombo} offers a {@code GtkComboBox}
 * widget to edit the text. The values to display in the combo box are taken from
 * the tree model specified in the {@code GtkCellRendererCombo}:model property.
 * <p>
 * The combo cell renderer takes care of adding a text cell renderer to the combo
 * box and sets it to display the column specified by its
 * {@code GtkCellRendererCombo}:text-column property. Further properties of the combo box
 * can be set in a handler for the {@code GtkCellRenderer::editing-started} signal.
 */
public class CellRendererCombo extends CellRendererText {

    public CellRendererCombo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CellRendererCombo */
    public static CellRendererCombo castFrom(org.gtk.gobject.Object gobject) {
        return new CellRendererCombo(gobject.refcounted());
    }
    
    static final MethodHandle gtk_cell_renderer_combo_new = Interop.downcallHandle(
        "gtk_cell_renderer_combo_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_cell_renderer_combo_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkCellRendererCombo}.
     * Adjust how text is drawn using object properties.
     * Object properties can be set globally (with g_object_set()).
     * Also, with {@code GtkTreeViewColumn}, you can bind a property to a value
     * in a {@code GtkTreeModel}. For example, you can bind the “text” property
     * on the cell renderer to a string value in the model, thus rendering
     * a different string in each row of the {@code GtkTreeView}.
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
     * changes made to a selected item in the entry.  The argument {@code new_iter}
     * corresponds to the newly selected item in the combo box and it is relative
     * to the GtkTreeModel set via the model property on GtkCellRendererCombo.
     * <p>
     * Note that as soon as you change the model displayed in the tree view,
     * the tree view will immediately cease the editing operating.  This
     * means that you most probably want to refrain from changing the model
     * until the combo cell renderer emits the edited or editing_canceled signal.
     */
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellRendererCombo.Callbacks.class, "signalCellRendererComboChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalCellRendererComboChanged(MemoryAddress source, MemoryAddress pathString, MemoryAddress newIter, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (CellRendererCombo.ChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new CellRendererCombo(Refcounted.get(source)), pathString.getUtf8String(0), new TreeIter(Refcounted.get(newIter, false)));
        }
        
    }
}
