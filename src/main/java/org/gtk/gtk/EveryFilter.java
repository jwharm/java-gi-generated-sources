package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkEveryFilter} matches an item when each of its filters matches.
 * <p>
 * To add filters to a {@code GtkEveryFilter}, use {@link MultiFilter#append}.
 */
public class EveryFilter extends org.gtk.gtk.MultiFilter implements org.gtk.gio.ListModel, org.gtk.gtk.Buildable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkEveryFilter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public EveryFilter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to EveryFilter if its GType is a (or inherits from) "GtkEveryFilter".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "EveryFilter" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkEveryFilter", a ClassCastException will be thrown.
     */
    public static EveryFilter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkEveryFilter"))) {
            return new EveryFilter(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkEveryFilter");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_every_filter_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new empty "every" filter.
     * <p>
     * Use {@link MultiFilter#append} to add filters to it.
     * <p>
     * This filter matches an item if each of the filters added to it
     * matches the item. In particular, this means that if no filter
     * has been added to it, the filter matches every item.
     */
    public EveryFilter() {
        super(constructNew());
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_every_filter_new = Interop.downcallHandle(
            "gtk_every_filter_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
}
