package org.gtk.gdkpixbuf;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Incremental image loader.
 * 
 * `GdkPixbufLoader` provides a way for applications to drive the
 * process of loading an image, by letting them send the image data
 * directly to the loader instead of having the loader read the data
 * from a file. Applications can use this functionality instead of
 * `gdk_pixbuf_new_from_file()` or `gdk_pixbuf_animation_new_from_file()`
 * when they need to parse image data in small chunks. For example,
 * it should be used when reading an image from a (potentially) slow
 * network connection, or when loading an extremely large file.
 * 
 * To use `GdkPixbufLoader` to load an image, create a new instance,
 * and call [method@GdkPixbuf.PixbufLoader.write] to send the data
 * to it. When done, [method@GdkPixbuf.PixbufLoader.close] should be
 * called to end the stream and finalize everything.
 * 
 * The loader will emit three important signals throughout the process:
 * 
 *  - [signal@GdkPixbuf.PixbufLoader::size-prepared] will be emitted as
 *    soon as the image has enough information to determine the size of
 *    the image to be used. If you want to scale the image while loading
 *    it, you can call [method@GdkPixbuf.PixbufLoader.set_size] in
 *    response to this signal.
 *  - [signal@GdkPixbuf.PixbufLoader::area-prepared] will be emitted as
 *    soon as the pixbuf of the desired has been allocated. You can obtain
 *    the `GdkPixbuf` instance by calling [method@GdkPixbuf.PixbufLoader.get_pixbuf].
 *    If you want to use it, simply acquire a reference to it. You can
 *    also call `gdk_pixbuf_loader_get_pixbuf()` later to get the same
 *    pixbuf.
 *  - [signal@GdkPixbuf.PixbufLoader::area-updated] will be emitted every
 *    time a region is updated. This way you can update a partially
 *    completed image. Note that you do not know anything about the
 *    completeness of an image from the updated area. For example, in an
 *    interlaced image you will need to make several passes before the
 *    image is done loading.
 * 
 * ## Loading an animation
 * 
 * Loading an animation is almost as easy as loading an image. Once the
 * first [signal@GdkPixbuf.PixbufLoader::area-prepared] signal has been
 * emitted, you can call [method@GdkPixbuf.PixbufLoader.get_animation] to
 * get the [class@GdkPixbuf.PixbufAnimation] instance, and then call
 * and [method@GdkPixbuf.PixbufAnimation.get_iter] to get a
 * [class@GdkPixbuf.PixbufAnimationIter] to retrieve the pixbuf for the
 * desired time stamp.
 */
public class PixbufLoader extends org.gtk.gobject.Object {

