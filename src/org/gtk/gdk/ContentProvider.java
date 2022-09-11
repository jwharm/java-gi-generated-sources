package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GdkContentProvider` is used to provide content for the clipboard or
 * for drag-and-drop operations in a number of formats.
 * 
 * To create a `GdkContentProvider`, use [ctor@Gdk.ContentProvider.new_for_value]
 * or [ctor@Gdk.ContentProvider.new_for_bytes].
 * 
 * GDK knows how to handle common text and image formats out-of-the-box. See
 * [class@Gdk.ContentSerializer] and [class@Gdk.ContentDeserializer] if you want
 * to add support for application-specific data formats.
 */
public class ContentProvider extends org.gtk.gobject.Object {

    public ContentProvider(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ContentProvider */
    public static ContentProvider castFrom(org.gtk.gobject.Object gobject) {
        return new ContentProvider(gobject.getReference());
    }
    
    /**
     * Create a content provider that provides the given @bytes as data for
     * the given @mime_type.
     */
    public static ContentProvider newForBytes(java.lang.String mimeType, org.gtk.glib.Bytes bytes) {
        return new ContentProvider(References.get(gtk_h.gdk_content_provider_new_for_bytes(Interop.allocateNativeString(mimeType).handle(), bytes.handle()), true));
    }
    
    /**
     * Create a content provider that provides the given @value.
     */
    public static ContentProvider newForValue(org.gtk.gobject.Value value) {
        return new ContentProvider(References.get(gtk_h.gdk_content_provider_new_for_value(value.handle()), true));
    }
    
    /**
     * Creates a content provider that represents all the given @providers.
     * 
     * Whenever data needs to be written, the union provider will try the given
     * @providers in the given order and the first one supporting a format will
     * be chosen to provide it.
     * 
     * This allows an easy way to support providing data in different formats.
     * For example, an image may be provided by its file and by the image
     * contents with a call such as
     * ```c
     * gdk_content_provider_new_union ((GdkContentProvider *[2]) {
     *                                   gdk_content_provider_new_typed (G_TYPE_FILE, file),
     *                                   gdk_content_provider_new_typed (G_TYPE_TEXTURE, texture)
     *                                 }, 2);
     * ```
     */
    public static ContentProvider newUnion(ContentProvider[] providers, long nProviders) {
        return new ContentProvider(References.get(gtk_h.gdk_content_provider_new_union(Interop.allocateNativeArray(providers).handle(), nProviders), true));
    }
    
    /**
     * Emits the ::content-changed signal.
     */
    public void contentChanged() {
        gtk_h.gdk_content_provider_content_changed(handle());
    }
    
    /**
     * Gets the contents of @provider stored in @value.
     * 
     * The @value will have been initialized to the `GType` the value should be
     * provided in. This given `GType` does not need to be listed in the formats
     * returned by [method@Gdk.ContentProvider.ref_formats]. However, if the
     * given `GType` is not supported, this operation can fail and
     * `G_IO_ERROR_NOT_SUPPORTED` will be reported.
     */
    public boolean getValue(org.gtk.gobject.Value value) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_content_provider_get_value(handle(), value.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets the formats that the provider can provide its current contents in.
     */
    public ContentFormats refFormats() {
        var RESULT = gtk_h.gdk_content_provider_ref_formats(handle());
        return new ContentFormats(References.get(RESULT, true));
    }
    
    /**
     * Gets the formats that the provider suggests other applications to store
     * the data in.
     * 
     * An example of such an application would be a clipboard manager.
     * 
     * This can be assumed to be a subset of [method@Gdk.ContentProvider.ref_formats].
     */
    public ContentFormats refStorableFormats() {
        var RESULT = gtk_h.gdk_content_provider_ref_storable_formats(handle());
        return new ContentFormats(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously writes the contents of @provider to @stream in the given
     * @mime_type.
     * 
     * When the operation is finished @callback will be called. You must then call
     * [method@Gdk.ContentProvider.write_mime_type_finish] to get the result
     * of the operation.
     * 
     * The given mime type does not need to be listed in the formats returned by
     * [method@Gdk.ContentProvider.ref_formats]. However, if the given `GType` is
     * not supported, `G_IO_ERROR_NOT_SUPPORTED` will be reported.
     * 
     * The given @stream will not be closed.
     */
    public void writeMimeTypeAsync(ContentProvider provider, java.lang.String mimeType, org.gtk.gio.OutputStream stream, int ioPriority, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            int hash = callback.hashCode();
            Interop.signalRegistry.put(hash, callback);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.gdk_content_provider_write_mime_type_async(handle(), Interop.allocateNativeString(mimeType).handle(), stream.handle(), ioPriority, cancellable.handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous write operation.
     * 
     * See [method@Gdk.ContentProvider.write_mime_type_async].
     */
    public boolean writeMimeTypeFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_content_provider_write_mime_type_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    @FunctionalInterface
    public interface ContentChangedHandler {
        void signalReceived(ContentProvider source);
    }
    
    /**
     * Emitted whenever the content provided by this provider has changed.
     */
    public void onContentChanged(ContentChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalContentProviderContentChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("content-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
