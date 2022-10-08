package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link Seekable} is implemented by streams (implementations of
 * {@link InputStream} or {@link OutputStream}) that support seeking.
 * <p>
 * Seekable streams largely fall into two categories: resizable and
 * fixed-size.
 * <p>
 * {@link Seekable} on fixed-sized streams is approximately the same as POSIX
 * lseek() on a block device (for example: attempting to seek past the
 * end of the device is an error).  Fixed streams typically cannot be
 * truncated.
 * <p>
 * {@link Seekable} on resizable streams is approximately the same as POSIX
 * lseek() on a normal file.  Seeking past the end and writing data will
 * usually cause the stream to resize by introducing zero bytes.
 */
public interface Seekable extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle g_seekable_can_seek = Interop.downcallHandle(
        "g_seekable_can_seek",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests if the stream supports the {@link SeekableIface}.
     */
    public default boolean canSeek() {
        try {
            var RESULT = (int) g_seekable_can_seek.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_seekable_can_truncate = Interop.downcallHandle(
        "g_seekable_can_truncate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests if the length of the stream can be adjusted with
     * g_seekable_truncate().
     */
    public default boolean canTruncate() {
        try {
            var RESULT = (int) g_seekable_can_truncate.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_seekable_seek = Interop.downcallHandle(
        "g_seekable_seek",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Seeks in the stream by the given {@code offset}, modified by {@code type}.
     * <p>
     * Attempting to seek past the end of the stream will have different
     * results depending on if the stream is fixed-sized or resizable.  If
     * the stream is resizable then seeking past the end and then writing
     * will result in zeros filling the empty space.  Seeking past the end
     * of a resizable stream and reading will result in EOF.  Seeking past
     * the end of a fixed-sized stream will fail.
     * <p>
     * Any operation that would result in a negative offset will fail.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public default boolean seek(long offset, org.gtk.glib.SeekType type, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_seekable_seek.invokeExact(handle(), offset, type.getValue(), cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_seekable_tell = Interop.downcallHandle(
        "g_seekable_tell",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Tells the current position within the stream.
     */
    public default long tell() {
        try {
            var RESULT = (long) g_seekable_tell.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_seekable_truncate = Interop.downcallHandle(
        "g_seekable_truncate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the length of the stream to {@code offset}. If the stream was previously
     * larger than {@code offset}, the extra data is discarded. If the stream was
     * previously shorter than {@code offset}, it is extended with NUL ('\\0') bytes.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned. If an
     * operation was partially finished when the operation was cancelled the
     * partial result will be returned, without an error.
     */
    public default boolean truncate(long offset, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_seekable_truncate.invokeExact(handle(), offset, cancellable.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    class SeekableImpl extends org.gtk.gobject.Object implements Seekable {
        public SeekableImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
