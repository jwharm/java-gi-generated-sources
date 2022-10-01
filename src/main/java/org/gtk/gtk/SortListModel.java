package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GListModel} that sorts the elements of an underlying model
 * according to a {@code GtkSorter}.
 * <p>
 * The model is a stable sort. If two items compare equal according
 * to the sorter, the one that appears first in the original model will
 * also appear first after sorting.
 * Note that if you change the sorter, the previous order will have no
 * influence on the new order. If you want that, consider using a
 * {@code GtkMultiSorter} and appending the previous sorter to it.
 * <p>
 * The model can be set up to do incremental sorting, so that
 * sorting long lists doesn't block the UI. See
 * {@link SortListModel#setIncremental} for details.
 * <p>
 * {@code GtkSortListModel} is a generic model and because of that it
 * cannot take advantage of any external knowledge when sorting.
 * If you run into performance issues with {@code GtkSortListModel},
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
     * Creates a new sort list model that uses the {@code sorter} to sort {@code model}.
     */
    public SortListModel(org.gtk.gio.ListModel model, Sorter sorter) {
        super(constructNew(model, sorter));
    }
    
    /**
     * Returns whether incremental sorting is enabled.
     * <p>
     * See {@link SortListModel#setIncremental}.
     */
    public boolean getIncremental() {
        var RESULT = gtk_h.gtk_sort_list_model_get_incremental(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the model currently sorted or {@code null} if none.
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
     * If you want to estimate the progress, you can use code like this:
     * <pre>{@code c
     * pending = gtk_sort_list_model_get_pending (self);
     * model = gtk_sort_list_model_get_model (self);
     * progress = 1.0 - pending / (double) MAX (1, g_list_model_get_n_items (model));
     * }</pre>
     * <p>
     * If no sort operation is ongoing - in particular when
     * {@code Gtk.SortListModel:incremental} is {@code false} - this
     * function returns 0.
     */
    public int getPending() {
        var RESULT = gtk_h.gtk_sort_list_model_get_pending(handle());
        return RESULT;
    }
    
    /**
     * Gets the sorter that is used to sort {@code self}.
     */
    public Sorter getSorter() {
        var RESULT = gtk_h.gtk_sort_list_model_get_sorter(handle());
        return new Sorter(References.get(RESULT, false));
    }
    
    /**
     * Sets the sort model to do an incremental sort.
     * <p>
     * When incremental sorting is enabled, the {@code GtkSortListModel} will not do
     * a complete sort immediately, but will instead queue an idle handler that
     * incrementally sorts the items towards their correct position. This of
     * course means that items do not instantly appear in the right place. It
     * also means that the total sorting time is a lot slower.
     * <p>
     * When your filter blocks the UI while sorting, you might consider
     * turning this on. Depending on your model and sorters, this may become
     * interesting around 10,000 to 100,000 items.
     * <p>
     * By default, incremental sorting is disabled.
     * <p>
     * See {@link SortListModel#getPending} for progress information
     * about an ongoing incremental sorting operation.
     */
    public void setIncremental(boolean incremental) {
        gtk_h.gtk_sort_list_model_set_incremental(handle(), incremental ? 1 : 0);
    }
    
    /**
     * Sets the model to be sorted.
     * <p>
     * The {@code model}'s item type must conform to the item type of {@code self}.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        gtk_h.gtk_sort_list_model_set_model(handle(), model.handle());
    }
    
    /**
     * Sets a new sorter on {@code self}.
     */
    public void setSorter(Sorter sorter) {
        gtk_h.gtk_sort_list_model_set_sorter(handle(), sorter.handle());
    }
    
}
