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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public FlattenListModel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FlattenListModel */
    public static FlattenListModel castFrom(org.gtk.gobject.Object gobject) {
        return new FlattenListModel(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gio.ListModel model) {
        java.util.Objects.requireNonNullElse(model, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_flatten_list_model_new.invokeExact(model.refcounted().unowned().handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkFlattenListModel} that flattens {@code list}.
     * @param model the model to be flattened
     */
    public FlattenListModel(@Nullable org.gtk.gio.ListModel model) {
        super(constructNew(model));
    }
    
    /**
     * Gets the model set via gtk_flatten_list_model_set_model().
     * @return The model flattened by {@code self}
     */
    public @Nullable org.gtk.gio.ListModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_flatten_list_model_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the model containing the item at the given position.
     * @param position a position
     * @return the model containing the item at {@code position}
     */
    public @Nullable org.gtk.gio.ListModel getModelForItem(int position) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_flatten_list_model_get_model_for_item.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets a new model to be flattened.
     * @param model the new model
     */
    public void setModel(@Nullable org.gtk.gio.ListModel model) {
        java.util.Objects.requireNonNullElse(model, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_flatten_list_model_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_flatten_list_model_new = Interop.downcallHandle(
            "gtk_flatten_list_model_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flatten_list_model_get_model = Interop.downcallHandle(
            "gtk_flatten_list_model_get_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_flatten_list_model_get_model_for_item = Interop.downcallHandle(
            "gtk_flatten_list_model_get_model_for_item",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_flatten_list_model_set_model = Interop.downcallHandle(
            "gtk_flatten_list_model_set_model",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
