package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link MemoryOutputStream} is a class for using arbitrary
 * memory chunks as output for GIO streaming output operations.
 * <p>
 * As of GLib 2.34, {@link MemoryOutputStream} trivially implements
 * {@link PollableOutputStream}: it always polls as ready.
 */
public class MemoryOutputStream extends OutputStream implements PollableOutputStream, Seekable {

    public MemoryOutputStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MemoryOutputStream */
    public static MemoryOutputStream castFrom(org.gtk.gobject.Object gobject) {
        return new MemoryOutputStream(gobject.refcounted());
    }
    
    static final MethodHandle g_memory_output_stream_new = Interop.downcallHandle(
        "g_memory_output_stream_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(long size, ReallocFunc reallocFunction) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_memory_output_stream_new.invokeExact(
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(reallocFunction.hashCode(), reallocFunction)), size, 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbReallocFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, long.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
                        Interop.getScope()), 
                    Interop.cbDestroyNotifySymbol()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * <p>
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
     */
    public MemoryOutputStream(long size, ReallocFunc reallocFunction) {
        super(constructNew(size, reallocFunction));
    }
    
    static final MethodHandle g_memory_output_stream_new_resizable = Interop.downcallHandle(
        "g_memory_output_stream_new_resizable",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewResizable() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_memory_output_stream_new_resizable.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link MemoryOutputStream}, using g_realloc() and g_free()
     * for memory allocation.
     */
    public static MemoryOutputStream newResizable() {
        return new MemoryOutputStream(constructNewResizable());
    }
    
    static final MethodHandle g_memory_output_stream_get_data = Interop.downcallHandle(
        "g_memory_output_stream_get_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets any loaded data from the {@code ostream}.
     * <p>
     * Note that the returned pointer may become invalid on the next
     * write or truncate operation on the stream.
     */
    public java.lang.foreign.MemoryAddress getData() {
        try {
            var RESULT = (MemoryAddress) g_memory_output_stream_get_data.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_memory_output_stream_get_data_size = Interop.downcallHandle(
        "g_memory_output_stream_get_data_size",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the number of bytes from the start up to including the last
     * byte written in the stream that has not been truncated away.
     */
    public long getDataSize() {
        try {
            var RESULT = (long) g_memory_output_stream_get_data_size.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_memory_output_stream_get_size = Interop.downcallHandle(
        "g_memory_output_stream_get_size",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
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
     */
    public long getSize() {
        try {
            var RESULT = (long) g_memory_output_stream_get_size.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_memory_output_stream_steal_as_bytes = Interop.downcallHandle(
        "g_memory_output_stream_steal_as_bytes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns data from the {@code ostream} as a {@link org.gtk.glib.Bytes}. {@code ostream} must be
     * closed before calling this function.
     */
    public org.gtk.glib.Bytes stealAsBytes() {
        try {
            var RESULT = (MemoryAddress) g_memory_output_stream_steal_as_bytes.invokeExact(handle());
            return new org.gtk.glib.Bytes(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_memory_output_stream_steal_data = Interop.downcallHandle(
        "g_memory_output_stream_steal_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets any loaded data from the {@code ostream}. Ownership of the data
     * is transferred to the caller; when no longer needed it must be
     * freed using the free function set in {@code ostream}'s
     * {@link MemoryOutputStream}:destroy-function property.
     * <p>
     * {@code ostream} must be closed before calling this function.
     */
    public java.lang.foreign.MemoryAddress stealData() {
        try {
            var RESULT = (MemoryAddress) g_memory_output_stream_steal_data.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
