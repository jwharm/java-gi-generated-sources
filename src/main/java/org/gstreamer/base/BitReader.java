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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("data"),
            Interop.valueLayout.C_INT.withName("size"),
            Interop.valueLayout.C_INT.withName("byte"),
            Interop.valueLayout.C_INT.withName("bit"),
            MemoryLayout.paddingLayout(96),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link BitReader}
     * @return A new, uninitialized @{link BitReader}
     */
    public static BitReader allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        BitReader newInstance = new BitReader(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public PointerByte getData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerByte(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void setData(byte[] data) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : Interop.allocateNativeArray(data, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code size}
     * @return The value of the field {@code size}
     */
    public int getSize_() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code size}
     * @param size The new value of the field {@code size}
     */
    public void setSize(int size) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), size);
        }
    }
    
    /**
     * Get the value of the field {@code byte}
     * @return The value of the field {@code byte}
     */
    public int getByte() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("byte"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code byte}
     * @param byte_ The new value of the field {@code byte}
     */
    public void setByte(int byte_) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("byte"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), byte_);
        }
    }
    
    /**
     * Get the value of the field {@code bit}
     * @return The value of the field {@code bit}
     */
    public int getBit() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bit"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code bit}
     * @param bit The new value of the field {@code bit}
     */
    public void setBit(int bit) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bit"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), bit);
        }
    }
    
    /**
     * Create a BitReader proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected BitReader(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, BitReader> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new BitReader(input);
    
    /**
     * Frees a {@link BitReader} instance, which was previously allocated by
     * gst_bit_reader_new().
     */
    public void free() {
        try {
            DowncallHandles.gst_bit_reader_free.invokeExact(handle());
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment valPOINTER = SCOPE.allocate(Interop.valueLayout.C_SHORT);
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
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Read {@code nbits} bits into {@code val} and update the current position.
     * @param val Pointer to a {@code guint32} to store the result
     * @param nbits number of bits to read
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getBitsUint32(Out<Integer> val, int nbits) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment valPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
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
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Read {@code nbits} bits into {@code val} and update the current position.
     * @param val Pointer to a {@code guint64} to store the result
     * @param nbits number of bits to read
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getBitsUint64(Out<Long> val, int nbits) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment valPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
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
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Read {@code nbits} bits into {@code val} and update the current position.
     * @param val Pointer to a {@code guint8} to store the result
     * @param nbits number of bits to read
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean getBitsUint8(Out<Byte> val, int nbits) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment valPOINTER = SCOPE.allocate(Interop.valueLayout.C_BYTE);
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
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Returns the current position of a {@link BitReader} instance in bits.
     * @return The current position of {@code reader} in bits.
     */
    public int getPos() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_reader_get_pos.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gst_bit_reader_get_remaining.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gst_bit_reader_get_size.invokeExact(handle());
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
    public void init(byte[] data, int size) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_bit_reader_init.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(data, false, SCOPE),
                        size);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Read {@code nbits} bits into {@code val} but keep the current position.
     * @param val Pointer to a {@code guint16} to store the result
     * @param nbits number of bits to read
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekBitsUint16(Out<Short> val, int nbits) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment valPOINTER = SCOPE.allocate(Interop.valueLayout.C_SHORT);
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
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Read {@code nbits} bits into {@code val} but keep the current position.
     * @param val Pointer to a {@code guint32} to store the result
     * @param nbits number of bits to read
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekBitsUint32(Out<Integer> val, int nbits) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment valPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
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
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Read {@code nbits} bits into {@code val} but keep the current position.
     * @param val Pointer to a {@code guint64} to store the result
     * @param nbits number of bits to read
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekBitsUint64(Out<Long> val, int nbits) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment valPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
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
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Read {@code nbits} bits into {@code val} but keep the current position.
     * @param val Pointer to a {@code guint8} to store the result
     * @param nbits number of bits to read
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean peekBitsUint8(Out<Byte> val, int nbits) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment valPOINTER = SCOPE.allocate(Interop.valueLayout.C_BYTE);
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
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Skips until the next byte.
     * @return {@code true} if successful, {@code false} otherwise.
     */
    public boolean skipToByte() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_bit_reader_skip_to_byte.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public static org.gstreamer.base.BitReader new_(byte[] data, int size) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_bit_reader_new.invokeExact(
                        Interop.allocateNativeArray(data, false, SCOPE),
                        size);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gstreamer.base.BitReader.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
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
     * A {@link BitReader.Builder} object constructs a {@link BitReader} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link BitReader.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final BitReader struct;
        
        private Builder() {
            struct = BitReader.allocate();
        }
        
        /**
         * Finish building the {@link BitReader} struct.
         * @return A new instance of {@code BitReader} with the fields 
         *         that were set in the Builder object.
         */
        public BitReader build() {
            return struct;
        }
        
        /**
         * Data from which the bit reader will
         *   read
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setData(byte[] data) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (data == null ? MemoryAddress.NULL : Interop.allocateNativeArray(data, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * Size of {@code data} in bytes
         * @param size The value for the {@code size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSize(int size) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("size"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), size);
                return this;
            }
        }
        
        /**
         * Current byte position
         * @param byte_ The value for the {@code byte_} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setByte(int byte_) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("byte"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), byte_);
                return this;
            }
        }
        
        /**
         * Bit position in the current byte
         * @param bit The value for the {@code bit} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBit(int bit) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("bit"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), bit);
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
