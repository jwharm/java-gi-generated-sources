package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkCustomFilter</code> determines whether to include items with a callback.
 */
public class CustomFilter extends Filter {

    public CustomFilter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CustomFilter */
    public static CustomFilter castFrom(org.gtk.gobject.Object gobject) {
        return new CustomFilter(gobject.getReference());
    }
    
    private static Reference constructNew(CustomFilterFunc matchFunc) {
        try {
            Reference RESULT = References.get(gtk_h.gtk_custom_filter_new(
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCustomFilterFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(matchFunc.hashCode(), matchFunc)), 
                    Interop.cbDestroyNotifySymbol()), true);
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a new filter using the given @match_func to filter
     * items.
     * 
     * If @match_func is <code>NULL,</code> the filter matches all items.
     * 
     * If the filter func changes its filtering behavior,
     * gtk_filter_changed() needs to be called.
     */
    public CustomFilter(CustomFilterFunc matchFunc) {
        super(constructNew(matchFunc));
    }
    
    /**
     * Sets the function used for filtering items.
     * 
     * If @match_func is <code>NULL,</code> the filter matches all items.
     * 
     * If the filter func changes its filtering behavior,
     * gtk_filter_changed() needs to be called.
     * 
     * If a previous function was set, its @user_destroy will be
     * called now.
     */
    public void setFilterFunc(CustomFilterFunc matchFunc) {
        try {
            gtk_h.gtk_custom_filter_set_filter_func(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCustomFilterFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(matchFunc.hashCode(), matchFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
