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
public class ContentProvider extends org.gtk.gobject.GObject {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkContentProvider";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ContentProvider proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ContentProvider(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ContentProvider> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ContentProvider(input, ownership);
    
    private static MemoryAddress constructNewForBytes(java.lang.String mimeType, org.gtk.glib.Bytes bytes) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_provider_new_for_bytes.invokeExact(
                    Marshal.stringToAddress.marshal(mimeType, null),
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
    public static ContentProvider newForBytes(java.lang.String mimeType, org.gtk.glib.Bytes bytes) {
        var RESULT = constructNewForBytes(mimeType, bytes);
        return (org.gtk.gdk.ContentProvider) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.ContentProvider.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewForValue(org.gtk.gobject.Value value) {
        MemoryAddress RESULT;
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
    public static ContentProvider newForValue(org.gtk.gobject.Value value) {
        var RESULT = constructNewForValue(value);
        return (org.gtk.gdk.ContentProvider) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.ContentProvider.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewTyped(org.gtk.glib.Type type, java.lang.Object... varargs) {
        MemoryAddress RESULT;
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
    public static ContentProvider newTyped(org.gtk.glib.Type type, java.lang.Object... varargs) {
        var RESULT = constructNewTyped(type, varargs);
        return (org.gtk.gdk.ContentProvider) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.ContentProvider.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewUnion(@Nullable org.gtk.gdk.ContentProvider[] providers, long nProviders) {
        MemoryAddress RESULT;
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
        var RESULT = constructNewUnion(providers, nProviders);
        return (org.gtk.gdk.ContentProvider) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.ContentProvider.fromAddress).marshal(RESULT, Ownership.FULL);
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
    public boolean getValue(org.gtk.gobject.Value value) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the formats that the provider can provide its current contents in.
     * @return The formats of the provider
     */
    public org.gtk.gdk.ContentFormats refFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_provider_ref_formats.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.ContentFormats.fromAddress.marshal(RESULT, Ownership.FULL);
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
    public org.gtk.gdk.ContentFormats refStorableFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_provider_ref_storable_formats.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.ContentFormats.fromAddress.marshal(RESULT, Ownership.FULL);
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
    public void writeMimeTypeAsync(java.lang.String mimeType, org.gtk.gio.OutputStream stream, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.gdk_content_provider_write_mime_type_async.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(mimeType, null),
                    stream.handle(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
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
    public boolean writeMimeTypeFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_content_provider_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface ContentChanged {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceContentProvider) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ContentChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted whenever the content provided by this provider has changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ContentProvider.ContentChanged> onContentChanged(ContentProvider.ContentChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("content-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link ContentProvider.Builder} object constructs a {@link ContentProvider} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ContentProvider.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ContentProvider} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ContentProvider}.
         * @return A new instance of {@code ContentProvider} with the properties 
         *         that were set in the Builder object.
         */
        public ContentProvider build() {
            return (ContentProvider) org.gtk.gobject.GObject.newWithProperties(
                ContentProvider.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The possible formats that the provider can provide its data in.
         * @param formats The value for the {@code formats} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFormats(org.gtk.gdk.ContentFormats formats) {
            names.add("formats");
            values.add(org.gtk.gobject.Value.create(formats));
            return this;
        }
        
        /**
         * The subset of formats that clipboard managers should store this provider's data in.
         * @param storableFormats The value for the {@code storable-formats} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStorableFormats(org.gtk.gdk.ContentFormats storableFormats) {
            names.add("storable-formats");
            values.add(org.gtk.gobject.Value.create(storableFormats));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_content_provider_new_for_bytes = Interop.downcallHandle(
            "gdk_content_provider_new_for_bytes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_provider_new_for_value = Interop.downcallHandle(
            "gdk_content_provider_new_for_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_provider_new_typed = Interop.downcallHandle(
            "gdk_content_provider_new_typed",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            true
        );
        
        private static final MethodHandle gdk_content_provider_new_union = Interop.downcallHandle(
            "gdk_content_provider_new_union",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gdk_content_provider_content_changed = Interop.downcallHandle(
            "gdk_content_provider_content_changed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_provider_get_value = Interop.downcallHandle(
            "gdk_content_provider_get_value",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_provider_ref_formats = Interop.downcallHandle(
            "gdk_content_provider_ref_formats",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_provider_ref_storable_formats = Interop.downcallHandle(
            "gdk_content_provider_ref_storable_formats",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_provider_write_mime_type_async = Interop.downcallHandle(
            "gdk_content_provider_write_mime_type_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_provider_write_mime_type_finish = Interop.downcallHandle(
            "gdk_content_provider_write_mime_type_finish",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_provider_get_type = Interop.downcallHandle(
            "gdk_content_provider_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
