package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Terrestrial Delivery System Descriptor (EN 300 468 v.1.13.1)
 */
public class TerrestrialDeliverySystemDescriptor extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsTerrestrialDeliverySystemDescriptor";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("frequency"),
            Interop.valueLayout.C_INT.withName("bandwidth"),
            Interop.valueLayout.C_INT.withName("priority"),
            Interop.valueLayout.C_INT.withName("time_slicing"),
            Interop.valueLayout.C_INT.withName("mpe_fec"),
            Interop.valueLayout.C_INT.withName("constellation"),
            Interop.valueLayout.C_INT.withName("hierarchy"),
            Interop.valueLayout.C_INT.withName("code_rate_hp"),
            Interop.valueLayout.C_INT.withName("code_rate_lp"),
            Interop.valueLayout.C_INT.withName("guard_interval"),
            Interop.valueLayout.C_INT.withName("transmission_mode"),
            Interop.valueLayout.C_INT.withName("other_frequency")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TerrestrialDeliverySystemDescriptor}
     * @return A new, uninitialized @{link TerrestrialDeliverySystemDescriptor}
     */
    public static TerrestrialDeliverySystemDescriptor allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TerrestrialDeliverySystemDescriptor newInstance = new TerrestrialDeliverySystemDescriptor(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code frequency}
     * @return The value of the field {@code frequency}
     */
    public int getFrequency() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("frequency"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code frequency}
     * @param frequency The new value of the field {@code frequency}
     */
    public void setFrequency(int frequency) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("frequency"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), frequency);
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
     * Get the value of the field {@code priority}
     * @return The value of the field {@code priority}
     */
    public boolean getPriority() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("priority"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code priority}
     * @param priority The new value of the field {@code priority}
     */
    public void setPriority(boolean priority) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("priority"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(priority, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code time_slicing}
     * @return The value of the field {@code time_slicing}
     */
    public boolean getTimeSlicing() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("time_slicing"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code time_slicing}
     * @param timeSlicing The new value of the field {@code time_slicing}
     */
    public void setTimeSlicing(boolean timeSlicing) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("time_slicing"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(timeSlicing, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code mpe_fec}
     * @return The value of the field {@code mpe_fec}
     */
    public boolean getMpeFec() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mpe_fec"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code mpe_fec}
     * @param mpeFec The new value of the field {@code mpe_fec}
     */
    public void setMpeFec(boolean mpeFec) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mpe_fec"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(mpeFec, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code constellation}
     * @return The value of the field {@code constellation}
     */
    public org.gstreamer.mpegts.ModulationType getConstellation() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("constellation"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.mpegts.ModulationType.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code constellation}
     * @param constellation The new value of the field {@code constellation}
     */
    public void setConstellation(org.gstreamer.mpegts.ModulationType constellation) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("constellation"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (constellation == null ? MemoryAddress.NULL : constellation.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code hierarchy}
     * @return The value of the field {@code hierarchy}
     */
    public org.gstreamer.mpegts.TerrestrialHierarchy getHierarchy() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hierarchy"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.mpegts.TerrestrialHierarchy.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code hierarchy}
     * @param hierarchy The new value of the field {@code hierarchy}
     */
    public void setHierarchy(org.gstreamer.mpegts.TerrestrialHierarchy hierarchy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hierarchy"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (hierarchy == null ? MemoryAddress.NULL : hierarchy.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code code_rate_hp}
     * @return The value of the field {@code code_rate_hp}
     */
    public org.gstreamer.mpegts.DVBCodeRate getCodeRateHp() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("code_rate_hp"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.mpegts.DVBCodeRate.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code code_rate_hp}
     * @param codeRateHp The new value of the field {@code code_rate_hp}
     */
    public void setCodeRateHp(org.gstreamer.mpegts.DVBCodeRate codeRateHp) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("code_rate_hp"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (codeRateHp == null ? MemoryAddress.NULL : codeRateHp.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code code_rate_lp}
     * @return The value of the field {@code code_rate_lp}
     */
    public org.gstreamer.mpegts.DVBCodeRate getCodeRateLp() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("code_rate_lp"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.mpegts.DVBCodeRate.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code code_rate_lp}
     * @param codeRateLp The new value of the field {@code code_rate_lp}
     */
    public void setCodeRateLp(org.gstreamer.mpegts.DVBCodeRate codeRateLp) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("code_rate_lp"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (codeRateLp == null ? MemoryAddress.NULL : codeRateLp.getValue()));
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
     * Create a TerrestrialDeliverySystemDescriptor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TerrestrialDeliverySystemDescriptor(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TerrestrialDeliverySystemDescriptor> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TerrestrialDeliverySystemDescriptor(input);
    
    /**
     * A {@link TerrestrialDeliverySystemDescriptor.Builder} object constructs a {@link TerrestrialDeliverySystemDescriptor} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TerrestrialDeliverySystemDescriptor.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TerrestrialDeliverySystemDescriptor struct;
        
        private Builder() {
            struct = TerrestrialDeliverySystemDescriptor.allocate();
        }
        
        /**
         * Finish building the {@link TerrestrialDeliverySystemDescriptor} struct.
         * @return A new instance of {@code TerrestrialDeliverySystemDescriptor} with the fields 
         *         that were set in the Builder object.
         */
        public TerrestrialDeliverySystemDescriptor build() {
            return struct;
        }
        
        /**
         * the frequency in Hz (Hertz)
         * @param frequency The value for the {@code frequency} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFrequency(int frequency) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("frequency"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), frequency);
                return this;
            }
        }
        
        /**
         * the bandwidth in Hz (Hertz)
         * @param bandwidth The value for the {@code bandwidth} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBandwidth(int bandwidth) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("bandwidth"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), bandwidth);
                return this;
            }
        }
        
        /**
         * {@code true} High Priority {@code false} Low Priority
         * @param priority The value for the {@code priority} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPriority(boolean priority) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("priority"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(priority, null).intValue());
                return this;
            }
        }
        
        /**
         * {@code true} no time slicing {@code false} time slicing
         * @param timeSlicing The value for the {@code timeSlicing} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTimeSlicing(boolean timeSlicing) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("time_slicing"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(timeSlicing, null).intValue());
                return this;
            }
        }
        
        /**
         * {@code true} no mpe-fec is used {@code false} mpe-fec is use
         * @param mpeFec The value for the {@code mpeFec} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMpeFec(boolean mpeFec) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mpe_fec"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(mpeFec, null).intValue());
                return this;
            }
        }
        
        /**
         * the constellation
         * @param constellation The value for the {@code constellation} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setConstellation(org.gstreamer.mpegts.ModulationType constellation) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("constellation"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (constellation == null ? MemoryAddress.NULL : constellation.getValue()));
                return this;
            }
        }
        
        /**
         * the hierarchy
         * @param hierarchy The value for the {@code hierarchy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHierarchy(org.gstreamer.mpegts.TerrestrialHierarchy hierarchy) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("hierarchy"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (hierarchy == null ? MemoryAddress.NULL : hierarchy.getValue()));
                return this;
            }
        }
        
        public Builder setCodeRateHp(org.gstreamer.mpegts.DVBCodeRate codeRateHp) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("code_rate_hp"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (codeRateHp == null ? MemoryAddress.NULL : codeRateHp.getValue()));
                return this;
            }
        }
        
        public Builder setCodeRateLp(org.gstreamer.mpegts.DVBCodeRate codeRateLp) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("code_rate_lp"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (codeRateLp == null ? MemoryAddress.NULL : codeRateLp.getValue()));
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
        
        /**
         * {@code true} more frequency are use, else not
         * @param otherFrequency The value for the {@code otherFrequency} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOtherFrequency(boolean otherFrequency) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("other_frequency"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(otherFrequency, null).intValue());
                return this;
            }
        }
    }
}
