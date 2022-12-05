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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_BYTE.withName("compression_type"),
        Interop.valueLayout.C_BYTE.withName("mode"),
        Interop.valueLayout.C_BYTE.withName("compressed_data_size"),
        MemoryLayout.paddingLayout(40),
        Interop.valueLayout.ADDRESS.withName("compressed_data"),
        Interop.valueLayout.ADDRESS.withName("cached_string")
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
    public byte compressionType$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("compression_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code compression_type}
     * @param compressionType The new value of the field {@code compression_type}
     */
    public void compressionType$set(byte compressionType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("compression_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), compressionType);
    }
    
    /**
     * Get the value of the field {@code mode}
     * @return The value of the field {@code mode}
     */
    public byte mode$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mode"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code mode}
     * @param mode The new value of the field {@code mode}
     */
    public void mode$set(byte mode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), mode);
    }
    
    /**
     * Get the value of the field {@code compressed_data_size}
     * @return The value of the field {@code compressed_data_size}
     */
    public byte compressedDataSize$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("compressed_data_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code compressed_data_size}
     * @param compressedDataSize The new value of the field {@code compressed_data_size}
     */
    public void compressedDataSize$set(byte compressedDataSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("compressed_data_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), compressedDataSize);
    }
    
    /**
     * Get the value of the field {@code compressed_data}
     * @return The value of the field {@code compressed_data}
     */
    public PointerByte compressedData$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("compressed_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerByte(RESULT);
    }
    
    /**
     * Change the value of the field {@code compressed_data}
     * @param compressedData The new value of the field {@code compressed_data}
     */
    public void compressedData$set(PointerByte compressedData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("compressed_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), compressedData.handle());
    }
    
    /**
     * Get the value of the field {@code cached_string}
     * @return The value of the field {@code cached_string}
     */
    public java.lang.String cachedString$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cached_string"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code cached_string}
     * @param cachedString The new value of the field {@code cached_string}
     */
    public void cachedString$set(java.lang.String cachedString) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cached_string"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(cachedString));
    }
    
    /**
     * Create a AtscStringSegment proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AtscStringSegment(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    public @NotNull java.lang.String getString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_atsc_string_segment_get_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public boolean setString(@NotNull java.lang.String string, byte compressionType, byte mode) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_mpegts_atsc_string_segment_set_string.invokeExact(
                    handle(),
                    Interop.allocateNativeString(string),
                    compressionType,
                    mode);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AtscStringSegment struct;
        
         /**
         * A {@link AtscStringSegment.Build} object constructs a {@link AtscStringSegment} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AtscStringSegment.allocate();
        }
        
         /**
         * Finish building the {@link AtscStringSegment} struct.
         * @return A new instance of {@code AtscStringSegment} with the fields 
         *         that were set in the Build object.
         */
        public AtscStringSegment construct() {
            return struct;
        }
        
        /**
         * The compression type
         * @param compressionType The value for the {@code compressionType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCompressionType(byte compressionType) {
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
        public Build setMode(byte mode) {
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
        public Build setCompressedDataSize(byte compressedDataSize) {
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
        public Build setCompressedData(PointerByte compressedData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("compressed_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (compressedData == null ? MemoryAddress.NULL : compressedData.handle()));
            return this;
        }
        
        public Build setCachedString(java.lang.String cachedString) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cached_string"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cachedString == null ? MemoryAddress.NULL : Interop.allocateNativeString(cachedString)));
            return this;
        }
    }
}
