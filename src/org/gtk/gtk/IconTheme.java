package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkIconTheme` provides a facility for loading themed icons.
 * 
 * The main reason for using a name rather than simply providing a filename
 * is to allow different icons to be used depending on what “icon theme” is
 * selected by the user. The operation of icon themes on Linux and Unix
 * follows the [Icon Theme Specification](http://www.freedesktop.org/Standards/icon-theme-spec)
 * There is a fallback icon theme, named `hicolor`, where applications
 * should install their icons, but additional icon themes can be installed
 * as operating system vendors and users choose.
 * 
 * In many cases, named themes are used indirectly, via [class@Gtk.Image]
 * rather than directly, but looking up icons directly is also simple. The
 * `GtkIconTheme` object acts as a database of all the icons in the current
 * theme. You can create new `GtkIconTheme` objects, but it’s much more
 * efficient to use the standard icon theme of the `GtkWidget` so that the
 * icon information is shared with other people looking up icons.
 * 
 * ```c
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
 * ```
 */
public class IconTheme extends org.gtk.gobject.Object {

    public IconTheme(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to IconTheme */
    public static IconTheme castFrom(org.gtk.gobject.Object gobject) {
        return new IconTheme(gobject.getReference());
    }
    
    /**
     * Creates a new icon theme object.
     * 
     * Icon theme objects are used to lookup up an icon by name
     * in a particular icon theme. Usually, you’ll want to use
     * [func@Gtk.IconTheme.get_for_display] rather than creating
     * a new icon theme object for scratch.
     */
    public IconTheme() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_theme_new(), true));
    }
    
    /**
     * Adds a resource path that will be looked at when looking
     * for icons, similar to search paths.
     * 
     * See [method@Gtk.IconTheme.set_resource_path].
     * 
     * This function should be used to make application-specific icons
     * available as part of the icon theme.
     */
    public void addResourcePath(java.lang.String path) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_theme_add_resource_path(HANDLE(), Interop.allocateNativeString(path).HANDLE());
    }
    
    /**
     * Appends a directory to the search path.
     * 
     * See [method@Gtk.IconTheme.set_search_path].
     */
    public void addSearchPath(java.lang.String path) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_theme_add_search_path(HANDLE(), Interop.allocateNativeString(path).HANDLE());
    }
    
    /**
     * Returns the display that the `GtkIconTheme` object was
     * created for.
     */
    public org.gtk.gdk.Display getDisplay() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_theme_get_display(HANDLE());
        return new org.gtk.gdk.Display(References.get(RESULT, false));
    }
    
    /**
     * Gets the current icon theme name.
     * 
     * Returns (transfer full): the current icon theme name,
     */
    public java.lang.String getThemeName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_theme_get_theme_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Checks whether an icon theme includes an icon
     * for a particular `GIcon`.
     */
    public boolean hasGicon(org.gtk.gio.Icon gicon) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_theme_has_gicon(HANDLE(), gicon.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks whether an icon theme includes an icon
     * for a particular name.
     */
    public boolean hasIcon(java.lang.String iconName) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_theme_has_icon(HANDLE(), Interop.allocateNativeString(iconName).HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Looks up a icon for a desired size and window scale.
     * 
     * The icon can then be rendered by using it as a `GdkPaintable`,
     * or you can get information such as the filename and size.
     */
    public IconPaintable lookupByGicon(org.gtk.gio.Icon icon, int size, int scale, TextDirection direction, int flags) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_theme_lookup_by_gicon(HANDLE(), icon.HANDLE(), size, scale, direction.getValue(), flags);
        return new IconPaintable(References.get(RESULT, true));
    }
    
    /**
     * Looks up a named icon for a desired size and window scale,
     * returning a `GtkIconPaintable`.
     * 
     * The icon can then be rendered by using it as a `GdkPaintable`,
     * or you can get information such as the filename and size.
     * 
     * If the available @icon_name is not available and @fallbacks are
     * provided, they will be tried in order.
     * 
     * If no matching icon is found, then a paintable that renders the
     * "missing icon" icon is returned. If you need to do something else
     * for missing icons you need to use [method@Gtk.IconTheme.has_icon].
     * 
     * Note that you probably want to listen for icon theme changes and
     * update the icon. This is usually done by overriding the
     * GtkWidgetClass.css-changed() function.
     */
    public IconPaintable lookupIcon(java.lang.String iconName, java.lang.String[] fallbacks, int size, int scale, TextDirection direction, int flags) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_theme_lookup_icon(HANDLE(), Interop.allocateNativeString(iconName).HANDLE(), Interop.allocateNativeArray(fallbacks), size, scale, direction.getValue(), flags);
        return new IconPaintable(References.get(RESULT, true));
    }
    
    /**
     * Sets the resource paths that will be looked at when
     * looking for icons, similar to search paths.
     * 
     * The resources are considered as part of the hicolor icon theme
     * and must be located in subdirectories that are defined in the
     * hicolor icon theme, such as `@path/16x16/actions/run.png`
     * or `@path/scalable/actions/run.svg`.
     * 
     * Icons that are directly placed in the resource path instead
     * of a subdirectory are also considered as ultimate fallback,
     * but they are treated like unthemed icons.
     */
    public void setResourcePath(java.lang.String[] path) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_theme_set_resource_path(HANDLE(), Interop.allocateNativeArray(path));
    }
    
    /**
     * Sets the search path for the icon theme object.
     * 
     * When looking for an icon theme, GTK will search for a subdirectory
     * of one or more of the directories in @path with the same name
     * as the icon theme containing an index.theme file. (Themes from
     * multiple of the path elements are combined to allow themes to be
     * extended by adding icons in the user’s home directory.)
     * 
     * In addition if an icon found isn’t found either in the current
     * icon theme or the default icon theme, and an image file with
     * the right name is found directly in one of the elements of
     * @path, then that image will be used for the icon name.
     * (This is legacy feature, and new icons should be put
     * into the fallback icon theme, which is called hicolor,
     * rather than directly on the icon path.)
     */
    public void setSearchPath(java.lang.String[] path) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_theme_set_search_path(HANDLE(), Interop.allocateNativeArray(path));
    }
    
    /**
     * Sets the name of the icon theme that the `GtkIconTheme` object uses
     * overriding system configuration.
     * 
     * This function cannot be called on the icon theme objects returned
     * from [func@Gtk.IconTheme.get_for_display].
     */
    public void setThemeName(java.lang.String themeName) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_theme_set_theme_name(HANDLE(), Interop.allocateNativeString(themeName).HANDLE());
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(IconTheme source);
    }
    
    /**
     * Emitted when the icon theme changes.
     * 
     * This can happen becuase current icon theme is switched or
     * because GTK detects that a change has occurred in the
     * contents of the current icon theme.
     */
    public void onChanged(ChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalIconThemeChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("changed").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
