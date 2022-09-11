package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Interface for widgets that can be used for editing cells
 * 
 * The `GtkCellEditable` interface must be implemented for widgets to be usable
 * to edit the contents of a `GtkTreeView` cell. It provides a way to specify how
 * temporary widgets should be configured for editing, get the new value, etc.
 */
public interface CellEditable extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Emits the `GtkCellEditable::editing-done` signal.
     */
    public default void editingDone() {
        gtk_h.gtk_cell_editable_editing_done(handle());
    }
    
    /**
     * Emits the `GtkCellEditable::remove-widget` signal.
     */
    public default void removeWidget() {
        gtk_h.gtk_cell_editable_remove_widget(handle());
    }
    
    /**
     * Begins editing on a @cell_editable.
     * 
     * The `GtkCellRenderer` for the cell creates and returns a `GtkCellEditable` from
     * gtk_cell_renderer_start_editing(), configured for the `GtkCellRenderer` type.
     * 
     * gtk_cell_editable_start_editing() can then set up @cell_editable suitably for
     * editing a cell, e.g. making the Esc key emit `GtkCellEditable::editing-done`.
     * 
     * Note that the @cell_editable is created on-demand for the current edit; its
     * lifetime is temporary and does not persist across other edits and/or cells.
     */
    public default void startEditing(org.gtk.gdk.Event event) {
        gtk_h.gtk_cell_editable_start_editing(handle(), event.handle());
    }
    
    @FunctionalInterface
    public interface EditingDoneHandler {
        void signalReceived(CellEditable source);
    }
    
    /**
     * This signal is a sign for the cell renderer to update its
     * value from the @cell_editable.
     * 
     * Implementations of `GtkCellEditable` are responsible for
     * emitting this signal when they are done editing, e.g.
     * `GtkEntry` emits this signal when the user presses Enter. Typical things to
     * do in a handler for ::editing-done are to capture the edited value,
     * disconnect the @cell_editable from signals on the `GtkCellRenderer`, etc.
     * 
     * gtk_cell_editable_editing_done() is a convenience method
     * for emitting `GtkCellEditable::editing-done`.
     */
    public default void onEditingDone(EditingDoneHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCellEditableEditingDone", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("editing-done").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface RemoveWidgetHandler {
        void signalReceived(CellEditable source);
    }
    
    /**
     * This signal is meant to indicate that the cell is finished
     * editing, and the @cell_editable widget is being removed and may
     * subsequently be destroyed.
     * 
     * Implementations of `GtkCellEditable` are responsible for
     * emitting this signal when they are done editing. It must
     * be emitted after the `GtkCellEditable::editing-done` signal,
     * to give the cell renderer a chance to update the cell's value
     * before the widget is removed.
     * 
     * gtk_cell_editable_remove_widget() is a convenience method
     * for emitting `GtkCellEditable::remove-widget`.
     */
    public default void onRemoveWidget(RemoveWidgetHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCellEditableRemoveWidget", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("remove-widget").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class CellEditableImpl extends org.gtk.gobject.Object implements CellEditable {
        public CellEditableImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
