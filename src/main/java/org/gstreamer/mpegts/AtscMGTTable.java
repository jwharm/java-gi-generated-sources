package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Source from a {@code GstMpegtsAtscMGT}
 */
public class AtscMGTTable extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsAtscMGTTable";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_SHORT.withName("table_type"),
            Interop.valueLayout.C_SHORT.withName("pid"),
            Interop.valueLayout.C_BYTE.withName("version_number"),
            MemoryLayout.paddingLayout(24),
            Interop.valueLayout.C_INT.withName("number_bytes"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("descriptors")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AtscMGTTable}
     * @return A new, uninitialized @{link AtscMGTTable}
     */
    public static AtscMGTTable allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AtscMGTTable newInstance = new AtscMGTTable(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code table_type}
     * @return The value of the field {@code table_type}
     */
    public short getTableType() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("table_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code table_type}
     * @param tableType The new value of the field {@code table_type}
     */
    public void setTableType(short tableType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("table_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tableType);
    }
    
    /**
     * Get the value of the field {@code pid}
     * @return The value of the field {@code pid}
     */
    public short getPid() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pid"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code pid}
     * @param pid The new value of the field {@code pid}
     */
    public void setPid(short pid) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pid"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), pid);
    }
    
    /**
     * Get the value of the field {@code version_number}
     * @return The value of the field {@code version_number}
     */
    public byte getVersionNumber() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("version_number"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code version_number}
     * @param versionNumber The new value of the field {@code version_number}
     */
    public void setVersionNumber(byte versionNumber) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("version_number"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), versionNumber);
    }
    
    /**
     * Get the value of the field {@code number_bytes}
     * @return The value of the field {@code number_bytes}
     */
    public int getNumberBytes() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("number_bytes"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code number_bytes}
     * @param numberBytes The new value of the field {@code number_bytes}
     */
    public void setNumberBytes(int numberBytes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("number_bytes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), numberBytes);
    }
    
    /**
     * Get the value of the field {@code descriptors}
     * @return The value of the field {@code descriptors}
     */
    public PointerProxy<org.gstreamer.mpegts.Descriptor> getDescriptors() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.gstreamer.mpegts.Descriptor>(RESULT, org.gstreamer.mpegts.Descriptor.fromAddress);
    }
    
    /**
     * Change the value of the field {@code descriptors}
     * @param descriptors The new value of the field {@code descriptors}
     */
    public void setDescriptors(org.gstreamer.mpegts.Descriptor[] descriptors) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (descriptors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(descriptors, org.gstreamer.mpegts.Descriptor.getMemoryLayout(), false)));
    }
    
    /**
     * Create a AtscMGTTable proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AtscMGTTable(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AtscMGTTable> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AtscMGTTable(input, ownership);
    
    /**
     * A {@link AtscMGTTable.Builder} object constructs a {@link AtscMGTTable} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AtscMGTTable.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AtscMGTTable struct;
        
        private Builder() {
            struct = AtscMGTTable.allocate();
        }
        
         /**
         * Finish building the {@link AtscMGTTable} struct.
         * @return A new instance of {@code AtscMGTTable} with the fields 
         *         that were set in the Builder object.
         */
        public AtscMGTTable build() {
            return struct;
        }
        
        /**
         * {@link AtscMGTTableType}
         * @param tableType The value for the {@code tableType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTableType(short tableType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("table_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), tableType);
            return this;
        }
        
        /**
         * The packet ID
         * @param pid The value for the {@code pid} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPid(short pid) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pid"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), pid);
            return this;
        }
        
        /**
         * The version number
         * @param versionNumber The value for the {@code versionNumber} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVersionNumber(byte versionNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("version_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), versionNumber);
            return this;
        }
        
        public Builder setNumberBytes(int numberBytes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("number_bytes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), numberBytes);
            return this;
        }
        
        /**
         * descriptors
         * @param descriptors The value for the {@code descriptors} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDescriptors(org.gstreamer.mpegts.Descriptor[] descriptors) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (descriptors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(descriptors, org.gstreamer.mpegts.Descriptor.getMemoryLayout(), false)));
            return this;
        }
    }
}
