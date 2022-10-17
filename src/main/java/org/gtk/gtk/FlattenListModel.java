package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkFlattenListModel} is a list model that concatenates other list models.
 * <p>
 * {@code GtkFlattenListModel} takes a list model containing list models,
 *  and flattens it into a single model.
 */
public class FlattenListModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public FlattenListModel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FlattenListModel */
    public static FlattenListModel castFrom(org.gtk.gobject.Object gobject) {
        return new FlattenListModel(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_flatten_list_model_new = Interop.downcallHandle(
        "gtk_flatten_list_model_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@Nullable org.gtk.gio.ListModel model) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_flatten_list_model_new.invokeExact(model.refcounted().unowned().handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkFlattenListModel} that flattens {@code list}.
     */
    public FlattenListModel(@Nullable org.gtk.gio.ListModel model) {
        super(constructNew(model));
    }
    
    private static final MethodHandle gtk_flatten_list_model_get_model = Interop.downcallHandle(
        "gtk_flatten_list_model_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the model set via gtk_flatten_list_model_set_model().
     */
    public @Nullable org.gtk.gio.ListModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_flatten_list_model_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_flatten_list_model_get_model_for_item = Interop.downcallHandle(
        "gtk_flatten_list_model_get_model_for_item",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the model containing the item at the given position.
     */
    public @Nullable org.gtk.gio.ListModel getModelForItem(@NotNull int position) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_flatten_list_model_get_model_for_item.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_flatten_list_model_set_model = Interop.downcallHandle(
        "gtk_flatten_list_model_set_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a new model to be flattened.
     */
    public @NotNull void setModel(@Nullable org.gtk.gio.ListModel model) {
        try {
            gtk_flatten_list_model_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
