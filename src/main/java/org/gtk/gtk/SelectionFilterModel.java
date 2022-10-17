package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gtk_selection_filter_model_new = Interop.downcallHandle(
        "gtk_selection_filter_model_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@Nullable SelectionModel model) {
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
    public SelectionFilterModel(@Nullable SelectionModel model) {
        super(constructNew(model));
    }
    
    private static final MethodHandle gtk_selection_filter_model_get_model = Interop.downcallHandle(
        "gtk_selection_filter_model_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the model currently filtered or {@code null} if none.
     */
    public @Nullable SelectionModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_selection_filter_model_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SelectionModel.SelectionModelImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_selection_filter_model_set_model = Interop.downcallHandle(
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
    public @NotNull void setModel(@Nullable SelectionModel model) {
        try {
            gtk_selection_filter_model_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
