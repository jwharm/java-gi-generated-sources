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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
     * Allocate a new {@link TerrestrialDeliverySystemDescriptor}
     * @return A new, uninitialized @{link TerrestrialDeliverySystemDescriptor}
     */
    public static TerrestrialDeliverySystemDescriptor allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TerrestrialDeliverySystemDescriptor newInstance = new TerrestrialDeliverySystemDescriptor(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code frequency}
     * @return The value of the field {@code frequency}
     */
    public int frequency$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frequency"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code frequency}
     * @param frequency The new value of the field {@code frequency}
     */
    public void frequency$set(int frequency) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frequency"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), frequency);
    }
    
    /**
     * Get the value of the field {@code bandwidth}
     * @return The value of the field {@code bandwidth}
     */
    public int bandwidth$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bandwidth"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code bandwidth}
     * @param bandwidth The new value of the field {@code bandwidth}
     */
    public void bandwidth$set(int bandwidth) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bandwidth"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), bandwidth);
    }
    
    /**
     * Get the value of the field {@code priority}
     * @return The value of the field {@code priority}
     */
    public boolean priority$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("priority"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code priority}
     * @param priority The new value of the field {@code priority}
     */
    public void priority$set(boolean priority) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("priority"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), priority ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code time_slicing}
     * @return The value of the field {@code time_slicing}
     */
    public boolean timeSlicing$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("time_slicing"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code time_slicing}
     * @param timeSlicing The new value of the field {@code time_slicing}
     */
    public void timeSlicing$set(boolean timeSlicing) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("time_slicing"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), timeSlicing ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code mpe_fec}
     * @return The value of the field {@code mpe_fec}
     */
    public boolean mpeFec$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mpe_fec"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code mpe_fec}
     * @param mpeFec The new value of the field {@code mpe_fec}
     */
    public void mpeFec$set(boolean mpeFec) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mpe_fec"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), mpeFec ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code constellation}
     * @return The value of the field {@code constellation}
     */
    public org.gstreamer.mpegts.ModulationType constellation$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("constellation"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.mpegts.ModulationType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code constellation}
     * @param constellation The new value of the field {@code constellation}
     */
    public void constellation$set(org.gstreamer.mpegts.ModulationType constellation) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("constellation"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), constellation.getValue());
    }
    
    /**
     * Get the value of the field {@code hierarchy}
     * @return The value of the field {@code hierarchy}
     */
    public org.gstreamer.mpegts.TerrestrialHierarchy hierarchy$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hierarchy"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.mpegts.TerrestrialHierarchy.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code hierarchy}
     * @param hierarchy The new value of the field {@code hierarchy}
     */
    public void hierarchy$set(org.gstreamer.mpegts.TerrestrialHierarchy hierarchy) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hierarchy"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), hierarchy.getValue());
    }
    
    /**
     * Get the value of the field {@code code_rate_hp}
     * @return The value of the field {@code code_rate_hp}
     */
    public org.gstreamer.mpegts.DVBCodeRate codeRateHp$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("code_rate_hp"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.mpegts.DVBCodeRate.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code code_rate_hp}
     * @param codeRateHp The new value of the field {@code code_rate_hp}
     */
    public void codeRateHp$set(org.gstreamer.mpegts.DVBCodeRate codeRateHp) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("code_rate_hp"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), codeRateHp.getValue());
    }
    
    /**
     * Get the value of the field {@code code_rate_lp}
     * @return The value of the field {@code code_rate_lp}
     */
    public org.gstreamer.mpegts.DVBCodeRate codeRateLp$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("code_rate_lp"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.mpegts.DVBCodeRate.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code code_rate_lp}
     * @param codeRateLp The new value of the field {@code code_rate_lp}
     */
    public void codeRateLp$set(org.gstreamer.mpegts.DVBCodeRate codeRateLp) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("code_rate_lp"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), codeRateLp.getValue());
    }
    
    /**
     * Get the value of the field {@code guard_interval}
     * @return The value of the field {@code guard_interval}
     */
    public org.gstreamer.mpegts.TerrestrialGuardInterval guardInterval$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("guard_interval"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.mpegts.TerrestrialGuardInterval.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code guard_interval}
     * @param guardInterval The new value of the field {@code guard_interval}
     */
    public void guardInterval$set(org.gstreamer.mpegts.TerrestrialGuardInterval guardInterval) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("guard_interval"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), guardInterval.getValue());
    }
    
    /**
     * Get the value of the field {@code transmission_mode}
     * @return The value of the field {@code transmission_mode}
     */
    public org.gstreamer.mpegts.TerrestrialTransmissionMode transmissionMode$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transmission_mode"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.mpegts.TerrestrialTransmissionMode.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code transmission_mode}
     * @param transmissionMode The new value of the field {@code transmission_mode}
     */
    public void transmissionMode$set(org.gstreamer.mpegts.TerrestrialTransmissionMode transmissionMode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transmission_mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), transmissionMode.getValue());
    }
    
    /**
     * Get the value of the field {@code other_frequency}
     * @return The value of the field {@code other_frequency}
     */
    public boolean otherFrequency$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("other_frequency"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code other_frequency}
     * @param otherFrequency The new value of the field {@code other_frequency}
     */
    public void otherFrequency$set(boolean otherFrequency) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("other_frequency"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), otherFrequency ? 1 : 0);
    }
    
    /**
     * Create a TerrestrialDeliverySystemDescriptor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TerrestrialDeliverySystemDescriptor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TerrestrialDeliverySystemDescriptor struct;
        
         /**
         * A {@link TerrestrialDeliverySystemDescriptor.Build} object constructs a {@link TerrestrialDeliverySystemDescriptor} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TerrestrialDeliverySystemDescriptor.allocate();
        }
        
         /**
         * Finish building the {@link TerrestrialDeliverySystemDescriptor} struct.
         * @return A new instance of {@code TerrestrialDeliverySystemDescriptor} with the fields 
         *         that were set in the Build object.
         */
        public TerrestrialDeliverySystemDescriptor construct() {
            return struct;
        }
        
        /**
         * the frequency in Hz (Hertz)
         * @param frequency The value for the {@code frequency} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFrequency(int frequency) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("frequency"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), frequency);
            return this;
        }
        
        /**
         * the bandwidth in Hz (Hertz)
         * @param bandwidth The value for the {@code bandwidth} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBandwidth(int bandwidth) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bandwidth"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), bandwidth);
            return this;
        }
        
        /**
         * {@code true} High Priority {@code false} Low Priority
         * @param priority The value for the {@code priority} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPriority(boolean priority) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("priority"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), priority ? 1 : 0);
            return this;
        }
        
        /**
         * {@code true} no time slicing {@code false} time slicing
         * @param timeSlicing The value for the {@code timeSlicing} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTimeSlicing(boolean timeSlicing) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("time_slicing"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), timeSlicing ? 1 : 0);
            return this;
        }
        
        /**
         * {@code true} no mpe-fec is used {@code false} mpe-fec is use
         * @param mpeFec The value for the {@code mpeFec} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMpeFec(boolean mpeFec) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mpe_fec"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), mpeFec ? 1 : 0);
            return this;
        }
        
        /**
         * the constellation
         * @param constellation The value for the {@code constellation} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setConstellation(org.gstreamer.mpegts.ModulationType constellation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("constellation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (constellation == null ? MemoryAddress.NULL : constellation.getValue()));
            return this;
        }
        
        /**
         * the hierarchy
         * @param hierarchy The value for the {@code hierarchy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHierarchy(org.gstreamer.mpegts.TerrestrialHierarchy hierarchy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hierarchy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hierarchy == null ? MemoryAddress.NULL : hierarchy.getValue()));
            return this;
        }
        
        public Build setCodeRateHp(org.gstreamer.mpegts.DVBCodeRate codeRateHp) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("code_rate_hp"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (codeRateHp == null ? MemoryAddress.NULL : codeRateHp.getValue()));
            return this;
        }
        
        public Build setCodeRateLp(org.gstreamer.mpegts.DVBCodeRate codeRateLp) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("code_rate_lp"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (codeRateLp == null ? MemoryAddress.NULL : codeRateLp.getValue()));
            return this;
        }
        
        public Build setGuardInterval(org.gstreamer.mpegts.TerrestrialGuardInterval guardInterval) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("guard_interval"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (guardInterval == null ? MemoryAddress.NULL : guardInterval.getValue()));
            return this;
        }
        
        public Build setTransmissionMode(org.gstreamer.mpegts.TerrestrialTransmissionMode transmissionMode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transmission_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transmissionMode == null ? MemoryAddress.NULL : transmissionMode.getValue()));
            return this;
        }
        
        /**
         * {@code true} more frequency are use, else not
         * @param otherFrequency The value for the {@code otherFrequency} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setOtherFrequency(boolean otherFrequency) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("other_frequency"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), otherFrequency ? 1 : 0);
            return this;
        }
    }
}
