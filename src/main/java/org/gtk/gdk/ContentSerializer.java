package org.gtk.gdk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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

    public ContentSerializer(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ContentSerializer */
    public static ContentSerializer castFrom(org.gtk.gobject.Object gobject) {
        return new ContentSerializer(gobject.getReference());
    }
    
    /**
     * Gets the cancellable for the current operation.
     * <p>
     * This is the {@code GCancellable} that was passed to {@link content_serialize_async#null}.
     */
    public org.gtk.gio.Cancellable getCancellable() {
        var RESULT = gtk_h.gdk_content_serializer_get_cancellable(handle());
        return new org.gtk.gio.Cancellable(References.get(RESULT, false));
    }
    
    /**
     * Gets the {@code GType} to of the object to serialize.
     */
    public org.gtk.gobject.Type getGtype() {
        var RESULT = gtk_h.gdk_content_serializer_get_gtype(handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Gets the mime type to serialize to.
     */
    public java.lang.String getMimeType() {
        var RESULT = gtk_h.gdk_content_serializer_get_mime_type(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the output stream for the current operation.
     * <p>
     * This is the stream that was passed to {@link content_serialize_async#null}.
     */
    public org.gtk.gio.OutputStream getOutputStream() {
        var RESULT = gtk_h.gdk_content_serializer_get_output_stream(handle());
        return new org.gtk.gio.OutputStream(References.get(RESULT, false));
    }
    
    /**
     * Gets the I/O priority for the current operation.
     * <p>
     * This is the priority that was passed to {@link content_serialize_async#null}.
     */
    public int getPriority() {
        var RESULT = gtk_h.gdk_content_serializer_get_priority(handle());
        return RESULT;
    }
    
    /**
     * Gets the data that was associated with the current operation.
     * <p>
     * See {@link ContentSerializer#setTaskData}.
     */
    public java.lang.foreign.MemoryAddress getTaskData() {
        var RESULT = gtk_h.gdk_content_serializer_get_task_data(handle());
        return RESULT;
    }
    
    /**
     * Gets the user data that was passed when the serializer was registered.
     */
    public java.lang.foreign.MemoryAddress getUserData() {
        var RESULT = gtk_h.gdk_content_serializer_get_user_data(handle());
        return RESULT;
    }
    
    /**
     * Gets the {@code GValue} to read the object to serialize from.
     */
    public org.gtk.gobject.Value getValue() {
        var RESULT = gtk_h.gdk_content_serializer_get_value(handle());
        return new org.gtk.gobject.Value(References.get(RESULT, false));
    }
    
    /**
     * Indicate that the serialization has ended with an error.
     * <p>
     * This function consumes {@code error}.
     */
    public void returnError(org.gtk.glib.Error error) {
        gtk_h.gdk_content_serializer_return_error(handle(), error.getReference().unowned().handle());
    }
    
    /**
     * Indicate that the serialization has been successfully completed.
     */
    public void returnSuccess() {
        gtk_h.gdk_content_serializer_return_success(handle());
    }
    
    /**
     * Associate data with the current serialization operation.
     */
    public void setTaskData(java.lang.foreign.MemoryAddress data, org.gtk.glib.DestroyNotify notify) {
        gtk_h.gdk_content_serializer_set_task_data(handle(), data, 
                    Interop.cbDestroyNotifySymbol());
    }
    
}
