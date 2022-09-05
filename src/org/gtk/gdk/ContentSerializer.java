package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GdkContentSerializer` is used to serialize content for
 * inter-application data transfers.
 * 
 * The `GdkContentSerializer` transforms an object that is identified
 * by a GType into a serialized form (i.e. a byte stream) that is
 * identified by a mime type.
 * 
 * GTK provides serializers and deserializers for common data types
 * such as text, colors, images or file lists. To register your own
 * serialization functions, use [func@Gdk.content_register_serializer].
 * 
 * Also see [class@Gdk.ContentDeserializer].
 */
public class ContentSerializer extends org.gtk.gobject.Object implements org.gtk.gio.AsyncResult {

    public ContentSerializer(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ContentSerializer */
    public static ContentSerializer castFrom(org.gtk.gobject.Object gobject) {
        return new ContentSerializer(gobject.getProxy());
    }
    
    /**
     * Gets the cancellable for the current operation.
     * 
     * This is the `GCancellable` that was passed to [func@content_serialize_async].
     */
    public org.gtk.gio.Cancellable getCancellable() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_serializer_get_cancellable(HANDLE());
        return new org.gtk.gio.Cancellable(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the `GType` to of the object to serialize.
     */
    public org.gtk.gobject.Type getGtype() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_serializer_get_gtype(HANDLE());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Gets the mime type to serialize to.
     */
    public java.lang.String getMimeType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_serializer_get_mime_type(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the output stream for the current operation.
     * 
     * This is the stream that was passed to [func@content_serialize_async].
     */
    public org.gtk.gio.OutputStream getOutputStream() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_serializer_get_output_stream(HANDLE());
        return new org.gtk.gio.OutputStream(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the I/O priority for the current operation.
     * 
     * This is the priority that was passed to [func@content_serialize_async].
     */
    public int getPriority() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_serializer_get_priority(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the data that was associated with the current operation.
     * 
     * See [method@Gdk.ContentSerializer.set_task_data].
     */
    public jdk.incubator.foreign.MemoryAddress getTaskData() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_serializer_get_task_data(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the user data that was passed when the serializer was registered.
     */
    public jdk.incubator.foreign.MemoryAddress getUserData() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_serializer_get_user_data(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the `GValue` to read the object to serialize from.
     */
    public org.gtk.gobject.Value getValue() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_serializer_get_value(HANDLE());
        return new org.gtk.gobject.Value(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Indicate that the serialization has ended with an error.
     * 
     * This function consumes @error.
     */
    public void returnError(org.gtk.glib.Error error) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_serializer_return_error(HANDLE(), error.HANDLE());
    }
    
    /**
     * Indicate that the serialization has been successfully completed.
     */
    public void returnSuccess() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_serializer_return_success(HANDLE());
    }
    
}