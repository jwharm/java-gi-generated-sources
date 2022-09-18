package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>GtkPicture</code> widget displays a <code>GdkPaintable</code>.
 * <p>
 * !{@link [An example GtkPicture]}(picture.png)
 * <p>
 * Many convenience functions are provided to make pictures simple to use.
 * For example, if you want to load an image from a file, and then display
 * it, there&<code>#8217</code> s a convenience function to do this:
 * <p><pre>c
 * GtkWidget *widget = gtk_picture_new_for_filename (&<code>#34</code> myfile.png&<code>#34</code> );
 * </pre>
 * <p>
 * If the file isn&<code>#8217</code> t loaded successfully, the picture will contain a
 * &<code>#8220</code> broken image&<code>#8221</code>  icon similar to that used in many web browsers.
 * If you want to handle errors in loading the file yourself,
 * for example by displaying an error message, then load the image with
 * {@link [ctor@Gdk.Texture.new_from_file] (ref=ctor)}, then create the <code>GtkPicture</code> with
 * {@link [ctor@Gtk.Picture.new_for_paintable] (ref=ctor)}.
 * <p>
 * Sometimes an application will want to avoid depending on external data
 * files, such as image files. See the documentation of <code>GResource</code> for details.
 * In this case, {@link [ctor@Gtk.Picture.new_for_resource] (ref=ctor)} and
 * {@link org.gtk.gtk.Picture<code>#setResource</code>  should be used.
 * <p><code>GtkPicture</code> displays an image at its natural size. See {@link org.gtk.gtk.Image}
 * if you want to display a fixed-size image, such as an icon.
 * <p>
 * <h2>Sizing the paintable</h2>
 * <p>
 * You can influence how the paintable is displayed inside the <code>GtkPicture</code>.
 * By turning off {@link [property@Gtk.Picture:keep-aspect-ratio] (ref=property)} you can allow the
 * paintable to get stretched. {@link [property@Gtk.Picture:can-shrink] (ref=property)} can be unset
 * to make sure that paintables are never made smaller than their ideal size -
 * but be careful if you do not know the size of the paintable in use (like
 * when displaying user-loaded images). This can easily cause the picture to
 * grow larger than the screen. And {@link [property@GtkWidget:halign] (ref=property)} and
 * {@link [property@GtkWidget:valign] (ref=property)} can be used to make sure the paintable doesn&<code>#39</code> t
 * fill all available space but is instead displayed at its original size.
 * <p>
 * <h2>CSS nodes</h2>
 * <p><code>GtkPicture</code> has a single CSS node with the name <code>picture</code>.
 * <p>
 * <h2>Accessibility</h2>
 * <p><code>GtkPicture</code> uses the <code>GTK_ACCESSIBLE_ROLE_IMG</code> role.
 */
public class Picture extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Picture(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Picture */
    public static Picture castFrom(org.gtk.gobject.Object gobject) {
        return new Picture(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_picture_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new empty <code>GtkPicture</code> widget.
     */
    public Picture() {
        super(constructNew());
    }
    
    private static Reference constructNewForFile(org.gtk.gio.File file) {
        Reference RESULT = References.get(gtk_h.gtk_picture_new_for_file(file.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkPicture</code> displaying the given @file.
     * <p>
     * If the file isn&<code>#8217</code> t found or can&<code>#8217</code> t be loaded, the resulting<code>GtkPicture</code> is empty.
     * <p>
     * If you need to detect failures to load the file, use
     * {@link [ctor@Gdk.Texture.new_from_file] (ref=ctor)} to load the file yourself,
     * then create the <code>GtkPicture</code> from the texture.
     */
    public static Picture newForFile(org.gtk.gio.File file) {
        return new Picture(constructNewForFile(file));
    }
    
    private static Reference constructNewForFilename(java.lang.String filename) {
        Reference RESULT = References.get(gtk_h.gtk_picture_new_for_filename(Interop.allocateNativeString(filename).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkPicture</code> displaying the file @filename.
     * 
     * This is a utility function that calls {@link [ctor@Gtk.Picture.new_for_file] (ref=ctor)}.
     * See that function for details.
     */
    public static Picture newForFilename(java.lang.String filename) {
        return new Picture(constructNewForFilename(filename));
    }
    
    private static Reference constructNewForPaintable(org.gtk.gdk.Paintable paintable) {
        Reference RESULT = References.get(gtk_h.gtk_picture_new_for_paintable(paintable.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkPicture</code> displaying @paintable.
     * <p>
     * The <code>GtkPicture</code> will track changes to the @paintable and update
     * its size and contents in response to it.
     */
    public static Picture newForPaintable(org.gtk.gdk.Paintable paintable) {
        return new Picture(constructNewForPaintable(paintable));
    }
    
    private static Reference constructNewForPixbuf(org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        Reference RESULT = References.get(gtk_h.gtk_picture_new_for_pixbuf(pixbuf.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkPicture</code> displaying @pixbuf.
     * 
     * This is a utility function that calls {@link [ctor@Gtk.Picture.new_for_paintable] (ref=ctor)},
     * See that function for details.
     * 
     * The pixbuf must not be modified after passing it to this function.
     */
    public static Picture newForPixbuf(org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        return new Picture(constructNewForPixbuf(pixbuf));
    }
    
    private static Reference constructNewForResource(java.lang.String resourcePath) {
        Reference RESULT = References.get(gtk_h.gtk_picture_new_for_resource(Interop.allocateNativeString(resourcePath).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkPicture</code> displaying the resource at @resource_path.
     * 
     * This is a utility function that calls {@link [ctor@Gtk.Picture.new_for_file] (ref=ctor)}.
     * See that function for details.
     */
    public static Picture newForResource(java.lang.String resourcePath) {
        return new Picture(constructNewForResource(resourcePath));
    }
    
    /**
     * Gets the alternative textual description of the picture.
     * 
     * The returned string will be <code>null</code> if the picture cannot be described textually.
     */
    public java.lang.String getAlternativeText() {
        var RESULT = gtk_h.gtk_picture_get_alternative_text(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns whether the <code>GtkPicture</code> respects its contents size.
     */
    public boolean getCanShrink() {
        var RESULT = gtk_h.gtk_picture_get_can_shrink(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the <code>GFile</code> currently displayed if @self is displaying a file.
     * 
     * If @self is not displaying a file, for example when
     * {@link org.gtk.gtk.Picture<code>#setPaintable</code>  was used, then <code>null</code> is returned.
     */
    public org.gtk.gio.File getFile() {
        var RESULT = gtk_h.gtk_picture_get_file(handle());
        return new org.gtk.gio.File.FileImpl(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the <code>GtkPicture</code> preserves its contents aspect ratio.
     */
    public boolean getKeepAspectRatio() {
        var RESULT = gtk_h.gtk_picture_get_keep_aspect_ratio(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the <code>GdkPaintable</code> being displayed by the <code>GtkPicture</code>.
     */
    public org.gtk.gdk.Paintable getPaintable() {
        var RESULT = gtk_h.gtk_picture_get_paintable(handle());
        return new org.gtk.gdk.Paintable.PaintableImpl(References.get(RESULT, false));
    }
    
    /**
     * Sets an alternative textual description for the picture contents.
     * 
     * It is equivalent to the &<code>#34</code> alt&<code>#34</code>  attribute for images on websites.
     * 
     * This text will be made available to accessibility tools.
     * 
     * If the picture cannot be described textually, set this property to <code>null</code>
     */
    public void setAlternativeText(java.lang.String alternativeText) {
        gtk_h.gtk_picture_set_alternative_text(handle(), Interop.allocateNativeString(alternativeText).handle());
    }
    
    /**
     * If set to <code>true</code>  the @self can be made smaller than its contents.
     * 
     * The contents will then be scaled down when rendering.
     * 
     * If you want to still force a minimum size manually, consider using
     * {@link org.gtk.gtk.Widget<code>#setSizeRequest</code> .
     * 
     * Also of note is that a similar function for growing does not exist
     * because the grow behavior can be controlled via
     * {@link org.gtk.gtk.Widget<code>#setHalign</code>  and {@link org.gtk.gtk.Widget<code>#setValign</code> .
     */
    public void setCanShrink(boolean canShrink) {
        gtk_h.gtk_picture_set_can_shrink(handle(), canShrink ? 1 : 0);
    }
    
    /**
     * Makes @self load and display @file.
     * 
     * See {@link [ctor@Gtk.Picture.new_for_file] (ref=ctor)} for details.
     */
    public void setFile(org.gtk.gio.File file) {
        gtk_h.gtk_picture_set_file(handle(), file.handle());
    }
    
    /**
     * Makes @self load and display the given @filename.
     * 
     * This is a utility function that calls {@link org.gtk.gtk.Picture<code>#setFile</code> .
     */
    public void setFilename(java.lang.String filename) {
        gtk_h.gtk_picture_set_filename(handle(), Interop.allocateNativeString(filename).handle());
    }
    
    /**
     * If set to <code>true</code>  the @self will render its contents according to
     * their aspect ratio.
     * 
     * That means that empty space may show up at the top/bottom or
     * left/right of @self.
     * 
     * If set to <code>false</code> or if the contents provide no aspect ratio,
     * the contents will be stretched over the picture&<code>#39</code> s whole area.
     */
    public void setKeepAspectRatio(boolean keepAspectRatio) {
        gtk_h.gtk_picture_set_keep_aspect_ratio(handle(), keepAspectRatio ? 1 : 0);
    }
    
    /**
     * Makes @self display the given @paintable.
     * 
     * If @paintable is <code>null</code>  nothing will be displayed.
     * 
     * See {@link [ctor@Gtk.Picture.new_for_paintable] (ref=ctor)} for details.
     */
    public void setPaintable(org.gtk.gdk.Paintable paintable) {
        gtk_h.gtk_picture_set_paintable(handle(), paintable.handle());
    }
    
    /**
     * Sets a <code>GtkPicture</code> to show a <code>GdkPixbuf</code>.
     * 
     * See {@link [ctor@Gtk.Picture.new_for_pixbuf] (ref=ctor)} for details.
     * 
     * This is a utility function that calls {@link org.gtk.gtk.Picture<code>#setPaintable</code> .
     */
    public void setPixbuf(org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        gtk_h.gtk_picture_set_pixbuf(handle(), pixbuf.handle());
    }
    
    /**
     * Makes @self load and display the resource at the given
     * @resource_path.
     * 
     * This is a utility function that calls {@link org.gtk.gtk.Picture<code>#setFile</code> .
     */
    public void setResource(java.lang.String resourcePath) {
        gtk_h.gtk_picture_set_resource(handle(), Interop.allocateNativeString(resourcePath).handle());
    }
    
}
