package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkSliceListModel} is a list model that presents a slice of another model.
 * <p>
 * This is useful when implementing paging by setting the size to the number
 * of elements per page and updating the offset whenever a different page is
 * opened.
 */
public class SliceListModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {
    
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
    
    public SliceListModel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SliceListModel */
    public static SliceListModel castFrom(org.gtk.gobject.Object gobject) {
        return new SliceListModel(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gio.ListModel model, int offset, int size) {
        java.util.Objects.requireNonNullElse(model, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_slice_list_model_new.invokeExact(model.refcounted().unowned().handle(), offset, size), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new slice model.
     * <p>
     * It presents the slice from {@code offset} to offset + {@code size}
     * of the given {@code model}.
     * @param model The model to use
     * @param offset the offset of the slice
     * @param size maximum size of the slice
     */
    public SliceListModel(@Nullable org.gtk.gio.ListModel model, int offset, int size) {
        super(constructNew(model, offset, size));
    }
    
    /**
     * Gets the model that is currently being used or {@code null} if none.
     * @return The model in use
     */
    public @Nullable org.gtk.gio.ListModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_slice_list_model_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the offset set via gtk_slice_list_model_set_offset().
     * @return The offset
     */
    public int getOffset() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_slice_list_model_get_offset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the size set via gtk_slice_list_model_set_size().
     * @return The size
     */
    public int getSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_slice_list_model_get_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets the model to show a slice of.
     * <p>
     * The model's item type must conform to {@code self}'s item type.
     * @param model The model to be sliced
     */
    public void setModel(@Nullable org.gtk.gio.ListModel model) {
        java.util.Objects.requireNonNullElse(model, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_slice_list_model_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the offset into the original model for this slice.
     * <p>
     * If the offset is too large for the sliced model,
     * {@code self} will end up empty.
     * @param offset the new offset to use
     */
    public void setOffset(int offset) {
        try {
            DowncallHandles.gtk_slice_list_model_set_offset.invokeExact(handle(), offset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the maximum size. {@code self} will never have more items
     * than {@code size}.
     * <p>
     * It can however have fewer items if the offset is too large
     * or the model sliced from doesn't have enough items.
     * @param size the maximum size
     */
    public void setSize(int size) {
        try {
            DowncallHandles.gtk_slice_list_model_set_size.invokeExact(handle(), size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_slice_list_model_new = Interop.downcallHandle(
            "gtk_slice_list_model_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_slice_list_model_get_model = Interop.downcallHandle(
            "gtk_slice_list_model_get_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_slice_list_model_get_offset = Interop.downcallHandle(
            "gtk_slice_list_model_get_offset",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_slice_list_model_get_size = Interop.downcallHandle(
            "gtk_slice_list_model_get_size",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_slice_list_model_set_model = Interop.downcallHandle(
            "gtk_slice_list_model_set_model",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_slice_list_model_set_offset = Interop.downcallHandle(
            "gtk_slice_list_model_set_offset",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_slice_list_model_set_size = Interop.downcallHandle(
            "gtk_slice_list_model_set_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
