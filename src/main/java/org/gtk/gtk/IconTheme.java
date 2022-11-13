package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkIconTheme} provides a facility for loading themed icons.
 * <p>
 * The main reason for using a name rather than simply providing a filename
 * is to allow different icons to be used depending on what “icon theme” is
 * selected by the user. The operation of icon themes on Linux and Unix
 * follows the <a href="http://www.freedesktop.org/Standards/icon-theme-spec">Icon Theme Specification</a>
 * There is a fallback icon theme, named {@code hicolor}, where applications
 * should install their icons, but additional icon themes can be installed
 * as operating system vendors and users choose.
 * <p>
 * In many cases, named themes are used indirectly, via {@link Image}
 * rather than directly, but looking up icons directly is also simple. The
 * {@code GtkIconTheme} object acts as a database of all the icons in the current
 * theme. You can create new {@code GtkIconTheme} objects, but it’s much more
 * efficient to use the standard icon theme of the {@code GtkWidget} so that the
 * icon information is shared with other people looking up icons.
 * <pre>{@code c
 * GtkIconTheme *icon_theme;
 * GtkIconPaintable *icon;
 * GdkPaintable *paintable;
 * 
 * icon_theme = gtk_icon_theme_get_for_display (gtk_widget_get_display (my_widget));
 * icon = gtk_icon_theme_lookup_icon (icon_theme,
 *                                    "my-icon-name", // icon name
 *                                    48, // icon size
 *                                    1,  // scale
 *                                    0,  // flags);
 * paintable = GDK_PAINTABLE (icon);
 * // Use the paintable
 * g_object_unref (icon);
 * }</pre>
 */
public class IconTheme extends org.gtk.gobject.Object {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkIconTheme";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a IconTheme proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public IconTheme(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to IconTheme if its GType is a (or inherits from) "GtkIconTheme".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code IconTheme} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkIconTheme", a ClassCastException will be thrown.
     */
    public static IconTheme castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkIconTheme"))) {
            return new IconTheme(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkIconTheme");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_theme_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new icon theme object.
     * <p>
     * Icon theme objects are used to lookup up an icon by name
     * in a particular icon theme. Usually, you’ll want to use
     * {@link IconTheme#getForDisplay} rather than creating
     * a new icon theme object for scratch.
     */
    public IconTheme() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Adds a resource path that will be looked at when looking
     * for icons, similar to search paths.
     * <p>
     * See {@link IconTheme#setResourcePath}.
     * <p>
     * This function should be used to make application-specific icons
     * available as part of the icon theme.
     * @param path a resource path
     */
    public void addResourcePath(@NotNull java.lang.String path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        try {
            DowncallHandles.gtk_icon_theme_add_resource_path.invokeExact(
                    handle(),
                    Interop.allocateNativeString(path));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Appends a directory to the search path.
     * <p>
     * See {@link IconTheme#setSearchPath}.
     * @param path directory name to append to the icon path
     */
    public void addSearchPath(@NotNull java.lang.String path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        try {
            DowncallHandles.gtk_icon_theme_add_search_path.invokeExact(
                    handle(),
                    Interop.allocateNativeString(path));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the display that the {@code GtkIconTheme} object was
     * created for.
     * @return the display of {@code icon_theme}
     */
    public @Nullable org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_theme_get_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Display(RESULT, Ownership.NONE);
    }
    
    /**
     * Lists the names of icons in the current icon theme.
     * @return a string array
     *   holding the names of all the icons in the theme. You must
     *   free the array using g_strfreev().
     */
    public @NotNull PointerString getIconNames() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_theme_get_icon_names.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Returns an array of integers describing the sizes at which
     * the icon is available without scaling.
     * <p>
     * A size of -1 means that the icon is available in a scalable
     * format. The array is zero-terminated.
     * @param iconName the name of an icon
     * @return A newly
     *   allocated array describing the sizes at which the icon is
     *   available. The array should be freed with g_free() when it is no
     *   longer needed.
     */
    public @NotNull PointerInteger getIconSizes(@NotNull java.lang.String iconName) {
        java.util.Objects.requireNonNull(iconName, "Parameter 'iconName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_theme_get_icon_sizes.invokeExact(
                    handle(),
                    Interop.allocateNativeString(iconName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerInteger(RESULT);
    }
    
    /**
     * Gets the current resource path.
     * <p>
     * See {@link IconTheme#setResourcePath}.
     * @return A list of resource paths
     */
    public @Nullable PointerString getResourcePath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_theme_get_resource_path.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Gets the current search path.
     * <p>
     * See {@link IconTheme#setSearchPath}.
     * @return a list of icon theme path directories
     */
    public @Nullable PointerString getSearchPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_theme_get_search_path.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Gets the current icon theme name.
     * <p>
     * Returns (transfer full): the current icon theme name,
     */
    public @NotNull java.lang.String getThemeName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_theme_get_theme_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Checks whether an icon theme includes an icon
     * for a particular {@code GIcon}.
     * @param gicon a {@code GIcon}
     * @return {@code true} if {@code self} includes an icon for {@code gicon}
     */
    public boolean hasGicon(@NotNull org.gtk.gio.Icon gicon) {
        java.util.Objects.requireNonNull(gicon, "Parameter 'gicon' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_theme_has_gicon.invokeExact(
                    handle(),
                    gicon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks whether an icon theme includes an icon
     * for a particular name.
     * @param iconName the name of an icon
     * @return {@code true} if {@code self} includes an
     *  icon for {@code icon_name}.
     */
    public boolean hasIcon(@NotNull java.lang.String iconName) {
        java.util.Objects.requireNonNull(iconName, "Parameter 'iconName' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_theme_has_icon.invokeExact(
                    handle(),
                    Interop.allocateNativeString(iconName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Looks up a icon for a desired size and window scale.
     * <p>
     * The icon can then be rendered by using it as a {@code GdkPaintable},
     * or you can get information such as the filename and size.
     * @param icon the {@code GIcon} to look up
     * @param size desired icon size
     * @param scale the desired scale
     * @param direction text direction the icon will be displayed in
     * @param flags flags modifying the behavior of the icon lookup
     * @return a {@code GtkIconPaintable} containing
     *   information about the icon. Unref with g_object_unref()
     */
    public @NotNull org.gtk.gtk.IconPaintable lookupByGicon(@NotNull org.gtk.gio.Icon icon, int size, int scale, @NotNull org.gtk.gtk.TextDirection direction, @NotNull org.gtk.gtk.IconLookupFlags flags) {
        java.util.Objects.requireNonNull(icon, "Parameter 'icon' must not be null");
        java.util.Objects.requireNonNull(direction, "Parameter 'direction' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_theme_lookup_by_gicon.invokeExact(
                    handle(),
                    icon.handle(),
                    size,
                    scale,
                    direction.getValue(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.IconPaintable(RESULT, Ownership.FULL);
    }
    
    /**
     * Looks up a named icon for a desired size and window scale,
     * returning a {@code GtkIconPaintable}.
     * <p>
     * The icon can then be rendered by using it as a {@code GdkPaintable},
     * or you can get information such as the filename and size.
     * <p>
     * If the available {@code icon_name} is not available and {@code fallbacks} are
     * provided, they will be tried in order.
     * <p>
     * If no matching icon is found, then a paintable that renders the
     * "missing icon" icon is returned. If you need to do something else
     * for missing icons you need to use {@link IconTheme#hasIcon}.
     * <p>
     * Note that you probably want to listen for icon theme changes and
     * update the icon. This is usually done by overriding the
     * GtkWidgetClass.css-changed() function.
     * @param iconName the name of the icon to lookup
     * @param size desired icon size.
     * @param scale the window scale this will be displayed on
     * @param direction text direction the icon will be displayed in
     * @param flags flags modifying the behavior of the icon lookup
     * @return a {@code GtkIconPaintable} object
     *   containing the icon.
     */
    public @NotNull org.gtk.gtk.IconPaintable lookupIcon(@NotNull java.lang.String iconName, @Nullable java.lang.String[] fallbacks, int size, int scale, @NotNull org.gtk.gtk.TextDirection direction, @NotNull org.gtk.gtk.IconLookupFlags flags) {
        java.util.Objects.requireNonNull(iconName, "Parameter 'iconName' must not be null");
        java.util.Objects.requireNonNull(direction, "Parameter 'direction' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_theme_lookup_icon.invokeExact(
                    handle(),
                    Interop.allocateNativeString(iconName),
                    (Addressable) (fallbacks == null ? MemoryAddress.NULL : Interop.allocateNativeArray(fallbacks, false)),
                    size,
                    scale,
                    direction.getValue(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.IconPaintable(RESULT, Ownership.FULL);
    }
    
    /**
     * Sets the resource paths that will be looked at when
     * looking for icons, similar to search paths.
     * <p>
     * The resources are considered as part of the hicolor icon theme
     * and must be located in subdirectories that are defined in the
     * hicolor icon theme, such as {@code @path/16x16/actions/run.png}
     * or {@code @path/scalable/actions/run.svg}.
     * <p>
     * Icons that are directly placed in the resource path instead
     * of a subdirectory are also considered as ultimate fallback,
     * but they are treated like unthemed icons.
     * @param path NULL-terminated array of resource paths
     *   that are searched for icons
     */
    public void setResourcePath(@Nullable java.lang.String[] path) {
        try {
            DowncallHandles.gtk_icon_theme_set_resource_path.invokeExact(
                    handle(),
                    (Addressable) (path == null ? MemoryAddress.NULL : Interop.allocateNativeArray(path, false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the search path for the icon theme object.
     * <p>
     * When looking for an icon theme, GTK will search for a subdirectory
     * of one or more of the directories in {@code path} with the same name
     * as the icon theme containing an index.theme file. (Themes from
     * multiple of the path elements are combined to allow themes to be
     * extended by adding icons in the user’s home directory.)
     * <p>
     * In addition if an icon found isn’t found either in the current
     * icon theme or the default icon theme, and an image file with
     * the right name is found directly in one of the elements of
     * {@code path}, then that image will be used for the icon name.
     * (This is legacy feature, and new icons should be put
     * into the fallback icon theme, which is called hicolor,
     * rather than directly on the icon path.)
     * @param path NULL-terminated
     *   array of directories that are searched for icon themes
     */
    public void setSearchPath(@Nullable java.lang.String[] path) {
        try {
            DowncallHandles.gtk_icon_theme_set_search_path.invokeExact(
                    handle(),
                    (Addressable) (path == null ? MemoryAddress.NULL : Interop.allocateNativeArray(path, false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the name of the icon theme that the {@code GtkIconTheme} object uses
     * overriding system configuration.
     * <p>
     * This function cannot be called on the icon theme objects returned
     * from {@link IconTheme#getForDisplay}.
     * @param themeName name of icon theme to use instead of
     *   configured theme, or {@code null} to unset a previously set custom theme
     */
    public void setThemeName(@Nullable java.lang.String themeName) {
        try {
            DowncallHandles.gtk_icon_theme_set_theme_name.invokeExact(
                    handle(),
                    (Addressable) (themeName == null ? MemoryAddress.NULL : Interop.allocateNativeString(themeName)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the icon theme object associated with {@code display}.
     * <p>
     * If this function has not previously been called for the given
     * display, a new icon theme object will be created and associated
     * with the display. Icon theme objects are fairly expensive to create,
     * so using this function is usually a better choice than calling
     * {@link IconTheme#IconTheme} and setting the display yourself; by using
     * this function a single icon theme object will be shared between users.
     * @param display a {@code GdkDisplay}
     * @return A unique {@code GtkIconTheme} associated with
     *   the given display. This icon theme is associated with the display
     *   and can be used as long as the display is open. Do not ref or unref it.
     */
    public static @NotNull org.gtk.gtk.IconTheme getForDisplay(@NotNull org.gtk.gdk.Display display) {
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_theme_get_for_display.invokeExact(
                    display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.IconTheme(RESULT, Ownership.NONE);
    }
    
    @FunctionalInterface
    public interface Changed {
        void signalReceived(IconTheme source);
    }
    
    /**
     * Emitted when the icon theme changes.
     * <p>
     * This can happen becuase current icon theme is switched or
     * because GTK detects that a change has occurred in the
     * contents of the current icon theme.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<IconTheme.Changed> onChanged(IconTheme.Changed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconTheme.Callbacks.class, "signalIconThemeChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<IconTheme.Changed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_icon_theme_new = Interop.downcallHandle(
            "gtk_icon_theme_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_theme_add_resource_path = Interop.downcallHandle(
            "gtk_icon_theme_add_resource_path",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_theme_add_search_path = Interop.downcallHandle(
            "gtk_icon_theme_add_search_path",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_theme_get_display = Interop.downcallHandle(
            "gtk_icon_theme_get_display",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_theme_get_icon_names = Interop.downcallHandle(
            "gtk_icon_theme_get_icon_names",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_theme_get_icon_sizes = Interop.downcallHandle(
            "gtk_icon_theme_get_icon_sizes",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_theme_get_resource_path = Interop.downcallHandle(
            "gtk_icon_theme_get_resource_path",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_theme_get_search_path = Interop.downcallHandle(
            "gtk_icon_theme_get_search_path",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_theme_get_theme_name = Interop.downcallHandle(
            "gtk_icon_theme_get_theme_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_theme_has_gicon = Interop.downcallHandle(
            "gtk_icon_theme_has_gicon",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_theme_has_icon = Interop.downcallHandle(
            "gtk_icon_theme_has_icon",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_theme_lookup_by_gicon = Interop.downcallHandle(
            "gtk_icon_theme_lookup_by_gicon",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_theme_lookup_icon = Interop.downcallHandle(
            "gtk_icon_theme_lookup_icon",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_theme_set_resource_path = Interop.downcallHandle(
            "gtk_icon_theme_set_resource_path",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_theme_set_search_path = Interop.downcallHandle(
            "gtk_icon_theme_set_search_path",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_theme_set_theme_name = Interop.downcallHandle(
            "gtk_icon_theme_set_theme_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_theme_get_for_display = Interop.downcallHandle(
            "gtk_icon_theme_get_for_display",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalIconThemeChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (IconTheme.Changed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new IconTheme(source, Ownership.UNKNOWN));
        }
    }
}
