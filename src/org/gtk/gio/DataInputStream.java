package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Data input stream implements {@link InputStream} and includes functions for
 * reading structured data directly from a binary input stream.
 */
public class DataInputStream extends BufferedInputStream implements Seekable {

    public DataInputStream(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DataInputStream */
    public static DataInputStream castFrom(org.gtk.gobject.Object gobject) {
        return new DataInputStream(gobject.getReference());
    }
    
    private static Reference constructNew(InputStream baseStream) {
        Reference RESULT = References.get(gtk_h.g_data_input_stream_new(baseStream.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new data input stream for the {@code base_stream}.
     */
    public DataInputStream(InputStream baseStream) {
        super(constructNew(baseStream));
    }
    
    /**
     * Gets the byte order for the data input stream.
     */
    public DataStreamByteOrder getByteOrder() {
        var RESULT = gtk_h.g_data_input_stream_get_byte_order(handle());
        return new DataStreamByteOrder(RESULT);
    }
    
    /**
     * Gets the current newline type for the {@code stream}.
     */
    public DataStreamNewlineType getNewlineType() {
        var RESULT = gtk_h.g_data_input_stream_get_newline_type(handle());
        return new DataStreamNewlineType(RESULT);
    }
    
    /**
     * Reads an unsigned 8-bit/1-byte value from {@code stream}.
     */
    public byte readByte(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_input_stream_read_byte(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Reads a 16-bit/2-byte value from {@code stream}.
     * <p>
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     */
    public short readInt16(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_input_stream_read_int16(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
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
     */
    public int readInt32(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_input_stream_read_int32(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
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
     */
    public long readInt64(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_input_stream_read_int64(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * The asynchronous version of g_data_input_stream_read_line().  It is
     * an error to have two outstanding calls to this function.
     * <p>
     * When the operation is finished, {@code callback} will be called. You
     * can then call g_data_input_stream_read_line_finish() to get
     * the result of the operation.
     */
    public void readLineAsync(int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_data_input_stream_read_line_async(handle(), ioPriority, cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Finish an asynchronous call started by
     * g_data_input_stream_read_line_async().
     */
    public java.lang.String readLineFinishUtf8(AsyncResult result, PointerLong length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_input_stream_read_line_finish_utf8(handle(), result.handle(), length.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Reads a UTF-8 encoded line from the data input stream.
     * <p>
     * If {@code cancellable} is not {@code null}, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error {@link IOErrorEnum#CANCELLED} will be returned.
     */
    public java.lang.String readLineUtf8(PointerLong length, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_input_stream_read_line_utf8(handle(), length.handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Reads an unsigned 16-bit/2-byte value from {@code stream}.
     * <p>
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     */
    public short readUint16(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_input_stream_read_uint16(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
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
     */
    public int readUint32(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_input_stream_read_uint32(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
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
     */
    public long readUint64(Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_input_stream_read_uint64(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
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
     */
    public java.lang.String readUpto(java.lang.String stopChars, long stopCharsLen, PointerLong length, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_input_stream_read_upto(handle(), Interop.allocateNativeString(stopChars).handle(), stopCharsLen, length.handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
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
     */
    public void readUptoAsync(java.lang.String stopChars, long stopCharsLen, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            gtk_h.g_data_input_stream_read_upto_async(handle(), Interop.allocateNativeString(stopChars).handle(), stopCharsLen, ioPriority, cancellable.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gio.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
     */
    public java.lang.String readUptoFinish(AsyncResult result, PointerLong length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_input_stream_read_upto_finish(handle(), result.handle(), length.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * This function sets the byte order for the given {@code stream}. All subsequent
     * reads from the {@code stream} will be read in the given {@code order}.
     */
    public void setByteOrder(DataStreamByteOrder order) {
        gtk_h.g_data_input_stream_set_byte_order(handle(), order.getValue());
    }
    
    /**
     * Sets the newline type for the {@code stream}.
     * <p>
     * Note that using G_DATA_STREAM_NEWLINE_TYPE_ANY is slightly unsafe. If a read
     * chunk ends in "CR" we must read an additional byte to know if this is "CR" or
     * "CR LF", and this might block if there is no more data available.
     */
    public void setNewlineType(DataStreamNewlineType type) {
        gtk_h.g_data_input_stream_set_newline_type(handle(), type.getValue());
    }
    
}
