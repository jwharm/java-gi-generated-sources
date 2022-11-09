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
    
    private static final java.lang.String C_TYPE_NAME = "GThemedIcon";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ThemedIcon proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ThemedIcon(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ThemedIcon if its GType is a (or inherits from) "GThemedIcon".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ThemedIcon" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GThemedIcon", a ClassCastException will be thrown.
     */
    public static ThemedIcon castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GThemedIcon"))) {
            return new ThemedIcon(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GThemedIcon");
        }
    }
    
    private static Addressable constructNew(@NotNull java.lang.String iconname) {
        java.util.Objects.requireNonNull(iconname, "Parameter 'iconname' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_themed_icon_new.invokeExact(
                    Interop.allocateNativeString(iconname));
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
        super(constructNew(iconname), Ownership.FULL);
    }
    
    private static Addressable constructNewFromNames(@NotNull java.lang.String[] iconnames, int len) {
        java.util.Objects.requireNonNull(iconnames, "Parameter 'iconnames' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_themed_icon_new_from_names.invokeExact(
                    Interop.allocateNativeArray(iconnames, false),
                    len);
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
    public static ThemedIcon newFromNames(@NotNull java.lang.String[] iconnames, int len) {
        return new ThemedIcon(constructNewFromNames(iconnames, len), Ownership.FULL);
    }
    
    private static Addressable constructNewWithDefaultFallbacks(@NotNull java.lang.String iconname) {
        java.util.Objects.requireNonNull(iconname, "Parameter 'iconname' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_themed_icon_new_with_default_fallbacks.invokeExact(
                    Interop.allocateNativeString(iconname));
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
        return new ThemedIcon(constructNewWithDefaultFallbacks(iconname), Ownership.FULL);
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
            DowncallHandles.g_themed_icon_append_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(iconname));
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
            RESULT = (MemoryAddress) DowncallHandles.g_themed_icon_get_names.invokeExact(
                    handle());
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
            DowncallHandles.g_themed_icon_prepend_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(iconname));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_themed_icon_new = Interop.downcallHandle(
            "g_themed_icon_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_themed_icon_new_from_names = Interop.downcallHandle(
            "g_themed_icon_new_from_names",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_themed_icon_new_with_default_fallbacks = Interop.downcallHandle(
            "g_themed_icon_new_with_default_fallbacks",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_themed_icon_append_name = Interop.downcallHandle(
            "g_themed_icon_append_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_themed_icon_get_names = Interop.downcallHandle(
            "g_themed_icon_get_names",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_themed_icon_prepend_name = Interop.downcallHandle(
            "g_themed_icon_prepend_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
