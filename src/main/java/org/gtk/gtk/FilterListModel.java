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
public class FilterListModel extends org.gtk.gobject.GObject implements org.gtk.gio.ListModel {
    
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
     */
    protected FilterListModel(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FilterListModel> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FilterListModel(input);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gio.ListModel model, @Nullable org.gtk.gtk.Filter filter) {
        MemoryAddress RESULT;
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
        super(constructNew(model, filter));
        this.takeOwnership();
    }
    
    /**
     * Gets the {@code GtkFilter} currently set on {@code self}.
     * @return The filter currently in use
     */
    public @Nullable org.gtk.gtk.Filter getFilter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_filter_list_model_get_filter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Filter) Interop.register(RESULT, org.gtk.gtk.Filter.fromAddress).marshal(RESULT, null);
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
            RESULT = (int) DowncallHandles.gtk_filter_list_model_get_incremental.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the model currently filtered or {@code null} if none.
     * @return The model that gets filtered
     */
    public @Nullable org.gtk.gio.ListModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_filter_list_model_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.ListModel) Interop.register(RESULT, org.gtk.gio.ListModel.fromAddress).marshal(RESULT, null);
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
            RESULT = (int) DowncallHandles.gtk_filter_list_model_get_pending.invokeExact(handle());
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
                    Marshal.booleanToInteger.marshal(incremental, null).intValue());
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_filter_list_model_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link FilterListModel.Builder} object constructs a {@link FilterListModel} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FilterListModel.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link FilterListModel} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FilterListModel}.
         * @return A new instance of {@code FilterListModel} with the properties 
         *         that were set in the Builder object.
         */
        public FilterListModel build() {
            return (FilterListModel) org.gtk.gobject.GObject.newWithProperties(
                FilterListModel.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The filter for this model.
         * @param filter The value for the {@code filter} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFilter(org.gtk.gtk.Filter filter) {
            names.add("filter");
            values.add(org.gtk.gobject.Value.create(filter));
            return this;
        }
        
        /**
         * If the model should filter items incrementally.
         * @param incremental The value for the {@code incremental} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIncremental(boolean incremental) {
            names.add("incremental");
            values.add(org.gtk.gobject.Value.create(incremental));
            return this;
        }
        
        /**
         * The type of items. See {@link org.gtk.gio.ListModel#getItemType}.
         * @param itemType The value for the {@code item-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setItemType(org.gtk.glib.Type itemType) {
            names.add("item-type");
            values.add(org.gtk.gobject.Value.create(itemType));
            return this;
        }
        
        /**
         * The model being filtered.
         * @param model The value for the {@code model} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModel(org.gtk.gio.ListModel model) {
            names.add("model");
            values.add(org.gtk.gobject.Value.create(model));
            return this;
        }
        
        /**
         * The number of items. See {@link org.gtk.gio.ListModel#getNItems}.
         * @param nItems The value for the {@code n-items} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNItems(int nItems) {
            names.add("n-items");
            values.add(org.gtk.gobject.Value.create(nItems));
            return this;
        }
        
        /**
         * Number of items not yet filtered.
         * @param pending The value for the {@code pending} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPending(int pending) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_filter_list_model_get_type != null;
    }
}
