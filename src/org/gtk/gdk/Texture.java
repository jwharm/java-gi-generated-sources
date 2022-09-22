package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GdkTexture} is the basic element used to refer to pixel data.
 * <p>
 * It is primarily meant for pixel data that will not change over
 * multiple frames, and will be used for a long time.
 * <p>
 * There are various ways to create {@code GdkTexture} objects from a
 * {@link org.gtk.gdkpixbuf.Pixbuf}, or a Cairo surface, or other pixel data.
 * <p>
 * The ownership of the pixel data is transferred to the {@code GdkTexture}
 * instance; you can only make a copy of it, via {@link Texture#download}.
 * <p>
 * {@code GdkTexture} is an immutable object: That means you cannot change
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
     * Creates a new texture object representing the {@code GdkPixbuf}.
     * <p>
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
     * <p>
     * The file format is detected automatically. The supported formats
     * are PNG and JPEG, though more formats might be available.
     * <p>
     * If <code>null</code> is returned, then {@code error} will be set.
     * <p>
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
     * <p>
     * The file format is detected automatically. The supported formats
     * are PNG and JPEG, though more formats might be available.
     * <p>
     * If <code>null</code> is returned, then {@code error} will be set.
     * <p>
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
     * <p>
     * The file format is detected automatically. The supported formats
     * are PNG and JPEG, though more formats might be available.
     * <p>
     * If <code>null</code> is returned, then {@code error} will be set.
     * <p>
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
     * <p>
     * The file format is detected automatically. The supported formats
     * are PNG and JPEG, though more formats might be available.
     * <p>
     * It is a fatal error if {@code resource_path} does not specify a valid
     * image resource and the program will abort if that happens.
     * If you are unsure about the validity of a resource, use
     * {@link Texture#newFromFile} to load it.
     * <p>
     * This function is threadsafe, so that you can e.g. use GTask
     * and {@link org.gtk.gio.Task#runInThread} to avoid blocking the main thread
     * while loading a big image.
     */
    public static Texture newFromResource(java.lang.String resourcePath) {
        return new Texture(constructNewFromResource(resourcePath));
    }
    
    /**
     * Downloads the {@code texture} into local memory.
     * <p>
     * This may be an expensive operation, as the actual texture data
     * may reside on a GPU or on a remote display server.
     * <p>
     * The data format of the downloaded data is equivalent to
     * {@link org.cairographics.Format#ARGB32}, so every downloaded pixel requires
     * 4 bytes of memory.
     * <p>
     * Downloading a texture into a Cairo image surface:
     * <pre>{@code c
     * surface = cairo_image_surface_create (CAIRO_FORMAT_ARGB32,
     *                                       gdk_texture_get_width (texture),
     *                                       gdk_texture_get_height (texture));
     * gdk_texture_download (texture,
     *                       cairo_image_surface_get_data (surface),
     *                       cairo_image_surface_get_stride (surface));
     * cairo_surface_mark_dirty (surface);
     * }</pre>
     */
    public void download(byte[] data, long stride) {
        gtk_h.gdk_texture_download(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), stride);
    }
    
    /**
     * Returns the height of the {@code texture}, in pixels.
     */
    public int getHeight() {
        var RESULT = gtk_h.gdk_texture_get_height(handle());
        return RESULT;
    }
    
    /**
     * Returns the width of {@code texture}, in pixels.
     */
    public int getWidth() {
        var RESULT = gtk_h.gdk_texture_get_width(handle());
        return RESULT;
    }
    
    /**
     * Store the given {@code texture} to the {@code filename} as a PNG file.
     * <p>
     * This is a utility function intended for debugging and testing.
     * If you want more control over formats, proper error handling or
     * want to store to a {@code Gio.File} or other location, you might want to
     * use {@link Texture#saveToPngBytes} or look into the
     * gdk-pixbuf library.
     */
    public boolean saveToPng(java.lang.String filename) {
        var RESULT = gtk_h.gdk_texture_save_to_png(handle(), Interop.allocateNativeString(filename).handle());
        return (RESULT != 0);
    }
    
    /**
     * Store the given {@code texture} in memory as a PNG file.
     * <p>
     * Use {@link Texture#newFromBytes} to read it back.
     * <p>
     * If you want to serialize a texture, this is a convenient and
     * portable way to do that.
     * <p>
     * If you need more control over the generated image, such as
     * attaching metadata, you should look into an image handling
     * library such as the gdk-pixbuf library.
     * <p>
     * If you are dealing with high dynamic range float data, you
     * might also want to consider {@link Texture#saveToTiffBytes}
     * instead.
     */
    public org.gtk.glib.Bytes saveToPngBytes() {
        var RESULT = gtk_h.gdk_texture_save_to_png_bytes(handle());
        return new org.gtk.glib.Bytes(References.get(RESULT, true));
    }
    
    /**
     * Store the given {@code texture} to the {@code filename} as a TIFF file.
     * <p>
     * GTK will attempt to store data without loss.
     */
    public boolean saveToTiff(java.lang.String filename) {
        var RESULT = gtk_h.gdk_texture_save_to_tiff(handle(), Interop.allocateNativeString(filename).handle());
        return (RESULT != 0);
    }
    
    /**
     * Store the given {@code texture} in memory as a TIFF file.
     * <p>
     * Use {@link Texture#newFromBytes} to read it back.
     * <p>
     * This function is intended to store a representation of the
     * texture's data that is as accurate as possible. This is
     * particularly relevant when working with high dynamic range
     * images and floating-point texture data.
     * <p>
     * If that is not your concern and you are interested in a
     * smaller size and a more portable format, you might want to
     * use {@link Texture#saveToPngBytes}.
     */
    public org.gtk.glib.Bytes saveToTiffBytes() {
        var RESULT = gtk_h.gdk_texture_save_to_tiff_bytes(handle());
        return new org.gtk.glib.Bytes(References.get(RESULT, true));
    }
    
}
