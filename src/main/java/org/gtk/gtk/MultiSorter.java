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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MultiSorter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to MultiSorter if its GType is a (or inherits from) "GtkMultiSorter".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code MultiSorter} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkMultiSorter", a ClassCastException will be thrown.
     */
    public static MultiSorter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), MultiSorter.getType())) {
            return new MultiSorter(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkMultiSorter");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Add {@code sorter} to {@code self} to use for sorting at the end.
     * <p>
     * {@code self} will consult all existing sorters before it will
     * sort with the given {@code sorter}.
     * @param sorter a sorter to add
     */
    public void append(@NotNull org.gtk.gtk.Sorter sorter) {
        java.util.Objects.requireNonNull(sorter, "Parameter 'sorter' must not be null");
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_multi_sorter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Sorter.Build {
        
         /**
         * A {@link MultiSorter.Build} object constructs a {@link MultiSorter} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link MultiSorter} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MultiSorter} using {@link MultiSorter#castFrom}.
         * @return A new instance of {@code MultiSorter} with the properties 
         *         that were set in the Build object.
         */
        public MultiSorter construct() {
            return MultiSorter.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    MultiSorter.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
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
         * The number of items. See {@link org.gtk.gio.ListModel#getNItems}.
         * @param nItems The value for the {@code n-items} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNItems(int nItems) {
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
}
