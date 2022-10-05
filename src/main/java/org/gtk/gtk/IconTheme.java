package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <p>
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

    public IconTheme(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to IconTheme */
    public static IconTheme castFrom(org.gtk.gobject.Object gobject) {
        return new IconTheme(gobject.refcounted());
    }
    
    static final MethodHandle gtk_icon_theme_new = Interop.downcallHandle(
        "gtk_icon_theme_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_icon_theme_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new icon theme object.
     * <p>
     * Icon theme objects are used to lookup up an icon by name
     * in a particular icon theme. Usually, you’ll want to use
     * {@link Gtk#IconTheme} rather than creating
     * a new icon theme object for scratch.
     */
    public IconTheme() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_icon_theme_add_resource_path = Interop.downcallHandle(
        "gtk_icon_theme_add_resource_path",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a resource path that will be looked at when looking
     * for icons, similar to search paths.
     * <p>
     * See {@link IconTheme#setResourcePath}.
     * <p>
     * This function should be used to make application-specific icons
     * available as part of the icon theme.
     */
    public void addResourcePath(java.lang.String path) {
        try {
            gtk_icon_theme_add_resource_path.invokeExact(handle(), Interop.allocateNativeString(path).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_theme_add_search_path = Interop.downcallHandle(
        "gtk_icon_theme_add_search_path",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Appends a directory to the search path.
     * <p>
     * See {@link IconTheme#setSearchPath}.
     */
    public void addSearchPath(java.lang.String path) {
        try {
            gtk_icon_theme_add_search_path.invokeExact(handle(), Interop.allocateNativeString(path).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_theme_get_display = Interop.downcallHandle(
        "gtk_icon_theme_get_display",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the display that the {@code GtkIconTheme} object was
     * created for.
     */
    public org.gtk.gdk.Display getDisplay() {
        try {
            var RESULT = (MemoryAddress) gtk_icon_theme_get_display.invokeExact(handle());
            return new org.gtk.gdk.Display(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_theme_get_icon_names = Interop.downcallHandle(
        "gtk_icon_theme_get_icon_names",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Lists the names of icons in the current icon theme.
     */
    public PointerIterator<java.lang.String> getIconNames() {
        try {
            var RESULT = (MemoryAddress) gtk_icon_theme_get_icon_names.invokeExact(handle());
            return new PointerString(RESULT).iterator();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_theme_get_icon_sizes = Interop.downcallHandle(
        "gtk_icon_theme_get_icon_sizes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns an array of integers describing the sizes at which
     * the icon is available without scaling.
     * <p>
     * A size of -1 means that the icon is available in a scalable
     * format. The array is zero-terminated.
     */
    public PointerIterator<Integer> getIconSizes(java.lang.String iconName) {
        try {
            var RESULT = (MemoryAddress) gtk_icon_theme_get_icon_sizes.invokeExact(handle(), Interop.allocateNativeString(iconName).handle());
            return new PointerInteger(RESULT).iterator();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_theme_get_resource_path = Interop.downcallHandle(
        "gtk_icon_theme_get_resource_path",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current resource path.
     * <p>
     * See {@link IconTheme#setResourcePath}.
     */
    public PointerIterator<java.lang.String> getResourcePath() {
        try {
            var RESULT = (MemoryAddress) gtk_icon_theme_get_resource_path.invokeExact(handle());
            return new PointerString(RESULT).iterator();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_theme_get_search_path = Interop.downcallHandle(
        "gtk_icon_theme_get_search_path",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current search path.
     * <p>
     * See {@link IconTheme#setSearchPath}.
     */
    public PointerIterator<java.lang.String> getSearchPath() {
        try {
            var RESULT = (MemoryAddress) gtk_icon_theme_get_search_path.invokeExact(handle());
            return new PointerString(RESULT).iterator();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_theme_get_theme_name = Interop.downcallHandle(
        "gtk_icon_theme_get_theme_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current icon theme name.
     * <p>
     * Returns (transfer full): the current icon theme name,
     */
    public java.lang.String getThemeName() {
        try {
            var RESULT = (MemoryAddress) gtk_icon_theme_get_theme_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_theme_has_gicon = Interop.downcallHandle(
        "gtk_icon_theme_has_gicon",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether an icon theme includes an icon
     * for a particular {@code GIcon}.
     */
    public boolean hasGicon(org.gtk.gio.Icon gicon) {
        try {
            var RESULT = (int) gtk_icon_theme_has_gicon.invokeExact(handle(), gicon.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_theme_has_icon = Interop.downcallHandle(
        "gtk_icon_theme_has_icon",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether an icon theme includes an icon
     * for a particular name.
     */
    public boolean hasIcon(java.lang.String iconName) {
        try {
            var RESULT = (int) gtk_icon_theme_has_icon.invokeExact(handle(), Interop.allocateNativeString(iconName).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_theme_lookup_by_gicon = Interop.downcallHandle(
        "gtk_icon_theme_lookup_by_gicon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Looks up a icon for a desired size and window scale.
     * <p>
     * The icon can then be rendered by using it as a {@code GdkPaintable},
     * or you can get information such as the filename and size.
     */
    public IconPaintable lookupByGicon(org.gtk.gio.Icon icon, int size, int scale, TextDirection direction, IconLookupFlags flags) {
        try {
            var RESULT = (MemoryAddress) gtk_icon_theme_lookup_by_gicon.invokeExact(handle(), icon.handle(), size, scale, direction.getValue(), flags.getValue());
            return new IconPaintable(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_theme_lookup_icon = Interop.downcallHandle(
        "gtk_icon_theme_lookup_icon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
     */
    public IconPaintable lookupIcon(java.lang.String iconName, java.lang.String[] fallbacks, int size, int scale, TextDirection direction, IconLookupFlags flags) {
        try {
            var RESULT = (MemoryAddress) gtk_icon_theme_lookup_icon.invokeExact(handle(), Interop.allocateNativeString(iconName).handle(), Interop.allocateNativeArray(fallbacks).handle(), size, scale, direction.getValue(), flags.getValue());
            return new IconPaintable(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_theme_set_resource_path = Interop.downcallHandle(
        "gtk_icon_theme_set_resource_path",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void setResourcePath(java.lang.String[] path) {
        try {
            gtk_icon_theme_set_resource_path.invokeExact(handle(), Interop.allocateNativeArray(path).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_theme_set_search_path = Interop.downcallHandle(
        "gtk_icon_theme_set_search_path",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void setSearchPath(java.lang.String[] path) {
        try {
            gtk_icon_theme_set_search_path.invokeExact(handle(), Interop.allocateNativeArray(path).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_theme_set_theme_name = Interop.downcallHandle(
        "gtk_icon_theme_set_theme_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the name of the icon theme that the {@code GtkIconTheme} object uses
     * overriding system configuration.
     * <p>
     * This function cannot be called on the icon theme objects returned
     * from {@link Gtk#IconTheme}.
     */
    public void setThemeName(java.lang.String themeName) {
        try {
            gtk_icon_theme_set_theme_name.invokeExact(handle(), Interop.allocateNativeString(themeName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_theme_get_for_display = Interop.downcallHandle(
        "gtk_icon_theme_get_for_display",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the icon theme object associated with {@code display}.
     * <p>
     * If this function has not previously been called for the given
     * display, a new icon theme object will be created and associated
     * with the display. Icon theme objects are fairly expensive to create,
     * so using this function is usually a better choice than calling
     * {@link IconTheme#IconTheme} and setting the display yourself; by using
     * this function a single icon theme object will be shared between users.
     */
    public static IconTheme getForDisplay(org.gtk.gdk.Display display) {
        try {
            var RESULT = (MemoryAddress) gtk_icon_theme_get_for_display.invokeExact(display.handle());
            return new IconTheme(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(IconTheme source);
    }
    
    /**
     * Emitted when the icon theme changes.
     * <p>
     * This can happen becuase current icon theme is switched or
     * because GTK detects that a change has occurred in the
     * contents of the current icon theme.
     */
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconTheme.Callbacks.class, "signalIconThemeChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalIconThemeChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (IconTheme.ChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new IconTheme(Refcounted.get(source)));
        }
        
    }
}