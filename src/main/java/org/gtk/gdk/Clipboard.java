package org.gtk.gdk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GdkClipboard} object represents data shared between applications or
 * inside an application.
 * <p>
 * To get a {@code GdkClipboard} object, use {@link Display#getClipboard} or
 * {@link Display#getPrimaryClipboard}. You can find out about the data
 * that is currently available in a clipboard using
 * {@link Clipboard#getFormats}.
 * <p>
 * To make text or image data available in a clipboard, use
 * {@code Gdk.Clipboard.set_texture}.
 * For other data, you can use {@link Clipboard#setContent}, which
 * takes a {@link ContentProvider} object.
 * <p>
 * To read textual or image data from a clipboard, use
 * {@link Clipboard#readTextAsync} or
 * {@link Clipboard#readTextureAsync}. For other data, use
 * {@link Clipboard#readAsync}, which provides a {@code GInputStream} object.
 */
public class Clipboard extends org.gtk.gobject.Object {

    public Clipboard(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Clipboard */
    public static Clipboard castFrom(org.gtk.gobject.Object gobject) {
        return new Clipboard(gobject.refcounted());
    }
    
    /**
     * Returns the {@code GdkContentProvider} currently set on {@code clipboard}.
     * <p>
     * If the {@code clipboard} is empty or its contents are not owned by the
     * current process, {@code null} will be returned.
     */
    public ContentProvider getContent() {
        var RESULT = gtk_h.gdk_clipboard_get_content(handle());
        return new ContentProvider(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the {@code GdkDisplay} that the clipboard was created for.
     */
    public Display getDisplay() {
        var RESULT = gtk_h.gdk_clipboard_get_display(handle());
        return new Display(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the formats that the clipboard can provide its current contents in.
     */
    public ContentFormats getFormats() {
        var RESULT = gtk_h.gdk_clipboard_get_formats(handle());
        return new ContentFormats(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns if the clipboard is local.
     * <p>
     * A clipboard is considered local if it was last claimed
     * by the running application.
     * <p>
     * Note that {@link Clipboard#getContent} may return {@code null}
     * even on a local clipboard. In this case the clipboard is empty.
     */
    public boolean isLocal() {
        var RESULT = gtk_h.gdk_clipboard_is_local(handle());
        return RESULT != 0;
    }
    
    /**
     * Asynchronously requests an input stream to read the {@code clipboard}'s
     * contents from.
     * <p>
     * When the operation is finished {@code callback} will be called. You must then
     * call {@link Clipboard#readFinish} to get the result of the operation.
     * <p>
     * The clipboard will choose the most suitable mime type from the given list
     * to fulfill the request, preferring the ones listed first.
     */
    public void readAsync(java.lang.String[] mimeTypes, int ioPriority, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_clipboard_read_async(handle(), Interop.allocateNativeArray(mimeTypes).handle(), ioPriority, cancellable.handle(), 
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
     * Finishes an asynchronous clipboard read.
     * <p>
     * See {@link Clipboard#readAsync}.
     */
    public org.gtk.gio.InputStream readFinish(org.gtk.gio.AsyncResult result, java.lang.String[] outMimeType) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_clipboard_read_finish(handle(), result.handle(), Interop.allocateNativeArray(outMimeType).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.InputStream(Refcounted.get(RESULT, true));
    }
    
    /**
     * Asynchronously request the {@code clipboard} contents converted to a string.
     * <p>
     * When the operation is finished {@code callback} will be called. You must then
     * call {@link Clipboard#readTextFinish} to get the result.
     * <p>
     * This is a simple wrapper around {@link Clipboard#readValueAsync}.
     * Use that function or {@link Clipboard#readAsync} directly if you
     * need more control over the operation.
     */
    public void readTextAsync(org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_clipboard_read_text_async(handle(), cancellable.handle(), 
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
     * Finishes an asynchronous clipboard read.
     * <p>
     * See {@link Clipboard#readTextAsync}.
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
     * Asynchronously request the {@code clipboard} contents converted to a {@code GdkPixbuf}.
     * <p>
     * When the operation is finished {@code callback} will be called. You must then
     * call {@link Clipboard#readTextureFinish} to get the result.
     * <p>
     * This is a simple wrapper around {@link Clipboard#readValueAsync}.
     * Use that function or {@link Clipboard#readAsync} directly if you
     * need more control over the operation.
     */
    public void readTextureAsync(org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_clipboard_read_texture_async(handle(), cancellable.handle(), 
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
     * Finishes an asynchronous clipboard read.
     * <p>
     * See {@link Clipboard#readTextureAsync}.
     */
    public Texture readTextureFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_clipboard_read_texture_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Texture(Refcounted.get(RESULT, true));
    }
    
    /**
     * Asynchronously request the {@code clipboard} contents converted to the given
     * {@code type}.
     * <p>
     * When the operation is finished {@code callback} will be called. You must then call
     * {@link Clipboard#readValueFinish} to get the resulting {@code GValue}.
     * <p>
     * For local clipboard contents that are available in the given {@code GType},
     * the value will be copied directly. Otherwise, GDK will try to use
     * {@link content_deserialize_async#null} to convert the clipboard's data.
     */
    public void readValueAsync(org.gtk.gobject.Type type, int ioPriority, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_clipboard_read_value_async(handle(), type.getValue(), ioPriority, cancellable.handle(), 
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
     * Finishes an asynchronous clipboard read.
     * <p>
     * See {@link Clipboard#readValueAsync}.
     */
    public org.gtk.gobject.Value readValueFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_clipboard_read_value_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gobject.Value(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets a new content provider on {@code clipboard}.
     * <p>
     * The clipboard will claim the {@code GdkDisplay}'s resources and advertise
     * these new contents to other applications.
     * <p>
     * In the rare case of a failure, this function will return {@code false}. The
     * clipboard will then continue reporting its old contents and ignore
     * {@code provider}.
     * <p>
     * If the contents are read by either an external application or the
     * {@code clipboard}'s read functions, {@code clipboard} will select the best format to
     * transfer the contents and then request that format from {@code provider}.
     */
    public boolean setContent(ContentProvider provider) {
        var RESULT = gtk_h.gdk_clipboard_set_content(handle(), provider.handle());
        return RESULT != 0;
    }
    
    /**
     * Puts the given {@code text} into the clipboard.
     */
    public void setText(java.lang.String text) {
        gtk_h.gdk_clipboard_set_text(handle(), Interop.allocateNativeString(text).handle());
    }
    
    /**
     * Puts the given {@code texture} into the clipboard.
     */
    public void setTexture(Texture texture) {
        gtk_h.gdk_clipboard_set_texture(handle(), texture.handle());
    }
    
    /**
     * Sets the clipboard to contain the value collected from the given {@code args}.
     */
    public void setValist(org.gtk.gobject.Type type, VaList args) {
        gtk_h.gdk_clipboard_set_valist(handle(), type.getValue(), args);
    }
    
    /**
     * Sets the {@code clipboard} to contain the given {@code value}.
     */
    public void setValue(org.gtk.gobject.Value value) {
        gtk_h.gdk_clipboard_set_value(handle(), value.handle());
    }
    
    /**
     * Asynchronously instructs the {@code clipboard} to store its contents remotely.
     * <p>
     * If the clipboard is not local, this function does nothing but report success.
     * <p>
     * The {@code callback} must call {@link Clipboard#storeFinish}.
     * <p>
     * The purpose of this call is to preserve clipboard contents beyond the
     * lifetime of an application, so this function is typically called on
     * exit. Depending on the platform, the functionality may not be available
     * unless a "clipboard manager" is running.
     * <p>
     * This function is called automatically when a {@link org.gtk.gtk.Application} is
     * shut down, so you likely don't need to call it.
     */
    public void storeAsync(int ioPriority, org.gtk.gio.Cancellable cancellable, org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gtk_h.gdk_clipboard_store_async(handle(), ioPriority, cancellable.handle(), 
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
     * Finishes an asynchronous clipboard store.
     * <p>
     * See {@link Clipboard#storeAsync}.
     */
    public boolean storeFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_clipboard_store_finish(handle(), result.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Clipboard.Callbacks.class, "signalClipboardChanged",
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
    
    public static class Callbacks {
    
        public static void signalClipboardChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Clipboard.ChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Clipboard(Refcounted.get(source)));
        }
        
    }
}
