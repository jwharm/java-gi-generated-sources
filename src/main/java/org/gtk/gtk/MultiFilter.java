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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a MultiFilter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MultiFilter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to MultiFilter if its GType is a (or inherits from) "GtkMultiFilter".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code MultiFilter} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkMultiFilter", a ClassCastException will be thrown.
     */
    public static MultiFilter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkMultiFilter"))) {
            return new MultiFilter(gobject.handle(), gobject.yieldOwnership());
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
                    filter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        filter.yieldOwnership();
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
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_multi_filter_remove = Interop.downcallHandle(
            "gtk_multi_filter_remove",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
}
