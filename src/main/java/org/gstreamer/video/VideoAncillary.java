package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Video Ancillary data, according to SMPTE-291M specification.
 * <p>
 * Note that the contents of the data are always stored as 8bit data (i.e. do not contain
 * the parity check bits).
 * @version 1.16
 */
public class VideoAncillary extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAncillary";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_BYTE.withName("DID"),
        Interop.valueLayout.C_BYTE.withName("SDID_block_number"),
        Interop.valueLayout.C_BYTE.withName("data_count"),
        MemoryLayout.paddingLayout(40),
        Interop.valueLayout.ADDRESS.withName("data"),
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
     * Allocate a new {@link VideoAncillary}
     * @return A new, uninitialized @{link VideoAncillary}
     */
    public static VideoAncillary allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoAncillary newInstance = new VideoAncillary(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code DID}
     * @return The value of the field {@code DID}
     */
    public byte DID$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("DID"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code DID}
     * @param DID The new value of the field {@code DID}
     */
    public void DID$set(byte DID) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("DID"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), DID);
    }
    
    /**
     * Get the value of the field {@code SDID_block_number}
     * @return The value of the field {@code SDID_block_number}
     */
    public byte SDIDBlockNumber$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("SDID_block_number"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code SDID_block_number}
     * @param SDIDBlockNumber The new value of the field {@code SDID_block_number}
     */
    public void SDIDBlockNumber$set(byte SDIDBlockNumber) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("SDID_block_number"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), SDIDBlockNumber);
    }
    
    /**
     * Get the value of the field {@code data_count}
     * @return The value of the field {@code data_count}
     */
    public byte dataCount$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data_count"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code data_count}
     * @param dataCount The new value of the field {@code data_count}
     */
    public void dataCount$set(byte dataCount) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data_count"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), dataCount);
    }
    
    /**
     * Create a VideoAncillary proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoAncillary(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoAncillary struct;
        
         /**
         * A {@link VideoAncillary.Build} object constructs a {@link VideoAncillary} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoAncillary.allocate();
        }
        
         /**
         * Finish building the {@link VideoAncillary} struct.
         * @return A new instance of {@code VideoAncillary} with the fields 
         *         that were set in the Build object.
         */
        public VideoAncillary construct() {
            return struct;
        }
        
        /**
         * The Data Identifier
         * @param DID The value for the {@code DID} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDID(byte DID) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("DID"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), DID);
            return this;
        }
        
        /**
         * The Secondary Data Identifier (if type 2) or the Data
         *                     Block Number (if type 1)
         * @param SDIDBlockNumber The value for the {@code SDIDBlockNumber} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSDIDBlockNumber(byte SDIDBlockNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("SDID_block_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), SDIDBlockNumber);
            return this;
        }
        
        /**
         * The amount of data (in bytes) in {@code data} (max 255 bytes)
         * @param dataCount The value for the {@code dataCount} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDataCount(byte dataCount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data_count"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), dataCount);
            return this;
        }
        
        /**
         * The user data content of the Ancillary packet.
         *    Does not contain the ADF, DID, SDID nor CS.
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setData(byte[] data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : Interop.allocateNativeArray(data, false)));
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
