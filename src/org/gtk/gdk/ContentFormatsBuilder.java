package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GdkContentFormatsBuilder` is an auxiliary struct used to create
 * new `GdkContentFormats`, and should not be kept around.
 */
public class ContentFormatsBuilder extends io.github.jwharm.javagi.interop.ResourceBase {

    public ContentFormatsBuilder(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Create a new `GdkContentFormatsBuilder` object.
     * 
     * The resulting builder would create an empty `GdkContentFormats`.
     * Use addition functions to add types to it.
     */
    public ContentFormatsBuilder() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_builder_new(), true));
    }
    
    /**
     * Appends all formats from @formats to @builder, skipping those that
     * already exist.
     */
    public void addFormats(ContentFormats formats) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_builder_add_formats(HANDLE(), formats.HANDLE());
    }
    
    /**
     * Appends @type to @builder if it has not already been added.
     */
    public void addGtype(Type type) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_builder_add_gtype(HANDLE(), type.getValue());
    }
    
    /**
     * Appends @mime_type to @builder if it has not already been added.
     */
    public void addMimeType(java.lang.String mimeType) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_builder_add_mime_type(HANDLE(), Interop.allocateNativeString(mimeType).HANDLE());
    }
    
    /**
     * Creates a new `GdkContentFormats` from the current state of the
     * given @builder, and frees the @builder instance.
     */
    public ContentFormats freeToFormats() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_builder_free_to_formats(HANDLE());
        return new ContentFormats(References.get(RESULT, true));
    }
    
    /**
     * Acquires a reference on the given @builder.
     * 
     * This function is intended primarily for bindings.
     * `GdkContentFormatsBuilder` objects should not be kept around.
     */
    public ContentFormatsBuilder ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_builder_ref(HANDLE());
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_builder_to_formats(HANDLE());
        return new ContentFormats(References.get(RESULT, true));
    }
    
    /**
     * Releases a reference on the given @builder.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_builder_unref(HANDLE());
    }
    
}
