package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data output stream implements {@link OutputStream} and includes functions for
 * writing data directly to an output stream.
 */
public class DataOutputStream extends FilterOutputStream implements Seekable {

    public DataOutputStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DataOutputStream */
    public static DataOutputStream castFrom(org.gtk.gobject.Object gobject) {
        return new DataOutputStream(gobject.refcounted());
    }
    
    private static final MethodHandle g_data_output_stream_new = Interop.downcallHandle(
        "g_data_output_stream_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull OutputStream baseStream) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_data_output_stream_new.invokeExact(baseStream.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new data output stream for {@code base_stream}.
     */
    public DataOutputStream(@NotNull OutputStream baseStream) {
        super(constructNew(baseStream));
    }
    
    private static final MethodHandle g_data_output_stream_get_byte_order = Interop.downcallHandle(
        "g_data_output_stream_get_byte_order",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the byte order for the stream.
     */
    public @NotNull DataStreamByteOrder getByteOrder() {
        int RESULT;
        try {
            RESULT = (int) g_data_output_stream_get_byte_order.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DataStreamByteOrder(RESULT);
    }
    
    private static final MethodHandle g_data_output_stream_put_byte = Interop.downcallHandle(
        "g_data_output_stream_put_byte",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Puts a byte into the output stream.
     */
    public boolean putByte(@NotNull byte data, @Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_data_output_stream_put_byte.invokeExact(handle(), data, cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_data_output_stream_put_int16 = Interop.downcallHandle(
        "g_data_output_stream_put_int16",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Puts a signed 16-bit integer into the output stream.
     */
    public boolean putInt16(@NotNull short data, @Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_data_output_stream_put_int16.invokeExact(handle(), data, cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_data_output_stream_put_int32 = Interop.downcallHandle(
        "g_data_output_stream_put_int32",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Puts a signed 32-bit integer into the output stream.
     */
    public boolean putInt32(@NotNull int data, @Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_data_output_stream_put_int32.invokeExact(handle(), data, cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_data_output_stream_put_int64 = Interop.downcallHandle(
        "g_data_output_stream_put_int64",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Puts a signed 64-bit integer into the stream.
     */
    public boolean putInt64(@NotNull long data, @Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_data_output_stream_put_int64.invokeExact(handle(), data, cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_data_output_stream_put_string = Interop.downcallHandle(
        "g_data_output_stream_put_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Puts a string into the output stream.
     */
    public boolean putString(@NotNull java.lang.String str, @Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_data_output_stream_put_string.invokeExact(handle(), Interop.allocateNativeString(str), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_data_output_stream_put_uint16 = Interop.downcallHandle(
        "g_data_output_stream_put_uint16",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Puts an unsigned 16-bit integer into the output stream.
     */
    public boolean putUint16(@NotNull short data, @Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_data_output_stream_put_uint16.invokeExact(handle(), data, cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_data_output_stream_put_uint32 = Interop.downcallHandle(
        "g_data_output_stream_put_uint32",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Puts an unsigned 32-bit integer into the stream.
     */
    public boolean putUint32(@NotNull int data, @Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_data_output_stream_put_uint32.invokeExact(handle(), data, cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_data_output_stream_put_uint64 = Interop.downcallHandle(
        "g_data_output_stream_put_uint64",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Puts an unsigned 64-bit integer into the stream.
     */
    public boolean putUint64(@NotNull long data, @Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_data_output_stream_put_uint64.invokeExact(handle(), data, cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_data_output_stream_set_byte_order = Interop.downcallHandle(
        "g_data_output_stream_set_byte_order",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the byte order of the data output stream to {@code order}.
     */
    public @NotNull void setByteOrder(@NotNull DataStreamByteOrder order) {
        try {
            g_data_output_stream_set_byte_order.invokeExact(handle(), order.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
