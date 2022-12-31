package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkCustomSorter} is a {@code GtkSorter} implementation that sorts via a callback
 * function.
 */
public class CustomSorter extends org.gtk.gtk.Sorter {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCustomSorter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CustomSorter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CustomSorter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CustomSorter> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CustomSorter(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.glib.CompareDataFunc sortFunc, @Nullable org.gtk.glib.DestroyNotify userDestroy) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_custom_sorter_new.invokeExact(
                    (Addressable) (sortFunc == null ? MemoryAddress.NULL : (Addressable) sortFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (userDestroy == null ? MemoryAddress.NULL : (Addressable) userDestroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkSorter} that works by calling
     * {@code sort_func} to compare items.
     * <p>
     * If {@code sort_func} is {@code null}, all items are considered equal.
     * @param sortFunc the {@code GCompareDataFunc} to use for sorting
     * @param userDestroy destroy notify for {@code user_data}
     */
    public CustomSorter(@Nullable org.gtk.glib.CompareDataFunc sortFunc, @Nullable org.gtk.glib.DestroyNotify userDestroy) {
        super(constructNew(sortFunc, userDestroy), Ownership.FULL);
    }
    
    /**
     * Sets (or unsets) the function used for sorting items.
     * <p>
     * If {@code sort_func} is {@code null}, all items are considered equal.
     * <p>
     * If the sort func changes its sorting behavior,
     * gtk_sorter_changed() needs to be called.
     * <p>
     * If a previous function was set, its {@code user_destroy} will be
     * called now.
     * @param sortFunc function to sort items
     * @param userDestroy destroy notify for {@code user_data}
     */
    public void setSortFunc(@Nullable org.gtk.glib.CompareDataFunc sortFunc, org.gtk.glib.DestroyNotify userDestroy) {
        try {
            DowncallHandles.gtk_custom_sorter_set_sort_func.invokeExact(
                    handle(),
                    (Addressable) (sortFunc == null ? MemoryAddress.NULL : (Addressable) sortFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) userDestroy.toCallback());
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
            RESULT = (long) DowncallHandles.gtk_custom_sorter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link CustomSorter.Builder} object constructs a {@link CustomSorter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CustomSorter.Builder#build()}. 
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
         * Finish building the {@link CustomSorter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CustomSorter}.
         * @return A new instance of {@code CustomSorter} with the properties 
         *         that were set in the Builder object.
         */
        public CustomSorter build() {
            return (CustomSorter) org.gtk.gobject.GObject.newWithProperties(
                CustomSorter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_custom_sorter_new = Interop.downcallHandle(
            "gtk_custom_sorter_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_custom_sorter_set_sort_func = Interop.downcallHandle(
            "gtk_custom_sorter_set_sort_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_custom_sorter_get_type = Interop.downcallHandle(
            "gtk_custom_sorter_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
