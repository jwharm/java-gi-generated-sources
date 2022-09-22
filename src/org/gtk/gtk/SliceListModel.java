package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public SliceListModel(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SliceListModel */
    public static SliceListModel castFrom(org.gtk.gobject.Object gobject) {
        return new SliceListModel(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.gio.ListModel model, int offset, int size) {
        Reference RESULT = References.get(gtk_h.gtk_slice_list_model_new(model.getReference().unowned().handle(), offset, size), true);
        return RESULT;
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
    
    /**
     * Gets the model that is currently being used or <code>null</code> if none.
     */
    public org.gtk.gio.ListModel getModel() {
        var RESULT = gtk_h.gtk_slice_list_model_get_model(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the offset set via gtk_slice_list_model_set_offset().
     */
    public int getOffset() {
        var RESULT = gtk_h.gtk_slice_list_model_get_offset(handle());
        return RESULT;
    }
    
    /**
     * Gets the size set via gtk_slice_list_model_set_size().
     */
    public int getSize() {
        var RESULT = gtk_h.gtk_slice_list_model_get_size(handle());
        return RESULT;
    }
    
    /**
     * Sets the model to show a slice of.
     * <p>
     * The model's item type must conform to {@code self}'s item type.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        gtk_h.gtk_slice_list_model_set_model(handle(), model.handle());
    }
    
    /**
     * Sets the offset into the original model for this slice.
     * <p>
     * If the offset is too large for the sliced model,
     * {@code self} will end up empty.
     */
    public void setOffset(int offset) {
        gtk_h.gtk_slice_list_model_set_offset(handle(), offset);
    }
    
    /**
     * Sets the maximum size. {@code self} will never have more items
     * than {@code size}.
     * <p>
     * It can however have fewer items if the offset is too large
     * or the model sliced from doesn't have enough items.
     */
    public void setSize(int size) {
        gtk_h.gtk_slice_list_model_set_size(handle(), size);
    }
    
}
