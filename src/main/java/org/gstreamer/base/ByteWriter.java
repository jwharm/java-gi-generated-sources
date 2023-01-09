package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link ByteWriter} provides a byte writer and reader that can write/read different
 * integer and floating point types to/from a memory buffer. It provides functions
 * for writing/reading signed/unsigned, little/big endian integers of 8, 16, 24,
 * 32 and 64 bits and functions for reading little/big endian floating points numbers of
 * 32 and 64 bits. It also provides functions to write/read NUL-terminated strings
 * in various character encodings.
 */
public class ByteWriter extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstByteWriter";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.ByteReader.getMemoryLayout().withName("parent"),
            Interop.valueLayout.C_INT.withName("alloc_size"),
            Interop.valueLayout.C_INT.withName("fixed"),
            Interop.valueLayout.C_INT.withName("owned"),
            MemoryLayout.paddingLayout(96),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ByteWriter}
     * @return A new, uninitialized @{link ByteWriter}
     */
    public static ByteWriter allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ByteWriter newInstance = new ByteWriter(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gstreamer.base.ByteReader getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gstreamer.base.ByteReader.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gstreamer.base.ByteReader parent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code alloc_size}
     * @return The value of the field {@code alloc_size}
     */
    public int getAllocSize() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc_size"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code alloc_size}
     * @param allocSize The new value of the field {@code alloc_size}
     */
    public void setAllocSize(int allocSize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), allocSize);
        }
    }
    
    /**
     * Get the value of the field {@code fixed}
     * @return The value of the field {@code fixed}
     */
    public boolean getFixed() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fixed"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code fixed}
     * @param fixed The new value of the field {@code fixed}
     */
    public void setFixed(boolean fixed) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fixed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(fixed, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code owned}
     * @return The value of the field {@code owned}
     */
    public boolean getOwned() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("owned"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code owned}
     * @param owned The new value of the field {@code owned}
     */
    public void setOwned(boolean owned) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("owned"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(owned, null).intValue());
        }
    }
    
    /**
     * Create a ByteWriter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ByteWriter(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ByteWriter> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ByteWriter(input);
    
    /**
     * Checks if enough free space from the current write cursor is
     * available and reallocates if necessary.
     * @param size Number of bytes that should be available
     * @return {@code true} if at least {@code size} bytes are still available
     */
    public boolean ensureFreeSpace(int size) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_ensure_free_space.invokeExact(
                    handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes {@code size} bytes containing {@code value} to {@code writer}.
     * @param value Value to be written
     * @param size Number of bytes to be written
     * @return {@code true} if the value could be written
     */
    public boolean fill(byte value, int size) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_fill.invokeExact(
                    handle(),
                    value,
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Frees {@code writer} and all memory allocated by it.
     */
    public void free() {
        try {
            DowncallHandles.gst_byte_writer_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * Frees {@code writer} and all memory allocated by it except
     * the current data, which is returned as {@link org.gstreamer.gst.Buffer}.
     * <p>
     * Free-function: gst_buffer_unref
     * @return the current data as buffer. gst_buffer_unref()
     *     after usage.
     */
    public org.gstreamer.gst.Buffer freeAndGetBuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_byte_writer_free_and_get_buffer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Frees {@code writer} and all memory allocated by it except
     * the current data, which is returned.
     * <p>
     * Free-function: g_free
     * @return the current data. g_free() after usage.
     */
    public PointerByte freeAndGetData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_byte_writer_free_and_get_data.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        return new PointerByte(RESULT);
    }
    
    /**
     * Returns the remaining size of data that can still be written. If
     * -1 is returned the remaining size is only limited by system resources.
     * @return the remaining size of data that can still be written
     */
    public int getRemaining() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_get_remaining.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Initializes {@code writer} to an empty instance
     */
    public void init() {
        try {
            DowncallHandles.gst_byte_writer_init.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes {@code writer} with the given
     * memory area. If {@code initialized} is {@code true} it is possible to
     * read {@code size} bytes from the {@link ByteWriter} from the beginning.
     * @param data Memory area for writing
     * @param size Size of {@code data} in bytes
     * @param initialized If {@code true} the complete data can be read from the beginning
     */
    public void initWithData(byte[] data, int size, boolean initialized) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_byte_writer_init_with_data.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(data, false, SCOPE),
                        size,
                        Marshal.booleanToInteger.marshal(initialized, null).intValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Initializes {@code writer} with the given initial data size.
     * @param size Initial size of data
     * @param fixed If {@code true} the data can't be reallocated
     */
    public void initWithSize(int size, boolean fixed) {
        try {
            DowncallHandles.gst_byte_writer_init_with_size.invokeExact(
                    handle(),
                    size,
                    Marshal.booleanToInteger.marshal(fixed, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Writes {@code size} bytes of {@code data} to {@code writer}.
     * @param buffer source {@link org.gstreamer.gst.Buffer}
     * @param offset offset to copy from
     * @param size total size to copy. If -1, all data is copied
     * @return {@code true} if the data could be written
     */
    public boolean putBuffer(org.gstreamer.gst.Buffer buffer, long offset, long size) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_buffer.invokeExact(
                    handle(),
                    buffer.handle(),
                    offset,
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes {@code size} bytes of {@code data} to {@code writer}.
     * @param data Data to write
     * @param size Size of {@code data} in bytes
     * @return {@code true} if the value could be written
     */
    public boolean putData(byte[] data, int size) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_byte_writer_put_data.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(data, false, SCOPE),
                        size);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Writes a big endian 32 bit float to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putFloat32Be(float val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_float32_be.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes a little endian 32 bit float to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putFloat32Le(float val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_float32_le.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes a big endian 64 bit float to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putFloat64Be(double val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_float64_be.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes a little endian 64 bit float to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putFloat64Le(double val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_float64_le.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes a signed big endian 16 bit integer to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putInt16Be(short val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_int16_be.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes a signed little endian 16 bit integer to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putInt16Le(short val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_int16_le.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes a signed big endian 24 bit integer to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putInt24Be(int val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_int24_be.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes a signed little endian 24 bit integer to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putInt24Le(int val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_int24_le.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes a signed big endian 32 bit integer to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putInt32Be(int val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_int32_be.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes a signed little endian 32 bit integer to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putInt32Le(int val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_int32_le.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes a signed big endian 64 bit integer to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putInt64Be(long val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_int64_be.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes a signed little endian 64 bit integer to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putInt64Le(long val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_int64_le.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes a signed 8 bit integer to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putInt8(byte val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_int8.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes a NUL-terminated UTF16 string to {@code writer} (including the terminator).
     * @param data UTF16 string to write
     * @return {@code true} if the value could be written
     */
    public boolean putStringUtf16(short[] data) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_byte_writer_put_string_utf16.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(data, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Writes a NUL-terminated UTF32 string to {@code writer} (including the terminator).
     * @param data UTF32 string to write
     * @return {@code true} if the value could be written
     */
    public boolean putStringUtf32(int[] data) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_byte_writer_put_string_utf32.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(data, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Writes a NUL-terminated UTF8 string to {@code writer} (including the terminator).
     * @param data UTF8 string to write
     * @return {@code true} if the value could be written
     */
    public boolean putStringUtf8(java.lang.String data) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_byte_writer_put_string_utf8.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(data, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Writes a unsigned big endian 16 bit integer to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putUint16Be(short val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_uint16_be.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes a unsigned little endian 16 bit integer to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putUint16Le(short val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_uint16_le.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes a unsigned big endian 24 bit integer to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putUint24Be(int val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_uint24_be.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes a unsigned little endian 24 bit integer to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putUint24Le(int val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_uint24_le.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes a unsigned big endian 32 bit integer to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putUint32Be(int val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_uint32_be.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes a unsigned little endian 32 bit integer to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putUint32Le(int val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_uint32_le.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes a unsigned big endian 64 bit integer to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putUint64Be(long val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_uint64_be.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes a unsigned little endian 64 bit integer to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putUint64Le(long val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_uint64_le.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Writes a unsigned 8 bit integer to {@code writer}.
     * @param val Value to write
     * @return {@code true} if the value could be written
     */
    public boolean putUint8(byte val) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_byte_writer_put_uint8.invokeExact(
                    handle(),
                    val);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Resets {@code writer} and frees the data if it's
     * owned by {@code writer}.
     */
    public void reset() {
        try {
            DowncallHandles.gst_byte_writer_reset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Resets {@code writer} and returns the current data as buffer.
     * <p>
     * Free-function: gst_buffer_unref
     * @return the current data as buffer. gst_buffer_unref()
     *     after usage.
     */
    public org.gstreamer.gst.Buffer resetAndGetBuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_byte_writer_reset_and_get_buffer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Resets {@code writer} and returns the current data.
     * <p>
     * Free-function: g_free
     * @return the current data. g_free() after
     * usage.
     */
    public PointerByte resetAndGetData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_byte_writer_reset_and_get_data.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerByte(RESULT);
        }
    }
    
    /**
     * Creates a new, empty {@link ByteWriter} instance
     * <p>
     * Free-function: gst_byte_writer_free
     * @return a new, empty {@link ByteWriter} instance
     */
    public static org.gstreamer.base.ByteWriter new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_byte_writer_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.base.ByteWriter.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Creates a new {@link ByteWriter} instance with the given
     * memory area. If {@code initialized} is {@code true} it is possible to
     * read {@code size} bytes from the {@link ByteWriter} from the beginning.
     * <p>
     * Free-function: gst_byte_writer_free
     * @param data Memory area for writing
     * @param size Size of {@code data} in bytes
     * @param initialized If {@code true} the complete data can be read from the beginning
     * @return a new {@link ByteWriter} instance
     */
    public static org.gstreamer.base.ByteWriter newWithData(PointerByte data, int size, boolean initialized) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_byte_writer_new_with_data.invokeExact(
                    data.handle(),
                    size,
                    Marshal.booleanToInteger.marshal(initialized, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.base.ByteWriter.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Creates a new {@link ByteWriter} instance with the given
     * initial data size.
     * <p>
     * Free-function: gst_byte_writer_free
     * @param size Initial size of data
     * @param fixed If {@code true} the data can't be reallocated
     * @return a new {@link ByteWriter} instance
     */
    public static org.gstreamer.base.ByteWriter newWithSize(int size, boolean fixed) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_byte_writer_new_with_size.invokeExact(
                    size,
                    Marshal.booleanToInteger.marshal(fixed, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.base.ByteWriter.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_byte_writer_ensure_free_space = Interop.downcallHandle(
                "gst_byte_writer_ensure_free_space",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_byte_writer_fill = Interop.downcallHandle(
                "gst_byte_writer_fill",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_byte_writer_free = Interop.downcallHandle(
                "gst_byte_writer_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_byte_writer_free_and_get_buffer = Interop.downcallHandle(
                "gst_byte_writer_free_and_get_buffer",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_byte_writer_free_and_get_data = Interop.downcallHandle(
                "gst_byte_writer_free_and_get_data",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_byte_writer_get_remaining = Interop.downcallHandle(
                "gst_byte_writer_get_remaining",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_byte_writer_init = Interop.downcallHandle(
                "gst_byte_writer_init",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_byte_writer_init_with_data = Interop.downcallHandle(
                "gst_byte_writer_init_with_data",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_byte_writer_init_with_size = Interop.downcallHandle(
                "gst_byte_writer_init_with_size",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_buffer = Interop.downcallHandle(
                "gst_byte_writer_put_buffer",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_data = Interop.downcallHandle(
                "gst_byte_writer_put_data",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_float32_be = Interop.downcallHandle(
                "gst_byte_writer_put_float32_be",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_float32_le = Interop.downcallHandle(
                "gst_byte_writer_put_float32_le",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_float64_be = Interop.downcallHandle(
                "gst_byte_writer_put_float64_be",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_float64_le = Interop.downcallHandle(
                "gst_byte_writer_put_float64_le",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_int16_be = Interop.downcallHandle(
                "gst_byte_writer_put_int16_be",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_int16_le = Interop.downcallHandle(
                "gst_byte_writer_put_int16_le",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_int24_be = Interop.downcallHandle(
                "gst_byte_writer_put_int24_be",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_int24_le = Interop.downcallHandle(
                "gst_byte_writer_put_int24_le",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_int32_be = Interop.downcallHandle(
                "gst_byte_writer_put_int32_be",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_int32_le = Interop.downcallHandle(
                "gst_byte_writer_put_int32_le",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_int64_be = Interop.downcallHandle(
                "gst_byte_writer_put_int64_be",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_int64_le = Interop.downcallHandle(
                "gst_byte_writer_put_int64_le",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_int8 = Interop.downcallHandle(
                "gst_byte_writer_put_int8",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_string_utf16 = Interop.downcallHandle(
                "gst_byte_writer_put_string_utf16",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_string_utf32 = Interop.downcallHandle(
                "gst_byte_writer_put_string_utf32",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_string_utf8 = Interop.downcallHandle(
                "gst_byte_writer_put_string_utf8",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_uint16_be = Interop.downcallHandle(
                "gst_byte_writer_put_uint16_be",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_uint16_le = Interop.downcallHandle(
                "gst_byte_writer_put_uint16_le",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_uint24_be = Interop.downcallHandle(
                "gst_byte_writer_put_uint24_be",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_uint24_le = Interop.downcallHandle(
                "gst_byte_writer_put_uint24_le",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_uint32_be = Interop.downcallHandle(
                "gst_byte_writer_put_uint32_be",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_uint32_le = Interop.downcallHandle(
                "gst_byte_writer_put_uint32_le",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_uint64_be = Interop.downcallHandle(
                "gst_byte_writer_put_uint64_be",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_uint64_le = Interop.downcallHandle(
                "gst_byte_writer_put_uint64_le",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_byte_writer_put_uint8 = Interop.downcallHandle(
                "gst_byte_writer_put_uint8",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
                false
        );
        
        private static final MethodHandle gst_byte_writer_reset = Interop.downcallHandle(
                "gst_byte_writer_reset",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_byte_writer_reset_and_get_buffer = Interop.downcallHandle(
                "gst_byte_writer_reset_and_get_buffer",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_byte_writer_reset_and_get_data = Interop.downcallHandle(
                "gst_byte_writer_reset_and_get_data",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_byte_writer_new = Interop.downcallHandle(
                "gst_byte_writer_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_byte_writer_new_with_data = Interop.downcallHandle(
                "gst_byte_writer_new_with_data",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_byte_writer_new_with_size = Interop.downcallHandle(
                "gst_byte_writer_new_with_size",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
    }
    
    /**
     * A {@link ByteWriter.Builder} object constructs a {@link ByteWriter} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ByteWriter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ByteWriter struct;
        
        private Builder() {
            struct = ByteWriter.allocate();
        }
        
        /**
         * Finish building the {@link ByteWriter} struct.
         * @return A new instance of {@code ByteWriter} with the fields 
         *         that were set in the Builder object.
         */
        public ByteWriter build() {
            return struct;
        }
        
        /**
         * {@link ByteReader} parent
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParent(org.gstreamer.base.ByteReader parent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
                return this;
            }
        }
        
        /**
         * Allocation size of the data
         * @param allocSize The value for the {@code allocSize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAllocSize(int allocSize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("alloc_size"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), allocSize);
                return this;
            }
        }
        
        /**
         * If {@code true} no reallocations are allowed
         * @param fixed The value for the {@code fixed} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFixed(boolean fixed) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("fixed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(fixed, null).intValue());
                return this;
            }
        }
        
        /**
         * If {@code false} no reallocations are allowed and copies of data are returned
         * @param owned The value for the {@code owned} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOwned(boolean owned) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("owned"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(owned, null).intValue());
                return this;
            }
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false, SCOPE)));
                return this;
            }
        }
    }
}
