package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkNoSelection} is a {@code GtkSelectionModel} that does not allow selecting
 * anything.
 * <p>
 * This model is meant to be used as a simple wrapper around a {@code GListModel}
 * when a {@code GtkSelectionModel} is required.
 */
public class NoSelection extends org.gtk.gobject.Object implements org.gtk.gio.ListModel, SelectionModel {

    public NoSelection(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to NoSelection */
    public static NoSelection castFrom(org.gtk.gobject.Object gobject) {
        return new NoSelection(gobject.refcounted());
    }
    
    static final MethodHandle gtk_no_selection_new = Interop.downcallHandle(
        "gtk_no_selection_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(org.gtk.gio.ListModel model) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_no_selection_new.invokeExact(model.refcounted().unowned().handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new selection to handle {@code model}.
     */
    public NoSelection(org.gtk.gio.ListModel model) {
        super(constructNew(model));
    }
    
    static final MethodHandle gtk_no_selection_get_model = Interop.downcallHandle(
        "gtk_no_selection_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the model that {@code self} is wrapping.
     */
    public org.gtk.gio.ListModel getModel() {
        try {
            var RESULT = (MemoryAddress) gtk_no_selection_get_model.invokeExact(handle());
            return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_no_selection_set_model = Interop.downcallHandle(
        "gtk_no_selection_set_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the model that {@code self} should wrap.
     * <p>
     * If {@code model} is {@code null}, this model will be empty.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        try {
            gtk_no_selection_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
