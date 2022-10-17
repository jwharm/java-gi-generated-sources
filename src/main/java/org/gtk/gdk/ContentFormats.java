package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gdk_content_formats_new = Interop.downcallHandle(
        "gdk_content_formats_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(@Nullable java.lang.String[] mimeTypes, @NotNull int nMimeTypes) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gdk_content_formats_new.invokeExact(Interop.allocateNativeArray(mimeTypes), nMimeTypes), true);
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
    public ContentFormats(@Nullable java.lang.String[] mimeTypes, @NotNull int nMimeTypes) {
        super(constructNew(mimeTypes, nMimeTypes));
    }
    
    private static final MethodHandle gdk_content_formats_new_for_gtype = Interop.downcallHandle(
        "gdk_content_formats_new_for_gtype",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNewForGtype(@NotNull org.gtk.gobject.Type type) {
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
    public static ContentFormats newForGtype(@NotNull org.gtk.gobject.Type type) {
        return new ContentFormats(constructNewForGtype(type));
    }
    
    private static final MethodHandle gdk_content_formats_contain_gtype = Interop.downcallHandle(
        "gdk_content_formats_contain_gtype",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Checks if a given {@code GType} is part of the given {@code formats}.
     */
    public boolean containGtype(@NotNull org.gtk.gobject.Type type) {
        int RESULT;
        try {
            RESULT = (int) gdk_content_formats_contain_gtype.invokeExact(handle(), type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gdk_content_formats_contain_mime_type = Interop.downcallHandle(
        "gdk_content_formats_contain_mime_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a given mime type is part of the given {@code formats}.
     */
    public boolean containMimeType(@NotNull java.lang.String mimeType) {
        int RESULT;
        try {
            RESULT = (int) gdk_content_formats_contain_mime_type.invokeExact(handle(), Interop.allocateNativeString(mimeType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gdk_content_formats_get_gtypes = Interop.downcallHandle(
        "gdk_content_formats_get_gtypes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GType}s included in {@code formats}.
     * <p>
     * Note that {@code formats} may not contain any {@code GType}s, in particular when
     * they are empty. In that case {@code null} will be returned.
     */
    public org.gtk.gobject.Type[] getGtypes(@NotNull Out<Long> nGtypes) {
        MemorySegment nGtypesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_content_formats_get_gtypes.invokeExact(handle(), (Addressable) nGtypesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nGtypes.set(nGtypesPOINTER.get(ValueLayout.JAVA_LONG, 0));
        org.gtk.gobject.Type[] resultARRAY = new org.gtk.gobject.Type[nGtypes.get().intValue()];
        for (int I = 0; I < nGtypes.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.JAVA_LONG, I);
            resultARRAY[I] = new org.gtk.gobject.Type(OBJ);
        }
        return resultARRAY;
    }
    
    private static final MethodHandle gdk_content_formats_get_mime_types = Interop.downcallHandle(
        "gdk_content_formats_get_mime_types",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the mime types included in {@code formats}.
     * <p>
     * Note that {@code formats} may not contain any mime types, in particular
     * when they are empty. In that case {@code null} will be returned.
     */
    public java.lang.String[] getMimeTypes(@NotNull Out<Long> nMimeTypes) {
        MemorySegment nMimeTypesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_content_formats_get_mime_types.invokeExact(handle(), (Addressable) nMimeTypesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nMimeTypes.set(nMimeTypesPOINTER.get(ValueLayout.JAVA_LONG, 0));
        java.lang.String[] resultARRAY = new java.lang.String[nMimeTypes.get().intValue()];
        for (int I = 0; I < nMimeTypes.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = OBJ.getUtf8String(0);
        }
        return resultARRAY;
    }
    
    private static final MethodHandle gdk_content_formats_match = Interop.downcallHandle(
        "gdk_content_formats_match",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code first} and {@code second} have any matching formats.
     */
    public boolean match(@NotNull ContentFormats second) {
        int RESULT;
        try {
            RESULT = (int) gdk_content_formats_match.invokeExact(handle(), second.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gdk_content_formats_match_gtype = Interop.downcallHandle(
        "gdk_content_formats_match_gtype",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the first {@code GType} from {@code first} that is also contained
     * in {@code second}.
     * <p>
     * If no matching {@code GType} is found, {@code G_TYPE_INVALID} is returned.
     */
    public @NotNull org.gtk.gobject.Type matchGtype(@NotNull ContentFormats second) {
        long RESULT;
        try {
            RESULT = (long) gdk_content_formats_match_gtype.invokeExact(handle(), second.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    private static final MethodHandle gdk_content_formats_match_mime_type = Interop.downcallHandle(
        "gdk_content_formats_match_mime_type",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the first mime type from {@code first} that is also contained
     * in {@code second}.
     * <p>
     * If no matching mime type is found, {@code null} is returned.
     */
    public @Nullable java.lang.String matchMimeType(@NotNull ContentFormats second) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_content_formats_match_mime_type.invokeExact(handle(), second.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gdk_content_formats_print = Interop.downcallHandle(
        "gdk_content_formats_print",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prints the given {@code formats} into a string for human consumption.
     * <p>
     * The result of this function can later be parsed with
     * {@link Gdk#ContentFormats}.
     */
    public @NotNull void print(@NotNull org.gtk.glib.String string) {
        try {
            gdk_content_formats_print.invokeExact(handle(), string.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_content_formats_ref = Interop.downcallHandle(
        "gdk_content_formats_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count of a {@code GdkContentFormats} by one.
     */
    public @NotNull ContentFormats ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_content_formats_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ContentFormats(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gdk_content_formats_to_string = Interop.downcallHandle(
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
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_content_formats_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gdk_content_formats_union = Interop.downcallHandle(
        "gdk_content_formats_union",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Append all missing types from {@code second} to {@code first}, in the order
     * they had in {@code second}.
     */
    public @NotNull ContentFormats union(@NotNull ContentFormats second) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_content_formats_union.invokeExact(handle(), second.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ContentFormats(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gdk_content_formats_union_deserialize_gtypes = Interop.downcallHandle(
        "gdk_content_formats_union_deserialize_gtypes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Add GTypes for mime types in {@code formats} for which deserializers are
     * registered.
     */
    public @NotNull ContentFormats unionDeserializeGtypes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_content_formats_union_deserialize_gtypes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ContentFormats(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gdk_content_formats_union_deserialize_mime_types = Interop.downcallHandle(
        "gdk_content_formats_union_deserialize_mime_types",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Add mime types for GTypes in {@code formats} for which deserializers are
     * registered.
     */
    public @NotNull ContentFormats unionDeserializeMimeTypes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_content_formats_union_deserialize_mime_types.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ContentFormats(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gdk_content_formats_union_serialize_gtypes = Interop.downcallHandle(
        "gdk_content_formats_union_serialize_gtypes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Add GTypes for the mime types in {@code formats} for which serializers are
     * registered.
     */
    public @NotNull ContentFormats unionSerializeGtypes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_content_formats_union_serialize_gtypes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ContentFormats(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gdk_content_formats_union_serialize_mime_types = Interop.downcallHandle(
        "gdk_content_formats_union_serialize_mime_types",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Add mime types for GTypes in {@code formats} for which serializers are
     * registered.
     */
    public @NotNull ContentFormats unionSerializeMimeTypes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_content_formats_union_serialize_mime_types.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ContentFormats(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gdk_content_formats_unref = Interop.downcallHandle(
        "gdk_content_formats_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count of a {@code GdkContentFormats} by one.
     * <p>
     * If the resulting reference count is zero, frees the formats.
     */
    public @NotNull void unref() {
        try {
            gdk_content_formats_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_content_formats_parse = Interop.downcallHandle(
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
    public static @Nullable ContentFormats parse(@NotNull java.lang.String string) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_content_formats_parse.invokeExact(Interop.allocateNativeString(string));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ContentFormats(Refcounted.get(RESULT, true));
    }
    
}
