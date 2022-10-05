package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GtkImage} widget displays an image.
 * <p>
 * <img src="./doc-files/image.png" alt="An example GtkImage">
 * <p>
 * Various kinds of object can be displayed as an image; most typically,
 * you would load a {@code GdkTexture} from a file, using the convenience function
 * {@link Image#newFromFile}, for instance:
 * <p>
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
 * {@code Gtk.Image.set_from_resource}
 * should be used.
 * <p>
 * {@code GtkImage} displays its image as an icon, with a size that is determined
 * by the application. See {@link Picture} if you want to show an image
 * at is actual size.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code GtkImage} has a single CSS node with the name {@code image}. The style classes
 * {@code .normal-icons} or {@code .large-icons} may appear, depending on the
 * {@code Gtk.Image:icon-size} property.
 * <p>
 * <h2>Accessibility</h2>
 * <p>
 * {@code GtkImage} uses the {@code GTK_ACCESSIBLE_ROLE_IMG} role.
 */
public class Image extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Image(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Image */
    public static Image castFrom(org.gtk.gobject.Object gobject) {
        return new Image(gobject.refcounted());
    }
    
    static final MethodHandle gtk_image_new = Interop.downcallHandle(
        "gtk_image_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_image_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new empty {@code GtkImage} widget.
     */
    public Image() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_image_new_from_file = Interop.downcallHandle(
        "gtk_image_new_from_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromFile(java.lang.String filename) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_image_new_from_file.invokeExact(Interop.allocateNativeString(filename).handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public static Image newFromFile(java.lang.String filename) {
        return new Image(constructNewFromFile(filename));
    }
    
    static final MethodHandle gtk_image_new_from_gicon = Interop.downcallHandle(
        "gtk_image_new_from_gicon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromGicon(org.gtk.gio.Icon icon) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_image_new_from_gicon.invokeExact(icon.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GtkImage} displaying an icon from the current icon theme.
     * <p>
     * If the icon name isn’t known, a “broken image” icon will be
     * displayed instead. If the current icon theme is changed, the icon
     * will be updated appropriately.
     */
    public static Image newFromGicon(org.gtk.gio.Icon icon) {
        return new Image(constructNewFromGicon(icon));
    }
    
    static final MethodHandle gtk_image_new_from_icon_name = Interop.downcallHandle(
        "gtk_image_new_from_icon_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromIconName(java.lang.String iconName) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_image_new_from_icon_name.invokeExact(Interop.allocateNativeString(iconName).handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GtkImage} displaying an icon from the current icon theme.
     * <p>
     * If the icon name isn’t known, a “broken image” icon will be
     * displayed instead. If the current icon theme is changed, the icon
     * will be updated appropriately.
     */
    public static Image newFromIconName(java.lang.String iconName) {
        return new Image(constructNewFromIconName(iconName));
    }
    
    static final MethodHandle gtk_image_new_from_paintable = Interop.downcallHandle(
        "gtk_image_new_from_paintable",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromPaintable(org.gtk.gdk.Paintable paintable) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_image_new_from_paintable.invokeExact(paintable.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public static Image newFromPaintable(org.gtk.gdk.Paintable paintable) {
        return new Image(constructNewFromPaintable(paintable));
    }
    
    static final MethodHandle gtk_image_new_from_pixbuf = Interop.downcallHandle(
        "gtk_image_new_from_pixbuf",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromPixbuf(org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_image_new_from_pixbuf.invokeExact(pixbuf.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public static Image newFromPixbuf(org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        return new Image(constructNewFromPixbuf(pixbuf));
    }
    
    static final MethodHandle gtk_image_new_from_resource = Interop.downcallHandle(
        "gtk_image_new_from_resource",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromResource(java.lang.String resourcePath) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_image_new_from_resource.invokeExact(Interop.allocateNativeString(resourcePath).handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public static Image newFromResource(java.lang.String resourcePath) {
        return new Image(constructNewFromResource(resourcePath));
    }
    
    static final MethodHandle gtk_image_clear = Interop.downcallHandle(
        "gtk_image_clear",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Resets the image to be empty.
     */
    public void clear() {
        try {
            gtk_image_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_image_get_gicon = Interop.downcallHandle(
        "gtk_image_get_gicon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GIcon} being displayed by the {@code GtkImage}.
     * <p>
     * The storage type of the image must be {@link ImageType#EMPTY} or
     * {@link ImageType#GICON} (see {@link Image#getStorageType}).
     * The caller of this function does not own a reference to the
     * returned {@code GIcon}.
     */
    public org.gtk.gio.Icon getGicon() {
        try {
            var RESULT = (MemoryAddress) gtk_image_get_gicon.invokeExact(handle());
            return new org.gtk.gio.Icon.IconImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_image_get_icon_name = Interop.downcallHandle(
        "gtk_image_get_icon_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the icon name and size being displayed by the {@code GtkImage}.
     * <p>
     * The storage type of the image must be {@link ImageType#EMPTY} or
     * {@link ImageType#ICON_NAME} (see {@link Image#getStorageType}).
     * The returned string is owned by the {@code GtkImage} and should not
     * be freed.
     */
    public java.lang.String getIconName() {
        try {
            var RESULT = (MemoryAddress) gtk_image_get_icon_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_image_get_icon_size = Interop.downcallHandle(
        "gtk_image_get_icon_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the icon size used by the {@code image} when rendering icons.
     */
    public IconSize getIconSize() {
        try {
            var RESULT = (int) gtk_image_get_icon_size.invokeExact(handle());
            return new IconSize(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_image_get_paintable = Interop.downcallHandle(
        "gtk_image_get_paintable",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the image {@code GdkPaintable} being displayed by the {@code GtkImage}.
     * <p>
     * The storage type of the image must be {@link ImageType#EMPTY} or
     * {@link ImageType#PAINTABLE} (see {@link Image#getStorageType}).
     * The caller of this function does not own a reference to the
     * returned paintable.
     */
    public org.gtk.gdk.Paintable getPaintable() {
        try {
            var RESULT = (MemoryAddress) gtk_image_get_paintable.invokeExact(handle());
            return new org.gtk.gdk.Paintable.PaintableImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_image_get_pixel_size = Interop.downcallHandle(
        "gtk_image_get_pixel_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the pixel size used for named icons.
     */
    public int getPixelSize() {
        try {
            var RESULT = (int) gtk_image_get_pixel_size.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_image_get_storage_type = Interop.downcallHandle(
        "gtk_image_get_storage_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the type of representation being used by the {@code GtkImage}
     * to store image data.
     * <p>
     * If the {@code GtkImage} has no image data, the return value will
     * be {@link ImageType#EMPTY}.
     */
    public ImageType getStorageType() {
        try {
            var RESULT = (int) gtk_image_get_storage_type.invokeExact(handle());
            return new ImageType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_image_set_from_file = Interop.downcallHandle(
        "gtk_image_set_from_file",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a {@code GtkImage} to show a file.
     * <p>
     * See {@link Image#newFromFile} for details.
     */
    public void setFromFile(java.lang.String filename) {
        try {
            gtk_image_set_from_file.invokeExact(handle(), Interop.allocateNativeString(filename).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_image_set_from_gicon = Interop.downcallHandle(
        "gtk_image_set_from_gicon",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a {@code GtkImage} to show a {@code GIcon}.
     * <p>
     * See {@link Image#newFromGicon} for details.
     */
    public void setFromGicon(org.gtk.gio.Icon icon) {
        try {
            gtk_image_set_from_gicon.invokeExact(handle(), icon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_image_set_from_icon_name = Interop.downcallHandle(
        "gtk_image_set_from_icon_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a {@code GtkImage} to show a named icon.
     * <p>
     * See {@link Image#newFromIconName} for details.
     */
    public void setFromIconName(java.lang.String iconName) {
        try {
            gtk_image_set_from_icon_name.invokeExact(handle(), Interop.allocateNativeString(iconName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_image_set_from_paintable = Interop.downcallHandle(
        "gtk_image_set_from_paintable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a {@code GtkImage} to show a {@code GdkPaintable}.
     * <p>
     * See {@link Image#newFromPaintable} for details.
     */
    public void setFromPaintable(org.gtk.gdk.Paintable paintable) {
        try {
            gtk_image_set_from_paintable.invokeExact(handle(), paintable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_image_set_from_pixbuf = Interop.downcallHandle(
        "gtk_image_set_from_pixbuf",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a {@code GtkImage} to show a {@code GdkPixbuf}.
     * <p>
     * See {@link Image#newFromPixbuf} for details.
     * <p>
     * Note: This is a helper for {@link Image#setFromPaintable},
     * and you can't get back the exact pixbuf once this is called,
     * only a paintable.
     */
    public void setFromPixbuf(org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        try {
            gtk_image_set_from_pixbuf.invokeExact(handle(), pixbuf.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_image_set_from_resource = Interop.downcallHandle(
        "gtk_image_set_from_resource",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a {@code GtkImage} to show a resource.
     * <p>
     * See {@link Image#newFromResource} for details.
     */
    public void setFromResource(java.lang.String resourcePath) {
        try {
            gtk_image_set_from_resource.invokeExact(handle(), Interop.allocateNativeString(resourcePath).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_image_set_icon_size = Interop.downcallHandle(
        "gtk_image_set_icon_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Suggests an icon size to the theme for named icons.
     */
    public void setIconSize(IconSize iconSize) {
        try {
            gtk_image_set_icon_size.invokeExact(handle(), iconSize.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_image_set_pixel_size = Interop.downcallHandle(
        "gtk_image_set_pixel_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the pixel size to use for named icons.
     * <p>
     * If the pixel size is set to a value != -1, it is used instead
     * of the icon size set by {@link Image#setFromIconName}.
     */
    public void setPixelSize(int pixelSize) {
        try {
            gtk_image_set_pixel_size.invokeExact(handle(), pixelSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
