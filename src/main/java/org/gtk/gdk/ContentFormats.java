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
public class ContentFormats extends Struct {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkContentFormats";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ContentFormats}
     * @return A new, uninitialized @{link ContentFormats}
     */
    public static ContentFormats allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ContentFormats newInstance = new ContentFormats(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ContentFormats proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ContentFormats(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ContentFormats> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ContentFormats(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String[] mimeTypes, int nMimeTypes) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_new.invokeExact(
                    (Addressable) (mimeTypes == null ? MemoryAddress.NULL : Interop.allocateNativeArray(mimeTypes, false)),
                    nMimeTypes);
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
    public ContentFormats(@Nullable java.lang.String[] mimeTypes, int nMimeTypes) {
        super(constructNew(mimeTypes, nMimeTypes), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewForGtype(org.gtk.glib.Type type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_new_for_gtype.invokeExact(
                    type.getValue().longValue());
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
    public static ContentFormats newForGtype(org.gtk.glib.Type type) {
        var RESULT = constructNewForGtype(type);
        return org.gtk.gdk.ContentFormats.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Checks if a given {@code GType} is part of the given {@code formats}.
     * @param type the {@code GType} to search for
     * @return {@code true} if the {@code GType} was found
     */
    public boolean containGtype(org.gtk.glib.Type type) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_content_formats_contain_gtype.invokeExact(
                    handle(),
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if a given mime type is part of the given {@code formats}.
     * @param mimeType the mime type to search for
     * @return {@code true} if the mime_type was found
     */
    public boolean containMimeType(java.lang.String mimeType) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_content_formats_contain_mime_type.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(mimeType, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        MemorySegment nGtypesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_get_gtypes.invokeExact(
                    handle(),
                    (Addressable) (nGtypes == null ? MemoryAddress.NULL : (Addressable) nGtypesPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (nGtypes != null) nGtypes.set(nGtypesPOINTER.get(Interop.valueLayout.C_LONG, 0));
        if (RESULT.equals(MemoryAddress.NULL)) return null;
        org.gtk.glib.Type[] resultARRAY = new org.gtk.glib.Type[nGtypes.get().intValue()];
        for (int I = 0; I < nGtypes.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.C_LONG, I);
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
        MemorySegment nMimeTypesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_get_mime_types.invokeExact(
                    handle(),
                    (Addressable) (nMimeTypes == null ? MemoryAddress.NULL : (Addressable) nMimeTypesPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (nMimeTypes != null) nMimeTypes.set(nMimeTypesPOINTER.get(Interop.valueLayout.C_LONG, 0));
        if (RESULT.equals(MemoryAddress.NULL)) return null;
        java.lang.String[] resultARRAY = new java.lang.String[nMimeTypes.get().intValue()];
        for (int I = 0; I < nMimeTypes.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
            resultARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
        }
        return resultARRAY;
    }
    
    /**
     * Checks if {@code first} and {@code second} have any matching formats.
     * @param second the {@code GdkContentFormats} to intersect with
     * @return {@code true} if a matching format was found.
     */
    public boolean match(org.gtk.gdk.ContentFormats second) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_content_formats_match.invokeExact(
                    handle(),
                    second.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Finds the first {@code GType} from {@code first} that is also contained
     * in {@code second}.
     * <p>
     * If no matching {@code GType} is found, {@code G_TYPE_INVALID} is returned.
     * @param second the {@code GdkContentFormats} to intersect with
     * @return The first common {@code GType} or {@code G_TYPE_INVALID} if none.
     */
    public org.gtk.glib.Type matchGtype(org.gtk.gdk.ContentFormats second) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_content_formats_match_gtype.invokeExact(
                    handle(),
                    second.handle());
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
    public @Nullable java.lang.String matchMimeType(org.gtk.gdk.ContentFormats second) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_match_mime_type.invokeExact(
                    handle(),
                    second.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Prints the given {@code formats} into a string for human consumption.
     * <p>
     * The result of this function can later be parsed with
     * {@link ContentFormats#parse}.
     * @param string a {@code GString} to print into
     */
    public void print(org.gtk.glib.GString string) {
        try {
            DowncallHandles.gdk_content_formats_print.invokeExact(
                    handle(),
                    string.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increases the reference count of a {@code GdkContentFormats} by one.
     * @return the passed in {@code GdkContentFormats}.
     */
    public org.gtk.gdk.ContentFormats ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.ContentFormats.fromAddress.marshal(RESULT, Ownership.FULL);
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
    public java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Append all missing types from {@code second} to {@code first}, in the order
     * they had in {@code second}.
     * @param second the {@code GdkContentFormats} to merge from
     * @return a new {@code GdkContentFormats}
     */
    public org.gtk.gdk.ContentFormats union(org.gtk.gdk.ContentFormats second) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_union.invokeExact(
                    handle(),
                    second.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        return org.gtk.gdk.ContentFormats.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Add GTypes for mime types in {@code formats} for which deserializers are
     * registered.
     * @return a new {@code GdkContentFormats}
     */
    public org.gtk.gdk.ContentFormats unionDeserializeGtypes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_union_deserialize_gtypes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        return org.gtk.gdk.ContentFormats.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Add mime types for GTypes in {@code formats} for which deserializers are
     * registered.
     * @return a new {@code GdkContentFormats}
     */
    public org.gtk.gdk.ContentFormats unionDeserializeMimeTypes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_union_deserialize_mime_types.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        return org.gtk.gdk.ContentFormats.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Add GTypes for the mime types in {@code formats} for which serializers are
     * registered.
     * @return a new {@code GdkContentFormats}
     */
    public org.gtk.gdk.ContentFormats unionSerializeGtypes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_union_serialize_gtypes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        return org.gtk.gdk.ContentFormats.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Add mime types for GTypes in {@code formats} for which serializers are
     * registered.
     * @return a new {@code GdkContentFormats}
     */
    public org.gtk.gdk.ContentFormats unionSerializeMimeTypes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_union_serialize_mime_types.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        return org.gtk.gdk.ContentFormats.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Decreases the reference count of a {@code GdkContentFormats} by one.
     * <p>
     * If the resulting reference count is zero, frees the formats.
     */
    public void unref() {
        try {
            DowncallHandles.gdk_content_formats_unref.invokeExact(
                    handle());
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
    public static @Nullable org.gtk.gdk.ContentFormats parse(java.lang.String string) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_content_formats_parse.invokeExact(
                    Marshal.stringToAddress.marshal(string, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.ContentFormats.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_content_formats_new = Interop.downcallHandle(
            "gdk_content_formats_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_content_formats_new_for_gtype = Interop.downcallHandle(
            "gdk_content_formats_new_for_gtype",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gdk_content_formats_contain_gtype = Interop.downcallHandle(
            "gdk_content_formats_contain_gtype",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gdk_content_formats_contain_mime_type = Interop.downcallHandle(
            "gdk_content_formats_contain_mime_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_formats_get_gtypes = Interop.downcallHandle(
            "gdk_content_formats_get_gtypes",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_formats_get_mime_types = Interop.downcallHandle(
            "gdk_content_formats_get_mime_types",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_formats_match = Interop.downcallHandle(
            "gdk_content_formats_match",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_formats_match_gtype = Interop.downcallHandle(
            "gdk_content_formats_match_gtype",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_formats_match_mime_type = Interop.downcallHandle(
            "gdk_content_formats_match_mime_type",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_formats_print = Interop.downcallHandle(
            "gdk_content_formats_print",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_formats_ref = Interop.downcallHandle(
            "gdk_content_formats_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_formats_to_string = Interop.downcallHandle(
            "gdk_content_formats_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_formats_union = Interop.downcallHandle(
            "gdk_content_formats_union",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_formats_union_deserialize_gtypes = Interop.downcallHandle(
            "gdk_content_formats_union_deserialize_gtypes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_formats_union_deserialize_mime_types = Interop.downcallHandle(
            "gdk_content_formats_union_deserialize_mime_types",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_formats_union_serialize_gtypes = Interop.downcallHandle(
            "gdk_content_formats_union_serialize_gtypes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_formats_union_serialize_mime_types = Interop.downcallHandle(
            "gdk_content_formats_union_serialize_mime_types",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_formats_unref = Interop.downcallHandle(
            "gdk_content_formats_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_content_formats_parse = Interop.downcallHandle(
            "gdk_content_formats_parse",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
