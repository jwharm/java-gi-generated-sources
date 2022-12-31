package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link MemoryOutputStream} is a class for using arbitrary
 * memory chunks as output for GIO streaming output operations.
 * <p>
 * As of GLib 2.34, {@link MemoryOutputStream} trivially implements
 * {@link PollableOutputStream}: it always polls as ready.
 */
public class MemoryOutputStream extends org.gtk.gio.OutputStream implements org.gtk.gio.PollableOutputStream, org.gtk.gio.Seekable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMemoryOutputStream";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.OutputStream.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a MemoryOutputStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MemoryOutputStream(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MemoryOutputStream> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MemoryOutputStream(input, ownership);
    
    private static MemoryAddress constructNew(long size, @Nullable org.gtk.gio.ReallocFunc reallocFunction, @Nullable org.gtk.glib.DestroyNotify destroyFunction) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_memory_output_stream_new.invokeExact(
                    (Addressable) MemoryAddress.NULL,
                    size,
                    (Addressable) (reallocFunction == null ? MemoryAddress.NULL : (Addressable) reallocFunction.toCallback()),
                    (Addressable) (destroyFunction == null ? MemoryAddress.NULL : (Addressable) destroyFunction.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link MemoryOutputStream}.
     * <p>
     * In most cases this is not the function you want.  See
     * g_memory_output_stream_new_resizable() instead.
     * <p>
     * If {@code data} is non-{@code null}, the stream will use that for its internal storage.
     * <p>
     * If {@code realloc_fn} is non-{@code null}, it will be used for resizing the internal
     * storage when necessary and the stream will be considered resizable.
     * In that case, the stream will start out being (conceptually) empty.
     * {@code size} is used only as a hint for how big {@code data} is.  Specifically,
     * seeking to the end of a newly-created stream will seek to zero, not
     * {@code size}.  Seeking past the end of the stream and then writing will
     * introduce a zero-filled gap.
     * <p>
     * If {@code realloc_fn} is {@code null} then the stream is fixed-sized.  Seeking to
     * the end will seek to {@code size} exactly.  Writing past the end will give
     * an 'out of space' error.  Attempting to seek past the end will fail.
     * Unlike the resizable case, seeking to an offset within the stream and
     * writing will preserve the bytes passed in as {@code data} before that point
     * and will return them as part of g_memory_output_stream_steal_data().
     * If you intend to seek you should probably therefore ensure that {@code data}
     * is properly initialised.
     * <p>
     * It is probably only meaningful to provide {@code data} and {@code size} in the case
     * that you want a fixed-sized stream.  Put another way: if {@code realloc_fn}
     * is non-{@code null} then it makes most sense to give {@code data} as {@code null} and
     * {@code size} as 0 (allowing {@link MemoryOutputStream} to do the initial
     * allocation for itself).
     * <pre>{@code <!-- language="C" -->
     * // a stream that can grow
     * stream = g_memory_output_stream_new (NULL, 0, realloc, free);
     * 
     * // another stream that can grow
     * stream2 = g_memory_output_stream_new (NULL, 0, g_realloc, g_free);
     * 
     * // a fixed-size stream
     * data = malloc (200);
     * stream3 = g_memory_output_stream_new (data, 200, NULL, free);
     * }</pre>
     * @param size the size of {@code data}
     * @param reallocFunction a function with realloc() semantics (like g_realloc())
     *     to be called when {@code data} needs to be grown, or {@code null}
     * @param destroyFunction a function to be called on {@code data} when the stream is
     *     finalized, or {@code null}
     */
    public MemoryOutputStream(long size, @Nullable org.gtk.gio.ReallocFunc reallocFunction, @Nullable org.gtk.glib.DestroyNotify destroyFunction) {
        super(constructNew(size, reallocFunction, destroyFunction), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewResizable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_memory_output_stream_new_resizable.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link MemoryOutputStream}, using g_realloc() and g_free()
     * for memory allocation.
     */
    public static MemoryOutputStream newResizable() {
        var RESULT = constructNewResizable();
        return (org.gtk.gio.MemoryOutputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.MemoryOutputStream.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets any loaded data from the {@code ostream}.
     * <p>
     * Note that the returned pointer may become invalid on the next
     * write or truncate operation on the stream.
     * @return pointer to the stream's data, or {@code null} if the data
     *    has been stolen
     */
    public @Nullable java.lang.foreign.MemoryAddress getData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_memory_output_stream_get_data.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the number of bytes from the start up to including the last
     * byte written in the stream that has not been truncated away.
     * @return the number of bytes written to the stream
     */
    public long getDataSize() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_memory_output_stream_get_data_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the size of the currently allocated data area (available from
     * g_memory_output_stream_get_data()).
     * <p>
     * You probably don't want to use this function on resizable streams.
     * See g_memory_output_stream_get_data_size() instead.  For resizable
     * streams the size returned by this function is an implementation
     * detail and may be change at any time in response to operations on the
     * stream.
     * <p>
     * If the stream is fixed-sized (ie: no realloc was passed to
     * g_memory_output_stream_new()) then this is the maximum size of the
     * stream and further writes will return {@link IOErrorEnum#NO_SPACE}.
     * <p>
     * In any case, if you want the number of bytes currently written to the
     * stream, use g_memory_output_stream_get_data_size().
     * @return the number of bytes allocated for the data buffer
     */
    public long getSize() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_memory_output_stream_get_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns data from the {@code ostream} as a {@link org.gtk.glib.Bytes}. {@code ostream} must be
     * closed before calling this function.
     * @return the stream's data
     */
    public org.gtk.glib.Bytes stealAsBytes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_memory_output_stream_steal_as_bytes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Bytes.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets any loaded data from the {@code ostream}. Ownership of the data
     * is transferred to the caller; when no longer needed it must be
     * freed using the free function set in {@code ostream}'s
     * {@link MemoryOutputStream}:destroy-function property.
     * <p>
     * {@code ostream} must be closed before calling this function.
     * @return the stream's data, or {@code null} if it has previously
     *    been stolen
     */
    public @Nullable java.lang.foreign.MemoryAddress stealData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_memory_output_stream_steal_data.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_memory_output_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link MemoryOutputStream.Builder} object constructs a {@link MemoryOutputStream} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link MemoryOutputStream.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.OutputStream.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link MemoryOutputStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MemoryOutputStream}.
         * @return A new instance of {@code MemoryOutputStream} with the properties 
         *         that were set in the Builder object.
         */
        public MemoryOutputStream build() {
            return (MemoryOutputStream) org.gtk.gobject.GObject.newWithProperties(
                MemoryOutputStream.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Pointer to buffer where data will be written.
         * @param data The value for the {@code data} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setData(java.lang.foreign.MemoryAddress data) {
            names.add("data");
            values.add(org.gtk.gobject.Value.create(data));
            return this;
        }
        
        /**
         * Size of data written to the buffer.
         * @param dataSize The value for the {@code data-size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDataSize(long dataSize) {
            names.add("data-size");
            values.add(org.gtk.gobject.Value.create(dataSize));
            return this;
        }
        
        /**
         * Function called with the buffer as argument when the stream is destroyed.
         * @param destroyFunction The value for the {@code destroy-function} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDestroyFunction(java.lang.foreign.MemoryAddress destroyFunction) {
            names.add("destroy-function");
            values.add(org.gtk.gobject.Value.create(destroyFunction));
            return this;
        }
        
        /**
         * Function with realloc semantics called to enlarge the buffer.
         * @param reallocFunction The value for the {@code realloc-function} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setReallocFunction(java.lang.foreign.MemoryAddress reallocFunction) {
            names.add("realloc-function");
            values.add(org.gtk.gobject.Value.create(reallocFunction));
            return this;
        }
        
        /**
         * Current size of the data buffer.
         * @param size The value for the {@code size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSize(long size) {
            names.add("size");
            values.add(org.gtk.gobject.Value.create(size));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_memory_output_stream_new = Interop.downcallHandle(
            "g_memory_output_stream_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_memory_output_stream_new_resizable = Interop.downcallHandle(
            "g_memory_output_stream_new_resizable",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_memory_output_stream_get_data = Interop.downcallHandle(
            "g_memory_output_stream_get_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_memory_output_stream_get_data_size = Interop.downcallHandle(
            "g_memory_output_stream_get_data_size",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_memory_output_stream_get_size = Interop.downcallHandle(
            "g_memory_output_stream_get_size",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_memory_output_stream_steal_as_bytes = Interop.downcallHandle(
            "g_memory_output_stream_steal_as_bytes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_memory_output_stream_steal_data = Interop.downcallHandle(
            "g_memory_output_stream_steal_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_memory_output_stream_get_type = Interop.downcallHandle(
            "g_memory_output_stream_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
