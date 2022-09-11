package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkCustomFilter` determines whether to include items with a callback.
 */
public class CustomFilter extends Filter {

    public CustomFilter(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CustomFilter */
    public static CustomFilter castFrom(org.gtk.gobject.Object gobject) {
        return new CustomFilter(gobject.getReference());
    }
    
    /**
     * Creates a new filter using the given @match_func to filter
     * items.
     * 
     * If @match_func is %NULL, the filter matches all items.
     * 
     * If the filter func changes its filtering behavior,
     * gtk_filter_changed() needs to be called.
     */
    public CustomFilter(CustomFilterFunc matchFunc, jdk.incubator.foreign.MemoryAddress userData, org.gtk.glib.DestroyNotify userDestroy) {
        super(References.get(gtk_h.gtk_custom_filter_new(matchFunc, userData, userDestroy), true));
    }
    
    /**
     * Sets the function used for filtering items.
     * 
     * If @match_func is %NULL, the filter matches all items.
     * 
     * If the filter func changes its filtering behavior,
     * gtk_filter_changed() needs to be called.
     * 
     * If a previous function was set, its @user_destroy will be
     * called now.
     */
    public void setFilterFunc(CustomFilter self, CustomFilterFunc matchFunc) {
        try {
            int hash = matchFunc.hashCode();
            Interop.signalRegistry.put(hash, matchFunc);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCustomFilterFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.gtk_custom_filter_set_filter_func(handle(), nativeSymbol, intSegment, Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
