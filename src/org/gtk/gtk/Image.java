package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>GtkImage</code> widget displays an image.
 * <p>
 * !{@link [An example GtkImage]}(image.png)
 * <p>
 * Various kinds of object can be displayed as an image; most typically,
 * you would load a <code>GdkTexture</code> from a file, using the convenience function
 * {@link [ctor@Gtk.Image.new_from_file] (ref=ctor)}, for instance:
 * <p><pre>c
 * GtkWidget *image = gtk_image_new_from_file (&#34;myfile.png&#34;);
 * </pre>
 * <p>
 * If the file isn&#8217;t loaded successfully, the image will contain a
 * &#8220;broken image&#8221; icon similar to that used in many web browsers.
 * <p>
 * If you want to handle errors in loading the file yourself,
 * for example by displaying an error message, then load the image with
 * {@link [ctor@Gdk.Texture.new_from_file] (ref=ctor)}, then create the <code>GtkImage</code> with
 * {@link [ctor@Gtk.Image.new_from_paintable] (ref=ctor)}.
 * <p>
 * Sometimes an application will want to avoid depending on external data
 * files, such as image files. See the documentation of <code>GResource</code> inside
 * GIO, for details. In this case, {@link [property@Gtk.Image:resource] (ref=property)},
 * {@link [ctor@Gtk.Image.new_from_resource] (ref=ctor)}, and {@link org.gtk.gtk.Image#setFromResource}
 * should be used.
 * <p><code>GtkImage</code> displays its image as an icon, with a size that is determined
 * by the application. See {@link org.gtk.gtk.Picture} if you want to show an image
 * at is actual size.
 * <p>
 * <h2>CSS nodes</h2>
 * <p><code>GtkImage</code> has a single CSS node with the name <code>image</code>. The style classes<code>.normal-icons</code> or <code>.large-icons</code> may appear, depending on the
 * {@link [property@Gtk.Image:icon-size] (ref=property)} property.
 * <p>
 * <h2>Accessibility</h2>
 * <p><code>GtkImage</code> uses the <code>GTK_ACCESSIBLE_ROLE_IMG</code> role.
 */
public class Image extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Image(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Image */
    public static Image castFrom(org.gtk.gobject.Object gobject) {
        return new Image(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_image_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new empty <code>GtkImage</code> widget.
     */
    public Image() {
        super(constructNew());
    }
    
    private static Reference constructNewFromFile(java.lang.String filename) {
        Reference RESULT = References.get(gtk_h.gtk_image_new_from_file(Interop.allocateNativeString(filename).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkImage</code> displaying the file @filename.
     * <p>
     * If the file isn&#8217;t found or can&#8217;t be loaded, the resulting <code>GtkImage</code>
     * will display a &#8220;broken image&#8221; icon. This function never returns <code>NULL,
     * it</code> always returns a valid <code>GtkImage</code> widget.
     * <p>
     * If you need to detect failures to load the file, use
     * {@link [ctor@Gdk.Texture.new_from_file] (ref=ctor)} to load the file yourself,
     * then create the <code>GtkImage</code> from the texture.
     * 
     * The storage type (see {@link org.gtk.gtk.Image#getStorageType})
     * of the returned image is not defined, it will be whatever
     * is appropriate for displaying the file.
     */
    public static Image newFromFile(java.lang.String filename) {
        return new Image(constructNewFromFile(filename));
    }
    
    private static Reference constructNewFromGicon(org.gtk.gio.Icon icon) {
        Reference RESULT = References.get(gtk_h.gtk_image_new_from_gicon(icon.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a <code>GtkImage</code> displaying an icon from the current icon theme.
     * 
     * If the icon name isn&#8217;t known, a &#8220;broken image&#8221; icon will be
     * displayed instead. If the current icon theme is changed, the icon
     * will be updated appropriately.
     */
    public static Image newFromGicon(org.gtk.gio.Icon icon) {
        return new Image(constructNewFromGicon(icon));
    }
    
    private static Reference constructNewFromIconName(java.lang.String iconName) {
        Reference RESULT = References.get(gtk_h.gtk_image_new_from_icon_name(Interop.allocateNativeString(iconName).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a <code>GtkImage</code> displaying an icon from the current icon theme.
     * 
     * If the icon name isn&#8217;t known, a &#8220;broken image&#8221; icon will be
     * displayed instead. If the current icon theme is changed, the icon
     * will be updated appropriately.
     */
    public static Image newFromIconName(java.lang.String iconName) {
        return new Image(constructNewFromIconName(iconName));
    }
    
    private static Reference constructNewFromPaintable(org.gtk.gdk.Paintable paintable) {
        Reference RESULT = References.get(gtk_h.gtk_image_new_from_paintable(paintable.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkImage</code> displaying @paintable.
     * <p>
     * The <code>GtkImage</code> does not assume a reference to the paintable; you still
     * need to unref it if you own references. <code>GtkImage</code> will add its own
     * reference rather than adopting yours.
     * <p>
     * The <code>GtkImage</code> will track changes to the @paintable and update
     * its size and contents in response to it.
     */
    public static Image newFromPaintable(org.gtk.gdk.Paintable paintable) {
        return new Image(constructNewFromPaintable(paintable));
    }
    
    private static Reference constructNewFromPixbuf(org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        Reference RESULT = References.get(gtk_h.gtk_image_new_from_pixbuf(pixbuf.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkImage</code> displaying @pixbuf.
     * <p>
     * The <code>GtkImage</code> does not assume a reference to the pixbuf; you still
     * need to unref it if you own references. <code>GtkImage</code> will add its own
     * reference rather than adopting yours.
     * <p>
     * This is a helper for {@link [ctor@Gtk.Image.new_from_paintable] (ref=ctor)}, and you can&#39;t
     * get back the exact pixbuf once this is called, only a texture.
     * <p>
     * Note that this function just creates an <code>GtkImage</code> from the pixbuf.
     * The <code>GtkImage</code> created will not react to state changes. Should you
     * want that, you should use {@link [ctor@Gtk.Image.new_from_icon_name] (ref=ctor)}.
     */
    public static Image newFromPixbuf(org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        return new Image(constructNewFromPixbuf(pixbuf));
    }
    
    private static Reference constructNewFromResource(java.lang.String resourcePath) {
        Reference RESULT = References.get(gtk_h.gtk_image_new_from_resource(Interop.allocateNativeString(resourcePath).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkImage</code> displaying the resource file @resource_path.
     * <p>
     * If the file isn&#8217;t found or can&#8217;t be loaded, the resulting <code>GtkImage</code> will
     * display a &#8220;broken image&#8221; icon. This function never returns <code>NULL,
     * it</code> always returns a valid <code>GtkImage</code> widget.
     * <p>
     * If you need to detect failures to load the file, use
     * {@link [ctor@GdkPixbuf.Pixbuf.new_from_file] (ref=ctor)} to load the file yourself,
     * then create the <code>GtkImage</code> from the pixbuf.
     * 
     * The storage type (see {@link org.gtk.gtk.Image#getStorageType}) of
     * the returned image is not defined, it will be whatever is
     * appropriate for displaying the file.
     */
    public static Image newFromResource(java.lang.String resourcePath) {
        return new Image(constructNewFromResource(resourcePath));
    }
    
    /**
     * Resets the image to be empty.
     */
    public void clear() {
        gtk_h.gtk_image_clear(handle());
    }
    
    /**
     * Gets the <code>GIcon</code> being displayed by the <code>GtkImage</code>.
     * <p>
     * The storage type of the image must be {@link org.gtk.gtk.ImageType#EMPTY} or
     * {@link org.gtk.gtk.ImageType#GICON} (see {@link org.gtk.gtk.Image#getStorageType}).
     * The caller of this function does not own a reference to the
     * returned <code>GIcon</code>.
     */
    public org.gtk.gio.Icon getGicon() {
        var RESULT = gtk_h.gtk_image_get_gicon(handle());
        return new org.gtk.gio.Icon.IconImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the icon name and size being displayed by the <code>GtkImage</code>.
     * <p>
     * The storage type of the image must be {@link org.gtk.gtk.ImageType#EMPTY} or
     * {@link org.gtk.gtk.ImageType#ICON_NAME} (see {@link org.gtk.gtk.Image#getStorageType}).
     * The returned string is owned by the <code>GtkImage</code> and should not
     * be freed.
     */
    public java.lang.String getIconName() {
        var RESULT = gtk_h.gtk_image_get_icon_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the icon size used by the @image when rendering icons.
     */
    public IconSize getIconSize() {
        var RESULT = gtk_h.gtk_image_get_icon_size(handle());
        return IconSize.fromValue(RESULT);
    }
    
    /**
     * Gets the image <code>GdkPaintable</code> being displayed by the <code>GtkImage</code>.
     * 
     * The storage type of the image must be {@link org.gtk.gtk.ImageType#EMPTY} or
     * {@link org.gtk.gtk.ImageType#PAINTABLE} (see {@link org.gtk.gtk.Image#getStorageType}).
     * The caller of this function does not own a reference to the
     * returned paintable.
     */
    public org.gtk.gdk.Paintable getPaintable() {
        var RESULT = gtk_h.gtk_image_get_paintable(handle());
        return new org.gtk.gdk.Paintable.PaintableImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the pixel size used for named icons.
     */
    public int getPixelSize() {
        var RESULT = gtk_h.gtk_image_get_pixel_size(handle());
        return RESULT;
    }
    
    /**
     * Gets the type of representation being used by the <code>GtkImage</code>
     * to store image data.
     * <p>
     * If the <code>GtkImage</code> has no image data, the return value will
     * be 
     *             
     *           
     *         
     *       
     *       
     *         
     *         Gets the type of representation being used by the <code>GtkImage</code>
     * to store image data.
     * <p>
     * If the <code>GtkImage</code> has no image data, the return value will
     * be %GTK_IMAGE_EMPTY.
     */
    public ImageType getStorageType() {
        var RESULT = gtk_h.gtk_image_get_storage_type(handle());
        return ImageType.fromValue(RESULT);
    }
    
    /**
     * Sets a <code>GtkImage</code> to show a file.
     * 
     * See {@link [ctor@Gtk.Image.new_from_file] (ref=ctor)} for details.
     */
    public void setFromFile(java.lang.String filename) {
        gtk_h.gtk_image_set_from_file(handle(), Interop.allocateNativeString(filename).handle());
    }
    
    /**
     * Sets a <code>GtkImage</code> to show a <code>GIcon</code>.
     * 
     * See {@link [ctor@Gtk.Image.new_from_gicon] (ref=ctor)} for details.
     */
    public void setFromGicon(org.gtk.gio.Icon icon) {
        gtk_h.gtk_image_set_from_gicon(handle(), icon.handle());
    }
    
    /**
     * Sets a <code>GtkImage</code> to show a named icon.
     * 
     * See {@link [ctor@Gtk.Image.new_from_icon_name] (ref=ctor)} for details.
     */
    public void setFromIconName(java.lang.String iconName) {
        gtk_h.gtk_image_set_from_icon_name(handle(), Interop.allocateNativeString(iconName).handle());
    }
    
    /**
     * Sets a <code>GtkImage</code> to show a <code>GdkPaintable</code>.
     * 
     * See {@link [ctor@Gtk.Image.new_from_paintable] (ref=ctor)} for details.
     */
    public void setFromPaintable(org.gtk.gdk.Paintable paintable) {
        gtk_h.gtk_image_set_from_paintable(handle(), paintable.handle());
    }
    
    /**
     * Sets a <code>GtkImage</code> to show a <code>GdkPixbuf</code>.
     * 
     * See {@link [ctor@Gtk.Image.new_from_pixbuf] (ref=ctor)} for details.
     * 
     * Note: This is a helper for {@link org.gtk.gtk.Image#setFromPaintable},
     * and you can&#39;t get back the exact pixbuf once this is called,
     * only a paintable.
     */
    public void setFromPixbuf(org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        gtk_h.gtk_image_set_from_pixbuf(handle(), pixbuf.handle());
    }
    
    /**
     * Sets a <code>GtkImage</code> to show a resource.
     * 
     * See {@link [ctor@Gtk.Image.new_from_resource] (ref=ctor)} for details.
     */
    public void setFromResource(java.lang.String resourcePath) {
        gtk_h.gtk_image_set_from_resource(handle(), Interop.allocateNativeString(resourcePath).handle());
    }
    
    /**
     * Suggests an icon size to the theme for named icons.
     */
    public void setIconSize(IconSize iconSize) {
        gtk_h.gtk_image_set_icon_size(handle(), iconSize.getValue());
    }
    
    /**
     * Sets the pixel size to use for named icons.
     * 
     * If the pixel size is set to a value != -1, it is used instead
     * of the icon size set by {@link org.gtk.gtk.Image#setFromIconName}.
     */
    public void setPixelSize(int pixelSize) {
        gtk_h.gtk_image_set_pixel_size(handle(), pixelSize);
    }
    
}
