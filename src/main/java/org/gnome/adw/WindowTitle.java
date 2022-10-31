package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A helper widget for setting a window's title and subtitle.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="window-title-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="window-title.png" alt="window-title"&gt;
 * &lt;/picture&gt;
 * <p>
 * {@code AdwWindowTitle} shows a title and subtitle. It's intended to be used as the
 * title child of {@link org.gtk.gtk.HeaderBar}.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code AdwWindowTitle} has a single CSS node with name {@code windowtitle}.
 * @version 1.0
 */
public class WindowTitle extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwWindowTitle";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public WindowTitle(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to WindowTitle if its GType is a (or inherits from) "AdwWindowTitle".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "WindowTitle" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwWindowTitle", a ClassCastException will be thrown.
     */
    public static WindowTitle castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwWindowTitle"))) {
            return new WindowTitle(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwWindowTitle");
        }
    }
    
    private static Refcounted constructNew(@NotNull java.lang.String title, @NotNull java.lang.String subtitle) {
        java.util.Objects.requireNonNull(title, "Parameter 'title' must not be null");
        java.util.Objects.requireNonNull(subtitle, "Parameter 'subtitle' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_window_title_new.invokeExact(
                    Interop.allocateNativeString(title),
                    Interop.allocateNativeString(subtitle)), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwWindowTitle}.
     * @param title a title
     * @param subtitle a subtitle
     */
    public WindowTitle(@NotNull java.lang.String title, @NotNull java.lang.String subtitle) {
        super(constructNew(title, subtitle));
    }
    
    /**
     * Gets the subtitle of {@code self}.
     * @return the subtitle
     */
    public @NotNull java.lang.String getSubtitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_window_title_get_subtitle.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the title of {@code self}.
     * @return the title
     */
    public @NotNull java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_window_title_get_title.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Sets the subtitle of {@code self}.
     * <p>
     * The subtitle should give the user additional details.
     * @param subtitle a subtitle
     */
    public void setSubtitle(@NotNull java.lang.String subtitle) {
        java.util.Objects.requireNonNull(subtitle, "Parameter 'subtitle' must not be null");
        try {
            DowncallHandles.adw_window_title_set_subtitle.invokeExact(
                    handle(),
                    Interop.allocateNativeString(subtitle));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the title of {@code self}.
     * <p>
     * The title typically identifies the current view or content item, and
     * generally does not use the application name.
     * @param title a title
     */
    public void setTitle(@NotNull java.lang.String title) {
        java.util.Objects.requireNonNull(title, "Parameter 'title' must not be null");
        try {
            DowncallHandles.adw_window_title_set_title.invokeExact(
                    handle(),
                    Interop.allocateNativeString(title));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_window_title_new = Interop.downcallHandle(
            "adw_window_title_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_window_title_get_subtitle = Interop.downcallHandle(
            "adw_window_title_get_subtitle",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_window_title_get_title = Interop.downcallHandle(
            "adw_window_title_get_title",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_window_title_set_subtitle = Interop.downcallHandle(
            "adw_window_title_set_subtitle",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_window_title_set_title = Interop.downcallHandle(
            "adw_window_title_set_title",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
