package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkSliceListModel` is a list model that presents a slice of another model.
 * 
 * This is useful when implementing paging by setting the size to the number
 * of elements per page and updating the offset whenever a different page is
 * opened.
 */
public class SliceListModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public SliceListModel(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to SliceListModel */
    public static SliceListModel castFrom(org.gtk.gobject.Object gobject) {
        return new SliceListModel(gobject.getProxy());
    }
    
    /**
     * Creates a new slice model.
     * 
     * It presents the slice from @offset to offset + @size
     * of the given @model.
     */
    public SliceListModel(org.gtk.gio.ListModel model, int offset, int size) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_slice_list_model_new(model.getProxy().unowned().HANDLE(), offset, size), true));
    }
    
    /**
     * Gets the model that is currently being used or %NULL if none.
     */
    public org.gtk.gio.ListModel getModel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_slice_list_model_get_model(HANDLE());
        return new org.gtk.gio.ListModel.ListModelImpl(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the offset set via gtk_slice_list_model_set_offset().
     */
    public int getOffset() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_slice_list_model_get_offset(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the size set via gtk_slice_list_model_set_size().
     */
    public int getSize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_slice_list_model_get_size(HANDLE());
        return RESULT;
    }
    
    /**
     * Sets the model to show a slice of.
     * 
     * The model's item type must conform to @self's item type.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_slice_list_model_set_model(HANDLE(), model.HANDLE());
    }
    
    /**
     * Sets the offset into the original model for this slice.
     * 
     * If the offset is too large for the sliced model,
     * @self will end up empty.
     */
    public void setOffset(int offset) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_slice_list_model_set_offset(HANDLE(), offset);
    }
    
    /**
     * Sets the maximum size. @self will never have more items
     * than @size.
     * 
     * It can however have fewer items if the offset is too large
     * or the model sliced from doesn't have enough items.
     */
    public void setSize(int size) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_slice_list_model_set_size(HANDLE(), size);
    }
    
}
