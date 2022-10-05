package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkLayoutChild} is the base class for objects that are meant to hold
 * layout properties.
 * <p>
 * If a {@code GtkLayoutManager} has per-child properties, like their packing type,
 * or the horizontal and vertical span, or the icon name, then the layout
 * manager should use a {@code GtkLayoutChild} implementation to store those properties.
 * <p>
 * A {@code GtkLayoutChild} instance is only ever valid while a widget is part
 * of a layout.
 */
public class LayoutChild extends org.gtk.gobject.Object {

    public LayoutChild(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to LayoutChild */
    public static LayoutChild castFrom(org.gtk.gobject.Object gobject) {
        return new LayoutChild(gobject.refcounted());
    }
    
    static final MethodHandle gtk_layout_child_get_child_widget = Interop.downcallHandle(
        "gtk_layout_child_get_child_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the {@code GtkWidget} associated to the given {@code layout_child}.
     */
    public Widget getChildWidget() {
        try {
            var RESULT = (MemoryAddress) gtk_layout_child_get_child_widget.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_layout_child_get_layout_manager = Interop.downcallHandle(
        "gtk_layout_child_get_layout_manager",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the {@code GtkLayoutManager} instance that created the
     * given {@code layout_child}.
     */
    public LayoutManager getLayoutManager() {
        try {
            var RESULT = (MemoryAddress) gtk_layout_child_get_layout_manager.invokeExact(handle());
            return new LayoutManager(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
