package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Data input stream implements #GInputStream and includes functions for
 * reading structured data directly from a binary input stream.
 */
public class DataInputStream extends BufferedInputStream implements Seekable {

    public DataInputStream(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DataInputStream */
    public static DataInputStream castFrom(org.gtk.gobject.Object gobject) {
        return new DataInputStream(gobject.getReference());
    }
    
    /**
     * Creates a new data input stream for the @base_stream.
     */
    public DataInputStream(InputStream baseStream) {
        super(References.get(gtk_h.g_data_input_stream_new(baseStream.handle()), true));
    }
    
    /**
     * Gets the byte order for the data input stream.
     */
    public DataStreamByteOrder getByteOrder() {
        var RESULT = gtk_h.g_data_input_stream_get_byte_order(handle());
        return DataStreamByteOrder.fromValue(RESULT);
    }
    
    /**
     * Gets the current newline type for the @stream.
     */
    public DataStreamNewlineType getNewlineType() {
        var RESULT = gtk_h.g_data_input_stream_get_newline_type(handle());
        return DataStreamNewlineType.fromValue(RESULT);
    }
    
    /**
     * Reads an unsigned 8-bit/1-byte value from @stream.
     */
    public byte readByte(Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_input_stream_read_byte(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Reads a 16-bit/2-byte value from @stream.
     * 
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     */
    public short readInt16(Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_input_stream_read_int16(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Reads a signed 32-bit/4-byte value from @stream.
     * 
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     * 
     * If @cancellable is not %NULL, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     */
    public int readInt32(Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_input_stream_read_int32(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Reads a 64-bit/8-byte value from @stream.
     * 
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     * 
     * If @cancellable is not %NULL, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     */
    public long readInt64(Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
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
     * 
     * When the operation is finished, @callback will be called. You
     * can then call g_data_input_stream_read_line_finish() to get
     * the result of the operation.
     */
    public void readLineAsync(DataInputStream stream, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            int hash = callback.hashCode();
            Interop.signalRegistry.put(hash, callback);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_data_input_stream_read_line_async(handle(), ioPriority, cancellable.handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Reads an unsigned 16-bit/2-byte value from @stream.
     * 
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     */
    public short readUint16(Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_input_stream_read_uint16(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Reads an unsigned 32-bit/4-byte value from @stream.
     * 
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order() and g_data_input_stream_set_byte_order().
     * 
     * If @cancellable is not %NULL, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     */
    public int readUint32(Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_input_stream_read_uint32(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Reads an unsigned 64-bit/8-byte value from @stream.
     * 
     * In order to get the correct byte order for this read operation,
     * see g_data_input_stream_get_byte_order().
     * 
     * If @cancellable is not %NULL, then the operation can be cancelled by
     * triggering the cancellable object from another thread. If the operation
     * was cancelled, the error %G_IO_ERROR_CANCELLED will be returned.
     */
    public long readUint64(Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_input_stream_read_uint64(handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * The asynchronous version of g_data_input_stream_read_upto().
     * It is an error to have two outstanding calls to this function.
     * 
     * In contrast to g_data_input_stream_read_until(), this function
     * does not consume the stop character. You have to use
     * g_data_input_stream_read_byte() to get it before calling
     * g_data_input_stream_read_upto() again.
     * 
     * Note that @stop_chars may contain '\\0' if @stop_chars_len is
     * specified.
     * 
     * When the operation is finished, @callback will be called. You
     * can then call g_data_input_stream_read_upto_finish() to get
     * the result of the operation.
     */
    public void readUptoAsync(DataInputStream stream, java.lang.String stopChars, long stopCharsLen, int ioPriority, Cancellable cancellable, AsyncReadyCallback callback) {
        try {
            int hash = callback.hashCode();
            Interop.signalRegistry.put(hash, callback);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbAsyncReadyCallback", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_data_input_stream_read_upto_async(handle(), Interop.allocateNativeString(stopChars).handle(), stopCharsLen, ioPriority, cancellable.handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * This function sets the byte order for the given @stream. All subsequent
     * reads from the @stream will be read in the given @order.
     */
    public void setByteOrder(DataStreamByteOrder order) {
        gtk_h.g_data_input_stream_set_byte_order(handle(), order.getValue());
    }
    
    /**
     * Sets the newline type for the @stream.
     * 
     * Note that using G_DATA_STREAM_NEWLINE_TYPE_ANY is slightly unsafe. If a read
     * chunk ends in "CR" we must read an additional byte to know if this is "CR" or
     * "CR LF", and this might block if there is no more data available.
     */
    public void setNewlineType(DataStreamNewlineType type) {
        gtk_h.g_data_input_stream_set_newline_type(handle(), type.getValue());
    }
    
}
