package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkFilterListModel` is a list model that filters the elements of
 * the underlying model according to a `GtkFilter`.
 * 
 * It hides some elements from the other model according to
 * criteria given by a `GtkFilter`.
 * 
 * The model can be set up to do incremental searching, so that
 * filtering long lists doesn't block the UI. See
 * [method@Gtk.FilterListModel.set_incremental] for details.
 */
public class FilterListModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public FilterListModel(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to FilterListModel */
    public static FilterListModel castFrom(org.gtk.gobject.Object gobject) {
        return new FilterListModel(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkFilterListModel` that will filter @model using the given
     * @filter.
     */
    public FilterListModel(org.gtk.gio.ListModel model, Filter filter) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_filter_list_model_new(model.getProxy().unowned().HANDLE(), filter.getProxy().unowned().HANDLE()), true));
    }
    
    /**
     * Gets the `GtkFilter` currently set on @self.
     */
    public Filter getFilter() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_filter_list_model_get_filter(HANDLE());
        return new Filter(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns whether incremental filtering is enabled.
     * 
     * See [method@Gtk.FilterListModel.set_incremental].
     */
    public boolean getIncremental() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_filter_list_model_get_incremental(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the model currently filtered or %NULL if none.
     */
    public org.gtk.gio.ListModel getModel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_filter_list_model_get_model(HANDLE());
        return new org.gtk.gio.ListModel.ListModelImpl(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Returns the number of items that have not been filtered yet.
     * 
     * You can use this value to check if @self is busy filtering by
     * comparing the return value to 0 or you can compute the percentage
     * of the filter remaining by dividing the return value by the total
     * number of items in the underlying model:
     * 
     * ```c
     * pending = gtk_filter_list_model_get_pending (self);
     * model = gtk_filter_list_model_get_model (self);
     * percentage = pending / (double) g_list_model_get_n_items (model);
     * ```
     * 
     * If no filter operation is ongoing - in particular when
     * [property@Gtk.FilterListModel:incremental] is %FALSE - this
     * function returns 0.
     */
    public int getPending() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_filter_list_model_get_pending(HANDLE());
        return RESULT;
    }
    
    /**
     * Sets the filter used to filter items.
     */
    public void setFilter(Filter filter) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_filter_list_model_set_filter(HANDLE(), filter.HANDLE());
    }
    
    /**
     * Sets the filter model to do an incremental sort.
     * 
     * When incremental filtering is enabled, the `GtkFilterListModel` will not
     * run filters immediately, but will instead queue an idle handler that
     * incrementally filters the items and adds them to the list. This of course
     * means that items are not instantly added to the list, but only appear
     * incrementally.
     * 
     * When your filter blocks the UI while filtering, you might consider
     * turning this on. Depending on your model and filters, this may become
     * interesting around 10,000 to 100,000 items.
     * 
     * By default, incremental filtering is disabled.
     * 
     * See [method@Gtk.FilterListModel.get_pending] for progress information
     * about an ongoing incremental filtering operation.
     */
    public void setIncremental(boolean incremental) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_filter_list_model_set_incremental(HANDLE(), incremental ? 1 : 0);
    }
    
    /**
     * Sets the model to be filtered.
     * 
     * Note that GTK makes no effort to ensure that @model conforms to
     * the item type of @self. It assumes that the caller knows what they
     * are doing and have set up an appropriate filter to ensure that item
     * types match.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_filter_list_model_set_model(HANDLE(), model.HANDLE());
    }
    
}
