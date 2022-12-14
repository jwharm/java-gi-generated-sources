package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * describe DVB-T2 transmissions according to EN 302 755
 */
public class T2DeliverySystemDescriptor extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsT2DeliverySystemDescriptor";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_BYTE.withName("plp_id"),
            MemoryLayout.paddingLayout(8),
            Interop.valueLayout.C_SHORT.withName("t2_system_id"),
            Interop.valueLayout.C_BYTE.withName("siso_miso"),
            MemoryLayout.paddingLayout(24),
            Interop.valueLayout.C_INT.withName("bandwidth"),
            Interop.valueLayout.C_INT.withName("guard_interval"),
            Interop.valueLayout.C_INT.withName("transmission_mode"),
            Interop.valueLayout.C_INT.withName("other_frequency"),
            Interop.valueLayout.C_INT.withName("tfs"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("cells")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link T2DeliverySystemDescriptor}
     * @return A new, uninitialized @{link T2DeliverySystemDescriptor}
     */
    public static T2DeliverySystemDescriptor allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        T2DeliverySystemDescriptor newInstance = new T2DeliverySystemDescriptor(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code plp_id}
     * @return The value of the field {@code plp_id}
     */
    public byte getPlpId() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("plp_id"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code plp_id}
     * @param plpId The new value of the field {@code plp_id}
     */
    public void setPlpId(byte plpId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("plp_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), plpId);
        }
    }
    
    /**
     * Get the value of the field {@code t2_system_id}
     * @return The value of the field {@code t2_system_id}
     */
    public short getT2SystemId() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("t2_system_id"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code t2_system_id}
     * @param t2SystemId The new value of the field {@code t2_system_id}
     */
    public void setT2SystemId(short t2SystemId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("t2_system_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), t2SystemId);
        }
    }
    
    /**
     * Get the value of the field {@code siso_miso}
     * @return The value of the field {@code siso_miso}
     */
    public byte getSisoMiso() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("siso_miso"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code siso_miso}
     * @param sisoMiso The new value of the field {@code siso_miso}
     */
    public void setSisoMiso(byte sisoMiso) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("siso_miso"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), sisoMiso);
        }
    }
    
    /**
     * Get the value of the field {@code bandwidth}
     * @return The value of the field {@code bandwidth}
     */
    public int getBandwidth() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bandwidth"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code bandwidth}
     * @param bandwidth The new value of the field {@code bandwidth}
     */
    public void setBandwidth(int bandwidth) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bandwidth"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), bandwidth);
        }
    }
    
    /**
     * Get the value of the field {@code guard_interval}
     * @return The value of the field {@code guard_interval}
     */
    public org.gstreamer.mpegts.TerrestrialGuardInterval getGuardInterval() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("guard_interval"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.mpegts.TerrestrialGuardInterval.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code guard_interval}
     * @param guardInterval The new value of the field {@code guard_interval}
     */
    public void setGuardInterval(org.gstreamer.mpegts.TerrestrialGuardInterval guardInterval) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("guard_interval"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (guardInterval == null ? MemoryAddress.NULL : guardInterval.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code transmission_mode}
     * @return The value of the field {@code transmission_mode}
     */
    public org.gstreamer.mpegts.TerrestrialTransmissionMode getTransmissionMode() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transmission_mode"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.mpegts.TerrestrialTransmissionMode.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code transmission_mode}
     * @param transmissionMode The new value of the field {@code transmission_mode}
     */
    public void setTransmissionMode(org.gstreamer.mpegts.TerrestrialTransmissionMode transmissionMode) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transmission_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (transmissionMode == null ? MemoryAddress.NULL : transmissionMode.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code other_frequency}
     * @return The value of the field {@code other_frequency}
     */
    public boolean getOtherFrequency() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("other_frequency"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code other_frequency}
     * @param otherFrequency The new value of the field {@code other_frequency}
     */
    public void setOtherFrequency(boolean otherFrequency) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("other_frequency"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(otherFrequency, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code tfs}
     * @return The value of the field {@code tfs}
     */
    public boolean getTfs() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tfs"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code tfs}
     * @param tfs The new value of the field {@code tfs}
     */
    public void setTfs(boolean tfs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tfs"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(tfs, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code cells}
     * @return The value of the field {@code cells}
     */
    public PointerProxy<org.gstreamer.mpegts.T2DeliverySystemCell> getCells() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cells"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerProxy<org.gstreamer.mpegts.T2DeliverySystemCell>(RESULT, org.gstreamer.mpegts.T2DeliverySystemCell.fromAddress);
        }
    }
    
    /**
     * Change the value of the field {@code cells}
     * @param cells The new value of the field {@code cells}
     */
    public void setCells(org.gstreamer.mpegts.T2DeliverySystemCell[] cells) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cells"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (cells == null ? MemoryAddress.NULL : Interop.allocateNativeArray(cells, org.gstreamer.mpegts.T2DeliverySystemCell.getMemoryLayout(), false, SCOPE)));
        }
    }
    
    /**
     * Create a T2DeliverySystemDescriptor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected T2DeliverySystemDescriptor(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, T2DeliverySystemDescriptor> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new T2DeliverySystemDescriptor(input);
    
    public void free() {
        try {
            DowncallHandles.gst_mpegts_t2_delivery_system_descriptor_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_t2_delivery_system_descriptor_free = Interop.downcallHandle(
                "gst_mpegts_t2_delivery_system_descriptor_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link T2DeliverySystemDescriptor.Builder} object constructs a {@link T2DeliverySystemDescriptor} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link T2DeliverySystemDescriptor.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final T2DeliverySystemDescriptor struct;
        
        private Builder() {
            struct = T2DeliverySystemDescriptor.allocate();
        }
        
        /**
         * Finish building the {@link T2DeliverySystemDescriptor} struct.
         * @return A new instance of {@code T2DeliverySystemDescriptor} with the fields 
         *         that were set in the Builder object.
         */
        public T2DeliverySystemDescriptor build() {
            return struct;
        }
        
        public Builder setPlpId(byte plpId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("plp_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), plpId);
                return this;
            }
        }
        
        public Builder setT2SystemId(short t2SystemId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("t2_system_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), t2SystemId);
                return this;
            }
        }
        
        public Builder setSisoMiso(byte sisoMiso) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("siso_miso"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), sisoMiso);
                return this;
            }
        }
        
        public Builder setBandwidth(int bandwidth) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("bandwidth"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), bandwidth);
                return this;
            }
        }
        
        public Builder setGuardInterval(org.gstreamer.mpegts.TerrestrialGuardInterval guardInterval) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("guard_interval"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (guardInterval == null ? MemoryAddress.NULL : guardInterval.getValue()));
                return this;
            }
        }
        
        public Builder setTransmissionMode(org.gstreamer.mpegts.TerrestrialTransmissionMode transmissionMode) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("transmission_mode"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (transmissionMode == null ? MemoryAddress.NULL : transmissionMode.getValue()));
                return this;
            }
        }
        
        public Builder setOtherFrequency(boolean otherFrequency) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("other_frequency"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(otherFrequency, null).intValue());
                return this;
            }
        }
        
        public Builder setTfs(boolean tfs) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tfs"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(tfs, null).intValue());
                return this;
            }
        }
        
        public Builder setCells(org.gstreamer.mpegts.T2DeliverySystemCell[] cells) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("cells"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (cells == null ? MemoryAddress.NULL : Interop.allocateNativeArray(cells, org.gstreamer.mpegts.T2DeliverySystemCell.getMemoryLayout(), false, SCOPE)));
                return this;
            }
        }
    }
}
