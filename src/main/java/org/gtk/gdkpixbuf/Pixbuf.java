package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A pixel buffer.
 * <p>
 * {@code GdkPixbuf} contains information about an image's pixel data,
 * its color space, bits per sample, width and height, and the
 * rowstride (the number of bytes between the start of one row
 * and the start of the next).
 * <p>
 * <strong>Creating new `GdkPixbuf`</strong><br/>
 * The most basic way to create a pixbuf is to wrap an existing pixel
 * buffer with a {@link Pixbuf} instance. You can use the
 * {@code GdkPixbuf.Pixbuf.new_from_data`} function to do this.
 * <p>
 * Every time you create a new {@code GdkPixbuf} instance for some data, you
 * will need to specify the destroy notification function that will be
 * called when the data buffer needs to be freed; this will happen when
 * a {@code GdkPixbuf} is finalized by the reference counting functions. If
 * you have a chunk of static data compiled into your application, you
 * can pass in {@code NULL} as the destroy notification function so that the
 * data will not be freed.
 * <p>
 * The {@code GdkPixbuf.Pixbuf.new`} constructor function can be used
 * as a convenience to create a pixbuf with an empty buffer; this is
 * equivalent to allocating a data buffer using {@code malloc()} and then
 * wrapping it with {@code gdk_pixbuf_new_from_data()}. The {@code gdk_pixbuf_new()}
 * function will compute an optimal rowstride so that rendering can be
 * performed with an efficient algorithm.
 * <p>
 * As a special case, you can use the {@code GdkPixbuf.Pixbuf.new_from_xpm_data`}
 * function to create a pixbuf from inline XPM image data.
 * <p>
 * You can also copy an existing pixbuf with the {@code Pixbuf#copy}
 * function. This is not the same as just acquiring a reference to
 * the old pixbuf instance: the copy function will actually duplicate
 * the pixel data in memory and create a new {@link Pixbuf} instance
 * for it.
 * <p>
 * <strong>Reference counting</strong><br/>
 * {@code GdkPixbuf} structures are reference counted. This means that an
 * application can share a single pixbuf among many parts of the
 * code. When a piece of the program needs to use a pixbuf, it should
 * acquire a reference to it by calling {@code g_object_ref()}; when it no
 * longer needs the pixbuf, it should release the reference it acquired
 * by calling {@code g_object_unref()}. The resources associated with a
 * {@code GdkPixbuf} will be freed when its reference count drops to zero.
 * Newly-created {@code GdkPixbuf} instances start with a reference count
 * of one.
 * <p>
 * <strong>Image Data</strong><br/>
 * Image data in a pixbuf is stored in memory in an uncompressed,
 * packed format. Rows in the image are stored top to bottom, and
 * in each row pixels are stored from left to right.
 * <p>
 * There may be padding at the end of a row.
 * <p>
 * The "rowstride" value of a pixbuf, as returned by {@code GdkPixbuf.Pixbuf.get_rowstride`},
 * indicates the number of bytes between rows.
 * <p>
 * <strong>NOTE</strong>: If you are copying raw pixbuf data with {@code memcpy()} note that the
 * last row in the pixbuf may not be as wide as the full rowstride, but rather
 * just as wide as the pixel data needs to be; that is: it is unsafe to do
 * {@code memcpy (dest, pixels, rowstride * height)} to copy a whole pixbuf. Use
 * {@link Pixbuf#copy} instead, or compute the width in bytes of the
 * last row as:
 * <pre>{@code c
 * last_row = width * ((n_channels * bits_per_sample + 7) / 8);
 * }</pre>
 * <p>
 * The same rule applies when iterating over each row of a {@code GdkPixbuf} pixels
 * array.
 * <p>
 * The following code illustrates a simple {@code put_pixel()}
 * function for RGB pixbufs with 8 bits per channel with an alpha
 * channel.
 * <pre>{@code c
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
 * }</pre>
 * <p>
 * <strong>Loading images</strong><br/>
 * The {@code GdkPixBuf} class provides a simple mechanism for loading
 * an image from a file in synchronous and asynchronous fashion.
 * <p>
 * For GUI applications, it is recommended to use the asynchronous
 * stream API to avoid blocking the control flow of the application.
 * <p>
 * Additionally, {@code GdkPixbuf} provides the {@code PixbufLoader`}
 * API for progressive image loading.
 * <p>
 * <strong>Saving images</strong><br/>
 * The {@code GdkPixbuf} class provides methods for saving image data in
 * a number of file formats. The formatted data can be written to a
 * file or to a memory buffer. {@code GdkPixbuf} can also call a user-defined
 * callback on the data, which allows to e.g. write the image
 * to a socket or store it in a database.
 */
public class Pixbuf extends org.gtk.gobject.GObject implements org.gtk.gio.Icon, org.gtk.gio.LoadableIcon {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbuf";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Pixbuf proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Pixbuf(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Pixbuf> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Pixbuf(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.gdkpixbuf.Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_new.invokeExact(
                    colorspace.getValue(),
                    Marshal.booleanToInteger.marshal(hasAlpha, null).intValue(),
                    bitsPerSample,
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GdkPixbuf} structure and allocates a buffer for it.
     * <p>
     * If the allocation of the buffer failed, this function will return {@code NULL}.
     * <p>
     * The buffer has an optimal rowstride. Note that the buffer is not cleared;
     * you will have to fill it completely yourself.
     * @param colorspace Color space for image
     * @param hasAlpha Whether the image should have transparency information
     * @param bitsPerSample Number of bits per color sample
     * @param width Width of image in pixels, must be &gt; 0
     * @param height Height of image in pixels, must be &gt; 0
     */
    public Pixbuf(org.gtk.gdkpixbuf.Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height) {
        super(constructNew(colorspace, hasAlpha, bitsPerSample, width, height), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromBytes(org.gtk.glib.Bytes data, org.gtk.gdkpixbuf.Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height, int rowstride) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_new_from_bytes.invokeExact(
                    data.handle(),
                    colorspace.getValue(),
                    Marshal.booleanToInteger.marshal(hasAlpha, null).intValue(),
                    bitsPerSample,
                    width,
                    height,
                    rowstride);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Pixbuf} out of in-memory readonly image data.
     * <p>
     * Currently only RGB images with 8 bits per sample are supported.
     * <p>
     * This is the {@code GBytes} variant of gdk_pixbuf_new_from_data(), useful
     * for language bindings.
     * @param data Image data in 8-bit/sample packed format inside a {@link org.gtk.glib.Bytes}
     * @param colorspace Colorspace for the image data
     * @param hasAlpha Whether the data has an opacity channel
     * @param bitsPerSample Number of bits per sample
     * @param width Width of the image in pixels, must be &gt; 0
     * @param height Height of the image in pixels, must be &gt; 0
     * @param rowstride Distance in bytes between row starts
     * @return A newly-created pixbuf
     */
    public static Pixbuf newFromBytes(org.gtk.glib.Bytes data, org.gtk.gdkpixbuf.Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height, int rowstride) {
        var RESULT = constructNewFromBytes(data, colorspace, hasAlpha, bitsPerSample, width, height, rowstride);
        return (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromData(byte[] data, org.gtk.gdkpixbuf.Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height, int rowstride, @Nullable org.gtk.gdkpixbuf.PixbufDestroyNotify destroyFn) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_new_from_data.invokeExact(
                    Interop.allocateNativeArray(data, false),
                    colorspace.getValue(),
                    Marshal.booleanToInteger.marshal(hasAlpha, null).intValue(),
                    bitsPerSample,
                    width,
                    height,
                    rowstride,
                    (Addressable) (destroyFn == null ? MemoryAddress.NULL : (Addressable) destroyFn.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Pixbuf} out of in-memory image data.
     * <p>
     * Currently only RGB images with 8 bits per sample are supported.
     * <p>
     * Since you are providing a pre-allocated pixel buffer, you must also
     * specify a way to free that data.  This is done with a function of
     * type {@code GdkPixbufDestroyNotify}.  When a pixbuf created with is
     * finalized, your destroy notification function will be called, and
     * it is its responsibility to free the pixel array.
     * <p>
     * See also: {@link Pixbuf#newFromBytes}
     * @param data Image data in 8-bit/sample packed format
     * @param colorspace Colorspace for the image data
     * @param hasAlpha Whether the data has an opacity channel
     * @param bitsPerSample Number of bits per sample
     * @param width Width of the image in pixels, must be &gt; 0
     * @param height Height of the image in pixels, must be &gt; 0
     * @param rowstride Distance in bytes between row starts
     * @param destroyFn Function used to free the data when the pixbuf's reference count
     * drops to zero, or {@code null} if the data should not be freed
     * @return A newly-created pixbuf
     */
    public static Pixbuf newFromData(byte[] data, org.gtk.gdkpixbuf.Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height, int rowstride, @Nullable org.gtk.gdkpixbuf.PixbufDestroyNotify destroyFn) {
        var RESULT = constructNewFromData(data, colorspace, hasAlpha, bitsPerSample, width, height, rowstride, destroyFn);
        return (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromFile(java.lang.String filename) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_new_from_file.invokeExact(
                    Marshal.stringToAddress.marshal(filename, null),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf by loading an image from a file.
     * <p>
     * The file format is detected automatically.
     * <p>
     * If {@code NULL} is returned, then {@code error} will be set. Possible errors are:
     * <ul>
     * <li>the file could not be opened
     * <li>there is no loader for the file's format
     * <li>there is not enough memory to allocate the image buffer
     * <li>the image buffer contains invalid data
     * </ul>
     * <p>
     * The error domains are {@code GDK_PIXBUF_ERROR} and {@code G_FILE_ERROR}.
     * @param filename Name of file to load, in the GLib file
     *   name encoding
     * @return A newly-created pixbuf
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static Pixbuf newFromFile(java.lang.String filename) throws GErrorException {
        var RESULT = constructNewFromFile(filename);
        return (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromFileAtScale(java.lang.String filename, int width, int height, boolean preserveAspectRatio) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_new_from_file_at_scale.invokeExact(
                    Marshal.stringToAddress.marshal(filename, null),
                    width,
                    height,
                    Marshal.booleanToInteger.marshal(preserveAspectRatio, null).intValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf by loading an image from a file.
     * <p>
     * The file format is detected automatically.
     * <p>
     * If {@code NULL} is returned, then {@code error} will be set. Possible errors are:
     * <ul>
     * <li>the file could not be opened
     * <li>there is no loader for the file's format
     * <li>there is not enough memory to allocate the image buffer
     * <li>the image buffer contains invalid data
     * </ul>
     * <p>
     * The error domains are {@code GDK_PIXBUF_ERROR} and {@code G_FILE_ERROR}.
     * <p>
     * The image will be scaled to fit in the requested size, optionally preserving
     * the image's aspect ratio.
     * <p>
     * When preserving the aspect ratio, a {@code width} of -1 will cause the image
     * to be scaled to the exact given height, and a {@code height} of -1 will cause
     * the image to be scaled to the exact given width. When not preserving
     * aspect ratio, a {@code width} or {@code height} of -1 means to not scale the image
     * at all in that dimension. Negative values for {@code width} and {@code height} are
     * allowed since 2.8.
     * @param filename Name of file to load, in the GLib file
     *     name encoding
     * @param width The width the image should have or -1 to not constrain the width
     * @param height The height the image should have or -1 to not constrain the height
     * @param preserveAspectRatio {@code TRUE} to preserve the image's aspect ratio
     * @return A newly-created pixbuf
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static Pixbuf newFromFileAtScale(java.lang.String filename, int width, int height, boolean preserveAspectRatio) throws GErrorException {
        var RESULT = constructNewFromFileAtScale(filename, width, height, preserveAspectRatio);
        return (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromFileAtSize(java.lang.String filename, int width, int height) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_new_from_file_at_size.invokeExact(
                    Marshal.stringToAddress.marshal(filename, null),
                    width,
                    height,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf by loading an image from a file.
     * <p>
     * The file format is detected automatically.
     * <p>
     * If {@code NULL} is returned, then {@code error} will be set. Possible errors are:
     * <ul>
     * <li>the file could not be opened
     * <li>there is no loader for the file's format
     * <li>there is not enough memory to allocate the image buffer
     * <li>the image buffer contains invalid data
     * </ul>
     * <p>
     * The error domains are {@code GDK_PIXBUF_ERROR} and {@code G_FILE_ERROR}.
     * <p>
     * The image will be scaled to fit in the requested size, preserving
     * the image's aspect ratio. Note that the returned pixbuf may be smaller
     * than {@code width} x {@code height}, if the aspect ratio requires it. To load
     * and image at the requested size, regardless of aspect ratio, use
     * {@link Pixbuf#newFromFileAtScale}.
     * @param filename Name of file to load, in the GLib file
     *     name encoding
     * @param width The width the image should have or -1 to not constrain the width
     * @param height The height the image should have or -1 to not constrain the height
     * @return A newly-created pixbuf
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static Pixbuf newFromFileAtSize(java.lang.String filename, int width, int height) throws GErrorException {
        var RESULT = constructNewFromFileAtSize(filename, width, height);
        return (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromInline(int dataLength, byte[] data, boolean copyPixels) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_new_from_inline.invokeExact(
                    dataLength,
                    Interop.allocateNativeArray(data, false),
                    Marshal.booleanToInteger.marshal(copyPixels, null).intValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GdkPixbuf} from a flat representation that is suitable for
     * storing as inline data in a program.
     * <p>
     * This is useful if you want to ship a program with images, but don't want
     * to depend on any external files.
     * <p>
     * GdkPixbuf ships with a program called {@code gdk-pixbuf-csource}, which allows
     * for conversion of {@code GdkPixbuf}s into such a inline representation.
     * <p>
     * In almost all cases, you should pass the {@code --raw} option to
     * {@code gdk-pixbuf-csource}. A sample invocation would be:
     * <pre>{@code 
     * gdk-pixbuf-csource --raw --name=myimage_inline myimage.png
     * }</pre>
     * <p>
     * For the typical case where the inline pixbuf is read-only static data,
     * you don't need to copy the pixel data unless you intend to write to
     * it, so you can pass {@code FALSE} for {@code copy_pixels}. If you pass {@code --rle} to
     * {@code gdk-pixbuf-csource}, a copy will be made even if {@code copy_pixels} is {@code FALSE},
     * so using this option is generally a bad idea.
     * <p>
     * If you create a pixbuf from const inline data compiled into your
     * program, it's probably safe to ignore errors and disable length checks,
     * since things will always succeed:
     * <pre>{@code c
     * pixbuf = gdk_pixbuf_new_from_inline (-1, myimage_inline, FALSE, NULL);
     * }</pre>
     * <p>
     * For non-const inline data, you could get out of memory. For untrusted
     * inline data located at runtime, you could have corrupt inline data in
     * addition.
     * @param dataLength Length in bytes of the {@code data} argument or -1 to
     *   disable length checks
     * @param data Byte data containing a
     *   serialized {@code GdkPixdata} structure
     * @param copyPixels Whether to copy the pixel data, or use direct pointers
     *   {@code data} for the resulting pixbuf
     * @return A newly-created pixbuf
     * @throws GErrorException See {@link org.gtk.glib.Error}
     * @deprecated Use {@code GResource} instead.
     */
    @Deprecated
    public static Pixbuf newFromInline(int dataLength, byte[] data, boolean copyPixels) throws GErrorException {
        var RESULT = constructNewFromInline(dataLength, data, copyPixels);
        return (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromResource(java.lang.String resourcePath) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_new_from_resource.invokeExact(
                    Marshal.stringToAddress.marshal(resourcePath, null),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf by loading an image from an resource.
     * <p>
     * The file format is detected automatically. If {@code NULL} is returned, then
     * {@code error} will be set.
     * @param resourcePath the path of the resource file
     * @return A newly-created pixbuf
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static Pixbuf newFromResource(java.lang.String resourcePath) throws GErrorException {
        var RESULT = constructNewFromResource(resourcePath);
        return (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromResourceAtScale(java.lang.String resourcePath, int width, int height, boolean preserveAspectRatio) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_new_from_resource_at_scale.invokeExact(
                    Marshal.stringToAddress.marshal(resourcePath, null),
                    width,
                    height,
                    Marshal.booleanToInteger.marshal(preserveAspectRatio, null).intValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf by loading an image from an resource.
     * <p>
     * The file format is detected automatically. If {@code NULL} is returned, then
     * {@code error} will be set.
     * <p>
     * The image will be scaled to fit in the requested size, optionally
     * preserving the image's aspect ratio. When preserving the aspect ratio,
     * a {@code width} of -1 will cause the image to be scaled to the exact given
     * height, and a {@code height} of -1 will cause the image to be scaled to the
     * exact given width. When not preserving aspect ratio, a {@code width} or
     * {@code height} of -1 means to not scale the image at all in that dimension.
     * <p>
     * The stream is not closed.
     * @param resourcePath the path of the resource file
     * @param width The width the image should have or -1 to not constrain the width
     * @param height The height the image should have or -1 to not constrain the height
     * @param preserveAspectRatio {@code TRUE} to preserve the image's aspect ratio
     * @return A newly-created pixbuf
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static Pixbuf newFromResourceAtScale(java.lang.String resourcePath, int width, int height, boolean preserveAspectRatio) throws GErrorException {
        var RESULT = constructNewFromResourceAtScale(resourcePath, width, height, preserveAspectRatio);
        return (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromStream(org.gtk.gio.InputStream stream, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_new_from_stream.invokeExact(
                    stream.handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf by loading an image from an input stream.
     * <p>
     * The file format is detected automatically.
     * <p>
     * If {@code NULL} is returned, then {@code error} will be set.
     * <p>
     * The {@code cancellable} can be used to abort the operation from another thread.
     * If the operation was cancelled, the error {@code G_IO_ERROR_CANCELLED} will be
     * returned. Other possible errors are in the {@code GDK_PIXBUF_ERROR} and
     * {@code G_IO_ERROR} domains.
     * <p>
     * The stream is not closed.
     * @param stream a {@code GInputStream} to load the pixbuf from
     * @param cancellable optional {@code GCancellable} object, {@code NULL} to ignore
     * @return A newly-created pixbuf
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static Pixbuf newFromStream(org.gtk.gio.InputStream stream, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        var RESULT = constructNewFromStream(stream, cancellable);
        return (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromStreamAtScale(org.gtk.gio.InputStream stream, int width, int height, boolean preserveAspectRatio, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_new_from_stream_at_scale.invokeExact(
                    stream.handle(),
                    width,
                    height,
                    Marshal.booleanToInteger.marshal(preserveAspectRatio, null).intValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf by loading an image from an input stream.
     * <p>
     * The file format is detected automatically. If {@code NULL} is returned, then
     * {@code error} will be set. The {@code cancellable} can be used to abort the operation
     * from another thread. If the operation was cancelled, the error
     * {@code G_IO_ERROR_CANCELLED} will be returned. Other possible errors are in
     * the {@code GDK_PIXBUF_ERROR} and {@code G_IO_ERROR} domains.
     * <p>
     * The image will be scaled to fit in the requested size, optionally
     * preserving the image's aspect ratio.
     * <p>
     * When preserving the aspect ratio, a {@code width} of -1 will cause the image to be
     * scaled to the exact given height, and a {@code height} of -1 will cause the image
     * to be scaled to the exact given width. If both {@code width} and {@code height} are
     * given, this function will behave as if the smaller of the two values
     * is passed as -1.
     * <p>
     * When not preserving aspect ratio, a {@code width} or {@code height} of -1 means to not
     * scale the image at all in that dimension.
     * <p>
     * The stream is not closed.
     * @param stream a {@code GInputStream} to load the pixbuf from
     * @param width The width the image should have or -1 to not constrain the width
     * @param height The height the image should have or -1 to not constrain the height
     * @param preserveAspectRatio {@code TRUE} to preserve the image's aspect ratio
     * @param cancellable optional {@code GCancellable} object, {@code NULL} to ignore
     * @return A newly-created pixbuf
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static Pixbuf newFromStreamAtScale(org.gtk.gio.InputStream stream, int width, int height, boolean preserveAspectRatio, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        var RESULT = constructNewFromStreamAtScale(stream, width, height, preserveAspectRatio, cancellable);
        return (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromStreamFinish(org.gtk.gio.AsyncResult asyncResult) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_new_from_stream_finish.invokeExact(
                    asyncResult.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Finishes an asynchronous pixbuf creation operation started with
     * gdk_pixbuf_new_from_stream_async().
     * @param asyncResult a {@code GAsyncResult}
     * @return the newly created pixbuf
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static Pixbuf newFromStreamFinish(org.gtk.gio.AsyncResult asyncResult) throws GErrorException {
        var RESULT = constructNewFromStreamFinish(asyncResult);
        return (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromXpmData(java.lang.String[] data) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_new_from_xpm_data.invokeExact(
                    Interop.allocateNativeArray(data, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf by parsing XPM data in memory.
     * <p>
     * This data is commonly the result of including an XPM file into a
     * program's C source.
     * @param data Pointer to inline XPM data.
     * @return A newly-created pixbuf
     */
    public static Pixbuf newFromXpmData(java.lang.String[] data) {
        var RESULT = constructNewFromXpmData(data);
        return (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Takes an existing pixbuf and adds an alpha channel to it.
     * <p>
     * If the existing pixbuf already had an alpha channel, the channel
     * values are copied from the original; otherwise, the alpha channel
     * is initialized to 255 (full opacity).
     * <p>
     * If {@code substitute_color} is {@code TRUE}, then the color specified by the
     * ({@code r}, {@code g}, {@code b}) arguments will be assigned zero opacity. That is,
     * if you pass {@code (255, 255, 255)} for the substitute color, all white
     * pixels will become fully transparent.
     * <p>
     * If {@code substitute_color} is {@code FALSE}, then the ({@code r}, {@code g}, {@code b}) arguments
     * will be ignored.
     * @param substituteColor Whether to set a color to zero opacity.
     * @param r Red value to substitute.
     * @param g Green value to substitute.
     * @param b Blue value to substitute.
     * @return A newly-created pixbuf
     */
    public org.gtk.gdkpixbuf.Pixbuf addAlpha(boolean substituteColor, byte r, byte g, byte b) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_add_alpha.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(substituteColor, null).intValue(),
                    r,
                    g,
                    b);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Takes an existing pixbuf and checks for the presence of an
     * associated "orientation" option.
     * <p>
     * The orientation option may be provided by the JPEG loader (which
     * reads the exif orientation tag) or the TIFF loader (which reads
     * the TIFF orientation tag, and compensates it for the partial
     * transforms performed by libtiff).
     * <p>
     * If an orientation option/tag is present, the appropriate transform
     * will be performed so that the pixbuf is oriented correctly.
     * @return A newly-created pixbuf
     */
    public @Nullable org.gtk.gdkpixbuf.Pixbuf applyEmbeddedOrientation() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_apply_embedded_orientation.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a transformation of the source image {@code src} by scaling by
     * {@code scale_x} and {@code scale_y} then translating by {@code offset_x} and {@code offset_y}.
     * <p>
     * This gives an image in the coordinates of the destination pixbuf.
     * The rectangle ({@code dest_x}, {@code dest_y}, {@code dest_width}, {@code dest_height})
     * is then alpha blended onto the corresponding rectangle of the
     * original destination image.
     * <p>
     * When the destination rectangle contains parts not in the source
     * image, the data at the edges of the source image is replicated
     * to infinity.
     * <p>
     * <img src="./doc-files/composite.png" alt="">
     * @param dest the {@link Pixbuf} into which to render the results
     * @param destX the left coordinate for region to render
     * @param destY the top coordinate for region to render
     * @param destWidth the width of the region to render
     * @param destHeight the height of the region to render
     * @param offsetX the offset in the X direction (currently rounded to an integer)
     * @param offsetY the offset in the Y direction (currently rounded to an integer)
     * @param scaleX the scale factor in the X direction
     * @param scaleY the scale factor in the Y direction
     * @param interpType the interpolation type for the transformation.
     * @param overallAlpha overall alpha for source image (0..255)
     */
    public void composite(org.gtk.gdkpixbuf.Pixbuf dest, int destX, int destY, int destWidth, int destHeight, double offsetX, double offsetY, double scaleX, double scaleY, org.gtk.gdkpixbuf.InterpType interpType, int overallAlpha) {
        try {
            DowncallHandles.gdk_pixbuf_composite.invokeExact(
                    handle(),
                    dest.handle(),
                    destX,
                    destY,
                    destWidth,
                    destHeight,
                    offsetX,
                    offsetY,
                    scaleX,
                    scaleY,
                    interpType.getValue(),
                    overallAlpha);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a transformation of the source image {@code src} by scaling by
     * {@code scale_x} and {@code scale_y} then translating by {@code offset_x} and {@code offset_y},
     * then alpha blends the rectangle ({@code dest_x} ,{@code dest_y}, {@code dest_width},
     * {@code dest_height}) of the resulting image with a checkboard of the
     * colors {@code color1} and {@code color2} and renders it onto the destination
     * image.
     * <p>
     * If the source image has no alpha channel, and {@code overall_alpha} is 255, a fast
     * path is used which omits the alpha blending and just performs the scaling.
     * <p>
     * See gdk_pixbuf_composite_color_simple() for a simpler variant of this
     * function suitable for many tasks.
     * @param dest the {@link Pixbuf} into which to render the results
     * @param destX the left coordinate for region to render
     * @param destY the top coordinate for region to render
     * @param destWidth the width of the region to render
     * @param destHeight the height of the region to render
     * @param offsetX the offset in the X direction (currently rounded to an integer)
     * @param offsetY the offset in the Y direction (currently rounded to an integer)
     * @param scaleX the scale factor in the X direction
     * @param scaleY the scale factor in the Y direction
     * @param interpType the interpolation type for the transformation.
     * @param overallAlpha overall alpha for source image (0..255)
     * @param checkX the X offset for the checkboard (origin of checkboard is at -{@code check_x}, -{@code check_y})
     * @param checkY the Y offset for the checkboard
     * @param checkSize the size of checks in the checkboard (must be a power of two)
     * @param color1 the color of check at upper left
     * @param color2 the color of the other check
     */
    public void compositeColor(org.gtk.gdkpixbuf.Pixbuf dest, int destX, int destY, int destWidth, int destHeight, double offsetX, double offsetY, double scaleX, double scaleY, org.gtk.gdkpixbuf.InterpType interpType, int overallAlpha, int checkX, int checkY, int checkSize, int color1, int color2) {
        try {
            DowncallHandles.gdk_pixbuf_composite_color.invokeExact(
                    handle(),
                    dest.handle(),
                    destX,
                    destY,
                    destWidth,
                    destHeight,
                    offsetX,
                    offsetY,
                    scaleX,
                    scaleY,
                    interpType.getValue(),
                    overallAlpha,
                    checkX,
                    checkY,
                    checkSize,
                    color1,
                    color2);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new pixbuf by scaling {@code src} to {@code dest_width} x {@code dest_height}
     * and alpha blending the result with a checkboard of colors {@code color1}
     * and {@code color2}.
     * @param destWidth the width of destination image
     * @param destHeight the height of destination image
     * @param interpType the interpolation type for the transformation.
     * @param overallAlpha overall alpha for source image (0..255)
     * @param checkSize the size of checks in the checkboard (must be a power of two)
     * @param color1 the color of check at upper left
     * @param color2 the color of the other check
     * @return the new pixbuf
     */
    public @Nullable org.gtk.gdkpixbuf.Pixbuf compositeColorSimple(int destWidth, int destHeight, org.gtk.gdkpixbuf.InterpType interpType, int overallAlpha, int checkSize, int color1, int color2) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_composite_color_simple.invokeExact(
                    handle(),
                    destWidth,
                    destHeight,
                    interpType.getValue(),
                    overallAlpha,
                    checkSize,
                    color1,
                    color2);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@code GdkPixbuf} with a copy of the information in the specified
     * {@code pixbuf}.
     * <p>
     * Note that this does not copy the options set on the original {@code GdkPixbuf},
     * use gdk_pixbuf_copy_options() for this.
     * @return A newly-created pixbuf
     */
    public @Nullable org.gtk.gdkpixbuf.Pixbuf copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Copies a rectangular area from {@code src_pixbuf} to {@code dest_pixbuf}.
     * <p>
     * Conversion of pixbuf formats is done automatically.
     * <p>
     * If the source rectangle overlaps the destination rectangle on the
     * same pixbuf, it will be overwritten during the copy operation.
     * Therefore, you can not use this function to scroll a pixbuf.
     * @param srcX Source X coordinate within {@code src_pixbuf}.
     * @param srcY Source Y coordinate within {@code src_pixbuf}.
     * @param width Width of the area to copy.
     * @param height Height of the area to copy.
     * @param destPixbuf Destination pixbuf.
     * @param destX X coordinate within {@code dest_pixbuf}.
     * @param destY Y coordinate within {@code dest_pixbuf}.
     */
    public void copyArea(int srcX, int srcY, int width, int height, org.gtk.gdkpixbuf.Pixbuf destPixbuf, int destX, int destY) {
        try {
            DowncallHandles.gdk_pixbuf_copy_area.invokeExact(
                    handle(),
                    srcX,
                    srcY,
                    width,
                    height,
                    destPixbuf.handle(),
                    destX,
                    destY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Copies the key/value pair options attached to a {@code GdkPixbuf} to another
     * {@code GdkPixbuf}.
     * <p>
     * This is useful to keep original metadata after having manipulated
     * a file. However be careful to remove metadata which you've already
     * applied, such as the "orientation" option after rotating the image.
     * @param destPixbuf the destination pixbuf
     * @return {@code TRUE} on success.
     */
    public boolean copyOptions(org.gtk.gdkpixbuf.Pixbuf destPixbuf) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_copy_options.invokeExact(
                    handle(),
                    destPixbuf.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Clears a pixbuf to the given RGBA value, converting the RGBA value into
     * the pixbuf's pixel format.
     * <p>
     * The alpha component will be ignored if the pixbuf doesn't have an alpha
     * channel.
     * @param pixel RGBA pixel to used to clear ({@code 0xffffffff} is opaque white,
     *   {@code 0x00000000} transparent black)
     */
    public void fill(int pixel) {
        try {
            DowncallHandles.gdk_pixbuf_fill.invokeExact(
                    handle(),
                    pixel);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Flips a pixbuf horizontally or vertically and returns the
     * result in a new pixbuf.
     * @param horizontal {@code TRUE} to flip horizontally, {@code FALSE} to flip vertically
     * @return the new pixbuf
     */
    public @Nullable org.gtk.gdkpixbuf.Pixbuf flip(boolean horizontal) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_flip.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(horizontal, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Queries the number of bits per color sample in a pixbuf.
     * @return Number of bits per color sample.
     */
    public int getBitsPerSample() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_get_bits_per_sample.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the length of the pixel data, in bytes.
     * @return The length of the pixel data.
     */
    public long getByteLength() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_pixbuf_get_byte_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Queries the color space of a pixbuf.
     * @return Color space.
     */
    public org.gtk.gdkpixbuf.Colorspace getColorspace() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_get_colorspace.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdkpixbuf.Colorspace.of(RESULT);
    }
    
    /**
     * Queries whether a pixbuf has an alpha channel (opacity information).
     * @return {@code TRUE} if it has an alpha channel, {@code FALSE} otherwise.
     */
    public boolean getHasAlpha() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_get_has_alpha.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Queries the height of a pixbuf.
     * @return Height in pixels.
     */
    public int getHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_get_height.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Queries the number of channels of a pixbuf.
     * @return Number of channels.
     */
    public int getNChannels() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_get_n_channels.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Looks up {@code key} in the list of options that may have been attached to the
     * {@code pixbuf} when it was loaded, or that may have been attached by another
     * function using gdk_pixbuf_set_option().
     * <p>
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
     * @param key a nul-terminated string.
     * @return the value associated with {@code key}
     */
    public @Nullable java.lang.String getOption(java.lang.String key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_get_option.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns a {@code GHashTable} with a list of all the options that may have been
     * attached to the {@code pixbuf} when it was loaded, or that may have been
     * attached by another function using {@link Pixbuf#setOption}.
     * @return a {@link org.gtk.glib.HashTable}
     *   of key/values pairs
     */
    public org.gtk.glib.HashTable getOptions() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_get_options.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.HashTable.fromAddress.marshal(RESULT, Ownership.CONTAINER);
    }
    
    /**
     * Queries a pointer to the pixel data of a pixbuf.
     * <p>
     * This function will cause an implicit copy of the pixbuf data if the
     * pixbuf was created from read-only data.
     * <p>
     * Please see the section on <a href="class.Pixbuf.html#image-data">image data</a> for information
     * about how the pixel data is stored in memory.
     * @param length The length of the binary data.
     * @return A pointer to the pixbuf's
     * pixel data.
     */
    public byte[] getPixels(Out<Integer> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_get_pixels_with_length.invokeExact(
                    handle(),
                    (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(Interop.valueLayout.C_INT, 0));
        return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), length.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE);
    }
    
    /**
     * Queries the rowstride of a pixbuf, which is the number of bytes between
     * the start of a row and the start of the next row.
     * @return Distance between row starts.
     */
    public int getRowstride() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_get_rowstride.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Queries the width of a pixbuf.
     * @return Width in pixels.
     */
    public int getWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_get_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf which represents a sub-region of {@code src_pixbuf}.
     * <p>
     * The new pixbuf shares its pixels with the original pixbuf, so
     * writing to one affects both.  The new pixbuf holds a reference to
     * {@code src_pixbuf}, so {@code src_pixbuf} will not be finalized until the new
     * pixbuf is finalized.
     * <p>
     * Note that if {@code src_pixbuf} is read-only, this function will force it
     * to be mutable.
     * @param srcX X coord in {@code src_pixbuf}
     * @param srcY Y coord in {@code src_pixbuf}
     * @param width width of region in {@code src_pixbuf}
     * @param height height of region in {@code src_pixbuf}
     * @return a new pixbuf
     */
    public org.gtk.gdkpixbuf.Pixbuf newSubpixbuf(int srcX, int srcY, int width, int height) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_new_subpixbuf.invokeExact(
                    handle(),
                    srcX,
                    srcY,
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Provides a {@link org.gtk.glib.Bytes} buffer containing the raw pixel data; the data
     * must not be modified.
     * <p>
     * This function allows skipping the implicit copy that must be made
     * if gdk_pixbuf_get_pixels() is called on a read-only pixbuf.
     * @return A new reference to a read-only copy of
     *   the pixel data.  Note that for mutable pixbufs, this function will
     *   incur a one-time copy of the pixel data for conversion into the
     *   returned {@link org.gtk.glib.Bytes}.
     */
    public org.gtk.glib.Bytes readPixelBytes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_read_pixel_bytes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Bytes.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Provides a read-only pointer to the raw pixel data.
     * <p>
     * This function allows skipping the implicit copy that must be made
     * if gdk_pixbuf_get_pixels() is called on a read-only pixbuf.
     * @return a read-only pointer to the raw pixel data
     */
    public PointerByte readPixels() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_read_pixels.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    /**
     * Adds a reference to a pixbuf.
     * @return The same as the {@code pixbuf} argument.
     * @deprecated Use g_object_ref().
     */
    @Deprecated
    public org.gtk.gdkpixbuf.Pixbuf ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Removes the key/value pair option attached to a {@code GdkPixbuf}.
     * @param key a nul-terminated string representing the key to remove.
     * @return {@code TRUE} if an option was removed, {@code FALSE} if not.
     */
    public boolean removeOption(java.lang.String key) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_remove_option.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Rotates a pixbuf by a multiple of 90 degrees, and returns the
     * result in a new pixbuf.
     * <p>
     * If {@code angle} is 0, this function will return a copy of {@code src}.
     * @param angle the angle to rotate by
     * @return the new pixbuf
     */
    public @Nullable org.gtk.gdkpixbuf.Pixbuf rotateSimple(org.gtk.gdkpixbuf.PixbufRotation angle) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_rotate_simple.invokeExact(
                    handle(),
                    angle.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Modifies saturation and optionally pixelates {@code src}, placing the result in
     * {@code dest}.
     * <p>
     * The {@code src} and {@code dest} pixbufs must have the same image format, size, and
     * rowstride.
     * <p>
     * The {@code src} and {@code dest} arguments may be the same pixbuf with no ill effects.
     * <p>
     * If {@code saturation} is 1.0 then saturation is not changed. If it's less than 1.0,
     * saturation is reduced (the image turns toward grayscale); if greater than
     * 1.0, saturation is increased (the image gets more vivid colors).
     * <p>
     * If {@code pixelate} is {@code TRUE}, then pixels are faded in a checkerboard pattern to
     * create a pixelated image.
     * @param dest place to write modified version of {@code src}
     * @param saturation saturation factor
     * @param pixelate whether to pixelate
     */
    public void saturateAndPixelate(org.gtk.gdkpixbuf.Pixbuf dest, float saturation, boolean pixelate) {
        try {
            DowncallHandles.gdk_pixbuf_saturate_and_pixelate.invokeExact(
                    handle(),
                    dest.handle(),
                    saturation,
                    Marshal.booleanToInteger.marshal(pixelate, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Saves pixbuf to a file in format {@code type}. By default, "jpeg", "png", "ico"
     * and "bmp" are possible file formats to save in, but more formats may be
     * installed. The list of all writable formats can be determined in the
     * following way:
     * <pre>{@code c
     * void add_if_writable (GdkPixbufFormat *data, GSList **list)
     * {
     *   if (gdk_pixbuf_format_is_writable (data))
     *     *list = g_slist_prepend (*list, data);
     * }
     * 
     * GSList *formats = gdk_pixbuf_get_formats ();
     * GSList *writable_formats = NULL;
     * g_slist_foreach (formats, add_if_writable, &writable_formats);
     * g_slist_free (formats);
     * }</pre>
     * <p>
     * If {@code error} is set, {@code FALSE} will be returned. Possible errors include
     * those in the {@code GDK_PIXBUF_ERROR} domain and those in the {@code G_FILE_ERROR}
     * domain.
     * <p>
     * The variable argument list should be {@code NULL}-terminated; if not empty,
     * it should contain pairs of strings that modify the save
     * parameters. For example:
     * <pre>{@code c
     * gdk_pixbuf_save (pixbuf, handle, "jpeg", &error, "quality", "100", NULL);
     * }</pre>
     * <p>
     * Currently only few parameters exist.
     * <p>
     * JPEG images can be saved with a "quality" parameter; its value should be
     * in the range {@code [0, 100]}. JPEG and PNG density can be set by setting the
     * "x-dpi" and "y-dpi" parameters to the appropriate values in dots per inch.
     * <p>
     * Text chunks can be attached to PNG images by specifying parameters of
     * the form "tEXt::key", where key is an ASCII string of length 1-79.
     * The values are UTF-8 encoded strings. The PNG compression level can
     * be specified using the "compression" parameter; it's value is in an
     * integer in the range of {@code [0, 9]}.
     * <p>
     * ICC color profiles can also be embedded into PNG, JPEG and TIFF images.
     * The "icc-profile" value should be the complete ICC profile encoded
     * into base64.
     * <pre>{@code c
     * char *contents;
     * gsize length;
     * 
     * // icm_path is set elsewhere
     * g_file_get_contents (icm_path, &contents, &length, NULL);
     * 
     * char *contents_encode = g_base64_encode ((const guchar *) contents, length);
     * 
     * gdk_pixbuf_save (pixbuf, handle, "png", &error, "icc-profile", contents_encode, NULL);
     * }</pre>
     * <p>
     * TIFF images recognize:
     * <p>
     *  1. a "bits-per-sample" option (integer) which can be either 1 for saving
     *     bi-level CCITTFAX4 images, or 8 for saving 8-bits per sample
     *  2. a "compression" option (integer) which can be 1 for no compression,
     *     2 for Huffman, 5 for LZW, 7 for JPEG and 8 for DEFLATE (see the libtiff
     *     documentation and tiff.h for all supported codec values)
     *  3. an "icc-profile" option (zero-terminated string) containing a base64
     *     encoded ICC color profile.
     * <p>
     * ICO images can be saved in depth 16, 24, or 32, by using the "depth"
     * parameter. When the ICO saver is given "x_hot" and "y_hot" parameters,
     * it produces a CUR instead of an ICO.
     * @param filename name of file to save.
     * @param type name of file format.
     * @param error return location for error
     * @param varargs list of key-value save options, followed by {@code NULL}
     * @return {@code TRUE} on success, and {@code FALSE} otherwise
     */
    public boolean save(java.lang.String filename, java.lang.String type, @Nullable PointerProxy<org.gtk.glib.Error> error, java.lang.Object... varargs) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_save.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(filename, null),
                    Marshal.stringToAddress.marshal(type, null),
                    error.handle(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Saves pixbuf to a new buffer in format {@code type}, which is currently "jpeg",
     * "png", "tiff", "ico" or "bmp".
     * <p>
     * This is a convenience function that uses {@code gdk_pixbuf_save_to_callback()}
     * to do the real work.
     * <p>
     * Note that the buffer is not {@code NUL}-terminated and may contain embedded {@code NUL}
     * characters.
     * <p>
     * If {@code error} is set, {@code FALSE} will be returned and {@code buffer} will be set to
     * {@code NULL}. Possible errors include those in the {@code GDK_PIXBUF_ERROR}
     * domain.
     * <p>
     * See {@code gdk_pixbuf_save()} for more details.
     * @param buffer location to receive a pointer
     *   to the new buffer.
     * @param bufferSize location to receive the size of the new buffer.
     * @param type name of file format.
     * @param error return location for error, or {@code NULL}
     * @param varargs list of key-value save options
     * @return whether an error was set
     */
    public boolean saveToBuffer(Out<byte[]> buffer, Out<Long> bufferSize, java.lang.String type, @Nullable PointerProxy<org.gtk.glib.Error> error, java.lang.Object... varargs) {
        MemorySegment bufferPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment bufferSizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_save_to_buffer.invokeExact(
                    handle(),
                    (Addressable) bufferPOINTER.address(),
                    (Addressable) bufferSizePOINTER.address(),
                    Marshal.stringToAddress.marshal(type, null),
                    error.handle(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        bufferSize.set(bufferSizePOINTER.get(Interop.valueLayout.C_LONG, 0));
        buffer.set(MemorySegment.ofAddress(bufferPOINTER.get(Interop.valueLayout.ADDRESS, 0), bufferSize.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Vector version of {@code gdk_pixbuf_save_to_buffer()}.
     * <p>
     * Saves pixbuf to a new buffer in format {@code type}, which is currently "jpeg",
     * "tiff", "png", "ico" or "bmp".
     * <p>
     * See {@link Pixbuf#saveToBuffer} for more details.
     * @param buffer location to receive a pointer to the new buffer.
     * @param bufferSize location to receive the size of the new buffer.
     * @param type name of file format.
     * @param optionKeys name of options to set
     * @param optionValues values for named options
     * @return whether an error was set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean saveToBufferv(Out<byte[]> buffer, Out<Long> bufferSize, java.lang.String type, @Nullable java.lang.String[] optionKeys, @Nullable java.lang.String[] optionValues) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment bufferPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment bufferSizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_save_to_bufferv.invokeExact(
                    handle(),
                    (Addressable) bufferPOINTER.address(),
                    (Addressable) bufferSizePOINTER.address(),
                    Marshal.stringToAddress.marshal(type, null),
                    (Addressable) (optionKeys == null ? MemoryAddress.NULL : Interop.allocateNativeArray(optionKeys, false)),
                    (Addressable) (optionValues == null ? MemoryAddress.NULL : Interop.allocateNativeArray(optionValues, false)),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        bufferSize.set(bufferSizePOINTER.get(Interop.valueLayout.C_LONG, 0));
        buffer.set(MemorySegment.ofAddress(bufferPOINTER.get(Interop.valueLayout.ADDRESS, 0), bufferSize.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Saves pixbuf in format {@code type} by feeding the produced data to a
     * callback.
     * <p>
     * This function can be used when you want to store the image to something
     * other than a file, such as an in-memory buffer or a socket.
     * <p>
     * If {@code error} is set, {@code FALSE} will be returned. Possible errors
     * include those in the {@code GDK_PIXBUF_ERROR} domain and whatever the save
     * function generates.
     * <p>
     * See {@link Pixbuf#save} for more details.
     * @param saveFunc a function that is called to save each block of data that
     *   the save routine generates.
     * @param type name of file format.
     * @param error return location for error, or {@code NULL}
     * @param varargs list of key-value save options
     * @return whether an error was set
     */
    public boolean saveToCallback(org.gtk.gdkpixbuf.PixbufSaveFunc saveFunc, java.lang.String type, @Nullable PointerProxy<org.gtk.glib.Error> error, java.lang.Object... varargs) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_save_to_callback.invokeExact(
                    handle(),
                    (Addressable) saveFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    Marshal.stringToAddress.marshal(type, null),
                    error.handle(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Vector version of {@code gdk_pixbuf_save_to_callback()}.
     * <p>
     * Saves pixbuf to a callback in format {@code type}, which is currently "jpeg",
     * "png", "tiff", "ico" or "bmp".
     * <p>
     * If {@code error} is set, {@code FALSE} will be returned.
     * <p>
     * See {@link Pixbuf#saveToCallback} for more details.
     * @param saveFunc a function that is called to save each block of data that
     *   the save routine generates.
     * @param type name of file format.
     * @param optionKeys name of options to set
     * @param optionValues values for named options
     * @return whether an error was set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean saveToCallbackv(org.gtk.gdkpixbuf.PixbufSaveFunc saveFunc, java.lang.String type, @Nullable java.lang.String[] optionKeys, @Nullable java.lang.String[] optionValues) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_save_to_callbackv.invokeExact(
                    handle(),
                    (Addressable) saveFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    Marshal.stringToAddress.marshal(type, null),
                    (Addressable) (optionKeys == null ? MemoryAddress.NULL : Interop.allocateNativeArray(optionKeys, false)),
                    (Addressable) (optionValues == null ? MemoryAddress.NULL : Interop.allocateNativeArray(optionValues, false)),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Saves {@code pixbuf} to an output stream.
     * <p>
     * Supported file formats are currently "jpeg", "tiff", "png", "ico" or
     * "bmp". See {@code gdk_pixbuf_save_to_buffer()} for more details.
     * <p>
     * The {@code cancellable} can be used to abort the operation from another
     * thread. If the operation was cancelled, the error {@code G_IO_ERROR_CANCELLED}
     * will be returned. Other possible errors are in the {@code GDK_PIXBUF_ERROR}
     * and {@code G_IO_ERROR} domains.
     * <p>
     * The stream is not closed at the end of this call.
     * @param stream a {@code GOutputStream} to save the pixbuf to
     * @param type name of file format
     * @param cancellable optional {@code GCancellable} object, {@code NULL} to ignore
     * @param error return location for error, or {@code NULL}
     * @param varargs list of key-value save options
     * @return {@code TRUE} if the pixbuf was saved successfully, {@code FALSE} if an
     *   error was set.
     */
    public boolean saveToStream(org.gtk.gio.OutputStream stream, java.lang.String type, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable PointerProxy<org.gtk.glib.Error> error, java.lang.Object... varargs) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_save_to_stream.invokeExact(
                    handle(),
                    stream.handle(),
                    Marshal.stringToAddress.marshal(type, null),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    error.handle(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Saves {@code pixbuf} to an output stream asynchronously.
     * <p>
     * For more details see gdk_pixbuf_save_to_stream(), which is the synchronous
     * version of this function.
     * <p>
     * When the operation is finished, {@code callback} will be called in the main thread.
     * <p>
     * You can then call gdk_pixbuf_save_to_stream_finish() to get the result of
     * the operation.
     * @param stream a {@code GOutputStream} to which to save the pixbuf
     * @param type name of file format
     * @param cancellable optional {@code GCancellable} object, {@code NULL} to ignore
     * @param callback a {@code GAsyncReadyCallback} to call when the pixbuf is saved
     * @param varargs list of key-value save options
     */
    public void saveToStreamAsync(org.gtk.gio.OutputStream stream, java.lang.String type, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback, java.lang.Object... varargs) {
        try {
            DowncallHandles.gdk_pixbuf_save_to_stream_async.invokeExact(
                    handle(),
                    stream.handle(),
                    Marshal.stringToAddress.marshal(type, null),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Saves {@code pixbuf} to an output stream.
     * <p>
     * Supported file formats are currently "jpeg", "tiff", "png", "ico" or
     * "bmp".
     * <p>
     * See {@link Pixbuf#saveToStream} for more details.
     * @param stream a {@code GOutputStream} to save the pixbuf to
     * @param type name of file format
     * @param optionKeys name of options to set
     * @param optionValues values for named options
     * @param cancellable optional {@code GCancellable} object, {@code NULL} to ignore
     * @return {@code TRUE} if the pixbuf was saved successfully, {@code FALSE} if an
     *   error was set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean saveToStreamv(org.gtk.gio.OutputStream stream, java.lang.String type, @Nullable java.lang.String[] optionKeys, @Nullable java.lang.String[] optionValues, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_save_to_streamv.invokeExact(
                    handle(),
                    stream.handle(),
                    Marshal.stringToAddress.marshal(type, null),
                    (Addressable) (optionKeys == null ? MemoryAddress.NULL : Interop.allocateNativeArray(optionKeys, false)),
                    (Addressable) (optionValues == null ? MemoryAddress.NULL : Interop.allocateNativeArray(optionValues, false)),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Saves {@code pixbuf} to an output stream asynchronously.
     * <p>
     * For more details see gdk_pixbuf_save_to_streamv(), which is the synchronous
     * version of this function.
     * <p>
     * When the operation is finished, {@code callback} will be called in the main thread.
     * <p>
     * You can then call gdk_pixbuf_save_to_stream_finish() to get the result of
     * the operation.
     * @param stream a {@code GOutputStream} to which to save the pixbuf
     * @param type name of file format
     * @param optionKeys name of options to set
     * @param optionValues values for named options
     * @param cancellable optional {@code GCancellable} object, {@code NULL} to ignore
     * @param callback a {@code GAsyncReadyCallback} to call when the pixbuf is saved
     */
    public void saveToStreamvAsync(org.gtk.gio.OutputStream stream, java.lang.String type, @Nullable java.lang.String[] optionKeys, @Nullable java.lang.String[] optionValues, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.gdk_pixbuf_save_to_streamv_async.invokeExact(
                    handle(),
                    stream.handle(),
                    Marshal.stringToAddress.marshal(type, null),
                    (Addressable) (optionKeys == null ? MemoryAddress.NULL : Interop.allocateNativeArray(optionKeys, false)),
                    (Addressable) (optionValues == null ? MemoryAddress.NULL : Interop.allocateNativeArray(optionValues, false)),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Vector version of {@code gdk_pixbuf_save()}.
     * <p>
     * Saves pixbuf to a file in {@code type}, which is currently "jpeg", "png", "tiff", "ico" or "bmp".
     * <p>
     * If {@code error} is set, {@code FALSE} will be returned.
     * <p>
     * See {@link Pixbuf#save} for more details.
     * @param filename name of file to save.
     * @param type name of file format.
     * @param optionKeys name of options to set
     * @param optionValues values for named options
     * @return whether an error was set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean savev(java.lang.String filename, java.lang.String type, @Nullable java.lang.String[] optionKeys, @Nullable java.lang.String[] optionValues) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_savev.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(filename, null),
                    Marshal.stringToAddress.marshal(type, null),
                    (Addressable) (optionKeys == null ? MemoryAddress.NULL : Interop.allocateNativeArray(optionKeys, false)),
                    (Addressable) (optionValues == null ? MemoryAddress.NULL : Interop.allocateNativeArray(optionValues, false)),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Creates a transformation of the source image {@code src} by scaling by
     * {@code scale_x} and {@code scale_y} then translating by {@code offset_x} and {@code offset_y},
     * then renders the rectangle ({@code dest_x}, {@code dest_y}, {@code dest_width},
     * {@code dest_height}) of the resulting image onto the destination image
     * replacing the previous contents.
     * <p>
     * Try to use gdk_pixbuf_scale_simple() first; this function is
     * the industrial-strength power tool you can fall back to, if
     * gdk_pixbuf_scale_simple() isn't powerful enough.
     * <p>
     * If the source rectangle overlaps the destination rectangle on the
     * same pixbuf, it will be overwritten during the scaling which
     * results in rendering artifacts.
     * @param dest the {@link Pixbuf} into which to render the results
     * @param destX the left coordinate for region to render
     * @param destY the top coordinate for region to render
     * @param destWidth the width of the region to render
     * @param destHeight the height of the region to render
     * @param offsetX the offset in the X direction (currently rounded to an integer)
     * @param offsetY the offset in the Y direction (currently rounded to an integer)
     * @param scaleX the scale factor in the X direction
     * @param scaleY the scale factor in the Y direction
     * @param interpType the interpolation type for the transformation.
     */
    public void scale(org.gtk.gdkpixbuf.Pixbuf dest, int destX, int destY, int destWidth, int destHeight, double offsetX, double offsetY, double scaleX, double scaleY, org.gtk.gdkpixbuf.InterpType interpType) {
        try {
            DowncallHandles.gdk_pixbuf_scale.invokeExact(
                    handle(),
                    dest.handle(),
                    destX,
                    destY,
                    destWidth,
                    destHeight,
                    offsetX,
                    offsetY,
                    scaleX,
                    scaleY,
                    interpType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create a new pixbuf containing a copy of {@code src} scaled to
     * {@code dest_width} x {@code dest_height}.
     * <p>
     * This function leaves {@code src} unaffected.
     * <p>
     * The {@code interp_type} should be {@code GDK_INTERP_NEAREST} if you want maximum
     * speed (but when scaling down {@code GDK_INTERP_NEAREST} is usually unusably
     * ugly). The default {@code interp_type} should be {@code GDK_INTERP_BILINEAR} which
     * offers reasonable quality and speed.
     * <p>
     * You can scale a sub-portion of {@code src} by creating a sub-pixbuf
     * pointing into {@code src}; see {@link Pixbuf#newSubpixbuf}.
     * <p>
     * If {@code dest_width} and {@code dest_height} are equal to the width and height of
     * {@code src}, this function will return an unscaled copy of {@code src}.
     * <p>
     * For more complicated scaling/alpha blending see {@link Pixbuf#scale}
     * and {@link Pixbuf#composite}.
     * @param destWidth the width of destination image
     * @param destHeight the height of destination image
     * @param interpType the interpolation type for the transformation.
     * @return the new pixbuf
     */
    public @Nullable org.gtk.gdkpixbuf.Pixbuf scaleSimple(int destWidth, int destHeight, org.gtk.gdkpixbuf.InterpType interpType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_scale_simple.invokeExact(
                    handle(),
                    destWidth,
                    destHeight,
                    interpType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Attaches a key/value pair as an option to a {@code GdkPixbuf}.
     * <p>
     * If {@code key} already exists in the list of options attached to the {@code pixbuf},
     * the new value is ignored and {@code FALSE} is returned.
     * @param key a nul-terminated string.
     * @param value a nul-terminated string.
     * @return {@code TRUE} on success
     */
    public boolean setOption(java.lang.String key, java.lang.String value) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_set_option.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null),
                    Marshal.stringToAddress.marshal(value, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Removes a reference from a pixbuf.
     * @deprecated Use g_object_unref().
     */
    @Deprecated
    public void unref() {
        try {
            DowncallHandles.gdk_pixbuf_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_pixbuf_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Calculates the rowstride that an image created with those values would
     * have.
     * <p>
     * This function is useful for front-ends and backends that want to check
     * image values without needing to create a {@code GdkPixbuf}.
     * @param colorspace Color space for image
     * @param hasAlpha Whether the image should have transparency information
     * @param bitsPerSample Number of bits per color sample
     * @param width Width of image in pixels, must be &gt; 0
     * @param height Height of image in pixels, must be &gt; 0
     * @return the rowstride for the given values, or -1 in case of error.
     */
    public static int calculateRowstride(org.gtk.gdkpixbuf.Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_calculate_rowstride.invokeExact(
                    colorspace.getValue(),
                    Marshal.booleanToInteger.marshal(hasAlpha, null).intValue(),
                    bitsPerSample,
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Parses an image file far enough to determine its format and size.
     * @param filename The name of the file to identify.
     * @param width Return location for the width of the image
     * @param height Return location for the height of the image
     * @return A {@code GdkPixbufFormat} describing
     *   the image format of the file
     */
    public static @Nullable org.gtk.gdkpixbuf.PixbufFormat getFileInfo(java.lang.String filename, Out<Integer> width, Out<Integer> height) {
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_get_file_info.invokeExact(
                    Marshal.stringToAddress.marshal(filename, null),
                    (Addressable) (width == null ? MemoryAddress.NULL : (Addressable) widthPOINTER.address()),
                    (Addressable) (height == null ? MemoryAddress.NULL : (Addressable) heightPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (width != null) width.set(widthPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (height != null) height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
        return org.gtk.gdkpixbuf.PixbufFormat.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Asynchronously parses an image file far enough to determine its
     * format and size.
     * <p>
     * For more details see gdk_pixbuf_get_file_info(), which is the synchronous
     * version of this function.
     * <p>
     * When the operation is finished, {@code callback} will be called in the
     * main thread. You can then call gdk_pixbuf_get_file_info_finish() to
     * get the result of the operation.
     * @param filename The name of the file to identify
     * @param cancellable optional {@code GCancellable} object, {@code NULL} to ignore
     * @param callback a {@code GAsyncReadyCallback} to call when the file info is available
     */
    public static void getFileInfoAsync(java.lang.String filename, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.gdk_pixbuf_get_file_info_async.invokeExact(
                    Marshal.stringToAddress.marshal(filename, null),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous pixbuf parsing operation started with
     * gdk_pixbuf_get_file_info_async().
     * @param asyncResult a {@code GAsyncResult}
     * @param width Return location for the width of the image, or {@code NULL}
     * @param height Return location for the height of the image, or {@code NULL}
     * @return A {@code GdkPixbufFormat} describing the
     *   image format of the file
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static @Nullable org.gtk.gdkpixbuf.PixbufFormat getFileInfoFinish(org.gtk.gio.AsyncResult asyncResult, Out<Integer> width, Out<Integer> height) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_get_file_info_finish.invokeExact(
                    asyncResult.handle(),
                    (Addressable) widthPOINTER.address(),
                    (Addressable) heightPOINTER.address(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        width.set(widthPOINTER.get(Interop.valueLayout.C_INT, 0));
        height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
        return org.gtk.gdkpixbuf.PixbufFormat.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Obtains the available information about the image formats supported
     * by GdkPixbuf.
     * @return A list of
     *   support image formats.
     */
    public static org.gtk.glib.SList getFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_get_formats.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, Ownership.CONTAINER);
    }
    
    /**
     * Initalizes the gdk-pixbuf loader modules referenced by the {@code loaders.cache}
     * file present inside that directory.
     * <p>
     * This is to be used by applications that want to ship certain loaders
     * in a different location from the system ones.
     * <p>
     * This is needed when the OS or runtime ships a minimal number of loaders
     * so as to reduce the potential attack surface of carefully crafted image
     * files, especially for uncommon file types. Applications that require
     * broader image file types coverage, such as image viewers, would be
     * expected to ship the gdk-pixbuf modules in a separate location, bundled
     * with the application in a separate directory from the OS or runtime-
     * provided modules.
     * @param path Path to directory where the {@code loaders.cache} is installed
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static boolean initModules(java.lang.String path) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_init_modules.invokeExact(
                    Marshal.stringToAddress.marshal(path, null),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Creates a new pixbuf by asynchronously loading an image from an input stream.
     * <p>
     * For more details see gdk_pixbuf_new_from_stream(), which is the synchronous
     * version of this function.
     * <p>
     * When the operation is finished, {@code callback} will be called in the main thread.
     * You can then call gdk_pixbuf_new_from_stream_finish() to get the result of
     * the operation.
     * @param stream a {@code GInputStream} from which to load the pixbuf
     * @param cancellable optional {@code GCancellable} object, {@code NULL} to ignore
     * @param callback a {@code GAsyncReadyCallback} to call when the pixbuf is loaded
     */
    public static void newFromStreamAsync(org.gtk.gio.InputStream stream, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.gdk_pixbuf_new_from_stream_async.invokeExact(
                    stream.handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new pixbuf by asynchronously loading an image from an input stream.
     * <p>
     * For more details see gdk_pixbuf_new_from_stream_at_scale(), which is the synchronous
     * version of this function.
     * <p>
     * When the operation is finished, {@code callback} will be called in the main thread.
     * You can then call gdk_pixbuf_new_from_stream_finish() to get the result of the operation.
     * @param stream a {@code GInputStream} from which to load the pixbuf
     * @param width the width the image should have or -1 to not constrain the width
     * @param height the height the image should have or -1 to not constrain the height
     * @param preserveAspectRatio {@code TRUE} to preserve the image's aspect ratio
     * @param cancellable optional {@code GCancellable} object, {@code NULL} to ignore
     * @param callback a {@code GAsyncReadyCallback} to call when the pixbuf is loaded
     */
    public static void newFromStreamAtScaleAsync(org.gtk.gio.InputStream stream, int width, int height, boolean preserveAspectRatio, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.gdk_pixbuf_new_from_stream_at_scale_async.invokeExact(
                    stream.handle(),
                    width,
                    height,
                    Marshal.booleanToInteger.marshal(preserveAspectRatio, null).intValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous pixbuf save operation started with
     * gdk_pixbuf_save_to_stream_async().
     * @param asyncResult a {@code GAsyncResult}
     * @return {@code TRUE} if the pixbuf was saved successfully, {@code FALSE} if an error was set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static boolean saveToStreamFinish(org.gtk.gio.AsyncResult asyncResult) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_save_to_stream_finish.invokeExact(
                    asyncResult.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * A {@link Pixbuf.Builder} object constructs a {@link Pixbuf} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Pixbuf.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Pixbuf} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Pixbuf}.
         * @return A new instance of {@code Pixbuf} with the properties 
         *         that were set in the Builder object.
         */
        public Pixbuf build() {
            return (Pixbuf) org.gtk.gobject.GObject.newWithProperties(
                Pixbuf.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The number of bits per sample.
         * <p>
         * Currently only 8 bit per sample are supported.
         * @param bitsPerSample The value for the {@code bits-per-sample} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBitsPerSample(int bitsPerSample) {
            names.add("bits-per-sample");
            values.add(org.gtk.gobject.Value.create(bitsPerSample));
            return this;
        }
        
        /**
         * The color space of the pixbuf.
         * <p>
         * Currently, only {@code GDK_COLORSPACE_RGB} is supported.
         * @param colorspace The value for the {@code colorspace} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setColorspace(org.gtk.gdkpixbuf.Colorspace colorspace) {
            names.add("colorspace");
            values.add(org.gtk.gobject.Value.create(colorspace));
            return this;
        }
        
        /**
         * Whether the pixbuf has an alpha channel.
         * @param hasAlpha The value for the {@code has-alpha} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHasAlpha(boolean hasAlpha) {
            names.add("has-alpha");
            values.add(org.gtk.gobject.Value.create(hasAlpha));
            return this;
        }
        
        /**
         * The number of rows of the pixbuf.
         * @param height The value for the {@code height} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHeight(int height) {
            names.add("height");
            values.add(org.gtk.gobject.Value.create(height));
            return this;
        }
        
        /**
         * The number of samples per pixel.
         * <p>
         * Currently, only 3 or 4 samples per pixel are supported.
         * @param nChannels The value for the {@code n-channels} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNChannels(int nChannels) {
            names.add("n-channels");
            values.add(org.gtk.gobject.Value.create(nChannels));
            return this;
        }
        
        public Builder setPixelBytes(org.gtk.glib.Bytes pixelBytes) {
            names.add("pixel-bytes");
            values.add(org.gtk.gobject.Value.create(pixelBytes));
            return this;
        }
        
        /**
         * A pointer to the pixel data of the pixbuf.
         * @param pixels The value for the {@code pixels} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPixels(java.lang.foreign.MemoryAddress pixels) {
            names.add("pixels");
            values.add(org.gtk.gobject.Value.create(pixels));
            return this;
        }
        
        /**
         * The number of bytes between the start of a row and
         * the start of the next row.
         * <p>
         * This number must (obviously) be at least as large as the
         * width of the pixbuf.
         * @param rowstride The value for the {@code rowstride} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRowstride(int rowstride) {
            names.add("rowstride");
            values.add(org.gtk.gobject.Value.create(rowstride));
            return this;
        }
        
        /**
         * The number of columns of the pixbuf.
         * @param width The value for the {@code width} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWidth(int width) {
            names.add("width");
            values.add(org.gtk.gobject.Value.create(width));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_pixbuf_new = Interop.downcallHandle(
            "gdk_pixbuf_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_new_from_bytes = Interop.downcallHandle(
            "gdk_pixbuf_new_from_bytes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_new_from_data = Interop.downcallHandle(
            "gdk_pixbuf_new_from_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_new_from_file = Interop.downcallHandle(
            "gdk_pixbuf_new_from_file",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_new_from_file_at_scale = Interop.downcallHandle(
            "gdk_pixbuf_new_from_file_at_scale",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_new_from_file_at_size = Interop.downcallHandle(
            "gdk_pixbuf_new_from_file_at_size",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_new_from_inline = Interop.downcallHandle(
            "gdk_pixbuf_new_from_inline",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_new_from_resource = Interop.downcallHandle(
            "gdk_pixbuf_new_from_resource",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_new_from_resource_at_scale = Interop.downcallHandle(
            "gdk_pixbuf_new_from_resource_at_scale",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_new_from_stream = Interop.downcallHandle(
            "gdk_pixbuf_new_from_stream",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_new_from_stream_at_scale = Interop.downcallHandle(
            "gdk_pixbuf_new_from_stream_at_scale",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_new_from_stream_finish = Interop.downcallHandle(
            "gdk_pixbuf_new_from_stream_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_new_from_xpm_data = Interop.downcallHandle(
            "gdk_pixbuf_new_from_xpm_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_add_alpha = Interop.downcallHandle(
            "gdk_pixbuf_add_alpha",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_apply_embedded_orientation = Interop.downcallHandle(
            "gdk_pixbuf_apply_embedded_orientation",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_composite = Interop.downcallHandle(
            "gdk_pixbuf_composite",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_composite_color = Interop.downcallHandle(
            "gdk_pixbuf_composite_color",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_composite_color_simple = Interop.downcallHandle(
            "gdk_pixbuf_composite_color_simple",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_copy = Interop.downcallHandle(
            "gdk_pixbuf_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_copy_area = Interop.downcallHandle(
            "gdk_pixbuf_copy_area",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_copy_options = Interop.downcallHandle(
            "gdk_pixbuf_copy_options",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_fill = Interop.downcallHandle(
            "gdk_pixbuf_fill",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_flip = Interop.downcallHandle(
            "gdk_pixbuf_flip",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_get_bits_per_sample = Interop.downcallHandle(
            "gdk_pixbuf_get_bits_per_sample",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_get_byte_length = Interop.downcallHandle(
            "gdk_pixbuf_get_byte_length",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_get_colorspace = Interop.downcallHandle(
            "gdk_pixbuf_get_colorspace",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_get_has_alpha = Interop.downcallHandle(
            "gdk_pixbuf_get_has_alpha",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_get_height = Interop.downcallHandle(
            "gdk_pixbuf_get_height",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_get_n_channels = Interop.downcallHandle(
            "gdk_pixbuf_get_n_channels",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_get_option = Interop.downcallHandle(
            "gdk_pixbuf_get_option",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_get_options = Interop.downcallHandle(
            "gdk_pixbuf_get_options",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_get_pixels_with_length = Interop.downcallHandle(
            "gdk_pixbuf_get_pixels_with_length",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_get_rowstride = Interop.downcallHandle(
            "gdk_pixbuf_get_rowstride",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_get_width = Interop.downcallHandle(
            "gdk_pixbuf_get_width",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_new_subpixbuf = Interop.downcallHandle(
            "gdk_pixbuf_new_subpixbuf",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_read_pixel_bytes = Interop.downcallHandle(
            "gdk_pixbuf_read_pixel_bytes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_read_pixels = Interop.downcallHandle(
            "gdk_pixbuf_read_pixels",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_ref = Interop.downcallHandle(
            "gdk_pixbuf_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_remove_option = Interop.downcallHandle(
            "gdk_pixbuf_remove_option",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_rotate_simple = Interop.downcallHandle(
            "gdk_pixbuf_rotate_simple",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_saturate_and_pixelate = Interop.downcallHandle(
            "gdk_pixbuf_saturate_and_pixelate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_save = Interop.downcallHandle(
            "gdk_pixbuf_save",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gdk_pixbuf_save_to_buffer = Interop.downcallHandle(
            "gdk_pixbuf_save_to_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gdk_pixbuf_save_to_bufferv = Interop.downcallHandle(
            "gdk_pixbuf_save_to_bufferv",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_save_to_callback = Interop.downcallHandle(
            "gdk_pixbuf_save_to_callback",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gdk_pixbuf_save_to_callbackv = Interop.downcallHandle(
            "gdk_pixbuf_save_to_callbackv",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_save_to_stream = Interop.downcallHandle(
            "gdk_pixbuf_save_to_stream",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gdk_pixbuf_save_to_stream_async = Interop.downcallHandle(
            "gdk_pixbuf_save_to_stream_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gdk_pixbuf_save_to_streamv = Interop.downcallHandle(
            "gdk_pixbuf_save_to_streamv",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_save_to_streamv_async = Interop.downcallHandle(
            "gdk_pixbuf_save_to_streamv_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_savev = Interop.downcallHandle(
            "gdk_pixbuf_savev",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_scale = Interop.downcallHandle(
            "gdk_pixbuf_scale",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_scale_simple = Interop.downcallHandle(
            "gdk_pixbuf_scale_simple",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_set_option = Interop.downcallHandle(
            "gdk_pixbuf_set_option",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_unref = Interop.downcallHandle(
            "gdk_pixbuf_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_get_type = Interop.downcallHandle(
            "gdk_pixbuf_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_calculate_rowstride = Interop.downcallHandle(
            "gdk_pixbuf_calculate_rowstride",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_get_file_info = Interop.downcallHandle(
            "gdk_pixbuf_get_file_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_get_file_info_async = Interop.downcallHandle(
            "gdk_pixbuf_get_file_info_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_get_file_info_finish = Interop.downcallHandle(
            "gdk_pixbuf_get_file_info_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_get_formats = Interop.downcallHandle(
            "gdk_pixbuf_get_formats",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_init_modules = Interop.downcallHandle(
            "gdk_pixbuf_init_modules",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_new_from_stream_async = Interop.downcallHandle(
            "gdk_pixbuf_new_from_stream_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_new_from_stream_at_scale_async = Interop.downcallHandle(
            "gdk_pixbuf_new_from_stream_at_scale_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_save_to_stream_finish = Interop.downcallHandle(
            "gdk_pixbuf_save_to_stream_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
