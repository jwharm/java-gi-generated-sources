package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GMemoryOutputStream is a class for using arbitrary
 * memory chunks as output for GIO streaming output operations.
 * 
 * As of GLib 2.34, #GMemoryOutputStream trivially implements
 * #GPollableOutputStream: it always polls as ready.
 */
public class MemoryOutputStream extends OutputStream implements PollableOutputStream, Seekable {

    public MemoryOutputStream(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MemoryOutputStream */
    public static MemoryOutputStream castFrom(org.gtk.gobject.Object gobject) {
        return new MemoryOutputStream(gobject.getReference());
    }
    
    /**
     * Creates a new #GMemoryOutputStream.
     * 
     * In most cases this is not the function you want.  See
     * g_memory_output_stream_new_resizable() instead.
     * 
     * If @data is non-%NULL, the stream will use that for its internal storage.
     * 
     * If @realloc_fn is non-%NULL, it will be used for resizing the internal
     * storage when necessary and the stream will be considered resizable.
     * In that case, the stream will start out being (conceptually) empty.
     * @size is used only as a hint for how big @data is.  Specifically,
     * seeking to the end of a newly-created stream will seek to zero, not
     * @size.  Seeking past the end of the stream and then writing will
     * introduce a zero-filled gap.
     * 
     * If @realloc_fn is %NULL then the stream is fixed-sized.  Seeking to
     * the end will seek to @size exactly.  Writing past the end will give
     * an 'out of space' error.  Attempting to seek past the end will fail.
     * Unlike the resizable case, seeking to an offset within the stream and
     * writing will preserve the bytes passed in as @data before that point
     * and will return them as part of g_memory_output_stream_steal_data().
     * If you intend to seek you should probably therefore ensure that @data
     * is properly initialised.
     * 
     * It is probably only meaningful to provide @data and @size in the case
     * that you want a fixed-sized stream.  Put another way: if @realloc_fn
     * is non-%NULL then it makes most sense to give @data as %NULL and
     * @size as 0 (allowing #GMemoryOutputStream to do the initial
     * allocation for itself).
     * 
     * |[<!-- language="C" -->
     * // a stream that can grow
     * stream = g_memory_output_stream_new (NULL, 0, realloc, free);
     * 
     * // another stream that can grow
     * stream2 = g_memory_output_stream_new (NULL, 0, g_realloc, g_free);
     * 
     * // a fixed-size stream
     * data = malloc (200);
     * stream3 = g_memory_output_stream_new (data, 200, NULL, free);
     * ]|
     */
    public MemoryOutputStream(jdk.incubator.foreign.MemoryAddress data, long size, ReallocFunc reallocFunction, org.gtk.glib.DestroyNotify destroyFunction) {
        super(References.get(gtk_h.g_memory_output_stream_new(data, size, reallocFunction, destroyFunction), true));
    }
    
    /**
     * Creates a new #GMemoryOutputStream, using g_realloc() and g_free()
     * for memory allocation.
     */
    public static MemoryOutputStream newResizable() {
        return new MemoryOutputStream(References.get(gtk_h.g_memory_output_stream_new_resizable(), true));
    }
    
    /**
     * Gets any loaded data from the @ostream.
     * 
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
     * 
     * You probably don't want to use this function on resizable streams.
     * See g_memory_output_stream_get_data_size() instead.  For resizable
     * streams the size returned by this function is an implementation
     * detail and may be change at any time in response to operations on the
     * stream.
     * 
     * If the stream is fixed-sized (ie: no realloc was passed to
     * g_memory_output_stream_new()) then this is the maximum size of the
     * stream and further writes will return %G_IO_ERROR_NO_SPACE.
     * 
     * In any case, if you want the number of bytes currently written to the
     * stream, use g_memory_output_stream_get_data_size().
     */
    public long getSize() {
        var RESULT = gtk_h.g_memory_output_stream_get_size(handle());
        return RESULT;
    }
    
    /**
     * Returns data from the @ostream as a #GBytes. @ostream must be
     * closed before calling this function.
     */
    public org.gtk.glib.Bytes stealAsBytes() {
        var RESULT = gtk_h.g_memory_output_stream_steal_as_bytes(handle());
        return new org.gtk.glib.Bytes(References.get(RESULT, true));
    }
    
    /**
     * Gets any loaded data from the @ostream. Ownership of the data
     * is transferred to the caller; when no longer needed it must be
     * freed using the free function set in @ostream's
     * #GMemoryOutputStream:destroy-function property.
     * 
     * @ostream must be closed before calling this function.
     */
    public jdk.incubator.foreign.MemoryAddress stealData() {
        var RESULT = gtk_h.g_memory_output_stream_steal_data(handle());
        return RESULT;
    }
    
}