    public PixbufLoader(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PixbufLoader */
    public static PixbufLoader castFrom(org.gtk.gobject.Object gobject) {
        return new PixbufLoader(gobject.getReference());
    }
    
    /**
     * Creates a new pixbuf loader object.
     */
    public PixbufLoader() {
        super(References.get(gtk_h.gdk_pixbuf_loader_new(), true));
    }
    
    /**
     * Informs a pixbuf loader that no further writes with
     * gdk_pixbuf_loader_write() will occur, so that it can free its
     * internal loading structures.
     * 
     * This function also tries to parse any data that hasn't yet been parsed;
     * if the remaining data is partial or corrupt, an error will be returned.
     * 
     * If `FALSE` is returned, `error` will be set to an error from the
     * `GDK_PIXBUF_ERROR` or `G_FILE_ERROR` domains.
     * 
     * If you're just cancelling a load rather than expecting it to be finished,
     * passing `NULL` for `error` to ignore it is reasonable.
     * 
     * Remember that this function does not release a reference on the loader, so
     * you will need to explicitly release any reference you hold.
     */
    public boolean close() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.gdk_pixbuf_loader_close(handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Queries the #GdkPixbufAnimation that a pixbuf loader is currently creating.
     * 
     * In general it only makes sense to call this function after the
     * [signal@GdkPixbuf.PixbufLoader::area-prepared] signal has been emitted by
     * the loader.
     * 
     * If the loader doesn't have enough bytes yet, and hasn't emitted the `area-prepared`
     * signal, this function will return `NULL`.
     */
    public PixbufAnimation getAnimation() {
        var RESULT = gtk_h.gdk_pixbuf_loader_get_animation(handle());
        return new PixbufAnimation(References.get(RESULT, false));
    }
    
    /**
     * Obtains the available information about the format of the
     * currently loading image file.
     */
    public PixbufFormat getFormat() {
        var RESULT = gtk_h.gdk_pixbuf_loader_get_format(handle());
        return new PixbufFormat(References.get(RESULT, false));
    }
    
    /**
     * Queries the #GdkPixbuf that a pixbuf loader is currently creating.
     * 
     * In general it only makes sense to call this function after the
     * [signal@GdkPixbuf.PixbufLoader::area-prepared] signal has been
     * emitted by the loader; this means that enough data has been read
     * to know the size of the image that will be allocated.
     * 
     * If the loader has not received enough data via gdk_pixbuf_loader_write(),
     * then this function returns `NULL`.
     * 
     * The returned pixbuf will be the same in all future calls to the loader,
     * so if you want to keep using it, you should acquire a reference to it.
     * 
     * Additionally, if the loader is an animation, it will return the "static
     * image" of the animation (see gdk_pixbuf_animation_get_static_image()).
     */
    public Pixbuf getPixbuf() {
        var RESULT = gtk_h.gdk_pixbuf_loader_get_pixbuf(handle());
        return new Pixbuf(References.get(RESULT, false));
    }
    
    /**
     * Causes the image to be scaled while it is loaded.
     * 
     * The desired image size can be determined relative to the original
     * size of the image by calling gdk_pixbuf_loader_set_size() from a
     * signal handler for the ::size-prepared signal.
     * 
     * Attempts to set the desired image size  are ignored after the
     * emission of the ::size-prepared signal.
     */
    public void setSize(int width, int height) {
        gtk_h.gdk_pixbuf_loader_set_size(handle(), width, height);
    }
    
    /**
     * Parses the next `count` bytes in the given image buffer.
     */
    public boolean write(byte[] buf, long count) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.gdk_pixbuf_loader_write(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, buf)).handle(), count, GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Parses the next contents of the given image buffer.
     */
    public boolean writeBytes(org.gtk.glib.Bytes buffer) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.gdk_pixbuf_loader_write_bytes(handle(), buffer.handle(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    @FunctionalInterface
    public interface AreaPreparedHandler {
        void signalReceived(PixbufLoader source);
    }
    
    /**
     * This signal is emitted when the pixbuf loader has allocated the
     * pixbuf in the desired size.
     * 
     * After this signal is emitted, applications can call
     * gdk_pixbuf_loader_get_pixbuf() to fetch the partially-loaded
     * pixbuf.
     */
    public void onAreaPrepared(AreaPreparedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPixbufLoaderAreaPrepared", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("area-prepared").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface AreaUpdatedHandler {
        void signalReceived(PixbufLoader source, int x, int y, int width, int height);
    }
    
    /**
     * This signal is emitted when a significant area of the image being
     * loaded has been updated.
     * 
     * Normally it means that a complete scanline has been read in, but
     * it could be a different area as well.
     * 
     * Applications can use this signal to know when to repaint
     * areas of an image that is being loaded.
     */
    public void onAreaUpdated(AreaUpdatedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPixbufLoaderAreaUpdated", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("area-updated").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ClosedHandler {
        void signalReceived(PixbufLoader source);
    }
    
    /**
     * This signal is emitted when gdk_pixbuf_loader_close() is called.
     * 
     * It can be used by different parts of an application to receive
     * notification when an image loader is closed by the code that
     * drives it.
     */
    public void onClosed(ClosedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPixbufLoaderClosed", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("closed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SizePreparedHandler {
        void signalReceived(PixbufLoader source, int width, int height);
    }
    
    /**
     * This signal is emitted when the pixbuf loader has been fed the
     * initial amount of data that is required to figure out the size
     * of the image that it will create.
     * 
     * Applications can call gdk_pixbuf_loader_set_size() in response
     * to this signal to set the desired size to which the image
     * should be scaled.
     */
    public void onSizePrepared(SizePreparedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPixbufLoaderSizePrepared", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("size-prepared").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
