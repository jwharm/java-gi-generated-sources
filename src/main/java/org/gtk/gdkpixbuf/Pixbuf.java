package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A pixel buffer.
 * <p>
 * {@code GdkPixbuf} contains information about an image's pixel data,
 * its color space, bits per sample, width and height, and the
 * rowstride (the number of bytes between the start of one row
 * and the start of the next).
 * <p>
 * <h2>Creating new `GdkPixbuf`</h2>
 * <p>
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
 * You can also copy an existing pixbuf with the {@link Pixbuf#copy}
 * function. This is not the same as just acquiring a reference to
 * the old pixbuf instance: the copy function will actually duplicate
 * the pixel data in memory and create a new {@link Pixbuf} instance
 * for it.
 * <p>
 * <h2>Reference counting</h2>
 * <p>
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
 * <h2>Image Data</h2>
 * <p>
 * Image data in a pixbuf is stored in memory in an uncompressed,
 * packed format. Rows in the image are stored top to bottom, and
 * in each row pixels are stored from left to right.
 * <p>
 * There may be padding at the end of a row.
 * <p>
 * The "rowstride" value of a pixbuf, as returned by {@code GdkPixbuf.Pixbuf.get_rowstride`},
 * indicates the number of bytes between rows.
 * <p>
 * <strong>*NOTE*</strong>: If you are copying raw pixbuf data with {@code memcpy()} note that the
 * last row in the pixbuf may not be as wide as the full rowstride, but rather
 * just as wide as the pixel data needs to be; that is: it is unsafe to do
 * {@code memcpy (dest, pixels, rowstride * height)} to copy a whole pixbuf. Use
 * {@link Pixbuf#copy} instead, or compute the width in bytes of the
 * last row as:
 * <p>
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
 * <p>
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
 * <h2>Loading images</h2>
 * <p>
 * The {@code GdkPixBuf} class provides a simple mechanism for loading
 * an image from a file in synchronous and asynchronous fashion.
 * <p>
 * For GUI applications, it is recommended to use the asynchronous
 * stream API to avoid blocking the control flow of the application.
 * <p>
 * Additionally, {@code GdkPixbuf} provides the {@link PixbufLoader`}
 * API for progressive image loading.
 * <p>
 * <h2>Saving images</h2>
 * <p>
 * The {@code GdkPixbuf} class provides methods for saving image data in
 * a number of file formats. The formatted data can be written to a
 * file or to a memory buffer. {@code GdkPixbuf} can also call a user-defined
 * callback on the data, which allows to e.g. write the image
 * to a socket or store it in a database.
 */
public class Pixbuf extends org.gtk.gobject.Object implements org.gtk.gio.Icon, org.gtk.gio.LoadableIcon {

    public Pixbuf(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Pixbuf */
    public static Pixbuf castFrom(org.gtk.gobject.Object gobject) {
        return new Pixbuf(gobject.refcounted());
    }
    
    static final MethodHandle gdk_pixbuf_new = Interop.downcallHandle(
        "gdk_pixbuf_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_pixbuf_new.invokeExact(colorspace.getValue(), hasAlpha ? 1 : 0, bitsPerSample, width, height), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GdkPixbuf} structure and allocates a buffer for it.
     * <p>
     * If the allocation of the buffer failed, this function will return {@code NULL}.
     * <p>
     * The buffer has an optimal rowstride. Note that the buffer is not cleared;
     * you will have to fill it completely yourself.
     */
    public Pixbuf(Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height) {
        super(constructNew(colorspace, hasAlpha, bitsPerSample, width, height));
    }
    
    static final MethodHandle gdk_pixbuf_new_from_bytes = Interop.downcallHandle(
        "gdk_pixbuf_new_from_bytes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewFromBytes(org.gtk.glib.Bytes data, Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height, int rowstride) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_pixbuf_new_from_bytes.invokeExact(data.handle(), colorspace.getValue(), hasAlpha ? 1 : 0, bitsPerSample, width, height, rowstride), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link Pixbuf} out of in-memory readonly image data.
     * <p>
     * Currently only RGB images with 8 bits per sample are supported.
     * <p>
     * This is the {@code GBytes} variant of gdk_pixbuf_new_from_data(), useful
     * for language bindings.
     */
    public static Pixbuf newFromBytes(org.gtk.glib.Bytes data, Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height, int rowstride) {
        return new Pixbuf(constructNewFromBytes(data, colorspace, hasAlpha, bitsPerSample, width, height, rowstride));
    }
    
    static final MethodHandle gdk_pixbuf_new_from_data = Interop.downcallHandle(
        "gdk_pixbuf_new_from_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromData(byte[] data, Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height, int rowstride, PixbufDestroyNotify destroyFn) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_pixbuf_new_from_data.invokeExact(Interop.allocateNativeArray(data).handle(), colorspace.getValue(), hasAlpha ? 1 : 0, bitsPerSample, width, height, rowstride, 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GdkPixbuf.class, "__cbPixbufDestroyNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(destroyFn.hashCode(), destroyFn))), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public static Pixbuf newFromData(byte[] data, Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height, int rowstride, PixbufDestroyNotify destroyFn) {
        return new Pixbuf(constructNewFromData(data, colorspace, hasAlpha, bitsPerSample, width, height, rowstride, destroyFn));
    }
    
    static final MethodHandle gdk_pixbuf_new_from_file = Interop.downcallHandle(
        "gdk_pixbuf_new_from_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromFile(java.lang.String filename) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_pixbuf_new_from_file.invokeExact(Interop.allocateNativeString(filename).handle(), GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new pixbuf by loading an image from a file.
     * <p>
     * The file format is detected automatically.
     * <p>
     * If {@code NULL} is returned, then {@code error} will be set. Possible errors are:
     * <p>
     * <ul>
     * <li>the file could not be opened
     * <li>there is no loader for the file's format
     * <li>there is not enough memory to allocate the image buffer
     * <li>the image buffer contains invalid data
     * </ul>
     * <p>
     * The error domains are {@code GDK_PIXBUF_ERROR} and {@code G_FILE_ERROR}.
     */
    public static Pixbuf newFromFile(java.lang.String filename) throws GErrorException {
        return new Pixbuf(constructNewFromFile(filename));
    }
    
    static final MethodHandle gdk_pixbuf_new_from_file_at_scale = Interop.downcallHandle(
        "gdk_pixbuf_new_from_file_at_scale",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewFromFileAtScale(java.lang.String filename, int width, int height, boolean preserveAspectRatio) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_pixbuf_new_from_file_at_scale.invokeExact(Interop.allocateNativeString(filename).handle(), width, height, preserveAspectRatio ? 1 : 0, GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new pixbuf by loading an image from a file.
     * <p>
     * The file format is detected automatically.
     * <p>
     * If {@code NULL} is returned, then {@code error} will be set. Possible errors are:
     * <p>
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
     */
    public static Pixbuf newFromFileAtScale(java.lang.String filename, int width, int height, boolean preserveAspectRatio) throws GErrorException {
        return new Pixbuf(constructNewFromFileAtScale(filename, width, height, preserveAspectRatio));
    }
    
    static final MethodHandle gdk_pixbuf_new_from_file_at_size = Interop.downcallHandle(
        "gdk_pixbuf_new_from_file_at_size",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewFromFileAtSize(java.lang.String filename, int width, int height) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_pixbuf_new_from_file_at_size.invokeExact(Interop.allocateNativeString(filename).handle(), width, height, GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new pixbuf by loading an image from a file.
     * <p>
     * The file format is detected automatically.
     * <p>
     * If {@code NULL} is returned, then {@code error} will be set. Possible errors are:
     * <p>
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
     */
    public static Pixbuf newFromFileAtSize(java.lang.String filename, int width, int height) throws GErrorException {
        return new Pixbuf(constructNewFromFileAtSize(filename, width, height));
    }
    
    static final MethodHandle gdk_pixbuf_new_from_inline = Interop.downcallHandle(
        "gdk_pixbuf_new_from_inline",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewFromInline(int dataLength, byte[] data, boolean copyPixels) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_pixbuf_new_from_inline.invokeExact(dataLength, Interop.allocateNativeArray(data).handle(), copyPixels ? 1 : 0, GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * <p>
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
     * <p>
     * <pre>{@code c
     * pixbuf = gdk_pixbuf_new_from_inline (-1, myimage_inline, FALSE, NULL);
     * }</pre>
     * <p>
     * For non-const inline data, you could get out of memory. For untrusted
     * inline data located at runtime, you could have corrupt inline data in
     * addition.
     */
    public static Pixbuf newFromInline(int dataLength, byte[] data, boolean copyPixels) throws GErrorException {
        return new Pixbuf(constructNewFromInline(dataLength, data, copyPixels));
    }
    
    static final MethodHandle gdk_pixbuf_new_from_resource = Interop.downcallHandle(
        "gdk_pixbuf_new_from_resource",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromResource(java.lang.String resourcePath) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_pixbuf_new_from_resource.invokeExact(Interop.allocateNativeString(resourcePath).handle(), GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new pixbuf by loading an image from an resource.
     * <p>
     * The file format is detected automatically. If {@code NULL} is returned, then
     * {@code error} will be set.
     */
    public static Pixbuf newFromResource(java.lang.String resourcePath) throws GErrorException {
        return new Pixbuf(constructNewFromResource(resourcePath));
    }
    
    static final MethodHandle gdk_pixbuf_new_from_resource_at_scale = Interop.downcallHandle(
        "gdk_pixbuf_new_from_resource_at_scale",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewFromResourceAtScale(java.lang.String resourcePath, int width, int height, boolean preserveAspectRatio) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_pixbuf_new_from_resource_at_scale.invokeExact(Interop.allocateNativeString(resourcePath).handle(), width, height, preserveAspectRatio ? 1 : 0, GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public static Pixbuf newFromResourceAtScale(java.lang.String resourcePath, int width, int height, boolean preserveAspectRatio) throws GErrorException {
        return new Pixbuf(constructNewFromResourceAtScale(resourcePath, width, height, preserveAspectRatio));
    }
    
    static final MethodHandle gdk_pixbuf_new_from_stream = Interop.downcallHandle(
        "gdk_pixbuf_new_from_stream",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromStream(org.gtk.gio.InputStream stream, org.gtk.gio.Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_pixbuf_new_from_stream.invokeExact(stream.handle(), cancellable.handle(), GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public static Pixbuf newFromStream(org.gtk.gio.InputStream stream, org.gtk.gio.Cancellable cancellable) throws GErrorException {
        return new Pixbuf(constructNewFromStream(stream, cancellable));
    }
    
    static final MethodHandle gdk_pixbuf_new_from_stream_at_scale = Interop.downcallHandle(
        "gdk_pixbuf_new_from_stream_at_scale",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromStreamAtScale(org.gtk.gio.InputStream stream, int width, int height, boolean preserveAspectRatio, org.gtk.gio.Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_pixbuf_new_from_stream_at_scale.invokeExact(stream.handle(), width, height, preserveAspectRatio ? 1 : 0, cancellable.handle(), GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public static Pixbuf newFromStreamAtScale(org.gtk.gio.InputStream stream, int width, int height, boolean preserveAspectRatio, org.gtk.gio.Cancellable cancellable) throws GErrorException {
        return new Pixbuf(constructNewFromStreamAtScale(stream, width, height, preserveAspectRatio, cancellable));
    }
    
    static final MethodHandle gdk_pixbuf_new_from_stream_finish = Interop.downcallHandle(
        "gdk_pixbuf_new_from_stream_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromStreamFinish(org.gtk.gio.AsyncResult asyncResult) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_pixbuf_new_from_stream_finish.invokeExact(asyncResult.handle(), GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous pixbuf creation operation started with
     * gdk_pixbuf_new_from_stream_async().
     */
    public static Pixbuf newFromStreamFinish(org.gtk.gio.AsyncResult asyncResult) throws GErrorException {
        return new Pixbuf(constructNewFromStreamFinish(asyncResult));
    }
    
    static final MethodHandle gdk_pixbuf_new_from_xpm_data = Interop.downcallHandle(
        "gdk_pixbuf_new_from_xpm_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromXpmData(java.lang.String[] data) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_pixbuf_new_from_xpm_data.invokeExact(Interop.allocateNativeArray(data).handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new pixbuf by parsing XPM data in memory.
     * <p>
     * This data is commonly the result of including an XPM file into a
     * program's C source.
     */
    public static Pixbuf newFromXpmData(java.lang.String[] data) {
        return new Pixbuf(constructNewFromXpmData(data));
    }
    
    static final MethodHandle gdk_pixbuf_add_alpha = Interop.downcallHandle(
        "gdk_pixbuf_add_alpha",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE)
    );
    
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
     */
    public Pixbuf addAlpha(boolean substituteColor, byte r, byte g, byte b) {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_add_alpha.invokeExact(handle(), substituteColor ? 1 : 0, r, g, b);
            return new Pixbuf(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_apply_embedded_orientation = Interop.downcallHandle(
        "gdk_pixbuf_apply_embedded_orientation",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public Pixbuf applyEmbeddedOrientation() {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_apply_embedded_orientation.invokeExact(handle());
            return new Pixbuf(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_composite = Interop.downcallHandle(
        "gdk_pixbuf_composite",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
     * ![](composite.png)
     */
    public void composite(Pixbuf dest, int destX, int destY, int destWidth, int destHeight, double offsetX, double offsetY, double scaleX, double scaleY, InterpType interpType, int overallAlpha) {
        try {
            gdk_pixbuf_composite.invokeExact(handle(), dest.handle(), destX, destY, destWidth, destHeight, offsetX, offsetY, scaleX, scaleY, interpType.getValue(), overallAlpha);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_composite_color = Interop.downcallHandle(
        "gdk_pixbuf_composite_color",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
     */
    public void compositeColor(Pixbuf dest, int destX, int destY, int destWidth, int destHeight, double offsetX, double offsetY, double scaleX, double scaleY, InterpType interpType, int overallAlpha, int checkX, int checkY, int checkSize, int color1, int color2) {
        try {
            gdk_pixbuf_composite_color.invokeExact(handle(), dest.handle(), destX, destY, destWidth, destHeight, offsetX, offsetY, scaleX, scaleY, interpType.getValue(), overallAlpha, checkX, checkY, checkSize, color1, color2);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_composite_color_simple = Interop.downcallHandle(
        "gdk_pixbuf_composite_color_simple",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new pixbuf by scaling {@code src} to {@code dest_width} x {@code dest_height}
     * and alpha blending the result with a checkboard of colors {@code color1}
     * and {@code color2}.
     */
    public Pixbuf compositeColorSimple(int destWidth, int destHeight, InterpType interpType, int overallAlpha, int checkSize, int color1, int color2) {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_composite_color_simple.invokeExact(handle(), destWidth, destHeight, interpType.getValue(), overallAlpha, checkSize, color1, color2);
            return new Pixbuf(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_copy = Interop.downcallHandle(
        "gdk_pixbuf_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@code GdkPixbuf} with a copy of the information in the specified
     * {@code pixbuf}.
     * <p>
     * Note that this does not copy the options set on the original {@code GdkPixbuf},
     * use gdk_pixbuf_copy_options() for this.
     */
    public Pixbuf copy() {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_copy.invokeExact(handle());
            return new Pixbuf(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_copy_area = Interop.downcallHandle(
        "gdk_pixbuf_copy_area",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Copies a rectangular area from {@code src_pixbuf} to {@code dest_pixbuf}.
     * <p>
     * Conversion of pixbuf formats is done automatically.
     * <p>
     * If the source rectangle overlaps the destination rectangle on the
     * same pixbuf, it will be overwritten during the copy operation.
     * Therefore, you can not use this function to scroll a pixbuf.
     */
    public void copyArea(int srcX, int srcY, int width, int height, Pixbuf destPixbuf, int destX, int destY) {
        try {
            gdk_pixbuf_copy_area.invokeExact(handle(), srcX, srcY, width, height, destPixbuf.handle(), destX, destY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_copy_options = Interop.downcallHandle(
        "gdk_pixbuf_copy_options",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies the key/value pair options attached to a {@code GdkPixbuf} to another
     * {@code GdkPixbuf}.
     * <p>
     * This is useful to keep original metadata after having manipulated
     * a file. However be careful to remove metadata which you've already
     * applied, such as the "orientation" option after rotating the image.
     */
    public boolean copyOptions(Pixbuf destPixbuf) {
        try {
            var RESULT = (int) gdk_pixbuf_copy_options.invokeExact(handle(), destPixbuf.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_fill = Interop.downcallHandle(
        "gdk_pixbuf_fill",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Clears a pixbuf to the given RGBA value, converting the RGBA value into
     * the pixbuf's pixel format.
     * <p>
     * The alpha component will be ignored if the pixbuf doesn't have an alpha
     * channel.
     */
    public void fill(int pixel) {
        try {
            gdk_pixbuf_fill.invokeExact(handle(), pixel);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_flip = Interop.downcallHandle(
        "gdk_pixbuf_flip",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Flips a pixbuf horizontally or vertically and returns the
     * result in a new pixbuf.
     */
    public Pixbuf flip(boolean horizontal) {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_flip.invokeExact(handle(), horizontal ? 1 : 0);
            return new Pixbuf(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_get_bits_per_sample = Interop.downcallHandle(
        "gdk_pixbuf_get_bits_per_sample",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries the number of bits per color sample in a pixbuf.
     */
    public int getBitsPerSample() {
        try {
            var RESULT = (int) gdk_pixbuf_get_bits_per_sample.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_get_byte_length = Interop.downcallHandle(
        "gdk_pixbuf_get_byte_length",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the length of the pixel data, in bytes.
     */
    public long getByteLength() {
        try {
            var RESULT = (long) gdk_pixbuf_get_byte_length.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_get_colorspace = Interop.downcallHandle(
        "gdk_pixbuf_get_colorspace",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries the color space of a pixbuf.
     */
    public Colorspace getColorspace() {
        try {
            var RESULT = (int) gdk_pixbuf_get_colorspace.invokeExact(handle());
            return new Colorspace(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_get_has_alpha = Interop.downcallHandle(
        "gdk_pixbuf_get_has_alpha",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries whether a pixbuf has an alpha channel (opacity information).
     */
    public boolean getHasAlpha() {
        try {
            var RESULT = (int) gdk_pixbuf_get_has_alpha.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_get_height = Interop.downcallHandle(
        "gdk_pixbuf_get_height",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries the height of a pixbuf.
     */
    public int getHeight() {
        try {
            var RESULT = (int) gdk_pixbuf_get_height.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_get_n_channels = Interop.downcallHandle(
        "gdk_pixbuf_get_n_channels",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries the number of channels of a pixbuf.
     */
    public int getNChannels() {
        try {
            var RESULT = (int) gdk_pixbuf_get_n_channels.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_get_option = Interop.downcallHandle(
        "gdk_pixbuf_get_option",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public java.lang.String getOption(java.lang.String key) {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_get_option.invokeExact(handle(), Interop.allocateNativeString(key).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_get_options = Interop.downcallHandle(
        "gdk_pixbuf_get_options",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a {@code GHashTable} with a list of all the options that may have been
     * attached to the {@code pixbuf} when it was loaded, or that may have been
     * attached by another function using {@link Pixbuf#setOption}.
     */
    public org.gtk.glib.HashTable getOptions() {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_get_options.invokeExact(handle());
            return new org.gtk.glib.HashTable(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_get_pixels = Interop.downcallHandle(
        "gdk_pixbuf_get_pixels",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Queries a pointer to the pixel data of a pixbuf.
     * <p>
     * This function will cause an implicit copy of the pixbuf data if the
     * pixbuf was created from read-only data.
     * <p>
     * Please see the section on <a href="class.Pixbuf.html#image-data">image data</a> for information
     * about how the pixel data is stored in memory.
     */
    public PointerByte getPixels() {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_get_pixels.invokeExact(handle());
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_get_pixels_with_length = Interop.downcallHandle(
        "gdk_pixbuf_get_pixels_with_length",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries a pointer to the pixel data of a pixbuf.
     * <p>
     * This function will cause an implicit copy of the pixbuf data if the
     * pixbuf was created from read-only data.
     * <p>
     * Please see the section on <a href="class.Pixbuf.html#image-data">image data</a> for information
     * about how the pixel data is stored in memory.
     */
    public PointerByte getPixelsWithLength(PointerInteger length) {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_get_pixels_with_length.invokeExact(handle(), length.handle());
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_get_rowstride = Interop.downcallHandle(
        "gdk_pixbuf_get_rowstride",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries the rowstride of a pixbuf, which is the number of bytes between
     * the start of a row and the start of the next row.
     */
    public int getRowstride() {
        try {
            var RESULT = (int) gdk_pixbuf_get_rowstride.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_get_width = Interop.downcallHandle(
        "gdk_pixbuf_get_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries the width of a pixbuf.
     */
    public int getWidth() {
        try {
            var RESULT = (int) gdk_pixbuf_get_width.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_new_subpixbuf = Interop.downcallHandle(
        "gdk_pixbuf_new_subpixbuf",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
     */
    public Pixbuf newSubpixbuf(int srcX, int srcY, int width, int height) {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_new_subpixbuf.invokeExact(handle(), srcX, srcY, width, height);
            return new Pixbuf(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_read_pixel_bytes = Interop.downcallHandle(
        "gdk_pixbuf_read_pixel_bytes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Provides a {@link org.gtk.glib.Bytes} buffer containing the raw pixel data; the data
     * must not be modified.
     * <p>
     * This function allows skipping the implicit copy that must be made
     * if gdk_pixbuf_get_pixels() is called on a read-only pixbuf.
     */
    public org.gtk.glib.Bytes readPixelBytes() {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_read_pixel_bytes.invokeExact(handle());
            return new org.gtk.glib.Bytes(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_read_pixels = Interop.downcallHandle(
        "gdk_pixbuf_read_pixels",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Provides a read-only pointer to the raw pixel data.
     * <p>
     * This function allows skipping the implicit copy that must be made
     * if gdk_pixbuf_get_pixels() is called on a read-only pixbuf.
     */
    public PointerByte readPixels() {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_read_pixels.invokeExact(handle());
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_remove_option = Interop.downcallHandle(
        "gdk_pixbuf_remove_option",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the key/value pair option attached to a {@code GdkPixbuf}.
     */
    public boolean removeOption(java.lang.String key) {
        try {
            var RESULT = (int) gdk_pixbuf_remove_option.invokeExact(handle(), Interop.allocateNativeString(key).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_rotate_simple = Interop.downcallHandle(
        "gdk_pixbuf_rotate_simple",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Rotates a pixbuf by a multiple of 90 degrees, and returns the
     * result in a new pixbuf.
     * <p>
     * If {@code angle} is 0, this function will return a copy of {@code src}.
     */
    public Pixbuf rotateSimple(PixbufRotation angle) {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_rotate_simple.invokeExact(handle(), angle.getValue());
            return new Pixbuf(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_saturate_and_pixelate = Interop.downcallHandle(
        "gdk_pixbuf_saturate_and_pixelate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT)
    );
    
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
     */
    public void saturateAndPixelate(Pixbuf dest, float saturation, boolean pixelate) {
        try {
            gdk_pixbuf_saturate_and_pixelate.invokeExact(handle(), dest.handle(), saturation, pixelate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_save_to_bufferv = Interop.downcallHandle(
        "gdk_pixbuf_save_to_bufferv",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Vector version of {@code gdk_pixbuf_save_to_buffer()}.
     * <p>
     * Saves pixbuf to a new buffer in format {@code type}, which is currently "jpeg",
     * "tiff", "png", "ico" or "bmp".
     * <p>
     * See {@link Pixbuf#saveToBuffer} for more details.
     */
    public boolean saveToBufferv(PointerByte buffer, PointerLong bufferSize, java.lang.String type, java.lang.String[] optionKeys, java.lang.String[] optionValues) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gdk_pixbuf_save_to_bufferv.invokeExact(handle(), buffer.handle(), bufferSize.handle(), Interop.allocateNativeString(type).handle(), Interop.allocateNativeArray(optionKeys).handle(), Interop.allocateNativeArray(optionValues).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_save_to_callbackv = Interop.downcallHandle(
        "gdk_pixbuf_save_to_callbackv",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Vector version of {@code gdk_pixbuf_save_to_callback()}.
     * <p>
     * Saves pixbuf to a callback in format {@code type}, which is currently "jpeg",
     * "png", "tiff", "ico" or "bmp".
     * <p>
     * If {@code error} is set, {@code FALSE} will be returned.
     * <p>
     * See {@link Pixbuf#saveToCallback} for more details.
     */
    public boolean saveToCallbackv(PixbufSaveFunc saveFunc, java.lang.String type, java.lang.String[] optionKeys, java.lang.String[] optionValues) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gdk_pixbuf_save_to_callbackv.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GdkPixbuf.class, "__cbPixbufSaveFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, long.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(saveFunc.hashCode(), saveFunc)), Interop.allocateNativeString(type).handle(), Interop.allocateNativeArray(optionKeys).handle(), Interop.allocateNativeArray(optionValues).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_save_to_streamv = Interop.downcallHandle(
        "gdk_pixbuf_save_to_streamv",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Saves {@code pixbuf} to an output stream.
     * <p>
     * Supported file formats are currently "jpeg", "tiff", "png", "ico" or
     * "bmp".
     * <p>
     * See {@link Pixbuf#saveToStream} for more details.
     */
    public boolean saveToStreamv(org.gtk.gio.OutputStream stream, java.lang.String type, java.lang.String[] optionKeys, java.lang.String[] optionValues, org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gdk_pixbuf_save_to_streamv.invokeExact(handle(), stream.handle(), Interop.allocateNativeString(type).handle(), Interop.allocateNativeArray(optionKeys).handle(), Interop.allocateNativeArray(optionValues).handle(), cancellable.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_save_to_streamv_async = Interop.downcallHandle(
        "gdk_pixbuf_save_to_streamv_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void saveToStreamvAsync(org.gtk.gio.OutputStream stream, java.lang.String type, java.lang.String[] optionKeys, java.lang.String[] optionValues, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gdk_pixbuf_save_to_streamv_async.invokeExact(handle(), stream.handle(), Interop.allocateNativeString(type).handle(), Interop.allocateNativeArray(optionKeys).handle(), Interop.allocateNativeArray(optionValues).handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GdkPixbuf.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_savev = Interop.downcallHandle(
        "gdk_pixbuf_savev",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Vector version of {@code gdk_pixbuf_save()}.
     * <p>
     * Saves pixbuf to a file in {@code type}, which is currently "jpeg", "png", "tiff", "ico" or "bmp".
     * <p>
     * If {@code error} is set, {@code FALSE} will be returned.
     * <p>
     * See {@link Pixbuf#save} for more details.
     */
    public boolean savev(java.lang.String filename, java.lang.String type, java.lang.String[] optionKeys, java.lang.String[] optionValues) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gdk_pixbuf_savev.invokeExact(handle(), Interop.allocateNativeString(filename).handle(), Interop.allocateNativeString(type).handle(), Interop.allocateNativeArray(optionKeys).handle(), Interop.allocateNativeArray(optionValues).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_scale = Interop.downcallHandle(
        "gdk_pixbuf_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
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
     */
    public void scale(Pixbuf dest, int destX, int destY, int destWidth, int destHeight, double offsetX, double offsetY, double scaleX, double scaleY, InterpType interpType) {
        try {
            gdk_pixbuf_scale.invokeExact(handle(), dest.handle(), destX, destY, destWidth, destHeight, offsetX, offsetY, scaleX, scaleY, interpType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_scale_simple = Interop.downcallHandle(
        "gdk_pixbuf_scale_simple",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
     */
    public Pixbuf scaleSimple(int destWidth, int destHeight, InterpType interpType) {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_scale_simple.invokeExact(handle(), destWidth, destHeight, interpType.getValue());
            return new Pixbuf(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_set_option = Interop.downcallHandle(
        "gdk_pixbuf_set_option",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Attaches a key/value pair as an option to a {@code GdkPixbuf}.
     * <p>
     * If {@code key} already exists in the list of options attached to the {@code pixbuf},
     * the new value is ignored and {@code FALSE} is returned.
     */
    public boolean setOption(java.lang.String key, java.lang.String value) {
        try {
            var RESULT = (int) gdk_pixbuf_set_option.invokeExact(handle(), Interop.allocateNativeString(key).handle(), Interop.allocateNativeString(value).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_calculate_rowstride = Interop.downcallHandle(
        "gdk_pixbuf_calculate_rowstride",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Calculates the rowstride that an image created with those values would
     * have.
     * <p>
     * This function is useful for front-ends and backends that want to check
     * image values without needing to create a {@code GdkPixbuf}.
     */
    public static int calculateRowstride(Colorspace colorspace, boolean hasAlpha, int bitsPerSample, int width, int height) {
        try {
            var RESULT = (int) gdk_pixbuf_calculate_rowstride.invokeExact(colorspace.getValue(), hasAlpha ? 1 : 0, bitsPerSample, width, height);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_get_file_info = Interop.downcallHandle(
        "gdk_pixbuf_get_file_info",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Parses an image file far enough to determine its format and size.
     */
    public static PixbufFormat getFileInfo(java.lang.String filename, PointerInteger width, PointerInteger height) {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_get_file_info.invokeExact(Interop.allocateNativeString(filename).handle(), width.handle(), height.handle());
            return new PixbufFormat(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_get_file_info_async = Interop.downcallHandle(
        "gdk_pixbuf_get_file_info_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public static void getFileInfoAsync(java.lang.String filename, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gdk_pixbuf_get_file_info_async.invokeExact(Interop.allocateNativeString(filename).handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GdkPixbuf.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_get_file_info_finish = Interop.downcallHandle(
        "gdk_pixbuf_get_file_info_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous pixbuf parsing operation started with
     * gdk_pixbuf_get_file_info_async().
     */
    public static PixbufFormat getFileInfoFinish(org.gtk.gio.AsyncResult asyncResult, PointerInteger width, PointerInteger height) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_get_file_info_finish.invokeExact(asyncResult.handle(), width.handle(), height.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PixbufFormat(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_get_formats = Interop.downcallHandle(
        "gdk_pixbuf_get_formats",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the available information about the image formats supported
     * by GdkPixbuf.
     */
    public static org.gtk.glib.SList getFormats() {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_get_formats.invokeExact();
            return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_init_modules = Interop.downcallHandle(
        "gdk_pixbuf_init_modules",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
     */
    public static boolean initModules(java.lang.String path) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gdk_pixbuf_init_modules.invokeExact(Interop.allocateNativeString(path).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_new_from_stream_async = Interop.downcallHandle(
        "gdk_pixbuf_new_from_stream_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new pixbuf by asynchronously loading an image from an input stream.
     * <p>
     * For more details see gdk_pixbuf_new_from_stream(), which is the synchronous
     * version of this function.
     * <p>
     * When the operation is finished, {@code callback} will be called in the main thread.
     * You can then call gdk_pixbuf_new_from_stream_finish() to get the result of
     * the operation.
     */
    public static void newFromStreamAsync(org.gtk.gio.InputStream stream, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gdk_pixbuf_new_from_stream_async.invokeExact(stream.handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GdkPixbuf.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_new_from_stream_at_scale_async = Interop.downcallHandle(
        "gdk_pixbuf_new_from_stream_at_scale_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new pixbuf by asynchronously loading an image from an input stream.
     * <p>
     * For more details see gdk_pixbuf_new_from_stream_at_scale(), which is the synchronous
     * version of this function.
     * <p>
     * When the operation is finished, {@code callback} will be called in the main thread.
     * You can then call gdk_pixbuf_new_from_stream_finish() to get the result of the operation.
     */
    public static void newFromStreamAtScaleAsync(org.gtk.gio.InputStream stream, int width, int height, boolean preserveAspectRatio, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gdk_pixbuf_new_from_stream_at_scale_async.invokeExact(stream.handle(), width, height, preserveAspectRatio ? 1 : 0, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GdkPixbuf.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_save_to_stream_finish = Interop.downcallHandle(
        "gdk_pixbuf_save_to_stream_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous pixbuf save operation started with
     * gdk_pixbuf_save_to_stream_async().
     */
    public static boolean saveToStreamFinish(org.gtk.gio.AsyncResult asyncResult) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gdk_pixbuf_save_to_stream_finish.invokeExact(asyncResult.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
