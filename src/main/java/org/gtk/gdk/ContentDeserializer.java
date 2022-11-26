package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GdkContentDeserializer} is used to deserialize content received via
 * inter-application data transfers.
 * <p>
 * The {@code GdkContentDeserializer} transforms serialized content that is
 * identified by a mime type into an object identified by a GType.
 * <p>
 * GTK provides serializers and deserializers for common data types
 * such as text, colors, images or file lists. To register your own
 * deserialization functions, use {@link Gdk#contentRegisterDeserializer}.
 * <p>
 * Also see {@link ContentSerializer}.
 */
public class ContentDeserializer extends org.gtk.gobject.Object implements org.gtk.gio.AsyncResult {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkContentDeserializer";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ContentDeserializer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ContentDeserializer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ContentDeserializer if its GType is a (or inherits from) "GdkContentDeserializer".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ContentDeserializer} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkContentDeserializer", a ClassCastException will be thrown.
     */
    public static ContentDeserializer castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ContentDeserializer.getType())) {
            return new ContentDeserializer(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkContentDeserializer");
        }
    }
    
    /**
     * Gets the cancellable for the current operation.
     * <p>
     * This is the {@code GCancellable} that was passed to {@link Gdk#contentDeserializeAsync}.
     * @return the cancellable for the current operation
     */
    public @Nullable org.gtk.gio.Cancellable getCancellable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_deserializer_get_cancellable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Cancellable(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the {@code GType} to create an instance of.
     * @return the {@code GType} for the current operation
     */
    public @NotNull org.gtk.glib.Type getGtype() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_content_deserializer_get_gtype.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the input stream for the current operation.
     * <p>
     * This is the stream that was passed to {@link Gdk#contentDeserializeAsync}.
     * @return the input stream for the current operation
     */
    public @NotNull org.gtk.gio.InputStream getInputStream() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_deserializer_get_input_stream.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.InputStream(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the mime type to deserialize from.
     * @return the mime type for the current operation
     */
    public @NotNull java.lang.String getMimeType() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_deserializer_get_mime_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the I/O priority for the current operation.
     * <p>
     * This is the priority that was passed to {@link Gdk#contentDeserializeAsync}.
     * @return the I/O priority for the current operation
     */
    public int getPriority() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_content_deserializer_get_priority.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the data that was associated with the current operation.
     * <p>
     * See {@link ContentDeserializer#setTaskData}.
     * @return the task data for {@code deserializer}
     */
    public @Nullable java.lang.foreign.MemoryAddress getTaskData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_deserializer_get_task_data.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the user data that was passed when the deserializer was registered.
     * @return the user data for this deserializer
     */
    public @Nullable java.lang.foreign.MemoryAddress getUserData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_deserializer_get_user_data.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the {@code GValue} to store the deserialized object in.
     * @return the {@code GValue} for the current operation
     */
    public @NotNull org.gtk.gobject.Value getValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_deserializer_get_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Value(RESULT, Ownership.NONE);
    }
    
    /**
     * Indicate that the deserialization has ended with an error.
     * <p>
     * This function consumes {@code error}.
     * @param error a {@code GError}
     */
    public void returnError(@NotNull org.gtk.glib.Error error) {
        java.util.Objects.requireNonNull(error, "Parameter 'error' must not be null");
        try {
            DowncallHandles.gdk_content_deserializer_return_error.invokeExact(
                    handle(),
                    error.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        error.yieldOwnership();
    }
    
    /**
     * Indicate that the deserialization has been successfully completed.
     */
    public void returnSuccess() {
        try {
            DowncallHandles.gdk_content_deserializer_return_success.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Associate data with the current deserialization operation.
     * @param data data to associate with this operation
     * @param notify destroy notify for {@code data}
     */
    public void setTaskData(@Nullable java.lang.foreign.MemoryAddress data, @NotNull org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gdk_content_deserializer_set_task_data.invokeExact(
                    handle(),
                    (Addressable) data,
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_content_deserializer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link ContentDeserializer.Build} object constructs a {@link ContentDeserializer} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ContentDeserializer} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ContentDeserializer} using {@link ContentDeserializer#castFrom}.
         * @return A new instance of {@code ContentDeserializer} with the properties 
         *         that were set in the Build object.
         */
        public ContentDeserializer construct() {
            return ContentDeserializer.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ContentDeserializer.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_content_deserializer_get_cancellable = Interop.downcallHandle(
            "gdk_content_deserializer_get_cancellable",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_deserializer_get_gtype = Interop.downcallHandle(
            "gdk_content_deserializer_get_gtype",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_deserializer_get_input_stream = Interop.downcallHandle(
            "gdk_content_deserializer_get_input_stream",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_deserializer_get_mime_type = Interop.downcallHandle(
            "gdk_content_deserializer_get_mime_type",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_deserializer_get_priority = Interop.downcallHandle(
            "gdk_content_deserializer_get_priority",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_deserializer_get_task_data = Interop.downcallHandle(
            "gdk_content_deserializer_get_task_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_deserializer_get_user_data = Interop.downcallHandle(
            "gdk_content_deserializer_get_user_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_deserializer_get_value = Interop.downcallHandle(
            "gdk_content_deserializer_get_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_deserializer_return_error = Interop.downcallHandle(
            "gdk_content_deserializer_return_error",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_deserializer_return_success = Interop.downcallHandle(
            "gdk_content_deserializer_return_success",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_deserializer_set_task_data = Interop.downcallHandle(
            "gdk_content_deserializer_set_task_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_deserializer_get_type = Interop.downcallHandle(
            "gdk_content_deserializer_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
