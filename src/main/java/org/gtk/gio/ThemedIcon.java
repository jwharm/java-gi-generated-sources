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
public class ThemedIcon extends org.gtk.gobject.Object implements Icon {

    public ThemedIcon(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ThemedIcon */
    public static ThemedIcon castFrom(org.gtk.gobject.Object gobject) {
        return new ThemedIcon(gobject.refcounted());
    }
    
    private static final MethodHandle g_themed_icon_new = Interop.downcallHandle(
        "g_themed_icon_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull java.lang.String iconname) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_themed_icon_new.invokeExact(Interop.allocateNativeString(iconname)), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new themed icon for {@code iconname}.
     */
    public ThemedIcon(@NotNull java.lang.String iconname) {
        super(constructNew(iconname));
    }
    
    private static final MethodHandle g_themed_icon_new_from_names = Interop.downcallHandle(
        "g_themed_icon_new_from_names",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewFromNames(@NotNull java.lang.String[] iconnames, @NotNull int len) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_themed_icon_new_from_names.invokeExact(Interop.allocateNativeArray(iconnames), len), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new themed icon for {@code iconnames}.
     */
    public static ThemedIcon newFromNames(@NotNull java.lang.String[] iconnames, @NotNull int len) {
        return new ThemedIcon(constructNewFromNames(iconnames, len));
    }
    
    private static final MethodHandle g_themed_icon_new_with_default_fallbacks = Interop.downcallHandle(
        "g_themed_icon_new_with_default_fallbacks",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithDefaultFallbacks(@NotNull java.lang.String iconname) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_themed_icon_new_with_default_fallbacks.invokeExact(Interop.allocateNativeString(iconname)), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public static ThemedIcon newWithDefaultFallbacks(@NotNull java.lang.String iconname) {
        return new ThemedIcon(constructNewWithDefaultFallbacks(iconname));
    }
    
    private static final MethodHandle g_themed_icon_append_name = Interop.downcallHandle(
        "g_themed_icon_append_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Append a name to the list of icons from within {@code icon}.
     * <p>
     * Note that doing so invalidates the hash computed by prior calls
     * to g_icon_hash().
     */
    public @NotNull void appendName(@NotNull java.lang.String iconname) {
        try {
            g_themed_icon_append_name.invokeExact(handle(), Interop.allocateNativeString(iconname));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_themed_icon_get_names = Interop.downcallHandle(
        "g_themed_icon_get_names",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the names of icons from within {@code icon}.
     */
    public PointerString getNames() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_themed_icon_get_names.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    private static final MethodHandle g_themed_icon_prepend_name = Interop.downcallHandle(
        "g_themed_icon_prepend_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prepend a name to the list of icons from within {@code icon}.
     * <p>
     * Note that doing so invalidates the hash computed by prior calls
     * to g_icon_hash().
     */
    public @NotNull void prependName(@NotNull java.lang.String iconname) {
        try {
            g_themed_icon_prepend_name.invokeExact(handle(), Interop.allocateNativeString(iconname));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
