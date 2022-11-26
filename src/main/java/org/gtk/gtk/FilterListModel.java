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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkFilterListModel";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a FilterListModel proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FilterListModel(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to FilterListModel if its GType is a (or inherits from) "GtkFilterListModel".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code FilterListModel} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkFilterListModel", a ClassCastException will be thrown.
     */
    public static FilterListModel castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), FilterListModel.getType())) {
            return new FilterListModel(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkFilterListModel");
        }
    }
    
    private static Addressable constructNew(@Nullable org.gtk.gio.ListModel model, @Nullable org.gtk.gtk.Filter filter) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_filter_list_model_new.invokeExact(
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()),
                    (Addressable) (filter == null ? MemoryAddress.NULL : filter.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        model.yieldOwnership();
        filter.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkFilterListModel} that will filter {@code model} using the given
     * {@code filter}.
     * @param model the model to sort
     * @param filter filter
     */
    public FilterListModel(@Nullable org.gtk.gio.ListModel model, @Nullable org.gtk.gtk.Filter filter) {
        super(constructNew(model, filter), Ownership.FULL);
    }
    
    /**
     * Gets the {@code GtkFilter} currently set on {@code self}.
     * @return The filter currently in use
     */
    public @Nullable org.gtk.gtk.Filter getFilter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_filter_list_model_get_filter.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Filter(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether incremental filtering is enabled.
     * <p>
     * See {@link FilterListModel#setIncremental}.
     * @return {@code true} if incremental filtering is enabled
     */
    public boolean getIncremental() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_filter_list_model_get_incremental.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the model currently filtered or {@code null} if none.
     * @return The model that gets filtered
     */
    public @Nullable org.gtk.gio.ListModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_filter_list_model_get_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the number of items that have not been filtered yet.
     * <p>
     * You can use this value to check if {@code self} is busy filtering by
     * comparing the return value to 0 or you can compute the percentage
     * of the filter remaining by dividing the return value by the total
     * number of items in the underlying model:
     * <pre>{@code c
     * pending = gtk_filter_list_model_get_pending (self);
     * model = gtk_filter_list_model_get_model (self);
     * percentage = pending / (double) g_list_model_get_n_items (model);
     * }</pre>
     * <p>
     * If no filter operation is ongoing - in particular when
     * {@code Gtk.FilterListModel:incremental} is {@code false} - this
     * function returns 0.
     * @return The number of items not yet filtered
     */
    public int getPending() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_filter_list_model_get_pending.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets the filter used to filter items.
     * @param filter filter to use
     */
    public void setFilter(@Nullable org.gtk.gtk.Filter filter) {
        try {
            DowncallHandles.gtk_filter_list_model_set_filter.invokeExact(
                    handle(),
                    (Addressable) (filter == null ? MemoryAddress.NULL : filter.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param incremental {@code true} to enable incremental filtering
     */
    public void setIncremental(boolean incremental) {
        try {
            DowncallHandles.gtk_filter_list_model_set_incremental.invokeExact(
                    handle(),
                    incremental ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the model to be filtered.
     * <p>
     * Note that GTK makes no effort to ensure that {@code model} conforms to
     * the item type of {@code self}. It assumes that the caller knows what they
     * are doing and have set up an appropriate filter to ensure that item
     * types match.
     * @param model The model to be filtered
     */
    public void setModel(@Nullable org.gtk.gio.ListModel model) {
        try {
            DowncallHandles.gtk_filter_list_model_set_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_filter_list_model_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link FilterListModel.Build} object constructs a {@link FilterListModel} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link FilterListModel} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FilterListModel} using {@link FilterListModel#castFrom}.
         * @return A new instance of {@code FilterListModel} with the properties 
         *         that were set in the Build object.
         */
        public FilterListModel construct() {
            return FilterListModel.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    FilterListModel.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The filter for this model.
         * @param filter The value for the {@code filter} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFilter(org.gtk.gtk.Filter filter) {
            names.add("filter");
            values.add(org.gtk.gobject.Value.create(filter));
            return this;
        }
        
        /**
         * If the model should filter items incrementally.
         * @param incremental The value for the {@code incremental} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIncremental(boolean incremental) {
            names.add("incremental");
            values.add(org.gtk.gobject.Value.create(incremental));
            return this;
        }
        
        /**
         * The type of items. See {@link org.gtk.gio.ListModel#getItemType}.
         * @param itemType The value for the {@code item-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setItemType(org.gtk.glib.Type itemType) {
            names.add("item-type");
            values.add(org.gtk.gobject.Value.create(itemType));
            return this;
        }
        
        /**
         * The model being filtered.
         * @param model The value for the {@code model} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setModel(org.gtk.gio.ListModel model) {
            names.add("model");
            values.add(org.gtk.gobject.Value.create(model));
            return this;
        }
        
        /**
         * The number of items. See {@link org.gtk.gio.ListModel#getNItems}.
         * @param nItems The value for the {@code n-items} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNItems(int nItems) {
            names.add("n-items");
            values.add(org.gtk.gobject.Value.create(nItems));
            return this;
        }
        
        /**
         * Number of items not yet filtered.
         * @param pending The value for the {@code pending} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPending(int pending) {
            names.add("pending");
            values.add(org.gtk.gobject.Value.create(pending));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_filter_list_model_new = Interop.downcallHandle(
            "gtk_filter_list_model_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_filter_list_model_get_filter = Interop.downcallHandle(
            "gtk_filter_list_model_get_filter",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_filter_list_model_get_incremental = Interop.downcallHandle(
            "gtk_filter_list_model_get_incremental",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_filter_list_model_get_model = Interop.downcallHandle(
            "gtk_filter_list_model_get_model",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_filter_list_model_get_pending = Interop.downcallHandle(
            "gtk_filter_list_model_get_pending",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_filter_list_model_set_filter = Interop.downcallHandle(
            "gtk_filter_list_model_set_filter",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_filter_list_model_set_incremental = Interop.downcallHandle(
            "gtk_filter_list_model_set_incremental",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_filter_list_model_set_model = Interop.downcallHandle(
            "gtk_filter_list_model_set_model",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_filter_list_model_get_type = Interop.downcallHandle(
            "gtk_filter_list_model_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
