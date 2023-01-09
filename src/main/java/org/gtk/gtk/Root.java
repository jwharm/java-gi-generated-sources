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
 * hierarchy, with {@link Root#setFocus} and {@link Root#getFocus}.
 */
public interface Root extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RootImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RootImpl(input);
    
    /**
     * Returns the display that this {@code GtkRoot} is on.
     * @return the display of {@code root}
     */
    default org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_root_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Display) Interop.register(RESULT, org.gtk.gdk.Display.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Retrieves the current focused widget within the root.
     * <p>
     * Note that this is the widget that would have the focus
     * if the root is active; if the root is not focused then
     * {@code gtk_widget_has_focus (widget)} will be {@code false} for the
     * widget.
     * @return the currently focused widget
     */
    default @Nullable org.gtk.gtk.Widget getFocus() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_root_get_focus.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * If {@code focus} is not the current focus widget, and is focusable, sets
     * it as the focus widget for the root.
     * <p>
     * If {@code focus} is {@code null}, unsets the focus widget for the root.
     * <p>
     * To set the focus to a particular widget in the root, it is usually
     * more convenient to use {@link Widget#grabFocus} instead of
     * this function.
     * @param focus widget to be the new focus widget, or {@code null}
     *    to unset the focus widget
     */
    default void setFocus(@Nullable org.gtk.gtk.Widget focus) {
        try {
            DowncallHandles.gtk_root_set_focus.invokeExact(
                    handle(),
                    (Addressable) (focus == null ? MemoryAddress.NULL : focus.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_root_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_root_get_display = Interop.downcallHandle(
                "gtk_root_get_display",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_root_get_focus = Interop.downcallHandle(
                "gtk_root_get_focus",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_root_set_focus = Interop.downcallHandle(
                "gtk_root_set_focus",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_root_get_type = Interop.downcallHandle(
                "gtk_root_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The RootImpl type represents a native instance of the Root interface.
     */
    class RootImpl extends org.gtk.gobject.GObject implements Root {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of Root for the provided memory address.
         * @param address the memory address of the instance
         */
        public RootImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_root_get_type != null;
    }
}
