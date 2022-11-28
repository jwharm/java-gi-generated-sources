package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The following functions allow you to detect the media type of an unknown
 * stream.
 */
public class TypeFind extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTypeFind";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("peek"),
        Interop.valueLayout.ADDRESS.withName("suggest"),
        Interop.valueLayout.ADDRESS.withName("data"),
        Interop.valueLayout.ADDRESS.withName("get_length"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TypeFind}
     * @return A new, uninitialized @{link TypeFind}
     */
    public static TypeFind allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TypeFind newInstance = new TypeFind(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public java.lang.foreign.MemoryAddress data$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void data$set(java.lang.foreign.MemoryAddress data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) data);
    }
    
    /**
     * Create a TypeFind proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TypeFind(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Get the length of the data stream.
     * @return The length of the data stream, or 0 if it is not available.
     */
    public long getLength() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_type_find_get_length.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the {@code size} bytes of the stream to identify beginning at offset. If
     * offset is a positive number, the offset is relative to the beginning of the
     * stream, if offset is a negative number the offset is relative to the end of
     * the stream. The returned memory is valid until the typefinding function
     * returns and must not be freed.
     * @param offset The offset
     * @param size The number of bytes to return
     * @return the
     *     requested data, or {@code null} if that data is not available.
     */
    public @Nullable byte[] peek(long offset, Out<Integer> size) {
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_type_find_peek.invokeExact(
                    handle(),
                    offset,
                    (Addressable) sizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        size.set(sizePOINTER.get(Interop.valueLayout.C_INT, 0));
        if (RESULT.equals(MemoryAddress.NULL)) return null;
        return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), size.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE);
    }
    
    /**
     * If a {@link TypeFindFunction} calls this function it suggests the caps with the
     * given probability. A {@link TypeFindFunction} may supply different suggestions
     * in one call.
     * It is up to the caller of the {@link TypeFindFunction} to interpret these values.
     * @param probability The probability in percent that the suggestion is right
     * @param caps The fixed {@link Caps} to suggest
     */
    public void suggest(int probability, @NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        try {
            DowncallHandles.gst_type_find_suggest.invokeExact(
                    handle(),
                    probability,
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If a {@link TypeFindFunction} calls this function it suggests caps of the
     * given {@code media_type} with the given {@code probability}.
     * <p>
     * This function is similar to gst_type_find_suggest_simple(), but uses
     * a {@link Caps} with no fields.
     * @param probability The probability in percent that the suggestion is right
     * @param mediaType the media type of the suggested caps
     */
    public void suggestEmptySimple(int probability, @NotNull java.lang.String mediaType) {
        java.util.Objects.requireNonNull(mediaType, "Parameter 'mediaType' must not be null");
        try {
            DowncallHandles.gst_type_find_suggest_empty_simple.invokeExact(
                    handle(),
                    probability,
                    Interop.allocateNativeString(mediaType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If a {@link TypeFindFunction} calls this function it suggests the caps with the
     * given probability. A {@link TypeFindFunction} may supply different suggestions
     * in one call. It is up to the caller of the {@link TypeFindFunction} to interpret
     * these values.
     * <p>
     * This function is similar to gst_type_find_suggest(), only that instead of
     * passing a {@link Caps} argument you can create the caps on the fly in the same
     * way as you can with gst_caps_new_simple().
     * <p>
     * Make sure you terminate the list of arguments with a {@code null} argument and that
     * the values passed have the correct type (in terms of width in bytes when
     * passed to the vararg function - this applies particularly to gdouble and
     * guint64 arguments).
     * @param probability The probability in percent that the suggestion is right
     * @param mediaType the media type of the suggested caps
     * @param fieldname first field of the suggested caps, or {@code null}
     * @param varargs additional arguments to the suggested caps in the same format as the
     *     arguments passed to gst_structure_new() (ie. triplets of field name,
     *     field GType and field value).  If {@code fieldname} is {@code null}, this list
     *     must be exactly one {@code null}.
     */
    public void suggestSimple(int probability, @NotNull java.lang.String mediaType, @Nullable java.lang.String fieldname, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(mediaType, "Parameter 'mediaType' must not be null");
        try {
            DowncallHandles.gst_type_find_suggest_simple.invokeExact(
                    handle(),
                    probability,
                    Interop.allocateNativeString(mediaType),
                    (Addressable) (fieldname == null ? MemoryAddress.NULL : Interop.allocateNativeString(fieldname)),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Registers a new typefind function to be used for typefinding. After
     * registering this function will be available for typefinding.
     * This function is typically called during an element's plugin initialization.
     * @param plugin A {@link Plugin}, or {@code null} for a static typefind function
     * @param name The name for registering
     * @param rank The rank (or importance) of this typefind function
     * @param func The {@link TypeFindFunction} to use
     * @param extensions Optional comma-separated list of extensions
     *     that could belong to this type
     * @param possibleCaps Optionally the caps that could be returned when typefinding
     *                 succeeds
     * @return {@code true} on success, {@code false} otherwise
     */
    public static boolean register(@Nullable org.gstreamer.gst.Plugin plugin, @NotNull java.lang.String name, int rank, @NotNull org.gstreamer.gst.TypeFindFunction func, @Nullable java.lang.String extensions, @Nullable org.gstreamer.gst.Caps possibleCaps) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_type_find_register.invokeExact(
                    (Addressable) (plugin == null ? MemoryAddress.NULL : plugin.handle()),
                    Interop.allocateNativeString(name),
                    rank,
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gst.Callbacks.class, "cbTypeFindFunction",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (extensions == null ? MemoryAddress.NULL : Interop.allocateNativeString(extensions)),
                    (Addressable) (possibleCaps == null ? MemoryAddress.NULL : possibleCaps.handle()),
                    (Addressable) (Interop.registerCallback(func)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_type_find_get_length = Interop.downcallHandle(
            "gst_type_find_get_length",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_type_find_peek = Interop.downcallHandle(
            "gst_type_find_peek",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_type_find_suggest = Interop.downcallHandle(
            "gst_type_find_suggest",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_type_find_suggest_empty_simple = Interop.downcallHandle(
            "gst_type_find_suggest_empty_simple",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_type_find_suggest_simple = Interop.downcallHandle(
            "gst_type_find_suggest_simple",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_type_find_register = Interop.downcallHandle(
            "gst_type_find_register",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TypeFind struct;
        
         /**
         * A {@link TypeFind.Build} object constructs a {@link TypeFind} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TypeFind.allocate();
        }
        
         /**
         * Finish building the {@link TypeFind} struct.
         * @return A new instance of {@code TypeFind} with the fields 
         *         that were set in the Build object.
         */
        public TypeFind construct() {
            return struct;
        }
        
        public Build setPeek(java.lang.foreign.MemoryAddress peek) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("peek"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (peek == null ? MemoryAddress.NULL : peek));
            return this;
        }
        
        public Build setSuggest(java.lang.foreign.MemoryAddress suggest) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("suggest"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (suggest == null ? MemoryAddress.NULL : suggest));
            return this;
        }
        
        /**
         * The data used by the caller of the typefinding function.
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setData(java.lang.foreign.MemoryAddress data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
            return this;
        }
        
        public Build setGetLength(java.lang.foreign.MemoryAddress getLength) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_length"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getLength == null ? MemoryAddress.NULL : getLength));
            return this;
        }
        
        public Build setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
