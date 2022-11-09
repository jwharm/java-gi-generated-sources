package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkContentProvider} is used to provide content for the clipboard or
 * for drag-and-drop operations in a number of formats.
 * <p>
 * To create a {@code GdkContentProvider}, use {@link ContentProvider#newForValue}
 * or {@link ContentProvider#newForBytes}.
 * <p>
 * GDK knows how to handle common text and image formats out-of-the-box. See
 * {@link ContentSerializer} if you want
 * to add support for application-specific data formats.
 */
public class ContentProvider extends org.gtk.gobject.Object {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkContentProvider";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gtk.gobject.Object parent$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return new org.gtk.gobject.Object(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a ContentProvider proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ContentProvider(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ContentProvider if its GType is a (or inherits from) "GdkContentProvider".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ContentProvider" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkContentProvider", a ClassCastException will be thrown.
     */
    public static ContentProvider castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkContentProvider"))) {
            return new ContentProvider(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkContentProvider");
        }
    }
    
    private static Addressable constructNewForBytes(@NotNull java.lang.String mimeType, @NotNull org.gtk.glib.Bytes bytes) {
        java.util.Objects.requireNonNull(mimeType, "Parameter 'mimeType' must not be null");
        java.util.Objects.requireNonNull(bytes, "Parameter 'bytes' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_provider_new_for_bytes.invokeExact(
                    Interop.allocateNativeString(mimeType),
                    bytes.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a content provider that provides the given {@code bytes} as data for
     * the given {@code mime_type}.
     * @param mimeType the mime type
     * @param bytes a {@code GBytes} with the data for {@code mime_type}
     * @return a new {@code GdkContentProvider}
     */
    public static ContentProvider newForBytes(@NotNull java.lang.String mimeType, @NotNull org.gtk.glib.Bytes bytes) {
        return new ContentProvider(constructNewForBytes(mimeType, bytes), Ownership.FULL);
    }
    
    private static Addressable constructNewForValue(@NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_provider_new_for_value.invokeExact(
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a content provider that provides the given {@code value}.
     * @param value a {@code GValue}
     * @return a new {@code GdkContentProvider}
     */
    public static ContentProvider newForValue(@NotNull org.gtk.gobject.Value value) {
        return new ContentProvider(constructNewForValue(value), Ownership.FULL);
    }
    
    private static Addressable constructNewTyped(@NotNull org.gtk.glib.Type type, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_provider_new_typed.invokeExact(
                    type.getValue().longValue(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a content provider that provides the value of the given
     * {@code type}.
     * <p>
     * The value is provided using G_VALUE_COLLECT(), so the same rules
     * apply as when calling g_object_new() or g_object_set().
     * @param type Type of value to follow
     * @param varargs value
     * @return a new {@code GdkContentProvider}
     */
    public static ContentProvider newTyped(@NotNull org.gtk.glib.Type type, java.lang.Object... varargs) {
        return new ContentProvider(constructNewTyped(type, varargs), Ownership.FULL);
    }
    
    private static Addressable constructNewUnion(@Nullable org.gtk.gdk.ContentProvider[] providers, long nProviders) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_provider_new_union.invokeExact(
                    (Addressable) (providers == null ? MemoryAddress.NULL : Interop.allocateNativeArray(providers, false)),
                    nProviders);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param providers The {@code GdkContentProvider}s to present the union of
     * @param nProviders the number of providers
     * @return a new {@code GdkContentProvider}
     */
    public static ContentProvider newUnion(@Nullable org.gtk.gdk.ContentProvider[] providers, long nProviders) {
        return new ContentProvider(constructNewUnion(providers, nProviders), Ownership.FULL);
    }
    
    /**
     * Emits the ::content-changed signal.
     */
    public void contentChanged() {
        try {
            DowncallHandles.gdk_content_provider_content_changed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the contents of {@code provider} stored in {@code value}.
     * <p>
     * The {@code value} will have been initialized to the {@code GType} the value should be
     * provided in. This given {@code GType} does not need to be listed in the formats
     * returned by {@link ContentProvider#refFormats}. However, if the
     * given {@code GType} is not supported, this operation can fail and
     * {@code G_IO_ERROR_NOT_SUPPORTED} will be reported.
     * @param value the {@code GValue} to fill
     * @return {@code true} if the value was set successfully. Otherwise
     *   {@code error} will be set to describe the failure.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean getValue(@NotNull org.gtk.gobject.Value value) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_content_provider_get_value.invokeExact(
                    handle(),
                    value.handle(),
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
     * Gets the formats that the provider can provide its current contents in.
     * @return The formats of the provider
     */
    public @NotNull org.gtk.gdk.ContentFormats refFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_provider_ref_formats.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentFormats(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the formats that the provider suggests other applications to store
     * the data in.
     * <p>
     * An example of such an application would be a clipboard manager.
     * <p>
     * This can be assumed to be a subset of {@link ContentProvider#refFormats}.
     * @return The storable formats of the provider
     */
    public @NotNull org.gtk.gdk.ContentFormats refStorableFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_provider_ref_storable_formats.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentFormats(RESULT, Ownership.FULL);
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
     * @param mimeType the mime type to provide the data in
     * @param stream the {@code GOutputStream} to write to
     * @param ioPriority I/O priority of the request.
     * @param cancellable optional {@code GCancellable} object, {@code null} to ignore.
     * @param callback callback to call when the request is satisfied
     */
    public void writeMimeTypeAsync(@NotNull java.lang.String mimeType, @NotNull org.gtk.gio.OutputStream stream, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(mimeType, "Parameter 'mimeType' must not be null");
        java.util.Objects.requireNonNull(stream, "Parameter 'stream' must not be null");
        try {
            DowncallHandles.gdk_content_provider_write_mime_type_async.invokeExact(
                    handle(),
                    Interop.allocateNativeString(mimeType),
                    stream.handle(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an asynchronous write operation.
     * <p>
     * See {@link ContentProvider#writeMimeTypeAsync}.
     * @param result a {@code GAsyncResult}
     * @return {@code true} if the operation was completed successfully. Otherwise
     *   {@code error} will be set to describe the failure.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean writeMimeTypeFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_content_provider_write_mime_type_finish.invokeExact(
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
    
    @FunctionalInterface
    public interface ContentChanged {
        void signalReceived(ContentProvider source);
    }
    
    /**
     * Emitted whenever the content provided by this provider has changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ContentProvider.ContentChanged> onContentChanged(ContentProvider.ContentChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("content-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ContentProvider.Callbacks.class, "signalContentProviderContentChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ContentProvider.ContentChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_content_provider_new_for_bytes = Interop.downcallHandle(
            "gdk_content_provider_new_for_bytes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_provider_new_for_value = Interop.downcallHandle(
            "gdk_content_provider_new_for_value",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_provider_new_typed = Interop.downcallHandle(
            "gdk_content_provider_new_typed",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
            true
        );
        
        private static final MethodHandle gdk_content_provider_new_union = Interop.downcallHandle(
            "gdk_content_provider_new_union",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
            false
        );
        
        private static final MethodHandle gdk_content_provider_content_changed = Interop.downcallHandle(
            "gdk_content_provider_content_changed",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_provider_get_value = Interop.downcallHandle(
            "gdk_content_provider_get_value",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_provider_ref_formats = Interop.downcallHandle(
            "gdk_content_provider_ref_formats",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_provider_ref_storable_formats = Interop.downcallHandle(
            "gdk_content_provider_ref_storable_formats",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_provider_write_mime_type_async = Interop.downcallHandle(
            "gdk_content_provider_write_mime_type_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_provider_write_mime_type_finish = Interop.downcallHandle(
            "gdk_content_provider_write_mime_type_finish",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalContentProviderContentChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ContentProvider.ContentChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ContentProvider(source, Ownership.UNKNOWN));
        }
    }
}
