package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkWindowHandle} is a titlebar area widget.
 * <p>
 * When added into a window, it can be dragged to move the window, and handles
 * right click, double click and middle click as expected of a titlebar.
 * 
 * <h1>CSS nodes</h1>
 * {@code GtkWindowHandle} has a single CSS node with the name {@code windowhandle}.
 * 
 * <h1>Accessibility</h1>
 * {@code GtkWindowHandle} uses the {@link AccessibleRole#GROUP} role.
 */
public class WindowHandle extends Widget implements Accessible, Buildable, ConstraintTarget {

    public WindowHandle(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to WindowHandle */
    public static WindowHandle castFrom(org.gtk.gobject.Object gobject) {
        return new WindowHandle(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_window_handle_new = Interop.downcallHandle(
        "gtk_window_handle_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_window_handle_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkWindowHandle}.
     */
    public WindowHandle() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_window_handle_get_child = Interop.downcallHandle(
        "gtk_window_handle_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child widget of {@code self}.
     */
    public @Nullable Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_window_handle_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_window_handle_set_child = Interop.downcallHandle(
        "gtk_window_handle_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the child widget of {@code self}.
     */
    public @NotNull void setChild(@Nullable Widget child) {
        try {
            gtk_window_handle_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
