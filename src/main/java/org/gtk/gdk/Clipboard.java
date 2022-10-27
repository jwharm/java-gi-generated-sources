package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * {@link Clipboard#setText} or {@link Clipboard#setTexture}.
 * For other data, you can use {@link Clipboard#setContent}, which
 * takes a {@link ContentProvider} object.
 * <p>
 * To read textual or image data from a clipboard, use
 * {@link Clipboard#readTextAsync} or
 * {@link Clipboard#readTextureAsync}. For other data, use
 * {@link Clipboard#readAsync}, which provides a {@code GInputStream} object.
 */
public class Clipboard extends org.gtk.gobject.Object {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
     * @return The content of a clipboard
     *   if the clipboard does not maintain any content
     */
    public @Nullable org.gtk.gdk.ContentProvider getContent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_clipboard_get_content.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentProvider(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the {@code GdkDisplay} that the clipboard was created for.
     * @return a {@code GdkDisplay}
     */
    public @NotNull org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_clipboard_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Display(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the formats that the clipboard can provide its current contents in.
     * @return The formats of the clipboard
     */
    public @NotNull org.gtk.gdk.ContentFormats getFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_clipboard_get_formats.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentFormats(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns if the clipboard is local.
     * <p>
     * A clipboard is considered local if it was last claimed
     * by the running application.
     * <p>
     * Note that {@link Clipboard#getContent} may return {@code null}
     * even on a local clipboard. In this case the clipboard is empty.
     * @return {@code true} if the clipboard is local
     */
    public boolean isLocal() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_clipboard_is_local.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param mimeTypes a {@code null}-terminated array of mime types to choose from
     * @param ioPriority the I/O priority of the request
     * @param cancellable optional {@code GCancellable} object
     * @param callback callback to call when the request is satisfied
     */
    public void readAsync(java.lang.String[] mimeTypes, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(mimeTypes, "Parameter 'mimeTypes' must not be null");
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(callback, MemoryAddress.NULL);
        try {
            DowncallHandles.gdk_clipboard_read_async.invokeExact(handle(), Interop.allocateNativeArray(mimeTypes, false), ioPriority, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous clipboard read.
     * <p>
     * See {@link Clipboard#readAsync}.
     * @param result a {@code GAsyncResult}
     * @param outMimeType location to store
     *   the chosen mime type
     * @return a {@code GInputStream}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @Nullable org.gtk.gio.InputStream readFinish(@NotNull org.gtk.gio.AsyncResult result, @NotNull Out<java.lang.String> outMimeType) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        java.util.Objects.requireNonNull(outMimeType, "Parameter 'outMimeType' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment outMimeTypePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_clipboard_read_finish.invokeExact(handle(), result.handle(), (Addressable) outMimeTypePOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        outMimeType.set(outMimeTypePOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
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
     * @param cancellable optional {@code GCancellable} object
     * @param callback callback to call when the request is satisfied
     */
    public void readTextAsync(@Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(callback, MemoryAddress.NULL);
        try {
            DowncallHandles.gdk_clipboard_read_text_async.invokeExact(handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous clipboard read.
     * <p>
     * See {@link Clipboard#readTextAsync}.
     * @param result a {@code GAsyncResult}
     * @return a new string
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @Nullable java.lang.String readTextFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_clipboard_read_text_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param cancellable optional {@code GCancellable} object, {@code null} to ignore.
     * @param callback callback to call when the request is satisfied
     */
    public void readTextureAsync(@Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(callback, MemoryAddress.NULL);
        try {
            DowncallHandles.gdk_clipboard_read_texture_async.invokeExact(handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous clipboard read.
     * <p>
     * See {@link Clipboard#readTextureAsync}.
     * @param result a {@code GAsyncResult}
     * @return a new {@code GdkTexture}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @Nullable org.gtk.gdk.Texture readTextureFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_clipboard_read_texture_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gdk.Texture(Refcounted.get(RESULT, true));
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
     * {@link Gdk#contentDeserializeAsync} to convert the clipboard's data.
     * @param type a {@code GType} to read
     * @param ioPriority the I/O priority of the request
     * @param cancellable optional {@code GCancellable} object
     * @param callback callback to call when the request is satisfied
     */
    public void readValueAsync(@NotNull org.gtk.glib.Type type, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(callback, MemoryAddress.NULL);
        try {
            DowncallHandles.gdk_clipboard_read_value_async.invokeExact(handle(), type.getValue(), ioPriority, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous clipboard read.
     * <p>
     * See {@link Clipboard#readValueAsync}.
     * @param result a {@code GAsyncResult}
     * @return a {@code GValue} containing the result.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gobject.Value readValueFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_clipboard_read_value_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gobject.Value(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the clipboard to contain the value collected from the given varargs.
     * <p>
     * Values should be passed the same way they are passed to other value
     * collecting APIs, such as {@code GObject.Object.set`} or
     * {@code GObject.signal_emit`}.
     * <pre>{@code c
     * gdk_clipboard_set (clipboard, GTK_TYPE_STRING, "Hello World");
     * 
     * gdk_clipboard_set (clipboard, GDK_TYPE_TEXTURE, some_texture);
     * }</pre>
     * @param type type of value to set
     */
    public void set(@NotNull org.gtk.glib.Type type) {
        throw new UnsupportedOperationException("Operation not supported yet");
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
     * @param provider the new contents of {@code clipboard}
     *   or {@code null} to clear the clipboard
     * @return {@code true} if setting the clipboard succeeded
     */
    public boolean setContent(@Nullable org.gtk.gdk.ContentProvider provider) {
        java.util.Objects.requireNonNullElse(provider, MemoryAddress.NULL);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_clipboard_set_content.invokeExact(handle(), provider.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Puts the given {@code text} into the clipboard.
     * @param text Text to put into the clipboard
     */
    public void setText(@NotNull java.lang.String text) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        try {
            DowncallHandles.gdk_clipboard_set_text.invokeExact(handle(), Interop.allocateNativeString(text));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Puts the given {@code texture} into the clipboard.
     * @param texture a {@code GdkTexture} to put into the clipboard
     */
    public void setTexture(@NotNull org.gtk.gdk.Texture texture) {
        java.util.Objects.requireNonNull(texture, "Parameter 'texture' must not be null");
        try {
            DowncallHandles.gdk_clipboard_set_texture.invokeExact(handle(), texture.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the clipboard to contain the value collected from the given {@code args}.
     * @param type type of value to set
     * @param args varargs containing the value of {@code type}
     */
    public void setValist(@NotNull org.gtk.glib.Type type, @NotNull VaList args) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        try {
            DowncallHandles.gdk_clipboard_set_valist.invokeExact(handle(), type.getValue(), args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code clipboard} to contain the given {@code value}.
     * @param value a {@code GValue} to set
     */
    public void setValue(@NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gdk_clipboard_set_value.invokeExact(handle(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param ioPriority the I/O priority of the request
     * @param cancellable optional {@code GCancellable} object
     * @param callback callback to call when the request is satisfied
     */
    public void storeAsync(int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(callback, MemoryAddress.NULL);
        try {
            DowncallHandles.gdk_clipboard_store_async.invokeExact(handle(), ioPriority, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous clipboard store.
     * <p>
     * See {@link Clipboard#storeAsync}.
     * @param result a {@code GAsyncResult}
     * @return {@code true} if storing was successful.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean storeFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_clipboard_store_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    @FunctionalInterface
    public interface Changed {
        void signalReceived(Clipboard source);
    }
    
    /**
     * Emitted when the clipboard changes ownership.
     */
    public Signal<Clipboard.Changed> onChanged(Clipboard.Changed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Clipboard.Callbacks.class, "signalClipboardChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Clipboard.Changed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_clipboard_get_content = Interop.downcallHandle(
            "gdk_clipboard_get_content",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_clipboard_get_display = Interop.downcallHandle(
            "gdk_clipboard_get_display",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_clipboard_get_formats = Interop.downcallHandle(
            "gdk_clipboard_get_formats",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_clipboard_is_local = Interop.downcallHandle(
            "gdk_clipboard_is_local",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_clipboard_read_async = Interop.downcallHandle(
            "gdk_clipboard_read_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_clipboard_read_finish = Interop.downcallHandle(
            "gdk_clipboard_read_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_clipboard_read_text_async = Interop.downcallHandle(
            "gdk_clipboard_read_text_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_clipboard_read_text_finish = Interop.downcallHandle(
            "gdk_clipboard_read_text_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_clipboard_read_texture_async = Interop.downcallHandle(
            "gdk_clipboard_read_texture_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_clipboard_read_texture_finish = Interop.downcallHandle(
            "gdk_clipboard_read_texture_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_clipboard_read_value_async = Interop.downcallHandle(
            "gdk_clipboard_read_value_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_clipboard_read_value_finish = Interop.downcallHandle(
            "gdk_clipboard_read_value_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_clipboard_set = Interop.downcallHandle(
            "gdk_clipboard_set",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_clipboard_set_content = Interop.downcallHandle(
            "gdk_clipboard_set_content",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_clipboard_set_text = Interop.downcallHandle(
            "gdk_clipboard_set_text",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_clipboard_set_texture = Interop.downcallHandle(
            "gdk_clipboard_set_texture",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_clipboard_set_valist = Interop.downcallHandle(
            "gdk_clipboard_set_valist",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_clipboard_set_value = Interop.downcallHandle(
            "gdk_clipboard_set_value",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_clipboard_store_async = Interop.downcallHandle(
            "gdk_clipboard_store_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_clipboard_store_finish = Interop.downcallHandle(
            "gdk_clipboard_store_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalClipboardChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Clipboard.Changed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Clipboard(Refcounted.get(source)));
        }
    }
}
