package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Data output stream implements #GOutputStream and includes functions for
 * writing data directly to an output stream.
 */
public class DataOutputStream extends FilterOutputStream implements Seekable {

    public DataOutputStream(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DataOutputStream */
    public static DataOutputStream castFrom(org.gtk.gobject.Object gobject) {
        return new DataOutputStream(gobject.getReference());
    }
    
    /**
     * Creates a new data output stream for @base_stream.
     */
    public DataOutputStream(OutputStream baseStream) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_data_output_stream_new(baseStream.HANDLE()), true));
    }
    
    /**
     * Gets the byte order for the stream.
     */
    public DataStreamByteOrder getByteOrder() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_data_output_stream_get_byte_order(HANDLE());
        return DataStreamByteOrder.fromValue(RESULT);
    }
    
    /**
     * Puts a byte into the output stream.
     */
    public boolean putByte(byte data, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_data_output_stream_put_byte(HANDLE(), data, cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Puts a signed 16-bit integer into the output stream.
     */
    public boolean putInt16(short data, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_data_output_stream_put_int16(HANDLE(), data, cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Puts a signed 32-bit integer into the output stream.
     */
    public boolean putInt32(int data, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_data_output_stream_put_int32(HANDLE(), data, cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Puts a signed 64-bit integer into the stream.
     */
    public boolean putInt64(long data, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_data_output_stream_put_int64(HANDLE(), data, cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Puts a string into the output stream.
     */
    public boolean putString(java.lang.String str, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_data_output_stream_put_string(HANDLE(), Interop.allocateNativeString(str).HANDLE(), cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Puts an unsigned 16-bit integer into the output stream.
     */
    public boolean putUint16(short data, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_data_output_stream_put_uint16(HANDLE(), data, cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Puts an unsigned 32-bit integer into the stream.
     */
    public boolean putUint32(int data, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_data_output_stream_put_uint32(HANDLE(), data, cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Puts an unsigned 64-bit integer into the stream.
     */
    public boolean putUint64(long data, Cancellable cancellable) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_data_output_stream_put_uint64(HANDLE(), data, cancellable.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets the byte order of the data output stream to @order.
     */
    public void setByteOrder(DataStreamByteOrder order) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_data_output_stream_set_byte_order(HANDLE(), order.getValue());
    }
    
}
