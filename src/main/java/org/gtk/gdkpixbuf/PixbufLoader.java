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
public class PixbufLoader extends org.gtk.gobject.GObject {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufLoader";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a PixbufLoader proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PixbufLoader(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PixbufLoader> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PixbufLoader(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewWithMimeType(java.lang.String mimeType) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_loader_new_with_mime_type.invokeExact(Marshal.stringToAddress.marshal(mimeType, SCOPE),(Addressable) GERROR);
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
    public static PixbufLoader newWithMimeType(java.lang.String mimeType) throws GErrorException {
        var RESULT = constructNewWithMimeType(mimeType);
        var OBJECT = (org.gtk.gdkpixbuf.PixbufLoader) Interop.register(RESULT, org.gtk.gdkpixbuf.PixbufLoader.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewWithType(java.lang.String imageType) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_loader_new_with_type.invokeExact(Marshal.stringToAddress.marshal(imageType, SCOPE),(Addressable) GERROR);
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
    public static PixbufLoader newWithType(java.lang.String imageType) throws GErrorException {
        var RESULT = constructNewWithType(imageType);
        var OBJECT = (org.gtk.gdkpixbuf.PixbufLoader) Interop.register(RESULT, org.gtk.gdkpixbuf.PixbufLoader.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gdk_pixbuf_loader_close.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_loader_get_animation.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdkpixbuf.PixbufAnimation) Interop.register(RESULT, org.gtk.gdkpixbuf.PixbufAnimation.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Obtains the available information about the format of the
     * currently loading image file.
     * @return A {@link PixbufFormat}
     */
    public @Nullable org.gtk.gdkpixbuf.PixbufFormat getFormat() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_loader_get_format.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdkpixbuf.PixbufFormat.fromAddress.marshal(RESULT, null);
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
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_loader_get_pixbuf.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdkpixbuf.Pixbuf) Interop.register(RESULT, org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(RESULT, null);
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
    public boolean write(byte[] buf, long count) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gdk_pixbuf_loader_write.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(buf, false, SCOPE),
                        count,
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Parses the next contents of the given image buffer.
     * @param buffer The image data as a {@code GBytes} buffer.
     * @return {@code TRUE} if the write was successful, or {@code FALSE} if
     *   the loader cannot parse the buffer
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean writeBytes(org.gtk.glib.Bytes buffer) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
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
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_pixbuf_loader_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code AreaPrepared} callback.
     */
    @FunctionalInterface
    public interface AreaPrepared {
    
        /**
         * This signal is emitted when the pixbuf loader has allocated the
         * pixbuf in the desired size.
         * <p>
         * After this signal is emitted, applications can call
         * gdk_pixbuf_loader_get_pixbuf() to fetch the partially-loaded
         * pixbuf.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourcePixbufLoader) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AreaPrepared.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("area-prepared", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code AreaUpdated} callback.
     */
    @FunctionalInterface
    public interface AreaUpdated {
    
        /**
         * This signal is emitted when a significant area of the image being
         * loaded has been updated.
         * <p>
         * Normally it means that a complete scanline has been read in, but
         * it could be a different area as well.
         * <p>
         * Applications can use this signal to know when to repaint
         * areas of an image that is being loaded.
         */
        void run(int x, int y, int width, int height);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourcePixbufLoader, int x, int y, int width, int height) {
            run(x, y, width, height);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AreaUpdated.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("area-updated", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Closed} callback.
     */
    @FunctionalInterface
    public interface Closed {
    
        /**
         * This signal is emitted when gdk_pixbuf_loader_close() is called.
         * <p>
         * It can be used by different parts of an application to receive
         * notification when an image loader is closed by the code that
         * drives it.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourcePixbufLoader) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Closed.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("closed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code SizePrepared} callback.
     */
    @FunctionalInterface
    public interface SizePrepared {
    
        /**
         * This signal is emitted when the pixbuf loader has been fed the
         * initial amount of data that is required to figure out the size
         * of the image that it will create.
         * <p>
         * Applications can call gdk_pixbuf_loader_set_size() in response
         * to this signal to set the desired size to which the image
         * should be scaled.
         */
        void run(int width, int height);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourcePixbufLoader, int width, int height) {
            run(width, height);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SizePrepared.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("size-prepared", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link PixbufLoader.Builder} object constructs a {@link PixbufLoader} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PixbufLoader.Builder#build()}. 
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
         * Finish building the {@link PixbufLoader} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PixbufLoader}.
         * @return A new instance of {@code PixbufLoader} with the properties 
         *         that were set in the Builder object.
         */
        public PixbufLoader build() {
            return (PixbufLoader) org.gtk.gobject.GObject.newWithProperties(
                PixbufLoader.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gdk_pixbuf_loader_get_type != null;
    }
}
