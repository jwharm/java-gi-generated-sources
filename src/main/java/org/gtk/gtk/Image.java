package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkImage} widget displays an image.
 * <p>
 * <img src="./doc-files/image.png" alt="An example GtkImage">
 * <p>
 * Various kinds of object can be displayed as an image; most typically,
 * you would load a {@code GdkTexture} from a file, using the convenience function
 * {@link Image#newFromFile}, for instance:
 * <pre>{@code c
 * GtkWidget *image = gtk_image_new_from_file ("myfile.png");
 * }</pre>
 * <p>
 * If the file isn’t loaded successfully, the image will contain a
 * “broken image” icon similar to that used in many web browsers.
 * <p>
 * If you want to handle errors in loading the file yourself,
 * for example by displaying an error message, then load the image with
 * {@link org.gtk.gdk.Texture#newFromFile}, then create the {@code GtkImage} with
 * {@link Image#newFromPaintable}.
 * <p>
 * Sometimes an application will want to avoid depending on external data
 * files, such as image files. See the documentation of {@code GResource} inside
 * GIO, for details. In this case, {@code Gtk.Image:resource},
 * {@link Image#newFromResource}, and {@link Image#setFromResource}
 * should be used.
 * <p>
 * {@code GtkImage} displays its image as an icon, with a size that is determined
 * by the application. See {@link Picture} if you want to show an image
 * at is actual size.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkImage} has a single CSS node with the name {@code image}. The style classes
 * {@code .normal-icons} or {@code .large-icons} may appear, depending on the
 * {@code Gtk.Image:icon-size} property.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkImage} uses the {@code GTK_ACCESSIBLE_ROLE_IMG} role.
 */
public class Image extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public Image(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Image */
    public static Image castFrom(org.gtk.gobject.Object gobject) {
        return new Image(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_image_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new empty {@code GtkImage} widget.
     */
    public Image() {
        super(constructNew());
    }
    
    private static Refcounted constructNewFromFile(@NotNull java.lang.String filename) {
        java.util.Objects.requireNonNull(filename, "Parameter 'filename' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_image_new_from_file.invokeExact(Interop.allocateNativeString(filename)), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkImage} displaying the file {@code filename}.
     * <p>
     * If the file isn’t found or can’t be loaded, the resulting {@code GtkImage}
     * will display a “broken image” icon. This function never returns {@code null},
     * it always returns a valid {@code GtkImage} widget.
     * <p>
     * If you need to detect failures to load the file, use
     * {@link org.gtk.gdk.Texture#newFromFile} to load the file yourself,
     * then create the {@code GtkImage} from the texture.
     * <p>
     * The storage type (see {@link Image#getStorageType})
     * of the returned image is not defined, it will be whatever
     * is appropriate for displaying the file.
     * @param filename a filename
     * @return a new {@code GtkImage}
     */
    public static Image newFromFile(@NotNull java.lang.String filename) {
        return new Image(constructNewFromFile(filename));
    }
    
    private static Refcounted constructNewFromGicon(@NotNull org.gtk.gio.Icon icon) {
        java.util.Objects.requireNonNull(icon, "Parameter 'icon' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_image_new_from_gicon.invokeExact(icon.handle()), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkImage} displaying an icon from the current icon theme.
     * <p>
     * If the icon name isn’t known, a “broken image” icon will be
     * displayed instead. If the current icon theme is changed, the icon
     * will be updated appropriately.
     * @param icon an icon
     * @return a new {@code GtkImage} displaying the themed icon
     */
    public static Image newFromGicon(@NotNull org.gtk.gio.Icon icon) {
        return new Image(constructNewFromGicon(icon));
    }
    
    private static Refcounted constructNewFromIconName(@Nullable java.lang.String iconName) {
        java.util.Objects.requireNonNullElse(iconName, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_image_new_from_icon_name.invokeExact(Interop.allocateNativeString(iconName)), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkImage} displaying an icon from the current icon theme.
     * <p>
     * If the icon name isn’t known, a “broken image” icon will be
     * displayed instead. If the current icon theme is changed, the icon
     * will be updated appropriately.
     * @param iconName an icon name
     * @return a new {@code GtkImage} displaying the themed icon
     */
    public static Image newFromIconName(@Nullable java.lang.String iconName) {
        return new Image(constructNewFromIconName(iconName));
    }
    
    private static Refcounted constructNewFromPaintable(@Nullable org.gtk.gdk.Paintable paintable) {
        java.util.Objects.requireNonNullElse(paintable, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_image_new_from_paintable.invokeExact(paintable.handle()), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkImage} displaying {@code paintable}.
     * <p>
     * The {@code GtkImage} does not assume a reference to the paintable; you still
     * need to unref it if you own references. {@code GtkImage} will add its own
     * reference rather than adopting yours.
     * <p>
     * The {@code GtkImage} will track changes to the {@code paintable} and update
     * its size and contents in response to it.
     * @param paintable a {@code GdkPaintable}
     * @return a new {@code GtkImage}
     */
    public static Image newFromPaintable(@Nullable org.gtk.gdk.Paintable paintable) {
        return new Image(constructNewFromPaintable(paintable));
    }
    
    private static Refcounted constructNewFromPixbuf(@Nullable org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        java.util.Objects.requireNonNullElse(pixbuf, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_image_new_from_pixbuf.invokeExact(pixbuf.handle()), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkImage} displaying {@code pixbuf}.
     * <p>
     * The {@code GtkImage} does not assume a reference to the pixbuf; you still
     * need to unref it if you own references. {@code GtkImage} will add its own
     * reference rather than adopting yours.
     * <p>
     * This is a helper for {@link Image#newFromPaintable}, and you can't
     * get back the exact pixbuf once this is called, only a texture.
     * <p>
     * Note that this function just creates an {@code GtkImage} from the pixbuf.
     * The {@code GtkImage} created will not react to state changes. Should you
     * want that, you should use {@link Image#newFromIconName}.
     * @param pixbuf a {@code GdkPixbuf}
     * @return a new {@code GtkImage}
     */
    public static Image newFromPixbuf(@Nullable org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        return new Image(constructNewFromPixbuf(pixbuf));
    }
    
    private static Refcounted constructNewFromResource(@NotNull java.lang.String resourcePath) {
        java.util.Objects.requireNonNull(resourcePath, "Parameter 'resourcePath' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_image_new_from_resource.invokeExact(Interop.allocateNativeString(resourcePath)), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkImage} displaying the resource file {@code resource_path}.
     * <p>
     * If the file isn’t found or can’t be loaded, the resulting {@code GtkImage} will
     * display a “broken image” icon. This function never returns {@code null},
     * it always returns a valid {@code GtkImage} widget.
     * <p>
     * If you need to detect failures to load the file, use
     * {@link org.gtk.gdkpixbuf.Pixbuf#newFromFile} to load the file yourself,
     * then create the {@code GtkImage} from the pixbuf.
     * <p>
     * The storage type (see {@link Image#getStorageType}) of
     * the returned image is not defined, it will be whatever is
     * appropriate for displaying the file.
     * @param resourcePath a resource path
     * @return a new {@code GtkImage}
     */
    public static Image newFromResource(@NotNull java.lang.String resourcePath) {
        return new Image(constructNewFromResource(resourcePath));
    }
    
    /**
     * Resets the image to be empty.
     */
    public void clear() {
        try {
            DowncallHandles.gtk_image_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the {@code GIcon} being displayed by the {@code GtkImage}.
     * <p>
     * The storage type of the image must be {@link ImageType#EMPTY} or
     * {@link ImageType#GICON} (see {@link Image#getStorageType}).
     * The caller of this function does not own a reference to the
     * returned {@code GIcon}.
     * @return a {@code GIcon}
     */
    public @Nullable org.gtk.gio.Icon getGicon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_image_get_gicon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Icon.IconImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the icon name and size being displayed by the {@code GtkImage}.
     * <p>
     * The storage type of the image must be {@link ImageType#EMPTY} or
     * {@link ImageType#ICON_NAME} (see {@link Image#getStorageType}).
     * The returned string is owned by the {@code GtkImage} and should not
     * be freed.
     * @return the icon name
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_image_get_icon_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the icon size used by the {@code image} when rendering icons.
     * @return the image size used by icons
     */
    public @NotNull org.gtk.gtk.IconSize getIconSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_image_get_icon_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.IconSize(RESULT);
    }
    
    /**
     * Gets the image {@code GdkPaintable} being displayed by the {@code GtkImage}.
     * <p>
     * The storage type of the image must be {@link ImageType#EMPTY} or
     * {@link ImageType#PAINTABLE} (see {@link Image#getStorageType}).
     * The caller of this function does not own a reference to the
     * returned paintable.
     * @return the displayed paintable
     */
    public @Nullable org.gtk.gdk.Paintable getPaintable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_image_get_paintable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Paintable.PaintableImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the pixel size used for named icons.
     * @return the pixel size used for named icons.
     */
    public int getPixelSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_image_get_pixel_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the type of representation being used by the {@code GtkImage}
     * to store image data.
     * <p>
     * If the {@code GtkImage} has no image data, the return value will
     * be {@link ImageType#EMPTY}.
     * @return image representation being used
     */
    public @NotNull org.gtk.gtk.ImageType getStorageType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_image_get_storage_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ImageType(RESULT);
    }
    
    /**
     * Sets a {@code GtkImage} to show a file.
     * <p>
     * See {@link Image#newFromFile} for details.
     * @param filename a filename
     */
    public void setFromFile(@Nullable java.lang.String filename) {
        java.util.Objects.requireNonNullElse(filename, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_image_set_from_file.invokeExact(handle(), Interop.allocateNativeString(filename));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a {@code GtkImage} to show a {@code GIcon}.
     * <p>
     * See {@link Image#newFromGicon} for details.
     * @param icon an icon
     */
    public void setFromGicon(@NotNull org.gtk.gio.Icon icon) {
        java.util.Objects.requireNonNull(icon, "Parameter 'icon' must not be null");
        try {
            DowncallHandles.gtk_image_set_from_gicon.invokeExact(handle(), icon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a {@code GtkImage} to show a named icon.
     * <p>
     * See {@link Image#newFromIconName} for details.
     * @param iconName an icon name
     */
    public void setFromIconName(@Nullable java.lang.String iconName) {
        java.util.Objects.requireNonNullElse(iconName, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_image_set_from_icon_name.invokeExact(handle(), Interop.allocateNativeString(iconName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a {@code GtkImage} to show a {@code GdkPaintable}.
     * <p>
     * See {@link Image#newFromPaintable} for details.
     * @param paintable a {@code GdkPaintable}
     */
    public void setFromPaintable(@Nullable org.gtk.gdk.Paintable paintable) {
        java.util.Objects.requireNonNullElse(paintable, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_image_set_from_paintable.invokeExact(handle(), paintable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a {@code GtkImage} to show a {@code GdkPixbuf}.
     * <p>
     * See {@link Image#newFromPixbuf} for details.
     * <p>
     * Note: This is a helper for {@link Image#setFromPaintable},
     * and you can't get back the exact pixbuf once this is called,
     * only a paintable.
     * @param pixbuf a {@code GdkPixbuf} or {@code NULL}
     */
    public void setFromPixbuf(@Nullable org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        java.util.Objects.requireNonNullElse(pixbuf, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_image_set_from_pixbuf.invokeExact(handle(), pixbuf.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a {@code GtkImage} to show a resource.
     * <p>
     * See {@link Image#newFromResource} for details.
     * @param resourcePath a resource path
     */
    public void setFromResource(@Nullable java.lang.String resourcePath) {
        java.util.Objects.requireNonNullElse(resourcePath, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_image_set_from_resource.invokeExact(handle(), Interop.allocateNativeString(resourcePath));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Suggests an icon size to the theme for named icons.
     * @param iconSize the new icon size
     */
    public void setIconSize(@NotNull org.gtk.gtk.IconSize iconSize) {
        java.util.Objects.requireNonNull(iconSize, "Parameter 'iconSize' must not be null");
        try {
            DowncallHandles.gtk_image_set_icon_size.invokeExact(handle(), iconSize.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the pixel size to use for named icons.
     * <p>
     * If the pixel size is set to a value != -1, it is used instead
     * of the icon size set by {@link Image#setFromIconName}.
     * @param pixelSize the new pixel size
     */
    public void setPixelSize(int pixelSize) {
        try {
            DowncallHandles.gtk_image_set_pixel_size.invokeExact(handle(), pixelSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_image_new = Interop.downcallHandle(
            "gtk_image_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_image_new_from_file = Interop.downcallHandle(
            "gtk_image_new_from_file",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_image_new_from_gicon = Interop.downcallHandle(
            "gtk_image_new_from_gicon",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_image_new_from_icon_name = Interop.downcallHandle(
            "gtk_image_new_from_icon_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_image_new_from_paintable = Interop.downcallHandle(
            "gtk_image_new_from_paintable",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_image_new_from_pixbuf = Interop.downcallHandle(
            "gtk_image_new_from_pixbuf",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_image_new_from_resource = Interop.downcallHandle(
            "gtk_image_new_from_resource",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_image_clear = Interop.downcallHandle(
            "gtk_image_clear",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_image_get_gicon = Interop.downcallHandle(
            "gtk_image_get_gicon",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_image_get_icon_name = Interop.downcallHandle(
            "gtk_image_get_icon_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_image_get_icon_size = Interop.downcallHandle(
            "gtk_image_get_icon_size",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_image_get_paintable = Interop.downcallHandle(
            "gtk_image_get_paintable",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_image_get_pixel_size = Interop.downcallHandle(
            "gtk_image_get_pixel_size",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_image_get_storage_type = Interop.downcallHandle(
            "gtk_image_get_storage_type",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_image_set_from_file = Interop.downcallHandle(
            "gtk_image_set_from_file",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_image_set_from_gicon = Interop.downcallHandle(
            "gtk_image_set_from_gicon",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_image_set_from_icon_name = Interop.downcallHandle(
            "gtk_image_set_from_icon_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_image_set_from_paintable = Interop.downcallHandle(
            "gtk_image_set_from_paintable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_image_set_from_pixbuf = Interop.downcallHandle(
            "gtk_image_set_from_pixbuf",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_image_set_from_resource = Interop.downcallHandle(
            "gtk_image_set_from_resource",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_image_set_icon_size = Interop.downcallHandle(
            "gtk_image_set_icon_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_image_set_pixel_size = Interop.downcallHandle(
            "gtk_image_set_pixel_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
