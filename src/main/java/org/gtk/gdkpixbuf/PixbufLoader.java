package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Incremental image loader.
 * <p>
 * {@code GdkPixbufLoader} provides a way for applications to drive the
 * process of loading an image, by letting them send the image data
 * directly to the loader instead of having the loader read the data
 * from a file. Applications can use this functionality instead of
 * {@code gdk_pixbuf_new_from_file()} or {@code gdk_pixbuf_animation_new_from_file()}
 * when they need to parse image data in small chunks. For example,
 * it should be used when reading an image from a (potentially) slow
 * network connection, or when loading an extremely large file.
 * <p>
 * To use {@code GdkPixbufLoader} to load an image, create a new instance,
 * and call {@link PixbufLoader#write} to send the data
 * to it. When done, {@link PixbufLoader#close} should be
 * called to end the stream and finalize everything.
 * <p>
 * The loader will emit three important signals throughout the process:
 * <ul>
 * <li>{@code GdkPixbuf.PixbufLoader::size-prepared} will be emitted as
 *    soon as the image has enough information to determine the size of
 *    the image to be used. If you want to scale the image while loading
 *    it, you can call {@link PixbufLoader#setSize} in
 *    response to this signal.
 * <li>{@code GdkPixbuf.PixbufLoader::area-prepared} will be emitted as
 *    soon as the pixbuf of the desired has been allocated. You can obtain
 *    the {@code GdkPixbuf} instance by calling {@link PixbufLoader#getPixbuf}.
 *    If you want to use it, simply acquire a reference to it. You can
 *    also call {@code gdk_pixbuf_loader_get_pixbuf()} later to get the same
 *    pixbuf.
 * <li>{@code GdkPixbuf.PixbufLoader::area-updated} will be emitted every
 *    time a region is updated. This way you can update a partially
 *    completed image. Note that you do not know anything about the
 *    completeness of an image from the updated area. For example, in an
 *    interlaced image you will need to make several passes before the
 *    image is done loading.
 * </ul>
 * <p>
 * <strong>Loading an animation</strong><br/>
 * Loading an animation is almost as easy as loading an image. Once the
 * first {@code GdkPixbuf.PixbufLoader::area-prepared} signal has been
 * emitted, you can call {@link PixbufLoader#getAnimation} to
 * get the {@link PixbufAnimation} instance, and then call
 * and {@link PixbufAnimation#getIter} to get a
 * {@link PixbufAnimationIter} to retrieve the pixbuf for the
 * desired time stamp.
 */
public class PixbufLoader extends org.gtk.gobject.Object {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufLoader";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a PixbufLoader proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PixbufLoader(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PixbufLoader if its GType is a (or inherits from) "GdkPixbufLoader".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PixbufLoader} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkPixbufLoader", a ClassCastException will be thrown.
     */
    public static PixbufLoader castFrom(org.gtk.gobject.Object gobject) {
            return new PixbufLoader(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_loader_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf loader object.
     */
    public PixbufLoader() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static Addressable constructNewWithMimeType(@NotNull java.lang.String mimeType) throws GErrorException {
        java.util.Objects.requireNonNull(mimeType, "Parameter 'mimeType' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_loader_new_with_mime_type.invokeExact(
                    Interop.allocateNativeString(mimeType),
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
     * Creates a new pixbuf loader object that always attempts to parse
     * image data as if it were an image of MIME type {@code mime_type}, instead of
     * identifying the type automatically.
     * <p>
     * This function is useful if you want an error if the image isn't the
     * expected MIME type; for loading image formats that can't be reliably
     * identified by looking at the data; or if the user manually forces a
     * specific MIME type.
     * <p>
     * The list of supported mime types depends on what image loaders
     * are installed, but typically "image/png", "image/jpeg", "image/gif",
     * "image/tiff" and "image/x-xpixmap" are among the supported mime types.
     * To obtain the full list of supported mime types, call
     * gdk_pixbuf_format_get_mime_types() on each of the {@link PixbufFormat}
     * structs returned by gdk_pixbuf_get_formats().
     * @param mimeType the mime type to be loaded
     * @return A newly-created pixbuf loader.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static PixbufLoader newWithMimeType(@NotNull java.lang.String mimeType) throws GErrorException {
        return new PixbufLoader(constructNewWithMimeType(mimeType), Ownership.FULL);
    }
    
    private static Addressable constructNewWithType(@NotNull java.lang.String imageType) throws GErrorException {
        java.util.Objects.requireNonNull(imageType, "Parameter 'imageType' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_loader_new_with_type.invokeExact(
                    Interop.allocateNativeString(imageType),
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
     * Creates a new pixbuf loader object that always attempts to parse
     * image data as if it were an image of type {@code image_type}, instead of
     * identifying the type automatically.
     * <p>
     * This function is useful if you want an error if the image isn't the
     * expected type; for loading image formats that can't be reliably
     * identified by looking at the data; or if the user manually forces
     * a specific type.
     * <p>
     * The list of supported image formats depends on what image loaders
     * are installed, but typically "png", "jpeg", "gif", "tiff" and
     * "xpm" are among the supported formats. To obtain the full list of
     * supported image formats, call gdk_pixbuf_format_get_name() on each
     * of the {@link PixbufFormat} structs returned by gdk_pixbuf_get_formats().
     * @param imageType name of the image format to be loaded with the image
     * @return A newly-created pixbuf loader.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static PixbufLoader newWithType(@NotNull java.lang.String imageType) throws GErrorException {
        return new PixbufLoader(constructNewWithType(imageType), Ownership.FULL);
    }
    
    /**
     * Informs a pixbuf loader that no further writes with
     * gdk_pixbuf_loader_write() will occur, so that it can free its
     * internal loading structures.
     * <p>
     * This function also tries to parse any data that hasn't yet been parsed;
     * if the remaining data is partial or corrupt, an error will be returned.
     * <p>
     * If {@code FALSE} is returned, {@code error} will be set to an error from the
     * {@code GDK_PIXBUF_ERROR} or {@code G_FILE_ERROR} domains.
     * <p>
     * If you're just cancelling a load rather than expecting it to be finished,
     * passing {@code NULL} for {@code error} to ignore it is reasonable.
     * <p>
     * Remember that this function does not release a reference on the loader, so
     * you will need to explicitly release any reference you hold.
     * @return {@code TRUE} if all image data written so far was successfully
     *   passed out via the update_area signal
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean close() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_loader_close.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Queries the {@link PixbufAnimation} that a pixbuf loader is currently creating.
     * <p>
     * In general it only makes sense to call this function after the
     * {@code GdkPixbuf.PixbufLoader::area-prepared} signal has been emitted by
     * the loader.
     * <p>
     * If the loader doesn't have enough bytes yet, and hasn't emitted the {@code area-prepared}
     * signal, this function will return {@code NULL}.
     * @return The animation that the loader is
     *   currently loading
     */
    public @Nullable org.gtk.gdkpixbuf.PixbufAnimation getAnimation() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_loader_get_animation.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdkpixbuf.PixbufAnimation(RESULT, Ownership.NONE);
    }
    
    /**
     * Obtains the available information about the format of the
     * currently loading image file.
     * @return A {@link PixbufFormat}
     */
    public @Nullable org.gtk.gdkpixbuf.PixbufFormat getFormat() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_loader_get_format.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdkpixbuf.PixbufFormat(RESULT, Ownership.NONE);
    }
    
    /**
     * Queries the {@link Pixbuf} that a pixbuf loader is currently creating.
     * <p>
     * In general it only makes sense to call this function after the
     * {@code GdkPixbuf.PixbufLoader::area-prepared} signal has been
     * emitted by the loader; this means that enough data has been read
     * to know the size of the image that will be allocated.
     * <p>
     * If the loader has not received enough data via gdk_pixbuf_loader_write(),
     * then this function returns {@code NULL}.
     * <p>
     * The returned pixbuf will be the same in all future calls to the loader,
     * so if you want to keep using it, you should acquire a reference to it.
     * <p>
     * Additionally, if the loader is an animation, it will return the "static
     * image" of the animation (see gdk_pixbuf_animation_get_static_image()).
     * @return The pixbuf that the loader is
     *   creating
     */
    public @Nullable org.gtk.gdkpixbuf.Pixbuf getPixbuf() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_loader_get_pixbuf.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdkpixbuf.Pixbuf(RESULT, Ownership.NONE);
    }
    
    /**
     * Causes the image to be scaled while it is loaded.
     * <p>
     * The desired image size can be determined relative to the original
     * size of the image by calling gdk_pixbuf_loader_set_size() from a
     * signal handler for the ::size-prepared signal.
     * <p>
     * Attempts to set the desired image size  are ignored after the
     * emission of the ::size-prepared signal.
     * @param width The desired width of the image being loaded.
     * @param height The desired height of the image being loaded.
     */
    public void setSize(int width, int height) {
        try {
            DowncallHandles.gdk_pixbuf_loader_set_size.invokeExact(
                    handle(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Parses the next {@code count} bytes in the given image buffer.
     * @param buf Pointer to image data.
     * @param count Length of the {@code buf} buffer in bytes.
     * @return {@code TRUE} if the write was successful, or
     *   {@code FALSE} if the loader cannot parse the buffer
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean write(@NotNull byte[] buf, long count) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(buf, "Parameter 'buf' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_loader_write.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(buf, false),
                    count,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Parses the next contents of the given image buffer.
     * @param buffer The image data as a {@code GBytes} buffer.
     * @return {@code TRUE} if the write was successful, or {@code FALSE} if
     *   the loader cannot parse the buffer
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean writeBytes(@NotNull org.gtk.glib.Bytes buffer) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_loader_write_bytes.invokeExact(
                    handle(),
                    buffer.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_pixbuf_loader_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface AreaPrepared {
        void signalReceived(PixbufLoader source);
    }
    
    /**
     * This signal is emitted when the pixbuf loader has allocated the
     * pixbuf in the desired size.
     * <p>
     * After this signal is emitted, applications can call
     * gdk_pixbuf_loader_get_pixbuf() to fetch the partially-loaded
     * pixbuf.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<PixbufLoader.AreaPrepared> onAreaPrepared(PixbufLoader.AreaPrepared handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("area-prepared"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PixbufLoader.Callbacks.class, "signalPixbufLoaderAreaPrepared",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PixbufLoader.AreaPrepared>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface AreaUpdated {
        void signalReceived(PixbufLoader source, int x, int y, int width, int height);
    }
    
    /**
     * This signal is emitted when a significant area of the image being
     * loaded has been updated.
     * <p>
     * Normally it means that a complete scanline has been read in, but
     * it could be a different area as well.
     * <p>
     * Applications can use this signal to know when to repaint
     * areas of an image that is being loaded.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<PixbufLoader.AreaUpdated> onAreaUpdated(PixbufLoader.AreaUpdated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("area-updated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PixbufLoader.Callbacks.class, "signalPixbufLoaderAreaUpdated",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PixbufLoader.AreaUpdated>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Closed {
        void signalReceived(PixbufLoader source);
    }
    
    /**
     * This signal is emitted when gdk_pixbuf_loader_close() is called.
     * <p>
     * It can be used by different parts of an application to receive
     * notification when an image loader is closed by the code that
     * drives it.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<PixbufLoader.Closed> onClosed(PixbufLoader.Closed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("closed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PixbufLoader.Callbacks.class, "signalPixbufLoaderClosed",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PixbufLoader.Closed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SizePrepared {
        void signalReceived(PixbufLoader source, int width, int height);
    }
    
    /**
     * This signal is emitted when the pixbuf loader has been fed the
     * initial amount of data that is required to figure out the size
     * of the image that it will create.
     * <p>
     * Applications can call gdk_pixbuf_loader_set_size() in response
     * to this signal to set the desired size to which the image
     * should be scaled.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<PixbufLoader.SizePrepared> onSizePrepared(PixbufLoader.SizePrepared handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("size-prepared"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(PixbufLoader.Callbacks.class, "signalPixbufLoaderSizePrepared",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<PixbufLoader.SizePrepared>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link PixbufLoader.Build} object constructs a {@link PixbufLoader} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PixbufLoader} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PixbufLoader} using {@link PixbufLoader#castFrom}.
         * @return A new instance of {@code PixbufLoader} with the properties 
         *         that were set in the Build object.
         */
        public PixbufLoader construct() {
            return PixbufLoader.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PixbufLoader.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_pixbuf_loader_new = Interop.downcallHandle(
            "gdk_pixbuf_loader_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_loader_new_with_mime_type = Interop.downcallHandle(
            "gdk_pixbuf_loader_new_with_mime_type",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_loader_new_with_type = Interop.downcallHandle(
            "gdk_pixbuf_loader_new_with_type",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_loader_close = Interop.downcallHandle(
            "gdk_pixbuf_loader_close",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_loader_get_animation = Interop.downcallHandle(
            "gdk_pixbuf_loader_get_animation",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_loader_get_format = Interop.downcallHandle(
            "gdk_pixbuf_loader_get_format",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_loader_get_pixbuf = Interop.downcallHandle(
            "gdk_pixbuf_loader_get_pixbuf",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_loader_set_size = Interop.downcallHandle(
            "gdk_pixbuf_loader_set_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_loader_write = Interop.downcallHandle(
            "gdk_pixbuf_loader_write",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_loader_write_bytes = Interop.downcallHandle(
            "gdk_pixbuf_loader_write_bytes",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_pixbuf_loader_get_type = Interop.downcallHandle(
            "gdk_pixbuf_loader_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalPixbufLoaderAreaPrepared(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PixbufLoader.AreaPrepared) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PixbufLoader(source, Ownership.NONE));
        }
        
        public static void signalPixbufLoaderAreaUpdated(MemoryAddress source, int x, int y, int width, int height, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PixbufLoader.AreaUpdated) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PixbufLoader(source, Ownership.NONE), x, y, width, height);
        }
        
        public static void signalPixbufLoaderClosed(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PixbufLoader.Closed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PixbufLoader(source, Ownership.NONE));
        }
        
        public static void signalPixbufLoaderSizePrepared(MemoryAddress source, int width, int height, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (PixbufLoader.SizePrepared) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new PixbufLoader(source, Ownership.NONE), width, height);
        }
    }
}
