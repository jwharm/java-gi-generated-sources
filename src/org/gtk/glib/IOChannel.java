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
     * Open a file @filename as a #GIOChannel using mode @mode. This
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
     * Creates a new #GIOChannel given a file descriptor. On UNIX systems
     * this works for plain files, pipes, and sockets.
     * 
     * The returned #GIOChannel has a reference count of 1.
     * 
     * The default encoding for #GIOChannel is UTF-8. If your application
     * is reading output from a command using via pipe, you may need to set
     * the encoding to the encoding of the current locale (see
     * g_get_charset()) with the g_io_channel_set_encoding() function.
     * By default, the fd passed will not be closed when the final reference
     * to the #GIOChannel data structure is dropped.
     * 
     * If you want to read raw binary data without interpretation, then
     * call the g_io_channel_set_encoding() function with <code>null</code> for the
     * encoding argument.
     * 
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
     * This function returns a #GIOCondition depending on whether there
     * is data to be read/space to write data in the internal buffers in
     * the #GIOChannel. Only the flags {@link org.gtk.glib.IOCondition#IN} and {@link org.gtk.glib.IOCondition#OUT} may be set.
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
     * Returns whether @channel is buffered.
     */
    public boolean getBuffered() {
        var RESULT = gtk_h.g_io_channel_get_buffered(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the file/socket/whatever associated with @channel
     * will be closed when @channel receives its final unref and is
     * destroyed. The default value of this is <code>true</code> for channels created
     * by g_io_channel_new_file (), and <code>false</code> for all other channels.
     */
    public boolean getCloseOnUnref() {
        var RESULT = gtk_h.g_io_channel_get_close_on_unref(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the encoding for the input/output of the channel.
     * The internal encoding is always UTF-8. The encoding <code>NULL
     * makes</code> the channel safe for binary data.
     */
    public java.lang.String getEncoding() {
        var RESULT = gtk_h.g_io_channel_get_encoding(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the current flags for a #GIOChannel, including read-only
     * flags such as <code>G_IO_FLAG_IS_READABLE.
     * 
     * The</code> values of the flags {@link org.gtk.glib.IOFlags#IS_READABLE} and <code>G_IO_FLAG_IS_WRITABLE
     * are</code> cached for internal use by the channel when it is created.
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
     * Initializes a #GIOChannel struct.
     * 
     * This is called by each of the above functions when creating a
     * #GIOChannel, and so is not often needed by the application
     * programmer (unless you are creating a new type of #GIOChannel).
     */
    public void init() {
        gtk_h.g_io_channel_init(handle());
    }
    
    /**
     * Increments the reference count of a #GIOChannel.
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
     * The buffering state can only be set if the channel&#39;s encoding
     * is <code>NULL.</code> For any other encoding, the channel must be buffered.
     * 
     * A buffered channel can only be set unbuffered if the channel&#39;s
     * internal buffers have been flushed. Newly created channels or
     * channels which have returned <code>G_IO_STATUS_EOF
     * not</code> require such a flush. For write-only channels, a call to
     * g_io_channel_flush () is sufficient. For all other channels,
     * the buffers may be flushed by a call to g_io_channel_seek_position ().
     * This includes the possibility of seeking with seek type <code>G_SEEK_CUR
     * and</code> an offset of zero. Note that this means that socket-based
     * channels cannot be set unbuffered once they have had data
     * read from them.
     * 
     * On unbuffered channels, it is safe to mix read and write
     * calls from the new and old APIs, if this is necessary for
     * maintaining old code.
     * 
     * The default state of the channel is buffered.
     */
    public void setBuffered(boolean buffered) {
        gtk_h.g_io_channel_set_buffered(handle(), buffered ? 1 : 0);
    }
    
    /**
     * Whether to close the channel on the final unref of the #GIOChannel
     * data structure. The default value of this is <code>true</code> for channels
     * created by g_io_channel_new_file (), and <code>false</code> for all other channels.
     * 
     * Setting this flag to <code>true</code> for a channel you have already closed
     * can cause problems when the final reference to the #GIOChannel is dropped.
     */
    public void setCloseOnUnref(boolean doClose) {
        gtk_h.g_io_channel_set_close_on_unref(handle(), doClose ? 1 : 0);
    }
    
    /**
     * Sets the encoding for the input/output of the channel.
     * The internal encoding is always UTF-8. The default encoding
     * for the external file is UTF-8.
     * 
     * The encoding <code>null</code> is safe to use with binary data.
     * 
     * The encoding can only be set if one of the following conditions
     * is true:
     * 
     * - The channel was just created, and has not been written to or read from yet.
     * 
     * - The channel is write-only.
     * 
     * - The channel is a file, and the file pointer was just repositioned
     *   by a call to g_io_channel_seek_position(). (This flushes all the
     *   internal buffers.)
     * 
     * - The current encoding is <code>null</code> or UTF-8.
     * 
     * - One of the (new API) read functions has just returned <code>G_IO_STATUS_EOF
     * </code>  (or, in the case of g_io_channel_read_to_end(), <code>G_IO_STATUS_NORMAL).
     * 
     * -</code>  One of the functions g_io_channel_read_chars() or
     *    g_io_channel_read_unichar() has returned {@link org.gtk.glib.IOStatus#AGAIN} or
     *    <code>G_IO_STATUS_ERROR.</code> This may be useful in the case of
     *    <code>G_CONVERT_ERROR_ILLEGAL_SEQUENCE.
     * </code>   Returning one of these statuses from g_io_channel_read_line(),
     *    g_io_channel_read_line_string(), or g_io_channel_read_to_end()
     *    does not guarantee that the encoding can be changed.
     * 
     * Channels which do not meet one of the above conditions cannot call
     * g_io_channel_seek_position() with an offset of <code>G_SEEK_CUR,</code> and, if
     * they are &#34;seekable&#34;, cannot call g_io_channel_write_chars() after
     * calling one of the API &#34;read&#34; functions.
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
     * Sets the (writeable) flags in @channel to (@flags &#38; 
     *             
     *           
     *         
     *       
     *       
     *         Sets the (writeable) flags in @channel to (@flags &#38; %G_IO_FLAG_SET_MASK).
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
     * This sets the string that #GIOChannel uses to determine
     * where in the file a line break occurs.
     */
    public void setLineTerm(java.lang.String lineTerm, int length) {
        gtk_h.g_io_channel_set_line_term(handle(), Interop.allocateNativeString(lineTerm).handle(), length);
    }
    
    /**
     * Close an IO channel. Any pending data to be written will be
     * flushed if @flush is <code>TRUE.</code> The channel will not be freed until the
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
     * Returns the file descriptor of the #GIOChannel.
     * 
     * On Windows this function returns the file descriptor or socket of
     * the #GIOChannel.
     */
    public int unixGetFd() {
        var RESULT = gtk_h.g_io_channel_unix_get_fd(handle());
        return RESULT;
    }
    
    /**
     * Decrements the reference count of a #GIOChannel.
     */
    public void unref() {
        gtk_h.g_io_channel_unref(handle());
    }
    
    /**
     * Writes a Unicode character to @channel.
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
     * Converts an <code>errno</code> error number to a #GIOChannelError.
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
