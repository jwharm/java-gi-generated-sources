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
    
    /**
     * Cast object to Seekable if its GType is a (or inherits from) "GSeekable".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Seekable} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GSeekable", a ClassCastException will be thrown.
     */
    public static Seekable castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), Seekable.getType())) {
            return new SeekableImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GSeekable");
        }
    }
    
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
        return RESULT != 0;
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
        return RESULT != 0;
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
    default boolean seek(long offset, @NotNull org.gtk.glib.SeekType type, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
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
        return RESULT != 0;
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
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
    
    class SeekableImpl extends org.gtk.gobject.Object implements Seekable {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public SeekableImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
