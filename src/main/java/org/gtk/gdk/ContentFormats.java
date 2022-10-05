package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GdkContentFormats} structure is used to advertise and negotiate the
 * format of content.
 * <p>
 * You will encounter {@code GdkContentFormats} when interacting with objects
 * controlling operations that pass data between different widgets, window
 * or application, like {@code Gdk.Drop},
 * {@code Gdk.ContentProvider}.
 * <p>
 * GDK supports content in 2 forms: {@code GType} and mime type.
 * Using {@code GTypes} is meant only for in-process content transfers. Mime types
 * are meant to be used for data passing both in-process and out-of-process.
 * The details of how data is passed is described in the documentation of
 * the actual implementations. To transform between the two forms,
 * {@code Gdk.ContentDeserializer} are used.
 * <p>
 * A {@code GdkContentFormats} describes a set of possible formats content can be
 * exchanged in. It is assumed that this set is ordered. {@code GTypes} are more
 * important than mime types. Order between different {@code GTypes} or mime types
 * is the order they were added in, most important first. Functions that
 * care about order, such as {@link ContentFormats#union}, will describe
 * in their documentation how they interpret that order, though in general the
 * order of the first argument is considered the primary order of the result,
 * followed by the order of further arguments.
 * <p>
 * For debugging purposes, the function {@link ContentFormats#toString}
 * exists. It will print a comma-separated list of formats from most important
 * to least important.
 * <p>
 * {@code GdkContentFormats} is an immutable struct. After creation, you cannot change
 * the types it represents. Instead, new {@code GdkContentFormats} have to be created.
 * The {@code Gdk.ContentFormatsBuilder} structure is meant to help in this
 * endeavor.
 */
public class ContentFormats extends io.github.jwharm.javagi.ResourceBase {

    public ContentFormats(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle gdk_content_formats_new = Interop.downcallHandle(
        "gdk_content_formats_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(java.lang.String[] mimeTypes, int nMimeTypes) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_content_formats_new.invokeExact(Interop.allocateNativeArray(mimeTypes).handle(), nMimeTypes), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GdkContentFormats} from an array of mime types.
     * <p>
     * The mime types must be valid and different from each other or the
     * behavior of the return value is undefined. If you cannot guarantee
     * this, use {@code Gdk.ContentFormatsBuilder} instead.
     */
    public ContentFormats(java.lang.String[] mimeTypes, int nMimeTypes) {
        super(constructNew(mimeTypes, nMimeTypes));
    }
    
    static final MethodHandle gdk_content_formats_new_for_gtype = Interop.downcallHandle(
        "gdk_content_formats_new_for_gtype",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNewForGtype(org.gtk.gobject.Type type) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_content_formats_new_for_gtype.invokeExact(type.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GdkContentFormats} for a given {@code GType}.
     */
    public static ContentFormats newForGtype(org.gtk.gobject.Type type) {
        return new ContentFormats(constructNewForGtype(type));
    }
    
    static final MethodHandle gdk_content_formats_contain_gtype = Interop.downcallHandle(
        "gdk_content_formats_contain_gtype",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Checks if a given {@code GType} is part of the given {@code formats}.
     */
    public boolean containGtype(org.gtk.gobject.Type type) {
        try {
            var RESULT = (int) gdk_content_formats_contain_gtype.invokeExact(handle(), type.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_contain_mime_type = Interop.downcallHandle(
        "gdk_content_formats_contain_mime_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a given mime type is part of the given {@code formats}.
     */
    public boolean containMimeType(java.lang.String mimeType) {
        try {
            var RESULT = (int) gdk_content_formats_contain_mime_type.invokeExact(handle(), Interop.allocateNativeString(mimeType).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_get_gtypes = Interop.downcallHandle(
        "gdk_content_formats_get_gtypes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GType}s included in {@code formats}.
     * <p>
     * Note that {@code formats} may not contain any {@code GType}s, in particular when
     * they are empty. In that case {@code null} will be returned.
     */
    public PointerIterator<Long> getGtypes(PointerLong nGtypes) {
        try {
            var RESULT = (MemoryAddress) gdk_content_formats_get_gtypes.invokeExact(handle(), nGtypes.handle());
            return new PointerLong(RESULT).iterator();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_get_mime_types = Interop.downcallHandle(
        "gdk_content_formats_get_mime_types",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the mime types included in {@code formats}.
     * <p>
     * Note that {@code formats} may not contain any mime types, in particular
     * when they are empty. In that case {@code null} will be returned.
     */
    public PointerIterator<java.lang.String> getMimeTypes(PointerLong nMimeTypes) {
        try {
            var RESULT = (MemoryAddress) gdk_content_formats_get_mime_types.invokeExact(handle(), nMimeTypes.handle());
            return new PointerString(RESULT).iterator();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_match = Interop.downcallHandle(
        "gdk_content_formats_match",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code first} and {@code second} have any matching formats.
     */
    public boolean match(ContentFormats second) {
        try {
            var RESULT = (int) gdk_content_formats_match.invokeExact(handle(), second.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_match_gtype = Interop.downcallHandle(
        "gdk_content_formats_match_gtype",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the first {@code GType} from {@code first} that is also contained
     * in {@code second}.
     * <p>
     * If no matching {@code GType} is found, {@code G_TYPE_INVALID} is returned.
     */
    public org.gtk.gobject.Type matchGtype(ContentFormats second) {
        try {
            var RESULT = (long) gdk_content_formats_match_gtype.invokeExact(handle(), second.handle());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_match_mime_type = Interop.downcallHandle(
        "gdk_content_formats_match_mime_type",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the first mime type from {@code first} that is also contained
     * in {@code second}.
     * <p>
     * If no matching mime type is found, {@code null} is returned.
     */
    public java.lang.String matchMimeType(ContentFormats second) {
        try {
            var RESULT = (MemoryAddress) gdk_content_formats_match_mime_type.invokeExact(handle(), second.handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_print = Interop.downcallHandle(
        "gdk_content_formats_print",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prints the given {@code formats} into a string for human consumption.
     * <p>
     * The result of this function can later be parsed with
     * {@link Gdk#ContentFormats}.
     */
    public void print(org.gtk.glib.String string) {
        try {
            gdk_content_formats_print.invokeExact(handle(), string.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_ref = Interop.downcallHandle(
        "gdk_content_formats_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count of a {@code GdkContentFormats} by one.
     */
    public ContentFormats ref() {
        try {
            var RESULT = (MemoryAddress) gdk_content_formats_ref.invokeExact(handle());
            return new ContentFormats(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_to_string = Interop.downcallHandle(
        "gdk_content_formats_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prints the given {@code formats} into a human-readable string.
     * <p>
     * The resulting string can be parsed with {@link Gdk#ContentFormats}.
     * <p>
     * This is a small wrapper around {@link ContentFormats#print}
     * to help when debugging.
     */
    public java.lang.String toString() {
        try {
            var RESULT = (MemoryAddress) gdk_content_formats_to_string.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_union = Interop.downcallHandle(
        "gdk_content_formats_union",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Append all missing types from {@code second} to {@code first}, in the order
     * they had in {@code second}.
     */
    public ContentFormats union(ContentFormats second) {
        try {
            var RESULT = (MemoryAddress) gdk_content_formats_union.invokeExact(handle(), second.handle());
            return new ContentFormats(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_union_deserialize_gtypes = Interop.downcallHandle(
        "gdk_content_formats_union_deserialize_gtypes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Add GTypes for mime types in {@code formats} for which deserializers are
     * registered.
     */
    public ContentFormats unionDeserializeGtypes() {
        try {
            var RESULT = (MemoryAddress) gdk_content_formats_union_deserialize_gtypes.invokeExact(handle());
            return new ContentFormats(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_union_deserialize_mime_types = Interop.downcallHandle(
        "gdk_content_formats_union_deserialize_mime_types",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Add mime types for GTypes in {@code formats} for which deserializers are
     * registered.
     */
    public ContentFormats unionDeserializeMimeTypes() {
        try {
            var RESULT = (MemoryAddress) gdk_content_formats_union_deserialize_mime_types.invokeExact(handle());
            return new ContentFormats(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_union_serialize_gtypes = Interop.downcallHandle(
        "gdk_content_formats_union_serialize_gtypes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Add GTypes for the mime types in {@code formats} for which serializers are
     * registered.
     */
    public ContentFormats unionSerializeGtypes() {
        try {
            var RESULT = (MemoryAddress) gdk_content_formats_union_serialize_gtypes.invokeExact(handle());
            return new ContentFormats(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_union_serialize_mime_types = Interop.downcallHandle(
        "gdk_content_formats_union_serialize_mime_types",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Add mime types for GTypes in {@code formats} for which serializers are
     * registered.
     */
    public ContentFormats unionSerializeMimeTypes() {
        try {
            var RESULT = (MemoryAddress) gdk_content_formats_union_serialize_mime_types.invokeExact(handle());
            return new ContentFormats(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_unref = Interop.downcallHandle(
        "gdk_content_formats_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count of a {@code GdkContentFormats} by one.
     * <p>
     * If the resulting reference count is zero, frees the formats.
     */
    public void unref() {
        try {
            gdk_content_formats_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_content_formats_parse = Interop.downcallHandle(
        "gdk_content_formats_parse",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Parses the given {@code string} into {@code GdkContentFormats} and
     * returns the formats.
     * <p>
     * Strings printed via {@link ContentFormats#toString}
     * can be read in again successfully using this function.
     * <p>
     * If {@code string} does not describe valid content formats, {@code null}
     * is returned.
     */
    public static ContentFormats parse(java.lang.String string) {
        try {
            var RESULT = (MemoryAddress) gdk_content_formats_parse.invokeExact(Interop.allocateNativeString(string).handle());
            return new ContentFormats(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
