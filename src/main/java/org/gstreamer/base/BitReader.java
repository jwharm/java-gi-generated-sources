package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link BitReader} provides a bit reader that can read any number of bits
 * from a memory buffer. It provides functions for reading any number of bits
 * into 8, 16, 32 and 64 bit variables.
 */
public class BitReader extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBitReader";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("data"),
        Interop.valueLayout.C_INT.withName("size"),
        Interop.valueLayout.C_INT.withName("byte"),
        Interop.valueLayout.C_INT.withName("bit"),
        MemoryLayout.paddingLayout(96),
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
     * Allocate a new {@link BitReader}
     * @return A new, uninitialized @{link BitReader}
     */
    public static BitReader allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BitReader newInstance = new BitReader(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code bit}
     * @return The value of the field {@code bit}
     */
    public int bit$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bit"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code bit}
     * @param bit The new value of the field {@code bit}
     */
    public void bit$set(int bit) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bit"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), bit);
    }
    
    /**
     * Create a BitReader proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BitReader(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Frees a {@link BitReader} instance, which was previously allocated by
     * gst_bit_reader_new().
     */
    public void free() {
        try {
            DowncallHandles.gst_bit_reader_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * Read {@code nbits} bits into {@code val} and update the current position.
     * @param val Pointer to a {@code guint16} to store the result
     * @param nbits number of bits to read
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getBitsUint16(Out<Short> val, int nbits) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_SHORT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_reader_get_bits_uint16.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address(),
                    nbits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_SHORT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read {@code nbits} bits into {@code val} and update the current position.
     * @param val Pointer to a {@code guint32} to store the result
     * @param nbits number of bits to read
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getBitsUint32(Out<Integer> val, int nbits) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_reader_get_bits_uint32.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address(),
                    nbits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read {@code nbits} bits into {@code val} and update the current position.
     * @param val Pointer to a {@code guint64} to store the result
     * @param nbits number of bits to read
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getBitsUint64(Out<Long> val, int nbits) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_reader_get_bits_uint64.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address(),
                    nbits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Read {@code nbits} bits into {@code val} and update the current position.
     * @param val Pointer to a {@code guint8} to store the result
     * @param nbits number of bits to read
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getBitsUint8(Out<Byte> val, int nbits) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_reader_get_bits_uint8.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address(),
                    nbits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        return RESULT != 0;
    }
    
    /**
     * Returns the current position of a {@link BitReader} instance in bits.
     * @return The current position of {@code reader} in bits.
     */
    public int getPos() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_reader_get_pos.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the remaining number of bits of a {@link BitReader} instance.
     * @return The remaining number of bits of {@code reader} instance.
     */
    public int getRemaining() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_reader_get_remaining.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the total number of bits of a {@link BitReader} instance.
     * @return The total number of bits of {@code reader} instance.
     */
    public int getSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_reader_get_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Initializes a {@link BitReader} instance to read from {@code data}. This function
     * can be called on already initialized instances.
     * @param data data from which the bit reader should read
     * @param size Size of {@code data} in bytes
     */
    public void init(@NotNull byte[] data, int size) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        try {
            DowncallHandles.gst_bit_reader_init.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(data, false),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Read {@code nbits} bits into {@code val} but keep the current position.
     * @param val Pointer to a {@code guint16} to store the result
     * @param nbits number of bits to read
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekBitsUint16(Out<Short> val, int nbits) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_SHORT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_reader_peek_bits_uint16.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address(),
                    nbits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_SHORT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read {@code nbits} bits into {@code val} but keep the current position.
     * @param val Pointer to a {@code guint32} to store the result
     * @param nbits number of bits to read
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekBitsUint32(Out<Integer> val, int nbits) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_reader_peek_bits_uint32.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address(),
                    nbits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Read {@code nbits} bits into {@code val} but keep the current position.
     * @param val Pointer to a {@code guint64} to store the result
     * @param nbits number of bits to read
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekBitsUint64(Out<Long> val, int nbits) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_reader_peek_bits_uint64.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address(),
                    nbits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Read {@code nbits} bits into {@code val} but keep the current position.
     * @param val Pointer to a {@code guint8} to store the result
     * @param nbits number of bits to read
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekBitsUint8(Out<Byte> val, int nbits) {
        java.util.Objects.requireNonNull(val, "Parameter 'val' must not be null");
        MemorySegment valPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_BYTE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_reader_peek_bits_uint8.invokeExact(
                    handle(),
                    (Addressable) valPOINTER.address(),
                    nbits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        val.set(valPOINTER.get(Interop.valueLayout.C_BYTE, 0));
        return RESULT != 0;
    }
    
    /**
     * Sets the new position of a {@link BitReader} instance to {@code pos} in bits.
     * @param pos The new position in bits
     * @return {@code true} if the position could be set successfully, {@code false}
     * otherwise.
     */
    public boolean setPos(int pos) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_reader_set_pos.invokeExact(
                    handle(),
                    pos);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Skips {@code nbits} bits of the {@link BitReader} instance.
     * @param nbits the number of bits to skip
     * @return {@code true} if {@code nbits} bits could be skipped, {@code false} otherwise.
     */
    public boolean skip(int nbits) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_reader_skip.invokeExact(
                    handle(),
                    nbits);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Skips until the next byte.
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean skipToByte() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_reader_skip_to_byte.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Create a new {@link BitReader} instance, which will read from {@code data}.
     * <p>
     * Free-function: gst_bit_reader_free
     * @param data Data from which the {@link BitReader}
     *   should read
     * @param size Size of {@code data} in bytes
     * @return a new {@link BitReader} instance
     */
    public static @NotNull org.gstreamer.base.BitReader new_(@NotNull byte[] data, int size) {
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_bit_reader_new.invokeExact(
                    Interop.allocateNativeArray(data, false),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.base.BitReader(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_bit_reader_free = Interop.downcallHandle(
            "gst_bit_reader_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bit_reader_get_bits_uint16 = Interop.downcallHandle(
            "gst_bit_reader_get_bits_uint16",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bit_reader_get_bits_uint32 = Interop.downcallHandle(
            "gst_bit_reader_get_bits_uint32",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bit_reader_get_bits_uint64 = Interop.downcallHandle(
            "gst_bit_reader_get_bits_uint64",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bit_reader_get_bits_uint8 = Interop.downcallHandle(
            "gst_bit_reader_get_bits_uint8",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bit_reader_get_pos = Interop.downcallHandle(
            "gst_bit_reader_get_pos",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bit_reader_get_remaining = Interop.downcallHandle(
            "gst_bit_reader_get_remaining",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bit_reader_get_size = Interop.downcallHandle(
            "gst_bit_reader_get_size",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bit_reader_init = Interop.downcallHandle(
            "gst_bit_reader_init",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bit_reader_peek_bits_uint16 = Interop.downcallHandle(
            "gst_bit_reader_peek_bits_uint16",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bit_reader_peek_bits_uint32 = Interop.downcallHandle(
            "gst_bit_reader_peek_bits_uint32",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bit_reader_peek_bits_uint64 = Interop.downcallHandle(
            "gst_bit_reader_peek_bits_uint64",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bit_reader_peek_bits_uint8 = Interop.downcallHandle(
            "gst_bit_reader_peek_bits_uint8",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bit_reader_set_pos = Interop.downcallHandle(
            "gst_bit_reader_set_pos",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bit_reader_skip = Interop.downcallHandle(
            "gst_bit_reader_skip",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_bit_reader_skip_to_byte = Interop.downcallHandle(
            "gst_bit_reader_skip_to_byte",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_bit_reader_new = Interop.downcallHandle(
            "gst_bit_reader_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private BitReader struct;
        
         /**
         * A {@link BitReader.Build} object constructs a {@link BitReader} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = BitReader.allocate();
        }
        
         /**
         * Finish building the {@link BitReader} struct.
         * @return A new instance of {@code BitReader} with the fields 
         *         that were set in the Build object.
         */
        public BitReader construct() {
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
        
        /**
         * Bit position in the current byte
         * @param bit The value for the {@code bit} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBit(int bit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bit"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), bit);
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
