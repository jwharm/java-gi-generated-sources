package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkCustomSorter} is a {@code GtkSorter} implementation that sorts via a callback
 * function.
 */
public class CustomSorter extends Sorter {

    public CustomSorter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CustomSorter */
    public static CustomSorter castFrom(org.gtk.gobject.Object gobject) {
        return new CustomSorter(gobject.refcounted());
    }
    
    static final MethodHandle gtk_custom_sorter_new = Interop.downcallHandle(
        "gtk_custom_sorter_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(org.gtk.glib.CompareDataFunc sortFunc) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_custom_sorter_new.invokeExact(
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(sortFunc.hashCode(), sortFunc)), 
                    Interop.cbDestroyNotifySymbol()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkSorter} that works by calling
     * {@code sort_func} to compare items.
     * <p>
     * If {@code sort_func} is {@code null}, all items are considered equal.
     */
    public CustomSorter(org.gtk.glib.CompareDataFunc sortFunc) {
        super(constructNew(sortFunc));
    }
    
    static final MethodHandle gtk_custom_sorter_set_sort_func = Interop.downcallHandle(
        "gtk_custom_sorter_set_sort_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void setSortFunc(org.gtk.glib.CompareDataFunc sortFunc) {
        try {
            gtk_custom_sorter_set_sort_func.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(sortFunc.hashCode(), sortFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
