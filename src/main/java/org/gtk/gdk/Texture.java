package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class Texture extends org.gtk.gobject.Object implements org.gtk.gdk.Paintable, org.gtk.gio.Icon, org.gtk.gio.LoadableIcon {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkTexture";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public Texture(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to Texture if its GType is a (or inherits from) "GdkTexture".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Texture" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkTexture", a ClassCastException will be thrown.
     */
    public static Texture castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkTexture"))) {
            return new Texture(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkTexture");
        }
    }
    
    private static Refcounted constructNewForPixbuf(@NotNull org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        java.util.Objects.requireNonNull(pixbuf, "Parameter 'pixbuf' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gdk_texture_new_for_pixbuf.invokeExact(
                    pixbuf.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new texture object representing the {@code GdkPixbuf}.
     * <p>
     * This function is threadsafe, so that you can e.g. use GTask
     * and {@link org.gtk.gio.Task#runInThread} to avoid blocking the main thread
     * while loading a big image.
     * @param pixbuf a {@code GdkPixbuf}
     * @return a new {@code GdkTexture}
     */
    public static Texture newForPixbuf(@NotNull org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        return new Texture(constructNewForPixbuf(pixbuf));
    }
    
    private static Refcounted constructNewFromBytes(@NotNull org.gtk.glib.Bytes bytes) throws GErrorException {
        java.util.Objects.requireNonNull(bytes, "Parameter 'bytes' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gdk_texture_new_from_bytes.invokeExact(
                    bytes.handle(), (Addressable) GERROR), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * If {@code null} is returned, then {@code error} will be set.
     * <p>
     * This function is threadsafe, so that you can e.g. use GTask
     * and {@link org.gtk.gio.Task#runInThread} to avoid blocking the main thread
     * while loading a big image.
     * @param bytes a {@code GBytes} containing the data to load
     * @return A newly-created {@code GdkTexture}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static Texture newFromBytes(@NotNull org.gtk.glib.Bytes bytes) throws GErrorException {
        return new Texture(constructNewFromBytes(bytes));
    }
    
    private static Refcounted constructNewFromFile(@NotNull org.gtk.gio.File file) throws GErrorException {
        java.util.Objects.requireNonNull(file, "Parameter 'file' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gdk_texture_new_from_file.invokeExact(
                    file.handle(), (Addressable) GERROR), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * If {@code null} is returned, then {@code error} will be set.
     * <p>
     * This function is threadsafe, so that you can e.g. use GTask
     * and {@link org.gtk.gio.Task#runInThread} to avoid blocking the main thread
     * while loading a big image.
     * @param file {@code GFile} to load
     * @return A newly-created {@code GdkTexture}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static Texture newFromFile(@NotNull org.gtk.gio.File file) throws GErrorException {
        return new Texture(constructNewFromFile(file));
    }
    
    private static Refcounted constructNewFromFilename(@NotNull java.lang.String path) throws GErrorException {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gdk_texture_new_from_filename.invokeExact(
                    Interop.allocateNativeString(path), (Addressable) GERROR), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * If {@code null} is returned, then {@code error} will be set.
     * <p>
     * This function is threadsafe, so that you can e.g. use GTask
     * and {@link org.gtk.gio.Task#runInThread} to avoid blocking the main thread
     * while loading a big image.
     * @param path the filename to load
     * @return A newly-created {@code GdkTexture}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static Texture newFromFilename(@NotNull java.lang.String path) throws GErrorException {
        return new Texture(constructNewFromFilename(path));
    }
    
    private static Refcounted constructNewFromResource(@NotNull java.lang.String resourcePath) {
        java.util.Objects.requireNonNull(resourcePath, "Parameter 'resourcePath' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gdk_texture_new_from_resource.invokeExact(
                    Interop.allocateNativeString(resourcePath)), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param resourcePath the path of the resource file
     * @return A newly-created {@code GdkTexture}
     */
    public static Texture newFromResource(@NotNull java.lang.String resourcePath) {
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
     * @param data pointer to enough memory to be filled with the
     *   downloaded data of {@code texture}
     * @param stride rowstride in bytes
     */
    public void download(byte[] data, long stride) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        try {
            DowncallHandles.gdk_texture_download.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(data, false),
                    stride);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the height of the {@code texture}, in pixels.
     * @return the height of the {@code GdkTexture}
     */
    public int getHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_texture_get_height.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the width of {@code texture}, in pixels.
     * @return the width of the {@code GdkTexture}
     */
    public int getWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_texture_get_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param filename the filename to store to
     * @return {@code true} if saving succeeded, {@code false} on failure.
     */
    public boolean saveToPng(@NotNull java.lang.String filename) {
        java.util.Objects.requireNonNull(filename, "Parameter 'filename' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_texture_save_to_png.invokeExact(
                    handle(),
                    Interop.allocateNativeString(filename));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
     * @return a newly allocated {@code GBytes} containing PNG data
     */
    public @NotNull org.gtk.glib.Bytes saveToPngBytes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_texture_save_to_png_bytes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Bytes(Refcounted.get(RESULT, true));
    }
    
    /**
     * Store the given {@code texture} to the {@code filename} as a TIFF file.
     * <p>
     * GTK will attempt to store data without loss.
     * @param filename the filename to store to
     * @return {@code true} if saving succeeded, {@code false} on failure.
     */
    public boolean saveToTiff(@NotNull java.lang.String filename) {
        java.util.Objects.requireNonNull(filename, "Parameter 'filename' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_texture_save_to_tiff.invokeExact(
                    handle(),
                    Interop.allocateNativeString(filename));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
     * @return a newly allocated {@code GBytes} containing TIFF data
     */
    public @NotNull org.gtk.glib.Bytes saveToTiffBytes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_texture_save_to_tiff_bytes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Bytes(Refcounted.get(RESULT, true));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_texture_new_for_pixbuf = Interop.downcallHandle(
            "gdk_texture_new_for_pixbuf",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_texture_new_from_bytes = Interop.downcallHandle(
            "gdk_texture_new_from_bytes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_texture_new_from_file = Interop.downcallHandle(
            "gdk_texture_new_from_file",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_texture_new_from_filename = Interop.downcallHandle(
            "gdk_texture_new_from_filename",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_texture_new_from_resource = Interop.downcallHandle(
            "gdk_texture_new_from_resource",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_texture_download = Interop.downcallHandle(
            "gdk_texture_download",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle gdk_texture_get_height = Interop.downcallHandle(
            "gdk_texture_get_height",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_texture_get_width = Interop.downcallHandle(
            "gdk_texture_get_width",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_texture_save_to_png = Interop.downcallHandle(
            "gdk_texture_save_to_png",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_texture_save_to_png_bytes = Interop.downcallHandle(
            "gdk_texture_save_to_png_bytes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_texture_save_to_tiff = Interop.downcallHandle(
            "gdk_texture_save_to_tiff",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_texture_save_to_tiff_bytes = Interop.downcallHandle(
            "gdk_texture_save_to_tiff_bytes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
