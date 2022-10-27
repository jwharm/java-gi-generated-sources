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
    
    public SortListModel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SortListModel */
    public static SortListModel castFrom(org.gtk.gobject.Object gobject) {
        return new SortListModel(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gio.ListModel model, @Nullable org.gtk.gtk.Sorter sorter) {
        java.util.Objects.requireNonNullElse(model, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(sorter, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_sort_list_model_new.invokeExact(model.refcounted().unowned().handle(), sorter.refcounted().unowned().handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new sort list model that uses the {@code sorter} to sort {@code model}.
     * @param model the model to sort
     * @param sorter the {@code GtkSorter} to sort {@code model} with,
     */
    public SortListModel(@Nullable org.gtk.gio.ListModel model, @Nullable org.gtk.gtk.Sorter sorter) {
        super(constructNew(model, sorter));
    }
    
    /**
     * Returns whether incremental sorting is enabled.
     * <p>
     * See {@link SortListModel#setIncremental}.
     * @return {@code true} if incremental sorting is enabled
     */
    public boolean getIncremental() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_sort_list_model_get_incremental.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the model currently sorted or {@code null} if none.
     * @return The model that gets sorted
     */
    public @Nullable org.gtk.gio.ListModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_sort_list_model_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
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
     * @return a progress estimate of remaining items to sort
     */
    public int getPending() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_sort_list_model_get_pending.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the sorter that is used to sort {@code self}.
     * @return the sorter of {@code self}
     */
    public @Nullable org.gtk.gtk.Sorter getSorter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_sort_list_model_get_sorter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Sorter(Refcounted.get(RESULT, false));
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
     * @param incremental {@code true} to sort incrementally
     */
    public void setIncremental(boolean incremental) {
        try {
            DowncallHandles.gtk_sort_list_model_set_incremental.invokeExact(handle(), incremental ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the model to be sorted.
     * <p>
     * The {@code model}'s item type must conform to the item type of {@code self}.
     * @param model The model to be sorted
     */
    public void setModel(@Nullable org.gtk.gio.ListModel model) {
        java.util.Objects.requireNonNullElse(model, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_sort_list_model_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a new sorter on {@code self}.
     * @param sorter the {@code GtkSorter} to sort {@code model} with
     */
    public void setSorter(@Nullable org.gtk.gtk.Sorter sorter) {
        java.util.Objects.requireNonNullElse(sorter, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_sort_list_model_set_sorter.invokeExact(handle(), sorter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_sort_list_model_new = Interop.downcallHandle(
            "gtk_sort_list_model_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_sort_list_model_get_incremental = Interop.downcallHandle(
            "gtk_sort_list_model_get_incremental",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_sort_list_model_get_model = Interop.downcallHandle(
            "gtk_sort_list_model_get_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_sort_list_model_get_pending = Interop.downcallHandle(
            "gtk_sort_list_model_get_pending",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_sort_list_model_get_sorter = Interop.downcallHandle(
            "gtk_sort_list_model_get_sorter",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_sort_list_model_set_incremental = Interop.downcallHandle(
            "gtk_sort_list_model_set_incremental",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_sort_list_model_set_model = Interop.downcallHandle(
            "gtk_sort_list_model_set_model",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_sort_list_model_set_sorter = Interop.downcallHandle(
            "gtk_sort_list_model_set_sorter",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
