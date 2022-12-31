package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data output stream implements {@link OutputStream} and includes functions for
 * writing data directly to an output stream.
 */
public class DataOutputStream extends org.gtk.gio.FilterOutputStream implements org.gtk.gio.Seekable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDataOutputStream";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.FilterOutputStream.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a DataOutputStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DataOutputStream(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DataOutputStream> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DataOutputStream(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.gio.OutputStream baseStream) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_data_output_stream_new.invokeExact(
                    baseStream.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new data output stream for {@code base_stream}.
     * @param baseStream a {@link OutputStream}.
     */
    public DataOutputStream(org.gtk.gio.OutputStream baseStream) {
        super(constructNew(baseStream), Ownership.FULL);
    }
    
    /**
     * Gets the byte order for the stream.
     * @return the {@link DataStreamByteOrder} for the {@code stream}.
     */
    public org.gtk.gio.DataStreamByteOrder getByteOrder() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_data_output_stream_get_byte_order.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.DataStreamByteOrder.of(RESULT);
    }
    
    /**
     * Puts a byte into the output stream.
     * @param data a {@code guchar}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} if {@code data} was successfully added to the {@code stream}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean putByte(byte data, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_data_output_stream_put_byte.invokeExact(
                    handle(),
                    data,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Puts a signed 16-bit integer into the output stream.
     * @param data a {@code gint16}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} if {@code data} was successfully added to the {@code stream}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean putInt16(short data, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_data_output_stream_put_int16.invokeExact(
                    handle(),
                    data,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Puts a signed 32-bit integer into the output stream.
     * @param data a {@code gint32}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} if {@code data} was successfully added to the {@code stream}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean putInt32(int data, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_data_output_stream_put_int32.invokeExact(
                    handle(),
                    data,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Puts a signed 64-bit integer into the stream.
     * @param data a {@code gint64}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} if {@code data} was successfully added to the {@code stream}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean putInt64(long data, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_data_output_stream_put_int64.invokeExact(
                    handle(),
                    data,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Puts a string into the output stream.
     * @param str a string.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} if {@code string} was successfully added to the {@code stream}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean putString(java.lang.String str, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_data_output_stream_put_string.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(str, null),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Puts an unsigned 16-bit integer into the output stream.
     * @param data a {@code guint16}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} if {@code data} was successfully added to the {@code stream}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean putUint16(short data, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_data_output_stream_put_uint16.invokeExact(
                    handle(),
                    data,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Puts an unsigned 32-bit integer into the stream.
     * @param data a {@code guint32}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} if {@code data} was successfully added to the {@code stream}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean putUint32(int data, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_data_output_stream_put_uint32.invokeExact(
                    handle(),
                    data,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Puts an unsigned 64-bit integer into the stream.
     * @param data a {@code guint64}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} if {@code data} was successfully added to the {@code stream}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean putUint64(long data, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_data_output_stream_put_uint64.invokeExact(
                    handle(),
                    data,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the byte order of the data output stream to {@code order}.
     * @param order a {@code GDataStreamByteOrder}.
     */
    public void setByteOrder(org.gtk.gio.DataStreamByteOrder order) {
        try {
            DowncallHandles.g_data_output_stream_set_byte_order.invokeExact(
                    handle(),
                    order.getValue());
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
            RESULT = (long) DowncallHandles.g_data_output_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link DataOutputStream.Builder} object constructs a {@link DataOutputStream} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DataOutputStream.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.FilterOutputStream.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DataOutputStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DataOutputStream}.
         * @return A new instance of {@code DataOutputStream} with the properties 
         *         that were set in the Builder object.
         */
        public DataOutputStream build() {
            return (DataOutputStream) org.gtk.gobject.GObject.newWithProperties(
                DataOutputStream.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Determines the byte ordering that is used when writing
         * multi-byte entities (such as integers) to the stream.
         * @param byteOrder The value for the {@code byte-order} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setByteOrder(org.gtk.gio.DataStreamByteOrder byteOrder) {
            names.add("byte-order");
            values.add(org.gtk.gobject.Value.create(byteOrder));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_data_output_stream_new = Interop.downcallHandle(
            "g_data_output_stream_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_data_output_stream_get_byte_order = Interop.downcallHandle(
            "g_data_output_stream_get_byte_order",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_data_output_stream_put_byte = Interop.downcallHandle(
            "g_data_output_stream_put_byte",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_data_output_stream_put_int16 = Interop.downcallHandle(
            "g_data_output_stream_put_int16",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_data_output_stream_put_int32 = Interop.downcallHandle(
            "g_data_output_stream_put_int32",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_data_output_stream_put_int64 = Interop.downcallHandle(
            "g_data_output_stream_put_int64",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_data_output_stream_put_string = Interop.downcallHandle(
            "g_data_output_stream_put_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_data_output_stream_put_uint16 = Interop.downcallHandle(
            "g_data_output_stream_put_uint16",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_data_output_stream_put_uint32 = Interop.downcallHandle(
            "g_data_output_stream_put_uint32",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_data_output_stream_put_uint64 = Interop.downcallHandle(
            "g_data_output_stream_put_uint64",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_data_output_stream_set_byte_order = Interop.downcallHandle(
            "g_data_output_stream_set_byte_order",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_data_output_stream_get_type = Interop.downcallHandle(
            "g_data_output_stream_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
