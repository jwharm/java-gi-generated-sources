package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GdkTexture` is the basic element used to refer to pixel data.
 * 
 * It is primarily meant for pixel data that will not change over
 * multiple frames, and will be used for a long time.
 * 
 * There are various ways to create `GdkTexture` objects from a
 * [class@GdkPixbuf.Pixbuf], or a Cairo surface, or other pixel data.
 * 
 * The ownership of the pixel data is transferred to the `GdkTexture`
 * instance; you can only make a copy of it, via [method@Gdk.Texture.download].
 * 
 * `GdkTexture` is an immutable object: That means you cannot change
 * anything about it other than increasing the reference count via
 * [method@GObject.Object.ref], and consequently, it is a thread-safe object.
 */
public class Texture extends org.gtk.gobject.Object implements Paintable, org.gtk.gio.Icon, org.gtk.gio.LoadableIcon {

    public Texture(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Texture */
    public static Texture castFrom(org.gtk.gobject.Object gobject) {
        return new Texture(gobject.getProxy());
    }
    
    /**
     * Creates a new texture object representing the `GdkPixbuf`.
     * 
     * This function is threadsafe, so that you can e.g. use GTask
     * and [method@Gio.Task.run_in_thread] to avoid blocking the main thread
     * while loading a big image.
     */
    public Texture(org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_texture_new_for_pixbuf(pixbuf.HANDLE()), true));
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
     * [ctor@Gdk.Texture.new_from_file] to load it.
     * 
     * This function is threadsafe, so that you can e.g. use GTask
     * and [method@Gio.Task.run_in_thread] to avoid blocking the main thread
     * while loading a big image.
     */
    public static Texture newFromResource(java.lang.String resourcePath) {
        return new Texture(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_texture_new_from_resource(Interop.getAllocator().allocateUtf8String(resourcePath)), true));
    }
    
    /**
     * Downloads the @texture into local memory.
     * 
     * This may be an expensive operation, as the actual texture data
     * may reside on a GPU or on a remote display server.
     * 
     * The data format of the downloaded data is equivalent to
     * %CAIRO_FORMAT_ARGB32, so every downloaded pixel requires
     * 4 bytes of memory.
     * 
     * Downloading a texture into a Cairo image surface:
     * ```c
     * surface = cairo_image_surface_create (CAIRO_FORMAT_ARGB32,
     *                                       gdk_texture_get_width (texture),
     *                                       gdk_texture_get_height (texture));
     * gdk_texture_download (texture,
     *                       cairo_image_surface_get_data (surface),
     *                       cairo_image_surface_get_stride (surface));
     * cairo_surface_mark_dirty (surface);
     * ```
     */
    public void download(byte[] data, long stride) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_texture_download(HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data), stride);
    }
    
    /**
     * Returns the height of the @texture, in pixels.
     */
    public int getHeight() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_texture_get_height(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the width of @texture, in pixels.
     */
    public int getWidth() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_texture_get_width(HANDLE());
        return RESULT;
    }
    
    /**
     * Store the given @texture to the @filename as a PNG file.
     * 
     * This is a utility function intended for debugging and testing.
     * If you want more control over formats, proper error handling or
     * want to store to a [iface@Gio.File] or other location, you might want to
     * use [method@Gdk.Texture.save_to_png_bytes] or look into the
     * gdk-pixbuf library.
     */
    public boolean saveToPng(java.lang.String filename) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_texture_save_to_png(HANDLE(), Interop.getAllocator().allocateUtf8String(filename));
        return (RESULT != 0);
    }
    
    /**
     * Store the given @texture in memory as a PNG file.
     * 
     * Use [ctor@Gdk.Texture.new_from_bytes] to read it back.
     * 
     * If you want to serialize a texture, this is a convenient and
     * portable way to do that.
     * 
     * If you need more control over the generated image, such as
     * attaching metadata, you should look into an image handling
     * library such as the gdk-pixbuf library.
     * 
     * If you are dealing with high dynamic range float data, you
     * might also want to consider [method@Gdk.Texture.save_to_tiff_bytes]
     * instead.
     */
    public org.gtk.glib.Bytes saveToPngBytes() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_texture_save_to_png_bytes(HANDLE());
        return new org.gtk.glib.Bytes(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Store the given @texture to the @filename as a TIFF file.
     * 
     * GTK will attempt to store data without loss.
     */
    public boolean saveToTiff(java.lang.String filename) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_texture_save_to_tiff(HANDLE(), Interop.getAllocator().allocateUtf8String(filename));
        return (RESULT != 0);
    }
    
    /**
     * Store the given @texture in memory as a TIFF file.
     * 
     * Use [ctor@Gdk.Texture.new_from_bytes] to read it back.
     * 
     * This function is intended to store a representation of the
     * texture's data that is as accurate as possible. This is
     * particularly relevant when working with high dynamic range
     * images and floating-point texture data.
     * 
     * If that is not your concern and you are interested in a
     * smaller size and a more portable format, you might want to
     * use [method@Gdk.Texture.save_to_png_bytes].
     */
    public org.gtk.glib.Bytes saveToTiffBytes() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_texture_save_to_tiff_bytes(HANDLE());
        return new org.gtk.glib.Bytes(ProxyFactory.get(RESULT, true));
    }
    
}
