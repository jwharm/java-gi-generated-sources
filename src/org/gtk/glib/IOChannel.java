package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A data structure representing an IO Channel. The fields should be
 * considered private and should only be accessed with the following
 * functions.
 */
public class IOChannel extends io.github.jwharm.javagi.ResourceBase {

    public IOChannel(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNewFile(java.lang.String filename, java.lang.String mode) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_io_channel_new_file(Interop.allocateNativeString(filename).handle(), Interop.allocateNativeString(mode).handle(), GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Open a file {@code filename} as a {@link IOChannel} using mode {@code mode}. This
     * channel will be closed when the last reference to it is dropped,
     * so there is no need to call g_io_channel_close() (though doing
     * so will not cause problems, as long as no attempt is made to
     * access the channel after it is closed).
     */
    public static IOChannel newFile(java.lang.String filename, java.lang.String mode) throws GErrorException {
        return new IOChannel(constructNewFile(filename, mode));
    }
    
    private static Reference constructUnixNew(int fd) {
        Reference RESULT = References.get(gtk_h.g_io_channel_unix_new(fd), true);
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
     * call the g_io_channel_set_encoding() function with <code>null</code> for the
     * encoding argument.
     * <p>
     * This function is available in GLib on Windows, too, but you should
     * avoid using it on Windows. The domain of file descriptors and
     * sockets overlap. There is no way for GLib to know which one you mean
     * in case the argument you pass to this function happens to be both a
     * valid file descriptor and socket. If that happens a warning is
     * issued, and GLib assumes that it is the file descriptor you mean.
     */
    public static IOChannel unixNew(int fd) {
        return new IOChannel(constructUnixNew(fd));
    }
    
    /**
     * Flushes the write buffer for the GIOChannel.
     */
    public IOStatus flush() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_io_channel_flush(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return IOStatus.fromValue(RESULT);
    }
    
    /**
     * This function returns a {@link IOCondition} depending on whether there
     * is data to be read/space to write data in the internal buffers in
     * the {@link IOChannel}. Only the flags {@link IOCondition#IN} and {@link IOCondition#OUT} may be set.
     */
    public int getBufferCondition() {
        var RESULT = gtk_h.g_io_channel_get_buffer_condition(handle());
        return RESULT;
    }
    
    /**
     * Gets the buffer size.
     */
    public long getBufferSize() {
        var RESULT = gtk_h.g_io_channel_get_buffer_size(handle());
        return RESULT;
    }
    
    /**
     * Returns whether {@code channel} is buffered.
     */
    public boolean getBuffered() {
        var RESULT = gtk_h.g_io_channel_get_buffered(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the file/socket/whatever associated with {@code channel}
     * will be closed when {@code channel} receives its final unref and is
     * destroyed. The default value of this is <code>true</code> for channels created
     * by g_io_channel_new_file (), and <code>false</code> for all other channels.
     */
    public boolean getCloseOnUnref() {
        var RESULT = gtk_h.g_io_channel_get_close_on_unref(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the encoding for the input/output of the channel.
     * The internal encoding is always UTF-8. The encoding <code>null</code>
     * makes the channel safe for binary data.
     */
    public java.lang.String getEncoding() {
        var RESULT = gtk_h.g_io_channel_get_encoding(handle());
        return RESULT.getUtf8String(0);
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
     */
    public int getFlags() {
        var RESULT = gtk_h.g_io_channel_get_flags(handle());
        return RESULT;
    }
    
    /**
     * Initializes a {@link IOChannel} struct.
     * <p>
     * This is called by each of the above functions when creating a
     * {@link IOChannel}, and so is not often needed by the application
     * programmer (unless you are creating a new type of {@link IOChannel}).
     */
    public void init() {
        gtk_h.g_io_channel_init(handle());
    }
    
    /**
     * Increments the reference count of a {@link IOChannel}.
     */
    public IOChannel ref() {
        var RESULT = gtk_h.g_io_channel_ref(handle());
        return new IOChannel(References.get(RESULT, true));
    }
    
    /**
     * Replacement for g_io_channel_seek() with the new API.
     */
    public IOStatus seekPosition(long offset, SeekType type) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_io_channel_seek_position(handle(), offset, type.getValue(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return IOStatus.fromValue(RESULT);
    }
    
    /**
     * Sets the buffer size.
     */
    public void setBufferSize(long size) {
        gtk_h.g_io_channel_set_buffer_size(handle(), size);
    }
    
    /**
     * The buffering state can only be set if the channel's encoding
     * is <code>null</code>. For any other encoding, the channel must be buffered.
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
    public void setBuffered(boolean buffered) {
        gtk_h.g_io_channel_set_buffered(handle(), buffered ? 1 : 0);
    }
    
    /**
     * Whether to close the channel on the final unref of the {@link IOChannel}
     * data structure. The default value of this is <code>true</code> for channels
     * created by g_io_channel_new_file (), and <code>false</code> for all other channels.
     * <p>
     * Setting this flag to <code>true</code> for a channel you have already closed
     * can cause problems when the final reference to the {@link IOChannel} is dropped.
     */
    public void setCloseOnUnref(boolean doClose) {
        gtk_h.g_io_channel_set_close_on_unref(handle(), doClose ? 1 : 0);
    }
    
    /**
     * Sets the encoding for the input/output of the channel.
     * The internal encoding is always UTF-8. The default encoding
     * for the external file is UTF-8.
     * <p>
     * The encoding <code>null</code> is safe to use with binary data.
     * <p>
     * The encoding can only be set if one of the following conditions
     * is true:
     * <p>
     * <ul>
     * <li>The channel was just created, and has not been written to or read from yet.
     * </ul>
     * <p>
     * <ul>
     * <li>The channel is write-only.
     * </ul>
     * <p>
     * <ul>
     * <li>The channel is a file, and the file pointer was just repositioned
     *   by a call to g_io_channel_seek_position(). (This flushes all the
     *   internal buffers.)
     * </ul>
     * <p>
     * <ul>
     * <li>The current encoding is <code>null</code> or UTF-8.
     * </ul>
     * <p>
     * <ul>
     * <li>One of the (new API) read functions has just returned {@link IOStatus#EOF}
     *   (or, in the case of g_io_channel_read_to_end(), {@link IOStatus#NORMAL}).
     * </ul>
     * <p>
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
     */
    public IOStatus setEncoding(java.lang.String encoding) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_io_channel_set_encoding(handle(), Interop.allocateNativeString(encoding).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return IOStatus.fromValue(RESULT);
    }
    
    /**
     * Sets the (writeable) flags in {@code channel} to ({@code flags} & {@link IOFlags#SET_MASK}).
     */
    public IOStatus setFlags(int flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_io_channel_set_flags(handle(), flags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return IOStatus.fromValue(RESULT);
    }
    
    /**
     * This sets the string that {@link IOChannel} uses to determine
     * where in the file a line break occurs.
     */
    public void setLineTerm(java.lang.String lineTerm, int length) {
        gtk_h.g_io_channel_set_line_term(handle(), Interop.allocateNativeString(lineTerm).handle(), length);
    }
    
    /**
     * Close an IO channel. Any pending data to be written will be
     * flushed if {@code flush} is <code>true</code>. The channel will not be freed until the
     * last reference is dropped using g_io_channel_unref().
     */
    public IOStatus shutdown(boolean flush) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_io_channel_shutdown(handle(), flush ? 1 : 0, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return IOStatus.fromValue(RESULT);
    }
    
    /**
     * Returns the file descriptor of the {@link IOChannel}.
     * <p>
     * On Windows this function returns the file descriptor or socket of
     * the {@link IOChannel}.
     */
    public int unixGetFd() {
        var RESULT = gtk_h.g_io_channel_unix_get_fd(handle());
        return RESULT;
    }
    
    /**
     * Decrements the reference count of a {@link IOChannel}.
     */
    public void unref() {
        gtk_h.g_io_channel_unref(handle());
    }
    
    /**
     * Writes a Unicode character to {@code channel}.
     * This function cannot be called on a channel with <code>null</code> encoding.
     */
    public IOStatus writeUnichar(int thechar) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_io_channel_write_unichar(handle(), thechar, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return IOStatus.fromValue(RESULT);
    }
    
    /**
     * Converts an {@code errno} error number to a {@link IOChannelError}.
     */
    public static IOChannelError errorFromErrno(int en) {
        var RESULT = gtk_h.g_io_channel_error_from_errno(en);
        return IOChannelError.fromValue(RESULT);
    }
    
    public static Quark errorQuark() {
        var RESULT = gtk_h.g_io_channel_error_quark();
        return new Quark(RESULT);
    }
    
}
