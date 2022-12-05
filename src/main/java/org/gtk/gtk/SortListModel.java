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
    
    private static final java.lang.String C_TYPE_NAME = "GtkSortListModel";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a SortListModel proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SortListModel(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to SortListModel if its GType is a (or inherits from) "GtkSortListModel".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code SortListModel} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkSortListModel", a ClassCastException will be thrown.
     */
    public static SortListModel castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), SortListModel.getType())) {
            return new SortListModel(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkSortListModel");
        }
    }
    
    private static Addressable constructNew(@Nullable org.gtk.gio.ListModel model, @Nullable org.gtk.gtk.Sorter sorter) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_sort_list_model_new.invokeExact(
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()),
                    (Addressable) (sorter == null ? MemoryAddress.NULL : sorter.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        model.yieldOwnership();
        sorter.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates a new sort list model that uses the {@code sorter} to sort {@code model}.
     * @param model the model to sort
     * @param sorter the {@code GtkSorter} to sort {@code model} with,
     */
    public SortListModel(@Nullable org.gtk.gio.ListModel model, @Nullable org.gtk.gtk.Sorter sorter) {
        super(constructNew(model, sorter), Ownership.FULL);
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
            RESULT = (int) DowncallHandles.gtk_sort_list_model_get_incremental.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_sort_list_model_get_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(RESULT, Ownership.NONE);
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
            RESULT = (int) DowncallHandles.gtk_sort_list_model_get_pending.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_sort_list_model_get_sorter.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Sorter(RESULT, Ownership.NONE);
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
            DowncallHandles.gtk_sort_list_model_set_incremental.invokeExact(
                    handle(),
                    incremental ? 1 : 0);
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
        try {
            DowncallHandles.gtk_sort_list_model_set_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a new sorter on {@code self}.
     * @param sorter the {@code GtkSorter} to sort {@code model} with
     */
    public void setSorter(@Nullable org.gtk.gtk.Sorter sorter) {
        try {
            DowncallHandles.gtk_sort_list_model_set_sorter.invokeExact(
                    handle(),
                    (Addressable) (sorter == null ? MemoryAddress.NULL : sorter.handle()));
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
            RESULT = (long) DowncallHandles.gtk_sort_list_model_get_type.invokeExact();
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
         * A {@link SortListModel.Build} object constructs a {@link SortListModel} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link SortListModel} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SortListModel} using {@link SortListModel#castFrom}.
         * @return A new instance of {@code SortListModel} with the properties 
         *         that were set in the Build object.
         */
        public SortListModel construct() {
            return SortListModel.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    SortListModel.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * If the model should sort items incrementally.
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
         * The model being sorted.
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
         * Estimate of unsorted items remaining.
         * @param pending The value for the {@code pending} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPending(int pending) {
            names.add("pending");
            values.add(org.gtk.gobject.Value.create(pending));
            return this;
        }
        
        /**
         * The sorter for this model.
         * @param sorter The value for the {@code sorter} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSorter(org.gtk.gtk.Sorter sorter) {
            names.add("sorter");
            values.add(org.gtk.gobject.Value.create(sorter));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_sort_list_model_new = Interop.downcallHandle(
            "gtk_sort_list_model_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_sort_list_model_get_incremental = Interop.downcallHandle(
            "gtk_sort_list_model_get_incremental",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_sort_list_model_get_model = Interop.downcallHandle(
            "gtk_sort_list_model_get_model",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_sort_list_model_get_pending = Interop.downcallHandle(
            "gtk_sort_list_model_get_pending",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_sort_list_model_get_sorter = Interop.downcallHandle(
            "gtk_sort_list_model_get_sorter",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_sort_list_model_set_incremental = Interop.downcallHandle(
            "gtk_sort_list_model_set_incremental",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_sort_list_model_set_model = Interop.downcallHandle(
            "gtk_sort_list_model_set_model",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_sort_list_model_set_sorter = Interop.downcallHandle(
            "gtk_sort_list_model_set_sorter",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_sort_list_model_get_type = Interop.downcallHandle(
            "gtk_sort_list_model_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
