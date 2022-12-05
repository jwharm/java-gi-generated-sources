package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Satellite Delivery System Descriptor (EN 300 468 v.1.13.1)
 */
public class SatelliteDeliverySystemDescriptor extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsSatelliteDeliverySystemDescriptor";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("frequency"),
        Interop.valueLayout.C_FLOAT.withName("orbital_position"),
        Interop.valueLayout.C_INT.withName("west_east"),
        Interop.valueLayout.C_INT.withName("polarization"),
        Interop.valueLayout.C_INT.withName("roll_off"),
        Interop.valueLayout.C_INT.withName("modulation_system"),
        Interop.valueLayout.C_INT.withName("modulation_type"),
        Interop.valueLayout.C_INT.withName("symbol_rate"),
        Interop.valueLayout.C_INT.withName("fec_inner")
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
     * Allocate a new {@link SatelliteDeliverySystemDescriptor}
     * @return A new, uninitialized @{link SatelliteDeliverySystemDescriptor}
     */
    public static SatelliteDeliverySystemDescriptor allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SatelliteDeliverySystemDescriptor newInstance = new SatelliteDeliverySystemDescriptor(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code orbital_position}
     * @return The value of the field {@code orbital_position}
     */
    public float orbitalPosition$get() {
        var RESULT = (float) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("orbital_position"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code orbital_position}
     * @param orbitalPosition The new value of the field {@code orbital_position}
     */
    public void orbitalPosition$set(float orbitalPosition) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("orbital_position"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), orbitalPosition);
    }
    
    /**
     * Get the value of the field {@code west_east}
     * @return The value of the field {@code west_east}
     */
    public boolean westEast$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("west_east"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code west_east}
     * @param westEast The new value of the field {@code west_east}
     */
    public void westEast$set(boolean westEast) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("west_east"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), westEast ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code polarization}
     * @return The value of the field {@code polarization}
     */
    public org.gstreamer.mpegts.SatellitePolarizationType polarization$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("polarization"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.mpegts.SatellitePolarizationType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code polarization}
     * @param polarization The new value of the field {@code polarization}
     */
    public void polarization$set(org.gstreamer.mpegts.SatellitePolarizationType polarization) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("polarization"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), polarization.getValue());
    }
    
    /**
     * Get the value of the field {@code roll_off}
     * @return The value of the field {@code roll_off}
     */
    public org.gstreamer.mpegts.SatelliteRolloff rollOff$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("roll_off"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.mpegts.SatelliteRolloff.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code roll_off}
     * @param rollOff The new value of the field {@code roll_off}
     */
    public void rollOff$set(org.gstreamer.mpegts.SatelliteRolloff rollOff) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("roll_off"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), rollOff.getValue());
    }
    
    /**
     * Get the value of the field {@code modulation_system}
     * @return The value of the field {@code modulation_system}
     */
    public boolean modulationSystem$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("modulation_system"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code modulation_system}
     * @param modulationSystem The new value of the field {@code modulation_system}
     */
    public void modulationSystem$set(boolean modulationSystem) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("modulation_system"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), modulationSystem ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code modulation_type}
     * @return The value of the field {@code modulation_type}
     */
    public org.gstreamer.mpegts.ModulationType modulationType$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("modulation_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.mpegts.ModulationType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code modulation_type}
     * @param modulationType The new value of the field {@code modulation_type}
     */
    public void modulationType$set(org.gstreamer.mpegts.ModulationType modulationType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("modulation_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), modulationType.getValue());
    }
    
    /**
     * Get the value of the field {@code symbol_rate}
     * @return The value of the field {@code symbol_rate}
     */
    public int symbolRate$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("symbol_rate"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code symbol_rate}
     * @param symbolRate The new value of the field {@code symbol_rate}
     */
    public void symbolRate$set(int symbolRate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("symbol_rate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), symbolRate);
    }
    
    /**
     * Get the value of the field {@code fec_inner}
     * @return The value of the field {@code fec_inner}
     */
    public org.gstreamer.mpegts.DVBCodeRate fecInner$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fec_inner"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.mpegts.DVBCodeRate.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code fec_inner}
     * @param fecInner The new value of the field {@code fec_inner}
     */
    public void fecInner$set(org.gstreamer.mpegts.DVBCodeRate fecInner) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fec_inner"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), fecInner.getValue());
    }
    
    /**
     * Create a SatelliteDeliverySystemDescriptor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SatelliteDeliverySystemDescriptor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SatelliteDeliverySystemDescriptor struct;
        
         /**
         * A {@link SatelliteDeliverySystemDescriptor.Build} object constructs a {@link SatelliteDeliverySystemDescriptor} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SatelliteDeliverySystemDescriptor.allocate();
        }
        
         /**
         * Finish building the {@link SatelliteDeliverySystemDescriptor} struct.
         * @return A new instance of {@code SatelliteDeliverySystemDescriptor} with the fields 
         *         that were set in the Build object.
         */
        public SatelliteDeliverySystemDescriptor construct() {
            return struct;
        }
        
        /**
         * the frequency in kHz (kiloHertz)
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
         * the orbital position in degrees
         * @param orbitalPosition The value for the {@code orbitalPosition} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setOrbitalPosition(float orbitalPosition) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("orbital_position"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), orbitalPosition);
            return this;
        }
        
        /**
         * If {@code true}, the satellite is in the eastern part of the orbit,
         * else in the western part.
         * @param westEast The value for the {@code westEast} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setWestEast(boolean westEast) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("west_east"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), westEast ? 1 : 0);
            return this;
        }
        
        /**
         * The polarization of the transmitted signal
         * @param polarization The value for the {@code polarization} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPolarization(org.gstreamer.mpegts.SatellitePolarizationType polarization) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("polarization"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (polarization == null ? MemoryAddress.NULL : polarization.getValue()));
            return this;
        }
        
        /**
         * Roll-off factor used in DVB-S2
         * @param rollOff The value for the {@code rollOff} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRollOff(org.gstreamer.mpegts.SatelliteRolloff rollOff) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("roll_off"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rollOff == null ? MemoryAddress.NULL : rollOff.getValue()));
            return this;
        }
        
        /**
         * modulation system, {@code true} if DVB-S2, else DVB-S
         * @param modulationSystem The value for the {@code modulationSystem} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setModulationSystem(boolean modulationSystem) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("modulation_system"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), modulationSystem ? 1 : 0);
            return this;
        }
        
        /**
         * Modulation scheme used
         * @param modulationType The value for the {@code modulationType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setModulationType(org.gstreamer.mpegts.ModulationType modulationType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("modulation_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (modulationType == null ? MemoryAddress.NULL : modulationType.getValue()));
            return this;
        }
        
        /**
         * Symbol rate (in symbols per second)
         * @param symbolRate The value for the {@code symbolRate} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSymbolRate(int symbolRate) {
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
        public Build setFecInner(org.gstreamer.mpegts.DVBCodeRate fecInner) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fec_inner"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fecInner == null ? MemoryAddress.NULL : fecInner.getValue()));
            return this;
        }
    }
}
