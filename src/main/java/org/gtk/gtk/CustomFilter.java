package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkCustomFilter} determines whether to include items with a callback.
 */
public class CustomFilter extends org.gtk.gtk.Filter {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCustomFilter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CustomFilter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CustomFilter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CustomFilter if its GType is a (or inherits from) "GtkCustomFilter".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CustomFilter} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCustomFilter", a ClassCastException will be thrown.
     */
    public static CustomFilter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), CustomFilter.getType())) {
            return new CustomFilter(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCustomFilter");
        }
    }
    
    private static Addressable constructNew(@Nullable org.gtk.gtk.CustomFilterFunc matchFunc) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_custom_filter_new.invokeExact(
                    (Addressable) (matchFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbCustomFilterFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (matchFunc == null ? MemoryAddress.NULL : Interop.registerCallback(matchFunc)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new filter using the given {@code match_func} to filter
     * items.
     * <p>
     * If {@code match_func} is {@code null}, the filter matches all items.
     * <p>
     * If the filter func changes its filtering behavior,
     * gtk_filter_changed() needs to be called.
     * @param matchFunc function to filter items
     */
    public CustomFilter(@Nullable org.gtk.gtk.CustomFilterFunc matchFunc) {
        super(constructNew(matchFunc), Ownership.FULL);
    }
    
    /**
     * Sets the function used for filtering items.
     * <p>
     * If {@code match_func} is {@code null}, the filter matches all items.
     * <p>
     * If the filter func changes its filtering behavior,
     * gtk_filter_changed() needs to be called.
     * <p>
     * If a previous function was set, its {@code user_destroy} will be
     * called now.
     * @param matchFunc function to filter items
     */
    public void setFilterFunc(@Nullable org.gtk.gtk.CustomFilterFunc matchFunc) {
        try {
            DowncallHandles.gtk_custom_filter_set_filter_func.invokeExact(
                    handle(),
                    (Addressable) (matchFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbCustomFilterFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (matchFunc == null ? MemoryAddress.NULL : Interop.registerCallback(matchFunc)),
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
            RESULT = (long) DowncallHandles.gtk_custom_filter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Filter.Build {
        
         /**
         * A {@link CustomFilter.Build} object constructs a {@link CustomFilter} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link CustomFilter} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CustomFilter} using {@link CustomFilter#castFrom}.
         * @return A new instance of {@code CustomFilter} with the properties 
         *         that were set in the Build object.
         */
        public CustomFilter construct() {
            return CustomFilter.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    CustomFilter.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_custom_filter_new = Interop.downcallHandle(
            "gtk_custom_filter_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_custom_filter_set_filter_func = Interop.downcallHandle(
            "gtk_custom_filter_set_filter_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_custom_filter_get_type = Interop.downcallHandle(
            "gtk_custom_filter_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
