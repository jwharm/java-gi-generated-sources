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
 * or application, like {@link Drag},
 * {@link Clipboard}.
 * <p>
 * GDK supports content in 2 forms: {@code GType} and mime type.
 * Using {@code GTypes} is meant only for in-process content transfers. Mime types
 * are meant to be used for data passing both in-process and out-of-process.
 * The details of how data is passed is described in the documentation of
 * the actual implementations. To transform between the two forms,
 * {@link ContentSerializer} are used.
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
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public ContentFormats(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructNew(java.lang.String[] mimeTypes, int nMimeTypes) {
        java.util.Objects.requireNonNullElse(mimeTypes, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gdk_content_formats_new.invokeExact(Interop.allocateNativeArray(mimeTypes, false), nMimeTypes), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GdkContentFormats} from an array of mime types.
     * <p>
     * The mime types must be valid and different from each other or the
     * behavior of the return value is undefined. If you cannot guarantee
     * this, use {@code Gdk.ContentFormatsBuilder} instead.
     * @param mimeTypes Pointer to an
     *   array of mime types
     * @param nMimeTypes number of entries in {@code mime_types}.
     */
    public ContentFormats(java.lang.String[] mimeTypes, int nMimeTypes) {
        super(constructNew(mimeTypes, nMimeTypes));
    }
    
    private static Refcounted constructNewForGtype(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gdk_content_formats_new_for_gtype.invokeExact(type.getValue()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GdkContentFormats} for a given {@code GType}.
     * @param type a {@code GType}
     * @return a new {@code GdkContentFormats}
     */
    public static ContentFormats newForGtype(@NotNull org.gtk.glib.Type type) {
        return new ContentFormats(constructNewForGtype(type));
    }
    
    /**
     * Checks if a given {@code GType} is part of the given {@code formats}.
     * @param type the {@code GType} to search for
     * @return {@code true} if the {@code GType} was found
     */
    public boolean containGtype(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_content_formats_contain_gtype.invokeExact(handle(), type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if a given mime type is part of the given {@code formats}.
     * @param mimeType the mime type to search for
     * @return {@code true} if the mime_type was found
     */
    public boolean containMimeType(@NotNull java.lang.String mimeType) {
        java.util.Objects.requireNonNull(mimeType, "Parameter 'mimeType' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_content_formats_contain_mime_type.invokeExact(handle(), Interop.allocateNativeString(mimeType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the {@code GType}s included in {@code formats}.
     * <p>
     * Note that {@code formats} may not contain any {@code GType}s, in particular when
     * they are empty. In that case {@code null} will be returned.
     * @param nGtypes optional pointer to take the
     *   number of {@code GType}s contained in the return value
     * @return {@code G_TYPE_INVALID}-terminated array of types included in {@code formats}
     */
    public @Nullable org.gtk.glib.Type[] getGtypes(Out<Long> nGtypes) {
        java.util.Objects.requireNonNull(nGtypes, "Parameter 'nGtypes' must not be null");
        MemorySegment nGtypesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_get_gtypes.invokeExact(handle(), (Addressable) nGtypesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nGtypes.set(nGtypesPOINTER.get(ValueLayout.JAVA_LONG, 0));
        if (RESULT.equals(MemoryAddress.NULL)) return null;
        org.gtk.glib.Type[] resultARRAY = new org.gtk.glib.Type[nGtypes.get().intValue()];
        for (int I = 0; I < nGtypes.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.JAVA_LONG, I);
            resultARRAY[I] = new org.gtk.glib.Type(OBJ);
        }
        return resultARRAY;
    }
    
    /**
     * Gets the mime types included in {@code formats}.
     * <p>
     * Note that {@code formats} may not contain any mime types, in particular
     * when they are empty. In that case {@code null} will be returned.
     * @param nMimeTypes optional pointer to take the
     *   number of mime types contained in the return value
     * @return {@code null}-terminated array of interned strings of mime types included
     *   in {@code formats}
     */
    public @Nullable java.lang.String[] getMimeTypes(Out<Long> nMimeTypes) {
        java.util.Objects.requireNonNull(nMimeTypes, "Parameter 'nMimeTypes' must not be null");
        MemorySegment nMimeTypesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_get_mime_types.invokeExact(handle(), (Addressable) nMimeTypesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nMimeTypes.set(nMimeTypesPOINTER.get(ValueLayout.JAVA_LONG, 0));
        if (RESULT.equals(MemoryAddress.NULL)) return null;
        java.lang.String[] resultARRAY = new java.lang.String[nMimeTypes.get().intValue()];
        for (int I = 0; I < nMimeTypes.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = OBJ.getUtf8String(0);
        }
        return resultARRAY;
    }
    
    /**
     * Checks if {@code first} and {@code second} have any matching formats.
     * @param second the {@code GdkContentFormats} to intersect with
     * @return {@code true} if a matching format was found.
     */
    public boolean match(@NotNull org.gtk.gdk.ContentFormats second) {
        java.util.Objects.requireNonNull(second, "Parameter 'second' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_content_formats_match.invokeExact(handle(), second.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Finds the first {@code GType} from {@code first} that is also contained
     * in {@code second}.
     * <p>
     * If no matching {@code GType} is found, {@code G_TYPE_INVALID} is returned.
     * @param second the {@code GdkContentFormats} to intersect with
     * @return The first common {@code GType} or {@code G_TYPE_INVALID} if none.
     */
    public @NotNull org.gtk.glib.Type matchGtype(@NotNull org.gtk.gdk.ContentFormats second) {
        java.util.Objects.requireNonNull(second, "Parameter 'second' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_content_formats_match_gtype.invokeExact(handle(), second.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Finds the first mime type from {@code first} that is also contained
     * in {@code second}.
     * <p>
     * If no matching mime type is found, {@code null} is returned.
     * @param second the {@code GdkContentFormats} to intersect with
     * @return The first common mime type or {@code null} if none
     */
    public @Nullable java.lang.String matchMimeType(@NotNull org.gtk.gdk.ContentFormats second) {
        java.util.Objects.requireNonNull(second, "Parameter 'second' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_match_mime_type.invokeExact(handle(), second.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Prints the given {@code formats} into a string for human consumption.
     * <p>
     * The result of this function can later be parsed with
     * {@link ContentFormats#parse}.
     * @param string a {@code GString} to print into
     */
    public void print(@NotNull org.gtk.glib.String string) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        try {
            DowncallHandles.gdk_content_formats_print.invokeExact(handle(), string.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increases the reference count of a {@code GdkContentFormats} by one.
     * @return the passed in {@code GdkContentFormats}.
     */
    public @NotNull org.gtk.gdk.ContentFormats ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentFormats(Refcounted.get(RESULT, true));
    }
    
    /**
     * Prints the given {@code formats} into a human-readable string.
     * <p>
     * The resulting string can be parsed with {@link ContentFormats#parse}.
     * <p>
     * This is a small wrapper around {@link ContentFormats#print}
     * to help when debugging.
     * @return a new string
     */
    public @NotNull java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Append all missing types from {@code second} to {@code first}, in the order
     * they had in {@code second}.
     * @param second the {@code GdkContentFormats} to merge from
     * @return a new {@code GdkContentFormats}
     */
    public @NotNull org.gtk.gdk.ContentFormats union(@NotNull org.gtk.gdk.ContentFormats second) {
        java.util.Objects.requireNonNull(second, "Parameter 'second' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_union.invokeExact(handle(), second.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentFormats(Refcounted.get(RESULT, true));
    }
    
    /**
     * Add GTypes for mime types in {@code formats} for which deserializers are
     * registered.
     * @return a new {@code GdkContentFormats}
     */
    public @NotNull org.gtk.gdk.ContentFormats unionDeserializeGtypes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_union_deserialize_gtypes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentFormats(Refcounted.get(RESULT, true));
    }
    
    /**
     * Add mime types for GTypes in {@code formats} for which deserializers are
     * registered.
     * @return a new {@code GdkContentFormats}
     */
    public @NotNull org.gtk.gdk.ContentFormats unionDeserializeMimeTypes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_union_deserialize_mime_types.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentFormats(Refcounted.get(RESULT, true));
    }
    
    /**
     * Add GTypes for the mime types in {@code formats} for which serializers are
     * registered.
     * @return a new {@code GdkContentFormats}
     */
    public @NotNull org.gtk.gdk.ContentFormats unionSerializeGtypes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_union_serialize_gtypes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentFormats(Refcounted.get(RESULT, true));
    }
    
    /**
     * Add mime types for GTypes in {@code formats} for which serializers are
     * registered.
     * @return a new {@code GdkContentFormats}
     */
    public @NotNull org.gtk.gdk.ContentFormats unionSerializeMimeTypes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_union_serialize_mime_types.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentFormats(Refcounted.get(RESULT, true));
    }
    
    /**
     * Decreases the reference count of a {@code GdkContentFormats} by one.
     * <p>
     * If the resulting reference count is zero, frees the formats.
     */
    public void unref() {
        try {
            DowncallHandles.gdk_content_formats_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Parses the given {@code string} into {@code GdkContentFormats} and
     * returns the formats.
     * <p>
     * Strings printed via {@link ContentFormats#toString}
     * can be read in again successfully using this function.
     * <p>
     * If {@code string} does not describe valid content formats, {@code null}
     * is returned.
     * @param string the string to parse
     * @return the content formats if {@code string} is valid
     */
    public static @Nullable org.gtk.gdk.ContentFormats parse(@NotNull java.lang.String string) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_parse.invokeExact(Interop.allocateNativeString(string));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentFormats(Refcounted.get(RESULT, true));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_content_formats_new = Interop.downcallHandle(
            "gdk_content_formats_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gdk_content_formats_new_for_gtype = Interop.downcallHandle(
            "gdk_content_formats_new_for_gtype",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle gdk_content_formats_contain_gtype = Interop.downcallHandle(
            "gdk_content_formats_contain_gtype",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle gdk_content_formats_contain_mime_type = Interop.downcallHandle(
            "gdk_content_formats_contain_mime_type",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_content_formats_get_gtypes = Interop.downcallHandle(
            "gdk_content_formats_get_gtypes",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_content_formats_get_mime_types = Interop.downcallHandle(
            "gdk_content_formats_get_mime_types",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_content_formats_match = Interop.downcallHandle(
            "gdk_content_formats_match",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_content_formats_match_gtype = Interop.downcallHandle(
            "gdk_content_formats_match_gtype",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_content_formats_match_mime_type = Interop.downcallHandle(
            "gdk_content_formats_match_mime_type",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_content_formats_print = Interop.downcallHandle(
            "gdk_content_formats_print",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_content_formats_ref = Interop.downcallHandle(
            "gdk_content_formats_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_content_formats_to_string = Interop.downcallHandle(
            "gdk_content_formats_to_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_content_formats_union = Interop.downcallHandle(
            "gdk_content_formats_union",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_content_formats_union_deserialize_gtypes = Interop.downcallHandle(
            "gdk_content_formats_union_deserialize_gtypes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_content_formats_union_deserialize_mime_types = Interop.downcallHandle(
            "gdk_content_formats_union_deserialize_mime_types",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_content_formats_union_serialize_gtypes = Interop.downcallHandle(
            "gdk_content_formats_union_serialize_gtypes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_content_formats_union_serialize_mime_types = Interop.downcallHandle(
            "gdk_content_formats_union_serialize_mime_types",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_content_formats_unref = Interop.downcallHandle(
            "gdk_content_formats_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_content_formats_parse = Interop.downcallHandle(
            "gdk_content_formats_parse",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
