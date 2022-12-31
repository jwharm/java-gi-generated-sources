package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A string segment
 */
public class AtscStringSegment extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsAtscStringSegment";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_BYTE.withName("compression_type"),
            Interop.valueLayout.C_BYTE.withName("mode"),
            Interop.valueLayout.C_BYTE.withName("compressed_data_size"),
            MemoryLayout.paddingLayout(40),
            Interop.valueLayout.ADDRESS.withName("compressed_data"),
            Interop.valueLayout.ADDRESS.withName("cached_string")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AtscStringSegment}
     * @return A new, uninitialized @{link AtscStringSegment}
     */
    public static AtscStringSegment allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AtscStringSegment newInstance = new AtscStringSegment(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code compression_type}
     * @return The value of the field {@code compression_type}
     */
    public byte getCompressionType() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("compression_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code compression_type}
     * @param compressionType The new value of the field {@code compression_type}
     */
    public void setCompressionType(byte compressionType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("compression_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), compressionType);
    }
    
    /**
     * Get the value of the field {@code mode}
     * @return The value of the field {@code mode}
     */
    public byte getMode() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mode"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code mode}
     * @param mode The new value of the field {@code mode}
     */
    public void setMode(byte mode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), mode);
    }
    
    /**
     * Get the value of the field {@code compressed_data_size}
     * @return The value of the field {@code compressed_data_size}
     */
    public byte getCompressedDataSize() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("compressed_data_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code compressed_data_size}
     * @param compressedDataSize The new value of the field {@code compressed_data_size}
     */
    public void setCompressedDataSize(byte compressedDataSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("compressed_data_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), compressedDataSize);
    }
    
    /**
     * Get the value of the field {@code compressed_data}
     * @return The value of the field {@code compressed_data}
     */
    public PointerByte getCompressedData() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("compressed_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerByte(RESULT);
    }
    
    /**
     * Change the value of the field {@code compressed_data}
     * @param compressedData The new value of the field {@code compressed_data}
     */
    public void setCompressedData(PointerByte compressedData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("compressed_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (compressedData == null ? MemoryAddress.NULL : compressedData.handle()));
    }
    
    /**
     * Get the value of the field {@code cached_string}
     * @return The value of the field {@code cached_string}
     */
    public java.lang.String getCachedString() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cached_string"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code cached_string}
     * @param cachedString The new value of the field {@code cached_string}
     */
    public void setCachedString(java.lang.String cachedString) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cached_string"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cachedString == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(cachedString, null)));
    }
    
    /**
     * Create a AtscStringSegment proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AtscStringSegment(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AtscStringSegment> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AtscStringSegment(input, ownership);
    
    public java.lang.String getString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_atsc_string_segment_get_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public boolean setString(java.lang.String string, byte compressionType, byte mode) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_atsc_string_segment_set_string.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(string, null),
                    compressionType,
                    mode);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_atsc_string_segment_get_string = Interop.downcallHandle(
            "gst_mpegts_atsc_string_segment_get_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_atsc_string_segment_set_string = Interop.downcallHandle(
            "gst_mpegts_atsc_string_segment_set_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE),
            false
        );
    }
    
    /**
     * A {@link AtscStringSegment.Builder} object constructs a {@link AtscStringSegment} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AtscStringSegment.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AtscStringSegment struct;
        
        private Builder() {
            struct = AtscStringSegment.allocate();
        }
        
         /**
         * Finish building the {@link AtscStringSegment} struct.
         * @return A new instance of {@code AtscStringSegment} with the fields 
         *         that were set in the Builder object.
         */
        public AtscStringSegment build() {
            return struct;
        }
        
        /**
         * The compression type
         * @param compressionType The value for the {@code compressionType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCompressionType(byte compressionType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("compression_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), compressionType);
            return this;
        }
        
        /**
         * The mode
         * @param mode The value for the {@code mode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMode(byte mode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), mode);
            return this;
        }
        
        /**
         * The size of compressed data
         * @param compressedDataSize The value for the {@code compressedDataSize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCompressedDataSize(byte compressedDataSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("compressed_data_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), compressedDataSize);
            return this;
        }
        
        /**
         * The compressed data
         * @param compressedData The value for the {@code compressedData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCompressedData(PointerByte compressedData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("compressed_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (compressedData == null ? MemoryAddress.NULL : compressedData.handle()));
            return this;
        }
        
        public Builder setCachedString(java.lang.String cachedString) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cached_string"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cachedString == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(cachedString, null)));
            return this;
        }
    }
}
