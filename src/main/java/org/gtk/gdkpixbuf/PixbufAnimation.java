package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    public PixbufAnimation(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PixbufAnimation */
    public static PixbufAnimation castFrom(org.gtk.gobject.Object gobject) {
        return new PixbufAnimation(gobject.refcounted());
    }
    
    static final MethodHandle gdk_pixbuf_animation_new_from_file = Interop.downcallHandle(
        "gdk_pixbuf_animation_new_from_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromFile(java.lang.String filename) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_pixbuf_animation_new_from_file.invokeExact(Interop.allocateNativeString(filename).handle(), (Addressable) GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public static PixbufAnimation newFromFile(java.lang.String filename) throws GErrorException {
        return new PixbufAnimation(constructNewFromFile(filename));
    }
    
    static final MethodHandle gdk_pixbuf_animation_new_from_resource = Interop.downcallHandle(
        "gdk_pixbuf_animation_new_from_resource",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromResource(java.lang.String resourcePath) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_pixbuf_animation_new_from_resource.invokeExact(Interop.allocateNativeString(resourcePath).handle(), (Addressable) GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new pixbuf animation by loading an image from an resource.
     * <p>
     * The file format is detected automatically. If {@code NULL} is returned, then
     * {@code error} will be set.
     */
    public static PixbufAnimation newFromResource(java.lang.String resourcePath) throws GErrorException {
        return new PixbufAnimation(constructNewFromResource(resourcePath));
    }
    
    static final MethodHandle gdk_pixbuf_animation_new_from_stream = Interop.downcallHandle(
        "gdk_pixbuf_animation_new_from_stream",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromStream(org.gtk.gio.InputStream stream, org.gtk.gio.Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_pixbuf_animation_new_from_stream.invokeExact(stream.handle(), cancellable.handle(), (Addressable) GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public static PixbufAnimation newFromStream(org.gtk.gio.InputStream stream, org.gtk.gio.Cancellable cancellable) throws GErrorException {
        return new PixbufAnimation(constructNewFromStream(stream, cancellable));
    }
    
    static final MethodHandle gdk_pixbuf_animation_new_from_stream_finish = Interop.downcallHandle(
        "gdk_pixbuf_animation_new_from_stream_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromStreamFinish(org.gtk.gio.AsyncResult asyncResult) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_pixbuf_animation_new_from_stream_finish.invokeExact(asyncResult.handle(), (Addressable) GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous pixbuf animation creation operation started with
     * {@link GdkPixbuf#PixbufAnimation}.
     */
    public static PixbufAnimation newFromStreamFinish(org.gtk.gio.AsyncResult asyncResult) throws GErrorException {
        return new PixbufAnimation(constructNewFromStreamFinish(asyncResult));
    }
    
    static final MethodHandle gdk_pixbuf_animation_get_height = Interop.downcallHandle(
        "gdk_pixbuf_animation_get_height",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries the height of the bounding box of a pixbuf animation.
     */
    public int getHeight() {
        try {
            var RESULT = (int) gdk_pixbuf_animation_get_height.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_animation_get_iter = Interop.downcallHandle(
        "gdk_pixbuf_animation_get_iter",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public PixbufAnimationIter getIter(org.gtk.glib.TimeVal startTime) {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_animation_get_iter.invokeExact(handle(), startTime.handle());
            return new PixbufAnimationIter(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_animation_get_static_image = Interop.downcallHandle(
        "gdk_pixbuf_animation_get_static_image",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public Pixbuf getStaticImage() {
        try {
            var RESULT = (MemoryAddress) gdk_pixbuf_animation_get_static_image.invokeExact(handle());
            return new Pixbuf(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_animation_get_width = Interop.downcallHandle(
        "gdk_pixbuf_animation_get_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries the width of the bounding box of a pixbuf animation.
     */
    public int getWidth() {
        try {
            var RESULT = (int) gdk_pixbuf_animation_get_width.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_animation_is_static_image = Interop.downcallHandle(
        "gdk_pixbuf_animation_is_static_image",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the animation is a static image.
     * <p>
     * If you load a file with gdk_pixbuf_animation_new_from_file() and it
     * turns out to be a plain, unanimated image, then this function will
     * return {@code TRUE}. Use gdk_pixbuf_animation_get_static_image() to retrieve
     * the image.
     */
    public boolean isStaticImage() {
        try {
            var RESULT = (int) gdk_pixbuf_animation_is_static_image.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_pixbuf_animation_new_from_stream_async = Interop.downcallHandle(
        "gdk_pixbuf_animation_new_from_stream_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new animation by asynchronously loading an image from an input stream.
     * <p>
     * For more details see gdk_pixbuf_new_from_stream(), which is the synchronous
     * version of this function.
     * <p>
     * When the operation is finished, {@code callback} will be called in the main thread.
     * You can then call gdk_pixbuf_animation_new_from_stream_finish() to get the
     * result of the operation.
     */
    public static void newFromStreamAsync(org.gtk.gio.InputStream stream, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gdk_pixbuf_animation_new_from_stream_async.invokeExact(stream.handle(), cancellable.handle(), 
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
    
}
