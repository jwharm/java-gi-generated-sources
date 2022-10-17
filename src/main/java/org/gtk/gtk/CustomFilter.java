package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkCustomFilter} determines whether to include items with a callback.
 */
public class CustomFilter extends Filter {

    public CustomFilter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CustomFilter */
    public static CustomFilter castFrom(org.gtk.gobject.Object gobject) {
        return new CustomFilter(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_custom_filter_new = Interop.downcallHandle(
        "gtk_custom_filter_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@Nullable CustomFilterFunc matchFunc) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_custom_filter_new.invokeExact(
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbCustomFilterFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(matchFunc)), 
                    Interop.cbDestroyNotifySymbol()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new filter using the given {@code match_func} to filter
     * items.
     * <p>
     * If {@code match_func} is {@code null}, the filter matches all items.
     * <p>
     * If the filter func changes its filtering behavior,
     * gtk_filter_changed() needs to be called.
     */
    public CustomFilter(@Nullable CustomFilterFunc matchFunc) {
        super(constructNew(matchFunc));
    }
    
    private static final MethodHandle gtk_custom_filter_set_filter_func = Interop.downcallHandle(
        "gtk_custom_filter_set_filter_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull void setFilterFunc(@Nullable CustomFilterFunc matchFunc) {
        try {
            gtk_custom_filter_set_filter_func.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbCustomFilterFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(matchFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
