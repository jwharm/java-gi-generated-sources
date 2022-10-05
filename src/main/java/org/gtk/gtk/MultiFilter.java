package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkMultiFilter} is the base class for filters that combine multiple filters.
 */
public class MultiFilter extends Filter implements org.gtk.gio.ListModel, Buildable {

    public MultiFilter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MultiFilter */
    public static MultiFilter castFrom(org.gtk.gobject.Object gobject) {
        return new MultiFilter(gobject.refcounted());
    }
    
    static final MethodHandle gtk_multi_filter_append = Interop.downcallHandle(
        "gtk_multi_filter_append",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a {@code filter} to {@code self} to use for matching.
     */
    public void append(Filter filter) {
        try {
            gtk_multi_filter_append.invokeExact(handle(), filter.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_multi_filter_remove = Interop.downcallHandle(
        "gtk_multi_filter_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes the filter at the given {@code position} from the list of filters used
     * by {@code self}.
     * <p>
     * If {@code position} is larger than the number of filters, nothing happens and
     * the function returns.
     */
    public void remove(int position) {
        try {
            gtk_multi_filter_remove.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
