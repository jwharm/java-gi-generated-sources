package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SeekableImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SeekableImpl(input, ownership);
    
    /**
     * Tests if the stream supports the {@link SeekableIface}.
     * @return {@code true} if {@code seekable} can be seeked. {@code false} otherwise.
     */
    default boolean canSeek() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_seekable_can_seek.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Tests if the length of the stream can be adjusted with
     * g_seekable_truncate().
     * @return {@code true} if the stream can be truncated, {@code false} otherwise.
     */
    default boolean canTruncate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_seekable_can_truncate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
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
     * @param offset a {@code goffset}.
     * @param type a {@link org.gtk.glib.SeekType}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} if successful. If an error
     *     has occurred, this function will return {@code false} and set {@code error}
     *     appropriately if present.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean seek(long offset, org.gtk.glib.SeekType type, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_seekable_seek.invokeExact(
                    handle(),
                    offset,
                    type.getValue(),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Tells the current position within the stream.
     * @return the (positive or zero) offset from the beginning of the
     * buffer, zero if the target is not seekable.
     */
    default long tell() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_seekable_tell.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
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
     * @param offset new length for {@code seekable}, in bytes.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} if successful. If an error
     *     has occurred, this function will return {@code false} and set {@code error}
     *     appropriately if present.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean truncate(long offset, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_seekable_truncate.invokeExact(
                    handle(),
                    offset,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_seekable_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_seekable_can_seek = Interop.downcallHandle(
            "g_seekable_can_seek",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_seekable_can_truncate = Interop.downcallHandle(
            "g_seekable_can_truncate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_seekable_seek = Interop.downcallHandle(
            "g_seekable_seek",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_seekable_tell = Interop.downcallHandle(
            "g_seekable_tell",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_seekable_truncate = Interop.downcallHandle(
            "g_seekable_truncate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_seekable_get_type = Interop.downcallHandle(
            "g_seekable_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class SeekableImpl extends org.gtk.gobject.GObject implements Seekable {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public SeekableImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
