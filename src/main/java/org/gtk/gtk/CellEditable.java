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
    
    /**
     * Cast object to CellEditable if its GType is a (or inherits from) "GtkCellEditable".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CellEditable} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCellEditable", a ClassCastException will be thrown.
     */
    public static CellEditable castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkCellEditable"))) {
            return new CellEditableImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCellEditable");
        }
    }
    
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
    
    @FunctionalInterface
    public interface EditingDone {
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<CellEditable.EditingDone> onEditingDone(CellEditable.EditingDone handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("editing-done"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellEditable.Callbacks.class, "signalCellEditableEditingDone",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<CellEditable.EditingDone>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RemoveWidget {
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<CellEditable.RemoveWidget> onRemoveWidget(CellEditable.RemoveWidget handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("remove-widget"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellEditable.Callbacks.class, "signalCellEditableRemoveWidget",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<CellEditable.RemoveWidget>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_cell_editable_editing_done = Interop.downcallHandle(
            "gtk_cell_editable_editing_done",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_cell_editable_remove_widget = Interop.downcallHandle(
            "gtk_cell_editable_remove_widget",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_cell_editable_start_editing = Interop.downcallHandle(
            "gtk_cell_editable_start_editing",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    @ApiStatus.Internal
    static class Callbacks {
        
        public static void signalCellEditableEditingDone(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (CellEditable.EditingDone) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new CellEditable.CellEditableImpl(source, Ownership.UNKNOWN));
        }
        
        public static void signalCellEditableRemoveWidget(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (CellEditable.RemoveWidget) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new CellEditable.CellEditableImpl(source, Ownership.UNKNOWN));
        }
    }
    
    class CellEditableImpl extends org.gtk.gobject.Object implements CellEditable {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public CellEditableImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
