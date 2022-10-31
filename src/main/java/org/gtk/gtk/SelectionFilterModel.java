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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSelectionFilterModel";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public SelectionFilterModel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to SelectionFilterModel if its GType is a (or inherits from) "GtkSelectionFilterModel".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "SelectionFilterModel" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkSelectionFilterModel", a ClassCastException will be thrown.
     */
    public static SelectionFilterModel castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkSelectionFilterModel"))) {
            return new SelectionFilterModel(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkSelectionFilterModel");
        }
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gtk.SelectionModel model) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_selection_filter_model_new.invokeExact(
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle())), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkSelectionFilterModel} that will include the
     * selected items from the underlying selection model.
     * @param model the selection model to filter
     */
    public SelectionFilterModel(@Nullable org.gtk.gtk.SelectionModel model) {
        super(constructNew(model));
    }
    
    /**
     * Gets the model currently filtered or {@code null} if none.
     * @return The model that gets filtered
     */
    public @Nullable org.gtk.gtk.SelectionModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_selection_filter_model_get_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.SelectionModel.SelectionModelImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the model to be filtered.
     * <p>
     * Note that GTK makes no effort to ensure that {@code model} conforms to
     * the item type of {@code self}. It assumes that the caller knows what they
     * are doing and have set up an appropriate filter to ensure that item
     * types match.
     * @param model The model to be filtered
     */
    public void setModel(@Nullable org.gtk.gtk.SelectionModel model) {
        try {
            DowncallHandles.gtk_selection_filter_model_set_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_selection_filter_model_new = Interop.downcallHandle(
            "gtk_selection_filter_model_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_selection_filter_model_get_model = Interop.downcallHandle(
            "gtk_selection_filter_model_get_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_selection_filter_model_set_model = Interop.downcallHandle(
            "gtk_selection_filter_model_set_model",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
