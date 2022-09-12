package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GdkContentFormatsBuilder` is an auxiliary struct used to create
 * new `GdkContentFormats`, and should not be kept around.
 */
public class ContentFormatsBuilder extends io.github.jwharm.javagi.ResourceBase {

    public ContentFormatsBuilder(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gdk_content_formats_builder_new(), true);
        return RESULT;
    }
    
    /**
     * Create a new `GdkContentFormatsBuilder` object.
     * 
     * The resulting builder would create an empty `GdkContentFormats`.
     * Use addition functions to add types to it.
     */
    public ContentFormatsBuilder() {
        super(constructNew());
    }
    
    /**
     * Appends all formats from @formats to @builder, skipping those that
     * already exist.
     */
    public void addFormats(ContentFormats formats) {
        gtk_h.gdk_content_formats_builder_add_formats(handle(), formats.handle());
    }
    
    /**
     * Appends @type to @builder if it has not already been added.
     */
    public void addGtype(Type type) {
        gtk_h.gdk_content_formats_builder_add_gtype(handle(), type.getValue());
    }
    
    /**
     * Appends @mime_type to @builder if it has not already been added.
     */
    public void addMimeType(java.lang.String mimeType) {
        gtk_h.gdk_content_formats_builder_add_mime_type(handle(), Interop.allocateNativeString(mimeType).handle());
    }
    
    /**
     * Creates a new `GdkContentFormats` from the current state of the
     * given @builder, and frees the @builder instance.
     */
    public ContentFormats freeToFormats() {
        var RESULT = gtk_h.gdk_content_formats_builder_free_to_formats(handle());
        return new ContentFormats(References.get(RESULT, true));
    }
    
    /**
     * Acquires a reference on the given @builder.
     * 
     * This function is intended primarily for bindings.
     * `GdkContentFormatsBuilder` objects should not be kept around.
     */
    public ContentFormatsBuilder ref() {
        var RESULT = gtk_h.gdk_content_formats_builder_ref(handle());
        return new ContentFormatsBuilder(References.get(RESULT, false));
    }
    
    /**
     * Creates a new `GdkContentFormats` from the given @builder.
     * 
     * The given `GdkContentFormatsBuilder` is reset once this function returns;
     * you cannot call this function multiple times on the same @builder instance.
     * 
     * This function is intended primarily for bindings. C code should use
     * [method@Gdk.ContentFormatsBuilder.free_to_formats].
     */
    public ContentFormats toFormats() {
        var RESULT = gtk_h.gdk_content_formats_builder_to_formats(handle());
        return new ContentFormats(References.get(RESULT, true));
    }
    
    /**
     * Releases a reference on the given @builder.
     */
    public void unref() {
        gtk_h.gdk_content_formats_builder_unref(handle());
    }
    
}
