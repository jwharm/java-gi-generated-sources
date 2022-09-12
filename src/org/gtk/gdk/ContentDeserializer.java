package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GdkContentDeserializer` is used to deserialize content received via
 * inter-application data transfers.
 * 
 * The `GdkContentDeserializer` transforms serialized content that is
 * identified by a mime type into an object identified by a GType.
 * 
 * GTK provides serializers and deserializers for common data types
 * such as text, colors, images or file lists. To register your own
 * deserialization functions, use [func@content_register_deserializer].
 * 
 * Also see [class@Gdk.ContentSerializer].
 */
public class ContentDeserializer extends org.gtk.gobject.Object implements org.gtk.gio.AsyncResult {

    public ContentDeserializer(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ContentDeserializer */
    public static ContentDeserializer castFrom(org.gtk.gobject.Object gobject) {
        return new ContentDeserializer(gobject.getReference());
    }
    
    /**
     * Gets the cancellable for the current operation.
     * 
     * This is the `GCancellable` that was passed to [func@Gdk.content_deserialize_async].
     */
    public org.gtk.gio.Cancellable getCancellable() {
        var RESULT = gtk_h.gdk_content_deserializer_get_cancellable(handle());
        return new org.gtk.gio.Cancellable(References.get(RESULT, false));
    }
    
    /**
     * Gets the `GType` to create an instance of.
     */
    public org.gtk.gobject.Type getGtype() {
        var RESULT = gtk_h.gdk_content_deserializer_get_gtype(handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Gets the input stream for the current operation.
     * 
     * This is the stream that was passed to [func@Gdk.content_deserialize_async].
     */
    public org.gtk.gio.InputStream getInputStream() {
        var RESULT = gtk_h.gdk_content_deserializer_get_input_stream(handle());
        return new org.gtk.gio.InputStream(References.get(RESULT, false));
    }
    
    /**
     * Gets the mime type to deserialize from.
     */
    public java.lang.String getMimeType() {
        var RESULT = gtk_h.gdk_content_deserializer_get_mime_type(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the I/O priority for the current operation.
     * 
     * This is the priority that was passed to [func@Gdk.content_deserialize_async].
     */
    public int getPriority() {
        var RESULT = gtk_h.gdk_content_deserializer_get_priority(handle());
        return RESULT;
    }
    
    /**
     * Gets the data that was associated with the current operation.
     * 
     * See [method@Gdk.ContentDeserializer.set_task_data].
     */
    public jdk.incubator.foreign.MemoryAddress getTaskData() {
        var RESULT = gtk_h.gdk_content_deserializer_get_task_data(handle());
        return RESULT;
    }
    
    /**
     * Gets the user data that was passed when the deserializer was registered.
     */
    public jdk.incubator.foreign.MemoryAddress getUserData() {
        var RESULT = gtk_h.gdk_content_deserializer_get_user_data(handle());
        return RESULT;
    }
    
    /**
     * Gets the `GValue` to store the deserialized object in.
     */
    public org.gtk.gobject.Value getValue() {
        var RESULT = gtk_h.gdk_content_deserializer_get_value(handle());
        return new org.gtk.gobject.Value(References.get(RESULT, false));
    }
    
    /**
     * Indicate that the deserialization has ended with an error.
     * 
     * This function consumes @error.
     */
    public void returnError(org.gtk.glib.Error error) {
        gtk_h.gdk_content_deserializer_return_error(handle(), error.handle());
    }
    
    /**
     * Indicate that the deserialization has been successfully completed.
     */
    public void returnSuccess() {
        gtk_h.gdk_content_deserializer_return_success(handle());
    }
    
    /**
     * Associate data with the current deserialization operation.
     */
    public void setTaskData(jdk.incubator.foreign.MemoryAddress data, org.gtk.glib.DestroyNotify notify) {
        gtk_h.gdk_content_deserializer_set_task_data(handle(), data, 
                    Interop.cbDestroyNotifySymbol());
    }
    
}
