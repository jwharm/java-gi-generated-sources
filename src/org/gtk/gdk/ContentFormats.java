package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>GdkContentFormats</code> structure is used to advertise and negotiate the
 * format of content.
 * <p>
 * You will encounter <code>GdkContentFormats</code> when interacting with objects
 * controlling operations that pass data between different widgets, window
 * or application, like {@link org.gtk.gdk.Drag}, {@link org.gtk.gdk.Drop},
 * {@link org.gtk.gdk.Clipboard} or {@link org.gtk.gdk.ContentProvider}.
 * <p>
 * GDK supports content in 2 forms: <code>GType</code> and mime type.
 * Using <code>GTypes</code> is meant only for in-process content transfers. Mime types
 * are meant to be used for data passing both in-process and out-of-process.
 * The details of how data is passed is described in the documentation of
 * the actual implementations. To transform between the two forms,
 * {@link org.gtk.gdk.ContentSerializer} and {@link org.gtk.gdk.ContentDeserializer} are used.
 * <p>
 * A <code>GdkContentFormats</code> describes a set of possible formats content can be
 * exchanged in. It is assumed that this set is ordered. <code>GTypes</code> are more
 * important than mime types. Order between different <code>GTypes</code> or mime types
 * is the order they were added in, most important first. Functions that
 * care about order, such as {@link org.gtk.gdk.ContentFormats<code>#union</code> , will describe
 * in their documentation how they interpret that order, though in general the
 * order of the first argument is considered the primary order of the result,
 * followed by the order of further arguments.
 * <p>
 * For debugging purposes, the function {@link org.gtk.gdk.ContentFormats<code>#toString</code> 
 * exists. It will print a comma-separated list of formats from most important
 * to least important.
 * <p><code>GdkContentFormats</code> is an immutable struct. After creation, you cannot change
 * the types it represents. Instead, new <code>GdkContentFormats</code> have to be created.
 * The {@link [struct@Gdk.ContentFormatsBuilder] (ref=struct)} structure is meant to help in this
 * endeavor.
 */
public class ContentFormats extends io.github.jwharm.javagi.ResourceBase {

    public ContentFormats(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(java.lang.String[] mimeTypes, int nMimeTypes) {
        Reference RESULT = References.get(gtk_h.gdk_content_formats_new(Interop.allocateNativeArray(mimeTypes).handle(), nMimeTypes), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GdkContentFormats</code> from an array of mime types.
     * 
     * The mime types must be valid and different from each other or the
     * behavior of the return value is undefined. If you cannot guarantee
     * this, use {@link [struct@Gdk.ContentFormatsBuilder] (ref=struct)} instead.
     */
    public ContentFormats(java.lang.String[] mimeTypes, int nMimeTypes) {
        super(constructNew(mimeTypes, nMimeTypes));
    }
    
    private static Reference constructNewForGtype(Type type) {
        Reference RESULT = References.get(gtk_h.gdk_content_formats_new_for_gtype(type.getValue()), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GdkContentFormats</code> for a given <code>GType</code>.
     */
    public static ContentFormats newForGtype(Type type) {
        return new ContentFormats(constructNewForGtype(type));
    }
    
    /**
     * Checks if a given <code>GType</code> is part of the given @formats.
     */
    public boolean containGtype(Type type) {
        var RESULT = gtk_h.gdk_content_formats_contain_gtype(handle(), type.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a given mime type is part of the given @formats.
     */
    public boolean containMimeType(java.lang.String mimeType) {
        var RESULT = gtk_h.gdk_content_formats_contain_mime_type(handle(), Interop.allocateNativeString(mimeType).handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if @first and @second have any matching formats.
     */
    public boolean match(ContentFormats second) {
        var RESULT = gtk_h.gdk_content_formats_match(handle(), second.handle());
        return (RESULT != 0);
    }
    
    /**
     * Finds the first <code>GType</code> from @first that is also contained
     * in @second.
     * <p>
     * If no matching <code>GType</code> is found, <code>G_TYPE_INVALID</code> is returned.
     */
    public org.gtk.gobject.Type matchGtype(ContentFormats second) {
        var RESULT = gtk_h.gdk_content_formats_match_gtype(handle(), second.handle());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Finds the first mime type from @first that is also contained
     * in @second.
     * 
     * If no matching mime type is found, <code>null</code> is returned.
     */
    public java.lang.String matchMimeType(ContentFormats second) {
        var RESULT = gtk_h.gdk_content_formats_match_mime_type(handle(), second.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Prints the given @formats into a string for human consumption.
     * 
     * The result of this function can later be parsed with
     * {@link Gdk<code>#ContentFormats</code> .
     */
    public void print(org.gtk.glib.String string) {
        gtk_h.gdk_content_formats_print(handle(), string.handle());
    }
    
    /**
     * Increases the reference count of a <code>GdkContentFormats</code> by one.
     */
    public ContentFormats ref() {
        var RESULT = gtk_h.gdk_content_formats_ref(handle());
        return new ContentFormats(References.get(RESULT, true));
    }
    
    /**
     * Prints the given @formats into a human-readable string.
     * 
     * The resulting string can be parsed with {@link Gdk<code>#ContentFormats</code> .
     * 
     * This is a small wrapper around {@link org.gtk.gdk.ContentFormats<code>#print</code> 
     * to help when debugging.
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.gdk_content_formats_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Append all missing types from @second to @first, in the order
     * they had in @second.
     */
    public ContentFormats union(ContentFormats second) {
        var RESULT = gtk_h.gdk_content_formats_union(handle(), second.handle());
        return new ContentFormats(References.get(RESULT, true));
    }
    
    /**
     * Add GTypes for mime types in @formats for which deserializers are
     * registered.
     */
    public ContentFormats unionDeserializeGtypes() {
        var RESULT = gtk_h.gdk_content_formats_union_deserialize_gtypes(handle());
        return new ContentFormats(References.get(RESULT, true));
    }
    
    /**
     * Add mime types for GTypes in @formats for which deserializers are
     * registered.
     */
    public ContentFormats unionDeserializeMimeTypes() {
        var RESULT = gtk_h.gdk_content_formats_union_deserialize_mime_types(handle());
        return new ContentFormats(References.get(RESULT, true));
    }
    
    /**
     * Add GTypes for the mime types in @formats for which serializers are
     * registered.
     */
    public ContentFormats unionSerializeGtypes() {
        var RESULT = gtk_h.gdk_content_formats_union_serialize_gtypes(handle());
        return new ContentFormats(References.get(RESULT, true));
    }
    
    /**
     * Add mime types for GTypes in @formats for which serializers are
     * registered.
     */
    public ContentFormats unionSerializeMimeTypes() {
        var RESULT = gtk_h.gdk_content_formats_union_serialize_mime_types(handle());
        return new ContentFormats(References.get(RESULT, true));
    }
    
    /**
     * Decreases the reference count of a <code>GdkContentFormats</code> by one.
     * 
     * If the resulting reference count is zero, frees the formats.
     */
    public void unref() {
        gtk_h.gdk_content_formats_unref(handle());
    }
    
    /**
     * Parses the given @string into <code>GdkContentFormats</code> and
     * returns the formats.
     * 
     * Strings printed via {@link org.gtk.gdk.ContentFormats<code>#toString</code> 
     * can be read in again successfully using this function.
     * 
     * If @string does not describe valid content formats, <code>null</code> is returned.
     */
    public static ContentFormats parse(java.lang.String string) {
        var RESULT = gtk_h.gdk_content_formats_parse(Interop.allocateNativeString(string).handle());
        return new ContentFormats(References.get(RESULT, true));
    }
    
}
