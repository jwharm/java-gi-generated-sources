package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Interface for widgets that can be used for editing cells
 * <p>
 * The {@code GtkCellEditable} interface must be implemented for widgets to be usable
 * to edit the contents of a {@code GtkTreeView} cell. It provides a way to specify how
 * temporary widgets should be configured for editing, get the new value, etc.
 */
public interface CellEditable extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle gtk_cell_editable_editing_done = Interop.downcallHandle(
        "gtk_cell_editable_editing_done",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Emits the {@code GtkCellEditable::editing-done} signal.
     */
    public default void editingDone() {
        try {
            gtk_cell_editable_editing_done.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_editable_remove_widget = Interop.downcallHandle(
        "gtk_cell_editable_remove_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Emits the {@code GtkCellEditable::remove-widget} signal.
     */
    public default void removeWidget() {
        try {
            gtk_cell_editable_remove_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_editable_start_editing = Interop.downcallHandle(
        "gtk_cell_editable_start_editing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Begins editing on a {@code cell_editable}.
     * <p>
     * The {@code GtkCellRenderer} for the cell creates and returns a {@code GtkCellEditable} from
     * gtk_cell_renderer_start_editing(), configured for the {@code GtkCellRenderer} type.
     * <p>
     * gtk_cell_editable_start_editing() can then set up {@code cell_editable} suitably for
     * editing a cell, e.g. making the Esc key emit {@code GtkCellEditable::editing-done}.
     * <p>
     * Note that the {@code cell_editable} is created on-demand for the current edit; its
     * lifetime is temporary and does not persist across other edits and/or cells.
     */
    public default void startEditing(org.gtk.gdk.Event event) {
        try {
            gtk_cell_editable_start_editing.invokeExact(handle(), event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface EditingDoneHandler {
        void signalReceived(CellEditable source);
    }
    
    /**
     * This signal is a sign for the cell renderer to update its
     * value from the {@code cell_editable}.
     * <p>
     * Implementations of {@code GtkCellEditable} are responsible for
     * emitting this signal when they are done editing, e.g.
     * {@code GtkEntry} emits this signal when the user presses Enter. Typical things to
     * do in a handler for ::editing-done are to capture the edited value,
     * disconnect the {@code cell_editable} from signals on the {@code GtkCellRenderer}, etc.
     * <p>
     * gtk_cell_editable_editing_done() is a convenience method
     * for emitting {@code GtkCellEditable::editing-done}.
     */
    public default SignalHandle onEditingDone(EditingDoneHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("editing-done").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellEditable.Callbacks.class, "signalCellEditableEditingDone",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RemoveWidgetHandler {
        void signalReceived(CellEditable source);
    }
    
    /**
     * This signal is meant to indicate that the cell is finished
     * editing, and the {@code cell_editable} widget is being removed and may
     * subsequently be destroyed.
     * <p>
     * Implementations of {@code GtkCellEditable} are responsible for
     * emitting this signal when they are done editing. It must
     * be emitted after the {@code GtkCellEditable::editing-done} signal,
     * to give the cell renderer a chance to update the cell's value
     * before the widget is removed.
     * <p>
     * gtk_cell_editable_remove_widget() is a convenience method
     * for emitting {@code GtkCellEditable::remove-widget}.
     */
    public default SignalHandle onRemoveWidget(RemoveWidgetHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("remove-widget").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellEditable.Callbacks.class, "signalCellEditableRemoveWidget",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalCellEditableEditingDone(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (CellEditable.EditingDoneHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new CellEditable.CellEditableImpl(Refcounted.get(source)));
        }
        
        public static void signalCellEditableRemoveWidget(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (CellEditable.RemoveWidgetHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new CellEditable.CellEditableImpl(Refcounted.get(source)));
        }
        
    }
    
    class CellEditableImpl extends org.gtk.gobject.Object implements CellEditable {
        public CellEditableImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}