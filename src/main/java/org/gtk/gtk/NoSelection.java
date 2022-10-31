package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkNoSelection} is a {@code GtkSelectionModel} that does not allow selecting
 * anything.
 * <p>
 * This model is meant to be used as a simple wrapper around a {@code GListModel}
 * when a {@code GtkSelectionModel} is required.
 */
public class NoSelection extends org.gtk.gobject.Object implements org.gtk.gio.ListModel, org.gtk.gtk.SelectionModel {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkNoSelection";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public NoSelection(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to NoSelection if its GType is a (or inherits from) "GtkNoSelection".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "NoSelection" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkNoSelection", a ClassCastException will be thrown.
     */
    public static NoSelection castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkNoSelection"))) {
            return new NoSelection(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkNoSelection");
        }
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gio.ListModel model) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_no_selection_new.invokeExact(
                    (Addressable) (model == null ? MemoryAddress.NULL : model.refcounted().unowned().handle())), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new selection to handle {@code model}.
     * @param model the {@code GListModel} to manage
     */
    public NoSelection(@Nullable org.gtk.gio.ListModel model) {
        super(constructNew(model));
    }
    
    /**
     * Gets the model that {@code self} is wrapping.
     * @return The model being wrapped
     */
    public @Nullable org.gtk.gio.ListModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_no_selection_get_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the model that {@code self} should wrap.
     * <p>
     * If {@code model} is {@code null}, this model will be empty.
     * @param model A {@code GListModel} to wrap
     */
    public void setModel(@Nullable org.gtk.gio.ListModel model) {
        try {
            DowncallHandles.gtk_no_selection_set_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_no_selection_new = Interop.downcallHandle(
            "gtk_no_selection_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_no_selection_get_model = Interop.downcallHandle(
            "gtk_no_selection_get_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_no_selection_set_model = Interop.downcallHandle(
            "gtk_no_selection_set_model",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
