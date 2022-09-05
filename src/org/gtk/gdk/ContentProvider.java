package org.gtk.gdk;

import org.gtk.gobject.*;
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

    public ContentProvider(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ContentProvider */
    public static ContentProvider castFrom(org.gtk.gobject.Object gobject) {
        return new ContentProvider(gobject.getProxy());
    }
    
    /**
     * Create a content provider that provides the given @bytes as data for
     * the given @mime_type.
     */
    public ContentProvider(java.lang.String mimeType, org.gtk.glib.Bytes bytes) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_provider_new_for_bytes(Interop.allocateNativeString(mimeType).HANDLE(), bytes.HANDLE()), true));
    }
    
    /**
     * Create a content provider that provides the given @value.
     */
    public ContentProvider(org.gtk.gobject.Value value) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_provider_new_for_value(value.HANDLE()), true));
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
    public ContentProvider(ContentProvider[] providers, long nProviders) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_provider_new_union(Interop.allocateNativeArray(providers), nProviders), true));
    }
    
    /**
     * Emits the ::content-changed signal.
     */
    public void contentChanged() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_provider_content_changed(HANDLE());
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
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_provider_get_value(HANDLE(), value.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets the formats that the provider can provide its current contents in.
     */
    public ContentFormats refFormats() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_provider_ref_formats(HANDLE());
        return new ContentFormats(ProxyFactory.get(RESULT, true));
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_provider_ref_storable_formats(HANDLE());
        return new ContentFormats(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Finishes an asynchronous write operation.
     * 
     * See [method@Gdk.ContentProvider.write_mime_type_async].
     */
    public boolean writeMimeTypeFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_provider_write_mime_type_finish(HANDLE(), result.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
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
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalContentProviderContentChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("content-changed").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
