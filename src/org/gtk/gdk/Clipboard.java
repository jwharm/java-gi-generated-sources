package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>GdkClipboard</code> object represents data shared between applications or
 * inside an application.
 * <p>
 * To get a <code>GdkClipboard</code> object, use {@link org.gtk.gdk.Display#getClipboard} or
 * {@link org.gtk.gdk.Display#getPrimaryClipboard}. You can find out about the data
 * that is currently available in a clipboard using
 * {@link org.gtk.gdk.Clipboard#getFormats}.
 * <p>
 * To make text or image data available in a clipboard, use
 * {@link org.gtk.gdk.Clipboard#setText} or {@link org.gtk.gdk.Clipboard#setTexture}.
 * For other data, you can use {@link org.gtk.gdk.Clipboard#setContent}, which
 * takes a {@link org.gtk.gdk.ContentProvider} object.
 * <p>
 * To read textual or image data from a clipboard, use
 * {@link org.gtk.gdk.Clipboard#readTextAsync} or
 * {@link org.gtk.gdk.Clipboard#readTextureAsync}. For other data, use
 * {@link org.gtk.gdk.Clipboard#readAsync}, which provides a <code>GInputStream</code> object.
 */
public class Clipboard extends org.gtk.gobject.Object {

    public Clipboard(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Clipboard */
    public static Clipboard castFrom(org.gtk.gobject.Object gobject) {
        return new Clipboard(gobject.getReference());
    }
    
    /**
     * Returns the <code>GdkContentProvider</code> currently set on @clipboard.
     * 
     * If the @clipboard is empty or its contents are not owned by the
     * current process, <code>null</code> will be returned.
     */
    public ContentProvider getContent() {
        var RESULT = gtk_h.gdk_clipboard_get_content(handle());
        return new ContentProvider(References.get(RESULT, false));
    }
    
    /**
     * Gets the <code>GdkDisplay</code> that the clipboard was created for.
     */
    public Display getDisplay() {
        var RESULT = gtk_h.gdk_clipboard_get_display(handle());
        return new Display(References.get(RESULT, false));
    }
    
    /**
     * Gets the formats that the clipboard can provide its current contents in.
     */
    public ContentFormats getFormats() {
        var RESULT = gtk_h.gdk_clipboard_get_formats(handle());
        return new ContentFormats(References.get(RESULT, false));
    }
    
    /**
     * Returns if the clipboard is local.
     * 
     * A clipboard is considered local if it was last claimed
     * by the running application.
     * 
     * Note that {@link org.gtk.gdk.Clipboard#getContent} may return <code>NULL
     * even</code> on a local clipboard. In this case the clipboard is empty.
     */
    public boolean isLocal() {
        var RESULT = gtk_h.gdk_clipboard_is_local(handle());
        return (RESULT != 0);
    }
    
    /**
     * Asynchronously requests an input stream to read the @clipboard&#39;s
     * contents from.
     * 
     * When the operation is finished @callback will be called. You must then
     * call {@link org.gtk.gdk.Clipboard#readFinish} to get the result of the operation.
     * 
     * The clipboard will choose the most suitable mime type from the given list
     * to fulfill the request, preferring the ones listed first.
     */
    public void readAsync(java.lang.String[] mimeTypes, int ioPriority, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_clipboard_read_async(handle(), Interop.allocateNativeArray(mimeTypes).handle(), ioPriority, cancellable.handle(), 
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
    
    /**
     * Finishes an asynchronous clipboard read.
     * 
     * See {@link org.gtk.gdk.Clipboard#readAsync}.
     */
    public org.gtk.gio.InputStream readFinish(org.gtk.gio.AsyncResult result, java.lang.String[] outMimeType) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_clipboard_read_finish(handle(), result.handle(), Interop.allocateNativeArray(outMimeType).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.InputStream(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously request the @clipboard contents converted to a string.
     * 
     * When the operation is finished @callback will be called. You must then
     * call {@link org.gtk.gdk.Clipboard#readTextFinish} to get the result.
     * 
     * This is a simple wrapper around {@link org.gtk.gdk.Clipboard#readValueAsync}.
     * Use that function or {@link org.gtk.gdk.Clipboard#readAsync} directly if you
     * need more control over the operation.
     */
    public void readTextAsync(org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_clipboard_read_text_async(handle(), cancellable.handle(), 
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
    
    /**
     * Finishes an asynchronous clipboard read.
     * 
     * See {@link org.gtk.gdk.Clipboard#readTextAsync}.
     */
    public java.lang.String readTextFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_clipboard_read_text_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Asynchronously request the @clipboard contents converted to a <code>GdkPixbuf</code>.
     * 
     * When the operation is finished @callback will be called. You must then
     * call {@link org.gtk.gdk.Clipboard#readTextureFinish} to get the result.
     * 
     * This is a simple wrapper around {@link org.gtk.gdk.Clipboard#readValueAsync}.
     * Use that function or {@link org.gtk.gdk.Clipboard#readAsync} directly if you
     * need more control over the operation.
     */
    public void readTextureAsync(org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_clipboard_read_texture_async(handle(), cancellable.handle(), 
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
    
    /**
     * Finishes an asynchronous clipboard read.
     * 
     * See {@link org.gtk.gdk.Clipboard#readTextureAsync}.
     */
    public Texture readTextureFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_clipboard_read_texture_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Texture(References.get(RESULT, true));
    }
    
    /**
     * Asynchronously request the @clipboard contents converted to the given
     * @type.
     * <p>
     * When the operation is finished @callback will be called. You must then call
     * {@link org.gtk.gdk.Clipboard#readValueFinish} to get the resulting <code>GValue</code>.
     * <p>
     * For local clipboard contents that are available in the given <code>GType</code>,
     * the value will be copied directly. Otherwise, GDK will try to use
     * {@link [func@content_deserialize_async]} to convert the clipboard&#39;s data.
     */
    public void readValueAsync(Type type, int ioPriority, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_clipboard_read_value_async(handle(), type.getValue(), ioPriority, cancellable.handle(), 
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
    
    /**
     * Finishes an asynchronous clipboard read.
     * 
     * See {@link org.gtk.gdk.Clipboard#readValueAsync}.
     */
    public org.gtk.gobject.Value readValueFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_clipboard_read_value_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gobject.Value(References.get(RESULT, false));
    }
    
    /**
     * Sets a new content provider on @clipboard.
     * <p>
     * The clipboard will claim the <code>GdkDisplay</code>&#39;s resources and advertise
     * these new contents to other applications.
     * 
     * In the rare case of a failure, this function will return <code>FALSE.</code> The
     * clipboard will then continue reporting its old contents and ignore
     * @provider.
     * 
     * If the contents are read by either an external application or the
     * @clipboard&#39;s read functions, @clipboard will select the best format to
     * transfer the contents and then request that format from @provider.
     */
    public boolean setContent(ContentProvider provider) {
        var RESULT = gtk_h.gdk_clipboard_set_content(handle(), provider.handle());
        return (RESULT != 0);
    }
    
    /**
     * Puts the given @text into the clipboard.
     */
    public void setText(java.lang.String text) {
        gtk_h.gdk_clipboard_set_text(handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Puts the given @texture into the clipboard.
     */
    public void setTexture(Texture texture) {
        gtk_h.gdk_clipboard_set_texture(handle(), texture.handle());
    }
    
    /**
     * Sets the clipboard to contain the value collected from the given @args.
     */
    public void setValist(Type type, VaList args) {
        gtk_h.gdk_clipboard_set_valist(handle(), type.getValue(), args);
    }
    
    /**
     * Sets the @clipboard to contain the given @value.
     */
    public void setValue(org.gtk.gobject.Value value) {
        gtk_h.gdk_clipboard_set_value(handle(), value.handle());
    }
    
    /**
     * Asynchronously instructs the @clipboard to store its contents remotely.
     * 
     * If the clipboard is not local, this function does nothing but report success.
     * 
     * The @callback must call {@link org.gtk.gdk.Clipboard#storeFinish}.
     * 
     * The purpose of this call is to preserve clipboard contents beyond the
     * lifetime of an application, so this function is typically called on
     * exit. Depending on the platform, the functionality may not be available
     * unless a &#34;clipboard manager&#34; is running.
     * 
     * This function is called automatically when a {@link org.gtk.gtk.Application} is
     * shut down, so you likely don&#39;t need to call it.
     */
    public void storeAsync(int ioPriority, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_clipboard_store_async(handle(), ioPriority, cancellable.handle(), 
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
    
    /**
     * Finishes an asynchronous clipboard store.
     * 
     * See {@link org.gtk.gdk.Clipboard#storeAsync}.
     */
    public boolean storeFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_clipboard_store_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(Clipboard source);
    }
    
    /**
     * Emitted when the clipboard changes ownership.
     */
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalClipboardChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
