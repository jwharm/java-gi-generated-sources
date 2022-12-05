package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class T2DeliverySystemCell extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsT2DeliverySystemCell";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_SHORT.withName("cell_id"),
        MemoryLayout.paddingLayout(48),
        Interop.valueLayout.ADDRESS.withName("centre_frequencies"),
        Interop.valueLayout.ADDRESS.withName("sub_cells")
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
     * Allocate a new {@link T2DeliverySystemCell}
     * @return A new, uninitialized @{link T2DeliverySystemCell}
     */
    public static T2DeliverySystemCell allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        T2DeliverySystemCell newInstance = new T2DeliverySystemCell(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code cell_id}
     * @return The value of the field {@code cell_id}
     */
    public short cellId$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cell_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code cell_id}
     * @param cellId The new value of the field {@code cell_id}
     */
    public void cellId$set(short cellId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cell_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), cellId);
    }
    
    /**
     * Create a T2DeliverySystemCell proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public T2DeliverySystemCell(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private T2DeliverySystemCell struct;
        
         /**
         * A {@link T2DeliverySystemCell.Build} object constructs a {@link T2DeliverySystemCell} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = T2DeliverySystemCell.allocate();
        }
        
         /**
         * Finish building the {@link T2DeliverySystemCell} struct.
         * @return A new instance of {@code T2DeliverySystemCell} with the fields 
         *         that were set in the Build object.
         */
        public T2DeliverySystemCell construct() {
            return struct;
        }
        
        /**
         * id of the cell
         * @param cellId The value for the {@code cellId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCellId(short cellId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cell_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), cellId);
            return this;
        }
        
        /**
         * centre frequencies in Hz
         * @param centreFrequencies The value for the {@code centreFrequencies} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCentreFrequencies(int[] centreFrequencies) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("centre_frequencies"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (centreFrequencies == null ? MemoryAddress.NULL : Interop.allocateNativeArray(centreFrequencies, false)));
            return this;
        }
        
        public Build setSubCells(org.gstreamer.mpegts.T2DeliverySystemCellExtension[] subCells) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sub_cells"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (subCells == null ? MemoryAddress.NULL : Interop.allocateNativeArray(subCells, org.gstreamer.mpegts.T2DeliverySystemCellExtension.getMemoryLayout(), false)));
            return this;
        }
    }
}
