package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Master Guide Table (A65)
 */
public class AtscMGT extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsAtscMGT";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_BYTE.withName("protocol_version"),
        MemoryLayout.paddingLayout(8),
        Interop.valueLayout.C_SHORT.withName("tables_defined"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("tables"),
        Interop.valueLayout.ADDRESS.withName("descriptors")
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
     * Allocate a new {@link AtscMGT}
     * @return A new, uninitialized @{link AtscMGT}
     */
    public static AtscMGT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AtscMGT newInstance = new AtscMGT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code protocol_version}
     * @return The value of the field {@code protocol_version}
     */
    public byte protocolVersion$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code protocol_version}
     * @param protocolVersion The new value of the field {@code protocol_version}
     */
    public void protocolVersion$set(byte protocolVersion) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), protocolVersion);
    }
    
    /**
     * Get the value of the field {@code tables_defined}
     * @return The value of the field {@code tables_defined}
     */
    public short tablesDefined$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tables_defined"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code tables_defined}
     * @param tablesDefined The new value of the field {@code tables_defined}
     */
    public void tablesDefined$set(short tablesDefined) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tables_defined"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tablesDefined);
    }
    
    /**
     * Create a AtscMGT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AtscMGT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_atsc_mgt_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public AtscMGT() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_atsc_mgt_new = Interop.downcallHandle(
            "gst_mpegts_atsc_mgt_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AtscMGT struct;
        
         /**
         * A {@link AtscMGT.Build} object constructs a {@link AtscMGT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AtscMGT.allocate();
        }
        
         /**
         * Finish building the {@link AtscMGT} struct.
         * @return A new instance of {@code AtscMGT} with the fields 
         *         that were set in the Build object.
         */
        public AtscMGT construct() {
            return struct;
        }
        
        /**
         * The protocol version
         * @param protocolVersion The value for the {@code protocolVersion} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setProtocolVersion(byte protocolVersion) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), protocolVersion);
            return this;
        }
        
        /**
         * The numbers of subtables
         * @param tablesDefined The value for the {@code tablesDefined} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTablesDefined(short tablesDefined) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tables_defined"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), tablesDefined);
            return this;
        }
        
        /**
         * the tables
         * @param tables The value for the {@code tables} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTables(org.gstreamer.mpegts.AtscMGTTable[] tables) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tables"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tables == null ? MemoryAddress.NULL : Interop.allocateNativeArray(tables, org.gstreamer.mpegts.AtscMGTTable.getMemoryLayout(), false)));
            return this;
        }
        
        /**
         * descriptors
         * @param descriptors The value for the {@code descriptors} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDescriptors(org.gstreamer.mpegts.Descriptor[] descriptors) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (descriptors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(descriptors, org.gstreamer.mpegts.Descriptor.getMemoryLayout(), false)));
            return this;
        }
    }
}
