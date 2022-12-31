package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class T2DeliverySystemCellExtension extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsT2DeliverySystemCellExtension";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_BYTE.withName("cell_id_extension"),
            MemoryLayout.paddingLayout(24),
            Interop.valueLayout.C_INT.withName("transposer_frequency")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link T2DeliverySystemCellExtension}
     * @return A new, uninitialized @{link T2DeliverySystemCellExtension}
     */
    public static T2DeliverySystemCellExtension allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        T2DeliverySystemCellExtension newInstance = new T2DeliverySystemCellExtension(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code cell_id_extension}
     * @return The value of the field {@code cell_id_extension}
     */
    public byte getCellIdExtension() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cell_id_extension"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code cell_id_extension}
     * @param cellIdExtension The new value of the field {@code cell_id_extension}
     */
    public void setCellIdExtension(byte cellIdExtension) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cell_id_extension"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), cellIdExtension);
    }
    
    /**
     * Get the value of the field {@code transposer_frequency}
     * @return The value of the field {@code transposer_frequency}
     */
    public int getTransposerFrequency() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transposer_frequency"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code transposer_frequency}
     * @param transposerFrequency The new value of the field {@code transposer_frequency}
     */
    public void setTransposerFrequency(int transposerFrequency) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transposer_frequency"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), transposerFrequency);
    }
    
    /**
     * Create a T2DeliverySystemCellExtension proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected T2DeliverySystemCellExtension(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, T2DeliverySystemCellExtension> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new T2DeliverySystemCellExtension(input, ownership);
    
    /**
     * A {@link T2DeliverySystemCellExtension.Builder} object constructs a {@link T2DeliverySystemCellExtension} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link T2DeliverySystemCellExtension.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final T2DeliverySystemCellExtension struct;
        
        private Builder() {
            struct = T2DeliverySystemCellExtension.allocate();
        }
        
         /**
         * Finish building the {@link T2DeliverySystemCellExtension} struct.
         * @return A new instance of {@code T2DeliverySystemCellExtension} with the fields 
         *         that were set in the Builder object.
         */
        public T2DeliverySystemCellExtension build() {
            return struct;
        }
        
        /**
         * id of the sub cell
         * @param cellIdExtension The value for the {@code cellIdExtension} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCellIdExtension(byte cellIdExtension) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cell_id_extension"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), cellIdExtension);
            return this;
        }
        
        /**
         * centre frequency of the sub cell in Hz
         * @param transposerFrequency The value for the {@code transposerFrequency} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTransposerFrequency(int transposerFrequency) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transposer_frequency"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), transposerFrequency);
            return this;
        }
    }
}
