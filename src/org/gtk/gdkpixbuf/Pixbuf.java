package org.gtk.gdkpixbuf;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A pixel buffer.
 * 
 * `GdkPixbuf` contains information about an image's pixel data,
 * its color space, bits per sample, width and height, and the
 * rowstride (the number of bytes between the start of one row
 * and the start of the next).
 * 
 * ## Creating new `GdkPixbuf`
 * 
 * The most basic way to create a pixbuf is to wrap an existing pixel
 * buffer with a [class@GdkPixbuf.Pixbuf] instance. You can use the
 * [`ctor@GdkPixbuf.Pixbuf.new_from_data`] function to do this.
 * 
 * Every time you create a new `GdkPixbuf` instance for some data, you
 * will need to specify the destroy notification function that will be
 * called when the data buffer needs to be freed; this will happen when
 * a `GdkPixbuf` is finalized by the reference counting functions. If
 * you have a chunk of static data compiled into your application, you
 * can pass in `NULL` as the destroy notification function so that the
 * data will not be freed.
 * 
 * The [`ctor@GdkPixbuf.Pixbuf.new`] constructor function can be used
 * as a convenience to create a pixbuf with an empty buffer; this is
 * equivalent to allocating a data buffer using `malloc()` and then
 * wrapping it with `gdk_pixbuf_new_from_data()`. The `gdk_pixbuf_new()`
 * function will compute an optimal rowstride so that rendering can be
 * performed with an efficient algorithm.
 * 
 * As a special case, you can use the [`ctor@GdkPixbuf.Pixbuf.new_from_xpm_data`]
 * function to create a pixbuf from inline XPM image data.
 * 
 * You can also copy an existing pixbuf with the [method@Pixbuf.copy]
 * function. This is not the same as just acquiring a reference to
 * the old pixbuf instance: the copy function will actually duplicate
 * the pixel data in memory and create a new [class@Pixbuf] instance
 * for it.
 * 
 * ## Reference counting
 * 
 * `GdkPixbuf` structures are reference counted. This means that an
 * application can share a single pixbuf among many parts of the
 * code. When a piece of the program needs to use a pixbuf, it should
 * acquire a reference to it by calling `g_object_ref()`; when it no
 * longer needs the pixbuf, it should release the reference it acquired
 * by calling `g_object_unref()`. The resources associated with a
 * `GdkPixbuf` will be freed when its reference count drops to zero.
 * Newly-created `GdkPixbuf` instances start with a reference count
 * of one.
 * 
 * ## Image Data
 * 
 * Image data in a pixbuf is stored in memory in an uncompressed,
 * packed format. Rows in the image are stored top to bottom, and
 * in each row pixels are stored from left to right.
 * 
 * There may be padding at the end of a row.
 * 
 * The "rowstride" value of a pixbuf, as returned by [`method@GdkPixbuf.Pixbuf.get_rowstride`],
 * indicates the number of bytes between rows.
 * 
 * **NOTE**: If you are copying raw pixbuf data with `memcpy()` note that the
 * last row in the pixbuf may not be as wide as the full rowstride, but rather
 * just as wide as the pixel data needs to be; that is: it is unsafe to do
 * `memcpy (dest, pixels, rowstride * height)` to copy a whole pixbuf. Use
 * [method@GdkPixbuf.Pixbuf.copy] instead, or compute the width in bytes of the
 * last row as:
 * 
 * ```c
 * last_row = width * ((n_channels * bits_per_sample + 7) / 8);
 * ```
 * 
 * The same rule applies when iterating over each row of a `GdkPixbuf` pixels
 * array.
 * 
 * The following code illustrates a simple `put_pixel()`
 * function for RGB pixbufs with 8 bits per channel with an alpha
 * channel.
 * 
 * ```c
 * static void
 * put_pixel (GdkPixbuf *pixbuf,
 *            int x,
 * 	   int y,
 * 	   guchar red,
 * 	   guchar green,
 * 	   guchar blue,
 * 	   guchar alpha)
 * {
 *   int n_channels = gdk_pixbuf_get_n_channels (pixbuf);
 * 
 *   // Ensure that the pixbuf is valid
 *   g_assert (gdk_pixbuf_get_colorspace (pixbuf) == GDK_COLORSPACE_RGB);
 *   g_assert (gdk_pixbuf_get_bits_per_sample (pixbuf) == 8);
 *   g_assert (gdk_pixbuf_get_has_alpha (pixbuf));
 *   g_assert (n_channels == 4);
 * 
 *   int width = gdk_pixbuf_get_width (pixbuf);
 *   int height = gdk_pixbuf_get_height (pixbuf);
 * 
 *   // Ensure that the coordinates are in a valid range
 *   g_assert (x >= 0 && x < width);
 *   g_assert (y >= 0 && y < height);
 * 
 *   int rowstride = gdk_pixbuf_get_rowstride (pixbuf);
 * 
 *   // The pixel buffer in the GdkPixbuf instance
 *   guchar *pixels = gdk_pixbuf_get_pixels (pixbuf);
 * 
 *   // The pixel we wish to modify
 *   guchar *p = pixels + y * rowstride + x * n_channels;
 *   p[0] = red;
 *   p[1] = green;
 *   p[2] = blue;
 *   p[3] = alpha;
 * }
 * ```
 * 
 * ## Loading images
 * 
 * The `GdkPixBuf` class provides a simple mechanism for loading
 * an image from a file in synchronous and asynchronous fashion.
 * 
 * For GUI applications, it is recommended to use the asynchronous
 * stream API to avoid blocking the control flow of the application.
 * 
 * Additionally, `GdkPixbuf` provides the [class@GdkPixbuf.PixbufLoader`]
 * API for progressive image loading.
 * 
 * ## Saving images
 * 
 * The `GdkPixbuf` class provides methods for saving image data in
 * a number of file formats. The formatted data can be written to a
 * file or to a memory buffer. `GdkPixbuf` can also call a user-defined
 * callback on the data, which allows to e.g. write the image
 * to a socket or store it in a database.
 */
public class Pixbuf extends org.gtk.gobject.Object implements org.gtk.gio.Icon, org.gtk.gio.LoadableIcon {

    public Pixbuf(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Pixbuf */
    public static Pixbuf castFrom(org.gtk.gobject.Object gobject) {
        return new Pixbuf(gobject.getReference());
    }
    
    private static Reference constructNew(Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height) {
        Reference RESULT = References.get(gtk_h.gdk_pixbuf_new(colorspace.getValue(), hasAlpha ? 1 : 0, bitsPerSample, width, height), true);
        return RESULT;
    }
    
    /**
     * Creates a new `GdkPixbuf` structure and allocates a buffer for it.
     * 
     * If the allocation of the buffer failed, this function will return `NULL`.
     * 
     * The buffer has an optimal rowstride. Note that the buffer is not cleared;
     * you will have to fill it completely yourself.
     */
    public Pixbuf(Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height) {
        super(constructNew(colorspace, hasAlpha, bitsPerSample, width, height));
    }
    
    private static Reference constructNewFromBytes(org.gtk.glib.Bytes data, Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height, int rowstride) {
        Reference RESULT = References.get(gtk_h.gdk_pixbuf_new_from_bytes(data.handle(), colorspace.getValue(), hasAlpha ? 1 : 0, bitsPerSample, width, height, rowstride), true);
        return RESULT;
    }
    
    /**
     * Creates a new #GdkPixbuf out of in-memory readonly image data.
     * 
     * Currently only RGB images with 8 bits per sample are supported.
     * 
     * This is the `GBytes` variant of gdk_pixbuf_new_from_data(), useful
     * for language bindings.
     */
    public static Pixbuf newFromBytes(org.gtk.glib.Bytes data, Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height, int rowstride) {
        return new Pixbuf(constructNewFromBytes(data, colorspace, hasAlpha, bitsPerSample, width, height, rowstride));
    }
    
    private static Reference constructNewFromData(byte[] data, Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height, int rowstride, PixbufDestroyNotify destroyFn) {
        try {
            Reference RESULT = References.get(gtk_h.gdk_pixbuf_new_from_data(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), colorspace.getValue(), hasAlpha ? 1 : 0, bitsPerSample, width, height, rowstride, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbPixbufDestroyNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(destroyFn.hashCode(), destroyFn))), true);
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a new #GdkPixbuf out of in-memory image data.
     * 
     * Currently only RGB images with 8 bits per sample are supported.
     * 
     * Since you are providing a pre-allocated pixel buffer, you must also
     * specify a way to free that data.  This is done with a function of
     * type `GdkPixbufDestroyNotify`.  When a pixbuf created with is
     * finalized, your destroy notification function will be called, and
     * it is its responsibility to free the pixel array.
     * 
     * See also: [ctor@GdkPixbuf.Pixbuf.new_from_bytes]
     */
    public static Pixbuf newFromData(byte[] data, Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height, int rowstride, PixbufDestroyNotify destroyFn) {
        return new Pixbuf(constructNewFromData(data, colorspace, hasAlpha, bitsPerSample, width, height, rowstride, destroyFn));
    }
    
    private static Reference constructNewFromFile(java.lang.String filename) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gdk_pixbuf_new_from_file(Interop.allocateNativeString(filename).handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf by loading an image from a file.
     * 
     * The file format is detected automatically.
     * 
     * If `NULL` is returned, then @error will be set. Possible errors are:
     * 
     *  - the file could not be opened
     *  - there is no loader for the file's format
     *  - there is not enough memory to allocate the image buffer
     *  - the image buffer contains invalid data
     * 
     * The error domains are `GDK_PIXBUF_ERROR` and `G_FILE_ERROR`.
     */
    public static Pixbuf newFromFile(java.lang.String filename) throws GErrorException {
        return new Pixbuf(constructNewFromFile(filename));
    }
    
    private static Reference constructNewFromFileAtScale(java.lang.String filename, int width, int height, boolean preserveAspectRatio) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gdk_pixbuf_new_from_file_at_scale(Interop.allocateNativeString(filename).handle(), width, height, preserveAspectRatio ? 1 : 0, GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf by loading an image from a file.
     * 
     * The file format is detected automatically.
     * 
     * If `NULL` is returned, then @error will be set. Possible errors are:
     * 
     *  - the file could not be opened
     *  - there is no loader for the file's format
     *  - there is not enough memory to allocate the image buffer
     *  - the image buffer contains invalid data
     * 
     * The error domains are `GDK_PIXBUF_ERROR` and `G_FILE_ERROR`.
     * 
     * The image will be scaled to fit in the requested size, optionally preserving
     * the image's aspect ratio.
     * 
     * When preserving the aspect ratio, a `width` of -1 will cause the image
     * to be scaled to the exact given height, and a `height` of -1 will cause
     * the image to be scaled to the exact given width. When not preserving
     * aspect ratio, a `width` or `height` of -1 means to not scale the image
     * at all in that dimension. Negative values for `width` and `height` are
     * allowed since 2.8.
     */
    public static Pixbuf newFromFileAtScale(java.lang.String filename, int width, int height, boolean preserveAspectRatio) throws GErrorException {
        return new Pixbuf(constructNewFromFileAtScale(filename, width, height, preserveAspectRatio));
    }
    
    private static Reference constructNewFromFileAtSize(java.lang.String filename, int width, int height) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gdk_pixbuf_new_from_file_at_size(Interop.allocateNativeString(filename).handle(), width, height, GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf by loading an image from a file.
     * 
     * The file format is detected automatically.
     * 
     * If `NULL` is returned, then @error will be set. Possible errors are:
     * 
     *  - the file could not be opened
     *  - there is no loader for the file's format
     *  - there is not enough memory to allocate the image buffer
     *  - the image buffer contains invalid data
     * 
     * The error domains are `GDK_PIXBUF_ERROR` and `G_FILE_ERROR`.
     * 
     * The image will be scaled to fit in the requested size, preserving
     * the image's aspect ratio. Note that the returned pixbuf may be smaller
     * than `width` x `height`, if the aspect ratio requires it. To load
     * and image at the requested size, regardless of aspect ratio, use
     * [ctor@GdkPixbuf.Pixbuf.new_from_file_at_scale].
     */
    public static Pixbuf newFromFileAtSize(java.lang.String filename, int width, int height) throws GErrorException {
        return new Pixbuf(constructNewFromFileAtSize(filename, width, height));
    }
    
    private static Reference constructNewFromInline(int dataLength, byte[] data, boolean copyPixels) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gdk_pixbuf_new_from_inline(dataLength, new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data)).handle(), copyPixels ? 1 : 0, GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a `GdkPixbuf` from a flat representation that is suitable for
     * storing as inline data in a program.
     * 
     * This is useful if you want to ship a program with images, but don't want
     * to depend on any external files.
     * 
     * GdkPixbuf ships with a program called `gdk-pixbuf-csource`, which allows
     * for conversion of `GdkPixbuf`s into such a inline representation.
     * 
     * In almost all cases, you should pass the `--raw` option to
     * `gdk-pixbuf-csource`. A sample invocation would be:
     * 
     * ```
     * gdk-pixbuf-csource --raw --name=myimage_inline myimage.png
     * ```
     * 
     * For the typical case where the inline pixbuf is read-only static data,
     * you don't need to copy the pixel data unless you intend to write to
     * it, so you can pass `FALSE` for `copy_pixels`. If you pass `--rle` to
     * `gdk-pixbuf-csource`, a copy will be made even if `copy_pixels` is `FALSE`,
     * so using this option is generally a bad idea.
     * 
     * If you create a pixbuf from const inline data compiled into your
     * program, it's probably safe to ignore errors and disable length checks,
     * since things will always succeed:
     * 
     * ```c
     * pixbuf = gdk_pixbuf_new_from_inline (-1, myimage_inline, FALSE, NULL);
     * ```
     * 
     * For non-const inline data, you could get out of memory. For untrusted
     * inline data located at runtime, you could have corrupt inline data in
     * addition.
     */
    public static Pixbuf newFromInline(int dataLength, byte[] data, boolean copyPixels) throws GErrorException {
        return new Pixbuf(constructNewFromInline(dataLength, data, copyPixels));
    }
    
    private static Reference constructNewFromResource(java.lang.String resourcePath) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gdk_pixbuf_new_from_resource(Interop.allocateNativeString(resourcePath).handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf by loading an image from an resource.
     * 
     * The file format is detected automatically. If `NULL` is returned, then
     * @error will be set.
     */
    public static Pixbuf newFromResource(java.lang.String resourcePath) throws GErrorException {
        return new Pixbuf(constructNewFromResource(resourcePath));
    }
    
    private static Reference constructNewFromResourceAtScale(java.lang.String resourcePath, int width, int height, boolean preserveAspectRatio) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gdk_pixbuf_new_from_resource_at_scale(Interop.allocateNativeString(resourcePath).handle(), width, height, preserveAspectRatio ? 1 : 0, GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf by loading an image from an resource.
     * 
     * The file format is detected automatically. If `NULL` is returned, then
     * @error will be set.
     * 
     * The image will be scaled to fit in the requested size, optionally
     * preserving the image's aspect ratio. When preserving the aspect ratio,
     * a @width of -1 will cause the image to be scaled to the exact given
     * height, and a @height of -1 will cause the image to be scaled to the
     * exact given width. When not preserving aspect ratio, a @width or
     * @height of -1 means to not scale the image at all in that dimension.
     * 
     * The stream is not closed.
     */
    public static Pixbuf newFromResourceAtScale(java.lang.String resourcePath, int width, int height, boolean preserveAspectRatio) throws GErrorException {
        return new Pixbuf(constructNewFromResourceAtScale(resourcePath, width, height, preserveAspectRatio));
    }
    
    private static Reference constructNewFromStream(org.gtk.gio.InputStream stream, org.gtk.gio.Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gdk_pixbuf_new_from_stream(stream.handle(), cancellable.handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf by loading an image from an input stream.
     * 
     * The file format is detected automatically.
     * 
     * If `NULL` is returned, then `error` will be set.
     * 
     * The `cancellable` can be used to abort the operation from another thread.
     * If the operation was cancelled, the error `G_IO_ERROR_CANCELLED` will be
     * returned. Other possible errors are in the `GDK_PIXBUF_ERROR` and
     * `G_IO_ERROR` domains.
     * 
     * The stream is not closed.
     */
    public static Pixbuf newFromStream(org.gtk.gio.InputStream stream, org.gtk.gio.Cancellable cancellable) throws GErrorException {
        return new Pixbuf(constructNewFromStream(stream, cancellable));
    }
    
    private static Reference constructNewFromStreamAtScale(org.gtk.gio.InputStream stream, int width, int height, boolean preserveAspectRatio, org.gtk.gio.Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gdk_pixbuf_new_from_stream_at_scale(stream.handle(), width, height, preserveAspectRatio ? 1 : 0, cancellable.handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf by loading an image from an input stream.
     * 
     * The file format is detected automatically. If `NULL` is returned, then
     * @error will be set. The @cancellable can be used to abort the operation
     * from another thread. If the operation was cancelled, the error
     * `G_IO_ERROR_CANCELLED` will be returned. Other possible errors are in
     * the `GDK_PIXBUF_ERROR` and `G_IO_ERROR` domains.
     * 
     * The image will be scaled to fit in the requested size, optionally
     * preserving the image's aspect ratio.
     * 
     * When preserving the aspect ratio, a `width` of -1 will cause the image to be
     * scaled to the exact given height, and a `height` of -1 will cause the image
     * to be scaled to the exact given width. If both `width` and `height` are
     * given, this function will behave as if the smaller of the two values
     * is passed as -1.
     * 
     * When not preserving aspect ratio, a `width` or `height` of -1 means to not
     * scale the image at all in that dimension.
     * 
     * The stream is not closed.
     */
    public static Pixbuf newFromStreamAtScale(org.gtk.gio.InputStream stream, int width, int height, boolean preserveAspectRatio, org.gtk.gio.Cancellable cancellable) throws GErrorException {
        return new Pixbuf(constructNewFromStreamAtScale(stream, width, height, preserveAspectRatio, cancellable));
    }
    
    private static Reference constructNewFromStreamFinish(org.gtk.gio.AsyncResult asyncResult) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gdk_pixbuf_new_from_stream_finish(asyncResult.handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Finishes an asynchronous pixbuf creation operation started with
     * gdk_pixbuf_new_from_stream_async().
     */
    public static Pixbuf newFromStreamFinish(org.gtk.gio.AsyncResult asyncResult) throws GErrorException {
        return new Pixbuf(constructNewFromStreamFinish(asyncResult));
    }
    
    private static Reference constructNewFromXpmData(java.lang.String[] data) {
        Reference RESULT = References.get(gtk_h.gdk_pixbuf_new_from_xpm_data(Interop.allocateNativeArray(data).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf by parsing XPM data in memory.
     * 
     * This data is commonly the result of including an XPM file into a
     * program's C source.
     */
    public static Pixbuf newFromXpmData(java.lang.String[] data) {
        return new Pixbuf(constructNewFromXpmData(data));
    }
    
    /**
     * Takes an existing pixbuf and adds an alpha channel to it.
     * 
     * If the existing pixbuf already had an alpha channel, the channel
     * values are copied from the original; otherwise, the alpha channel
     * is initialized to 255 (full opacity).
     * 
     * If `substitute_color` is `TRUE`, then the color specified by the
     * (`r`, `g`, `b`) arguments will be assigned zero opacity. That is,
     * if you pass `(255, 255, 255)` for the substitute color, all white
     * pixels will become fully transparent.
     * 
     * If `substitute_color` is `FALSE`, then the (`r`, `g`, `b`) arguments
     * will be ignored.
     */
    public Pixbuf addAlpha(boolean substituteColor, byte r, byte g, byte b) {
        var RESULT = gtk_h.gdk_pixbuf_add_alpha(handle(), substituteColor ? 1 : 0, r, g, b);
        return new Pixbuf(References.get(RESULT, true));
    }
    
    /**
     * Takes an existing pixbuf and checks for the presence of an
     * associated "orientation" option.
     * 
     * The orientation option may be provided by the JPEG loader (which
     * reads the exif orientation tag) or the TIFF loader (which reads
     * the TIFF orientation tag, and compensates it for the partial
     * transforms performed by libtiff).
     * 
     * If an orientation option/tag is present, the appropriate transform
     * will be performed so that the pixbuf is oriented correctly.
     */
    public Pixbuf applyEmbeddedOrientation() {
        var RESULT = gtk_h.gdk_pixbuf_apply_embedded_orientation(handle());
        return new Pixbuf(References.get(RESULT, true));
    }
    
    /**
     * Creates a transformation of the source image @src by scaling by
     * @scale_x and @scale_y then translating by @offset_x and @offset_y.
     * 
     * This gives an image in the coordinates of the destination pixbuf.
     * The rectangle (@dest_x, @dest_y, @dest_width, @dest_height)
     * is then alpha blended onto the corresponding rectangle of the
     * original destination image.
     * 
     * When the destination rectangle contains parts not in the source
     * image, the data at the edges of the source image is replicated
     * to infinity.
     * 
     * ![](composite.png)
     */
    public void composite(Pixbuf dest, int destX, int destY, int destWidth, int destHeight, double offsetX, double offsetY, double scaleX, double scaleY, InterpType interpType, int overallAlpha) {
        gtk_h.gdk_pixbuf_composite(handle(), dest.handle(), destX, destY, destWidth, destHeight, offsetX, offsetY, scaleX, scaleY, interpType.getValue(), overallAlpha);
    }
    
    /**
     * Creates a transformation of the source image @src by scaling by
     * @scale_x and @scale_y then translating by @offset_x and @offset_y,
     * then alpha blends the rectangle (@dest_x ,@dest_y, @dest_width,
     * @dest_height) of the resulting image with a checkboard of the
     * colors @color1 and @color2 and renders it onto the destination
     * image.
     * 
     * If the source image has no alpha channel, and @overall_alpha is 255, a fast
     * path is used which omits the alpha blending and just performs the scaling.
     * 
     * See gdk_pixbuf_composite_color_simple() for a simpler variant of this
     * function suitable for many tasks.
     */
    public void compositeColor(Pixbuf dest, int destX, int destY, int destWidth, int destHeight, double offsetX, double offsetY, double scaleX, double scaleY, InterpType interpType, int overallAlpha, int checkX, int checkY, int checkSize, int color1, int color2) {
        gtk_h.gdk_pixbuf_composite_color(handle(), dest.handle(), destX, destY, destWidth, destHeight, offsetX, offsetY, scaleX, scaleY, interpType.getValue(), overallAlpha, checkX, checkY, checkSize, color1, color2);
    }
    
    /**
     * Creates a new pixbuf by scaling `src` to `dest_width` x `dest_height`
     * and alpha blending the result with a checkboard of colors `color1`
     * and `color2`.
     */
    public Pixbuf compositeColorSimple(int destWidth, int destHeight, InterpType interpType, int overallAlpha, int checkSize, int color1, int color2) {
        var RESULT = gtk_h.gdk_pixbuf_composite_color_simple(handle(), destWidth, destHeight, interpType.getValue(), overallAlpha, checkSize, color1, color2);
        return new Pixbuf(References.get(RESULT, true));
    }
    
    /**
     * Creates a new `GdkPixbuf` with a copy of the information in the specified
     * `pixbuf`.
     * 
     * Note that this does not copy the options set on the original `GdkPixbuf`,
     * use gdk_pixbuf_copy_options() for this.
     */
    public Pixbuf copy() {
        var RESULT = gtk_h.gdk_pixbuf_copy(handle());
        return new Pixbuf(References.get(RESULT, true));
    }
    
    /**
     * Copies a rectangular area from `src_pixbuf` to `dest_pixbuf`.
     * 
     * Conversion of pixbuf formats is done automatically.
     * 
     * If the source rectangle overlaps the destination rectangle on the
     * same pixbuf, it will be overwritten during the copy operation.
     * Therefore, you can not use this function to scroll a pixbuf.
     */
    public void copyArea(int srcX, int srcY, int width, int height, Pixbuf destPixbuf, int destX, int destY) {
        gtk_h.gdk_pixbuf_copy_area(handle(), srcX, srcY, width, height, destPixbuf.handle(), destX, destY);
    }
    
    /**
     * Copies the key/value pair options attached to a `GdkPixbuf` to another
     * `GdkPixbuf`.
     * 
     * This is useful to keep original metadata after having manipulated
     * a file. However be careful to remove metadata which you've already
     * applied, such as the "orientation" option after rotating the image.
     */
    public boolean copyOptions(Pixbuf destPixbuf) {
        var RESULT = gtk_h.gdk_pixbuf_copy_options(handle(), destPixbuf.handle());
        return (RESULT != 0);
    }
    
    /**
     * Clears a pixbuf to the given RGBA value, converting the RGBA value into
     * the pixbuf's pixel format.
     * 
     * The alpha component will be ignored if the pixbuf doesn't have an alpha
     * channel.
     */
    public void fill(int pixel) {
        gtk_h.gdk_pixbuf_fill(handle(), pixel);
    }
    
    /**
     * Flips a pixbuf horizontally or vertically and returns the
     * result in a new pixbuf.
     */
    public Pixbuf flip(boolean horizontal) {
        var RESULT = gtk_h.gdk_pixbuf_flip(handle(), horizontal ? 1 : 0);
        return new Pixbuf(References.get(RESULT, true));
    }
    
    /**
     * Queries the number of bits per color sample in a pixbuf.
     */
    public int getBitsPerSample() {
        var RESULT = gtk_h.gdk_pixbuf_get_bits_per_sample(handle());
        return RESULT;
    }
    
    /**
     * Returns the length of the pixel data, in bytes.
     */
    public long getByteLength() {
        var RESULT = gtk_h.gdk_pixbuf_get_byte_length(handle());
        return RESULT;
    }
    
    /**
     * Queries the color space of a pixbuf.
     */
    public Colorspace getColorspace() {
        var RESULT = gtk_h.gdk_pixbuf_get_colorspace(handle());
        return Colorspace.fromValue(RESULT);
    }
    
    /**
     * Queries whether a pixbuf has an alpha channel (opacity information).
     */
    public boolean getHasAlpha() {
        var RESULT = gtk_h.gdk_pixbuf_get_has_alpha(handle());
        return (RESULT != 0);
    }
    
    /**
     * Queries the height of a pixbuf.
     */
    public int getHeight() {
        var RESULT = gtk_h.gdk_pixbuf_get_height(handle());
        return RESULT;
    }
    
    /**
     * Queries the number of channels of a pixbuf.
     */
    public int getNChannels() {
        var RESULT = gtk_h.gdk_pixbuf_get_n_channels(handle());
        return RESULT;
    }
    
    /**
     * Looks up @key in the list of options that may have been attached to the
     * @pixbuf when it was loaded, or that may have been attached by another
     * function using gdk_pixbuf_set_option().
     * 
     * For instance, the ANI loader provides "Title" and "Artist" options.
     * The ICO, XBM, and XPM loaders provide "x_hot" and "y_hot" hot-spot
     * options for cursor definitions. The PNG loader provides the tEXt ancillary
     * chunk key/value pairs as options. Since 2.12, the TIFF and JPEG loaders
     * return an "orientation" option string that corresponds to the embedded
     * TIFF/Exif orientation tag (if present). Since 2.32, the TIFF loader sets
     * the "multipage" option string to "yes" when a multi-page TIFF is loaded.
     * Since 2.32 the JPEG and PNG loaders set "x-dpi" and "y-dpi" if the file
     * contains image density information in dots per inch.
     * Since 2.36.6, the JPEG loader sets the "comment" option with the comment
     * EXIF tag.
     */
    public java.lang.String getOption(java.lang.String key) {
        var RESULT = gtk_h.gdk_pixbuf_get_option(handle(), Interop.allocateNativeString(key).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns a `GHashTable` with a list of all the options that may have been
     * attached to the `pixbuf` when it was loaded, or that may have been
     * attached by another function using [method@GdkPixbuf.Pixbuf.set_option].
     */
    public org.gtk.glib.HashTable getOptions() {
        var RESULT = gtk_h.gdk_pixbuf_get_options(handle());
        return new org.gtk.glib.HashTable(References.get(RESULT, false));
    }
    
    /**
     * Queries the rowstride of a pixbuf, which is the number of bytes between
     * the start of a row and the start of the next row.
     */
    public int getRowstride() {
        var RESULT = gtk_h.gdk_pixbuf_get_rowstride(handle());
        return RESULT;
    }
    
    /**
     * Queries the width of a pixbuf.
     */
    public int getWidth() {
        var RESULT = gtk_h.gdk_pixbuf_get_width(handle());
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf which represents a sub-region of `src_pixbuf`.
     * 
     * The new pixbuf shares its pixels with the original pixbuf, so
     * writing to one affects both.  The new pixbuf holds a reference to
     * `src_pixbuf`, so `src_pixbuf` will not be finalized until the new
     * pixbuf is finalized.
     * 
     * Note that if `src_pixbuf` is read-only, this function will force it
     * to be mutable.
     */
    public Pixbuf newSubpixbuf(int srcX, int srcY, int width, int height) {
        var RESULT = gtk_h.gdk_pixbuf_new_subpixbuf(handle(), srcX, srcY, width, height);
        return new Pixbuf(References.get(RESULT, true));
    }
    
    /**
     * Provides a #GBytes buffer containing the raw pixel data; the data
     * must not be modified.
     * 
     * This function allows skipping the implicit copy that must be made
     * if gdk_pixbuf_get_pixels() is called on a read-only pixbuf.
     */
    public org.gtk.glib.Bytes readPixelBytes() {
        var RESULT = gtk_h.gdk_pixbuf_read_pixel_bytes(handle());
        return new org.gtk.glib.Bytes(References.get(RESULT, true));
    }
    
    /**
     * Removes the key/value pair option attached to a `GdkPixbuf`.
     */
    public boolean removeOption(java.lang.String key) {
        var RESULT = gtk_h.gdk_pixbuf_remove_option(handle(), Interop.allocateNativeString(key).handle());
        return (RESULT != 0);
    }
    
    /**
     * Rotates a pixbuf by a multiple of 90 degrees, and returns the
     * result in a new pixbuf.
     * 
     * If `angle` is 0, this function will return a copy of `src`.
     */
    public Pixbuf rotateSimple(PixbufRotation angle) {
        var RESULT = gtk_h.gdk_pixbuf_rotate_simple(handle(), angle.getValue());
        return new Pixbuf(References.get(RESULT, true));
    }
    
    /**
     * Modifies saturation and optionally pixelates `src`, placing the result in
     * `dest`.
     * 
     * The `src` and `dest` pixbufs must have the same image format, size, and
     * rowstride.
     * 
     * The `src` and `dest` arguments may be the same pixbuf with no ill effects.
     * 
     * If `saturation` is 1.0 then saturation is not changed. If it's less than 1.0,
     * saturation is reduced (the image turns toward grayscale); if greater than
     * 1.0, saturation is increased (the image gets more vivid colors).
     * 
     * If `pixelate` is `TRUE`, then pixels are faded in a checkerboard pattern to
     * create a pixelated image.
     */
    public void saturateAndPixelate(Pixbuf dest, float saturation, boolean pixelate) {
        gtk_h.gdk_pixbuf_saturate_and_pixelate(handle(), dest.handle(), saturation, pixelate ? 1 : 0);
    }
    
    /**
     * Vector version of `gdk_pixbuf_save_to_callback()`.
     * 
     * Saves pixbuf to a callback in format @type, which is currently "jpeg",
     * "png", "tiff", "ico" or "bmp".
     * 
     * If @error is set, `FALSE` will be returned.
     * 
     * See [method@GdkPixbuf.Pixbuf.save_to_callback] for more details.
     */
    public boolean saveToCallbackv(PixbufSaveFunc saveFunc, java.lang.String type, java.lang.String[] optionKeys, java.lang.String[] optionValues) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = gtk_h.gdk_pixbuf_save_to_callbackv(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbPixbufSaveFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, long.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(saveFunc.hashCode(), saveFunc)), Interop.allocateNativeString(type).handle(), Interop.allocateNativeArray(optionKeys).handle(), Interop.allocateNativeArray(optionValues).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return (RESULT != 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Saves `pixbuf` to an output stream.
     * 
     * Supported file formats are currently "jpeg", "tiff", "png", "ico" or
     * "bmp".
     * 
     * See [method@GdkPixbuf.Pixbuf.save_to_stream] for more details.
     */
    public boolean saveToStreamv(org.gtk.gio.OutputStream stream, java.lang.String type, java.lang.String[] optionKeys, java.lang.String[] optionValues, org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_pixbuf_save_to_streamv(handle(), stream.handle(), Interop.allocateNativeString(type).handle(), Interop.allocateNativeArray(optionKeys).handle(), Interop.allocateNativeArray(optionValues).handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Saves `pixbuf` to an output stream asynchronously.
     * 
     * For more details see gdk_pixbuf_save_to_streamv(), which is the synchronous
     * version of this function.
     * 
     * When the operation is finished, `callback` will be called in the main thread.
     * 
     * You can then call gdk_pixbuf_save_to_stream_finish() to get the result of
     * the operation.
     */
    public void saveToStreamvAsync(org.gtk.gio.OutputStream stream, java.lang.String type, java.lang.String[] optionKeys, java.lang.String[] optionValues, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_pixbuf_save_to_streamv_async(handle(), stream.handle(), Interop.allocateNativeString(type).handle(), Interop.allocateNativeArray(optionKeys).handle(), Interop.allocateNativeArray(optionValues).handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Vector version of `gdk_pixbuf_save()`.
     * 
     * Saves pixbuf to a file in `type`, which is currently "jpeg", "png", "tiff", "ico" or "bmp".
     * 
     * If @error is set, `FALSE` will be returned.
     * 
     * See [method@GdkPixbuf.Pixbuf.save] for more details.
     */
    public boolean savev(java.lang.String filename, java.lang.String type, java.lang.String[] optionKeys, java.lang.String[] optionValues) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_pixbuf_savev(handle(), Interop.allocateNativeString(filename).handle(), Interop.allocateNativeString(type).handle(), Interop.allocateNativeArray(optionKeys).handle(), Interop.allocateNativeArray(optionValues).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Creates a transformation of the source image @src by scaling by
     * @scale_x and @scale_y then translating by @offset_x and @offset_y,
     * then renders the rectangle (@dest_x, @dest_y, @dest_width,
     * @dest_height) of the resulting image onto the destination image
     * replacing the previous contents.
     * 
     * Try to use gdk_pixbuf_scale_simple() first; this function is
     * the industrial-strength power tool you can fall back to, if
     * gdk_pixbuf_scale_simple() isn't powerful enough.
     * 
     * If the source rectangle overlaps the destination rectangle on the
     * same pixbuf, it will be overwritten during the scaling which
     * results in rendering artifacts.
     */
    public void scale(Pixbuf dest, int destX, int destY, int destWidth, int destHeight, double offsetX, double offsetY, double scaleX, double scaleY, InterpType interpType) {
        gtk_h.gdk_pixbuf_scale(handle(), dest.handle(), destX, destY, destWidth, destHeight, offsetX, offsetY, scaleX, scaleY, interpType.getValue());
    }
    
    /**
     * Create a new pixbuf containing a copy of `src` scaled to
     * `dest_width` x `dest_height`.
     * 
     * This function leaves `src` unaffected.
     * 
     * The `interp_type` should be `GDK_INTERP_NEAREST` if you want maximum
     * speed (but when scaling down `GDK_INTERP_NEAREST` is usually unusably
     * ugly). The default `interp_type` should be `GDK_INTERP_BILINEAR` which
     * offers reasonable quality and speed.
     * 
     * You can scale a sub-portion of `src` by creating a sub-pixbuf
     * pointing into `src`; see [method@GdkPixbuf.Pixbuf.new_subpixbuf].
     * 
     * If `dest_width` and `dest_height` are equal to the width and height of
     * `src`, this function will return an unscaled copy of `src`.
     * 
     * For more complicated scaling/alpha blending see [method@GdkPixbuf.Pixbuf.scale]
     * and [method@GdkPixbuf.Pixbuf.composite].
     */
    public Pixbuf scaleSimple(int destWidth, int destHeight, InterpType interpType) {
        var RESULT = gtk_h.gdk_pixbuf_scale_simple(handle(), destWidth, destHeight, interpType.getValue());
        return new Pixbuf(References.get(RESULT, true));
    }
    
    /**
     * Attaches a key/value pair as an option to a `GdkPixbuf`.
     * 
     * If `key` already exists in the list of options attached to the `pixbuf`,
     * the new value is ignored and `FALSE` is returned.
     */
    public boolean setOption(java.lang.String key, java.lang.String value) {
        var RESULT = gtk_h.gdk_pixbuf_set_option(handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(value).handle());
        return (RESULT != 0);
    }
    
    /**
     * Calculates the rowstride that an image created with those values would
     * have.
     * 
     * This function is useful for front-ends and backends that want to check
     * image values without needing to create a `GdkPixbuf`.
     */
    public static int calculateRowstride(Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height) {
        var RESULT = gtk_h.gdk_pixbuf_calculate_rowstride(colorspace.getValue(), hasAlpha ? 1 : 0, bitsPerSample, width, height);
        return RESULT;
    }
    
    /**
     * Asynchronously parses an image file far enough to determine its
     * format and size.
     * 
     * For more details see gdk_pixbuf_get_file_info(), which is the synchronous
     * version of this function.
     * 
     * When the operation is finished, @callback will be called in the
     * main thread. You can then call gdk_pixbuf_get_file_info_finish() to
     * get the result of the operation.
     */
    public static void getFileInfoAsync(java.lang.String filename, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_pixbuf_get_file_info_async(Interop.allocateNativeString(filename).handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Obtains the available information about the image formats supported
     * by GdkPixbuf.
     */
    public static org.gtk.glib.SList getFormats() {
        var RESULT = gtk_h.gdk_pixbuf_get_formats();
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Initalizes the gdk-pixbuf loader modules referenced by the `loaders.cache`
     * file present inside that directory.
     * 
     * This is to be used by applications that want to ship certain loaders
     * in a different location from the system ones.
     * 
     * This is needed when the OS or runtime ships a minimal number of loaders
     * so as to reduce the potential attack surface of carefully crafted image
     * files, especially for uncommon file types. Applications that require
     * broader image file types coverage, such as image viewers, would be
     * expected to ship the gdk-pixbuf modules in a separate location, bundled
     * with the application in a separate directory from the OS or runtime-
     * provided modules.
     */
    public static boolean initModules(java.lang.String path) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_pixbuf_init_modules(Interop.allocateNativeString(path).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Creates a new pixbuf by asynchronously loading an image from an input stream.
     * 
     * For more details see gdk_pixbuf_new_from_stream(), which is the synchronous
     * version of this function.
     * 
     * When the operation is finished, @callback will be called in the main thread.
     * You can then call gdk_pixbuf_new_from_stream_finish() to get the result of
     * the operation.
     */
    public static void newFromStreamAsync(org.gtk.gio.InputStream stream, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_pixbuf_new_from_stream_async(stream.handle(), cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a new pixbuf by asynchronously loading an image from an input stream.
     * 
     * For more details see gdk_pixbuf_new_from_stream_at_scale(), which is the synchronous
     * version of this function.
     * 
     * When the operation is finished, @callback will be called in the main thread.
     * You can then call gdk_pixbuf_new_from_stream_finish() to get the result of the operation.
     */
    public static void newFromStreamAtScaleAsync(org.gtk.gio.InputStream stream, int width, int height, boolean preserveAspectRatio, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_pixbuf_new_from_stream_at_scale_async(stream.handle(), width, height, preserveAspectRatio ? 1 : 0, cancellable.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous pixbuf save operation started with
     * gdk_pixbuf_save_to_stream_async().
     */
    public static boolean saveToStreamFinish(org.gtk.gio.AsyncResult asyncResult) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_pixbuf_save_to_stream_finish(asyncResult.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
}
