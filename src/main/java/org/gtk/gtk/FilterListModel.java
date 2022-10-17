package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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

    public FilterListModel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FilterListModel */
    public static FilterListModel castFrom(org.gtk.gobject.Object gobject) {
        return new FilterListModel(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_filter_list_model_new = Interop.downcallHandle(
        "gtk_filter_list_model_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@Nullable org.gtk.gio.ListModel model, @Nullable Filter filter) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_filter_list_model_new.invokeExact(model.refcounted().unowned().handle(), filter.refcounted().unowned().handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkFilterListModel} that will filter {@code model} using the given
     * {@code filter}.
     */
    public FilterListModel(@Nullable org.gtk.gio.ListModel model, @Nullable Filter filter) {
        super(constructNew(model, filter));
    }
    
    private static final MethodHandle gtk_filter_list_model_get_filter = Interop.downcallHandle(
        "gtk_filter_list_model_get_filter",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GtkFilter} currently set on {@code self}.
     */
    public @Nullable Filter getFilter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_filter_list_model_get_filter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Filter(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_filter_list_model_get_incremental = Interop.downcallHandle(
        "gtk_filter_list_model_get_incremental",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether incremental filtering is enabled.
     * <p>
     * See {@link FilterListModel#setIncremental}.
     */
    public boolean getIncremental() {
        int RESULT;
        try {
            RESULT = (int) gtk_filter_list_model_get_incremental.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_filter_list_model_get_model = Interop.downcallHandle(
        "gtk_filter_list_model_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the model currently filtered or {@code null} if none.
     */
    public @Nullable org.gtk.gio.ListModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_filter_list_model_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_filter_list_model_get_pending = Interop.downcallHandle(
        "gtk_filter_list_model_get_pending",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the number of items that have not been filtered yet.
     * <p>
     * You can use this value to check if {@code self} is busy filtering by
     * comparing the return value to 0 or you can compute the percentage
     * of the filter remaining by dividing the return value by the total
     * number of items in the underlying model:
     * 
     * <pre>{@code c
     * pending = gtk_filter_list_model_get_pending (self);
     * model = gtk_filter_list_model_get_model (self);
     * percentage = pending / (double) g_list_model_get_n_items (model);
     * }</pre>
     * <p>
     * If no filter operation is ongoing - in particular when
     * {@code Gtk.FilterListModel:incremental} is {@code false} - this
     * function returns 0.
     */
    public int getPending() {
        int RESULT;
        try {
            RESULT = (int) gtk_filter_list_model_get_pending.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_filter_list_model_set_filter = Interop.downcallHandle(
        "gtk_filter_list_model_set_filter",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the filter used to filter items.
     */
    public @NotNull void setFilter(@Nullable Filter filter) {
        try {
            gtk_filter_list_model_set_filter.invokeExact(handle(), filter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_filter_list_model_set_incremental = Interop.downcallHandle(
        "gtk_filter_list_model_set_incremental",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
    public @NotNull void setIncremental(@NotNull boolean incremental) {
        try {
            gtk_filter_list_model_set_incremental.invokeExact(handle(), incremental ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_filter_list_model_set_model = Interop.downcallHandle(
        "gtk_filter_list_model_set_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the model to be filtered.
     * <p>
     * Note that GTK makes no effort to ensure that {@code model} conforms to
     * the item type of {@code self}. It assumes that the caller knows what they
     * are doing and have set up an appropriate filter to ensure that item
     * types match.
     */
    public @NotNull void setModel(@Nullable org.gtk.gio.ListModel model) {
        try {
            gtk_filter_list_model_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
