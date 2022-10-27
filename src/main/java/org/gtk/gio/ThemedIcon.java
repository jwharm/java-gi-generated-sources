package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link ThemedIcon} is an implementation of {@link Icon} that supports icon themes.
 * {@link ThemedIcon} contains a list of all of the icons present in an icon
 * theme, so that icons can be looked up quickly. {@link ThemedIcon} does
 * not provide actual pixmaps for icons, just the icon names.
 * Ideally something like gtk_icon_theme_choose_icon() should be used to
 * resolve the list of names so that fallback icons work nicely with
 * themes that inherit other themes.
 */
public class ThemedIcon extends org.gtk.gobject.Object implements org.gtk.gio.Icon {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public ThemedIcon(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ThemedIcon */
    public static ThemedIcon castFrom(org.gtk.gobject.Object gobject) {
        return new ThemedIcon(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull java.lang.String iconname) {
        java.util.Objects.requireNonNull(iconname, "Parameter 'iconname' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_themed_icon_new.invokeExact(Interop.allocateNativeString(iconname)), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new themed icon for {@code iconname}.
     * @param iconname a string containing an icon name.
     */
    public ThemedIcon(@NotNull java.lang.String iconname) {
        super(constructNew(iconname));
    }
    
    private static Refcounted constructNewFromNames(java.lang.String[] iconnames, int len) {
        java.util.Objects.requireNonNull(iconnames, "Parameter 'iconnames' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_themed_icon_new_from_names.invokeExact(Interop.allocateNativeArray(iconnames, false), len), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new themed icon for {@code iconnames}.
     * @param iconnames an array of strings containing icon names.
     * @param len the length of the {@code iconnames} array, or -1 if {@code iconnames} is
     *     {@code null}-terminated
     * @return a new {@link ThemedIcon}
     */
    public static ThemedIcon newFromNames(java.lang.String[] iconnames, int len) {
        return new ThemedIcon(constructNewFromNames(iconnames, len));
    }
    
    private static Refcounted constructNewWithDefaultFallbacks(@NotNull java.lang.String iconname) {
        java.util.Objects.requireNonNull(iconname, "Parameter 'iconname' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_themed_icon_new_with_default_fallbacks.invokeExact(Interop.allocateNativeString(iconname)), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new themed icon for {@code iconname}, and all the names
     * that can be created by shortening {@code iconname} at '-' characters.
     * <p>
     * In the following example, {@code icon1} and {@code icon2} are equivalent:
     * <pre>{@code <!-- language="C" -->
     * const char *names[] = {
     *   "gnome-dev-cdrom-audio",
     *   "gnome-dev-cdrom",
     *   "gnome-dev",
     *   "gnome"
     * };
     * 
     * icon1 = g_themed_icon_new_from_names (names, 4);
     * icon2 = g_themed_icon_new_with_default_fallbacks ("gnome-dev-cdrom-audio");
     * }</pre>
     * @param iconname a string containing an icon name
     * @return a new {@link ThemedIcon}.
     */
    public static ThemedIcon newWithDefaultFallbacks(@NotNull java.lang.String iconname) {
        return new ThemedIcon(constructNewWithDefaultFallbacks(iconname));
    }
    
    /**
     * Append a name to the list of icons from within {@code icon}.
     * <p>
     * Note that doing so invalidates the hash computed by prior calls
     * to g_icon_hash().
     * @param iconname name of icon to append to list of icons from within {@code icon}.
     */
    public void appendName(@NotNull java.lang.String iconname) {
        java.util.Objects.requireNonNull(iconname, "Parameter 'iconname' must not be null");
        try {
            DowncallHandles.g_themed_icon_append_name.invokeExact(handle(), Interop.allocateNativeString(iconname));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the names of icons from within {@code icon}.
     * @return a list of icon names.
     */
    public @NotNull PointerString getNames() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_themed_icon_get_names.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Prepend a name to the list of icons from within {@code icon}.
     * <p>
     * Note that doing so invalidates the hash computed by prior calls
     * to g_icon_hash().
     * @param iconname name of icon to prepend to list of icons from within {@code icon}.
     */
    public void prependName(@NotNull java.lang.String iconname) {
        java.util.Objects.requireNonNull(iconname, "Parameter 'iconname' must not be null");
        try {
            DowncallHandles.g_themed_icon_prepend_name.invokeExact(handle(), Interop.allocateNativeString(iconname));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_themed_icon_new = Interop.downcallHandle(
            "g_themed_icon_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_themed_icon_new_from_names = Interop.downcallHandle(
            "g_themed_icon_new_from_names",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_themed_icon_new_with_default_fallbacks = Interop.downcallHandle(
            "g_themed_icon_new_with_default_fallbacks",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_themed_icon_append_name = Interop.downcallHandle(
            "g_themed_icon_append_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_themed_icon_get_names = Interop.downcallHandle(
            "g_themed_icon_get_names",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_themed_icon_prepend_name = Interop.downcallHandle(
            "g_themed_icon_prepend_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
