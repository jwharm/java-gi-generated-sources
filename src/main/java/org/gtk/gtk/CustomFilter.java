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
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public CustomFilter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to CustomFilter if its GType is a (or inherits from) "GtkCustomFilter".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "CustomFilter" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCustomFilter", a ClassCastException will be thrown.
     */
    public static CustomFilter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkCustomFilter"))) {
            return new CustomFilter(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCustomFilter");
        }
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gtk.CustomFilterFunc matchFunc) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_custom_filter_new.invokeExact(
                    (Addressable) (matchFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbCustomFilterFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (matchFunc == null ? MemoryAddress.NULL : Interop.registerCallback(matchFunc)),
                    Interop.cbDestroyNotifySymbol()), true);
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
        super(constructNew(matchFunc));
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
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (matchFunc == null ? MemoryAddress.NULL : Interop.registerCallback(matchFunc)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_custom_filter_new = Interop.downcallHandle(
            "gtk_custom_filter_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_custom_filter_set_filter_func = Interop.downcallHandle(
            "gtk_custom_filter_set_filter_func",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
