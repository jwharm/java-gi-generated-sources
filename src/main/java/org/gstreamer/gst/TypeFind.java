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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("peek"),
            Interop.valueLayout.ADDRESS.withName("suggest"),
            Interop.valueLayout.ADDRESS.withName("data"),
            Interop.valueLayout.ADDRESS.withName("get_length"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TypeFind}
     * @return A new, uninitialized @{link TypeFind}
     */
    public static TypeFind allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TypeFind newInstance = new TypeFind(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code PeekCallback} callback.
     */
    @FunctionalInterface
    public interface PeekCallback {
    
        PointerByte run(long offset, int size);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress data, long offset, int size) {
            var RESULT = run(offset, size);
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PeekCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code peek}
     * @param peek The new value of the field {@code peek}
     */
    public void setPeek(PeekCallback peek) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("peek"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (peek == null ? MemoryAddress.NULL : peek.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SuggestCallback} callback.
     */
    @FunctionalInterface
    public interface SuggestCallback {
    
        void run(int probability, org.gstreamer.gst.Caps caps);
        
        @ApiStatus.Internal default void upcall(MemoryAddress data, int probability, MemoryAddress caps) {
            run(probability, org.gstreamer.gst.Caps.fromAddress.marshal(caps, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SuggestCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code suggest}
     * @param suggest The new value of the field {@code suggest}
     */
    public void setSuggest(SuggestCallback suggest) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("suggest"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (suggest == null ? MemoryAddress.NULL : suggest.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public java.lang.foreign.MemoryAddress getData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void setData(java.lang.foreign.MemoryAddress data) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetLengthCallback} callback.
     */
    @FunctionalInterface
    public interface GetLengthCallback {
    
        long run();
        
        @ApiStatus.Internal default long upcall(MemoryAddress data) {
            var RESULT = run();
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetLengthCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_length}
     * @param getLength The new value of the field {@code get_length}
     */
    public void setGetLength(GetLengthCallback getLength) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_length"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getLength == null ? MemoryAddress.NULL : getLength.toCallback()));
        }
    }
    
    /**
     * Create a TypeFind proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TypeFind(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TypeFind> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TypeFind(input);
    
    /**
     * Get the length of the data stream.
     * @return The length of the data stream, or 0 if it is not available.
     */
    public long getLength() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_type_find_get_length.invokeExact(handle());
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
    public byte[] peek(long offset, int size) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_type_find_peek.invokeExact(
                        handle(),
                        offset,
                        size);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (RESULT.equals(MemoryAddress.NULL)) return null;
            return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), size * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE);
        }
    }
    
    /**
     * If a {@link TypeFindFunction} calls this function it suggests the caps with the
     * given probability. A {@link TypeFindFunction} may supply different suggestions
     * in one call.
     * It is up to the caller of the {@link TypeFindFunction} to interpret these values.
     * @param probability The probability in percent that the suggestion is right
     * @param caps The fixed {@link Caps} to suggest
     */
    public void suggest(int probability, org.gstreamer.gst.Caps caps) {
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
    public void suggestEmptySimple(int probability, java.lang.String mediaType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_type_find_suggest_empty_simple.invokeExact(
                        handle(),
                        probability,
                        Marshal.stringToAddress.marshal(mediaType, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public void suggestSimple(int probability, java.lang.String mediaType, @Nullable java.lang.String fieldname, java.lang.Object... varargs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_type_find_suggest_simple.invokeExact(
                        handle(),
                        probability,
                        Marshal.stringToAddress.marshal(mediaType, SCOPE),
                        (Addressable) (fieldname == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(fieldname, SCOPE)),
                        varargs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     * @param dataNotify a {@link org.gtk.glib.DestroyNotify} that will be called on {@code data} when the plugin
     *        is unloaded.
     * @return {@code true} on success, {@code false} otherwise
     */
    public static boolean register(@Nullable org.gstreamer.gst.Plugin plugin, java.lang.String name, int rank, org.gstreamer.gst.TypeFindFunction func, @Nullable java.lang.String extensions, @Nullable org.gstreamer.gst.Caps possibleCaps, org.gtk.glib.DestroyNotify dataNotify) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_type_find_register.invokeExact(
                        (Addressable) (plugin == null ? MemoryAddress.NULL : plugin.handle()),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        rank,
                        (Addressable) func.toCallback(),
                        (Addressable) (extensions == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(extensions, SCOPE)),
                        (Addressable) (possibleCaps == null ? MemoryAddress.NULL : possibleCaps.handle()),
                        (Addressable) MemoryAddress.NULL,
                        (Addressable) dataNotify.toCallback());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
     * A {@link TypeFind.Builder} object constructs a {@link TypeFind} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TypeFind.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TypeFind struct;
        
        private Builder() {
            struct = TypeFind.allocate();
        }
        
        /**
         * Finish building the {@link TypeFind} struct.
         * @return A new instance of {@code TypeFind} with the fields 
         *         that were set in the Builder object.
         */
        public TypeFind build() {
            return struct;
        }
        
        public Builder setPeek(PeekCallback peek) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("peek"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (peek == null ? MemoryAddress.NULL : peek.toCallback()));
                return this;
            }
        }
        
        public Builder setSuggest(SuggestCallback suggest) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("suggest"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (suggest == null ? MemoryAddress.NULL : suggest.toCallback()));
                return this;
            }
        }
        
        /**
         * The data used by the caller of the typefinding function.
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setData(java.lang.foreign.MemoryAddress data) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
                return this;
            }
        }
        
        public Builder setGetLength(GetLengthCallback getLength) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_length"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getLength == null ? MemoryAddress.NULL : getLength.toCallback()));
                return this;
            }
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false, SCOPE)));
                return this;
            }
        }
    }
}
