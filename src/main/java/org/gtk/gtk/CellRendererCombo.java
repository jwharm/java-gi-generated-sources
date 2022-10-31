package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class CellRendererCombo extends org.gtk.gtk.CellRendererText {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellRendererCombo";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public CellRendererCombo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to CellRendererCombo if its GType is a (or inherits from) "GtkCellRendererCombo".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "CellRendererCombo" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCellRendererCombo", a ClassCastException will be thrown.
     */
    public static CellRendererCombo castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkCellRendererCombo"))) {
            return new CellRendererCombo(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCellRendererCombo");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_cell_renderer_combo_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
    public interface Changed {
        void signalReceived(CellRendererCombo source, @NotNull java.lang.String pathString, @NotNull org.gtk.gtk.TreeIter newIter);
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
    public Signal<CellRendererCombo.Changed> onChanged(CellRendererCombo.Changed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellRendererCombo.Callbacks.class, "signalCellRendererComboChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<CellRendererCombo.Changed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_renderer_combo_new = Interop.downcallHandle(
            "gtk_cell_renderer_combo_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalCellRendererComboChanged(MemoryAddress source, MemoryAddress pathString, MemoryAddress newIter, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (CellRendererCombo.Changed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new CellRendererCombo(Refcounted.get(source)), Interop.getStringFrom(pathString), new org.gtk.gtk.TreeIter(Refcounted.get(newIter, false)));
        }
    }
}
