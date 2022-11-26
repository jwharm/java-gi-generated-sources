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
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ThemedIcon} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GThemedIcon", a ClassCastException will be thrown.
     */
    public static ThemedIcon castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ThemedIcon.getType())) {
            return new ThemedIcon(gobject.handle(), gobject.yieldOwnership());
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_themed_icon_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link ThemedIcon.Build} object constructs a {@link ThemedIcon} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ThemedIcon} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ThemedIcon} using {@link ThemedIcon#castFrom}.
         * @return A new instance of {@code ThemedIcon} with the properties 
         *         that were set in the Build object.
         */
        public ThemedIcon construct() {
            return ThemedIcon.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ThemedIcon.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The icon name.
         * @param name The value for the {@code name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setName(java.lang.String name) {
            names.add("name");
            values.add(org.gtk.gobject.Value.create(name));
            return this;
        }
        
        /**
         * Whether to use the default fallbacks found by shortening the icon name
         * at '-' characters. If the "names" array has more than one element,
         * ignores any past the first.
         * <p>
         * For example, if the icon name was "gnome-dev-cdrom-audio", the array
         * would become
         * <pre>{@code <!-- language="C" -->
         * {
         *   "gnome-dev-cdrom-audio",
         *   "gnome-dev-cdrom",
         *   "gnome-dev",
         *   "gnome",
         *   NULL
         * };
         * }</pre>
         * @param useDefaultFallbacks The value for the {@code use-default-fallbacks} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUseDefaultFallbacks(boolean useDefaultFallbacks) {
            names.add("use-default-fallbacks");
            values.add(org.gtk.gobject.Value.create(useDefaultFallbacks));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_themed_icon_new = Interop.downcallHandle(
            "g_themed_icon_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_themed_icon_new_from_names = Interop.downcallHandle(
            "g_themed_icon_new_from_names",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_themed_icon_new_with_default_fallbacks = Interop.downcallHandle(
            "g_themed_icon_new_with_default_fallbacks",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_themed_icon_append_name = Interop.downcallHandle(
            "g_themed_icon_append_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_themed_icon_get_names = Interop.downcallHandle(
            "g_themed_icon_get_names",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_themed_icon_prepend_name = Interop.downcallHandle(
            "g_themed_icon_prepend_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_themed_icon_get_type = Interop.downcallHandle(
            "g_themed_icon_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
