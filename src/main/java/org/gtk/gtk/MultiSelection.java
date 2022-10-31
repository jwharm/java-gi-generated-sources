package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkMultiSelection} is a {@code GtkSelectionModel} that allows selecting multiple
 * elements.
 */
public class MultiSelection extends org.gtk.gobject.Object implements org.gtk.gio.ListModel, org.gtk.gtk.SelectionModel {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkMultiSelection";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public MultiSelection(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to MultiSelection if its GType is a (or inherits from) "GtkMultiSelection".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "MultiSelection" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkMultiSelection", a ClassCastException will be thrown.
     */
    public static MultiSelection castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkMultiSelection"))) {
            return new MultiSelection(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkMultiSelection");
        }
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gio.ListModel model) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_multi_selection_new.invokeExact(
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
    public MultiSelection(@Nullable org.gtk.gio.ListModel model) {
        super(constructNew(model));
    }
    
    /**
     * Returns the underlying model of {@code self}.
     * @return the underlying model
     */
    public @Nullable org.gtk.gio.ListModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_multi_selection_get_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the model that {@code self} should wrap.
     * <p>
     * If {@code model} is {@code null}, {@code self} will be empty.
     * @param model A {@code GListModel} to wrap
     */
    public void setModel(@Nullable org.gtk.gio.ListModel model) {
        try {
            DowncallHandles.gtk_multi_selection_set_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_multi_selection_new = Interop.downcallHandle(
            "gtk_multi_selection_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_multi_selection_get_model = Interop.downcallHandle(
            "gtk_multi_selection_get_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_multi_selection_set_model = Interop.downcallHandle(
            "gtk_multi_selection_set_model",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
