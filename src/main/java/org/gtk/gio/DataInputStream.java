package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data input stream implements {@link InputStream} and includes functions for
 * reading structured data directly from a binary input stream.
 */
public class DataInputStream extends org.gtk.gio.BufferedInputStream implements org.gtk.gio.Seekable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDataInputStream";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.BufferedInputStream.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a DataInputStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DataInputStream(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DataInputStream> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DataInputStream(input);
    
    private static MemoryAddress constructNew(org.gtk.gio.InputStream baseStream) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_data_input_stream_new.invokeExact(baseStream.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new data input stream for the {@code base_stream}.
     * @param baseStream a {@link InputStream}.
     */
    public DataInputStream(org.gtk.gio.InputStream baseStream) {
        super(constructNew(baseStream));
        this.takeOwnership();
    }
    
    /**
     * Gets the byte order for the data input stream.
     * @return the {@code stream}'s current {@link DataStreamByteOrder}.
     */
    public org.gtk.gio.DataStreamByteOrder getByteOrder() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_data_input_stream_get_byte_order.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.DataStreamByteOrder.of(RESULT);
    }
    
    /**
     * Gets the current newline type for the {@code stream}.
     * @return {@link DataStreamNewlineType} for the given {@code stream}.
     */
    public org.gtk.gio.DataStreamNewlineType getNewlineType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_data_input_stream_get_newline_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.DataStreamNewlineType.of(RESULT);
    }
    
    /**
     * Reads an unsigned 8-bit/1-byte value from {@code stream}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return an unsigned 8-bit/1-byte value read from the {@code stream} or {@code 0}
     * if an error occurred.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public byte readByte(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            byte RESULT;
            try {
                RESULT = (byte) DowncallHandles.g_data_input_stream_read_byte.invokeExact(
                        handle(),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * Reads a 16-bit/2-byte value from {@code stream}.
     * <p>
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return a signed 16-bit/2-byte value read from {@code stream} or {@code 0} if
     * an error occurred.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public short readInt16(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            short RESULT;
            try {
                RESULT = (short) DowncallHandles.g_data_input_stream_read_int16.invokeExact(
                        handle(),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * Reads a signed 32-bit/4-byte value from {@code stream}.
     * <p>
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return a signed 32-bit/4-byte value read from the {@code stream} or {@code 0} if
     * an error occurred.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public int readInt32(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_data_input_stream_read_int32.invokeExact(
                        handle(),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * Reads a 64-bit/8-byte value from {@code stream}.
     * <p>
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return a signed 64-bit/8-byte value read from {@code stream} or {@code 0} if
     * an error occurred.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long readInt64(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_data_input_stream_read_int64.invokeExact(
                        handle(),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * Reads a line from the data input stream.  Note that no encoding
     * checks or conversion is performed; the input is not guaranteed to
     * be UTF-8, and may in fact have embedded NUL characters.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param length a {@code gsize} to get the length of the data read in.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return a NUL terminated byte array with the line that was read in
     *  (without the newlines).  Set {@code length} to a {@code gsize} to get the length
     *  of the read line.  On an error, it will return {@code null} and {@code error}
     *  will be set. If there's no content to read, it will still return
     *  {@code null}, but {@code error} won't be set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public PointerByte readLine(Out<Long> length, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_data_input_stream_read_line.invokeExact(
                        handle(),
                        (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return new PointerByte(RESULT);
        }
    }
    
    /**
     * The asynchronous version of g_data_input_stream_read_line().  It is
     * an error to have two outstanding calls to this function.
     * <p>
     * When the operation is finished, {@code callback} will be called. You
     * can then call g_data_input_stream_read_line_finish() to get
     * the result of the operation.
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback callback to call when the request is satisfied.
     */
    public void readLineAsync(int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.g_data_input_stream_read_line_async.invokeExact(
                    handle(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finish an asynchronous call started by
     * g_data_input_stream_read_line_async().  Note the warning about
     * string encoding in g_data_input_stream_read_line() applies here as
     * well.
     * @param result the {@link AsyncResult} that was provided to the callback.
     * @param length a {@code gsize} to get the length of the data read in.
     * @return a NUL-terminated byte array with the line that was read in
     *  (without the newlines).  Set {@code length} to a {@code gsize} to get the length
     *  of the read line.  On an error, it will return {@code null} and {@code error}
     *  will be set. If there's no content to read, it will still return
     *  {@code null}, but {@code error} won't be set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public PointerByte readLineFinish(org.gtk.gio.AsyncResult result, Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_data_input_stream_read_line_finish.invokeExact(
                        handle(),
                        result.handle(),
                        (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return new PointerByte(RESULT);
        }
    }
    
    /**
     * Finish an asynchronous call started by
     * g_data_input_stream_read_line_async().
     * @param result the {@link AsyncResult} that was provided to the callback.
     * @param length a {@code gsize} to get the length of the data read in.
     * @return a string with the line that
     *  was read in (without the newlines).  Set {@code length} to a {@code gsize} to
     *  get the length of the read line.  On an error, it will return
     *  {@code null} and {@code error} will be set. For UTF-8 conversion errors, the set
     *  error domain is {@code G_CONVERT_ERROR}.  If there's no content to read,
     *  it will still return {@code null}, but {@code error} won't be set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @Nullable java.lang.String readLineFinishUtf8(org.gtk.gio.AsyncResult result, Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_data_input_stream_read_line_finish_utf8.invokeExact(
                        handle(),
                        result.handle(),
                        (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Reads a UTF-8 encoded line from the data input stream.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param length a {@code gsize} to get the length of the data read in.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return a NUL terminated UTF-8 string
     *  with the line that was read in (without the newlines).  Set
     *  {@code length} to a {@code gsize} to get the length of the read line.  On an
     *  error, it will return {@code null} and {@code error} will be set.  For UTF-8
     *  conversion errors, the set error domain is {@code G_CONVERT_ERROR}.  If
     *  there's no content to read, it will still return {@code null}, but {@code error}
     *  won't be set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @Nullable java.lang.String readLineUtf8(Out<Long> length, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_data_input_stream_read_line_utf8.invokeExact(
                        handle(),
                        (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Reads an unsigned 16-bit/2-byte value from {@code stream}.
     * <p>
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return an unsigned 16-bit/2-byte value read from the {@code stream} or {@code 0} if
     * an error occurred.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public short readUint16(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            short RESULT;
            try {
                RESULT = (short) DowncallHandles.g_data_input_stream_read_uint16.invokeExact(
                        handle(),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * Reads an unsigned 32-bit/4-byte value from {@code stream}.
     * <p>
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return an unsigned 32-bit/4-byte value read from the {@code stream} or {@code 0} if
     * an error occurred.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public int readUint32(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_data_input_stream_read_uint32.invokeExact(
                        handle(),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * Reads an unsigned 64-bit/8-byte value from {@code stream}.
     * <p>
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order().
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return an unsigned 64-bit/8-byte read from {@code stream} or {@code 0} if
     * an error occurred.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public long readUint64(@Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_data_input_stream_read_uint64.invokeExact(
                        handle(),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * Reads a string from the data input stream, up to the first
     * occurrence of any of the stop characters.
     * <p>
     * Note that, in contrast to g_data_input_stream_read_until_async(),
     * this function consumes the stop character that it finds.
     * <p>
     * Don't use this function in new code.  Its functionality is
     * inconsistent with g_data_input_stream_read_until_async().  Both
     * functions will be marked as deprecated in a future release.  Use
     * g_data_input_stream_read_upto() instead, but note that that function
     * does not consume the stop character.
     * @param stopChars characters to terminate the read.
     * @param length a {@code gsize} to get the length of the data read in.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return a string with the data that was read
     *     before encountering any of the stop characters. Set {@code length} to
     *     a {@code gsize} to get the length of the string. This function will
     *     return {@code null} on an error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     * @deprecated Use g_data_input_stream_read_upto() instead, which has more
     *     consistent behaviour regarding the stop character.
     */
    @Deprecated
    public java.lang.String readUntil(java.lang.String stopChars, Out<Long> length, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_data_input_stream_read_until.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(stopChars, SCOPE),
                        (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * The asynchronous version of g_data_input_stream_read_until().
     * It is an error to have two outstanding calls to this function.
     * <p>
     * Note that, in contrast to g_data_input_stream_read_until(),
     * this function does not consume the stop character that it finds.  You
     * must read it for yourself.
     * <p>
     * When the operation is finished, {@code callback} will be called. You
     * can then call g_data_input_stream_read_until_finish() to get
     * the result of the operation.
     * <p>
     * Don't use this function in new code.  Its functionality is
     * inconsistent with g_data_input_stream_read_until().  Both functions
     * will be marked as deprecated in a future release.  Use
     * g_data_input_stream_read_upto_async() instead.
     * @param stopChars characters to terminate the read.
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @param callback callback to call when the request is satisfied.
     * @deprecated Use g_data_input_stream_read_upto_async() instead, which
     *     has more consistent behaviour regarding the stop character.
     */
    @Deprecated
    public void readUntilAsync(java.lang.String stopChars, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_data_input_stream_read_until_async.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(stopChars, SCOPE),
                        ioPriority,
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                        (Addressable) MemoryAddress.NULL);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Finish an asynchronous call started by
     * g_data_input_stream_read_until_async().
     * @param result the {@link AsyncResult} that was provided to the callback.
     * @param length a {@code gsize} to get the length of the data read in.
     * @return a string with the data that was read
     *     before encountering any of the stop characters. Set {@code length} to
     *     a {@code gsize} to get the length of the string. This function will
     *     return {@code null} on an error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     * @deprecated Use g_data_input_stream_read_upto_finish() instead, which
     *     has more consistent behaviour regarding the stop character.
     */
    @Deprecated
    public java.lang.String readUntilFinish(org.gtk.gio.AsyncResult result, Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_data_input_stream_read_until_finish.invokeExact(
                        handle(),
                        result.handle(),
                        (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
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
     * @param stopChars characters to terminate the read
     * @param stopCharsLen length of {@code stop_chars}. May be -1 if {@code stop_chars} is
     *     nul-terminated
     * @param length a {@code gsize} to get the length of the data read in
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @return a string with the data that was read
     *     before encountering any of the stop characters. Set {@code length} to
     *     a {@code gsize} to get the length of the string. This function will
     *     return {@code null} on an error
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public java.lang.String readUpto(java.lang.String stopChars, long stopCharsLen, Out<Long> length, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_data_input_stream_read_upto.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(stopChars, SCOPE),
                        stopCharsLen,
                        (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()),
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
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
     * @param stopChars characters to terminate the read
     * @param stopCharsLen length of {@code stop_chars}. May be -1 if {@code stop_chars} is
     *     nul-terminated
     * @param ioPriority the [I/O priority][io-priority] of the request
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore
     * @param callback callback to call when the request is satisfied
     */
    public void readUptoAsync(java.lang.String stopChars, long stopCharsLen, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_data_input_stream_read_upto_async.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(stopChars, SCOPE),
                        stopCharsLen,
                        ioPriority,
                        (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                        (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                        (Addressable) MemoryAddress.NULL);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Finish an asynchronous call started by
     * g_data_input_stream_read_upto_async().
     * <p>
     * Note that this function does not consume the stop character. You
     * have to use g_data_input_stream_read_byte() to get it before calling
     * g_data_input_stream_read_upto_async() again.
     * <p>
     * The returned string will always be nul-terminated on success.
     * @param result the {@link AsyncResult} that was provided to the callback
     * @param length a {@code gsize} to get the length of the data read in
     * @return a string with the data that was read
     *     before encountering any of the stop characters. Set {@code length} to
     *     a {@code gsize} to get the length of the string. This function will
     *     return {@code null} on an error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public java.lang.String readUptoFinish(org.gtk.gio.AsyncResult result, Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_data_input_stream_read_upto_finish.invokeExact(
                        handle(),
                        result.handle(),
                        (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * This function sets the byte order for the given {@code stream}. All subsequent
     * reads from the {@code stream} will be read in the given {@code order}.
     * @param order a {@link DataStreamByteOrder} to set.
     */
    public void setByteOrder(org.gtk.gio.DataStreamByteOrder order) {
        try {
            DowncallHandles.g_data_input_stream_set_byte_order.invokeExact(
                    handle(),
                    order.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the newline type for the {@code stream}.
     * <p>
     * Note that using G_DATA_STREAM_NEWLINE_TYPE_ANY is slightly unsafe. If a read
     * chunk ends in "CR" we must read an additional byte to know if this is "CR" or
     * "CR LF", and this might block if there is no more data available.
     * @param type the type of new line return as {@link DataStreamNewlineType}.
     */
    public void setNewlineType(org.gtk.gio.DataStreamNewlineType type) {
        try {
            DowncallHandles.g_data_input_stream_set_newline_type.invokeExact(
                    handle(),
                    type.getValue());
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
            RESULT = (long) DowncallHandles.g_data_input_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link DataInputStream.Builder} object constructs a {@link DataInputStream} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DataInputStream.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.BufferedInputStream.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DataInputStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DataInputStream}.
         * @return A new instance of {@code DataInputStream} with the properties 
         *         that were set in the Builder object.
         */
        public DataInputStream build() {
            return (DataInputStream) org.gtk.gobject.GObject.newWithProperties(
                DataInputStream.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The :byte-order property determines the byte ordering that
         * is used when reading multi-byte entities (such as integers)
         * from the stream.
         * @param byteOrder The value for the {@code byte-order} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setByteOrder(org.gtk.gio.DataStreamByteOrder byteOrder) {
            names.add("byte-order");
            values.add(org.gtk.gobject.Value.create(byteOrder));
            return this;
        }
        
        /**
         * The :newline-type property determines what is considered
         * as a line ending when reading complete lines from the stream.
         * @param newlineType The value for the {@code newline-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNewlineType(org.gtk.gio.DataStreamNewlineType newlineType) {
            names.add("newline-type");
            values.add(org.gtk.gobject.Value.create(newlineType));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_data_input_stream_new = Interop.downcallHandle(
                "g_data_input_stream_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_data_input_stream_get_byte_order = Interop.downcallHandle(
                "g_data_input_stream_get_byte_order",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_data_input_stream_get_newline_type = Interop.downcallHandle(
                "g_data_input_stream_get_newline_type",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_data_input_stream_read_byte = Interop.downcallHandle(
                "g_data_input_stream_read_byte",
                FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_data_input_stream_read_int16 = Interop.downcallHandle(
                "g_data_input_stream_read_int16",
                FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_data_input_stream_read_int32 = Interop.downcallHandle(
                "g_data_input_stream_read_int32",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_data_input_stream_read_int64 = Interop.downcallHandle(
                "g_data_input_stream_read_int64",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_data_input_stream_read_line = Interop.downcallHandle(
                "g_data_input_stream_read_line",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_data_input_stream_read_line_async = Interop.downcallHandle(
                "g_data_input_stream_read_line_async",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_data_input_stream_read_line_finish = Interop.downcallHandle(
                "g_data_input_stream_read_line_finish",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_data_input_stream_read_line_finish_utf8 = Interop.downcallHandle(
                "g_data_input_stream_read_line_finish_utf8",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_data_input_stream_read_line_utf8 = Interop.downcallHandle(
                "g_data_input_stream_read_line_utf8",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_data_input_stream_read_uint16 = Interop.downcallHandle(
                "g_data_input_stream_read_uint16",
                FunctionDescriptor.of(Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_data_input_stream_read_uint32 = Interop.downcallHandle(
                "g_data_input_stream_read_uint32",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_data_input_stream_read_uint64 = Interop.downcallHandle(
                "g_data_input_stream_read_uint64",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_data_input_stream_read_until = Interop.downcallHandle(
                "g_data_input_stream_read_until",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_data_input_stream_read_until_async = Interop.downcallHandle(
                "g_data_input_stream_read_until_async",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_data_input_stream_read_until_finish = Interop.downcallHandle(
                "g_data_input_stream_read_until_finish",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_data_input_stream_read_upto = Interop.downcallHandle(
                "g_data_input_stream_read_upto",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_data_input_stream_read_upto_async = Interop.downcallHandle(
                "g_data_input_stream_read_upto_async",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_data_input_stream_read_upto_finish = Interop.downcallHandle(
                "g_data_input_stream_read_upto_finish",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_data_input_stream_set_byte_order = Interop.downcallHandle(
                "g_data_input_stream_set_byte_order",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_data_input_stream_set_newline_type = Interop.downcallHandle(
                "g_data_input_stream_set_newline_type",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_data_input_stream_get_type = Interop.downcallHandle(
                "g_data_input_stream_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_data_input_stream_get_type != null;
    }
}
