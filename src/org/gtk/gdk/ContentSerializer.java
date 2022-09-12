package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
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

    public ContentSerializer(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ContentSerializer */
    public static ContentSerializer castFrom(org.gtk.gobject.Object gobject) {
        return new ContentSerializer(gobject.getReference());
    }
    
    /**
     * Gets the cancellable for the current operation.
     * 
     * This is the `GCancellable` that was passed to [func@content_serialize_async].
     */
    public org.gtk.gio.Cancellable getCancellable() {
        var RESULT = gtk_h.gdk_content_serializer_get_cancellable(handle());
        return new org.gtk.gio.Cancellable(References.get(RESULT, false));
    }
    
    /**
     * Gets the `GType` to of the object to serialize.
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
     * 
     * This is the stream that was passed to [func@content_serialize_async].
     */
    public org.gtk.gio.OutputStream getOutputStream() {
        var RESULT = gtk_h.gdk_content_serializer_get_output_stream(handle());
        return new org.gtk.gio.OutputStream(References.get(RESULT, false));
    }
    
    /**
     * Gets the I/O priority for the current operation.
     * 
     * This is the priority that was passed to [func@content_serialize_async].
     */
    public int getPriority() {
        var RESULT = gtk_h.gdk_content_serializer_get_priority(handle());
        return RESULT;
    }
    
    /**
     * Gets the data that was associated with the current operation.
     * 
     * See [method@Gdk.ContentSerializer.set_task_data].
     */
    public jdk.incubator.foreign.MemoryAddress getTaskData() {
        var RESULT = gtk_h.gdk_content_serializer_get_task_data(handle());
        return RESULT;
    }
    
    /**
     * Gets the user data that was passed when the serializer was registered.
     */
    public jdk.incubator.foreign.MemoryAddress getUserData() {
        var RESULT = gtk_h.gdk_content_serializer_get_user_data(handle());
        return RESULT;
    }
    
    /**
     * Gets the `GValue` to read the object to serialize from.
     */
    public org.gtk.gobject.Value getValue() {
        var RESULT = gtk_h.gdk_content_serializer_get_value(handle());
        return new org.gtk.gobject.Value(References.get(RESULT, false));
    }
    
    /**
     * Indicate that the serialization has ended with an error.
     * 
     * This function consumes @error.
     */
    public void returnError(org.gtk.glib.Error error) {
        gtk_h.gdk_content_serializer_return_error(handle(), error.handle());
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
    public void setTaskData(jdk.incubator.foreign.MemoryAddress data, org.gtk.glib.DestroyNotify notify) {
        gtk_h.gdk_content_serializer_set_task_data(handle(), data, 
                    Interop.cbDestroyNotifySymbol());
    }
    
}
