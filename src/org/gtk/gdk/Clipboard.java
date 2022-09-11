package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GdkClipboard` object represents data shared between applications or
 * inside an application.
 * 
 * To get a `GdkClipboard` object, use [method@Gdk.Display.get_clipboard] or
 * [method@Gdk.Display.get_primary_clipboard]. You can find out about the data
 * that is currently available in a clipboard using
 * [method@Gdk.Clipboard.get_formats].
 * 
 * To make text or image data available in a clipboard, use
 * [method@Gdk.Clipboard.set_text] or [method@Gdk.Clipboard.set_texture].
 * For other data, you can use [method@Gdk.Clipboard.set_content], which
 * takes a [class@Gdk.ContentProvider] object.
 * 
 * To read textual or image data from a clipboard, use
 * [method@Gdk.Clipboard.read_text_async] or
 * [method@Gdk.Clipboard.read_texture_async]. For other data, use
 * [method@Gdk.Clipboard.read_async], which provides a `GInputStream` object.
 */
public class Clipboard extends org.gtk.gobject.Object {

    public Clipboard(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Clipboard */
    public static Clipboard castFrom(org.gtk.gobject.Object gobject) {
        return new Clipboard(gobject.getReference());
    }
    
    /**
     * Returns the `GdkContentProvider` currently set on @clipboard.
     * 
     * If the @clipboard is empty or its contents are not owned by the
     * current process, %NULL will be returned.
     */
    public ContentProvider getContent() {
        var RESULT = gtk_h.gdk_clipboard_get_content(handle());
        return new ContentProvider(References.get(RESULT, false));
    }
    
    /**
     * Gets the `GdkDisplay` that the clipboard was created for.
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
     * Note that [method@Gdk.Clipboard.get_content] may return %NULL
     * even on a local clipboard. In this case the clipboard is empty.
     */
    public boolean isLocal() {
        var RESULT = gtk_h.gdk_clipboard_is_local(handle());
        return (RESULT != 0);
    }
    
    /**
     * Asynchronously requests an input stream to read the @clipboard's
     * contents from.
     * 
     * When the operation is finished @callback will be called. You must then
     * call [method@Gdk.Clipboard.read_finish] to get the result of the operation.
     * 
     * The clipboard will choose the most suitable mime type from the given list
     * to fulfill the request, preferring the ones listed first.
     */
    public void readAsync(Clipboard clipboard, java.lang.String[] mimeTypes, int ioPriority, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            int hash = callback.hashCode();
            Interop.signalRegistry.put(hash, callback);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.gdk_clipboard_read_async(handle(), Interop.allocateNativeArray(mimeTypes).handle(), ioPriority, cancellable.handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous clipboard read.
     * 
     * See [method@Gdk.Clipboard.read_async].
     */
    public org.gtk.gio.InputStream readFinish(org.gtk.gio.AsyncResult result, java.lang.String[] outMimeType) throws io.github.jwharm.javagi.interop.GErrorException {
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
     * call [method@Gdk.Clipboard.read_text_finish] to get the result.
     * 
     * This is a simple wrapper around [method@Gdk.Clipboard.read_value_async].
     * Use that function or [method@Gdk.Clipboard.read_async] directly if you
     * need more control over the operation.
     */
    public void readTextAsync(Clipboard clipboard, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            int hash = callback.hashCode();
            Interop.signalRegistry.put(hash, callback);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.gdk_clipboard_read_text_async(handle(), cancellable.handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous clipboard read.
     * 
     * See [method@Gdk.Clipboard.read_text_async].
     */
    public java.lang.String readTextFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_clipboard_read_text_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Asynchronously request the @clipboard contents converted to a `GdkPixbuf`.
     * 
     * When the operation is finished @callback will be called. You must then
     * call [method@Gdk.Clipboard.read_texture_finish] to get the result.
     * 
     * This is a simple wrapper around [method@Gdk.Clipboard.read_value_async].
     * Use that function or [method@Gdk.Clipboard.read_async] directly if you
     * need more control over the operation.
     */
    public void readTextureAsync(Clipboard clipboard, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            int hash = callback.hashCode();
            Interop.signalRegistry.put(hash, callback);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.gdk_clipboard_read_texture_async(handle(), cancellable.handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous clipboard read.
     * 
     * See [method@Gdk.Clipboard.read_texture_async].
     */
    public Texture readTextureFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
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
     * 
     * When the operation is finished @callback will be called. You must then call
     * [method@Gdk.Clipboard.read_value_finish] to get the resulting `GValue`.
     * 
     * For local clipboard contents that are available in the given `GType`,
     * the value will be copied directly. Otherwise, GDK will try to use
     * [func@content_deserialize_async] to convert the clipboard's data.
     */
    public void readValueAsync(Clipboard clipboard, Type type, int ioPriority, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            int hash = callback.hashCode();
            Interop.signalRegistry.put(hash, callback);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.gdk_clipboard_read_value_async(handle(), type.getValue(), ioPriority, cancellable.handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous clipboard read.
     * 
     * See [method@Gdk.Clipboard.read_value_async].
     */
    public org.gtk.gobject.Value readValueFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_clipboard_read_value_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gobject.Value(References.get(RESULT, false));
    }
    
    /**
     * Sets a new content provider on @clipboard.
     * 
     * The clipboard will claim the `GdkDisplay`'s resources and advertise
     * these new contents to other applications.
     * 
     * In the rare case of a failure, this function will return %FALSE. The
     * clipboard will then continue reporting its old contents and ignore
     * @provider.
     * 
     * If the contents are read by either an external application or the
     * @clipboard's read functions, @clipboard will select the best format to
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
     * The @callback must call [method@Gdk.Clipboard.store_finish].
     * 
     * The purpose of this call is to preserve clipboard contents beyond the
     * lifetime of an application, so this function is typically called on
     * exit. Depending on the platform, the functionality may not be available
     * unless a "clipboard manager" is running.
     * 
     * This function is called automatically when a [class@Gtk.Application] is
     * shut down, so you likely don't need to call it.
     */
    public void storeAsync(Clipboard clipboard, int ioPriority, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            int hash = callback.hashCode();
            Interop.signalRegistry.put(hash, callback);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.gdk_clipboard_store_async(handle(), ioPriority, cancellable.handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finishes an asynchronous clipboard store.
     * 
     * See [method@Gdk.Clipboard.store_async].
     */
    public boolean storeFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.interop.GErrorException {
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
    public void onChanged(ChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalClipboardChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
