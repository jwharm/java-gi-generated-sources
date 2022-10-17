package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A data structure representing an IO Channel. The fields should be
 * considered private and should only be accessed with the following
 * functions.
 */
public class IOChannel extends io.github.jwharm.javagi.ResourceBase {

    public IOChannel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_io_channel_new_file = Interop.downcallHandle(
        "g_io_channel_new_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFile(@NotNull java.lang.String filename, @NotNull java.lang.String mode) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_io_channel_new_file.invokeExact(Interop.allocateNativeString(filename), Interop.allocateNativeString(mode), (Addressable) GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Open a file {@code filename} as a {@link IOChannel} using mode {@code mode}. This
     * channel will be closed when the last reference to it is dropped,
     * so there is no need to call g_io_channel_close() (though doing
     * so will not cause problems, as long as no attempt is made to
     * access the channel after it is closed).
     */
    public static IOChannel newFile(@NotNull java.lang.String filename, @NotNull java.lang.String mode) throws GErrorException {
        return new IOChannel(constructNewFile(filename, mode));
    }
    
    private static final MethodHandle g_io_channel_unix_new = Interop.downcallHandle(
        "g_io_channel_unix_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructUnixNew(@NotNull int fd) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_io_channel_unix_new.invokeExact(fd), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link IOChannel} given a file descriptor. On UNIX systems
     * this works for plain files, pipes, and sockets.
     * <p>
     * The returned {@link IOChannel} has a reference count of 1.
     * <p>
     * The default encoding for {@link IOChannel} is UTF-8. If your application
     * is reading output from a command using via pipe, you may need to set
     * the encoding to the encoding of the current locale (see
     * g_get_charset()) with the g_io_channel_set_encoding() function.
     * By default, the fd passed will not be closed when the final reference
     * to the {@link IOChannel} data structure is dropped.
     * <p>
     * If you want to read raw binary data without interpretation, then
     * call the g_io_channel_set_encoding() function with {@code null} for the
     * encoding argument.
     * <p>
     * This function is available in GLib on Windows, too, but you should
     * avoid using it on Windows. The domain of file descriptors and
     * sockets overlap. There is no way for GLib to know which one you mean
     * in case the argument you pass to this function happens to be both a
     * valid file descriptor and socket. If that happens a warning is
     * issued, and GLib assumes that it is the file descriptor you mean.
     */
    public static IOChannel unixNew(@NotNull int fd) {
        return new IOChannel(constructUnixNew(fd));
    }
    
    private static final MethodHandle g_io_channel_flush = Interop.downcallHandle(
        "g_io_channel_flush",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Flushes the write buffer for the GIOChannel.
     */
    public @NotNull IOStatus flush() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_io_channel_flush.invokeExact(handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new IOStatus(RESULT);
    }
    
    private static final MethodHandle g_io_channel_get_buffer_condition = Interop.downcallHandle(
        "g_io_channel_get_buffer_condition",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * This function returns a {@link IOCondition} depending on whether there
     * is data to be read/space to write data in the internal buffers in
     * the {@link IOChannel}. Only the flags {@link IOCondition#IN} and {@link IOCondition#OUT} may be set.
     */
    public @NotNull IOCondition getBufferCondition() {
        int RESULT;
        try {
            RESULT = (int) g_io_channel_get_buffer_condition.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new IOCondition(RESULT);
    }
    
    private static final MethodHandle g_io_channel_get_buffer_size = Interop.downcallHandle(
        "g_io_channel_get_buffer_size",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the buffer size.
     */
    public long getBufferSize() {
        long RESULT;
        try {
            RESULT = (long) g_io_channel_get_buffer_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_io_channel_get_buffered = Interop.downcallHandle(
        "g_io_channel_get_buffered",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether {@code channel} is buffered.
     */
    public boolean getBuffered() {
        int RESULT;
        try {
            RESULT = (int) g_io_channel_get_buffered.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_io_channel_get_close_on_unref = Interop.downcallHandle(
        "g_io_channel_get_close_on_unref",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the file/socket/whatever associated with {@code channel}
     * will be closed when {@code channel} receives its final unref and is
     * destroyed. The default value of this is {@code true} for channels created
     * by g_io_channel_new_file (), and {@code false} for all other channels.
     */
    public boolean getCloseOnUnref() {
        int RESULT;
        try {
            RESULT = (int) g_io_channel_get_close_on_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_io_channel_get_encoding = Interop.downcallHandle(
        "g_io_channel_get_encoding",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the encoding for the input/output of the channel.
     * The internal encoding is always UTF-8. The encoding {@code null}
     * makes the channel safe for binary data.
     */
    public @NotNull java.lang.String getEncoding() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_io_channel_get_encoding.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_io_channel_get_flags = Interop.downcallHandle(
        "g_io_channel_get_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current flags for a {@link IOChannel}, including read-only
     * flags such as {@link IOFlags#IS_READABLE}.
     * <p>
     * The values of the flags {@link IOFlags#IS_READABLE} and {@link IOFlags#IS_WRITABLE}
     * are cached for internal use by the channel when it is created.
     * If they should change at some later point (e.g. partial shutdown
     * of a socket with the UNIX shutdown() function), the user
     * should immediately call g_io_channel_get_flags() to update
     * the internal values of these flags.
     */
    public @NotNull IOFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) g_io_channel_get_flags.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new IOFlags(RESULT);
    }
    
    private static final MethodHandle g_io_channel_get_line_term = Interop.downcallHandle(
        "g_io_channel_get_line_term",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This returns the string that {@link IOChannel} uses to determine
     * where in the file a line break occurs. A value of {@code null}
     * indicates autodetection.
     */
    public @NotNull java.lang.String getLineTerm(@NotNull PointerInteger length) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_io_channel_get_line_term.invokeExact(handle(), length.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_io_channel_init = Interop.downcallHandle(
        "g_io_channel_init",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes a {@link IOChannel} struct.
     * <p>
     * This is called by each of the above functions when creating a
     * {@link IOChannel}, and so is not often needed by the application
     * programmer (unless you are creating a new type of {@link IOChannel}).
     */
    public @NotNull void init() {
        try {
            g_io_channel_init.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_io_channel_read_chars = Interop.downcallHandle(
        "g_io_channel_read_chars",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Replacement for g_io_channel_read() with the new API.
     */
    public @NotNull IOStatus readChars(@NotNull Out<byte[]> buf, @NotNull long count, @NotNull Out<Long> bytesRead) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment bufPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment bytesReadPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        int RESULT;
        try {
            RESULT = (int) g_io_channel_read_chars.invokeExact(handle(), (Addressable) bufPOINTER.address(), count, (Addressable) bytesReadPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        bytesRead.set(bytesReadPOINTER.get(ValueLayout.JAVA_LONG, 0));
        buf.set(MemorySegment.ofAddress(bufPOINTER.get(ValueLayout.ADDRESS, 0), count * ValueLayout.JAVA_BYTE.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_BYTE));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new IOStatus(RESULT);
    }
    
    private static final MethodHandle g_io_channel_read_line = Interop.downcallHandle(
        "g_io_channel_read_line",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads a line, including the terminating character(s),
     * from a {@link IOChannel} into a newly-allocated string.
     * {@code str_return} will contain allocated memory if the return
     * is {@link IOStatus#NORMAL}.
     */
    public @NotNull IOStatus readLine(@NotNull Out<java.lang.String> strReturn, @NotNull Out<Long> length, @NotNull Out<Long> terminatorPos) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment strReturnPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemorySegment terminatorPosPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        int RESULT;
        try {
            RESULT = (int) g_io_channel_read_line.invokeExact(handle(), (Addressable) strReturnPOINTER.address(), (Addressable) lengthPOINTER.address(), (Addressable) terminatorPosPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        strReturn.set(strReturnPOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        terminatorPos.set(terminatorPosPOINTER.get(ValueLayout.JAVA_LONG, 0));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new IOStatus(RESULT);
    }
    
    private static final MethodHandle g_io_channel_read_line_string = Interop.downcallHandle(
        "g_io_channel_read_line_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads a line from a {@link IOChannel}, using a {@link String} as a buffer.
     */
    public @NotNull IOStatus readLineString(@NotNull String buffer, @Nullable PointerLong terminatorPos) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_io_channel_read_line_string.invokeExact(handle(), buffer.handle(), terminatorPos.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new IOStatus(RESULT);
    }
    
    private static final MethodHandle g_io_channel_read_to_end = Interop.downcallHandle(
        "g_io_channel_read_to_end",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads all the remaining data from the file.
     */
    public @NotNull IOStatus readToEnd(@NotNull Out<byte[]> strReturn, @NotNull Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment strReturnPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        int RESULT;
        try {
            RESULT = (int) g_io_channel_read_to_end.invokeExact(handle(), (Addressable) strReturnPOINTER.address(), (Addressable) lengthPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        strReturn.set(MemorySegment.ofAddress(strReturnPOINTER.get(ValueLayout.ADDRESS, 0), length.get().intValue() * ValueLayout.JAVA_BYTE.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_BYTE));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new IOStatus(RESULT);
    }
    
    private static final MethodHandle g_io_channel_read_unichar = Interop.downcallHandle(
        "g_io_channel_read_unichar",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Reads a Unicode character from {@code channel}.
     * This function cannot be called on a channel with {@code null} encoding.
     */
    public @NotNull IOStatus readUnichar(@NotNull Out<Integer> thechar) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment thecharPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) g_io_channel_read_unichar.invokeExact(handle(), (Addressable) thecharPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        thechar.set(thecharPOINTER.get(ValueLayout.JAVA_INT, 0));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new IOStatus(RESULT);
    }
    
    private static final MethodHandle g_io_channel_ref = Interop.downcallHandle(
        "g_io_channel_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increments the reference count of a {@link IOChannel}.
     */
    public @NotNull IOChannel ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_io_channel_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new IOChannel(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_io_channel_seek_position = Interop.downcallHandle(
        "g_io_channel_seek_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Replacement for g_io_channel_seek() with the new API.
     */
    public @NotNull IOStatus seekPosition(@NotNull long offset, @NotNull SeekType type) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_io_channel_seek_position.invokeExact(handle(), offset, type.getValue(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new IOStatus(RESULT);
    }
    
    private static final MethodHandle g_io_channel_set_buffer_size = Interop.downcallHandle(
        "g_io_channel_set_buffer_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Sets the buffer size.
     */
    public @NotNull void setBufferSize(@NotNull long size) {
        try {
            g_io_channel_set_buffer_size.invokeExact(handle(), size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_io_channel_set_buffered = Interop.downcallHandle(
        "g_io_channel_set_buffered",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * The buffering state can only be set if the channel's encoding
     * is {@code null}. For any other encoding, the channel must be buffered.
     * <p>
     * A buffered channel can only be set unbuffered if the channel's
     * internal buffers have been flushed. Newly created channels or
     * channels which have returned {@link IOStatus#EOF}
     * not require such a flush. For write-only channels, a call to
     * g_io_channel_flush () is sufficient. For all other channels,
     * the buffers may be flushed by a call to g_io_channel_seek_position ().
     * This includes the possibility of seeking with seek type {@link SeekType#CUR}
     * and an offset of zero. Note that this means that socket-based
     * channels cannot be set unbuffered once they have had data
     * read from them.
     * <p>
     * On unbuffered channels, it is safe to mix read and write
     * calls from the new and old APIs, if this is necessary for
     * maintaining old code.
     * <p>
     * The default state of the channel is buffered.
     */
    public @NotNull void setBuffered(@NotNull boolean buffered) {
        try {
            g_io_channel_set_buffered.invokeExact(handle(), buffered ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_io_channel_set_close_on_unref = Interop.downcallHandle(
        "g_io_channel_set_close_on_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Whether to close the channel on the final unref of the {@link IOChannel}
     * data structure. The default value of this is {@code true} for channels
     * created by g_io_channel_new_file (), and {@code false} for all other channels.
     * <p>
     * Setting this flag to {@code true} for a channel you have already closed
     * can cause problems when the final reference to the {@link IOChannel} is dropped.
     */
    public @NotNull void setCloseOnUnref(@NotNull boolean doClose) {
        try {
            g_io_channel_set_close_on_unref.invokeExact(handle(), doClose ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_io_channel_set_encoding = Interop.downcallHandle(
        "g_io_channel_set_encoding",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the encoding for the input/output of the channel.
     * The internal encoding is always UTF-8. The default encoding
     * for the external file is UTF-8.
     * <p>
     * The encoding {@code null} is safe to use with binary data.
     * <p>
     * The encoding can only be set if one of the following conditions
     * is true:
     * <ul>
     * <li>The channel was just created, and has not been written to or read from yet.
     * <li>The channel is write-only.
     * <li>The channel is a file, and the file pointer was just repositioned
     *   by a call to g_io_channel_seek_position(). (This flushes all the
     *   internal buffers.)
     * <li>The current encoding is {@code null} or UTF-8.
     * <li>One of the (new API) read functions has just returned {@link IOStatus#EOF}
     *   (or, in the case of g_io_channel_read_to_end(), {@link IOStatus#NORMAL}).
     * <li> One of the functions g_io_channel_read_chars() or
     *    g_io_channel_read_unichar() has returned {@link IOStatus#AGAIN} or
     *    {@link IOStatus#ERROR}. This may be useful in the case of
     *    {@link ConvertError#ILLEGAL_SEQUENCE}.
     *    Returning one of these statuses from g_io_channel_read_line(),
     *    g_io_channel_read_line_string(), or g_io_channel_read_to_end()
     *    does not guarantee that the encoding can be changed.
     * </ul>
     * <p>
     * Channels which do not meet one of the above conditions cannot call
     * g_io_channel_seek_position() with an offset of {@link SeekType#CUR}, and, if
     * they are "seekable", cannot call g_io_channel_write_chars() after
     * calling one of the API "read" functions.
     */
    public @NotNull IOStatus setEncoding(@Nullable java.lang.String encoding) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_io_channel_set_encoding.invokeExact(handle(), Interop.allocateNativeString(encoding), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new IOStatus(RESULT);
    }
    
    private static final MethodHandle g_io_channel_set_flags = Interop.downcallHandle(
        "g_io_channel_set_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the (writeable) flags in {@code channel} to ({@code flags} & {@link IOFlags#SET_MASK}).
     */
    public @NotNull IOStatus setFlags(@NotNull IOFlags flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_io_channel_set_flags.invokeExact(handle(), flags.getValue(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new IOStatus(RESULT);
    }
    
    private static final MethodHandle g_io_channel_set_line_term = Interop.downcallHandle(
        "g_io_channel_set_line_term",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * This sets the string that {@link IOChannel} uses to determine
     * where in the file a line break occurs.
     */
    public @NotNull void setLineTerm(@Nullable java.lang.String lineTerm, @NotNull int length) {
        try {
            g_io_channel_set_line_term.invokeExact(handle(), Interop.allocateNativeString(lineTerm), length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_io_channel_shutdown = Interop.downcallHandle(
        "g_io_channel_shutdown",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Close an IO channel. Any pending data to be written will be
     * flushed if {@code flush} is {@code true}. The channel will not be freed until the
     * last reference is dropped using g_io_channel_unref().
     */
    public @NotNull IOStatus shutdown(@NotNull boolean flush) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_io_channel_shutdown.invokeExact(handle(), flush ? 1 : 0, (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new IOStatus(RESULT);
    }
    
    private static final MethodHandle g_io_channel_unix_get_fd = Interop.downcallHandle(
        "g_io_channel_unix_get_fd",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the file descriptor of the {@link IOChannel}.
     * <p>
     * On Windows this function returns the file descriptor or socket of
     * the {@link IOChannel}.
     */
    public int unixGetFd() {
        int RESULT;
        try {
            RESULT = (int) g_io_channel_unix_get_fd.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_io_channel_unref = Interop.downcallHandle(
        "g_io_channel_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decrements the reference count of a {@link IOChannel}.
     */
    public @NotNull void unref() {
        try {
            g_io_channel_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_io_channel_write_chars = Interop.downcallHandle(
        "g_io_channel_write_chars",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Replacement for g_io_channel_write() with the new API.
     * <p>
     * On seekable channels with encodings other than {@code null} or UTF-8, generic
     * mixing of reading and writing is not allowed. A call to g_io_channel_write_chars ()
     * may only be made on a channel from which data has been read in the
     * cases described in the documentation for g_io_channel_set_encoding ().
     */
    public @NotNull IOStatus writeChars(@NotNull byte[] buf, @NotNull long count, @NotNull Out<Long> bytesWritten) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment bytesWrittenPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        int RESULT;
        try {
            RESULT = (int) g_io_channel_write_chars.invokeExact(handle(), Interop.allocateNativeArray(buf), count, (Addressable) bytesWrittenPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        bytesWritten.set(bytesWrittenPOINTER.get(ValueLayout.JAVA_LONG, 0));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new IOStatus(RESULT);
    }
    
    private static final MethodHandle g_io_channel_write_unichar = Interop.downcallHandle(
        "g_io_channel_write_unichar",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Writes a Unicode character to {@code channel}.
     * This function cannot be called on a channel with {@code null} encoding.
     */
    public @NotNull IOStatus writeUnichar(@NotNull int thechar) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_io_channel_write_unichar.invokeExact(handle(), thechar, (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new IOStatus(RESULT);
    }
    
    private static final MethodHandle g_io_channel_error_from_errno = Interop.downcallHandle(
        "g_io_channel_error_from_errno",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts an {@code errno} error number to a {@link IOChannelError}.
     */
    public static @NotNull IOChannelError errorFromErrno(@NotNull int en) {
        int RESULT;
        try {
            RESULT = (int) g_io_channel_error_from_errno.invokeExact(en);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new IOChannelError(RESULT);
    }
    
    private static final MethodHandle g_io_channel_error_quark = Interop.downcallHandle(
        "g_io_channel_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static @NotNull Quark errorQuark() {
        int RESULT;
        try {
            RESULT = (int) g_io_channel_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Quark(RESULT);
    }
    
}
