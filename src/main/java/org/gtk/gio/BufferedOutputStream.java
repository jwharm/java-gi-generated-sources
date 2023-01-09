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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.FilterOutputStream.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a BufferedOutputStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected BufferedOutputStream(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, BufferedOutputStream> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new BufferedOutputStream(input);
    
    private static MemoryAddress constructNew(org.gtk.gio.OutputStream baseStream) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_buffered_output_stream_new.invokeExact(baseStream.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new buffered output stream for a base stream.
     * @param baseStream a {@link OutputStream}.
     */
    public BufferedOutputStream(org.gtk.gio.OutputStream baseStream) {
        super(constructNew(baseStream));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewSized(org.gtk.gio.OutputStream baseStream, long size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_buffered_output_stream_new_sized.invokeExact(
                    baseStream.handle(),
                    size);
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
    public static BufferedOutputStream newSized(org.gtk.gio.OutputStream baseStream, long size) {
        var RESULT = constructNewSized(baseStream, size);
        var OBJECT = (org.gtk.gio.BufferedOutputStream) Interop.register(RESULT, org.gtk.gio.BufferedOutputStream.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Checks if the buffer automatically grows as data is added.
     * @return {@code true} if the {@code stream}'s buffer automatically grows,
     * {@code false} otherwise.
     */
    public boolean getAutoGrow() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_buffered_output_stream_get_auto_grow.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the size of the buffer in the {@code stream}.
     * @return the current size of the buffer.
     */
    public long getBufferSize() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_buffered_output_stream_get_buffer_size.invokeExact(handle());
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
                    Marshal.booleanToInteger.marshal(autoGrow, null).intValue());
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_buffered_output_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link BufferedOutputStream.Builder} object constructs a {@link BufferedOutputStream} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link BufferedOutputStream.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.FilterOutputStream.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link BufferedOutputStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link BufferedOutputStream}.
         * @return A new instance of {@code BufferedOutputStream} with the properties 
         *         that were set in the Builder object.
         */
        public BufferedOutputStream build() {
            return (BufferedOutputStream) org.gtk.gobject.GObject.newWithProperties(
                BufferedOutputStream.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setAutoGrow(boolean autoGrow) {
            names.add("auto-grow");
            values.add(org.gtk.gobject.Value.create(autoGrow));
            return this;
        }
        
        public Builder setBufferSize(int bufferSize) {
            names.add("buffer-size");
            values.add(org.gtk.gobject.Value.create(bufferSize));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_buffered_output_stream_new = Interop.downcallHandle(
                "g_buffered_output_stream_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_buffered_output_stream_new_sized = Interop.downcallHandle(
                "g_buffered_output_stream_new_sized",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_buffered_output_stream_get_auto_grow = Interop.downcallHandle(
                "g_buffered_output_stream_get_auto_grow",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_buffered_output_stream_get_buffer_size = Interop.downcallHandle(
                "g_buffered_output_stream_get_buffer_size",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_buffered_output_stream_set_auto_grow = Interop.downcallHandle(
                "g_buffered_output_stream_set_auto_grow",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_buffered_output_stream_set_buffer_size = Interop.downcallHandle(
                "g_buffered_output_stream_set_buffer_size",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_buffered_output_stream_get_type = Interop.downcallHandle(
                "g_buffered_output_stream_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_buffered_output_stream_get_type != null;
    }
}
