package org.gtk.gdkpixbuf;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
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

    public Pixbuf(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Pixbuf */
    public static Pixbuf castFrom(org.gtk.gobject.Object gobject) {
        return new Pixbuf(gobject.getReference());
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
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_new(colorspace.getValue(), hasAlpha ? 1 : 0, bitsPerSample, width, height), true));
    }
    
    /**
     * Creates a new #GdkPixbuf out of in-memory readonly image data.
     * 
     * Currently only RGB images with 8 bits per sample are supported.
     * 
     * This is the `GBytes` variant of gdk_pixbuf_new_from_data(), useful
     * for language bindings.
     */
    public Pixbuf(org.gtk.glib.Bytes data, Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height, int rowstride) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_new_from_bytes(data.HANDLE(), colorspace.getValue(), hasAlpha ? 1 : 0, bitsPerSample, width, height, rowstride), true));
    }
    
    /**
     * Creates a new pixbuf by parsing XPM data in memory.
     * 
     * This data is commonly the result of including an XPM file into a
     * program's C source.
     */
    public Pixbuf(java.lang.String[] data) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_new_from_xpm_data(Interop.allocateNativeArray(data)), true));
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_add_alpha(HANDLE(), substituteColor ? 1 : 0, r, g, b);
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_apply_embedded_orientation(HANDLE());
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_composite(HANDLE(), dest.HANDLE(), destX, destY, destWidth, destHeight, offsetX, offsetY, scaleX, scaleY, interpType.getValue(), overallAlpha);
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_composite_color(HANDLE(), dest.HANDLE(), destX, destY, destWidth, destHeight, offsetX, offsetY, scaleX, scaleY, interpType.getValue(), overallAlpha, checkX, checkY, checkSize, color1, color2);
    }
    
    /**
     * Creates a new pixbuf by scaling `src` to `dest_width` x `dest_height`
     * and alpha blending the result with a checkboard of colors `color1`
     * and `color2`.
     */
    public Pixbuf compositeColorSimple(int destWidth, int destHeight, InterpType interpType, int overallAlpha, int checkSize, int color1, int color2) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_composite_color_simple(HANDLE(), destWidth, destHeight, interpType.getValue(), overallAlpha, checkSize, color1, color2);
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_copy(HANDLE());
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_copy_area(HANDLE(), srcX, srcY, width, height, destPixbuf.HANDLE(), destX, destY);
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_copy_options(HANDLE(), destPixbuf.HANDLE());
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_fill(HANDLE(), pixel);
    }
    
    /**
     * Flips a pixbuf horizontally or vertically and returns the
     * result in a new pixbuf.
     */
    public Pixbuf flip(boolean horizontal) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_flip(HANDLE(), horizontal ? 1 : 0);
        return new Pixbuf(References.get(RESULT, true));
    }
    
    /**
     * Queries the number of bits per color sample in a pixbuf.
     */
    public int getBitsPerSample() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_get_bits_per_sample(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the length of the pixel data, in bytes.
     */
    public long getByteLength() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_get_byte_length(HANDLE());
        return RESULT;
    }
    
    /**
     * Queries the color space of a pixbuf.
     */
    public Colorspace getColorspace() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_get_colorspace(HANDLE());
        return Colorspace.fromValue(RESULT);
    }
    
    /**
     * Queries whether a pixbuf has an alpha channel (opacity information).
     */
    public boolean getHasAlpha() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_get_has_alpha(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Queries the height of a pixbuf.
     */
    public int getHeight() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_get_height(HANDLE());
        return RESULT;
    }
    
    /**
     * Queries the number of channels of a pixbuf.
     */
    public int getNChannels() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_get_n_channels(HANDLE());
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_get_option(HANDLE(), Interop.allocateNativeString(key).HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns a `GHashTable` with a list of all the options that may have been
     * attached to the `pixbuf` when it was loaded, or that may have been
     * attached by another function using [method@GdkPixbuf.Pixbuf.set_option].
     */
    public org.gtk.glib.HashTable getOptions() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_get_options(HANDLE());
        return new org.gtk.glib.HashTable(References.get(RESULT, false));
    }
    
    /**
     * Queries the rowstride of a pixbuf, which is the number of bytes between
     * the start of a row and the start of the next row.
     */
    public int getRowstride() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_get_rowstride(HANDLE());
        return RESULT;
    }
    
    /**
     * Queries the width of a pixbuf.
     */
    public int getWidth() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_get_width(HANDLE());
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_new_subpixbuf(HANDLE(), srcX, srcY, width, height);
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_read_pixel_bytes(HANDLE());
        return new org.gtk.glib.Bytes(References.get(RESULT, true));
    }
    
    /**
     * Removes the key/value pair option attached to a `GdkPixbuf`.
     */
    public boolean removeOption(java.lang.String key) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_remove_option(HANDLE(), Interop.allocateNativeString(key).HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Rotates a pixbuf by a multiple of 90 degrees, and returns the
     * result in a new pixbuf.
     * 
     * If `angle` is 0, this function will return a copy of `src`.
     */
    public Pixbuf rotateSimple(PixbufRotation angle) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_rotate_simple(HANDLE(), angle.getValue());
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_saturate_and_pixelate(HANDLE(), dest.HANDLE(), saturation, pixelate ? 1 : 0);
    }
    
    /**
     * Saves `pixbuf` to an output stream.
     * 
     * Supported file formats are currently "jpeg", "tiff", "png", "ico" or
     * "bmp".
     * 
     * See [method@GdkPixbuf.Pixbuf.save_to_stream] for more details.
     */
    public boolean saveToStreamv(org.gtk.gio.OutputStream stream, java.lang.String type, java.lang.String[] optionKeys, java.lang.String[] optionValues, org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_save_to_streamv(HANDLE(), stream.HANDLE(), Interop.allocateNativeString(type).HANDLE(), Interop.allocateNativeArray(optionKeys), Interop.allocateNativeArray(optionValues), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
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
    public boolean savev(java.lang.String filename, java.lang.String type, java.lang.String[] optionKeys, java.lang.String[] optionValues) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_savev(HANDLE(), Interop.allocateNativeString(filename).HANDLE(), Interop.allocateNativeString(type).HANDLE(), Interop.allocateNativeArray(optionKeys), Interop.allocateNativeArray(optionValues), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_scale(HANDLE(), dest.HANDLE(), destX, destY, destWidth, destHeight, offsetX, offsetY, scaleX, scaleY, interpType.getValue());
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_scale_simple(HANDLE(), destWidth, destHeight, interpType.getValue());
        return new Pixbuf(References.get(RESULT, true));
    }
    
    /**
     * Attaches a key/value pair as an option to a `GdkPixbuf`.
     * 
     * If `key` already exists in the list of options attached to the `pixbuf`,
     * the new value is ignored and `FALSE` is returned.
     */
    public boolean setOption(java.lang.String key, java.lang.String value) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_pixbuf_set_option(HANDLE(), Interop.allocateNativeString(key).HANDLE(), Interop.allocateNativeString(value).HANDLE());
        return (RESULT != 0);
    }
    
}
