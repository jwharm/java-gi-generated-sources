package org.gtk.gdkpixbuf;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque object representing an animation.
 * 
 * The GdkPixBuf library provides a simple mechanism to load and
 * represent animations. An animation is conceptually a series of
 * frames to be displayed over time.
 * 
 * The animation may not be represented as a series of frames
 * internally; for example, it may be stored as a sprite and
 * instructions for moving the sprite around a background.
 * 
 * To display an animation you don't need to understand its
 * representation, however; you just ask `GdkPixbuf` what should
 * be displayed at a given point in time.
 */
public class PixbufAnimation extends org.gtk.gobject.Object {

    public PixbufAnimation(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PixbufAnimation */
    public static PixbufAnimation castFrom(org.gtk.gobject.Object gobject) {
        return new PixbufAnimation(gobject.getReference());
    }
    
    private static Reference constructNewFromFile(java.lang.String filename) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gdk_pixbuf_animation_new_from_file(Interop.allocateNativeString(filename).handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new animation by loading it from a file.
     * 
     * The file format is detected automatically.
     * 
     * If the file's format does not support multi-frame images, then an animation
     * with a single frame will be created.
     * 
     * Possible errors are in the `GDK_PIXBUF_ERROR` and `G_FILE_ERROR` domains.
     */
    public static PixbufAnimation newFromFile(java.lang.String filename) throws GErrorException {
        return new PixbufAnimation(constructNewFromFile(filename));
    }
    
    private static Reference constructNewFromResource(java.lang.String resourcePath) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gdk_pixbuf_animation_new_from_resource(Interop.allocateNativeString(resourcePath).handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf animation by loading an image from an resource.
     * 
     * The file format is detected automatically. If `NULL` is returned, then
     * @error will be set.
     */
    public static PixbufAnimation newFromResource(java.lang.String resourcePath) throws GErrorException {
        return new PixbufAnimation(constructNewFromResource(resourcePath));
    }
    
    private static Reference constructNewFromStream(org.gtk.gio.InputStream stream, org.gtk.gio.Cancellable cancellable) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gdk_pixbuf_animation_new_from_stream(stream.handle(), cancellable.handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new animation by loading it from an input stream.
     * 
     * The file format is detected automatically.
     * 
     * If `NULL` is returned, then @error will be set.
     * 
     * The @cancellable can be used to abort the operation from another thread.
     * If the operation was cancelled, the error `G_IO_ERROR_CANCELLED` will be
     * returned. Other possible errors are in the `GDK_PIXBUF_ERROR` and
     * `G_IO_ERROR` domains.
     * 
     * The stream is not closed.
     */
    public static PixbufAnimation newFromStream(org.gtk.gio.InputStream stream, org.gtk.gio.Cancellable cancellable) throws GErrorException {
        return new PixbufAnimation(constructNewFromStream(stream, cancellable));
    }
    
    private static Reference constructNewFromStreamFinish(org.gtk.gio.AsyncResult asyncResult) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gdk_pixbuf_animation_new_from_stream_finish(asyncResult.handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Finishes an asynchronous pixbuf animation creation operation started with
     * [func@GdkPixbuf.PixbufAnimation.new_from_stream_async].
     */
    public static PixbufAnimation newFromStreamFinish(org.gtk.gio.AsyncResult asyncResult) throws GErrorException {
        return new PixbufAnimation(constructNewFromStreamFinish(asyncResult));
    }
    
    /**
     * Queries the height of the bounding box of a pixbuf animation.
     */
    public int getHeight() {
        var RESULT = gtk_h.gdk_pixbuf_animation_get_height(handle());
        return RESULT;
    }
    
    /**
     * Get an iterator for displaying an animation.
     * 
     * The iterator provides the frames that should be displayed at a
     * given time.
     * 
     * @start_time would normally come from g_get_current_time(), and marks
     * the beginning of animation playback. After creating an iterator, you
     * should immediately display the pixbuf returned by
     * gdk_pixbuf_animation_iter_get_pixbuf(). Then, you should install
     * a timeout (with g_timeout_add()) or by some other mechanism ensure
     * that you'll update the image after
     * gdk_pixbuf_animation_iter_get_delay_time() milliseconds. Each time
     * the image is updated, you should reinstall the timeout with the new,
     * possibly-changed delay time.
     * 
     * As a shortcut, if @start_time is `NULL`, the result of
     * g_get_current_time() will be used automatically.
     * 
     * To update the image (i.e. possibly change the result of
     * gdk_pixbuf_animation_iter_get_pixbuf() to a new frame of the animation),
     * call gdk_pixbuf_animation_iter_advance().
     * 
     * If you're using #GdkPixbufLoader, in addition to updating the image
     * after the delay time, you should also update it whenever you
     * receive the area_updated signal and
     * gdk_pixbuf_animation_iter_on_currently_loading_frame() returns
     * `TRUE`. In this case, the frame currently being fed into the loader
     * has received new data, so needs to be refreshed. The delay time for
     * a frame may also be modified after an area_updated signal, for
     * example if the delay time for a frame is encoded in the data after
     * the frame itself. So your timeout should be reinstalled after any
     * area_updated signal.
     * 
     * A delay time of -1 is possible, indicating "infinite".
     */
    public PixbufAnimationIter getIter(org.gtk.glib.TimeVal startTime) {
        var RESULT = gtk_h.gdk_pixbuf_animation_get_iter(handle(), startTime.handle());
        return new PixbufAnimationIter(References.get(RESULT, true));
    }
    
    /**
     * Retrieves a static image for the animation.
     * 
     * If an animation is really just a plain image (has only one frame),
     * this function returns that image.
     * 
     * If the animation is an animation, this function returns a reasonable
     * image to use as a static unanimated image, which might be the first
     * frame, or something more sophisticated depending on the file format.
     * 
     * If an animation hasn't loaded any frames yet, this function will
     * return `NULL`.
     */
    public Pixbuf getStaticImage() {
        var RESULT = gtk_h.gdk_pixbuf_animation_get_static_image(handle());
        return new Pixbuf(References.get(RESULT, false));
    }
    
    /**
     * Queries the width of the bounding box of a pixbuf animation.
     */
    public int getWidth() {
        var RESULT = gtk_h.gdk_pixbuf_animation_get_width(handle());
        return RESULT;
    }
    
    /**
     * Checks whether the animation is a static image.
     * 
     * If you load a file with gdk_pixbuf_animation_new_from_file() and it
     * turns out to be a plain, unanimated image, then this function will
     * return `TRUE`. Use gdk_pixbuf_animation_get_static_image() to retrieve
     * the image.
     */
    public boolean isStaticImage() {
        var RESULT = gtk_h.gdk_pixbuf_animation_is_static_image(handle());
        return (RESULT != 0);
    }
    
    /**
     * Creates a new animation by asynchronously loading an image from an input stream.
     * 
     * For more details see gdk_pixbuf_new_from_stream(), which is the synchronous
     * version of this function.
     * 
     * When the operation is finished, `callback` will be called in the main thread.
     * You can then call gdk_pixbuf_animation_new_from_stream_finish() to get the
     * result of the operation.
     */
    public static void newFromStreamAsync(org.gtk.gio.InputStream stream, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_pixbuf_animation_new_from_stream_async(stream.handle(), cancellable.handle(), 
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
    
}
