package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque object representing an animation.
 * <p>
 * The GdkPixBuf library provides a simple mechanism to load and
 * represent animations. An animation is conceptually a series of
 * frames to be displayed over time.
 * <p>
 * The animation may not be represented as a series of frames
 * internally; for example, it may be stored as a sprite and
 * instructions for moving the sprite around a background.
 * <p>
 * To display an animation you don't need to understand its
 * representation, however; you just ask {@code GdkPixbuf} what should
 * be displayed at a given point in time.
 */
public class PixbufAnimation extends org.gtk.gobject.Object {
    
    static {
        GdkPixbuf.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufAnimation";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public PixbufAnimation(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to PixbufAnimation if its GType is a (or inherits from) "GdkPixbufAnimation".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "PixbufAnimation" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkPixbufAnimation", a ClassCastException will be thrown.
     */
    public static PixbufAnimation castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkPixbufAnimation"))) {
            return new PixbufAnimation(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkPixbufAnimation");
        }
    }
    
    private static Refcounted constructNewFromFile(@NotNull java.lang.String filename) throws GErrorException {
        java.util.Objects.requireNonNull(filename, "Parameter 'filename' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gdk_pixbuf_animation_new_from_file.invokeExact(
                    Interop.allocateNativeString(filename), (Addressable) GERROR), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new animation by loading it from a file.
     * <p>
     * The file format is detected automatically.
     * <p>
     * If the file's format does not support multi-frame images, then an animation
     * with a single frame will be created.
     * <p>
     * Possible errors are in the {@code GDK_PIXBUF_ERROR} and {@code G_FILE_ERROR} domains.
     * @param filename Name of file to load, in the GLib file
     *   name encoding
     * @return A newly-created animation
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static PixbufAnimation newFromFile(@NotNull java.lang.String filename) throws GErrorException {
        return new PixbufAnimation(constructNewFromFile(filename));
    }
    
    private static Refcounted constructNewFromResource(@NotNull java.lang.String resourcePath) throws GErrorException {
        java.util.Objects.requireNonNull(resourcePath, "Parameter 'resourcePath' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gdk_pixbuf_animation_new_from_resource.invokeExact(
                    Interop.allocateNativeString(resourcePath), (Addressable) GERROR), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf animation by loading an image from an resource.
     * <p>
     * The file format is detected automatically. If {@code NULL} is returned, then
     * {@code error} will be set.
     * @param resourcePath the path of the resource file
     * @return A newly-created animation
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static PixbufAnimation newFromResource(@NotNull java.lang.String resourcePath) throws GErrorException {
        return new PixbufAnimation(constructNewFromResource(resourcePath));
    }
    
    private static Refcounted constructNewFromStream(@NotNull org.gtk.gio.InputStream stream, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        java.util.Objects.requireNonNull(stream, "Parameter 'stream' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gdk_pixbuf_animation_new_from_stream.invokeExact(
                    stream.handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()), (Addressable) GERROR), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new animation by loading it from an input stream.
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
     * @param cancellable optional {@code GCancellable} object
     * @return A newly-created animation
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static PixbufAnimation newFromStream(@NotNull org.gtk.gio.InputStream stream, @Nullable org.gtk.gio.Cancellable cancellable) throws GErrorException {
        return new PixbufAnimation(constructNewFromStream(stream, cancellable));
    }
    
    private static Refcounted constructNewFromStreamFinish(@NotNull org.gtk.gio.AsyncResult asyncResult) throws GErrorException {
        java.util.Objects.requireNonNull(asyncResult, "Parameter 'asyncResult' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gdk_pixbuf_animation_new_from_stream_finish.invokeExact(
                    asyncResult.handle(), (Addressable) GERROR), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Finishes an asynchronous pixbuf animation creation operation started with
     * {@link PixbufAnimation#newFromStreamAsync}.
     * @param asyncResult a {@link org.gtk.gio.AsyncResult}
     * @return the newly created animation
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static PixbufAnimation newFromStreamFinish(@NotNull org.gtk.gio.AsyncResult asyncResult) throws GErrorException {
        return new PixbufAnimation(constructNewFromStreamFinish(asyncResult));
    }
    
    /**
     * Queries the height of the bounding box of a pixbuf animation.
     * @return Height of the bounding box of the animation.
     */
    public int getHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_animation_get_height.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get an iterator for displaying an animation.
     * <p>
     * The iterator provides the frames that should be displayed at a
     * given time.
     * <p>
     * {@code start_time} would normally come from g_get_current_time(), and marks
     * the beginning of animation playback. After creating an iterator, you
     * should immediately display the pixbuf returned by
     * gdk_pixbuf_animation_iter_get_pixbuf(). Then, you should install
     * a timeout (with g_timeout_add()) or by some other mechanism ensure
     * that you'll update the image after
     * gdk_pixbuf_animation_iter_get_delay_time() milliseconds. Each time
     * the image is updated, you should reinstall the timeout with the new,
     * possibly-changed delay time.
     * <p>
     * As a shortcut, if {@code start_time} is {@code NULL}, the result of
     * g_get_current_time() will be used automatically.
     * <p>
     * To update the image (i.e. possibly change the result of
     * gdk_pixbuf_animation_iter_get_pixbuf() to a new frame of the animation),
     * call gdk_pixbuf_animation_iter_advance().
     * <p>
     * If you're using {@link PixbufLoader}, in addition to updating the image
     * after the delay time, you should also update it whenever you
     * receive the area_updated signal and
     * gdk_pixbuf_animation_iter_on_currently_loading_frame() returns
     * {@code TRUE}. In this case, the frame currently being fed into the loader
     * has received new data, so needs to be refreshed. The delay time for
     * a frame may also be modified after an area_updated signal, for
     * example if the delay time for a frame is encoded in the data after
     * the frame itself. So your timeout should be reinstalled after any
     * area_updated signal.
     * <p>
     * A delay time of -1 is possible, indicating "infinite".
     * @param startTime time when the animation starts playing
     * @return an iterator to move over the animation
     */
    public @NotNull org.gtk.gdkpixbuf.PixbufAnimationIter getIter(@Nullable org.gtk.glib.TimeVal startTime) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_animation_get_iter.invokeExact(
                    handle(),
                    (Addressable) (startTime == null ? MemoryAddress.NULL : startTime.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdkpixbuf.PixbufAnimationIter(Refcounted.get(RESULT, true));
    }
    
    /**
     * Retrieves a static image for the animation.
     * <p>
     * If an animation is really just a plain image (has only one frame),
     * this function returns that image.
     * <p>
     * If the animation is an animation, this function returns a reasonable
     * image to use as a static unanimated image, which might be the first
     * frame, or something more sophisticated depending on the file format.
     * <p>
     * If an animation hasn't loaded any frames yet, this function will
     * return {@code NULL}.
     * @return unanimated image representing the animation
     */
    public @NotNull org.gtk.gdkpixbuf.Pixbuf getStaticImage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_animation_get_static_image.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdkpixbuf.Pixbuf(Refcounted.get(RESULT, false));
    }
    
    /**
     * Queries the width of the bounding box of a pixbuf animation.
     * @return Width of the bounding box of the animation.
     */
    public int getWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_animation_get_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether the animation is a static image.
     * <p>
     * If you load a file with gdk_pixbuf_animation_new_from_file() and it
     * turns out to be a plain, unanimated image, then this function will
     * return {@code TRUE}. Use gdk_pixbuf_animation_get_static_image() to retrieve
     * the image.
     * @return {@code TRUE} if the "animation" was really just an image
     */
    public boolean isStaticImage() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_pixbuf_animation_is_static_image.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Adds a reference to an animation.
     * @return The same as the {@code animation} argument.
     * @deprecated Use g_object_ref().
     */
    @Deprecated
    public @NotNull org.gtk.gdkpixbuf.PixbufAnimation ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_pixbuf_animation_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdkpixbuf.PixbufAnimation(Refcounted.get(RESULT, false));
    }
    
    /**
     * Removes a reference from an animation.
     * @deprecated Use g_object_unref().
     */
    @Deprecated
    public void unref() {
        try {
            DowncallHandles.gdk_pixbuf_animation_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new animation by asynchronously loading an image from an input stream.
     * <p>
     * For more details see gdk_pixbuf_new_from_stream(), which is the synchronous
     * version of this function.
     * <p>
     * When the operation is finished, {@code callback} will be called in the main thread.
     * You can then call gdk_pixbuf_animation_new_from_stream_finish() to get the
     * result of the operation.
     * @param stream a {@link org.gtk.gio.InputStream} from which to load the animation
     * @param cancellable optional {@link org.gtk.gio.Cancellable} object
     * @param callback a {@code GAsyncReadyCallback} to call when the pixbuf is loaded
     */
    public static void newFromStreamAsync(@NotNull org.gtk.gio.InputStream stream, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(stream, "Parameter 'stream' must not be null");
        try {
            DowncallHandles.gdk_pixbuf_animation_new_from_stream_async.invokeExact(
                    stream.handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GdkPixbuf.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_pixbuf_animation_new_from_file = Interop.downcallHandle(
            "gdk_pixbuf_animation_new_from_file",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_animation_new_from_resource = Interop.downcallHandle(
            "gdk_pixbuf_animation_new_from_resource",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_animation_new_from_stream = Interop.downcallHandle(
            "gdk_pixbuf_animation_new_from_stream",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_animation_new_from_stream_finish = Interop.downcallHandle(
            "gdk_pixbuf_animation_new_from_stream_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_animation_get_height = Interop.downcallHandle(
            "gdk_pixbuf_animation_get_height",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_animation_get_iter = Interop.downcallHandle(
            "gdk_pixbuf_animation_get_iter",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_animation_get_static_image = Interop.downcallHandle(
            "gdk_pixbuf_animation_get_static_image",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_animation_get_width = Interop.downcallHandle(
            "gdk_pixbuf_animation_get_width",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_animation_is_static_image = Interop.downcallHandle(
            "gdk_pixbuf_animation_is_static_image",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_animation_ref = Interop.downcallHandle(
            "gdk_pixbuf_animation_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_animation_unref = Interop.downcallHandle(
            "gdk_pixbuf_animation_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_pixbuf_animation_new_from_stream_async = Interop.downcallHandle(
            "gdk_pixbuf_animation_new_from_stream_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
