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
public class ContentDeserializer extends org.gtk.gobject.GObject implements org.gtk.gio.AsyncResult {
    
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
    protected ContentDeserializer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ContentDeserializer> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ContentDeserializer(input, ownership);
    
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
        return (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Cancellable.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the {@code GType} to create an instance of.
     * @return the {@code GType} for the current operation
     */
    public org.gtk.glib.Type getGtype() {
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
    public org.gtk.gio.InputStream getInputStream() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_deserializer_get_input_stream.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.InputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.InputStream.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the mime type to deserialize from.
     * @return the mime type for the current operation
     */
    public java.lang.String getMimeType() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_deserializer_get_mime_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
    public org.gtk.gobject.Value getValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_deserializer_get_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gobject.Value.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Indicate that the deserialization has ended with an error.
     * <p>
     * This function consumes {@code error}.
     * @param error a {@code GError}
     */
    public void returnError(org.gtk.glib.Error error) {
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
     * @param notify destroy notify for {@code data}
     */
    public void setTaskData(org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gdk_content_deserializer_set_task_data.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_content_deserializer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ContentDeserializer.Builder} object constructs a {@link ContentDeserializer} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ContentDeserializer.Builder#build()}. 
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
         * Finish building the {@link ContentDeserializer} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ContentDeserializer}.
         * @return A new instance of {@code ContentDeserializer} with the properties 
         *         that were set in the Builder object.
         */
        public ContentDeserializer build() {
            return (ContentDeserializer) org.gtk.gobject.GObject.newWithProperties(
                ContentDeserializer.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
