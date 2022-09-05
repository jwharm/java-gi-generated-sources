package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GtkImage` widget displays an image.
 * 
 * ![An example GtkImage](image.png)
 * 
 * Various kinds of object can be displayed as an image; most typically,
 * you would load a `GdkTexture` from a file, using the convenience function
 * [ctor@Gtk.Image.new_from_file], for instance:
 * 
 * ```c
 * GtkWidget *image = gtk_image_new_from_file ("myfile.png");
 * ```
 * 
 * If the file isn’t loaded successfully, the image will contain a
 * “broken image” icon similar to that used in many web browsers.
 * 
 * If you want to handle errors in loading the file yourself,
 * for example by displaying an error message, then load the image with
 * [ctor@Gdk.Texture.new_from_file], then create the `GtkImage` with
 * [ctor@Gtk.Image.new_from_paintable].
 * 
 * Sometimes an application will want to avoid depending on external data
 * files, such as image files. See the documentation of `GResource` inside
 * GIO, for details. In this case, [property@Gtk.Image:resource],
 * [ctor@Gtk.Image.new_from_resource], and [method@Gtk.Image.set_from_resource]
 * should be used.
 * 
 * `GtkImage` displays its image as an icon, with a size that is determined
 * by the application. See [class@Gtk.Picture] if you want to show an image
 * at is actual size.
 * 
 * ## CSS nodes
 * 
 * `GtkImage` has a single CSS node with the name `image`. The style classes
 * `.normal-icons` or `.large-icons` may appear, depending on the
 * [property@Gtk.Image:icon-size] property.
 * 
 * ## Accessibility
 * 
 * `GtkImage` uses the `GTK_ACCESSIBLE_ROLE_IMG` role.
 */
public class Image extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Image(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Image */
    public static Image castFrom(org.gtk.gobject.Object gobject) {
        return new Image(gobject.getProxy());
    }
    
    /**
     * Creates a new empty `GtkImage` widget.
     */
    public Image() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_new(), false));
    }
    
    /**
     * Creates a new `GtkImage` displaying the file @filename.
     * 
     * If the file isn’t found or can’t be loaded, the resulting `GtkImage`
     * will display a “broken image” icon. This function never returns %NULL,
     * it always returns a valid `GtkImage` widget.
     * 
     * If you need to detect failures to load the file, use
     * [ctor@Gdk.Texture.new_from_file] to load the file yourself,
     * then create the `GtkImage` from the texture.
     * 
     * The storage type (see [method@Gtk.Image.get_storage_type])
     * of the returned image is not defined, it will be whatever
     * is appropriate for displaying the file.
     */
    public static Image newFromFile(java.lang.String filename) {
        return new Image(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_new_from_file(Interop.allocateNativeString(filename).HANDLE()), false));
    }
    
    /**
     * Creates a `GtkImage` displaying an icon from the current icon theme.
     * 
     * If the icon name isn’t known, a “broken image” icon will be
     * displayed instead. If the current icon theme is changed, the icon
     * will be updated appropriately.
     */
    public Image(org.gtk.gio.Icon icon) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_new_from_gicon(icon.HANDLE()), false));
    }
    
    /**
     * Creates a `GtkImage` displaying an icon from the current icon theme.
     * 
     * If the icon name isn’t known, a “broken image” icon will be
     * displayed instead. If the current icon theme is changed, the icon
     * will be updated appropriately.
     */
    public static Image newFromIconName(java.lang.String iconName) {
        return new Image(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_new_from_icon_name(Interop.allocateNativeString(iconName).HANDLE()), false));
    }
    
    /**
     * Creates a new `GtkImage` displaying @paintable.
     * 
     * The `GtkImage` does not assume a reference to the paintable; you still
     * need to unref it if you own references. `GtkImage` will add its own
     * reference rather than adopting yours.
     * 
     * The `GtkImage` will track changes to the @paintable and update
     * its size and contents in response to it.
     */
    public Image(org.gtk.gdk.Paintable paintable) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_new_from_paintable(paintable.HANDLE()), false));
    }
    
    /**
     * Creates a new `GtkImage` displaying @pixbuf.
     * 
     * The `GtkImage` does not assume a reference to the pixbuf; you still
     * need to unref it if you own references. `GtkImage` will add its own
     * reference rather than adopting yours.
     * 
     * This is a helper for [ctor@Gtk.Image.new_from_paintable], and you can't
     * get back the exact pixbuf once this is called, only a texture.
     * 
     * Note that this function just creates an `GtkImage` from the pixbuf.
     * The `GtkImage` created will not react to state changes. Should you
     * want that, you should use [ctor@Gtk.Image.new_from_icon_name].
     */
    public Image(org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_new_from_pixbuf(pixbuf.HANDLE()), false));
    }
    
    /**
     * Creates a new `GtkImage` displaying the resource file @resource_path.
     * 
     * If the file isn’t found or can’t be loaded, the resulting `GtkImage` will
     * display a “broken image” icon. This function never returns %NULL,
     * it always returns a valid `GtkImage` widget.
     * 
     * If you need to detect failures to load the file, use
     * [ctor@GdkPixbuf.Pixbuf.new_from_file] to load the file yourself,
     * then create the `GtkImage` from the pixbuf.
     * 
     * The storage type (see [method@Gtk.Image.get_storage_type]) of
     * the returned image is not defined, it will be whatever is
     * appropriate for displaying the file.
     */
    public static Image newFromResource(java.lang.String resourcePath) {
        return new Image(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_new_from_resource(Interop.allocateNativeString(resourcePath).HANDLE()), false));
    }
    
    /**
     * Resets the image to be empty.
     */
    public void clear() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_clear(HANDLE());
    }
    
    /**
     * Gets the `GIcon` being displayed by the `GtkImage`.
     * 
     * The storage type of the image must be %GTK_IMAGE_EMPTY or
     * %GTK_IMAGE_GICON (see [method@Gtk.Image.get_storage_type]).
     * The caller of this function does not own a reference to the
     * returned `GIcon`.
     */
    public org.gtk.gio.Icon getGicon() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_get_gicon(HANDLE());
        return new org.gtk.gio.Icon.IconImpl(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the icon name and size being displayed by the `GtkImage`.
     * 
     * The storage type of the image must be %GTK_IMAGE_EMPTY or
     * %GTK_IMAGE_ICON_NAME (see [method@Gtk.Image.get_storage_type]).
     * The returned string is owned by the `GtkImage` and should not
     * be freed.
     */
    public java.lang.String getIconName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_get_icon_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the icon size used by the @image when rendering icons.
     */
    public IconSize getIconSize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_get_icon_size(HANDLE());
        return IconSize.fromValue(RESULT);
    }
    
    /**
     * Gets the image `GdkPaintable` being displayed by the `GtkImage`.
     * 
     * The storage type of the image must be %GTK_IMAGE_EMPTY or
     * %GTK_IMAGE_PAINTABLE (see [method@Gtk.Image.get_storage_type]).
     * The caller of this function does not own a reference to the
     * returned paintable.
     */
    public org.gtk.gdk.Paintable getPaintable() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_get_paintable(HANDLE());
        return new org.gtk.gdk.Paintable.PaintableImpl(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the pixel size used for named icons.
     */
    public int getPixelSize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_get_pixel_size(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the type of representation being used by the `GtkImage`
     * to store image data.
     * 
     * If the `GtkImage` has no image data, the return value will
     * be %GTK_IMAGE_EMPTY.
     */
    public ImageType getStorageType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_get_storage_type(HANDLE());
        return ImageType.fromValue(RESULT);
    }
    
    /**
     * Sets a `GtkImage` to show a file.
     * 
     * See [ctor@Gtk.Image.new_from_file] for details.
     */
    public void setFromFile(java.lang.String filename) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_set_from_file(HANDLE(), Interop.allocateNativeString(filename).HANDLE());
    }
    
    /**
     * Sets a `GtkImage` to show a `GIcon`.
     * 
     * See [ctor@Gtk.Image.new_from_gicon] for details.
     */
    public void setFromGicon(org.gtk.gio.Icon icon) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_set_from_gicon(HANDLE(), icon.HANDLE());
    }
    
    /**
     * Sets a `GtkImage` to show a named icon.
     * 
     * See [ctor@Gtk.Image.new_from_icon_name] for details.
     */
    public void setFromIconName(java.lang.String iconName) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_set_from_icon_name(HANDLE(), Interop.allocateNativeString(iconName).HANDLE());
    }
    
    /**
     * Sets a `GtkImage` to show a `GdkPaintable`.
     * 
     * See [ctor@Gtk.Image.new_from_paintable] for details.
     */
    public void setFromPaintable(org.gtk.gdk.Paintable paintable) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_set_from_paintable(HANDLE(), paintable.HANDLE());
    }
    
    /**
     * Sets a `GtkImage` to show a `GdkPixbuf`.
     * 
     * See [ctor@Gtk.Image.new_from_pixbuf] for details.
     * 
     * Note: This is a helper for [method@Gtk.Image.set_from_paintable],
     * and you can't get back the exact pixbuf once this is called,
     * only a paintable.
     */
    public void setFromPixbuf(org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_set_from_pixbuf(HANDLE(), pixbuf.HANDLE());
    }
    
    /**
     * Sets a `GtkImage` to show a resource.
     * 
     * See [ctor@Gtk.Image.new_from_resource] for details.
     */
    public void setFromResource(java.lang.String resourcePath) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_set_from_resource(HANDLE(), Interop.allocateNativeString(resourcePath).HANDLE());
    }
    
    /**
     * Suggests an icon size to the theme for named icons.
     */
    public void setIconSize(IconSize iconSize) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_set_icon_size(HANDLE(), iconSize.getValue());
    }
    
    /**
     * Sets the pixel size to use for named icons.
     * 
     * If the pixel size is set to a value != -1, it is used instead
     * of the icon size set by [method@Gtk.Image.set_from_icon_name].
     */
    public void setPixelSize(int pixelSize) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_image_set_pixel_size(HANDLE(), pixelSize);
    }
    
}
