package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Cable Delivery System Descriptor (EN 300 468 v.1.13.1)
 */
public class CableDeliverySystemDescriptor extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsCableDeliverySystemDescriptor";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("frequency"),
            Interop.valueLayout.C_INT.withName("outer_fec"),
            Interop.valueLayout.C_INT.withName("modulation"),
            Interop.valueLayout.C_INT.withName("symbol_rate"),
            Interop.valueLayout.C_INT.withName("fec_inner")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link CableDeliverySystemDescriptor}
     * @return A new, uninitialized @{link CableDeliverySystemDescriptor}
     */
    public static CableDeliverySystemDescriptor allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CableDeliverySystemDescriptor newInstance = new CableDeliverySystemDescriptor(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code frequency}
     * @return The value of the field {@code frequency}
     */
    public int getFrequency() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frequency"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code frequency}
     * @param frequency The new value of the field {@code frequency}
     */
    public void setFrequency(int frequency) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frequency"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), frequency);
    }
    
    /**
     * Get the value of the field {@code outer_fec}
     * @return The value of the field {@code outer_fec}
     */
    public org.gstreamer.mpegts.CableOuterFECScheme getOuterFec() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("outer_fec"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.mpegts.CableOuterFECScheme.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code outer_fec}
     * @param outerFec The new value of the field {@code outer_fec}
     */
    public void setOuterFec(org.gstreamer.mpegts.CableOuterFECScheme outerFec) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("outer_fec"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (outerFec == null ? MemoryAddress.NULL : outerFec.getValue()));
    }
    
    /**
     * Get the value of the field {@code modulation}
     * @return The value of the field {@code modulation}
     */
    public org.gstreamer.mpegts.ModulationType getModulation() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("modulation"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.mpegts.ModulationType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code modulation}
     * @param modulation The new value of the field {@code modulation}
     */
    public void setModulation(org.gstreamer.mpegts.ModulationType modulation) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("modulation"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (modulation == null ? MemoryAddress.NULL : modulation.getValue()));
    }
    
    /**
     * Get the value of the field {@code symbol_rate}
     * @return The value of the field {@code symbol_rate}
     */
    public int getSymbolRate() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("symbol_rate"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code symbol_rate}
     * @param symbolRate The new value of the field {@code symbol_rate}
     */
    public void setSymbolRate(int symbolRate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("symbol_rate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), symbolRate);
    }
    
    /**
     * Get the value of the field {@code fec_inner}
     * @return The value of the field {@code fec_inner}
     */
    public org.gstreamer.mpegts.DVBCodeRate getFecInner() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fec_inner"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.mpegts.DVBCodeRate.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code fec_inner}
     * @param fecInner The new value of the field {@code fec_inner}
     */
    public void setFecInner(org.gstreamer.mpegts.DVBCodeRate fecInner) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fec_inner"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fecInner == null ? MemoryAddress.NULL : fecInner.getValue()));
    }
    
    /**
     * Create a CableDeliverySystemDescriptor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CableDeliverySystemDescriptor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CableDeliverySystemDescriptor> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CableDeliverySystemDescriptor(input, ownership);
    
    public void free() {
        try {
            DowncallHandles.gst_mpegts_dvb_cable_delivery_system_descriptor_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_dvb_cable_delivery_system_descriptor_free = Interop.downcallHandle(
            "gst_mpegts_dvb_cable_delivery_system_descriptor_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link CableDeliverySystemDescriptor.Builder} object constructs a {@link CableDeliverySystemDescriptor} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link CableDeliverySystemDescriptor.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final CableDeliverySystemDescriptor struct;
        
        private Builder() {
            struct = CableDeliverySystemDescriptor.allocate();
        }
        
         /**
         * Finish building the {@link CableDeliverySystemDescriptor} struct.
         * @return A new instance of {@code CableDeliverySystemDescriptor} with the fields 
         *         that were set in the Builder object.
         */
        public CableDeliverySystemDescriptor build() {
            return struct;
        }
        
        /**
         * the frequency in Hz (Hertz)
         * @param frequency The value for the {@code frequency} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFrequency(int frequency) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("frequency"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), frequency);
            return this;
        }
        
        /**
         * the outer FEC scheme used
         * @param outerFec The value for the {@code outerFec} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOuterFec(org.gstreamer.mpegts.CableOuterFECScheme outerFec) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("outer_fec"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (outerFec == null ? MemoryAddress.NULL : outerFec.getValue()));
            return this;
        }
        
        /**
         * Modulation scheme used
         * @param modulation The value for the {@code modulation} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModulation(org.gstreamer.mpegts.ModulationType modulation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("modulation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (modulation == null ? MemoryAddress.NULL : modulation.getValue()));
            return this;
        }
        
        /**
         * Symbol rate (in symbols per second)
         * @param symbolRate The value for the {@code symbolRate} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSymbolRate(int symbolRate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("symbol_rate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), symbolRate);
            return this;
        }
        
        /**
         * inner FEC scheme used
         * @param fecInner The value for the {@code fecInner} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFecInner(org.gstreamer.mpegts.DVBCodeRate fecInner) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fec_inner"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fecInner == null ? MemoryAddress.NULL : fecInner.getValue()));
            return this;
        }
    }
}
