package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>GListModel</code> that sorts the elements of an underlying model
 * according to a <code>GtkSorter</code>.
 * <p>
 * The model is a stable sort. If two items compare equal according
 * to the sorter, the one that appears first in the original model will
 * also appear first after sorting.
 * Note that if you change the sorter, the previous order will have no
 * influence on the new order. If you want that, consider using a<code>GtkMultiSorter</code> and appending the previous sorter to it.
 * <p>
 * The model can be set up to do incremental sorting, so that
 * sorting long lists doesn&<code>#39</code> t block the UI. See
 * {@link org.gtk.gtk.SortListModel<code>#setIncremental</code>  for details.
 * <p><code>GtkSortListModel</code> is a generic model and because of that it
 * cannot take advantage of any external knowledge when sorting.
 * If you run into performance issues with <code>GtkSortListModel</code>,
 * it is strongly recommended that you write your own sorting list
 * model.
 */
public class SortListModel extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public SortListModel(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SortListModel */
    public static SortListModel castFrom(org.gtk.gobject.Object gobject) {
        return new SortListModel(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.gio.ListModel model, Sorter sorter) {
        Reference RESULT = References.get(gtk_h.gtk_sort_list_model_new(model.getReference().unowned().handle(), sorter.getReference().unowned().handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new sort list model that uses the @sorter to sort @model.
     */
    public SortListModel(org.gtk.gio.ListModel model, Sorter sorter) {
        super(constructNew(model, sorter));
    }
    
    /**
     * Returns whether incremental sorting is enabled.
     * 
     * See {@link org.gtk.gtk.SortListModel<code>#setIncremental</code> .
     */
    public boolean getIncremental() {
        var RESULT = gtk_h.gtk_sort_list_model_get_incremental(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the model currently sorted or <code>null</code> if none.
     */
    public org.gtk.gio.ListModel getModel() {
        var RESULT = gtk_h.gtk_sort_list_model_get_model(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Estimates progress of an ongoing sorting operation.
     * <p>
     * The estimate is the number of items that would still need to be
     * sorted to finish the sorting operation if this was a linear
     * algorithm. So this number is not related to how many items are
     * already correctly sorted.
     * <p>
     * If you want to estimate the progress, you can use code like this:<pre>c
     * pending = gtk_sort_list_model_get_pending (self);
     * model = gtk_sort_list_model_get_model (self);
     * progress = 1.0 - pending / (double) MAX (1, g_list_model_get_n_items (model));
     * </pre>
     * 
     * If no sort operation is ongoing - in particular when
     * {@link [property@Gtk.SortListModel:incremental] (ref=property)} is <code>false</code> - this
     * function returns 0.
     */
    public int getPending() {
        var RESULT = gtk_h.gtk_sort_list_model_get_pending(handle());
        return RESULT;
    }
    
    /**
     * Gets the sorter that is used to sort @self.
     */
    public Sorter getSorter() {
        var RESULT = gtk_h.gtk_sort_list_model_get_sorter(handle());
        return new Sorter(References.get(RESULT, false));
    }
    
    /**
     * Sets the sort model to do an incremental sort.
     * <p>
     * When incremental sorting is enabled, the <code>GtkSortListModel</code> will not do
     * a complete sort immediately, but will instead queue an idle handler that
     * incrementally sorts the items towards their correct position. This of
     * course means that items do not instantly appear in the right place. It
     * also means that the total sorting time is a lot slower.
     * 
     * When your filter blocks the UI while sorting, you might consider
     * turning this on. Depending on your model and sorters, this may become
     * interesting around 10,000 to 100,000 items.
     * 
     * By default, incremental sorting is disabled.
     * 
     * See {@link org.gtk.gtk.SortListModel<code>#getPending</code>  for progress information
     * about an ongoing incremental sorting operation.
     */
    public void setIncremental(boolean incremental) {
        gtk_h.gtk_sort_list_model_set_incremental(handle(), incremental ? 1 : 0);
    }
    
    /**
     * Sets the model to be sorted.
     * 
     * The @model&<code>#39</code> s item type must conform to the item type of @self.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        gtk_h.gtk_sort_list_model_set_model(handle(), model.handle());
    }
    
    /**
     * Sets a new sorter on @self.
     */
    public void setSorter(Sorter sorter) {
        gtk_h.gtk_sort_list_model_set_sorter(handle(), sorter.handle());
    }
    
}
