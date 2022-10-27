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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public CustomSorter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CustomSorter */
    public static CustomSorter castFrom(org.gtk.gobject.Object gobject) {
        return new CustomSorter(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.glib.CompareDataFunc sortFunc) {
        java.util.Objects.requireNonNullElse(sortFunc, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_custom_sorter_new.invokeExact(
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (sortFunc == null ? MemoryAddress.NULL : Interop.registerCallback(sortFunc)), 
                    Interop.cbDestroyNotifySymbol()), true);
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
        super(constructNew(sortFunc));
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
        java.util.Objects.requireNonNullElse(sortFunc, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_custom_sorter_set_sort_func.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (sortFunc == null ? MemoryAddress.NULL : Interop.registerCallback(sortFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_custom_sorter_new = Interop.downcallHandle(
            "gtk_custom_sorter_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_custom_sorter_set_sort_func = Interop.downcallHandle(
            "gtk_custom_sorter_set_sort_func",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
