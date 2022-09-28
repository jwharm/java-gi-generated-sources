package org.gtk.gdk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GdkContentProvider} is used to provide content for the clipboard or
 * for drag-and-drop operations in a number of formats.
 * <p>
 * To create a {@code GdkContentProvider}, use {@link ContentProvider#newForValue}
 * or {@link ContentProvider#newForBytes}.
 * <p>
 * GDK knows how to handle common text and image formats out-of-the-box. See
 * {@code Gdk.ContentDeserializer} if you want
 * to add support for application-specific data formats.
 */
public class ContentProvider extends org.gtk.gobject.Object {

    public ContentProvider(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ContentProvider */
    public static ContentProvider castFrom(org.gtk.gobject.Object gobject) {
        return new ContentProvider(gobject.getReference());
    }
    
    private static Reference constructNewForBytes(java.lang.String mimeType, org.gtk.glib.Bytes bytes) {
        Reference RESULT = References.get(gtk_h.gdk_content_provider_new_for_bytes(Interop.allocateNativeString(mimeType).handle(), bytes.handle()), true);
        return RESULT;
    }
    
    /**
     * Create a content provider that provides the given {@code bytes} as data for
     * the given {@code mime_type}.
     */
    public static ContentProvider newForBytes(java.lang.String mimeType, org.gtk.glib.Bytes bytes) {
        return new ContentProvider(constructNewForBytes(mimeType, bytes));
    }
    
    private static Reference constructNewForValue(org.gtk.gobject.Value value) {
        Reference RESULT = References.get(gtk_h.gdk_content_provider_new_for_value(value.handle()), true);
        return RESULT;
    }
    
    /**
     * Create a content provider that provides the given {@code value}.
     */
    public static ContentProvider newForValue(org.gtk.gobject.Value value) {
        return new ContentProvider(constructNewForValue(value));
    }
    
    private static Reference constructNewUnion(ContentProvider[] providers, long nProviders) {
        Reference RESULT = References.get(gtk_h.gdk_content_provider_new_union(Interop.allocateNativeArray(providers).handle(), nProviders), true);
        return RESULT;
    }
    
    /**
     * Creates a content provider that represents all the given {@code providers}.
     * <p>
     * Whenever data needs to be written, the union provider will try the given
     * {@code providers} in the given order and the first one supporting a format will
     * be chosen to provide it.
     * <p>
     * This allows an easy way to support providing data in different formats.
     * For example, an image may be provided by its file and by the image
     * contents with a call such as
     * <pre>{@code c
     * gdk_content_provider_new_union ((GdkContentProvider *[2]) {
     *                                   gdk_content_provider_new_typed (G_TYPE_FILE, file),
     *                                   gdk_content_provider_new_typed (G_TYPE_TEXTURE, texture)
     *                                 }, 2);
     * }</pre>
     */
    public static ContentProvider newUnion(ContentProvider[] providers, long nProviders) {
        return new ContentProvider(constructNewUnion(providers, nProviders));
    }
    
    /**
     * Emits the ::content-changed signal.
     */
    public void contentChanged() {
        gtk_h.gdk_content_provider_content_changed(handle());
    }
    
    /**
     * Gets the contents of {@code provider} stored in {@code value}.
     * <p>
     * The {@code value} will have been initialized to the {@code GType} the value should be
     * provided in. This given {@code GType} does not need to be listed in the formats
     * returned by {@link ContentProvider#refFormats}. However, if the
     * given {@code GType} is not supported, this operation can fail and
     * {@code G_IO_ERROR_NOT_SUPPORTED} will be reported.
     */
    public boolean getValue(org.gtk.gobject.Value value) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_content_provider_get_value(handle(), value.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
     * <p>
     * An example of such an application would be a clipboard manager.
     * <p>
     * This can be assumed to be a subset of {@link ContentProvider#refFormats}.
     */
    public ContentFormats refStorableFormats() {
        var RESULT = gtk_h.gdk_content_provider_ref_storable_formats(handle());
        return new ContentFormats(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously writes the contents of {@code provider} to {@code stream} in the given
     * {@code mime_type}.
     * <p>
     * When the operation is finished {@code callback} will be called. You must then call
     * {@link ContentProvider#writeMimeTypeFinish} to get the result
     * of the operation.
     * <p>
     * The given mime type does not need to be listed in the formats returned by
     * {@link ContentProvider#refFormats}. However, if the given {@code GType} is
     * not supported, {@code G_IO_ERROR_NOT_SUPPORTED} will be reported.
     * <p>
     * The given {@code stream} will not be closed.
     */
    public void writeMimeTypeAsync(java.lang.String mimeType, org.gtk.gio.OutputStream stream, int ioPriority, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_content_provider_write_mime_type_async(handle(), Interop.allocateNativeString(mimeType).handle(), stream.handle(), ioPriority, cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous write operation.
     * <p>
     * See {@link ContentProvider#writeMimeTypeAsync}.
     */
    public boolean writeMimeTypeFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_content_provider_write_mime_type_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    @FunctionalInterface
    public interface ContentChangedHandler {
        void signalReceived(ContentProvider source);
    }
    
    /**
     * Emitted whenever the content provided by this provider has changed.
     */
    public SignalHandle onContentChanged(ContentChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("content-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ContentProvider.class, "__signalContentProviderContentChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalContentProviderContentChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (ContentProvider.ContentChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ContentProvider(References.get(source)));
    }
    
}
