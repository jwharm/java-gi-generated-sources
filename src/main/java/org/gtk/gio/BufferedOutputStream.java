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
public class BufferedOutputStream extends org.gtk.gio.FilterOutputStream implements org.gtk.gio.Seekable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GBufferedOutputStream";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.FilterOutputStream.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gio.FilterOutputStream parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gio.FilterOutputStream(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public BufferedOutputStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to BufferedOutputStream if its GType is a (or inherits from) "GBufferedOutputStream".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "BufferedOutputStream" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GBufferedOutputStream", a ClassCastException will be thrown.
     */
    public static BufferedOutputStream castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GBufferedOutputStream"))) {
            return new BufferedOutputStream(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GBufferedOutputStream");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gio.OutputStream baseStream) {
        java.util.Objects.requireNonNull(baseStream, "Parameter 'baseStream' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_buffered_output_stream_new.invokeExact(
                    baseStream.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new buffered output stream for a base stream.
     * @param baseStream a {@link OutputStream}.
     */
    public BufferedOutputStream(@NotNull org.gtk.gio.OutputStream baseStream) {
        super(constructNew(baseStream));
    }
    
    private static Refcounted constructNewSized(@NotNull org.gtk.gio.OutputStream baseStream, long size) {
        java.util.Objects.requireNonNull(baseStream, "Parameter 'baseStream' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_buffered_output_stream_new_sized.invokeExact(
                    baseStream.handle(),
                    size), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new buffered output stream with a given buffer size.
     * @param baseStream a {@link OutputStream}.
     * @param size a {@code gsize}.
     * @return a {@link OutputStream} with an internal buffer set to {@code size}.
     */
    public static BufferedOutputStream newSized(@NotNull org.gtk.gio.OutputStream baseStream, long size) {
        return new BufferedOutputStream(constructNewSized(baseStream, size));
    }
    
    /**
     * Checks if the buffer automatically grows as data is added.
     * @return {@code true} if the {@code stream}'s buffer automatically grows,
     * {@code false} otherwise.
     */
    public boolean getAutoGrow() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_buffered_output_stream_get_auto_grow.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the size of the buffer in the {@code stream}.
     * @return the current size of the buffer.
     */
    public long getBufferSize() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_buffered_output_stream_get_buffer_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets whether or not the {@code stream}'s buffer should automatically grow.
     * If {@code auto_grow} is true, then each write will just make the buffer
     * larger, and you must manually flush the buffer to actually write out
     * the data to the underlying stream.
     * @param autoGrow a {@code gboolean}.
     */
    public void setAutoGrow(boolean autoGrow) {
        try {
            DowncallHandles.g_buffered_output_stream_set_auto_grow.invokeExact(
                    handle(),
                    autoGrow ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the size of the internal buffer to {@code size}.
     * @param size a {@code gsize}.
     */
    public void setBufferSize(long size) {
        try {
            DowncallHandles.g_buffered_output_stream_set_buffer_size.invokeExact(
                    handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_buffered_output_stream_new = Interop.downcallHandle(
            "g_buffered_output_stream_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_buffered_output_stream_new_sized = Interop.downcallHandle(
            "g_buffered_output_stream_new_sized",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle g_buffered_output_stream_get_auto_grow = Interop.downcallHandle(
            "g_buffered_output_stream_get_auto_grow",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_buffered_output_stream_get_buffer_size = Interop.downcallHandle(
            "g_buffered_output_stream_get_buffer_size",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_buffered_output_stream_set_auto_grow = Interop.downcallHandle(
            "g_buffered_output_stream_set_auto_grow",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_buffered_output_stream_set_buffer_size = Interop.downcallHandle(
            "g_buffered_output_stream_set_buffer_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
    }
}
