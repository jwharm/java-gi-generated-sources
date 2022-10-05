package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GdkContentSerializer} is used to serialize content for
 * inter-application data transfers.
 * <p>
 * The {@code GdkContentSerializer} transforms an object that is identified
 * by a GType into a serialized form (i.e. a byte stream) that is
 * identified by a mime type.
 * <p>
 * GTK provides serializers and deserializers for common data types
 * such as text, colors, images or file lists. To register your own
 * serialization functions, use {@link Gdk#contentRegisterSerializer}.
 * <p>
 * Also see {@link ContentDeserializer}.
 */
public class ContentSerializer extends org.gtk.gobject.Object implements org.gtk.gio.AsyncResult {

    public ContentSerializer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ContentSerializer */
    public static ContentSerializer castFrom(org.gtk.gobject.Object gobject) {
        return new ContentSerializer(gobject.refcounted());
    }
    
    static final MethodHandle gdk_content_serializer_get_cancellable = Interop.downcallHandle(
        "gdk_content_serializer_get_cancellable",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the cancellable for the current operation.
     * <p>
     * This is the {@code GCancellable} that was passed to {@link content_serialize_async#null}.
     */
    public org.gtk.gio.Cancellable getCancellable() {
        try {
            var RESULT = (MemoryAddress) gdk_content_serializer_get_cancellable.invokeExact(handle());
            return new org.gtk.gio.Cancellable(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_serializer_get_gtype = Interop.downcallHandle(
        "gdk_content_serializer_get_gtype",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GType} to of the object to serialize.
     */
    public org.gtk.gobject.Type getGtype() {
        try {
            var RESULT = (long) gdk_content_serializer_get_gtype.invokeExact(handle());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_serializer_get_mime_type = Interop.downcallHandle(
        "gdk_content_serializer_get_mime_type",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the mime type to serialize to.
     */
    public java.lang.String getMimeType() {
        try {
            var RESULT = (MemoryAddress) gdk_content_serializer_get_mime_type.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_serializer_get_output_stream = Interop.downcallHandle(
        "gdk_content_serializer_get_output_stream",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the output stream for the current operation.
     * <p>
     * This is the stream that was passed to {@link content_serialize_async#null}.
     */
    public org.gtk.gio.OutputStream getOutputStream() {
        try {
            var RESULT = (MemoryAddress) gdk_content_serializer_get_output_stream.invokeExact(handle());
            return new org.gtk.gio.OutputStream(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_serializer_get_priority = Interop.downcallHandle(
        "gdk_content_serializer_get_priority",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the I/O priority for the current operation.
     * <p>
     * This is the priority that was passed to {@link content_serialize_async#null}.
     */
    public int getPriority() {
        try {
            var RESULT = (int) gdk_content_serializer_get_priority.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_serializer_get_task_data = Interop.downcallHandle(
        "gdk_content_serializer_get_task_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the data that was associated with the current operation.
     * <p>
     * See {@link ContentSerializer#setTaskData}.
     */
    public java.lang.foreign.MemoryAddress getTaskData() {
        try {
            var RESULT = (MemoryAddress) gdk_content_serializer_get_task_data.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_serializer_get_user_data = Interop.downcallHandle(
        "gdk_content_serializer_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the user data that was passed when the serializer was registered.
     */
    public java.lang.foreign.MemoryAddress getUserData() {
        try {
            var RESULT = (MemoryAddress) gdk_content_serializer_get_user_data.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_serializer_get_value = Interop.downcallHandle(
        "gdk_content_serializer_get_value",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GValue} to read the object to serialize from.
     */
    public org.gtk.gobject.Value getValue() {
        try {
            var RESULT = (MemoryAddress) gdk_content_serializer_get_value.invokeExact(handle());
            return new org.gtk.gobject.Value(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_serializer_return_error = Interop.downcallHandle(
        "gdk_content_serializer_return_error",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Indicate that the serialization has ended with an error.
     * <p>
     * This function consumes {@code error}.
     */
    public void returnError(org.gtk.glib.Error error) {
        try {
            gdk_content_serializer_return_error.invokeExact(handle(), error.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_serializer_return_success = Interop.downcallHandle(
        "gdk_content_serializer_return_success",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Indicate that the serialization has been successfully completed.
     */
    public void returnSuccess() {
        try {
            gdk_content_serializer_return_success.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_serializer_set_task_data = Interop.downcallHandle(
        "gdk_content_serializer_set_task_data",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Associate data with the current serialization operation.
     */
    public void setTaskData(java.lang.foreign.MemoryAddress data, org.gtk.glib.DestroyNotify notify) {
        try {
            gdk_content_serializer_set_task_data.invokeExact(handle(), data, 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
