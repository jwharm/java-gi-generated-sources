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
public class IconTheme extends org.gtk.gobject.GObject {
    
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
     */
    protected IconTheme(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, IconTheme> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new IconTheme(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.takeOwnership();
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
    public void addResourcePath(java.lang.String path) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_icon_theme_add_resource_path.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(path, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Appends a directory to the search path.
     * <p>
     * See {@link IconTheme#setSearchPath}.
     * @param path directory name to append to the icon path
     */
    public void addSearchPath(java.lang.String path) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_icon_theme_add_search_path.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(path, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_theme_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Display) Interop.register(RESULT, org.gtk.gdk.Display.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Lists the names of icons in the current icon theme.
     * @return a string array
     *   holding the names of all the icons in the theme. You must
     *   free the array using g_strfreev().
     */
    public PointerString getIconNames() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_icon_theme_get_icon_names.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
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
    public PointerInteger getIconSizes(java.lang.String iconName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_icon_theme_get_icon_sizes.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(iconName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerInteger(RESULT);
        }
    }
    
    /**
     * Gets the current resource path.
     * <p>
     * See {@link IconTheme#setResourcePath}.
     * @return A list of resource paths
     */
    public @Nullable PointerString getResourcePath() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_icon_theme_get_resource_path.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Gets the current search path.
     * <p>
     * See {@link IconTheme#setSearchPath}.
     * @return a list of icon theme path directories
     */
    public @Nullable PointerString getSearchPath() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_icon_theme_get_search_path.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Gets the current icon theme name.
     * <p>
     * Returns (transfer full): the current icon theme name,
     */
    public java.lang.String getThemeName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_theme_get_theme_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Checks whether an icon theme includes an icon
     * for a particular {@code GIcon}.
     * @param gicon a {@code GIcon}
     * @return {@code true} if {@code self} includes an icon for {@code gicon}
     */
    public boolean hasGicon(org.gtk.gio.Icon gicon) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_theme_has_gicon.invokeExact(
                    handle(),
                    gicon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks whether an icon theme includes an icon
     * for a particular name.
     * @param iconName the name of an icon
     * @return {@code true} if {@code self} includes an
     *  icon for {@code icon_name}.
     */
    public boolean hasIcon(java.lang.String iconName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_icon_theme_has_icon.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(iconName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public org.gtk.gtk.IconPaintable lookupByGicon(org.gtk.gio.Icon icon, int size, int scale, org.gtk.gtk.TextDirection direction, org.gtk.gtk.IconLookupFlags flags) {
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
        var OBJECT = (org.gtk.gtk.IconPaintable) Interop.register(RESULT, org.gtk.gtk.IconPaintable.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    public org.gtk.gtk.IconPaintable lookupIcon(java.lang.String iconName, @Nullable java.lang.String[] fallbacks, int size, int scale, org.gtk.gtk.TextDirection direction, org.gtk.gtk.IconLookupFlags flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_icon_theme_lookup_icon.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(iconName, SCOPE),
                        (Addressable) (fallbacks == null ? MemoryAddress.NULL : Interop.allocateNativeArray(fallbacks, false, SCOPE)),
                        size,
                        scale,
                        direction.getValue(),
                        flags.getValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = (org.gtk.gtk.IconPaintable) Interop.register(RESULT, org.gtk.gtk.IconPaintable.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_icon_theme_set_resource_path.invokeExact(
                        handle(),
                        (Addressable) (path == null ? MemoryAddress.NULL : Interop.allocateNativeArray(path, false, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_icon_theme_set_search_path.invokeExact(
                        handle(),
                        (Addressable) (path == null ? MemoryAddress.NULL : Interop.allocateNativeArray(path, false, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_icon_theme_set_theme_name.invokeExact(
                        handle(),
                        (Addressable) (themeName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(themeName, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_icon_theme_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
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
    public static org.gtk.gtk.IconTheme getForDisplay(org.gtk.gdk.Display display) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_theme_get_for_display.invokeExact(display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.IconTheme) Interop.register(RESULT, org.gtk.gtk.IconTheme.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Functional interface declaration of the {@code Changed} callback.
     */
    @FunctionalInterface
    public interface Changed {
    
        /**
         * Emitted when the icon theme changes.
         * <p>
         * This can happen becuase current icon theme is switched or
         * because GTK detects that a change has occurred in the
         * contents of the current icon theme.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceIconTheme) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Changed.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link IconTheme.Builder} object constructs a {@link IconTheme} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link IconTheme.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link IconTheme} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link IconTheme}.
         * @return A new instance of {@code IconTheme} with the properties 
         *         that were set in the Builder object.
         */
        public IconTheme build() {
            return (IconTheme) org.gtk.gobject.GObject.newWithProperties(
                IconTheme.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The display that this icon theme object is attached to.
         * @param display The value for the {@code display} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDisplay(org.gtk.gdk.Display display) {
            names.add("display");
            values.add(org.gtk.gobject.Value.create(display));
            return this;
        }
        
        /**
         * The name of the icon theme that is being used.
         * <p>
         * Unless set to a different value, this will be the value of
         * the {@code GtkSettings:gtk-icon-theme-name} property of the {@code GtkSettings}
         * object associated to the display of the icontheme object.
         * @param themeName The value for the {@code theme-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setThemeName(java.lang.String themeName) {
            names.add("theme-name");
            values.add(org.gtk.gobject.Value.create(themeName));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_icon_theme_new = Interop.downcallHandle(
                "gtk_icon_theme_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_icon_theme_add_resource_path = Interop.downcallHandle(
                "gtk_icon_theme_add_resource_path",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_icon_theme_add_search_path = Interop.downcallHandle(
                "gtk_icon_theme_add_search_path",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_icon_theme_get_display = Interop.downcallHandle(
                "gtk_icon_theme_get_display",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_icon_theme_get_icon_names = Interop.downcallHandle(
                "gtk_icon_theme_get_icon_names",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_icon_theme_get_icon_sizes = Interop.downcallHandle(
                "gtk_icon_theme_get_icon_sizes",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_icon_theme_get_resource_path = Interop.downcallHandle(
                "gtk_icon_theme_get_resource_path",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_icon_theme_get_search_path = Interop.downcallHandle(
                "gtk_icon_theme_get_search_path",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_icon_theme_get_theme_name = Interop.downcallHandle(
                "gtk_icon_theme_get_theme_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_icon_theme_has_gicon = Interop.downcallHandle(
                "gtk_icon_theme_has_gicon",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_icon_theme_has_icon = Interop.downcallHandle(
                "gtk_icon_theme_has_icon",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_icon_theme_lookup_by_gicon = Interop.downcallHandle(
                "gtk_icon_theme_lookup_by_gicon",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_icon_theme_lookup_icon = Interop.downcallHandle(
                "gtk_icon_theme_lookup_icon",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_icon_theme_set_resource_path = Interop.downcallHandle(
                "gtk_icon_theme_set_resource_path",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_icon_theme_set_search_path = Interop.downcallHandle(
                "gtk_icon_theme_set_search_path",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_icon_theme_set_theme_name = Interop.downcallHandle(
                "gtk_icon_theme_set_theme_name",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_icon_theme_get_type = Interop.downcallHandle(
                "gtk_icon_theme_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gtk_icon_theme_get_for_display = Interop.downcallHandle(
                "gtk_icon_theme_get_for_display",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_icon_theme_get_type != null;
    }
}
