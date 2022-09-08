package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GSeekable is implemented by streams (implementations of
 * #GInputStream or #GOutputStream) that support seeking.
 * 
 * Seekable streams largely fall into two categories: resizable and
 * fixed-size.
 * 
 * #GSeekable on fixed-sized streams is approximately the same as POSIX
 * lseek() on a block device (for example: attempting to seek past the
 * end of the device is an error).  Fixed streams typically cannot be
 * truncated.
 * 
 * #GSeekable on resizable streams is approximately the same as POSIX
 * lseek() on a normal file.  Seeking past the end and writing data will
 * usually cause the stream to resize by introducing zero bytes.
 */
public interface Seekable extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Tests if the stream supports the #GSeekableIface.
     */
    public default boolean canSeek() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_seekable_can_seek(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Tests if the length of the stream can be adjusted with
     * g_seekable_truncate().
     */
    public default boolean canTruncate() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_seekable_can_truncate(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Seeks in the stream by the given @offset, modified by @type.
     * 
     * Attempting to seek past the end of the stream will have different
     * results depending on if the stream is fixed-sized or resizable.  If
     * the stream is resizable then seeking past the end and then writing
     * will result in zeros filling the empty space.  Seeking past the end
     * of a resizable stream and reading will result in EOF.  Seeking past
     * the end of a fixed-sized stream will fail.
     * 
     * Any operation that would result in a negative offset will fail.
     * 
     * If @cancellable is not %NULL, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     */
    public default boolean seek(long offset, org.gtk.glib.SeekType type, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_seekable_seek(HANDLE(), offset, type.getValue(), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Tells the current position within the stream.
     */
    public default long tell() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_seekable_tell(HANDLE());
        return RESULT;
    }
    
    /**
     * Sets the length of the stream to @offset. If the stream was previously
     * larger than @offset, the extra data is discarded. If the stream was
     * previously shorter than @offset, it is extended with NUL ('\\0') bytes.
     * 
     * If @cancellable is not %NULL, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned. If an
     * operation was partially finished when the operation was cancelled the
     * partial result will be returned, without an error.
     */
    public default boolean truncate(long offset, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_seekable_truncate(HANDLE(), offset, cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    class SeekableImpl extends org.gtk.gobject.Object implements Seekable {
        public SeekableImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
