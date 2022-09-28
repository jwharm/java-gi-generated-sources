package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Data output stream implements {@link OutputStream} and includes functions for
 * writing data directly to an output stream.
 */
public class DataOutputStream extends FilterOutputStream implements Seekable {

    public DataOutputStream(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DataOutputStream */
    public static DataOutputStream castFrom(org.gtk.gobject.Object gobject) {
        return new DataOutputStream(gobject.getReference());
    }
    
    private static Reference constructNew(OutputStream baseStream) {
        Reference RESULT = References.get(gtk_h.g_data_output_stream_new(baseStream.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new data output stream for {@code base_stream}.
     */
    public DataOutputStream(OutputStream baseStream) {
        super(constructNew(baseStream));
    }
    
    /**
     * Gets the byte order for the stream.
     */
    public DataStreamByteOrder getByteOrder() {
        var RESULT = gtk_h.g_data_output_stream_get_byte_order(handle());
        return new DataStreamByteOrder(RESULT);
    }
    
    /**
     * Puts a byte into the output stream.
     */
    public boolean putByte(byte data, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_output_stream_put_byte(handle(), data, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Puts a signed 16-bit integer into the output stream.
     */
    public boolean putInt16(short data, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_output_stream_put_int16(handle(), data, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Puts a signed 32-bit integer into the output stream.
     */
    public boolean putInt32(int data, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_output_stream_put_int32(handle(), data, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Puts a signed 64-bit integer into the stream.
     */
    public boolean putInt64(long data, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_output_stream_put_int64(handle(), data, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Puts a string into the output stream.
     */
    public boolean putString(java.lang.String str, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_output_stream_put_string(handle(), Interop.allocateNativeString(str).handle(), cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Puts an unsigned 16-bit integer into the output stream.
     */
    public boolean putUint16(short data, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_output_stream_put_uint16(handle(), data, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Puts an unsigned 32-bit integer into the stream.
     */
    public boolean putUint32(int data, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_output_stream_put_uint32(handle(), data, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Puts an unsigned 64-bit integer into the stream.
     */
    public boolean putUint64(long data, Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_data_output_stream_put_uint64(handle(), data, cancellable.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the byte order of the data output stream to {@code order}.
     */
    public void setByteOrder(DataStreamByteOrder order) {
        gtk_h.g_data_output_stream_set_byte_order(handle(), order.getValue());
    }
    
}
