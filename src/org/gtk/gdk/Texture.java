package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GdkTexture</code> is the basic element used to refer to pixel data.
 * <p>
 * It is primarily meant for pixel data that will not change over
 * multiple frames, and will be used for a long time.
 * <p>
 * There are various ways to create <code>GdkTexture</code> objects from a
 * {@link org.gtk.gdkpixbuf.Pixbuf}, or a Cairo surface, or other pixel data.
 * <p>
 * The ownership of the pixel data is transferred to the <code>GdkTexture</code>
 * instance; you can only make a copy of it, via {@link org.gtk.gdk.Texture#download}.
 * <p><code>GdkTexture</code> is an immutable object: That means you cannot change
 * anything about it other than increasing the reference count via
 * {@link org.gtk.gobject.Object#ref}, and consequently, it is a thread-safe object.
 */
public class Texture extends org.gtk.gobject.Object implements Paintable, org.gtk.gio.Icon, org.gtk.gio.LoadableIcon {

    public Texture(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Texture */
    public static Texture castFrom(org.gtk.gobject.Object gobject) {
        return new Texture(gobject.getReference());
    }
    
    private static Reference constructNewForPixbuf(org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        Reference RESULT = References.get(gtk_h.gdk_texture_new_for_pixbuf(pixbuf.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new texture object representing the <code>GdkPixbuf</code>.
     * 
     * This function is threadsafe, so that you can e.g. use GTask
     * and {@link org.gtk.gio.Task#runInThread} to avoid blocking the main thread
     * while loading a big image.
     */
    public static Texture newForPixbuf(org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        return new Texture(constructNewForPixbuf(pixbuf));
    }
    
    private static Reference constructNewFromBytes(org.gtk.glib.Bytes bytes) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gdk_texture_new_from_bytes(bytes.handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new texture by loading an image from memory,
     * 
     * The file format is detected automatically. The supported formats
     * are PNG and JPEG, though more formats might be available.
     * 
     * If <code>null</code> is returned, then @error will be set.
     * 
     * This function is threadsafe, so that you can e.g. use GTask
     * and {@link org.gtk.gio.Task#runInThread} to avoid blocking the main thread
     * while loading a big image.
     */
    public static Texture newFromBytes(org.gtk.glib.Bytes bytes) throws GErrorException {
        return new Texture(constructNewFromBytes(bytes));
    }
    
    private static Reference constructNewFromFile(org.gtk.gio.File file) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gdk_texture_new_from_file(file.handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new texture by loading an image from a file.
     * 
     * The file format is detected automatically. The supported formats
     * are PNG and JPEG, though more formats might be available.
     * 
     * If <code>null</code> is returned, then @error will be set.
     * 
     * This function is threadsafe, so that you can e.g. use GTask
     * and {@link org.gtk.gio.Task#runInThread} to avoid blocking the main thread
     * while loading a big image.
     */
    public static Texture newFromFile(org.gtk.gio.File file) throws GErrorException {
        return new Texture(constructNewFromFile(file));
    }
    
    private static Reference constructNewFromFilename(java.lang.String path) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gdk_texture_new_from_filename(Interop.allocateNativeString(path).handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new texture by loading an image from a file.
     * 
     * The file format is detected automatically. The supported formats
     * are PNG and JPEG, though more formats might be available.
     * 
     * If <code>null</code> is returned, then @error will be set.
     * 
     * This function is threadsafe, so that you can e.g. use GTask
     * and {@link org.gtk.gio.Task#runInThread} to avoid blocking the main thread
     * while loading a big image.
     */
    public static Texture newFromFilename(java.lang.String path) throws GErrorException {
        return new Texture(constructNewFromFilename(path));
    }
    
    private static Reference constructNewFromResource(java.lang.String resourcePath) {
        Reference RESULT = References.get(gtk_h.gdk_texture_new_from_resource(Interop.allocateNativeString(resourcePath).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new texture by loading an image from a resource.
     * 
     * The file format is detected automatically. The supported formats
     * are PNG and JPEG, though more formats might be available.
     * 
     * It is a fatal error if @resource_path does not specify a valid
     * image resource and the program will abort if that happens.
     * If you are unsure about the validity of a resource, use
     * {@link [ctor@Gdk.Texture.new_from_file] (ref=ctor)} to load it.
     * 
     * This function is threadsafe, so that you can e.g. use GTask
     * and {@link org.gtk.gio.Task#runInThread} to avoid blocking the main thread
     * while loading a big image.
     */
    public static Texture newFromResource(java.lang.String resourcePath) {
        return new Texture(constructNewFromResource(resourcePath));
    }
    
    /**
     * Downloads the @texture into local memory.
     * <p>
     * This may be an expensive operation, as the actual texture data
     * may reside on a GPU or on a remote display server.
     * <p>
     * The data format of the downloaded data is equivalent to
     * <code>CAIRO_FORMAT_ARGB32,</code> so every downloaded pixel requires
     * 4 bytes of memory.
     * <p>
     * Downloading a texture into a Cairo image surface:<pre>c
     * surface = cairo_image_surface_create (CAIRO_FORMAT_ARGB32,
     *                                       gdk_texture_get_width (texture),
     *                                       gdk_texture_get_height (texture));
     * gdk_texture_download (texture,
     *                       cairo_image_surface_get_data (surface),
     *                       cairo_image_surface_get_stride (surface));
     * cairo_surface_mark_dirty (surface);
     * </pre>
     */
    public void download(byte[] data, long stride) {
        gtk_h.gdk_texture_download(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), stride);
    }
    
    /**
     * Returns the height of the @texture, in pixels.
     */
    public int getHeight() {
        var RESULT = gtk_h.gdk_texture_get_height(handle());
        return RESULT;
    }
    
    /**
     * Returns the width of @texture, in pixels.
     */
    public int getWidth() {
        var RESULT = gtk_h.gdk_texture_get_width(handle());
        return RESULT;
    }
    
    /**
     * Store the given @texture to the @filename as a PNG file.
     * 
     * This is a utility function intended for debugging and testing.
     * If you want more control over formats, proper error handling or
     * want to store to a {@link [iface@Gio.File] (ref=iface)} or other location, you might want to
     * use {@link org.gtk.gdk.Texture#saveToPngBytes} or look into the
     * gdk-pixbuf library.
     */
    public boolean saveToPng(java.lang.String filename) {
        var RESULT = gtk_h.gdk_texture_save_to_png(handle(), Interop.allocateNativeString(filename).handle());
        return (RESULT != 0);
    }
    
    /**
     * Store the given @texture in memory as a PNG file.
     * 
     * Use {@link [ctor@Gdk.Texture.new_from_bytes] (ref=ctor)} to read it back.
     * 
     * If you want to serialize a texture, this is a convenient and
     * portable way to do that.
     * 
     * If you need more control over the generated image, such as
     * attaching metadata, you should look into an image handling
     * library such as the gdk-pixbuf library.
     * 
     * If you are dealing with high dynamic range float data, you
     * might also want to consider {@link org.gtk.gdk.Texture#saveToTiffBytes}
     * instead.
     */
    public org.gtk.glib.Bytes saveToPngBytes() {
        var RESULT = gtk_h.gdk_texture_save_to_png_bytes(handle());
        return new org.gtk.glib.Bytes(References.get(RESULT, true));
    }
    
    /**
     * Store the given @texture to the @filename as a TIFF file.
     * 
     * GTK will attempt to store data without loss.
     */
    public boolean saveToTiff(java.lang.String filename) {
        var RESULT = gtk_h.gdk_texture_save_to_tiff(handle(), Interop.allocateNativeString(filename).handle());
        return (RESULT != 0);
    }
    
    /**
     * Store the given @texture in memory as a TIFF file.
     * 
     * Use {@link [ctor@Gdk.Texture.new_from_bytes] (ref=ctor)} to read it back.
     * 
     * This function is intended to store a representation of the
     * texture&#39;s data that is as accurate as possible. This is
     * particularly relevant when working with high dynamic range
     * images and floating-point texture data.
     * 
     * If that is not your concern and you are interested in a
     * smaller size and a more portable format, you might want to
     * use {@link org.gtk.gdk.Texture#saveToPngBytes}.
     */
    public org.gtk.glib.Bytes saveToTiffBytes() {
        var RESULT = gtk_h.gdk_texture_save_to_tiff_bytes(handle());
        return new org.gtk.glib.Bytes(References.get(RESULT, true));
    }
    
}
