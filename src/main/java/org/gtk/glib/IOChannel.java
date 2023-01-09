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
public class IOChannel extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GIOChannel";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("funcs"),
            Interop.valueLayout.ADDRESS.withName("encoding"),
            org.gtk.glib.IConv.getMemoryLayout().withName("read_cd"),
            org.gtk.glib.IConv.getMemoryLayout().withName("write_cd"),
            Interop.valueLayout.ADDRESS.withName("line_term"),
            Interop.valueLayout.C_INT.withName("line_term_len"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.C_LONG.withName("buf_size"),
            Interop.valueLayout.ADDRESS.withName("read_buf"),
            Interop.valueLayout.ADDRESS.withName("encoded_read_buf"),
            Interop.valueLayout.ADDRESS.withName("write_buf"),
            MemoryLayout.paddingLayout(16),
            MemoryLayout.sequenceLayout(6, Interop.valueLayout.C_BYTE).withName("partial_write_buf"),
            Interop.valueLayout.C_INT.withName("use_buffer"),
            Interop.valueLayout.C_INT.withName("do_encode"),
            Interop.valueLayout.C_INT.withName("close_on_unref"),
            Interop.valueLayout.C_INT.withName("is_readable"),
            Interop.valueLayout.C_INT.withName("is_writeable"),
            Interop.valueLayout.C_INT.withName("is_seekable"),
            Interop.valueLayout.ADDRESS.withName("reserved1"),
            Interop.valueLayout.ADDRESS.withName("reserved2")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link IOChannel}
     * @return A new, uninitialized @{link IOChannel}
     */
    public static IOChannel allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        IOChannel newInstance = new IOChannel(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a IOChannel proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected IOChannel(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, IOChannel> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new IOChannel(input);
    
    private static MemoryAddress constructNewFile(java.lang.String filename, java.lang.String mode) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_io_channel_new_file.invokeExact(
                        Marshal.stringToAddress.marshal(filename, SCOPE),
                        Marshal.stringToAddress.marshal(mode, SCOPE),
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
     * Open a file {@code filename} as a {@link IOChannel} using mode {@code mode}. This
     * channel will be closed when the last reference to it is dropped,
     * so there is no need to call g_io_channel_close() (though doing
     * so will not cause problems, as long as no attempt is made to
     * access the channel after it is closed).
     * @param filename A string containing the name of a file
     * @param mode One of "r", "w", "a", "r+", "w+", "a+". These have
     *        the same meaning as in fopen()
     * @return A {@link IOChannel} on success, {@code null} on failure.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static IOChannel newFile(java.lang.String filename, java.lang.String mode) throws GErrorException {
        var RESULT = constructNewFile(filename, mode);
        var OBJECT = org.gtk.glib.IOChannel.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructUnixNew(int fd) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_io_channel_unix_new.invokeExact(fd);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
     * @param fd a file descriptor.
     * @return a new {@link IOChannel}.
     */
    public static IOChannel unixNew(int fd) {
        var RESULT = constructUnixNew(fd);
        var OBJECT = org.gtk.glib.IOChannel.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Close an IO channel. Any pending data to be written will be
     * flushed, ignoring errors. The channel will not be freed until the
     * last reference is dropped using g_io_channel_unref().
     * @deprecated Use g_io_channel_shutdown() instead.
     */
    @Deprecated
    public void close() {
        try {
            DowncallHandles.g_io_channel_close.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Flushes the write buffer for the GIOChannel.
     * @return the status of the operation: One of
     *   {@link IOStatus#NORMAL}, {@link IOStatus#AGAIN}, or
     *   {@link IOStatus#ERROR}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.IOStatus flush() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_io_channel_flush.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return org.gtk.glib.IOStatus.of(RESULT);
        }
    }
    
    /**
     * This function returns a {@link IOCondition} depending on whether there
     * is data to be read/space to write data in the internal buffers in
     * the {@link IOChannel}. Only the flags {@link IOCondition#IN} and {@link IOCondition#OUT} may be set.
     * @return A {@link IOCondition}
     */
    public org.gtk.glib.IOCondition getBufferCondition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_io_channel_get_buffer_condition.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.IOCondition(RESULT);
    }
    
    /**
     * Gets the buffer size.
     * @return the size of the buffer.
     */
    public long getBufferSize() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_io_channel_get_buffer_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns whether {@code channel} is buffered.
     * @return {@code true} if the {@code channel} is buffered.
     */
    public boolean getBuffered() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_io_channel_get_buffered.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether the file/socket/whatever associated with {@code channel}
     * will be closed when {@code channel} receives its final unref and is
     * destroyed. The default value of this is {@code true} for channels created
     * by g_io_channel_new_file (), and {@code false} for all other channels.
     * @return {@code true} if the channel will be closed, {@code false} otherwise.
     */
    public boolean getCloseOnUnref() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_io_channel_get_close_on_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the encoding for the input/output of the channel.
     * The internal encoding is always UTF-8. The encoding {@code null}
     * makes the channel safe for binary data.
     * @return A string containing the encoding, this string is
     *   owned by GLib and must not be freed.
     */
    public java.lang.String getEncoding() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_io_channel_get_encoding.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
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
     * @return the flags which are set on the channel
     */
    public org.gtk.glib.IOFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_io_channel_get_flags.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.IOFlags(RESULT);
    }
    
    /**
     * This returns the string that {@link IOChannel} uses to determine
     * where in the file a line break occurs. A value of {@code null}
     * indicates autodetection.
     * @param length a location to return the length of the line terminator
     * @return The line termination string. This value
     *   is owned by GLib and must not be freed.
     */
    public java.lang.String getLineTerm(PointerInteger length) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_io_channel_get_line_term.invokeExact(
                    handle(),
                    length.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Initializes a {@link IOChannel} struct.
     * <p>
     * This is called by each of the above functions when creating a
     * {@link IOChannel}, and so is not often needed by the application
     * programmer (unless you are creating a new type of {@link IOChannel}).
     */
    public void init() {
        try {
            DowncallHandles.g_io_channel_init.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reads data from a {@link IOChannel}.
     * @param buf a buffer to read the data into (which should be at least
     *       count bytes long)
     * @param count the number of bytes to read from the {@link IOChannel}
     * @param bytesRead returns the number of bytes actually read
     * @return {@link IOError#NONE} if the operation was successful.
     * @deprecated Use g_io_channel_read_chars() instead.
     */
    @Deprecated
    public org.gtk.glib.IOError read(java.lang.String buf, long count, PointerLong bytesRead) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_io_channel_read.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(buf, SCOPE),
                        count,
                        bytesRead.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.glib.IOError.of(RESULT);
        }
    }
    
    /**
     * Replacement for g_io_channel_read() with the new API.
     * @param buf a buffer to read data into
     * @param count the size of the buffer. Note that the buffer may not be
     *     completely filled even if there is data in the buffer if the
     *     remaining data is not a complete character.
     * @param bytesRead The number of bytes read. This may be
     *     zero even on success if count &lt; 6 and the channel's encoding
     *     is non-{@code null}. This indicates that the next UTF-8 character is
     *     too wide for the buffer.
     * @return the status of the operation.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.IOStatus readChars(Out<byte[]> buf, long count, Out<Long> bytesRead) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment bufPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment bytesReadPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_io_channel_read_chars.invokeExact(
                        handle(),
                        (Addressable) bufPOINTER.address(),
                        count,
                        (Addressable) (bytesRead == null ? MemoryAddress.NULL : (Addressable) bytesReadPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (bytesRead != null) bytesRead.set(bytesReadPOINTER.get(Interop.valueLayout.C_LONG, 0));
            buf.set(MemorySegment.ofAddress(bufPOINTER.get(Interop.valueLayout.ADDRESS, 0), count * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE));
            return org.gtk.glib.IOStatus.of(RESULT);
        }
    }
    
    /**
     * Reads a line, including the terminating character(s),
     * from a {@link IOChannel} into a newly-allocated string.
     * {@code str_return} will contain allocated memory if the return
     * is {@link IOStatus#NORMAL}.
     * @param strReturn The line read from the {@link IOChannel}, including the
     *              line terminator. This data should be freed with g_free()
     *              when no longer needed. This is a nul-terminated string.
     *              If a {@code length} of zero is returned, this will be {@code null} instead.
     * @param length location to store length of the read data, or {@code null}
     * @param terminatorPos location to store position of line terminator, or {@code null}
     * @return the status of the operation.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.IOStatus readLine(Out<java.lang.String> strReturn, Out<Long> length, Out<Long> terminatorPos) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment strReturnPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment terminatorPosPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_io_channel_read_line.invokeExact(
                        handle(),
                        (Addressable) strReturnPOINTER.address(),
                        (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()),
                        (Addressable) (terminatorPos == null ? MemoryAddress.NULL : (Addressable) terminatorPosPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    strReturn.set(Marshal.addressToString.marshal(strReturnPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
                    if (terminatorPos != null) terminatorPos.set(terminatorPosPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return org.gtk.glib.IOStatus.of(RESULT);
        }
    }
    
    /**
     * Reads a line from a {@link IOChannel}, using a {@link GString} as a buffer.
     * @param buffer a {@link GString} into which the line will be written.
     *          If {@code buffer} already contains data, the old data will
     *          be overwritten.
     * @param terminatorPos location to store position of line terminator, or {@code null}
     * @return the status of the operation.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.IOStatus readLineString(org.gtk.glib.GString buffer, PointerLong terminatorPos) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_io_channel_read_line_string.invokeExact(
                        handle(),
                        buffer.handle(),
                        (Addressable) (terminatorPos == null ? MemoryAddress.NULL : terminatorPos.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return org.gtk.glib.IOStatus.of(RESULT);
        }
    }
    
    /**
     * Reads all the remaining data from the file.
     * @param strReturn Location to
     *              store a pointer to a string holding the remaining data in the
     *              {@link IOChannel}. This data should be freed with g_free() when no
     *              longer needed. This data is terminated by an extra nul
     *              character, but there may be other nuls in the intervening data.
     * @param length location to store length of the data
     * @return {@link IOStatus#NORMAL} on success.
     *     This function never returns {@link IOStatus#EOF}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.IOStatus readToEnd(Out<byte[]> strReturn, Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment strReturnPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_io_channel_read_to_end.invokeExact(
                        handle(),
                        (Addressable) strReturnPOINTER.address(),
                        (Addressable) lengthPOINTER.address(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            strReturn.set(MemorySegment.ofAddress(strReturnPOINTER.get(Interop.valueLayout.ADDRESS, 0), length.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE));
            return org.gtk.glib.IOStatus.of(RESULT);
        }
    }
    
    /**
     * Reads a Unicode character from {@code channel}.
     * This function cannot be called on a channel with {@code null} encoding.
     * @param thechar a location to return a character
     * @return a {@link IOStatus}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.IOStatus readUnichar(Out<Integer> thechar) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment thecharPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_io_channel_read_unichar.invokeExact(
                        handle(),
                        (Addressable) thecharPOINTER.address(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    thechar.set(thecharPOINTER.get(Interop.valueLayout.C_INT, 0));
            return org.gtk.glib.IOStatus.of(RESULT);
        }
    }
    
    /**
     * Increments the reference count of a {@link IOChannel}.
     * @return the {@code channel} that was passed in (since 2.6)
     */
    public org.gtk.glib.IOChannel ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_io_channel_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.IOChannel.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Sets the current position in the {@link IOChannel}, similar to the standard
     * library function fseek().
     * @param offset an offset, in bytes, which is added to the position specified
     *          by {@code type}
     * @param type the position in the file, which can be {@link SeekType#CUR} (the current
     *        position), {@link SeekType#SET} (the start of the file), or {@link SeekType#END}
     *        (the end of the file)
     * @return {@link IOError#NONE} if the operation was successful.
     * @deprecated Use g_io_channel_seek_position() instead.
     */
    @Deprecated
    public org.gtk.glib.IOError seek(long offset, org.gtk.glib.SeekType type) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_io_channel_seek.invokeExact(
                    handle(),
                    offset,
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.IOError.of(RESULT);
    }
    
    /**
     * Replacement for g_io_channel_seek() with the new API.
     * @param offset The offset in bytes from the position specified by {@code type}
     * @param type a {@link SeekType}. The type {@link SeekType#CUR} is only allowed in those
     *                      cases where a call to g_io_channel_set_encoding ()
     *                      is allowed. See the documentation for
     *                      g_io_channel_set_encoding () for details.
     * @return the status of the operation.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.IOStatus seekPosition(long offset, org.gtk.glib.SeekType type) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_io_channel_seek_position.invokeExact(
                        handle(),
                        offset,
                        type.getValue(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return org.gtk.glib.IOStatus.of(RESULT);
        }
    }
    
    /**
     * Sets the buffer size.
     * @param size the size of the buffer, or 0 to let GLib pick a good size
     */
    public void setBufferSize(long size) {
        try {
            DowncallHandles.g_io_channel_set_buffer_size.invokeExact(
                    handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param buffered whether to set the channel buffered or unbuffered
     */
    public void setBuffered(boolean buffered) {
        try {
            DowncallHandles.g_io_channel_set_buffered.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(buffered, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Whether to close the channel on the final unref of the {@link IOChannel}
     * data structure. The default value of this is {@code true} for channels
     * created by g_io_channel_new_file (), and {@code false} for all other channels.
     * <p>
     * Setting this flag to {@code true} for a channel you have already closed
     * can cause problems when the final reference to the {@link IOChannel} is dropped.
     * @param doClose Whether to close the channel on the final unref of
     *            the GIOChannel data structure.
     */
    public void setCloseOnUnref(boolean doClose) {
        try {
            DowncallHandles.g_io_channel_set_close_on_unref.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(doClose, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * </ul>
     * <ul>
     * <li>The channel is write-only.
     * </ul>
     * <ul>
     * <li>The channel is a file, and the file pointer was just repositioned
     *   by a call to g_io_channel_seek_position(). (This flushes all the
     *   internal buffers.)
     * </ul>
     * <ul>
     * <li>The current encoding is {@code null} or UTF-8.
     * </ul>
     * <ul>
     * <li>One of the (new API) read functions has just returned {@link IOStatus#EOF}
     *   (or, in the case of g_io_channel_read_to_end(), {@link IOStatus#NORMAL}).
     * </ul>
     * <ul>
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
     * @param encoding the encoding type
     * @return {@link IOStatus#NORMAL} if the encoding was successfully set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.IOStatus setEncoding(@Nullable java.lang.String encoding) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_io_channel_set_encoding.invokeExact(
                        handle(),
                        (Addressable) (encoding == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(encoding, SCOPE)),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return org.gtk.glib.IOStatus.of(RESULT);
        }
    }
    
    /**
     * Sets the (writeable) flags in {@code channel} to ({@code flags} &amp; {@link IOFlags#SET_MASK}).
     * @param flags the flags to set on the IO channel
     * @return the status of the operation.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.IOStatus setFlags(org.gtk.glib.IOFlags flags) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_io_channel_set_flags.invokeExact(
                        handle(),
                        flags.getValue(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return org.gtk.glib.IOStatus.of(RESULT);
        }
    }
    
    /**
     * This sets the string that {@link IOChannel} uses to determine
     * where in the file a line break occurs.
     * @param lineTerm The line termination string. Use {@code null} for
     *             autodetect.  Autodetection breaks on "\\n", "\\r\\n", "\\r", "\\0",
     *             and the Unicode paragraph separator. Autodetection should not be
     *             used for anything other than file-based channels.
     * @param length The length of the termination string. If -1 is passed, the
     *          string is assumed to be nul-terminated. This option allows
     *          termination strings with embedded nuls.
     */
    public void setLineTerm(@Nullable java.lang.String lineTerm, int length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_io_channel_set_line_term.invokeExact(
                        handle(),
                        (Addressable) (lineTerm == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(lineTerm, SCOPE)),
                        length);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Close an IO channel. Any pending data to be written will be
     * flushed if {@code flush} is {@code true}. The channel will not be freed until the
     * last reference is dropped using g_io_channel_unref().
     * @param flush if {@code true}, flush pending
     * @return the status of the operation.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.IOStatus shutdown(boolean flush) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_io_channel_shutdown.invokeExact(
                        handle(),
                        Marshal.booleanToInteger.marshal(flush, null).intValue(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return org.gtk.glib.IOStatus.of(RESULT);
        }
    }
    
    /**
     * Returns the file descriptor of the {@link IOChannel}.
     * <p>
     * On Windows this function returns the file descriptor or socket of
     * the {@link IOChannel}.
     * @return the file descriptor of the {@link IOChannel}.
     */
    public int unixGetFd() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_io_channel_unix_get_fd.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Decrements the reference count of a {@link IOChannel}.
     */
    public void unref() {
        try {
            DowncallHandles.g_io_channel_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Writes data to a {@link IOChannel}.
     * @param buf the buffer containing the data to write
     * @param count the number of bytes to write
     * @param bytesWritten the number of bytes actually written
     * @return {@link IOError#NONE} if the operation was successful.
     * @deprecated Use g_io_channel_write_chars() instead.
     */
    @Deprecated
    public org.gtk.glib.IOError write(java.lang.String buf, long count, PointerLong bytesWritten) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_io_channel_write.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(buf, SCOPE),
                        count,
                        bytesWritten.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.glib.IOError.of(RESULT);
        }
    }
    
    /**
     * Replacement for g_io_channel_write() with the new API.
     * <p>
     * On seekable channels with encodings other than {@code null} or UTF-8, generic
     * mixing of reading and writing is not allowed. A call to g_io_channel_write_chars ()
     * may only be made on a channel from which data has been read in the
     * cases described in the documentation for g_io_channel_set_encoding ().
     * @param buf a buffer to write data from
     * @param count the size of the buffer. If -1, the buffer
     *         is taken to be a nul-terminated string.
     * @param bytesWritten The number of bytes written. This can be nonzero
     *                 even if the return value is not {@link IOStatus#NORMAL}.
     *                 If the return value is {@link IOStatus#NORMAL} and the
     *                 channel is blocking, this will always be equal
     *                 to {@code count} if {@code count} &gt;= 0.
     * @return the status of the operation.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.IOStatus writeChars(byte[] buf, long count, Out<Long> bytesWritten) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment bytesWrittenPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_io_channel_write_chars.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(buf, false, SCOPE),
                        count,
                        (Addressable) bytesWrittenPOINTER.address(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    bytesWritten.set(bytesWrittenPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return org.gtk.glib.IOStatus.of(RESULT);
        }
    }
    
    /**
     * Writes a Unicode character to {@code channel}.
     * This function cannot be called on a channel with {@code null} encoding.
     * @param thechar a character
     * @return a {@link IOStatus}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.IOStatus writeUnichar(int thechar) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_io_channel_write_unichar.invokeExact(
                        handle(),
                        thechar,
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return org.gtk.glib.IOStatus.of(RESULT);
        }
    }
    
    /**
     * Converts an {@code errno} error number to a {@link IOChannelError}.
     * @param en an {@code errno} error number, e.g. {@code EINVAL}
     * @return a {@link IOChannelError} error number, e.g.
     *      {@link IOChannelError#INVAL}.
     */
    public static org.gtk.glib.IOChannelError errorFromErrno(int en) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_io_channel_error_from_errno.invokeExact(en);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.IOChannelError.of(RESULT);
    }
    
    public static org.gtk.glib.Quark errorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_io_channel_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_io_channel_new_file = Interop.downcallHandle(
                "g_io_channel_new_file",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_unix_new = Interop.downcallHandle(
                "g_io_channel_unix_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_io_channel_close = Interop.downcallHandle(
                "g_io_channel_close",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_flush = Interop.downcallHandle(
                "g_io_channel_flush",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_get_buffer_condition = Interop.downcallHandle(
                "g_io_channel_get_buffer_condition",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_get_buffer_size = Interop.downcallHandle(
                "g_io_channel_get_buffer_size",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_get_buffered = Interop.downcallHandle(
                "g_io_channel_get_buffered",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_get_close_on_unref = Interop.downcallHandle(
                "g_io_channel_get_close_on_unref",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_get_encoding = Interop.downcallHandle(
                "g_io_channel_get_encoding",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_get_flags = Interop.downcallHandle(
                "g_io_channel_get_flags",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_get_line_term = Interop.downcallHandle(
                "g_io_channel_get_line_term",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_init = Interop.downcallHandle(
                "g_io_channel_init",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_read = Interop.downcallHandle(
                "g_io_channel_read",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_read_chars = Interop.downcallHandle(
                "g_io_channel_read_chars",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_read_line = Interop.downcallHandle(
                "g_io_channel_read_line",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_read_line_string = Interop.downcallHandle(
                "g_io_channel_read_line_string",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_read_to_end = Interop.downcallHandle(
                "g_io_channel_read_to_end",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_read_unichar = Interop.downcallHandle(
                "g_io_channel_read_unichar",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_ref = Interop.downcallHandle(
                "g_io_channel_ref",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_seek = Interop.downcallHandle(
                "g_io_channel_seek",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_io_channel_seek_position = Interop.downcallHandle(
                "g_io_channel_seek_position",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_set_buffer_size = Interop.downcallHandle(
                "g_io_channel_set_buffer_size",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_io_channel_set_buffered = Interop.downcallHandle(
                "g_io_channel_set_buffered",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_io_channel_set_close_on_unref = Interop.downcallHandle(
                "g_io_channel_set_close_on_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_io_channel_set_encoding = Interop.downcallHandle(
                "g_io_channel_set_encoding",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_set_flags = Interop.downcallHandle(
                "g_io_channel_set_flags",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_set_line_term = Interop.downcallHandle(
                "g_io_channel_set_line_term",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_io_channel_shutdown = Interop.downcallHandle(
                "g_io_channel_shutdown",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_unix_get_fd = Interop.downcallHandle(
                "g_io_channel_unix_get_fd",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_unref = Interop.downcallHandle(
                "g_io_channel_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_write = Interop.downcallHandle(
                "g_io_channel_write",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_write_chars = Interop.downcallHandle(
                "g_io_channel_write_chars",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_write_unichar = Interop.downcallHandle(
                "g_io_channel_write_unichar",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_io_channel_error_from_errno = Interop.downcallHandle(
                "g_io_channel_error_from_errno",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_io_channel_error_quark = Interop.downcallHandle(
                "g_io_channel_error_quark",
                FunctionDescriptor.of(Interop.valueLayout.C_INT),
                false
        );
    }
    
    /**
     * A {@link IOChannel.Builder} object constructs a {@link IOChannel} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link IOChannel.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final IOChannel struct;
        
        private Builder() {
            struct = IOChannel.allocate();
        }
        
        /**
         * Finish building the {@link IOChannel} struct.
         * @return A new instance of {@code IOChannel} with the fields 
         *         that were set in the Builder object.
         */
        public IOChannel build() {
            return struct;
        }
        
        public Builder setRefCount(int refCount) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), refCount);
                return this;
            }
        }
        
        public Builder setFuncs(org.gtk.glib.IOFuncs funcs) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("funcs"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (funcs == null ? MemoryAddress.NULL : funcs.handle()));
                return this;
            }
        }
        
        public Builder setEncoding(java.lang.String encoding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("encoding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (encoding == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(encoding, SCOPE)));
                return this;
            }
        }
        
        public Builder setReadCd(org.gtk.glib.IConv readCd) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("read_cd"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (readCd == null ? MemoryAddress.NULL : readCd.handle()));
                return this;
            }
        }
        
        public Builder setWriteCd(org.gtk.glib.IConv writeCd) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("write_cd"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (writeCd == null ? MemoryAddress.NULL : writeCd.handle()));
                return this;
            }
        }
        
        public Builder setLineTerm(java.lang.String lineTerm) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("line_term"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lineTerm == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(lineTerm, SCOPE)));
                return this;
            }
        }
        
        public Builder setLineTermLen(int lineTermLen) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("line_term_len"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), lineTermLen);
                return this;
            }
        }
        
        public Builder setBufSize(long bufSize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("buf_size"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), bufSize);
                return this;
            }
        }
        
        public Builder setReadBuf(org.gtk.glib.GString readBuf) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("read_buf"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (readBuf == null ? MemoryAddress.NULL : readBuf.handle()));
                return this;
            }
        }
        
        public Builder setEncodedReadBuf(org.gtk.glib.GString encodedReadBuf) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("encoded_read_buf"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (encodedReadBuf == null ? MemoryAddress.NULL : encodedReadBuf.handle()));
                return this;
            }
        }
        
        public Builder setWriteBuf(org.gtk.glib.GString writeBuf) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("write_buf"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (writeBuf == null ? MemoryAddress.NULL : writeBuf.handle()));
                return this;
            }
        }
        
        public Builder setPartialWriteBuf(byte[] partialWriteBuf) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("partial_write_buf"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (partialWriteBuf == null ? MemoryAddress.NULL : Interop.allocateNativeArray(partialWriteBuf, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setUseBuffer(int useBuffer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("use_buffer"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), useBuffer);
                return this;
            }
        }
        
        public Builder setDoEncode(int doEncode) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("do_encode"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), doEncode);
                return this;
            }
        }
        
        public Builder setCloseOnUnref(int closeOnUnref) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("close_on_unref"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), closeOnUnref);
                return this;
            }
        }
        
        public Builder setIsReadable(int isReadable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_readable"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), isReadable);
                return this;
            }
        }
        
        public Builder setIsWriteable(int isWriteable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_writeable"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), isWriteable);
                return this;
            }
        }
        
        public Builder setIsSeekable(int isSeekable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_seekable"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), isSeekable);
                return this;
            }
        }
        
        public Builder setReserved1(java.lang.foreign.MemoryAddress reserved1) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reserved1"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reserved1 == null ? MemoryAddress.NULL : (Addressable) reserved1));
                return this;
            }
        }
        
        public Builder setReserved2(java.lang.foreign.MemoryAddress reserved2) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reserved2"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reserved2 == null ? MemoryAddress.NULL : (Addressable) reserved2));
                return this;
            }
        }
    }
}
