package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkCustomSorter` is a `GtkSorter` implementation that sorts via a callback
 * function.
 */
public class CustomSorter extends Sorter {

    public CustomSorter(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CustomSorter */
    public static CustomSorter castFrom(org.gtk.gobject.Object gobject) {
        return new CustomSorter(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkSorter` that works by calling
     * @sort_func to compare items.
     * 
     * If @sort_func is %NULL, all items are considered equal.
     */
    public CustomSorter(org.gtk.glib.CompareDataFunc sortFunc, jdk.incubator.foreign.MemoryAddress userData, org.gtk.glib.DestroyNotify userDestroy) {
        super(References.get(gtk_h.gtk_custom_sorter_new(sortFunc, userData, userDestroy), true));
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
    public void setSortFunc(CustomSorter self, org.gtk.glib.CompareDataFunc sortFunc) {
        try {
            int hash = sortFunc.hashCode();
            Interop.signalRegistry.put(hash, sortFunc);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCompareDataFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.gtk_custom_sorter_set_sort_func(handle(), nativeSymbol, intSegment, Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
