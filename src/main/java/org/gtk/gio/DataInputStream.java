package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data input stream implements {@link InputStream} and includes functions for
 * reading structured data directly from a binary input stream.
 */
public class DataInputStream extends BufferedInputStream implements Seekable {

    public DataInputStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DataInputStream */
    public static DataInputStream castFrom(org.gtk.gobject.Object gobject) {
        return new DataInputStream(gobject.refcounted());
    }
    
    private static final MethodHandle g_data_input_stream_new = Interop.downcallHandle(
        "g_data_input_stream_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull InputStream baseStream) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_data_input_stream_new.invokeExact(baseStream.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new data input stream for the {@code base_stream}.
     */
    public DataInputStream(@NotNull InputStream baseStream) {
        super(constructNew(baseStream));
    }
    
    private static final MethodHandle g_data_input_stream_get_byte_order = Interop.downcallHandle(
        "g_data_input_stream_get_byte_order",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the byte order for the data input stream.
     */
    public @NotNull DataStreamByteOrder getByteOrder() {
        int RESULT;
        try {
            RESULT = (int) g_data_input_stream_get_byte_order.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DataStreamByteOrder(RESULT);
    }
    
    private static final MethodHandle g_data_input_stream_get_newline_type = Interop.downcallHandle(
        "g_data_input_stream_get_newline_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current newline type for the {@code stream}.
     */
    public @NotNull DataStreamNewlineType getNewlineType() {
        int RESULT;
        try {
            RESULT = (int) g_data_input_stream_get_newline_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DataStreamNewlineType(RESULT);
    }
    
    private static final MethodHandle g_data_input_stream_read_byte = Interop.downcallHandle(
        "g_data_input_stream_read_byte",
        FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads an unsigned 8-bit/1-byte value from {@code stream}.
     */
    public byte readByte(@Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        byte RESULT;
        try {
            RESULT = (byte) g_data_input_stream_read_byte.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_data_input_stream_read_int16 = Interop.downcallHandle(
        "g_data_input_stream_read_int16",
        FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads a 16-bit/2-byte value from {@code stream}.
     * <p>
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     */
    public short readInt16(@Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        short RESULT;
        try {
            RESULT = (short) g_data_input_stream_read_int16.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_data_input_stream_read_int32 = Interop.downcallHandle(
        "g_data_input_stream_read_int32",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads a signed 32-bit/4-byte value from {@code stream}.
     * <p>
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public int readInt32(@Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_data_input_stream_read_int32.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_data_input_stream_read_int64 = Interop.downcallHandle(
        "g_data_input_stream_read_int64",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads a 64-bit/8-byte value from {@code stream}.
     * <p>
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public long readInt64(@Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) g_data_input_stream_read_int64.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_data_input_stream_read_line = Interop.downcallHandle(
        "g_data_input_stream_read_line",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads a line from the data input stream.  Note that no encoding
     * checks or conversion is performed; the input is not guaranteed to
     * be UTF-8, and may in fact have embedded NUL characters.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public PointerByte readLine(@NotNull Out<Long> length, @Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_data_input_stream_read_line.invokeExact(handle(), (Addressable) lengthPOINTER.address(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new PointerByte(RESULT);
    }
    
    private static final MethodHandle g_data_input_stream_read_line_async = Interop.downcallHandle(
        "g_data_input_stream_read_line_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * The asynchronous version of g_data_input_stream_read_line().  It is
     * an error to have two outstanding calls to this function.
     * <p>
     * When the operation is finished, {@code callback} will be called. You
     * can then call g_data_input_stream_read_line_finish() to get
     * the result of the operation.
     */
    public @NotNull void readLineAsync(@NotNull int ioPriority, @Nullable Cancellable cancellable, @Nullable AsyncReadyCallback callback) {
        try {
            g_data_input_stream_read_line_async.invokeExact(handle(), ioPriority, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_data_input_stream_read_line_finish = Interop.downcallHandle(
        "g_data_input_stream_read_line_finish",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finish an asynchronous call started by
     * g_data_input_stream_read_line_async().  Note the warning about
     * string encoding in g_data_input_stream_read_line() applies here as
     * well.
     */
    public PointerByte readLineFinish(@NotNull AsyncResult result, @NotNull Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_data_input_stream_read_line_finish.invokeExact(handle(), result.handle(), (Addressable) lengthPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new PointerByte(RESULT);
    }
    
    private static final MethodHandle g_data_input_stream_read_line_finish_utf8 = Interop.downcallHandle(
        "g_data_input_stream_read_line_finish_utf8",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finish an asynchronous call started by
     * g_data_input_stream_read_line_async().
     */
    public @Nullable java.lang.String readLineFinishUtf8(@NotNull AsyncResult result, @NotNull Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_data_input_stream_read_line_finish_utf8.invokeExact(handle(), result.handle(), (Addressable) lengthPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_data_input_stream_read_line_utf8 = Interop.downcallHandle(
        "g_data_input_stream_read_line_utf8",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads a UTF-8 encoded line from the data input stream.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public @Nullable java.lang.String readLineUtf8(@NotNull Out<Long> length, @Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_data_input_stream_read_line_utf8.invokeExact(handle(), (Addressable) lengthPOINTER.address(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_data_input_stream_read_uint16 = Interop.downcallHandle(
        "g_data_input_stream_read_uint16",
        FunctionDescriptor.of(ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads an unsigned 16-bit/2-byte value from {@code stream}.
     * <p>
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     */
    public short readUint16(@Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        short RESULT;
        try {
            RESULT = (short) g_data_input_stream_read_uint16.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_data_input_stream_read_uint32 = Interop.downcallHandle(
        "g_data_input_stream_read_uint32",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads an unsigned 32-bit/4-byte value from {@code stream}.
     * <p>
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public int readUint32(@Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_data_input_stream_read_uint32.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_data_input_stream_read_uint64 = Interop.downcallHandle(
        "g_data_input_stream_read_uint64",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads an unsigned 64-bit/8-byte value from {@code stream}.
     * <p>
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order().
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public long readUint64(@Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) g_data_input_stream_read_uint64.invokeExact(handle(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_data_input_stream_read_upto = Interop.downcallHandle(
        "g_data_input_stream_read_upto",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads a string from the data input stream, up to the first
     * occurrence of any of the stop characters.
     * <p>
     * In contrast to g_data_input_stream_read_until(), this function
     * does not consume the stop character. You have to use
     * g_data_input_stream_read_byte() to get it before calling
     * g_data_input_stream_read_upto() again.
     * <p>
     * Note that {@code stop_chars} may contain '\\0' if {@code stop_chars_len} is
     * specified.
     * <p>
     * The returned string will always be nul-terminated on success.
     */
    public @NotNull java.lang.String readUpto(@NotNull java.lang.String stopChars, @NotNull long stopCharsLen, @NotNull Out<Long> length, @Nullable Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_data_input_stream_read_upto.invokeExact(handle(), Interop.allocateNativeString(stopChars), stopCharsLen, (Addressable) lengthPOINTER.address(), cancellable.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_data_input_stream_read_upto_async = Interop.downcallHandle(
        "g_data_input_stream_read_upto_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * The asynchronous version of g_data_input_stream_read_upto().
     * It is an error to have two outstanding calls to this function.
     * <p>
     * In contrast to g_data_input_stream_read_until(), this function
     * does not consume the stop character. You have to use
     * g_data_input_stream_read_byte() to get it before calling
     * g_data_input_stream_read_upto() again.
     * <p>
     * Note that {@code stop_chars} may contain '\\0' if {@code stop_chars_len} is
     * specified.
     * <p>
     * When the operation is finished, {@code callback} will be called. You
     * can then call g_data_input_stream_read_upto_finish() to get
     * the result of the operation.
     */
    public @NotNull void readUptoAsync(@NotNull java.lang.String stopChars, @NotNull long stopCharsLen, @NotNull int ioPriority, @Nullable Cancellable cancellable, @Nullable AsyncReadyCallback callback) {
        try {
            g_data_input_stream_read_upto_async.invokeExact(handle(), Interop.allocateNativeString(stopChars), stopCharsLen, ioPriority, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_data_input_stream_read_upto_finish = Interop.downcallHandle(
        "g_data_input_stream_read_upto_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finish an asynchronous call started by
     * g_data_input_stream_read_upto_async().
     * <p>
     * Note that this function does not consume the stop character. You
     * have to use g_data_input_stream_read_byte() to get it before calling
     * g_data_input_stream_read_upto_async() again.
     * <p>
     * The returned string will always be nul-terminated on success.
     */
    public @NotNull java.lang.String readUptoFinish(@NotNull AsyncResult result, @NotNull Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_data_input_stream_read_upto_finish.invokeExact(handle(), result.handle(), (Addressable) lengthPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_data_input_stream_set_byte_order = Interop.downcallHandle(
        "g_data_input_stream_set_byte_order",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * This function sets the byte order for the given {@code stream}. All subsequent
     * reads from the {@code stream} will be read in the given {@code order}.
     */
    public @NotNull void setByteOrder(@NotNull DataStreamByteOrder order) {
        try {
            g_data_input_stream_set_byte_order.invokeExact(handle(), order.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_data_input_stream_set_newline_type = Interop.downcallHandle(
        "g_data_input_stream_set_newline_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the newline type for the {@code stream}.
     * <p>
     * Note that using G_DATA_STREAM_NEWLINE_TYPE_ANY is slightly unsafe. If a read
     * chunk ends in "CR" we must read an additional byte to know if this is "CR" or
     * "CR LF", and this might block if there is no more data available.
     */
    public @NotNull void setNewlineType(@NotNull DataStreamNewlineType type) {
        try {
            g_data_input_stream_set_newline_type.invokeExact(handle(), type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
