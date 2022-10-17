package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Buffered output stream implements {@link FilterOutputStream} and provides
 * for buffered writes.
 * <p>
 * By default, {@link BufferedOutputStream}'s buffer size is set at 4 kilobytes.
 * <p>
 * To create a buffered output stream, use g_buffered_output_stream_new(),
 * or g_buffered_output_stream_new_sized() to specify the buffer's size
 * at construction.
 * <p>
 * To get the size of a buffer within a buffered input stream, use
 * g_buffered_output_stream_get_buffer_size(). To change the size of a
 * buffered output stream's buffer, use
 * g_buffered_output_stream_set_buffer_size(). Note that the buffer's
 * size cannot be reduced below the size of the data within the buffer.
 */
public class BufferedOutputStream extends FilterOutputStream implements Seekable {

    public BufferedOutputStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to BufferedOutputStream */
    public static BufferedOutputStream castFrom(org.gtk.gobject.Object gobject) {
        return new BufferedOutputStream(gobject.refcounted());
    }
    
    private static final MethodHandle g_buffered_output_stream_new = Interop.downcallHandle(
        "g_buffered_output_stream_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull OutputStream baseStream) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_buffered_output_stream_new.invokeExact(baseStream.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new buffered output stream for a base stream.
     */
    public BufferedOutputStream(@NotNull OutputStream baseStream) {
        super(constructNew(baseStream));
    }
    
    private static final MethodHandle g_buffered_output_stream_new_sized = Interop.downcallHandle(
        "g_buffered_output_stream_new_sized",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNewSized(@NotNull OutputStream baseStream, @NotNull long size) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_buffered_output_stream_new_sized.invokeExact(baseStream.handle(), size), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new buffered output stream with a given buffer size.
     */
    public static BufferedOutputStream newSized(@NotNull OutputStream baseStream, @NotNull long size) {
        return new BufferedOutputStream(constructNewSized(baseStream, size));
    }
    
    private static final MethodHandle g_buffered_output_stream_get_auto_grow = Interop.downcallHandle(
        "g_buffered_output_stream_get_auto_grow",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the buffer automatically grows as data is added.
     */
    public boolean getAutoGrow() {
        int RESULT;
        try {
            RESULT = (int) g_buffered_output_stream_get_auto_grow.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_buffered_output_stream_get_buffer_size = Interop.downcallHandle(
        "g_buffered_output_stream_get_buffer_size",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the size of the buffer in the {@code stream}.
     */
    public long getBufferSize() {
        long RESULT;
        try {
            RESULT = (long) g_buffered_output_stream_get_buffer_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_buffered_output_stream_set_auto_grow = Interop.downcallHandle(
        "g_buffered_output_stream_set_auto_grow",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether or not the {@code stream}'s buffer should automatically grow.
     * If {@code auto_grow} is true, then each write will just make the buffer
     * larger, and you must manually flush the buffer to actually write out
     * the data to the underlying stream.
     */
    public @NotNull void setAutoGrow(@NotNull boolean autoGrow) {
        try {
            g_buffered_output_stream_set_auto_grow.invokeExact(handle(), autoGrow ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_buffered_output_stream_set_buffer_size = Interop.downcallHandle(
        "g_buffered_output_stream_set_buffer_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Sets the size of the internal buffer to {@code size}.
     */
    public @NotNull void setBufferSize(@NotNull long size) {
        try {
            g_buffered_output_stream_set_buffer_size.invokeExact(handle(), size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
