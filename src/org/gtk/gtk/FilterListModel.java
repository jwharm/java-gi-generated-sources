package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkFilterListModel} is a list model that filters the elements of
 * the underlying model according to a {@code GtkFilter}.
 * <p>
 * It hides some elements from the other model according to
 * criteria given by a {@code GtkFilter}.
 * <p>
 * The model can be set up to do incremental searching, so that
 * filtering long lists doesn't block the UI. See
 * {@link FilterListModel#setIncremental} for details.
 */
public class FilterListModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public FilterListModel(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FilterListModel */
    public static FilterListModel castFrom(org.gtk.gobject.Object gobject) {
        return new FilterListModel(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.gio.ListModel model, Filter filter) {
        Reference RESULT = References.get(gtk_h.gtk_filter_list_model_new(model.getReference().unowned().handle(), filter.getReference().unowned().handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkFilterListModel} that will filter {@code model} using the given
     * {@code filter}.
     */
    public FilterListModel(org.gtk.gio.ListModel model, Filter filter) {
        super(constructNew(model, filter));
    }
    
    /**
     * Gets the {@code GtkFilter} currently set on {@code self}.
     */
    public Filter getFilter() {
        var RESULT = gtk_h.gtk_filter_list_model_get_filter(handle());
        return new Filter(References.get(RESULT, false));
    }
    
    /**
     * Returns whether incremental filtering is enabled.
     * <p>
     * See {@link FilterListModel#setIncremental}.
     */
    public boolean getIncremental() {
        var RESULT = gtk_h.gtk_filter_list_model_get_incremental(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the model currently filtered or <code>null</code> if none.
     */
    public org.gtk.gio.ListModel getModel() {
        var RESULT = gtk_h.gtk_filter_list_model_get_model(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Returns the number of items that have not been filtered yet.
     * <p>
     * You can use this value to check if {@code self} is busy filtering by
     * comparing the return value to 0 or you can compute the percentage
     * of the filter remaining by dividing the return value by the total
     * number of items in the underlying model:
     * <p>
     * <pre>{@code c
     * pending = gtk_filter_list_model_get_pending (self);
     * model = gtk_filter_list_model_get_model (self);
     * percentage = pending / (double) g_list_model_get_n_items (model);
     * }</pre>
     * <p>
     * If no filter operation is ongoing - in particular when
     * {@code Gtk.FilterListModel:incremental} is <code>false</code> - this
     * function returns 0.
     */
    public int getPending() {
        var RESULT = gtk_h.gtk_filter_list_model_get_pending(handle());
        return RESULT;
    }
    
    /**
     * Sets the filter used to filter items.
     */
    public void setFilter(Filter filter) {
        gtk_h.gtk_filter_list_model_set_filter(handle(), filter.handle());
    }
    
    /**
     * Sets the filter model to do an incremental sort.
     * <p>
     * When incremental filtering is enabled, the {@code GtkFilterListModel} will not
     * run filters immediately, but will instead queue an idle handler that
     * incrementally filters the items and adds them to the list. This of course
     * means that items are not instantly added to the list, but only appear
     * incrementally.
     * <p>
     * When your filter blocks the UI while filtering, you might consider
     * turning this on. Depending on your model and filters, this may become
     * interesting around 10,000 to 100,000 items.
     * <p>
     * By default, incremental filtering is disabled.
     * <p>
     * See {@link FilterListModel#getPending} for progress information
     * about an ongoing incremental filtering operation.
     */
    public void setIncremental(boolean incremental) {
        gtk_h.gtk_filter_list_model_set_incremental(handle(), incremental ? 1 : 0);
    }
    
    /**
     * Sets the model to be filtered.
     * <p>
     * Note that GTK makes no effort to ensure that {@code model} conforms to
     * the item type of {@code self}. It assumes that the caller knows what they
     * are doing and have set up an appropriate filter to ensure that item
     * types match.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        gtk_h.gtk_filter_list_model_set_model(handle(), model.handle());
    }
    
}
