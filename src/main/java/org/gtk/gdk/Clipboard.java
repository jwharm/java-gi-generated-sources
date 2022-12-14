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
public class Clipboard extends org.gtk.gobject.GObject {
    
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
     */
    protected Clipboard(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Clipboard> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Clipboard(input);
    
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
        return (org.gtk.gdk.ContentProvider) Interop.register(RESULT, org.gtk.gdk.ContentProvider.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the {@code GdkDisplay} that the clipboard was created for.
     * @return a {@code GdkDisplay}
     */
    public org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_clipboard_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Display) Interop.register(RESULT, org.gtk.gdk.Display.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the formats that the clipboard can provide its current contents in.
     * @return The formats of the clipboard
     */
    public org.gtk.gdk.ContentFormats getFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_clipboard_get_formats.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.ContentFormats.fromAddress.marshal(RESULT, null);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gdk_clipboard_read_async.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(mimeTypes, false, SCOPE),
                        ioPriority,
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                        (Addressable) MemoryAddress.NULL);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public @Nullable org.gtk.gio.InputStream readFinish(org.gtk.gio.AsyncResult result, @Nullable Out<java.lang.String> outMimeType) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment outMimeTypePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gdk_clipboard_read_finish.invokeExact(
                        handle(),
                        result.handle(),
                        (Addressable) (outMimeType == null ? MemoryAddress.NULL : (Addressable) outMimeTypePOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (outMimeType != null) outMimeType.set(Marshal.addressToString.marshal(outMimeTypePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            var OBJECT = (org.gtk.gio.InputStream) Interop.register(RESULT, org.gtk.gio.InputStream.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
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
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
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
    public @Nullable java.lang.String readTextFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
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
            return Marshal.addressToString.marshal(RESULT, null);
        }
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
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
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
    public @Nullable org.gtk.gdk.Texture readTextureFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
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
            var OBJECT = (org.gtk.gdk.Texture) Interop.register(RESULT, org.gtk.gdk.Texture.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
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
    public void readValueAsync(org.gtk.glib.Type type, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.gdk_clipboard_read_value_async.invokeExact(
                    handle(),
                    type.getValue().longValue(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
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
    public org.gtk.gobject.Value readValueFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
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
            return org.gtk.gobject.Value.fromAddress.marshal(RESULT, null);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Puts the given {@code text} into the clipboard.
     * @param text Text to put into the clipboard
     */
    public void setText(java.lang.String text) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gdk_clipboard_set_text.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(text, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Puts the given {@code texture} into the clipboard.
     * @param texture a {@code GdkTexture} to put into the clipboard
     */
    public void setTexture(org.gtk.gdk.Texture texture) {
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
    public void setValist(org.gtk.glib.Type type, VaList args) {
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
    public void set(org.gtk.gobject.Value value) {
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
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
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
    public boolean storeFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
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
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_clipboard_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Changed} callback.
     */
    @FunctionalInterface
    public interface Changed {
    
        /**
         * Emitted when the clipboard changes ownership.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceClipboard) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Changed.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the clipboard changes ownership.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Clipboard.Changed> onChanged(Clipboard.Changed handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Clipboard.Builder} object constructs a {@link Clipboard} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Clipboard.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Clipboard} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Clipboard}.
         * @return A new instance of {@code Clipboard} with the properties 
         *         that were set in the Builder object.
         */
        public Clipboard build() {
            return (Clipboard) org.gtk.gobject.GObject.newWithProperties(
                Clipboard.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The {@code GdkContentProvider} or {@code null} if the clipboard is empty or contents are
         * provided otherwise.
         * @param content The value for the {@code content} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setContent(org.gtk.gdk.ContentProvider content) {
            names.add("content");
            values.add(org.gtk.gobject.Value.create(content));
            return this;
        }
        
        /**
         * The {@code GdkDisplay} that the clipboard belongs to.
         * @param display The value for the {@code display} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDisplay(org.gtk.gdk.Display display) {
            names.add("display");
            values.add(org.gtk.gobject.Value.create(display));
            return this;
        }
        
        /**
         * The possible formats that the clipboard can provide its data in.
         * @param formats The value for the {@code formats} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFormats(org.gtk.gdk.ContentFormats formats) {
            names.add("formats");
            values.add(org.gtk.gobject.Value.create(formats));
            return this;
        }
        
        /**
         * {@code true} if the contents of the clipboard are owned by this process.
         * @param local The value for the {@code local} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLocal(boolean local) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gdk_clipboard_get_type != null;
    }
}
