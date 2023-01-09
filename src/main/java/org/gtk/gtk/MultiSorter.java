package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkMultiSorter} combines multiple sorters by trying them
 * in turn.
 * <p>
 * If the first sorter compares two items as equal,
 * the second is tried next, and so on.
 */
public class MultiSorter extends org.gtk.gtk.Sorter implements org.gtk.gio.ListModel, org.gtk.gtk.Buildable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkMultiSorter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a MultiSorter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MultiSorter(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MultiSorter> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MultiSorter(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_multi_sorter_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new multi sorter.
     * <p>
     * This sorter compares items by trying each of the sorters
     * in turn, until one returns non-zero. In particular, if
     * no sorter has been added to it, it will always compare
     * items as equal.
     */
    public MultiSorter() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Add {@code sorter} to {@code self} to use for sorting at the end.
     * <p>
     * {@code self} will consult all existing sorters before it will
     * sort with the given {@code sorter}.
     * @param sorter a sorter to add
     */
    public void append(org.gtk.gtk.Sorter sorter) {
        try {
            DowncallHandles.gtk_multi_sorter_append.invokeExact(
                    handle(),
                    sorter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        sorter.yieldOwnership();
    }
    
    /**
     * Removes the sorter at the given {@code position} from the list of sorter
     * used by {@code self}.
     * <p>
     * If {@code position} is larger than the number of sorters, nothing happens.
     * @param position position of sorter to remove
     */
    public void remove(int position) {
        try {
            DowncallHandles.gtk_multi_sorter_remove.invokeExact(
                    handle(),
                    position);
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
            RESULT = (long) DowncallHandles.gtk_multi_sorter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link MultiSorter.Builder} object constructs a {@link MultiSorter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link MultiSorter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Sorter.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link MultiSorter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MultiSorter}.
         * @return A new instance of {@code MultiSorter} with the properties 
         *         that were set in the Builder object.
         */
        public MultiSorter build() {
            return (MultiSorter) org.gtk.gobject.GObject.newWithProperties(
                MultiSorter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
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
         * The number of items. See {@link org.gtk.gio.ListModel#getNItems}.
         * @param nItems The value for the {@code n-items} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNItems(int nItems) {
            names.add("n-items");
            values.add(org.gtk.gobject.Value.create(nItems));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_multi_sorter_new = Interop.downcallHandle(
                "gtk_multi_sorter_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_multi_sorter_append = Interop.downcallHandle(
                "gtk_multi_sorter_append",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_multi_sorter_remove = Interop.downcallHandle(
                "gtk_multi_sorter_remove",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_multi_sorter_get_type = Interop.downcallHandle(
                "gtk_multi_sorter_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_multi_sorter_get_type != null;
    }
}
