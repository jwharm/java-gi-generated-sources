package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkSelectionFilterModel} is a list model that presents the selection from
 * a {@code GtkSelectionModel}.
 */
public class SelectionFilterModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public SelectionFilterModel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SelectionFilterModel */
    public static SelectionFilterModel castFrom(org.gtk.gobject.Object gobject) {
        return new SelectionFilterModel(gobject.refcounted());
    }
    
    static final MethodHandle gtk_selection_filter_model_new = Interop.downcallHandle(
        "gtk_selection_filter_model_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(SelectionModel model) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_selection_filter_model_new.invokeExact(model.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkSelectionFilterModel} that will include the
     * selected items from the underlying selection model.
     */
    public SelectionFilterModel(SelectionModel model) {
        super(constructNew(model));
    }
    
    static final MethodHandle gtk_selection_filter_model_get_model = Interop.downcallHandle(
        "gtk_selection_filter_model_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the model currently filtered or {@code null} if none.
     */
    public SelectionModel getModel() {
        try {
            var RESULT = (MemoryAddress) gtk_selection_filter_model_get_model.invokeExact(handle());
            return new SelectionModel.SelectionModelImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_selection_filter_model_set_model = Interop.downcallHandle(
        "gtk_selection_filter_model_set_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the model to be filtered.
     * <p>
     * Note that GTK makes no effort to ensure that {@code model} conforms to
     * the item type of {@code self}. It assumes that the caller knows what they
     * are doing and have set up an appropriate filter to ensure that item
     * types match.
     */
    public void setModel(SelectionModel model) {
        try {
            gtk_selection_filter_model_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
