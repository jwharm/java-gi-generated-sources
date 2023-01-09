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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_SHORT.withName("cell_id"),
            MemoryLayout.paddingLayout(48),
            Interop.valueLayout.ADDRESS.withName("centre_frequencies"),
            Interop.valueLayout.ADDRESS.withName("sub_cells")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link T2DeliverySystemCell}
     * @return A new, uninitialized @{link T2DeliverySystemCell}
     */
    public static T2DeliverySystemCell allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        T2DeliverySystemCell newInstance = new T2DeliverySystemCell(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code cell_id}
     * @return The value of the field {@code cell_id}
     */
    public short getCellId() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cell_id"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code cell_id}
     * @param cellId The new value of the field {@code cell_id}
     */
    public void setCellId(short cellId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cell_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), cellId);
        }
    }
    
    /**
     * Get the value of the field {@code centre_frequencies}
     * @return The value of the field {@code centre_frequencies}
     */
    public PointerInteger getCentreFrequencies() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("centre_frequencies"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerInteger(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code centre_frequencies}
     * @param centreFrequencies The new value of the field {@code centre_frequencies}
     */
    public void setCentreFrequencies(int[] centreFrequencies) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("centre_frequencies"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (centreFrequencies == null ? MemoryAddress.NULL : Interop.allocateNativeArray(centreFrequencies, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code sub_cells}
     * @return The value of the field {@code sub_cells}
     */
    public PointerProxy<org.gstreamer.mpegts.T2DeliverySystemCellExtension> getSubCells() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sub_cells"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerProxy<org.gstreamer.mpegts.T2DeliverySystemCellExtension>(RESULT, org.gstreamer.mpegts.T2DeliverySystemCellExtension.fromAddress);
        }
    }
    
    /**
     * Change the value of the field {@code sub_cells}
     * @param subCells The new value of the field {@code sub_cells}
     */
    public void setSubCells(org.gstreamer.mpegts.T2DeliverySystemCellExtension[] subCells) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sub_cells"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (subCells == null ? MemoryAddress.NULL : Interop.allocateNativeArray(subCells, org.gstreamer.mpegts.T2DeliverySystemCellExtension.getMemoryLayout(), false, SCOPE)));
        }
    }
    
    /**
     * Create a T2DeliverySystemCell proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected T2DeliverySystemCell(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, T2DeliverySystemCell> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new T2DeliverySystemCell(input);
    
    /**
     * A {@link T2DeliverySystemCell.Builder} object constructs a {@link T2DeliverySystemCell} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link T2DeliverySystemCell.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final T2DeliverySystemCell struct;
        
        private Builder() {
            struct = T2DeliverySystemCell.allocate();
        }
        
        /**
         * Finish building the {@link T2DeliverySystemCell} struct.
         * @return A new instance of {@code T2DeliverySystemCell} with the fields 
         *         that were set in the Builder object.
         */
        public T2DeliverySystemCell build() {
            return struct;
        }
        
        /**
         * id of the cell
         * @param cellId The value for the {@code cellId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCellId(short cellId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("cell_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), cellId);
                return this;
            }
        }
        
        /**
         * centre frequencies in Hz
         * @param centreFrequencies The value for the {@code centreFrequencies} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCentreFrequencies(int[] centreFrequencies) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("centre_frequencies"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (centreFrequencies == null ? MemoryAddress.NULL : Interop.allocateNativeArray(centreFrequencies, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setSubCells(org.gstreamer.mpegts.T2DeliverySystemCellExtension[] subCells) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("sub_cells"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (subCells == null ? MemoryAddress.NULL : Interop.allocateNativeArray(subCells, org.gstreamer.mpegts.T2DeliverySystemCellExtension.getMemoryLayout(), false, SCOPE)));
                return this;
            }
        }
    }
}
