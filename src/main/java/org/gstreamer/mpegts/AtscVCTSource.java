package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Source from a {@code GstMpegtsAtscVCT}, can be used both for TVCT and CVCT tables
 */
public class AtscVCTSource extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsAtscVCTSource";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("short_name"),
        Interop.valueLayout.C_SHORT.withName("major_channel_number"),
        Interop.valueLayout.C_SHORT.withName("minor_channel_number"),
        Interop.valueLayout.C_BYTE.withName("modulation_mode"),
        MemoryLayout.paddingLayout(24),
        Interop.valueLayout.C_INT.withName("carrier_frequency"),
        Interop.valueLayout.C_SHORT.withName("channel_TSID"),
        Interop.valueLayout.C_SHORT.withName("program_number"),
        Interop.valueLayout.C_BYTE.withName("ETM_location"),
        MemoryLayout.paddingLayout(24),
        Interop.valueLayout.C_INT.withName("access_controlled"),
        Interop.valueLayout.C_INT.withName("hidden"),
        Interop.valueLayout.C_INT.withName("path_select"),
        Interop.valueLayout.C_INT.withName("out_of_band"),
        Interop.valueLayout.C_INT.withName("hide_guide"),
        Interop.valueLayout.C_BYTE.withName("service_type"),
        MemoryLayout.paddingLayout(8),
        Interop.valueLayout.C_SHORT.withName("source_id"),
        MemoryLayout.paddingLayout(32),
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
     * Allocate a new {@link AtscVCTSource}
     * @return A new, uninitialized @{link AtscVCTSource}
     */
    public static AtscVCTSource allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AtscVCTSource newInstance = new AtscVCTSource(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code short_name}
     * @return The value of the field {@code short_name}
     */
    public java.lang.String shortName$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("short_name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code short_name}
     * @param shortName The new value of the field {@code short_name}
     */
    public void shortName$set(java.lang.String shortName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("short_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(shortName));
    }
    
    /**
     * Get the value of the field {@code major_channel_number}
     * @return The value of the field {@code major_channel_number}
     */
    public short majorChannelNumber$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("major_channel_number"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code major_channel_number}
     * @param majorChannelNumber The new value of the field {@code major_channel_number}
     */
    public void majorChannelNumber$set(short majorChannelNumber) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("major_channel_number"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), majorChannelNumber);
    }
    
    /**
     * Get the value of the field {@code minor_channel_number}
     * @return The value of the field {@code minor_channel_number}
     */
    public short minorChannelNumber$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("minor_channel_number"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code minor_channel_number}
     * @param minorChannelNumber The new value of the field {@code minor_channel_number}
     */
    public void minorChannelNumber$set(short minorChannelNumber) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("minor_channel_number"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), minorChannelNumber);
    }
    
    /**
     * Get the value of the field {@code modulation_mode}
     * @return The value of the field {@code modulation_mode}
     */
    public byte modulationMode$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("modulation_mode"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code modulation_mode}
     * @param modulationMode The new value of the field {@code modulation_mode}
     */
    public void modulationMode$set(byte modulationMode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("modulation_mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), modulationMode);
    }
    
    /**
     * Get the value of the field {@code carrier_frequency}
     * @return The value of the field {@code carrier_frequency}
     */
    public int carrierFrequency$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("carrier_frequency"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code carrier_frequency}
     * @param carrierFrequency The new value of the field {@code carrier_frequency}
     */
    public void carrierFrequency$set(int carrierFrequency) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("carrier_frequency"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), carrierFrequency);
    }
    
    /**
     * Get the value of the field {@code channel_TSID}
     * @return The value of the field {@code channel_TSID}
     */
    public short channelTSID$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("channel_TSID"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code channel_TSID}
     * @param channelTSID The new value of the field {@code channel_TSID}
     */
    public void channelTSID$set(short channelTSID) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("channel_TSID"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), channelTSID);
    }
    
    /**
     * Get the value of the field {@code program_number}
     * @return The value of the field {@code program_number}
     */
    public short programNumber$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("program_number"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code program_number}
     * @param programNumber The new value of the field {@code program_number}
     */
    public void programNumber$set(short programNumber) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("program_number"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), programNumber);
    }
    
    /**
     * Get the value of the field {@code ETM_location}
     * @return The value of the field {@code ETM_location}
     */
    public byte ETMLocation$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ETM_location"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code ETM_location}
     * @param ETMLocation The new value of the field {@code ETM_location}
     */
    public void ETMLocation$set(byte ETMLocation) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ETM_location"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), ETMLocation);
    }
    
    /**
     * Get the value of the field {@code access_controlled}
     * @return The value of the field {@code access_controlled}
     */
    public boolean accessControlled$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("access_controlled"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code access_controlled}
     * @param accessControlled The new value of the field {@code access_controlled}
     */
    public void accessControlled$set(boolean accessControlled) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("access_controlled"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), accessControlled ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code hidden}
     * @return The value of the field {@code hidden}
     */
    public boolean hidden$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hidden"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code hidden}
     * @param hidden The new value of the field {@code hidden}
     */
    public void hidden$set(boolean hidden) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hidden"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), hidden ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code path_select}
     * @return The value of the field {@code path_select}
     */
    public boolean pathSelect$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("path_select"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code path_select}
     * @param pathSelect The new value of the field {@code path_select}
     */
    public void pathSelect$set(boolean pathSelect) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("path_select"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), pathSelect ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code out_of_band}
     * @return The value of the field {@code out_of_band}
     */
    public boolean outOfBand$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("out_of_band"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code out_of_band}
     * @param outOfBand The new value of the field {@code out_of_band}
     */
    public void outOfBand$set(boolean outOfBand) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("out_of_band"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), outOfBand ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code hide_guide}
     * @return The value of the field {@code hide_guide}
     */
    public boolean hideGuide$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hide_guide"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code hide_guide}
     * @param hideGuide The new value of the field {@code hide_guide}
     */
    public void hideGuide$set(boolean hideGuide) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hide_guide"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), hideGuide ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code service_type}
     * @return The value of the field {@code service_type}
     */
    public byte serviceType$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("service_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code service_type}
     * @param serviceType The new value of the field {@code service_type}
     */
    public void serviceType$set(byte serviceType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("service_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), serviceType);
    }
    
    /**
     * Get the value of the field {@code source_id}
     * @return The value of the field {@code source_id}
     */
    public short sourceId$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("source_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code source_id}
     * @param sourceId The new value of the field {@code source_id}
     */
    public void sourceId$set(short sourceId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("source_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), sourceId);
    }
    
    /**
     * Create a AtscVCTSource proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AtscVCTSource(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AtscVCTSource struct;
        
         /**
         * A {@link AtscVCTSource.Build} object constructs a {@link AtscVCTSource} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AtscVCTSource.allocate();
        }
        
         /**
         * Finish building the {@link AtscVCTSource} struct.
         * @return A new instance of {@code AtscVCTSource} with the fields 
         *         that were set in the Build object.
         */
        public AtscVCTSource construct() {
            return struct;
        }
        
        /**
         * The short name of a source
         * @param shortName The value for the {@code shortName} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setShortName(java.lang.String shortName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("short_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shortName == null ? MemoryAddress.NULL : Interop.allocateNativeString(shortName)));
            return this;
        }
        
        /**
         * The major channel number
         * @param majorChannelNumber The value for the {@code majorChannelNumber} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMajorChannelNumber(short majorChannelNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("major_channel_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), majorChannelNumber);
            return this;
        }
        
        /**
         * The minor channel number
         * @param minorChannelNumber The value for the {@code minorChannelNumber} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMinorChannelNumber(short minorChannelNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("minor_channel_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), minorChannelNumber);
            return this;
        }
        
        /**
         * The modulation mode
         * @param modulationMode The value for the {@code modulationMode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setModulationMode(byte modulationMode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("modulation_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), modulationMode);
            return this;
        }
        
        /**
         * The carrier frequency
         * @param carrierFrequency The value for the {@code carrierFrequency} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCarrierFrequency(int carrierFrequency) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("carrier_frequency"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), carrierFrequency);
            return this;
        }
        
        /**
         * The transport stream ID
         * @param channelTSID The value for the {@code channelTSID} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setChannelTSID(short channelTSID) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("channel_TSID"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), channelTSID);
            return this;
        }
        
        /**
         * The program number (see {@link PatProgram})
         * @param programNumber The value for the {@code programNumber} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setProgramNumber(short programNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("program_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), programNumber);
            return this;
        }
        
        /**
         * The ETM location
         * @param ETMLocation The value for the {@code ETMLocation} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setETMLocation(byte ETMLocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ETM_location"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), ETMLocation);
            return this;
        }
        
        /**
         * is access controlled
         * @param accessControlled The value for the {@code accessControlled} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAccessControlled(boolean accessControlled) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("access_controlled"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), accessControlled ? 1 : 0);
            return this;
        }
        
        /**
         * is hidden
         * @param hidden The value for the {@code hidden} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHidden(boolean hidden) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hidden"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), hidden ? 1 : 0);
            return this;
        }
        
        /**
         * is path select, CVCT only
         * @param pathSelect The value for the {@code pathSelect} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPathSelect(boolean pathSelect) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("path_select"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), pathSelect ? 1 : 0);
            return this;
        }
        
        /**
         * is out of band, CVCT only
         * @param outOfBand The value for the {@code outOfBand} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setOutOfBand(boolean outOfBand) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("out_of_band"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), outOfBand ? 1 : 0);
            return this;
        }
        
        /**
         * is hide guide
         * @param hideGuide The value for the {@code hideGuide} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHideGuide(boolean hideGuide) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hide_guide"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), hideGuide ? 1 : 0);
            return this;
        }
        
        /**
         * The service type
         * @param serviceType The value for the {@code serviceType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setServiceType(byte serviceType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("service_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), serviceType);
            return this;
        }
        
        /**
         * The source id
         * @param sourceId The value for the {@code sourceId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSourceId(short sourceId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("source_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), sourceId);
            return this;
        }
        
        /**
         * an array of {@link Descriptor}
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
