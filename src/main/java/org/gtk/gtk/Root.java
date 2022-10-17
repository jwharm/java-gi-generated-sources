package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkRoot} is the interface implemented by all widgets that can act as a toplevel
 * widget.
 * <p>
 * The root widget takes care of providing the connection to the windowing system
 * and manages layout, drawing and event delivery for its widget hierarchy.
 * <p>
 * The obvious example of a {@code GtkRoot} is {@code GtkWindow}.
 * <p>
 * To get the display to which a {@code GtkRoot} belongs, use
 * {@link Root#getDisplay}.
 * <p>
 * {@code GtkRoot} also maintains the location of keyboard focus inside its widget
 * hierarchy, with {@code Gtk.Root.get_focus}.
 */
public interface Root extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle gtk_root_get_display = Interop.downcallHandle(
        "gtk_root_get_display",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the display that this {@code GtkRoot} is on.
     */
    default @NotNull org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_root_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Display(Refcounted.get(RESULT, false));
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_root_get_focus = Interop.downcallHandle(
        "gtk_root_get_focus",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the current focused widget within the root.
     * <p>
     * Note that this is the widget that would have the focus
     * if the root is active; if the root is not focused then
     * {@code gtk_widget_has_focus (widget)} will be {@code false} for the
     * widget.
     */
    default @Nullable Widget getFocus() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_root_get_focus.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    @ApiStatus.Internal static final MethodHandle gtk_root_set_focus = Interop.downcallHandle(
        "gtk_root_set_focus",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * If {@code focus} is not the current focus widget, and is focusable, sets
     * it as the focus widget for the root.
     * <p>
     * If {@code focus} is {@code null}, unsets the focus widget for the root.
     * <p>
     * To set the focus to a particular widget in the root, it is usually
     * more convenient to use {@link Widget#grabFocus} instead of
     * this function.
     */
    default @NotNull void setFocus(@Nullable Widget focus) {
        try {
            gtk_root_set_focus.invokeExact(handle(), focus.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    class RootImpl extends org.gtk.gobject.Object implements Root {
        public RootImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
