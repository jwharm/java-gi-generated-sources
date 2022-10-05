package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GdkContentDeserializer} is used to deserialize content received via
 * inter-application data transfers.
 * <p>
 * The {@code GdkContentDeserializer} transforms serialized content that is
 * identified by a mime type into an object identified by a GType.
 * <p>
 * GTK provides serializers and deserializers for common data types
 * such as text, colors, images or file lists. To register your own
 * deserialization functions, use {@link content_register_deserializer#null}.
 * <p>
 * Also see {@link ContentSerializer}.
 */
public class ContentDeserializer extends org.gtk.gobject.Object implements org.gtk.gio.AsyncResult {

    public ContentDeserializer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ContentDeserializer */
    public static ContentDeserializer castFrom(org.gtk.gobject.Object gobject) {
        return new ContentDeserializer(gobject.refcounted());
    }
    
    static final MethodHandle gdk_content_deserializer_get_cancellable = Interop.downcallHandle(
        "gdk_content_deserializer_get_cancellable",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the cancellable for the current operation.
     * <p>
     * This is the {@code GCancellable} that was passed to {@link Gdk#contentDeserializeAsync}.
     */
    public org.gtk.gio.Cancellable getCancellable() {
        try {
            var RESULT = (MemoryAddress) gdk_content_deserializer_get_cancellable.invokeExact(handle());
            return new org.gtk.gio.Cancellable(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_deserializer_get_gtype = Interop.downcallHandle(
        "gdk_content_deserializer_get_gtype",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GType} to create an instance of.
     */
    public org.gtk.gobject.Type getGtype() {
        try {
            var RESULT = (long) gdk_content_deserializer_get_gtype.invokeExact(handle());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_deserializer_get_input_stream = Interop.downcallHandle(
        "gdk_content_deserializer_get_input_stream",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the input stream for the current operation.
     * <p>
     * This is the stream that was passed to {@link Gdk#contentDeserializeAsync}.
     */
    public org.gtk.gio.InputStream getInputStream() {
        try {
            var RESULT = (MemoryAddress) gdk_content_deserializer_get_input_stream.invokeExact(handle());
            return new org.gtk.gio.InputStream(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_deserializer_get_mime_type = Interop.downcallHandle(
        "gdk_content_deserializer_get_mime_type",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the mime type to deserialize from.
     */
    public java.lang.String getMimeType() {
        try {
            var RESULT = (MemoryAddress) gdk_content_deserializer_get_mime_type.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_deserializer_get_priority = Interop.downcallHandle(
        "gdk_content_deserializer_get_priority",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the I/O priority for the current operation.
     * <p>
     * This is the priority that was passed to {@link Gdk#contentDeserializeAsync}.
     */
    public int getPriority() {
        try {
            var RESULT = (int) gdk_content_deserializer_get_priority.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_deserializer_get_task_data = Interop.downcallHandle(
        "gdk_content_deserializer_get_task_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the data that was associated with the current operation.
     * <p>
     * See {@link ContentDeserializer#setTaskData}.
     */
    public java.lang.foreign.MemoryAddress getTaskData() {
        try {
            var RESULT = (MemoryAddress) gdk_content_deserializer_get_task_data.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_deserializer_get_user_data = Interop.downcallHandle(
        "gdk_content_deserializer_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the user data that was passed when the deserializer was registered.
     */
    public java.lang.foreign.MemoryAddress getUserData() {
        try {
            var RESULT = (MemoryAddress) gdk_content_deserializer_get_user_data.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_deserializer_get_value = Interop.downcallHandle(
        "gdk_content_deserializer_get_value",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GValue} to store the deserialized object in.
     */
    public org.gtk.gobject.Value getValue() {
        try {
            var RESULT = (MemoryAddress) gdk_content_deserializer_get_value.invokeExact(handle());
            return new org.gtk.gobject.Value(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_deserializer_return_error = Interop.downcallHandle(
        "gdk_content_deserializer_return_error",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Indicate that the deserialization has ended with an error.
     * <p>
     * This function consumes {@code error}.
     */
    public void returnError(org.gtk.glib.Error error) {
        try {
            gdk_content_deserializer_return_error.invokeExact(handle(), error.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_deserializer_return_success = Interop.downcallHandle(
        "gdk_content_deserializer_return_success",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Indicate that the deserialization has been successfully completed.
     */
    public void returnSuccess() {
        try {
            gdk_content_deserializer_return_success.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_deserializer_set_task_data = Interop.downcallHandle(
        "gdk_content_deserializer_set_task_data",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Associate data with the current deserialization operation.
     */
    public void setTaskData(java.lang.foreign.MemoryAddress data, org.gtk.glib.DestroyNotify notify) {
        try {
            gdk_content_deserializer_set_task_data.invokeExact(handle(), data, 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}