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
 * {@link org.gtk.gobject.GObject#ref}, and consequently, it is a thread-safe object.
 */
public class Texture extends org.gtk.gobject.GObject implements org.gtk.gdk.Paintable, org.gtk.gio.Icon, org.gtk.gio.LoadableIcon {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkTexture";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Texture proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Texture(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Texture> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Texture(input);
    
    private static MemoryAddress constructNewForPixbuf(org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_texture_new_for_pixbuf.invokeExact(pixbuf.handle());
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
    public static Texture newForPixbuf(org.gtk.gdkpixbuf.Pixbuf pixbuf) {
        var RESULT = constructNewForPixbuf(pixbuf);
        var OBJECT = (org.gtk.gdk.Texture) Interop.register(RESULT, org.gtk.gdk.Texture.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromBytes(org.gtk.glib.Bytes bytes) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gdk_texture_new_from_bytes.invokeExact(bytes.handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
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
    public static Texture newFromBytes(org.gtk.glib.Bytes bytes) throws GErrorException {
        var RESULT = constructNewFromBytes(bytes);
        var OBJECT = (org.gtk.gdk.Texture) Interop.register(RESULT, org.gtk.gdk.Texture.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromFile(org.gtk.gio.File file) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gdk_texture_new_from_file.invokeExact(file.handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
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
    public static Texture newFromFile(org.gtk.gio.File file) throws GErrorException {
        var RESULT = constructNewFromFile(file);
        var OBJECT = (org.gtk.gdk.Texture) Interop.register(RESULT, org.gtk.gdk.Texture.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromFilename(java.lang.String path) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gdk_texture_new_from_filename.invokeExact(Marshal.stringToAddress.marshal(path, SCOPE),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
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
    public static Texture newFromFilename(java.lang.String path) throws GErrorException {
        var RESULT = constructNewFromFilename(path);
        var OBJECT = (org.gtk.gdk.Texture) Interop.register(RESULT, org.gtk.gdk.Texture.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFromResource(java.lang.String resourcePath) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gdk_texture_new_from_resource.invokeExact(Marshal.stringToAddress.marshal(resourcePath, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
    public static Texture newFromResource(java.lang.String resourcePath) {
        var RESULT = constructNewFromResource(resourcePath);
        var OBJECT = (org.gtk.gdk.Texture) Interop.register(RESULT, org.gtk.gdk.Texture.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gdk_texture_download.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(data, false, SCOPE),
                        stride);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Returns the height of the {@code texture}, in pixels.
     * @return the height of the {@code GdkTexture}
     */
    public int getHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_texture_get_height.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gdk_texture_get_width.invokeExact(handle());
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
    public boolean saveToPng(java.lang.String filename) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gdk_texture_save_to_png.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(filename, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public org.gtk.glib.Bytes saveToPngBytes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_texture_save_to_png_bytes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.Bytes.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Store the given {@code texture} to the {@code filename} as a TIFF file.
     * <p>
     * GTK will attempt to store data without loss.
     * @param filename the filename to store to
     * @return {@code true} if saving succeeded, {@code false} on failure.
     */
    public boolean saveToTiff(java.lang.String filename) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gdk_texture_save_to_tiff.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(filename, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public org.gtk.glib.Bytes saveToTiffBytes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_texture_save_to_tiff_bytes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.Bytes.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_texture_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Texture.Builder} object constructs a {@link Texture} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Texture.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Texture} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Texture}.
         * @return A new instance of {@code Texture} with the properties 
         *         that were set in the Builder object.
         */
        public Texture build() {
            return (Texture) org.gtk.gobject.GObject.newWithProperties(
                Texture.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The height of the texture, in pixels.
         * @param height The value for the {@code height} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHeight(int height) {
            names.add("height");
            values.add(org.gtk.gobject.Value.create(height));
            return this;
        }
        
        /**
         * The width of the texture, in pixels.
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
        
        private static final MethodHandle gdk_texture_new_for_pixbuf = Interop.downcallHandle(
                "gdk_texture_new_for_pixbuf",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_texture_new_from_bytes = Interop.downcallHandle(
                "gdk_texture_new_from_bytes",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_texture_new_from_file = Interop.downcallHandle(
                "gdk_texture_new_from_file",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_texture_new_from_filename = Interop.downcallHandle(
                "gdk_texture_new_from_filename",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_texture_new_from_resource = Interop.downcallHandle(
                "gdk_texture_new_from_resource",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_texture_download = Interop.downcallHandle(
                "gdk_texture_download",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gdk_texture_get_height = Interop.downcallHandle(
                "gdk_texture_get_height",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_texture_get_width = Interop.downcallHandle(
                "gdk_texture_get_width",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_texture_save_to_png = Interop.downcallHandle(
                "gdk_texture_save_to_png",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_texture_save_to_png_bytes = Interop.downcallHandle(
                "gdk_texture_save_to_png_bytes",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_texture_save_to_tiff = Interop.downcallHandle(
                "gdk_texture_save_to_tiff",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_texture_save_to_tiff_bytes = Interop.downcallHandle(
                "gdk_texture_save_to_tiff_bytes",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gdk_texture_get_type = Interop.downcallHandle(
                "gdk_texture_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gdk_texture_get_type != null;
    }
}
