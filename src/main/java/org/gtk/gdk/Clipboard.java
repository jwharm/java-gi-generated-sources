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
    
    private static final MethodHandle gdk_clipboard_get_content = Interop.downcallHandle(
        "gdk_clipboard_get_content",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GdkContentProvider} currently set on {@code clipboard}.
     * <p>
     * If the {@code clipboard} is empty or its contents are not owned by the
     * current process, {@code null} will be returned.
     */
    public @Nullable ContentProvider getContent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_clipboard_get_content.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ContentProvider(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_clipboard_get_display = Interop.downcallHandle(
        "gdk_clipboard_get_display",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GdkDisplay} that the clipboard was created for.
     */
    public @NotNull Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_clipboard_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Display(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_clipboard_get_formats = Interop.downcallHandle(
        "gdk_clipboard_get_formats",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the formats that the clipboard can provide its current contents in.
     */
    public @NotNull ContentFormats getFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_clipboard_get_formats.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ContentFormats(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_clipboard_is_local = Interop.downcallHandle(
        "gdk_clipboard_is_local",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
        int RESULT;
        try {
            RESULT = (int) gdk_clipboard_is_local.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gdk_clipboard_read_async = Interop.downcallHandle(
        "gdk_clipboard_read_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void readAsync(@NotNull java.lang.String[] mimeTypes, @NotNull int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gdk_clipboard_read_async.invokeExact(handle(), Interop.allocateNativeArray(mimeTypes), ioPriority, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_clipboard_read_finish = Interop.downcallHandle(
        "gdk_clipboard_read_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous clipboard read.
     * <p>
     * See {@link Clipboard#readAsync}.
     */
    public @Nullable org.gtk.gio.InputStream readFinish(@NotNull org.gtk.gio.AsyncResult result, @NotNull Out<java.lang.String> outMimeType) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment outMimeTypePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_clipboard_read_finish.invokeExact(handle(), result.handle(), (Addressable) outMimeTypePOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outMimeType.set(outMimeTypePOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.InputStream(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gdk_clipboard_read_text_async = Interop.downcallHandle(
        "gdk_clipboard_read_text_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void readTextAsync(@Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gdk_clipboard_read_text_async.invokeExact(handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_clipboard_read_text_finish = Interop.downcallHandle(
        "gdk_clipboard_read_text_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous clipboard read.
     * <p>
     * See {@link Clipboard#readTextAsync}.
     */
    public @Nullable java.lang.String readTextFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_clipboard_read_text_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gdk_clipboard_read_texture_async = Interop.downcallHandle(
        "gdk_clipboard_read_texture_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void readTextureAsync(@Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gdk_clipboard_read_texture_async.invokeExact(handle(), cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_clipboard_read_texture_finish = Interop.downcallHandle(
        "gdk_clipboard_read_texture_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous clipboard read.
     * <p>
     * See {@link Clipboard#readTextureAsync}.
     */
    public @Nullable Texture readTextureFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_clipboard_read_texture_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Texture(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gdk_clipboard_read_value_async = Interop.downcallHandle(
        "gdk_clipboard_read_value_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void readValueAsync(@NotNull org.gtk.gobject.Type type, @NotNull int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gdk_clipboard_read_value_async.invokeExact(handle(), type.getValue(), ioPriority, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_clipboard_read_value_finish = Interop.downcallHandle(
        "gdk_clipboard_read_value_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous clipboard read.
     * <p>
     * See {@link Clipboard#readValueAsync}.
     */
    public @NotNull org.gtk.gobject.Value readValueFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_clipboard_read_value_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gobject.Value(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_clipboard_set_content = Interop.downcallHandle(
        "gdk_clipboard_set_content",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public boolean setContent(@Nullable ContentProvider provider) {
        int RESULT;
        try {
            RESULT = (int) gdk_clipboard_set_content.invokeExact(handle(), provider.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gdk_clipboard_set_text = Interop.downcallHandle(
        "gdk_clipboard_set_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Puts the given {@code text} into the clipboard.
     */
    public @NotNull void setText(@NotNull java.lang.String text) {
        try {
            gdk_clipboard_set_text.invokeExact(handle(), Interop.allocateNativeString(text));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_clipboard_set_texture = Interop.downcallHandle(
        "gdk_clipboard_set_texture",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Puts the given {@code texture} into the clipboard.
     */
    public @NotNull void setTexture(@NotNull Texture texture) {
        try {
            gdk_clipboard_set_texture.invokeExact(handle(), texture.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_clipboard_set_valist = Interop.downcallHandle(
        "gdk_clipboard_set_valist",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the clipboard to contain the value collected from the given {@code args}.
     */
    public @NotNull void setValist(@NotNull org.gtk.gobject.Type type, @NotNull VaList args) {
        try {
            gdk_clipboard_set_valist.invokeExact(handle(), type.getValue(), args);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_clipboard_set_value = Interop.downcallHandle(
        "gdk_clipboard_set_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code clipboard} to contain the given {@code value}.
     */
    public @NotNull void setValue(@NotNull org.gtk.gobject.Value value) {
        try {
            gdk_clipboard_set_value.invokeExact(handle(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_clipboard_store_async = Interop.downcallHandle(
        "gdk_clipboard_store_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void storeAsync(@NotNull int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gdk_clipboard_store_async.invokeExact(handle(), ioPriority, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_clipboard_store_finish = Interop.downcallHandle(
        "gdk_clipboard_store_finish",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an asynchronous clipboard store.
     * <p>
     * See {@link Clipboard#storeAsync}.
     */
    public boolean storeFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) gdk_clipboard_store_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Clipboard.Callbacks.class, "signalClipboardChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
