package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link ByteReader} provides a byte reader that can read different integer and
 * floating point types from a memory buffer. It provides functions for reading
 * signed/unsigned, little/big endian integers of 8, 16, 24, 32 and 64 bits
 * and functions for reading little/big endian floating points numbers of
 * 32 and 64 bits. It also provides functions to read NUL-terminated strings
 * in various character encodings.
 */
public class ByteReader extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstByteReader";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("data"),
        Interop.valueLayout.C_INT.withName("size"),
        Interop.valueLayout.C_INT.withName("byte"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ByteReader}
     * @return A new, uninitialized @{link ByteReader}
     */
    public static ByteReader allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ByteReader newInstance = new ByteReader(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code size}
     * @return The value of the field {@code size}
     */
    public int size$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code size}
     * @param size The new value of the field {@code size}
     */
    public void size$set(int size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
    }
    
    /**
     * Get the value of the field {@code byte}
     * @return The value of the field {@code byte}
     */
    public int byte_$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("byte"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code byte}
     * @param byte_ The new value of the field {@code byte}
     */
    public void byte_$set(int byte_) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("byte"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), byte_);
    }
    
    /**
     * Create a ByteReader proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ByteReader(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Free-function: g_free
     * <p>
     * Returns a newly-allocated copy of the current data
     * position if at least {@code size} bytes are left and
     * updates the current position. Free with g_free() when no longer needed.
     * @param size Size in bytes
     * @param val address of a
     *     {@code guint8} pointer variable in which to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean dupData(Out<Integer> size, @NotNull Out<byte[]> val) {
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_dup_data.invokeExact(
                    handle(),
                    (Addressable) sizePOINTER.address(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        size.set(sizePOINTER.get(Interop.valueLayout.C_INT, 0));
        val.set(MemorySegment.ofAddress(valPOINTER.get(Interop.valueLayout.ADDRESS, 0), size.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return RESULT != 0;
    }
    
    /**
     * Free-function: g_free
     * <p>
     * Returns a newly-allocated copy of the current data position if there is
     * a NUL-terminated UTF-16 string in the data (this could be an empty string
     * as well), and advances the current position.
     * <p>
     * No input checking for valid UTF-16 is done. This function is endianness
     * agnostic - you should not assume the UTF-16 characters are in host
     * endianness.
     * <p>
     * This function will fail if no NUL-terminator was found in in the data.
     * <p>
     * Note: there is no peek or get variant of this function to ensure correct
     * byte alignment of the UTF-16 string.
     * @param str address of a
     *     {@code guint16} pointer variable in which to store the result
     * @return {@code true} if a string could be read, {@code false} otherwise. The
     *     string put into {@code str} must be freed with g_free() when no longer needed.
     */
    public boolean dupStringUtf16(@NotNull Out<short[]> str) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Free-function: g_free
     * <p>
     * Returns a newly-allocated copy of the current data position if there is
     * a NUL-terminated UTF-32 string in the data (this could be an empty string
     * as well), and advances the current position.
     * <p>
     * No input checking for valid UTF-32 is done. This function is endianness
     * agnostic - you should not assume the UTF-32 characters are in host
     * endianness.
     * <p>
     * This function will fail if no NUL-terminator was found in in the data.
     * <p>
     * Note: there is no peek or get variant of this function to ensure correct
     * byte alignment of the UTF-32 string.
     * @param str address of a
     *     {@code guint32} pointer variable in which to store the result
     * @return {@code true} if a string could be read, {@code false} otherwise. The
     *     string put into {@code str} must be freed with g_free() when no longer needed.
     */
    public boolean dupStringUtf32(@NotNull Out<int[]> str) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Free-function: g_free
     * <p>
     * FIXME:Reads (copies) a NUL-terminated string in the {@link ByteReader} instance,
     * advancing the current position to the byte after the string. This will work
     * for any NUL-terminated string with a character width of 8 bits, so ASCII,
     * UTF-8, ISO-8859-N etc. No input checking for valid UTF-8 is done.
     * <p>
     * This function will fail if no NUL-terminator was found in in the data.
     * @param str address of a
     *     {@code gchar} pointer variable in which to store the result
     * @return {@code true} if a string could be read into {@code str}, {@code false} otherwise. The
     *     string put into {@code str} must be freed with g_free() when no longer needed.
     */
    public boolean dupStringUtf8(@NotNull Out<java.lang.String[]> str) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Frees a {@link ByteReader} instance, which was previously allocated by
     * gst_byte_reader_new().
     */
    public void free() {
        try {
            DowncallHandles.gst_byte_reader_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * Returns a constant pointer to the current data
     * position if at least {@code size} bytes are left and
     * updates the current position.
     * @param size Size in bytes
     * @param val address of a
     *     {@code guint8} pointer variable in which to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getData(Out<Integer> size, @NotNull Out<byte[]> val) {
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_data.invokeExact(
                    handle(),
                    (Addressable) sizePOINTER.address(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        size.set(sizePOINTER.get(Interop.valueLayout.C_INT, 0));
        val.set(MemorySegment.ofAddress(valPOINTER.get(Interop.valueLayout.ADDRESS, 0), size.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return RESULT != 0;
    }
    
    /**
     * Read a 32 bit big endian floating point value into {@code val}
     * and update the current position.
     * @param val Pointer to a {@code gfloat} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getFloat32Be(Out<Float> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_float32_be.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a 32 bit little endian floating point value into {@code val}
     * and update the current position.
     * @param val Pointer to a {@code gfloat} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getFloat32Le(Out<Float> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_float32_le.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a 64 bit big endian floating point value into {@code val}
     * and update the current position.
     * @param val Pointer to a {@code gdouble} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getFloat64Be(Out<Double> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_float64_be.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a 64 bit little endian floating point value into {@code val}
     * and update the current position.
     * @param val Pointer to a {@code gdouble} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getFloat64Le(Out<Double> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_float64_le.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a signed 16 bit big endian integer into {@code val}
     * and update the current position.
     * @param val Pointer to a {@code gint16} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getInt16Be(Out<Short> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_SHORT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_int16_be.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_SHORT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a signed 16 bit little endian integer into {@code val}
     * and update the current position.
     * @param val Pointer to a {@code gint16} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getInt16Le(Out<Short> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_SHORT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_int16_le.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_SHORT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a signed 24 bit big endian integer into {@code val}
     * and update the current position.
     * @param val Pointer to a {@code gint32} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getInt24Be(Out<Integer> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_int24_be.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a signed 24 bit little endian integer into {@code val}
     * and update the current position.
     * @param val Pointer to a {@code gint32} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getInt24Le(Out<Integer> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_int24_le.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a signed 32 bit big endian integer into {@code val}
     * and update the current position.
     * @param val Pointer to a {@code gint32} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getInt32Be(Out<Integer> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_int32_be.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a signed 32 bit little endian integer into {@code val}
     * and update the current position.
     * @param val Pointer to a {@code gint32} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getInt32Le(Out<Integer> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_int32_le.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a signed 64 bit big endian integer into {@code val}
     * and update the current position.
     * @param val Pointer to a {@code gint64} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getInt64Be(Out<Long> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_int64_be.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a signed 64 bit little endian integer into {@code val}
     * and update the current position.
     * @param val Pointer to a {@code gint64} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getInt64Le(Out<Long> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_int64_le.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a signed 8 bit integer into {@code val} and update the current position.
     * @param val Pointer to a {@code gint8} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getInt8(Out<Byte> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_int8.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        return RESULT != 0;
    }
    
    /**
     * Returns the current position of a {@link ByteReader} instance in bytes.
     * @return The current position of {@code reader} in bytes.
     */
    public int getPos() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_pos.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the remaining number of bytes of a {@link ByteReader} instance.
     * @return The remaining number of bytes of {@code reader} instance.
     */
    public int getRemaining() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_remaining.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the total number of bytes of a {@link ByteReader} instance.
     * @return The total number of bytes of {@code reader} instance.
     */
    public int getSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns a constant pointer to the current data position if there is
     * a NUL-terminated string in the data (this could be just a NUL terminator),
     * advancing the current position to the byte after the string. This will work
     * for any NUL-terminated string with a character width of 8 bits, so ASCII,
     * UTF-8, ISO-8859-N etc.
     * <p>
     * No input checking for valid UTF-8 is done.
     * <p>
     * This function will fail if no NUL-terminator was found in in the data.
     * @param str address of a
     *     {@code gchar} pointer variable in which to store the result
     * @return {@code true} if a string could be found, {@code false} otherwise.
     */
    public boolean getStringUtf8(@NotNull Out<java.lang.String[]> str) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Initializes a {@link ByteReader} sub-reader instance to contain {@code size} bytes of
     * data from the current position of {@code reader}. This is useful to read chunked
     * formats and make sure that one doesn't read beyond the size of the sub-chunk.
     * <p>
     * Unlike gst_byte_reader_peek_sub_reader(), this function also modifies the
     * position of {@code reader} and moves it forward by {@code size} bytes.
     * @param subReader a {@link ByteReader} instance to initialize as sub-reader
     * @param size size of {@code sub_reader} in bytes
     * @return FALSE on error or if {@code reader} does not contain {@code size} more bytes from
     *     the current position, and otherwise TRUE
     */
    public boolean getSubReader(@NotNull org.gstreamer.base.ByteReader subReader, int size) {
        java.util.Objects.requireNonNull(subReader, "Parameter 'subReader' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_sub_reader.invokeExact(
                    handle(),
                    subReader.handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Read an unsigned 16 bit big endian integer into {@code val}
     * and update the current position.
     * @param val Pointer to a {@code guint16} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getUint16Be(Out<Short> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_SHORT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_uint16_be.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_SHORT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read an unsigned 16 bit little endian integer into {@code val}
     * and update the current position.
     * @param val Pointer to a {@code guint16} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getUint16Le(Out<Short> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_SHORT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_uint16_le.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_SHORT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read an unsigned 24 bit big endian integer into {@code val}
     * and update the current position.
     * @param val Pointer to a {@code guint32} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getUint24Be(Out<Integer> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_uint24_be.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read an unsigned 24 bit little endian integer into {@code val}
     * and update the current position.
     * @param val Pointer to a {@code guint32} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getUint24Le(Out<Integer> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_uint24_le.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read an unsigned 32 bit big endian integer into {@code val}
     * and update the current position.
     * @param val Pointer to a {@code guint32} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getUint32Be(Out<Integer> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_uint32_be.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read an unsigned 32 bit little endian integer into {@code val}
     * and update the current position.
     * @param val Pointer to a {@code guint32} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getUint32Le(Out<Integer> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_uint32_le.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read an unsigned 64 bit big endian integer into {@code val}
     * and update the current position.
     * @param val Pointer to a {@code guint64} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getUint64Be(Out<Long> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_uint64_be.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Read an unsigned 64 bit little endian integer into {@code val}
     * and update the current position.
     * @param val Pointer to a {@code guint64} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getUint64Le(Out<Long> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_uint64_le.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Read an unsigned 8 bit integer into {@code val} and update the current position.
     * @param val Pointer to a {@code guint8} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getUint8(Out<Byte> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_get_uint8.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        return RESULT != 0;
    }
    
    /**
     * Initializes a {@link ByteReader} instance to read from {@code data}. This function
     * can be called on already initialized instances.
     * @param data data from which
     *     the {@link ByteReader} should read
     * @param size Size of {@code data} in bytes
     */
    public void init(@NotNull byte[] data, int size) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        try {
            DowncallHandles.gst_byte_reader_init.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(data, false),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Scan for pattern {@code pattern} with applied mask {@code mask} in the byte reader data,
     * starting from offset {@code offset} relative to the current position.
     * <p>
     * The bytes in {@code pattern} and {@code mask} are interpreted left-to-right, regardless
     * of endianness.  All four bytes of the pattern must be present in the
     * byte reader data for it to match, even if the first or last bytes are masked
     * out.
     * <p>
     * It is an error to call this function without making sure that there is
     * enough data (offset+size bytes) in the byte reader.
     * @param mask mask to apply to data before matching against {@code pattern}
     * @param pattern pattern to match (after mask is applied)
     * @param offset offset from which to start scanning, relative to the current
     *     position
     * @param size number of bytes to scan from offset
     * @return offset of the first match, or -1 if no match was found.
     * <p>
     * Example:
     * <pre>{@code 
     * // Assume the reader contains 0x00 0x01 0x02 ... 0xfe 0xff
     * 
     * gst_byte_reader_masked_scan_uint32 (reader, 0xffffffff, 0x00010203, 0, 256);
     * // -> returns 0
     * gst_byte_reader_masked_scan_uint32 (reader, 0xffffffff, 0x00010203, 1, 255);
     * // -> returns -1
     * gst_byte_reader_masked_scan_uint32 (reader, 0xffffffff, 0x01020304, 1, 255);
     * // -> returns 1
     * gst_byte_reader_masked_scan_uint32 (reader, 0xffff, 0x0001, 0, 256);
     * // -> returns -1
     * gst_byte_reader_masked_scan_uint32 (reader, 0xffff, 0x0203, 0, 256);
     * // -> returns 0
     * gst_byte_reader_masked_scan_uint32 (reader, 0xffff0000, 0x02030000, 0, 256);
     * // -> returns 2
     * gst_byte_reader_masked_scan_uint32 (reader, 0xffff0000, 0x02030000, 0, 4);
     * // -> returns -1
     * }</pre>
     */
    public int maskedScanUint32(int mask, int pattern, int offset, int size) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_masked_scan_uint32.invokeExact(
                    handle(),
                    mask,
                    pattern,
                    offset,
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Scan for pattern {@code pattern} with applied mask {@code mask} in the byte reader data,
     * starting from offset {@code offset} relative to the current position.
     * <p>
     * The bytes in {@code pattern} and {@code mask} are interpreted left-to-right, regardless
     * of endianness.  All four bytes of the pattern must be present in the
     * byte reader data for it to match, even if the first or last bytes are masked
     * out.
     * <p>
     * It is an error to call this function without making sure that there is
     * enough data (offset+size bytes) in the byte reader.
     * @param mask mask to apply to data before matching against {@code pattern}
     * @param pattern pattern to match (after mask is applied)
     * @param offset offset from which to start scanning, relative to the current
     *     position
     * @param size number of bytes to scan from offset
     * @param value pointer to uint32 to return matching data
     * @return offset of the first match, or -1 if no match was found.
     */
    public int maskedScanUint32Peek(int mask, int pattern, int offset, int size, Out<Integer> value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_masked_scan_uint32_peek.invokeExact(
                    handle(),
                    mask,
                    pattern,
                    offset,
                    size,
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT;
    }
    
    /**
     * Returns a constant pointer to the current data
     * position if at least {@code size} bytes are left and
     * keeps the current position.
     * @param size Size in bytes
     * @param val address of a
     *     {@code guint8} pointer variable in which to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekData(Out<Integer> size, @NotNull Out<byte[]> val) {
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_data.invokeExact(
                    handle(),
                    (Addressable) sizePOINTER.address(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        size.set(sizePOINTER.get(Interop.valueLayout.C_INT, 0));
        val.set(MemorySegment.ofAddress(valPOINTER.get(Interop.valueLayout.ADDRESS, 0), size.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return RESULT != 0;
    }
    
    /**
     * Read a 32 bit big endian floating point value into {@code val}
     * but keep the current position.
     * @param val Pointer to a {@code gfloat} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekFloat32Be(Out<Float> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_float32_be.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a 32 bit little endian floating point value into {@code val}
     * but keep the current position.
     * @param val Pointer to a {@code gfloat} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekFloat32Le(Out<Float> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_float32_le.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a 64 bit big endian floating point value into {@code val}
     * but keep the current position.
     * @param val Pointer to a {@code gdouble} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekFloat64Be(Out<Double> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_float64_be.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a 64 bit little endian floating point value into {@code val}
     * but keep the current position.
     * @param val Pointer to a {@code gdouble} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekFloat64Le(Out<Double> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_float64_le.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a signed 16 bit big endian integer into {@code val}
     * but keep the current position.
     * @param val Pointer to a {@code gint16} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekInt16Be(Out<Short> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_SHORT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_int16_be.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_SHORT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a signed 16 bit little endian integer into {@code val}
     * but keep the current position.
     * @param val Pointer to a {@code gint16} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekInt16Le(Out<Short> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_SHORT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_int16_le.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_SHORT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a signed 24 bit big endian integer into {@code val}
     * but keep the current position.
     * @param val Pointer to a {@code gint32} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekInt24Be(Out<Integer> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_int24_be.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a signed 24 bit little endian integer into {@code val}
     * but keep the current position.
     * @param val Pointer to a {@code gint32} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekInt24Le(Out<Integer> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_int24_le.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a signed 32 bit big endian integer into {@code val}
     * but keep the current position.
     * @param val Pointer to a {@code gint32} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekInt32Be(Out<Integer> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_int32_be.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a signed 32 bit little endian integer into {@code val}
     * but keep the current position.
     * @param val Pointer to a {@code gint32} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekInt32Le(Out<Integer> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_int32_le.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a signed 64 bit big endian integer into {@code val}
     * but keep the current position.
     * @param val Pointer to a {@code gint64} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekInt64Be(Out<Long> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_int64_be.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a signed 64 bit little endian integer into {@code val}
     * but keep the current position.
     * @param val Pointer to a {@code gint64} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekInt64Le(Out<Long> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_int64_le.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Read a signed 8 bit integer into {@code val} but keep the current position.
     * @param val Pointer to a {@code gint8} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekInt8(Out<Byte> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_int8.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        return RESULT != 0;
    }
    
    /**
     * Returns a constant pointer to the current data position if there is
     * a NUL-terminated string in the data (this could be just a NUL terminator).
     * The current position will be maintained. This will work for any
     * NUL-terminated string with a character width of 8 bits, so ASCII,
     * UTF-8, ISO-8859-N etc.
     * <p>
     * No input checking for valid UTF-8 is done.
     * <p>
     * This function will fail if no NUL-terminator was found in in the data.
     * @param str address of a
     *     {@code gchar} pointer variable in which to store the result
     * @return {@code true} if a string could be skipped, {@code false} otherwise.
     */
    public boolean peekStringUtf8(@NotNull Out<java.lang.String[]> str) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Initializes a {@link ByteReader} sub-reader instance to contain {@code size} bytes of
     * data from the current position of {@code reader}. This is useful to read chunked
     * formats and make sure that one doesn't read beyond the size of the sub-chunk.
     * <p>
     * Unlike gst_byte_reader_get_sub_reader(), this function does not modify the
     * current position of {@code reader}.
     * @param subReader a {@link ByteReader} instance to initialize as sub-reader
     * @param size size of {@code sub_reader} in bytes
     * @return FALSE on error or if {@code reader} does not contain {@code size} more bytes from
     *     the current position, and otherwise TRUE
     */
    public boolean peekSubReader(@NotNull org.gstreamer.base.ByteReader subReader, int size) {
        java.util.Objects.requireNonNull(subReader, "Parameter 'subReader' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_sub_reader.invokeExact(
                    handle(),
                    subReader.handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Read an unsigned 16 bit big endian integer into {@code val}
     * but keep the current position.
     * @param val Pointer to a {@code guint16} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekUint16Be(Out<Short> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_SHORT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_uint16_be.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_SHORT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read an unsigned 16 bit little endian integer into {@code val}
     * but keep the current position.
     * @param val Pointer to a {@code guint16} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekUint16Le(Out<Short> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_SHORT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_uint16_le.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_SHORT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read an unsigned 24 bit big endian integer into {@code val}
     * but keep the current position.
     * @param val Pointer to a {@code guint32} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekUint24Be(Out<Integer> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_uint24_be.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read an unsigned 24 bit little endian integer into {@code val}
     * but keep the current position.
     * @param val Pointer to a {@code guint32} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekUint24Le(Out<Integer> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_uint24_le.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read an unsigned 32 bit big endian integer into {@code val}
     * but keep the current position.
     * @param val Pointer to a {@code guint32} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekUint32Be(Out<Integer> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_uint32_be.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read an unsigned 32 bit little endian integer into {@code val}
     * but keep the current position.
     * @param val Pointer to a {@code guint32} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekUint32Le(Out<Integer> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_uint32_le.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read an unsigned 64 bit big endian integer into {@code val}
     * but keep the current position.
     * @param val Pointer to a {@code guint64} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekUint64Be(Out<Long> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_uint64_be.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Read an unsigned 64 bit little endian integer into {@code val}
     * but keep the current position.
     * @param val Pointer to a {@code guint64} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekUint64Le(Out<Long> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_uint64_le.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Read an unsigned 8 bit integer into {@code val} but keep the current position.
     * @param val Pointer to a {@code guint8} to store the result
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekUint8(Out<Byte> val) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_peek_uint8.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        return RESULT != 0;
    }
    
    /**
     * Sets the new position of a {@link ByteReader} instance to {@code pos} in bytes.
     * @param pos The new position in bytes
     * @return {@code true} if the position could be set successfully, {@code false}
     * otherwise.
     */
    public boolean setPos(int pos) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_set_pos.invokeExact(
                    handle(),
                    pos);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Skips {@code nbytes} bytes of the {@link ByteReader} instance.
     * @param nbytes the number of bytes to skip
     * @return {@code true} if {@code nbytes} bytes could be skipped, {@code false} otherwise.
     */
    public boolean skip(int nbytes) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_skip.invokeExact(
                    handle(),
                    nbytes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Skips a NUL-terminated UTF-16 string in the {@link ByteReader} instance,
     * advancing the current position to the byte after the string.
     * <p>
     * No input checking for valid UTF-16 is done.
     * <p>
     * This function will fail if no NUL-terminator was found in in the data.
     * @return {@code true} if a string could be skipped, {@code false} otherwise.
     */
    public boolean skipStringUtf16() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_skip_string_utf16.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Skips a NUL-terminated UTF-32 string in the {@link ByteReader} instance,
     * advancing the current position to the byte after the string.
     * <p>
     * No input checking for valid UTF-32 is done.
     * <p>
     * This function will fail if no NUL-terminator was found in in the data.
     * @return {@code true} if a string could be skipped, {@code false} otherwise.
     */
    public boolean skipStringUtf32() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_skip_string_utf32.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Skips a NUL-terminated string in the {@link ByteReader} instance, advancing
     * the current position to the byte after the string. This will work for
     * any NUL-terminated string with a character width of 8 bits, so ASCII,
     * UTF-8, ISO-8859-N etc. No input checking for valid UTF-8 is done.
     * <p>
     * This function will fail if no NUL-terminator was found in in the data.
     * @return {@code true} if a string could be skipped, {@code false} otherwise.
     */
    public boolean skipStringUtf8() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_reader_skip_string_utf8.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Create a new {@link ByteReader} instance, which will read from {@code data}.
     * <p>
     * Free-function: gst_byte_reader_free
     * @param data data from which the
     *     {@link ByteReader} should read
     * @param size Size of {@code data} in bytes
     * @return a new {@link ByteReader} instance
     */
    public static @NotNull org.gstreamer.base.ByteReader new_(@NotNull byte[] data, int size) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_byte_reader_new.invokeExact(
                    Interop.allocateNativeArray(data, false),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.base.ByteReader(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_byte_reader_dup_data = Interop.downcallHandle(
            "gst_byte_reader_dup_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_dup_string_utf16 = Interop.downcallHandle(
            "gst_byte_reader_dup_string_utf16",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_dup_string_utf32 = Interop.downcallHandle(
            "gst_byte_reader_dup_string_utf32",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_dup_string_utf8 = Interop.downcallHandle(
            "gst_byte_reader_dup_string_utf8",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_free = Interop.downcallHandle(
            "gst_byte_reader_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_data = Interop.downcallHandle(
            "gst_byte_reader_get_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_float32_be = Interop.downcallHandle(
            "gst_byte_reader_get_float32_be",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_float32_le = Interop.downcallHandle(
            "gst_byte_reader_get_float32_le",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_float64_be = Interop.downcallHandle(
            "gst_byte_reader_get_float64_be",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_float64_le = Interop.downcallHandle(
            "gst_byte_reader_get_float64_le",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_int16_be = Interop.downcallHandle(
            "gst_byte_reader_get_int16_be",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_int16_le = Interop.downcallHandle(
            "gst_byte_reader_get_int16_le",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_int24_be = Interop.downcallHandle(
            "gst_byte_reader_get_int24_be",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_int24_le = Interop.downcallHandle(
            "gst_byte_reader_get_int24_le",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_int32_be = Interop.downcallHandle(
            "gst_byte_reader_get_int32_be",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_int32_le = Interop.downcallHandle(
            "gst_byte_reader_get_int32_le",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_int64_be = Interop.downcallHandle(
            "gst_byte_reader_get_int64_be",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_int64_le = Interop.downcallHandle(
            "gst_byte_reader_get_int64_le",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_int8 = Interop.downcallHandle(
            "gst_byte_reader_get_int8",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_pos = Interop.downcallHandle(
            "gst_byte_reader_get_pos",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_remaining = Interop.downcallHandle(
            "gst_byte_reader_get_remaining",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_size = Interop.downcallHandle(
            "gst_byte_reader_get_size",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_string_utf8 = Interop.downcallHandle(
            "gst_byte_reader_get_string_utf8",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_sub_reader = Interop.downcallHandle(
            "gst_byte_reader_get_sub_reader",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_uint16_be = Interop.downcallHandle(
            "gst_byte_reader_get_uint16_be",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_uint16_le = Interop.downcallHandle(
            "gst_byte_reader_get_uint16_le",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_uint24_be = Interop.downcallHandle(
            "gst_byte_reader_get_uint24_be",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_uint24_le = Interop.downcallHandle(
            "gst_byte_reader_get_uint24_le",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_uint32_be = Interop.downcallHandle(
            "gst_byte_reader_get_uint32_be",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_uint32_le = Interop.downcallHandle(
            "gst_byte_reader_get_uint32_le",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_uint64_be = Interop.downcallHandle(
            "gst_byte_reader_get_uint64_be",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_uint64_le = Interop.downcallHandle(
            "gst_byte_reader_get_uint64_le",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_get_uint8 = Interop.downcallHandle(
            "gst_byte_reader_get_uint8",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_init = Interop.downcallHandle(
            "gst_byte_reader_init",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_byte_reader_masked_scan_uint32 = Interop.downcallHandle(
            "gst_byte_reader_masked_scan_uint32",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_byte_reader_masked_scan_uint32_peek = Interop.downcallHandle(
            "gst_byte_reader_masked_scan_uint32_peek",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_data = Interop.downcallHandle(
            "gst_byte_reader_peek_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_float32_be = Interop.downcallHandle(
            "gst_byte_reader_peek_float32_be",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_float32_le = Interop.downcallHandle(
            "gst_byte_reader_peek_float32_le",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_float64_be = Interop.downcallHandle(
            "gst_byte_reader_peek_float64_be",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_float64_le = Interop.downcallHandle(
            "gst_byte_reader_peek_float64_le",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_int16_be = Interop.downcallHandle(
            "gst_byte_reader_peek_int16_be",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_int16_le = Interop.downcallHandle(
            "gst_byte_reader_peek_int16_le",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_int24_be = Interop.downcallHandle(
            "gst_byte_reader_peek_int24_be",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_int24_le = Interop.downcallHandle(
            "gst_byte_reader_peek_int24_le",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_int32_be = Interop.downcallHandle(
            "gst_byte_reader_peek_int32_be",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_int32_le = Interop.downcallHandle(
            "gst_byte_reader_peek_int32_le",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_int64_be = Interop.downcallHandle(
            "gst_byte_reader_peek_int64_be",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_int64_le = Interop.downcallHandle(
            "gst_byte_reader_peek_int64_le",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_int8 = Interop.downcallHandle(
            "gst_byte_reader_peek_int8",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_string_utf8 = Interop.downcallHandle(
            "gst_byte_reader_peek_string_utf8",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_sub_reader = Interop.downcallHandle(
            "gst_byte_reader_peek_sub_reader",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_uint16_be = Interop.downcallHandle(
            "gst_byte_reader_peek_uint16_be",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_uint16_le = Interop.downcallHandle(
            "gst_byte_reader_peek_uint16_le",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_uint24_be = Interop.downcallHandle(
            "gst_byte_reader_peek_uint24_be",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_uint24_le = Interop.downcallHandle(
            "gst_byte_reader_peek_uint24_le",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_uint32_be = Interop.downcallHandle(
            "gst_byte_reader_peek_uint32_be",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_uint32_le = Interop.downcallHandle(
            "gst_byte_reader_peek_uint32_le",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_uint64_be = Interop.downcallHandle(
            "gst_byte_reader_peek_uint64_be",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_uint64_le = Interop.downcallHandle(
            "gst_byte_reader_peek_uint64_le",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_peek_uint8 = Interop.downcallHandle(
            "gst_byte_reader_peek_uint8",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_set_pos = Interop.downcallHandle(
            "gst_byte_reader_set_pos",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_byte_reader_skip = Interop.downcallHandle(
            "gst_byte_reader_skip",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_byte_reader_skip_string_utf16 = Interop.downcallHandle(
            "gst_byte_reader_skip_string_utf16",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_skip_string_utf32 = Interop.downcallHandle(
            "gst_byte_reader_skip_string_utf32",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_skip_string_utf8 = Interop.downcallHandle(
            "gst_byte_reader_skip_string_utf8",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_byte_reader_new = Interop.downcallHandle(
            "gst_byte_reader_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ByteReader struct;
        
         /**
         * A {@link ByteReader.Build} object constructs a {@link ByteReader} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ByteReader.allocate();
        }
        
         /**
         * Finish building the {@link ByteReader} struct.
         * @return A new instance of {@code ByteReader} with the fields 
         *         that were set in the Build object.
         */
        public ByteReader construct() {
            return struct;
        }
        
        /**
         * Data from which the bit reader will
         *   read
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setData(byte[] data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : Interop.allocateNativeArray(data, false)));
            return this;
        }
        
        /**
         * Size of {@code data} in bytes
         * @param size The value for the {@code size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSize(int size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
            return this;
        }
        
        /**
         * Current byte position
         * @param byte_ The value for the {@code byte_} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setByte(int byte_) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("byte"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), byte_);
            return this;
        }
        
        public Build setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
