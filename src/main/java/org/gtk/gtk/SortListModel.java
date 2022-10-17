package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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

    public SortListModel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SortListModel */
    public static SortListModel castFrom(org.gtk.gobject.Object gobject) {
        return new SortListModel(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_sort_list_model_new = Interop.downcallHandle(
        "gtk_sort_list_model_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@Nullable org.gtk.gio.ListModel model, @Nullable Sorter sorter) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_sort_list_model_new.invokeExact(model.refcounted().unowned().handle(), sorter.refcounted().unowned().handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new sort list model that uses the {@code sorter} to sort {@code model}.
     */
    public SortListModel(@Nullable org.gtk.gio.ListModel model, @Nullable Sorter sorter) {
        super(constructNew(model, sorter));
    }
    
    private static final MethodHandle gtk_sort_list_model_get_incremental = Interop.downcallHandle(
        "gtk_sort_list_model_get_incremental",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether incremental sorting is enabled.
     * <p>
     * See {@link SortListModel#setIncremental}.
     */
    public boolean getIncremental() {
        int RESULT;
        try {
            RESULT = (int) gtk_sort_list_model_get_incremental.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_sort_list_model_get_model = Interop.downcallHandle(
        "gtk_sort_list_model_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the model currently sorted or {@code null} if none.
     */
    public @Nullable org.gtk.gio.ListModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_sort_list_model_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_sort_list_model_get_pending = Interop.downcallHandle(
        "gtk_sort_list_model_get_pending",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
        int RESULT;
        try {
            RESULT = (int) gtk_sort_list_model_get_pending.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_sort_list_model_get_sorter = Interop.downcallHandle(
        "gtk_sort_list_model_get_sorter",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the sorter that is used to sort {@code self}.
     */
    public @Nullable Sorter getSorter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_sort_list_model_get_sorter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Sorter(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_sort_list_model_set_incremental = Interop.downcallHandle(
        "gtk_sort_list_model_set_incremental",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
    public @NotNull void setIncremental(@NotNull boolean incremental) {
        try {
            gtk_sort_list_model_set_incremental.invokeExact(handle(), incremental ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_sort_list_model_set_model = Interop.downcallHandle(
        "gtk_sort_list_model_set_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the model to be sorted.
     * <p>
     * The {@code model}'s item type must conform to the item type of {@code self}.
     */
    public @NotNull void setModel(@Nullable org.gtk.gio.ListModel model) {
        try {
            gtk_sort_list_model_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_sort_list_model_set_sorter = Interop.downcallHandle(
        "gtk_sort_list_model_set_sorter",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a new sorter on {@code self}.
     */
    public @NotNull void setSorter(@Nullable Sorter sorter) {
        try {
            gtk_sort_list_model_set_sorter.invokeExact(handle(), sorter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
