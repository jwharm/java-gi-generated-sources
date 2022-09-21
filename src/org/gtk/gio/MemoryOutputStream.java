package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link MemoryOutputStream} is a class for using arbitrary
 * memory chunks as output for GIO streaming output operations.
 * <p>
 * As of GLib 2.34, {@link MemoryOutputStream} trivially implements
 * {@link PollableOutputStream}: it always polls as ready.
 */
public class MemoryOutputStream extends OutputStream implements PollableOutputStream, Seekable {

    public MemoryOutputStream(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MemoryOutputStream */
    public static MemoryOutputStream castFrom(org.gtk.gobject.Object gobject) {
        return new MemoryOutputStream(gobject.getReference());
    }
    
    private static Reference constructNew(long size, ReallocFunc reallocFunction) {
        try {
            Reference RESULT = References.get(gtk_h.g_memory_output_stream_new(
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(reallocFunction.hashCode(), reallocFunction)), size, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbReallocFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, long.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
                        Interop.getScope()), 
                    Interop.cbDestroyNotifySymbol()), true);
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a new {@link MemoryOutputStream}.
     * <p>
     * In most cases this is not the function you want.  See
     * g_memory_output_stream_new_resizable() instead.
     * <p>
     * If {@code data} is non-<code>null</code>, the stream will use that for its internal storage.
     * <p>
     * If {@code realloc_fn} is non-<code>null</code>, it will be used for resizing the internal
     * storage when necessary and the stream will be considered resizable.
     * In that case, the stream will start out being (conceptually) empty.
     * {@code size} is used only as a hint for how big {@code data} is.  Specifically,
     * seeking to the end of a newly-created stream will seek to zero, not
     * {@code size}.  Seeking past the end of the stream and then writing will
     * introduce a zero-filled gap.
     * <p>
     * If {@code realloc_fn} is <code>null</code> then the stream is fixed-sized.  Seeking to
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
     * is non-<code>null</code> then it makes most sense to give {@code data} as <code>null</code> and
     * {@code size} as 0 (allowing {@link MemoryOutputStream} to do the initial
     * allocation for itself).
     * <p>
     * |[&lt;!-- language="C" --&gt;
     * // a stream that can grow
     * stream = g_memory_output_stream_new (NULL, 0, realloc, free);
     * <p>
     * // another stream that can grow
     * stream2 = g_memory_output_stream_new (NULL, 0, g_realloc, g_free);
     * <p>
     * // a fixed-size stream
     * data = malloc (200);
     * stream3 = g_memory_output_stream_new (data, 200, NULL, free);
     * ]|
     */
    public MemoryOutputStream(long size, ReallocFunc reallocFunction) {
        super(constructNew(size, reallocFunction));
    }
    
    private static Reference constructNewResizable() {
        Reference RESULT = References.get(gtk_h.g_memory_output_stream_new_resizable(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link MemoryOutputStream}, using g_realloc() and g_free()
     * for memory allocation.
     */
    public static MemoryOutputStream newResizable() {
        return new MemoryOutputStream(constructNewResizable());
    }
    
    /**
     * Gets any loaded data from the {@code ostream}.
     * <p>
     * Note that the returned pointer may become invalid on the next
     * write or truncate operation on the stream.
     */
    public jdk.incubator.foreign.MemoryAddress getData() {
        var RESULT = gtk_h.g_memory_output_stream_get_data(handle());
        return RESULT;
    }
    
    /**
     * Returns the number of bytes from the start up to including the last
     * byte written in the stream that has not been truncated away.
     */
    public long getDataSize() {
        var RESULT = gtk_h.g_memory_output_stream_get_data_size(handle());
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
     */
    public long getSize() {
        var RESULT = gtk_h.g_memory_output_stream_get_size(handle());
        return RESULT;
    }
    
    /**
     * Returns data from the {@code ostream} as a {@link org.gtk.glib.Bytes}. {@code ostream} must be
     * closed before calling this function.
     */
    public org.gtk.glib.Bytes stealAsBytes() {
        var RESULT = gtk_h.g_memory_output_stream_steal_as_bytes(handle());
        return new org.gtk.glib.Bytes(References.get(RESULT, true));
    }
    
    /**
     * Gets any loaded data from the {@code ostream}. Ownership of the data
     * is transferred to the caller; when no longer needed it must be
     * freed using the free function set in {@code ostream}'s
     * {@link MemoryOutputStream}:destroy-function property.
     * <p>
     * {@code ostream} must be closed before calling this function.
     */
    public jdk.incubator.foreign.MemoryAddress stealData() {
        var RESULT = gtk_h.g_memory_output_stream_steal_data(handle());
        return RESULT;
    }
    
}
