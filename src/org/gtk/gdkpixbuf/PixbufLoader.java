package org.gtk.gdkpixbuf;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Incremental image loader.
 * <p><code>GdkPixbufLoader</code> provides a way for applications to drive the
 * process of loading an image, by letting them send the image data
 * directly to the loader instead of having the loader read the data
 * from a file. Applications can use this functionality instead of<code>gdk_pixbuf_new_from_file()</code> or <code>gdk_pixbuf_animation_new_from_file()</code>
 * when they need to parse image data in small chunks. For example,
 * it should be used when reading an image from a (potentially) slow
 * network connection, or when loading an extremely large file.
 * <p>
 * To use <code>GdkPixbufLoader</code> to load an image, create a new instance,
 * and call {@link org.gtk.gdkpixbuf.PixbufLoader<code>#write</code>  to send the data
 * to it. When done, {@link org.gtk.gdkpixbuf.PixbufLoader<code>#close</code>  should be
 * called to end the stream and finalize everything.
 * <p>
 * The loader will emit three important signals throughout the process:
 * <p>
 *  - {@link [signal@GdkPixbuf.PixbufLoader::size-prepared] (ref=signal)} will be emitted as
 *    soon as the image has enough information to determine the size of
 *    the image to be used. If you want to scale the image while loading
 *    it, you can call {@link org.gtk.gdkpixbuf.PixbufLoader<code>#setSize</code>  in
 *    response to this signal.
 *  - {@link [signal@GdkPixbuf.PixbufLoader::area-prepared] (ref=signal)} will be emitted as
 *    soon as the pixbuf of the desired has been allocated. You can obtain
 *    the <code>GdkPixbuf</code> instance by calling {@link org.gtk.gdkpixbuf.PixbufLoader<code>#getPixbuf</code> .
 *    If you want to use it, simply acquire a reference to it. You can
 *    also call <code>gdk_pixbuf_loader_get_pixbuf()</code> later to get the same
 *    pixbuf.
 *  - {@link [signal@GdkPixbuf.PixbufLoader::area-updated] (ref=signal)} will be emitted every
 *    time a region is updated. This way you can update a partially
 *    completed image. Note that you do not know anything about the
 *    completeness of an image from the updated area. For example, in an
 *    interlaced image you will need to make several passes before the
 *    image is done loading.
 * 
 * <code>#</code>  Loading an animation
 * 
 * Loading an animation is almost as easy as loading an image. Once the
 * first {@link [signal@GdkPixbuf.PixbufLoader::area-prepared] (ref=signal)} signal has been
 * emitted, you can call {@link org.gtk.gdkpixbuf.PixbufLoader<code>#getAnimation</code>  to
 * get the {@link org.gtk.gdkpixbuf.PixbufAnimation} instance, and then call
 * and {@link org.gtk.gdkpixbuf.PixbufAnimation<code>#getIter</code>  to get a
 * {@link org.gtk.gdkpixbuf.PixbufAnimationIter} to retrieve the pixbuf for the
 * desired time stamp.
 */
public class PixbufLoader extends org.gtk.gobject.Object {

    public PixbufLoader(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PixbufLoader */
    public static PixbufLoader castFrom(org.gtk.gobject.Object gobject) {
        return new PixbufLoader(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gdk_pixbuf_loader_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf loader object.
     */
    public PixbufLoader() {
        super(constructNew());
    }
    
    private static Reference constructNewWithMimeType(java.lang.String mimeType) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gdk_pixbuf_loader_new_with_mime_type(Interop.allocateNativeString(mimeType).handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf loader object that always attempts to parse
     * image data as if it were an image of MIME type @mime_type, instead of
     * identifying the type automatically.
     * 
     * This function is useful if you want an error if the image isn&<code>#39</code> t the
     * expected MIME type; for loading image formats that can&<code>#39</code> t be reliably
     * identified by looking at the data; or if the user manually forces a
     * specific MIME type.
     * 
     * The list of supported mime types depends on what image loaders
     * are installed, but typically &<code>#34</code> image/png&<code>#34</code> , &<code>#34</code> image/jpeg&<code>#34</code> , &<code>#34</code> image/gif&<code>#34</code> ,
     * &<code>#34</code> image/tiff&<code>#34</code>  and &<code>#34</code> image/x-xpixmap&<code>#34</code>  are among the supported mime types.
     * To obtain the full list of supported mime types, call
     * gdk_pixbuf_format_get_mime_types() on each of the {@link org.gtk.gdkpixbuf.PixbufFormat} structs returned by gdk_pixbuf_get_formats().
     */
    public static PixbufLoader newWithMimeType(java.lang.String mimeType) throws GErrorException {
        return new PixbufLoader(constructNewWithMimeType(mimeType));
    }
    
    private static Reference constructNewWithType(java.lang.String imageType) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.gdk_pixbuf_loader_new_with_type(Interop.allocateNativeString(imageType).handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new pixbuf loader object that always attempts to parse
     * image data as if it were an image of type @image_type, instead of
     * identifying the type automatically.
     * 
     * This function is useful if you want an error if the image isn&<code>#39</code> t the
     * expected type; for loading image formats that can&<code>#39</code> t be reliably
     * identified by looking at the data; or if the user manually forces
     * a specific type.
     * 
     * The list of supported image formats depends on what image loaders
     * are installed, but typically &<code>#34</code> png&<code>#34</code> , &<code>#34</code> jpeg&<code>#34</code> , &<code>#34</code> gif&<code>#34</code> , &<code>#34</code> tiff&<code>#34</code>  and
     * &<code>#34</code> xpm&<code>#34</code>  are among the supported formats. To obtain the full list of
     * supported image formats, call gdk_pixbuf_format_get_name() on each
     * of the {@link org.gtk.gdkpixbuf.PixbufFormat} structs returned by gdk_pixbuf_get_formats().
     */
    public static PixbufLoader newWithType(java.lang.String imageType) throws GErrorException {
        return new PixbufLoader(constructNewWithType(imageType));
    }
    
    /**
     * Informs a pixbuf loader that no further writes with
     * gdk_pixbuf_loader_write() will occur, so that it can free its
     * internal loading structures.
     * <p>
     * This function also tries to parse any data that hasn&<code>#39</code> t yet been parsed;
     * if the remaining data is partial or corrupt, an error will be returned.
     * <p>
     * If <code>FALSE</code> is returned, <code>error</code> will be set to an error from the<code>GDK_PIXBUF_ERROR</code> or <code>G_FILE_ERROR</code> domains.
     * <p>
     * If you&<code>#39</code> re just cancelling a load rather than expecting it to be finished,
     * passing <code>NULL</code> for <code>error</code> to ignore it is reasonable.
     * 
     * Remember that this function does not release a reference on the loader, so
     * you will need to explicitly release any reference you hold.
     */
    public boolean close() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_pixbuf_loader_close(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Queries the {@link org.gtk.gdkpixbuf.PixbufAnimation} that a pixbuf loader is currently creating.
     * <p>
     * In general it only makes sense to call this function after the
     * {@link [signal@GdkPixbuf.PixbufLoader::area-prepared] (ref=signal)} signal has been emitted by
     * the loader.
     * <p>
     * If the loader doesn&<code>#39</code> t have enough bytes yet, and hasn&<code>#39</code> t emitted the <code>area-prepared</code>
     * signal, this function will return <code>NULL</code>.
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
     * Queries the {@link org.gtk.gdkpixbuf.Pixbuf} that a pixbuf loader is currently creating.
     * <p>
     * In general it only makes sense to call this function after the
     * {@link [signal@GdkPixbuf.PixbufLoader::area-prepared] (ref=signal)} signal has been
     * emitted by the loader; this means that enough data has been read
     * to know the size of the image that will be allocated.
     * <p>
     * If the loader has not received enough data via gdk_pixbuf_loader_write(),
     * then this function returns <code>NULL</code>.
     * 
     * The returned pixbuf will be the same in all future calls to the loader,
     * so if you want to keep using it, you should acquire a reference to it.
     * 
     * Additionally, if the loader is an animation, it will return the &<code>#34</code> static
     * image&<code>#34</code>  of the animation (see gdk_pixbuf_animation_get_static_image()).
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
     * Parses the next <code>count</code> bytes in the given image buffer.
     */
    public boolean write(byte[] buf, long count) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_pixbuf_loader_write(handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, buf)).handle(), count, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Parses the next contents of the given image buffer.
     */
    public boolean writeBytes(org.gtk.glib.Bytes buffer) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_pixbuf_loader_write_bytes(handle(), buffer.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
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
    public SignalHandle onAreaPrepared(AreaPreparedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPixbufLoaderAreaPrepared", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("area-prepared").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
    public SignalHandle onAreaUpdated(AreaUpdatedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPixbufLoaderAreaUpdated", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("area-updated").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
    public SignalHandle onClosed(ClosedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPixbufLoaderClosed", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("closed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
    public SignalHandle onSizePrepared(SizePreparedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalPixbufLoaderSizePrepared", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("size-prepared").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
