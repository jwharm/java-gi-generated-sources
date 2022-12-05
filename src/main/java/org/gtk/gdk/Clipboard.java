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
    
    private static final java.lang.String C_TYPE_NAME = "GdkClipboard";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Clipboard proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Clipboard(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Clipboard if its GType is a (or inherits from) "GdkClipboard".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Clipboard} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkClipboard", a ClassCastException will be thrown.
     */
    public static Clipboard castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), Clipboard.getType())) {
            return new Clipboard(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkClipboard");
        }
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
            RESULT = (MemoryAddress) DowncallHandles.gdk_clipboard_get_content.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentProvider(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the {@code GdkDisplay} that the clipboard was created for.
     * @return a {@code GdkDisplay}
     */
    public @NotNull org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_clipboard_get_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Display(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the formats that the clipboard can provide its current contents in.
     * @return The formats of the clipboard
     */
    public @NotNull org.gtk.gdk.ContentFormats getFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_clipboard_get_formats.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentFormats(RESULT, Ownership.NONE);
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
            RESULT = (int) DowncallHandles.gdk_clipboard_is_local.invokeExact(
                    handle());
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
    public void readAsync(@NotNull java.lang.String[] mimeTypes, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(mimeTypes, "Parameter 'mimeTypes' must not be null");
        try {
            DowncallHandles.gdk_clipboard_read_async.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(mimeTypes, false),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
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
        MemorySegment outMimeTypePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_clipboard_read_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) outMimeTypePOINTER.address(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        outMimeType.set(Interop.getStringFrom(outMimeTypePOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        return new org.gtk.gio.InputStream(RESULT, Ownership.FULL);
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
        try {
            DowncallHandles.gdk_clipboard_read_text_async.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
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
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_clipboard_read_text_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Interop.getStringFrom(RESULT);
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
        try {
            DowncallHandles.gdk_clipboard_read_texture_async.invokeExact(
                    handle(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
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
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_clipboard_read_texture_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gdk.Texture(RESULT, Ownership.FULL);
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
        try {
            DowncallHandles.gdk_clipboard_read_value_async.invokeExact(
                    handle(),
                    type.getValue().longValue(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
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
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_clipboard_read_value_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gobject.Value(RESULT, Ownership.NONE);
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
     * @param varargs value contents conforming to {@code type}
     */
    public void set(@NotNull org.gtk.glib.Type type, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        try {
            DowncallHandles.gdk_clipboard_set.invokeExact(
                    handle(),
                    type.getValue().longValue(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_clipboard_set_content.invokeExact(
                    handle(),
                    (Addressable) (provider == null ? MemoryAddress.NULL : provider.handle()));
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
            DowncallHandles.gdk_clipboard_set_text.invokeExact(
                    handle(),
                    Interop.allocateNativeString(text));
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
            DowncallHandles.gdk_clipboard_set_texture.invokeExact(
                    handle(),
                    texture.handle());
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
            DowncallHandles.gdk_clipboard_set_valist.invokeExact(
                    handle(),
                    type.getValue().longValue(),
                    args);
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
            DowncallHandles.gdk_clipboard_set_value.invokeExact(
                    handle(),
                    value.handle());
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
        try {
            DowncallHandles.gdk_clipboard_store_async.invokeExact(
                    handle(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
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
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_clipboard_store_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_clipboard_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Changed {
        void signalReceived(Clipboard sourceClipboard);
    }
    
    /**
     * Emitted when the clipboard changes ownership.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Clipboard.Changed> onChanged(Clipboard.Changed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Clipboard.Callbacks.class, "signalClipboardChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Clipboard.Changed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link Clipboard.Build} object constructs a {@link Clipboard} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Clipboard} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Clipboard} using {@link Clipboard#castFrom}.
         * @return A new instance of {@code Clipboard} with the properties 
         *         that were set in the Build object.
         */
        public Clipboard construct() {
            return Clipboard.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Clipboard.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The {@code GdkContentProvider} or {@code null} if the clipboard is empty or contents are
         * provided otherwise.
         * @param content The value for the {@code content} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setContent(org.gtk.gdk.ContentProvider content) {
            names.add("content");
            values.add(org.gtk.gobject.Value.create(content));
            return this;
        }
        
        /**
         * The {@code GdkDisplay} that the clipboard belongs to.
         * @param display The value for the {@code display} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDisplay(org.gtk.gdk.Display display) {
            names.add("display");
            values.add(org.gtk.gobject.Value.create(display));
            return this;
        }
        
        /**
         * The possible formats that the clipboard can provide its data in.
         * @param formats The value for the {@code formats} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFormats(org.gtk.gdk.ContentFormats formats) {
            names.add("formats");
            values.add(org.gtk.gobject.Value.create(formats));
            return this;
        }
        
        /**
         * {@code true} if the contents of the clipboard are owned by this process.
         * @param local The value for the {@code local} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLocal(boolean local) {
            names.add("local");
            values.add(org.gtk.gobject.Value.create(local));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_clipboard_get_content = Interop.downcallHandle(
            "gdk_clipboard_get_content",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_clipboard_get_display = Interop.downcallHandle(
            "gdk_clipboard_get_display",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_clipboard_get_formats = Interop.downcallHandle(
            "gdk_clipboard_get_formats",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_clipboard_is_local = Interop.downcallHandle(
            "gdk_clipboard_is_local",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_clipboard_read_async = Interop.downcallHandle(
            "gdk_clipboard_read_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_clipboard_read_finish = Interop.downcallHandle(
            "gdk_clipboard_read_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_clipboard_read_text_async = Interop.downcallHandle(
            "gdk_clipboard_read_text_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_clipboard_read_text_finish = Interop.downcallHandle(
            "gdk_clipboard_read_text_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_clipboard_read_texture_async = Interop.downcallHandle(
            "gdk_clipboard_read_texture_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_clipboard_read_texture_finish = Interop.downcallHandle(
            "gdk_clipboard_read_texture_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_clipboard_read_value_async = Interop.downcallHandle(
            "gdk_clipboard_read_value_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_clipboard_read_value_finish = Interop.downcallHandle(
            "gdk_clipboard_read_value_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_clipboard_set = Interop.downcallHandle(
            "gdk_clipboard_set",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            true
        );
        
        private static final MethodHandle gdk_clipboard_set_content = Interop.downcallHandle(
            "gdk_clipboard_set_content",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_clipboard_set_text = Interop.downcallHandle(
            "gdk_clipboard_set_text",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_clipboard_set_texture = Interop.downcallHandle(
            "gdk_clipboard_set_texture",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_clipboard_set_valist = Interop.downcallHandle(
            "gdk_clipboard_set_valist",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_clipboard_set_value = Interop.downcallHandle(
            "gdk_clipboard_set_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_clipboard_store_async = Interop.downcallHandle(
            "gdk_clipboard_store_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_clipboard_store_finish = Interop.downcallHandle(
            "gdk_clipboard_store_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_clipboard_get_type = Interop.downcallHandle(
            "gdk_clipboard_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalClipboardChanged(MemoryAddress sourceClipboard, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Clipboard.Changed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Clipboard(sourceClipboard, Ownership.NONE));
        }
    }
}
