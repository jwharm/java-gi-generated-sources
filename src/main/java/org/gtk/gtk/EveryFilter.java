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
public class EveryFilter extends MultiFilter implements org.gtk.gio.ListModel, Buildable {

    public EveryFilter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to EveryFilter */
    public static EveryFilter castFrom(org.gtk.gobject.Object gobject) {
        return new EveryFilter(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_every_filter_new = Interop.downcallHandle(
        "gtk_every_filter_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_every_filter_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    
}
