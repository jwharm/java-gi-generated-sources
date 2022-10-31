package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkMultiFilter} is the base class for filters that combine multiple filters.
 */
public class MultiFilter extends org.gtk.gtk.Filter implements org.gtk.gio.ListModel, org.gtk.gtk.Buildable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkMultiFilter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public MultiFilter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to MultiFilter if its GType is a (or inherits from) "GtkMultiFilter".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "MultiFilter" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkMultiFilter", a ClassCastException will be thrown.
     */
    public static MultiFilter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkMultiFilter"))) {
            return new MultiFilter(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkMultiFilter");
        }
    }
    
    /**
     * Adds a {@code filter} to {@code self} to use for matching.
     * @param filter A new filter to use
     */
    public void append(@NotNull org.gtk.gtk.Filter filter) {
        java.util.Objects.requireNonNull(filter, "Parameter 'filter' must not be null");
        try {
            DowncallHandles.gtk_multi_filter_append.invokeExact(
                    handle(),
                    filter.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes the filter at the given {@code position} from the list of filters used
     * by {@code self}.
     * <p>
     * If {@code position} is larger than the number of filters, nothing happens and
     * the function returns.
     * @param position position of filter to remove
     */
    public void remove(int position) {
        try {
            DowncallHandles.gtk_multi_filter_remove.invokeExact(
                    handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_multi_filter_append = Interop.downcallHandle(
            "gtk_multi_filter_append",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_multi_filter_remove = Interop.downcallHandle(
            "gtk_multi_filter_remove",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
