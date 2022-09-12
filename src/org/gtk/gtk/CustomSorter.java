package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkCustomSorter` is a `GtkSorter` implementation that sorts via a callback
 * function.
 */
public class CustomSorter extends Sorter {

    public CustomSorter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CustomSorter */
    public static CustomSorter castFrom(org.gtk.gobject.Object gobject) {
        return new CustomSorter(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.glib.CompareDataFunc sortFunc) {
        try {
            Reference RESULT = References.get(gtk_h.gtk_custom_sorter_new(
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(sortFunc.hashCode(), sortFunc)), 
                    Interop.cbDestroyNotifySymbol()), true);
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a new `GtkSorter` that works by calling
     * @sort_func to compare items.
     * 
     * If @sort_func is %NULL, all items are considered equal.
     */
    public CustomSorter(org.gtk.glib.CompareDataFunc sortFunc) {
        super(constructNew(sortFunc));
    }
    
    /**
     * Sets (or unsets) the function used for sorting items.
     * 
     * If @sort_func is %NULL, all items are considered equal.
     * 
     * If the sort func changes its sorting behavior,
     * gtk_sorter_changed() needs to be called.
     * 
     * If a previous function was set, its @user_destroy will be
     * called now.
     */
    public void setSortFunc(org.gtk.glib.CompareDataFunc sortFunc) {
        try {
            gtk_h.gtk_custom_sorter_set_sort_func(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(sortFunc.hashCode(), sortFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
