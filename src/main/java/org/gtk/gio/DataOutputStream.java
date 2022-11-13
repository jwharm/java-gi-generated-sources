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
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.FilterOutputStream.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gio.FilterOutputStream parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gio.FilterOutputStream(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a DataOutputStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DataOutputStream(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to DataOutputStream if its GType is a (or inherits from) "GDataOutputStream".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DataOutputStream} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GDataOutputStream", a ClassCastException will be thrown.
     */
    public static DataOutputStream castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GDataOutputStream"))) {
            return new DataOutputStream(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GDataOutputStream");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gio.OutputStream baseStream) {
        java.util.Objects.requireNonNull(baseStream, "Parameter 'baseStream' must not be null");
        Addressable RESULT;
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
    public DataOutputStream(@NotNull org.gtk.gio.OutputStream baseStream) {
        super(constructNew(baseStream), Ownership.FULL);
    }
    
    /**
     * Gets the byte order for the stream.
     * @return the {@link DataStreamByteOrder} for the {@code stream}.
     */
    public @NotNull org.gtk.gio.DataStreamByteOrder getByteOrder() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_data_output_stream_get_byte_order.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DataStreamByteOrder(RESULT);
    }
    
    /**
     * Puts a byte into the output stream.
     * @param data a {@code guchar}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} if {@code data} was successfully added to the {@code stream}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean putByte(byte data, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
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
        return RESULT != 0;
    }
    
    /**
     * Puts a signed 16-bit integer into the output stream.
     * @param data a {@code gint16}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} if {@code data} was successfully added to the {@code stream}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean putInt16(short data, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
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
        return RESULT != 0;
    }
    
    /**
     * Puts a signed 32-bit integer into the output stream.
     * @param data a {@code gint32}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} if {@code data} was successfully added to the {@code stream}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean putInt32(int data, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
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
        return RESULT != 0;
    }
    
    /**
     * Puts a signed 64-bit integer into the stream.
     * @param data a {@code gint64}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} if {@code data} was successfully added to the {@code stream}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean putInt64(long data, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
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
        return RESULT != 0;
    }
    
    /**
     * Puts a string into the output stream.
     * @param str a string.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} if {@code string} was successfully added to the {@code stream}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean putString(@NotNull java.lang.String str, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_data_output_stream_put_string.invokeExact(
                    handle(),
                    Interop.allocateNativeString(str),
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Puts an unsigned 16-bit integer into the output stream.
     * @param data a {@code guint16}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} if {@code data} was successfully added to the {@code stream}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean putUint16(short data, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
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
        return RESULT != 0;
    }
    
    /**
     * Puts an unsigned 32-bit integer into the stream.
     * @param data a {@code guint32}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} if {@code data} was successfully added to the {@code stream}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean putUint32(int data, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
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
        return RESULT != 0;
    }
    
    /**
     * Puts an unsigned 64-bit integer into the stream.
     * @param data a {@code guint64}.
     * @param cancellable optional {@link Cancellable} object, {@code null} to ignore.
     * @return {@code true} if {@code data} was successfully added to the {@code stream}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean putUint64(long data, @Nullable org.gtk.gio.Cancellable cancellable) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
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
        return RESULT != 0;
    }
    
    /**
     * Sets the byte order of the data output stream to {@code order}.
     * @param order a {@code GDataStreamByteOrder}.
     */
    public void setByteOrder(@NotNull org.gtk.gio.DataStreamByteOrder order) {
        java.util.Objects.requireNonNull(order, "Parameter 'order' must not be null");
        try {
            DowncallHandles.g_data_output_stream_set_byte_order.invokeExact(
                    handle(),
                    order.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_data_output_stream_new = Interop.downcallHandle(
            "g_data_output_stream_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_data_output_stream_get_byte_order = Interop.downcallHandle(
            "g_data_output_stream_get_byte_order",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_data_output_stream_put_byte = Interop.downcallHandle(
            "g_data_output_stream_put_byte",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_data_output_stream_put_int16 = Interop.downcallHandle(
            "g_data_output_stream_put_int16",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_data_output_stream_put_int32 = Interop.downcallHandle(
            "g_data_output_stream_put_int32",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_data_output_stream_put_int64 = Interop.downcallHandle(
            "g_data_output_stream_put_int64",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_data_output_stream_put_string = Interop.downcallHandle(
            "g_data_output_stream_put_string",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_data_output_stream_put_uint16 = Interop.downcallHandle(
            "g_data_output_stream_put_uint16",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_SHORT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_data_output_stream_put_uint32 = Interop.downcallHandle(
            "g_data_output_stream_put_uint32",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_data_output_stream_put_uint64 = Interop.downcallHandle(
            "g_data_output_stream_put_uint64",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_data_output_stream_set_byte_order = Interop.downcallHandle(
            "g_data_output_stream_set_byte_order",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
}
