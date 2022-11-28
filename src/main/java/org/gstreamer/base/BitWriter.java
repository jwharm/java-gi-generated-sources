package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link BitWriter} provides a bit writer that can write any number of
 * bits into a memory buffer. It provides functions for writing any
 * number of bits into 8, 16, 32 and 64 bit variables.
 * @version 1.16
 */
public class BitWriter extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBitWriter";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("data"),
        Interop.valueLayout.C_INT.withName("bit_size"),
        Interop.valueLayout.C_INT.withName("bit_capacity"),
        Interop.valueLayout.C_INT.withName("auto_grow"),
        Interop.valueLayout.C_INT.withName("owned"),
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
     * Allocate a new {@link BitWriter}
     * @return A new, uninitialized @{link BitWriter}
     */
    public static BitWriter allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BitWriter newInstance = new BitWriter(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public PointerByte data$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerByte(RESULT);
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void data$set(PointerByte data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), data.handle());
    }
    
    /**
     * Get the value of the field {@code bit_size}
     * @return The value of the field {@code bit_size}
     */
    public int bitSize$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bit_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code bit_size}
     * @param bitSize The new value of the field {@code bit_size}
     */
    public void bitSize$set(int bitSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bit_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), bitSize);
    }
    
    /**
     * Create a BitWriter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BitWriter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Write trailing bit to align last byte of {@code data}. {@code trailing_bit} can
     * only be 1 or 0.
     * @param trailingBit trailing bits of last byte, 0 or 1
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean alignBytes(byte trailingBit) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_writer_align_bytes.invokeExact(
                    handle(),
                    trailingBit);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Frees {@code bitwriter} and the allocated data inside.
     */
    public void free() {
        try {
            DowncallHandles.gst_bit_writer_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * Frees {@code bitwriter} without destroying the internal data, which is
     * returned as {@link org.gstreamer.gst.Buffer}.
     * <p>
     * Free-function: gst_buffer_unref
     * @return a new allocated {@link org.gstreamer.gst.Buffer} wrapping the
     *     data inside. gst_buffer_unref() after usage.
     */
    public @NotNull org.gstreamer.gst.Buffer freeAndGetBuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bit_writer_free_and_get_buffer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.FULL);
    }
    
    /**
     * Frees {@code bitwriter} without destroying the internal data, which is
     * returned.
     * <p>
     * Free-function: g_free
     * @return the current data. g_free() after
     *     usage.
     */
    public @NotNull PointerByte freeAndGetData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bit_writer_free_and_get_data.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        return new PointerByte(RESULT);
    }
    
    /**
     * Get written data pointer
     * @return data pointer
     */
    public @NotNull PointerByte getData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bit_writer_get_data.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    public int getRemaining() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_writer_get_remaining.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get size of written {@code data}
     * @return size of bits written in {@code data}
     */
    public int getSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_writer_get_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Initializes {@code bitwriter} to an empty instance.
     */
    public void init() {
        try {
            DowncallHandles.gst_bit_writer_init.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes {@code bitwriter} with the given memory area {@code data}. IF
     * {@code initialized} is {@code true} it is possible to read {@code size} bits from the
     * {@link BitWriter} from the beginning.
     * @param data Memory area for writing
     * @param size Size of {@code data} in bytes
     * @param initialized If {@code true} the complete data can be read from the beginning
     */
    public void initWithData(@NotNull byte[] data, int size, boolean initialized) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        try {
            DowncallHandles.gst_bit_writer_init_with_data.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(data, false),
                    size,
                    initialized ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes a {@link BitWriter} instance and allocates the given data
     * {@code size}.
     * @param size the size on bytes to allocate for data
     * @param fixed If {@code true} the data can't be reallocated
     */
    public void initWithSize(int size, boolean fixed) {
        try {
            DowncallHandles.gst_bit_writer_init_with_size.invokeExact(
                    handle(),
                    size,
                    fixed ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Write {@code nbits} bits of {@code value} to {@link BitWriter}.
     * @param value value of {@code guint16} to write
     * @param nbits number of bits to write
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean putBitsUint16(short value, int nbits) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_writer_put_bits_uint16.invokeExact(
                    handle(),
                    value,
                    nbits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Write {@code nbits} bits of {@code value} to {@link BitWriter}.
     * @param value value of {@code guint32} to write
     * @param nbits number of bits to write
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean putBitsUint32(int value, int nbits) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_writer_put_bits_uint32.invokeExact(
                    handle(),
                    value,
                    nbits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Write {@code nbits} bits of {@code value} to {@link BitWriter}.
     * @param value value of {@code guint64} to write
     * @param nbits number of bits to write
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean putBitsUint64(long value, int nbits) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_writer_put_bits_uint64.invokeExact(
                    handle(),
                    value,
                    nbits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Write {@code nbits} bits of {@code value} to {@link BitWriter}.
     * @param value value of {@code guint8} to write
     * @param nbits number of bits to write
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean putBitsUint8(byte value, int nbits) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_writer_put_bits_uint8.invokeExact(
                    handle(),
                    value,
                    nbits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Write {@code nbytes} bytes of {@code data} to {@link BitWriter}.
     * @param data pointer of data to write
     * @param nbytes number of bytes to write
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean putBytes(@NotNull byte[] data, int nbytes) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_writer_put_bytes.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(data, false),
                    nbytes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Resets {@code bitwriter} and frees the data if it's owned by {@code bitwriter}.
     */
    public void reset() {
        try {
            DowncallHandles.gst_bit_writer_reset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Resets {@code bitwriter} and returns the current data as {@link org.gstreamer.gst.Buffer}.
     * <p>
     * Free-function: gst_buffer_unref
     * @return a new allocated {@link org.gstreamer.gst.Buffer} wrapping the
     *     current data. gst_buffer_unref() after usage.
     */
    public @NotNull org.gstreamer.gst.Buffer resetAndGetBuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bit_writer_reset_and_get_buffer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.FULL);
    }
    
    /**
     * Resets {@code bitwriter} and returns the current data.
     * <p>
     * Free-function: g_free
     * @return the current data. g_free() after
     *     usage.
     */
    public @NotNull PointerByte resetAndGetData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bit_writer_reset_and_get_data.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    public boolean setPos(int pos) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_writer_set_pos.invokeExact(
                    handle(),
                    pos);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Creates a new, empty {@link BitWriter} instance.
     * <p>
     * Free-function: gst_bit_writer_free
     * @return a new, empty {@link ByteWriter} instance
     */
    public static @NotNull org.gstreamer.base.BitWriter new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bit_writer_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.base.BitWriter(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link BitWriter} instance with the given memory area. If
     * {@code initialized} is {@code true} it is possible to read {@code size} bits from the
     * {@link BitWriter} from the beginning.
     * <p>
     * Free-function: gst_bit_writer_free
     * @param data Memory area for writing
     * @param size Size of {@code data} in bytes
     * @param initialized if {@code true} the complete data can be read from the beginning
     * @return a new {@link BitWriter} instance
     */
    public static @NotNull org.gstreamer.base.BitWriter newWithData(@NotNull byte[] data, int size, boolean initialized) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bit_writer_new_with_data.invokeExact(
                    Interop.allocateNativeArray(data, false),
                    size,
                    initialized ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.base.BitWriter(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a {@link BitWriter} instance with the given initial data size.
     * <p>
     * Free-function: gst_bit_writer_free
     * @param size Initial size of data in bytes
     * @param fixed If {@code true} the data can't be reallocated
     * @return a new {@link BitWriter} instance
     */
    public static @NotNull org.gstreamer.base.BitWriter newWithSize(int size, boolean fixed) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bit_writer_new_with_size.invokeExact(
                    size,
                    fixed ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.base.BitWriter(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_bit_writer_align_bytes = Interop.downcallHandle(
            "gst_bit_writer_align_bytes",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE),
            false
        );
        
        private static final MethodHandle gst_bit_writer_free = Interop.downcallHandle(
            "gst_bit_writer_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bit_writer_free_and_get_buffer = Interop.downcallHandle(
            "gst_bit_writer_free_and_get_buffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bit_writer_free_and_get_data = Interop.downcallHandle(
            "gst_bit_writer_free_and_get_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bit_writer_get_data = Interop.downcallHandle(
            "gst_bit_writer_get_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bit_writer_get_remaining = Interop.downcallHandle(
            "gst_bit_writer_get_remaining",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bit_writer_get_size = Interop.downcallHandle(
            "gst_bit_writer_get_size",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bit_writer_init = Interop.downcallHandle(
            "gst_bit_writer_init",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bit_writer_init_with_data = Interop.downcallHandle(
            "gst_bit_writer_init_with_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bit_writer_init_with_size = Interop.downcallHandle(
            "gst_bit_writer_init_with_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bit_writer_put_bits_uint16 = Interop.downcallHandle(
            "gst_bit_writer_put_bits_uint16",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_SHORT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bit_writer_put_bits_uint32 = Interop.downcallHandle(
            "gst_bit_writer_put_bits_uint32",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bit_writer_put_bits_uint64 = Interop.downcallHandle(
            "gst_bit_writer_put_bits_uint64",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bit_writer_put_bits_uint8 = Interop.downcallHandle(
            "gst_bit_writer_put_bits_uint8",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bit_writer_put_bytes = Interop.downcallHandle(
            "gst_bit_writer_put_bytes",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bit_writer_reset = Interop.downcallHandle(
            "gst_bit_writer_reset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bit_writer_reset_and_get_buffer = Interop.downcallHandle(
            "gst_bit_writer_reset_and_get_buffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bit_writer_reset_and_get_data = Interop.downcallHandle(
            "gst_bit_writer_reset_and_get_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bit_writer_set_pos = Interop.downcallHandle(
            "gst_bit_writer_set_pos",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bit_writer_new = Interop.downcallHandle(
            "gst_bit_writer_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bit_writer_new_with_data = Interop.downcallHandle(
            "gst_bit_writer_new_with_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bit_writer_new_with_size = Interop.downcallHandle(
            "gst_bit_writer_new_with_size",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private BitWriter struct;
        
         /**
         * A {@link BitWriter.Build} object constructs a {@link BitWriter} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = BitWriter.allocate();
        }
        
         /**
         * Finish building the {@link BitWriter} struct.
         * @return A new instance of {@code BitWriter} with the fields 
         *         that were set in the Build object.
         */
        public BitWriter construct() {
            return struct;
        }
        
        /**
         * Allocated {@code data} for bit writer to write
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setData(PointerByte data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : data.handle()));
            return this;
        }
        
        /**
         * Size of written {@code data} in bits
         * @param bitSize The value for the {@code bitSize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBitSize(int bitSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bit_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), bitSize);
            return this;
        }
        
        public Build setBitCapacity(int bitCapacity) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bit_capacity"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), bitCapacity);
            return this;
        }
        
        public Build setAutoGrow(boolean autoGrow) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("auto_grow"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), autoGrow ? 1 : 0);
            return this;
        }
        
        public Build setOwned(boolean owned) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("owned"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), owned ? 1 : 0);
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
