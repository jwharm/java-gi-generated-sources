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
    @ApiStatus.Internal
    public CustomSorter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CustomSorter if its GType is a (or inherits from) "GtkCustomSorter".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CustomSorter} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCustomSorter", a ClassCastException will be thrown.
     */
    public static CustomSorter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), CustomSorter.getType())) {
            return new CustomSorter(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCustomSorter");
        }
    }
    
    private static Addressable constructNew(@Nullable org.gtk.glib.CompareDataFunc sortFunc) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_custom_sorter_new.invokeExact(
                    (Addressable) (sortFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (sortFunc == null ? MemoryAddress.NULL : Interop.registerCallback(sortFunc)),
                    Interop.cbDestroyNotifySymbol());
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
     */
    public CustomSorter(@Nullable org.gtk.glib.CompareDataFunc sortFunc) {
        super(constructNew(sortFunc), Ownership.FULL);
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
     */
    public void setSortFunc(@Nullable org.gtk.glib.CompareDataFunc sortFunc) {
        try {
            DowncallHandles.gtk_custom_sorter_set_sort_func.invokeExact(
                    handle(),
                    (Addressable) (sortFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (sortFunc == null ? MemoryAddress.NULL : Interop.registerCallback(sortFunc)),
                    Interop.cbDestroyNotifySymbol());
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
            RESULT = (long) DowncallHandles.gtk_custom_sorter_get_type.invokeExact();
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
         * A {@link CustomSorter.Build} object constructs a {@link CustomSorter} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link CustomSorter} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CustomSorter} using {@link CustomSorter#castFrom}.
         * @return A new instance of {@code CustomSorter} with the properties 
         *         that were set in the Build object.
         */
        public CustomSorter construct() {
            return CustomSorter.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    CustomSorter.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
