package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkTreeListRowSorter} is a special-purpose sorter that will apply a given
 * sorter to the levels in a tree.
 * <p>
 * Here is an example for setting up a column view with a tree model and
 * a {@code GtkTreeListSorter}:
 * <pre>{@code c
 * column_sorter = gtk_column_view_get_sorter (view);
 * sorter = gtk_tree_list_row_sorter_new (g_object_ref (column_sorter));
 * sort_model = gtk_sort_list_model_new (tree_model, sorter);
 * selection = gtk_single_selection_new (sort_model);
 * gtk_column_view_set_model (view, G_LIST_MODEL (selection));
 * }</pre>
 */
public class TreeListRowSorter extends org.gtk.gtk.Sorter {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeListRowSorter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a TreeListRowSorter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TreeListRowSorter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeListRowSorter> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TreeListRowSorter(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gtk.Sorter sorter) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_list_row_sorter_new.invokeExact(
                    (Addressable) (sorter == null ? MemoryAddress.NULL : sorter.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        sorter.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Create a special-purpose sorter that applies the sorting
     * of {@code sorter} to the levels of a {@code GtkTreeListModel}.
     * <p>
     * Note that this sorter relies on {@code Gtk.TreeListModel:passthrough}
     * being {@code false} as it can only sort {@link TreeListRow}s.
     * @param sorter a {@code GtkSorter}
     */
    public TreeListRowSorter(@Nullable org.gtk.gtk.Sorter sorter) {
        super(constructNew(sorter), Ownership.FULL);
    }
    
    /**
     * Returns the sorter used by {@code self}.
     * @return the sorter used
     */
    public @Nullable org.gtk.gtk.Sorter getSorter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_list_row_sorter_get_sorter.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Sorter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Sorter.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the sorter to use for items with the same parent.
     * <p>
     * This sorter will be passed the {@code Gtk.TreeListRow:item} of
     * the tree list rows passed to {@code self}.
     * @param sorter The sorter to use
     */
    public void setSorter(@Nullable org.gtk.gtk.Sorter sorter) {
        try {
            DowncallHandles.gtk_tree_list_row_sorter_set_sorter.invokeExact(
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_tree_list_row_sorter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link TreeListRowSorter.Builder} object constructs a {@link TreeListRowSorter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TreeListRowSorter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Sorter.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link TreeListRowSorter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TreeListRowSorter}.
         * @return A new instance of {@code TreeListRowSorter} with the properties 
         *         that were set in the Builder object.
         */
        public TreeListRowSorter build() {
            return (TreeListRowSorter) org.gtk.gobject.GObject.newWithProperties(
                TreeListRowSorter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The underlying sorter
         * @param sorter The value for the {@code sorter} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSorter(org.gtk.gtk.Sorter sorter) {
            names.add("sorter");
            values.add(org.gtk.gobject.Value.create(sorter));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_tree_list_row_sorter_new = Interop.downcallHandle(
            "gtk_tree_list_row_sorter_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_list_row_sorter_get_sorter = Interop.downcallHandle(
            "gtk_tree_list_row_sorter_get_sorter",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_list_row_sorter_set_sorter = Interop.downcallHandle(
            "gtk_tree_list_row_sorter_set_sorter",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_list_row_sorter_get_type = Interop.downcallHandle(
            "gtk_tree_list_row_sorter_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
