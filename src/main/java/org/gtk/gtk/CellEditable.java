package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Interface for widgets that can be used for editing cells
 * <p>
 * The {@code GtkCellEditable} interface must be implemented for widgets to be usable
 * to edit the contents of a {@code GtkTreeView} cell. It provides a way to specify how
 * temporary widgets should be configured for editing, get the new value, etc.
 */
public interface CellEditable extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CellEditableImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CellEditableImpl(input, ownership);
    
    /**
     * Emits the {@code GtkCellEditable::editing-done} signal.
     */
    default void editingDone() {
        try {
            DowncallHandles.gtk_cell_editable_editing_done.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits the {@code GtkCellEditable::remove-widget} signal.
     */
    default void removeWidget() {
        try {
            DowncallHandles.gtk_cell_editable_remove_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param event The {@code GdkEvent} that began the editing process, or
     *   {@code null} if editing was initiated programmatically
     */
    default void startEditing(@Nullable org.gtk.gdk.Event event) {
        try {
            DowncallHandles.gtk_cell_editable_start_editing.invokeExact(
                    handle(),
                    (Addressable) (event == null ? MemoryAddress.NULL : event.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_cell_editable_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface EditingDone {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceCellEditable) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EditingDone.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<CellEditable.EditingDone> onEditingDone(CellEditable.EditingDone handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("editing-done"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RemoveWidget {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceCellEditable) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RemoveWidget.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<CellEditable.RemoveWidget> onRemoveWidget(CellEditable.RemoveWidget handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("remove-widget"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_cell_editable_editing_done = Interop.downcallHandle(
            "gtk_cell_editable_editing_done",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_cell_editable_remove_widget = Interop.downcallHandle(
            "gtk_cell_editable_remove_widget",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_cell_editable_start_editing = Interop.downcallHandle(
            "gtk_cell_editable_start_editing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_cell_editable_get_type = Interop.downcallHandle(
            "gtk_cell_editable_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class CellEditableImpl extends org.gtk.gobject.GObject implements CellEditable {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public CellEditableImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
