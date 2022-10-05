package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkSliceListModel} is a list model that presents a slice of another model.
 * <p>
 * This is useful when implementing paging by setting the size to the number
 * of elements per page and updating the offset whenever a different page is
 * opened.
 */
public class SliceListModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public SliceListModel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SliceListModel */
    public static SliceListModel castFrom(org.gtk.gobject.Object gobject) {
        return new SliceListModel(gobject.refcounted());
    }
    
    static final MethodHandle gtk_slice_list_model_new = Interop.downcallHandle(
        "gtk_slice_list_model_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(org.gtk.gio.ListModel model, int offset, int size) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_slice_list_model_new.invokeExact(model.refcounted().unowned().handle(), offset, size), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new slice model.
     * <p>
     * It presents the slice from {@code offset} to offset + {@code size}
     * of the given {@code model}.
     */
    public SliceListModel(org.gtk.gio.ListModel model, int offset, int size) {
        super(constructNew(model, offset, size));
    }
    
    static final MethodHandle gtk_slice_list_model_get_model = Interop.downcallHandle(
        "gtk_slice_list_model_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the model that is currently being used or {@code null} if none.
     */
    public org.gtk.gio.ListModel getModel() {
        try {
            var RESULT = (MemoryAddress) gtk_slice_list_model_get_model.invokeExact(handle());
            return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_slice_list_model_get_offset = Interop.downcallHandle(
        "gtk_slice_list_model_get_offset",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the offset set via gtk_slice_list_model_set_offset().
     */
    public int getOffset() {
        try {
            var RESULT = (int) gtk_slice_list_model_get_offset.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_slice_list_model_get_size = Interop.downcallHandle(
        "gtk_slice_list_model_get_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the size set via gtk_slice_list_model_set_size().
     */
    public int getSize() {
        try {
            var RESULT = (int) gtk_slice_list_model_get_size.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_slice_list_model_set_model = Interop.downcallHandle(
        "gtk_slice_list_model_set_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the model to show a slice of.
     * <p>
     * The model's item type must conform to {@code self}'s item type.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        try {
            gtk_slice_list_model_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_slice_list_model_set_offset = Interop.downcallHandle(
        "gtk_slice_list_model_set_offset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the offset into the original model for this slice.
     * <p>
     * If the offset is too large for the sliced model,
     * {@code self} will end up empty.
     */
    public void setOffset(int offset) {
        try {
            gtk_slice_list_model_set_offset.invokeExact(handle(), offset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_slice_list_model_set_size = Interop.downcallHandle(
        "gtk_slice_list_model_set_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the maximum size. {@code self} will never have more items
     * than {@code size}.
     * <p>
     * It can however have fewer items if the offset is too large
     * or the model sliced from doesn't have enough items.
     */
    public void setSize(int size) {
        try {
            gtk_slice_list_model_set_size.invokeExact(handle(), size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
