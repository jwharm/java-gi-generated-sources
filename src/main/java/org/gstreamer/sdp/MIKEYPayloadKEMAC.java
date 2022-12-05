package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A structure holding the KEMAC payload
 */
public class MIKEYPayloadKEMAC extends Struct {
    
    static {
        GstSdp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYPayloadKEMAC";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.sdp.MIKEYPayload.getMemoryLayout().withName("pt"),
        Interop.valueLayout.C_INT.withName("enc_alg"),
        Interop.valueLayout.C_INT.withName("mac_alg"),
        Interop.valueLayout.ADDRESS.withName("subpayloads")
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
     * Allocate a new {@link MIKEYPayloadKEMAC}
     * @return A new, uninitialized @{link MIKEYPayloadKEMAC}
     */
    public static MIKEYPayloadKEMAC allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MIKEYPayloadKEMAC newInstance = new MIKEYPayloadKEMAC(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code pt}
     * @return The value of the field {@code pt}
     */
    public org.gstreamer.sdp.MIKEYPayload pt$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("pt"));
        return new org.gstreamer.sdp.MIKEYPayload(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code enc_alg}
     * @return The value of the field {@code enc_alg}
     */
    public org.gstreamer.sdp.MIKEYEncAlg encAlg$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("enc_alg"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.sdp.MIKEYEncAlg.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code enc_alg}
     * @param encAlg The new value of the field {@code enc_alg}
     */
    public void encAlg$set(org.gstreamer.sdp.MIKEYEncAlg encAlg) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("enc_alg"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), encAlg.getValue());
    }
    
    /**
     * Get the value of the field {@code mac_alg}
     * @return The value of the field {@code mac_alg}
     */
    public org.gstreamer.sdp.MIKEYMacAlg macAlg$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mac_alg"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.sdp.MIKEYMacAlg.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code mac_alg}
     * @param macAlg The new value of the field {@code mac_alg}
     */
    public void macAlg$set(org.gstreamer.sdp.MIKEYMacAlg macAlg) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mac_alg"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), macAlg.getValue());
    }
    
    /**
     * Create a MIKEYPayloadKEMAC proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MIKEYPayloadKEMAC(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private MIKEYPayloadKEMAC struct;
        
         /**
         * A {@link MIKEYPayloadKEMAC.Build} object constructs a {@link MIKEYPayloadKEMAC} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = MIKEYPayloadKEMAC.allocate();
        }
        
         /**
         * Finish building the {@link MIKEYPayloadKEMAC} struct.
         * @return A new instance of {@code MIKEYPayloadKEMAC} with the fields 
         *         that were set in the Build object.
         */
        public MIKEYPayloadKEMAC construct() {
            return struct;
        }
        
        /**
         * the common {@link MIKEYPayload}
         * @param pt The value for the {@code pt} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPt(org.gstreamer.sdp.MIKEYPayload pt) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pt"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pt == null ? MemoryAddress.NULL : pt.handle()));
            return this;
        }
        
        /**
         * the {@link MIKEYEncAlg}
         * @param encAlg The value for the {@code encAlg} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEncAlg(org.gstreamer.sdp.MIKEYEncAlg encAlg) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enc_alg"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (encAlg == null ? MemoryAddress.NULL : encAlg.getValue()));
            return this;
        }
        
        /**
         * the {@link MIKEYMacAlg}
         * @param macAlg The value for the {@code macAlg} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMacAlg(org.gstreamer.sdp.MIKEYMacAlg macAlg) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mac_alg"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (macAlg == null ? MemoryAddress.NULL : macAlg.getValue()));
            return this;
        }
        
        /**
         * the subpayloads
         * @param subpayloads The value for the {@code subpayloads} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSubpayloads(java.lang.foreign.MemoryAddress[] subpayloads) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("subpayloads"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (subpayloads == null ? MemoryAddress.NULL : Interop.allocateNativeArray(subpayloads, false)));
            return this;
        }
    }
}
