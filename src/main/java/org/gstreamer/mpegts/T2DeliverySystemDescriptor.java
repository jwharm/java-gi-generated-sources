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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
     * Allocate a new {@link T2DeliverySystemDescriptor}
     * @return A new, uninitialized @{link T2DeliverySystemDescriptor}
     */
    public static T2DeliverySystemDescriptor allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        T2DeliverySystemDescriptor newInstance = new T2DeliverySystemDescriptor(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code plp_id}
     * @return The value of the field {@code plp_id}
     */
    public byte plpId$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("plp_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code plp_id}
     * @param plpId The new value of the field {@code plp_id}
     */
    public void plpId$set(byte plpId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("plp_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), plpId);
    }
    
    /**
     * Get the value of the field {@code t2_system_id}
     * @return The value of the field {@code t2_system_id}
     */
    public short t2SystemId$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("t2_system_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code t2_system_id}
     * @param t2SystemId The new value of the field {@code t2_system_id}
     */
    public void t2SystemId$set(short t2SystemId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("t2_system_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), t2SystemId);
    }
    
    /**
     * Get the value of the field {@code siso_miso}
     * @return The value of the field {@code siso_miso}
     */
    public byte sisoMiso$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("siso_miso"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code siso_miso}
     * @param sisoMiso The new value of the field {@code siso_miso}
     */
    public void sisoMiso$set(byte sisoMiso) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("siso_miso"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), sisoMiso);
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
     * Get the value of the field {@code tfs}
     * @return The value of the field {@code tfs}
     */
    public boolean tfs$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tfs"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code tfs}
     * @param tfs The new value of the field {@code tfs}
     */
    public void tfs$set(boolean tfs) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tfs"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tfs ? 1 : 0);
    }
    
    /**
     * Create a T2DeliverySystemDescriptor proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public T2DeliverySystemDescriptor(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    public void free() {
        try {
            DowncallHandles.gst_mpegts_t2_delivery_system_descriptor_free.invokeExact(
                    handle());
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private T2DeliverySystemDescriptor struct;
        
         /**
         * A {@link T2DeliverySystemDescriptor.Build} object constructs a {@link T2DeliverySystemDescriptor} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = T2DeliverySystemDescriptor.allocate();
        }
        
         /**
         * Finish building the {@link T2DeliverySystemDescriptor} struct.
         * @return A new instance of {@code T2DeliverySystemDescriptor} with the fields 
         *         that were set in the Build object.
         */
        public T2DeliverySystemDescriptor construct() {
            return struct;
        }
        
        public Build setPlpId(byte plpId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("plp_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), plpId);
            return this;
        }
        
        public Build setT2SystemId(short t2SystemId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("t2_system_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), t2SystemId);
            return this;
        }
        
        public Build setSisoMiso(byte sisoMiso) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("siso_miso"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), sisoMiso);
            return this;
        }
        
        public Build setBandwidth(int bandwidth) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bandwidth"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), bandwidth);
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
        
        public Build setOtherFrequency(boolean otherFrequency) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("other_frequency"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), otherFrequency ? 1 : 0);
            return this;
        }
        
        public Build setTfs(boolean tfs) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tfs"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), tfs ? 1 : 0);
            return this;
        }
        
        public Build setCells(org.gstreamer.mpegts.T2DeliverySystemCell[] cells) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cells"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cells == null ? MemoryAddress.NULL : Interop.allocateNativeArray(cells, org.gstreamer.mpegts.T2DeliverySystemCell.getMemoryLayout(), false)));
            return this;
        }
    }
}
