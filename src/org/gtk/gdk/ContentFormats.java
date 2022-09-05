package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GdkContentFormats` structure is used to advertise and negotiate the
 * format of content.
 * 
 * You will encounter `GdkContentFormats` when interacting with objects
 * controlling operations that pass data between different widgets, window
 * or application, like [class@Gdk.Drag], [class@Gdk.Drop],
 * [class@Gdk.Clipboard] or [class@Gdk.ContentProvider].
 * 
 * GDK supports content in 2 forms: `GType` and mime type.
 * Using `GTypes` is meant only for in-process content transfers. Mime types
 * are meant to be used for data passing both in-process and out-of-process.
 * The details of how data is passed is described in the documentation of
 * the actual implementations. To transform between the two forms,
 * [class@Gdk.ContentSerializer] and [class@Gdk.ContentDeserializer] are used.
 * 
 * A `GdkContentFormats` describes a set of possible formats content can be
 * exchanged in. It is assumed that this set is ordered. `GTypes` are more
 * important than mime types. Order between different `GTypes` or mime types
 * is the order they were added in, most important first. Functions that
 * care about order, such as [method@Gdk.ContentFormats.union], will describe
 * in their documentation how they interpret that order, though in general the
 * order of the first argument is considered the primary order of the result,
 * followed by the order of further arguments.
 * 
 * For debugging purposes, the function [method@Gdk.ContentFormats.to_string]
 * exists. It will print a comma-separated list of formats from most important
 * to least important.
 * 
 * `GdkContentFormats` is an immutable struct. After creation, you cannot change
 * the types it represents. Instead, new `GdkContentFormats` have to be created.
 * The [struct@Gdk.ContentFormatsBuilder] structure is meant to help in this
 * endeavor.
 */
public class ContentFormats extends io.github.jwharm.javagi.interop.ResourceBase {

    public ContentFormats(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Creates a new `GdkContentFormats` from an array of mime types.
     * 
     * The mime types must be valid and different from each other or the
     * behavior of the return value is undefined. If you cannot guarantee
     * this, use [struct@Gdk.ContentFormatsBuilder] instead.
     */
    public ContentFormats(java.lang.String[] mimeTypes, int nMimeTypes) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_new(Interop.allocateNativeArray(mimeTypes), nMimeTypes), true));
    }
    
    /**
     * Creates a new `GdkContentFormats` for a given `GType`.
     */
    public ContentFormats(Type type) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_new_for_gtype(type.getValue()), true));
    }
    
    /**
     * Checks if a given `GType` is part of the given @formats.
     */
    public boolean containGtype(Type type) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_contain_gtype(HANDLE(), type.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a given mime type is part of the given @formats.
     */
    public boolean containMimeType(java.lang.String mimeType) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_contain_mime_type(HANDLE(), Interop.getAllocator().allocateUtf8String(mimeType));
        return (RESULT != 0);
    }
    
    /**
     * Checks if @first and @second have any matching formats.
     */
    public boolean match(ContentFormats second) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_match(HANDLE(), second.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Finds the first `GType` from @first that is also contained
     * in @second.
     * 
     * If no matching `GType` is found, %G_TYPE_INVALID is returned.
     */
    public org.gtk.gobject.Type matchGtype(ContentFormats second) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_match_gtype(HANDLE(), second.HANDLE());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Finds the first mime type from @first that is also contained
     * in @second.
     * 
     * If no matching mime type is found, %NULL is returned.
     */
    public java.lang.String matchMimeType(ContentFormats second) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_match_mime_type(HANDLE(), second.HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Prints the given @formats into a string for human consumption.
     * 
     * The result of this function can later be parsed with
     * [func@Gdk.ContentFormats.parse].
     */
    public void print(org.gtk.glib.String string) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_print(HANDLE(), string.HANDLE());
    }
    
    /**
     * Increases the reference count of a `GdkContentFormats` by one.
     */
    public ContentFormats ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_ref(HANDLE());
        return new ContentFormats(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Prints the given @formats into a human-readable string.
     * 
     * The resulting string can be parsed with [func@Gdk.ContentFormats.parse].
     * 
     * This is a small wrapper around [method@Gdk.ContentFormats.print]
     * to help when debugging.
     */
    public java.lang.String toString() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_to_string(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Append all missing types from @second to @first, in the order
     * they had in @second.
     */
    public ContentFormats union(ContentFormats second) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_union(HANDLE(), second.HANDLE());
        return new ContentFormats(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Add GTypes for mime types in @formats for which deserializers are
     * registered.
     */
    public ContentFormats unionDeserializeGtypes() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_union_deserialize_gtypes(HANDLE());
        return new ContentFormats(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Add mime types for GTypes in @formats for which deserializers are
     * registered.
     */
    public ContentFormats unionDeserializeMimeTypes() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_union_deserialize_mime_types(HANDLE());
        return new ContentFormats(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Add GTypes for the mime types in @formats for which serializers are
     * registered.
     */
    public ContentFormats unionSerializeGtypes() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_union_serialize_gtypes(HANDLE());
        return new ContentFormats(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Add mime types for GTypes in @formats for which serializers are
     * registered.
     */
    public ContentFormats unionSerializeMimeTypes() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_union_serialize_mime_types(HANDLE());
        return new ContentFormats(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Decreases the reference count of a `GdkContentFormats` by one.
     * 
     * If the resulting reference count is zero, frees the formats.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_content_formats_unref(HANDLE());
    }
    
}
