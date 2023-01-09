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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.sdp.MIKEYPayload.getMemoryLayout().withName("pt"),
            Interop.valueLayout.C_INT.withName("enc_alg"),
            Interop.valueLayout.C_INT.withName("mac_alg"),
            Interop.valueLayout.ADDRESS.withName("subpayloads")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MIKEYPayloadKEMAC}
     * @return A new, uninitialized @{link MIKEYPayloadKEMAC}
     */
    public static MIKEYPayloadKEMAC allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        MIKEYPayloadKEMAC newInstance = new MIKEYPayloadKEMAC(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code pt}
     * @return The value of the field {@code pt}
     */
    public org.gstreamer.sdp.MIKEYPayload getPt() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("pt"));
        return org.gstreamer.sdp.MIKEYPayload.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code pt}
     * @param pt The new value of the field {@code pt}
     */
    public void setPt(org.gstreamer.sdp.MIKEYPayload pt) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pt"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pt == null ? MemoryAddress.NULL : pt.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code enc_alg}
     * @return The value of the field {@code enc_alg}
     */
    public org.gstreamer.sdp.MIKEYEncAlg getEncAlg() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enc_alg"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.sdp.MIKEYEncAlg.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code enc_alg}
     * @param encAlg The new value of the field {@code enc_alg}
     */
    public void setEncAlg(org.gstreamer.sdp.MIKEYEncAlg encAlg) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enc_alg"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (encAlg == null ? MemoryAddress.NULL : encAlg.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code mac_alg}
     * @return The value of the field {@code mac_alg}
     */
    public org.gstreamer.sdp.MIKEYMacAlg getMacAlg() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mac_alg"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.sdp.MIKEYMacAlg.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code mac_alg}
     * @param macAlg The new value of the field {@code mac_alg}
     */
    public void setMacAlg(org.gstreamer.sdp.MIKEYMacAlg macAlg) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mac_alg"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (macAlg == null ? MemoryAddress.NULL : macAlg.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code subpayloads}
     * @return The value of the field {@code subpayloads}
     */
    public PointerAddress getSubpayloads() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("subpayloads"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerAddress(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code subpayloads}
     * @param subpayloads The new value of the field {@code subpayloads}
     */
    public void setSubpayloads(java.lang.foreign.MemoryAddress[] subpayloads) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("subpayloads"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (subpayloads == null ? MemoryAddress.NULL : Interop.allocateNativeArray(subpayloads, false, SCOPE)));
        }
    }
    
    /**
     * Create a MIKEYPayloadKEMAC proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MIKEYPayloadKEMAC(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MIKEYPayloadKEMAC> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MIKEYPayloadKEMAC(input);
    
    /**
     * A {@link MIKEYPayloadKEMAC.Builder} object constructs a {@link MIKEYPayloadKEMAC} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MIKEYPayloadKEMAC.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MIKEYPayloadKEMAC struct;
        
        private Builder() {
            struct = MIKEYPayloadKEMAC.allocate();
        }
        
        /**
         * Finish building the {@link MIKEYPayloadKEMAC} struct.
         * @return A new instance of {@code MIKEYPayloadKEMAC} with the fields 
         *         that were set in the Builder object.
         */
        public MIKEYPayloadKEMAC build() {
            return struct;
        }
        
        /**
         * the common {@link MIKEYPayload}
         * @param pt The value for the {@code pt} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPt(org.gstreamer.sdp.MIKEYPayload pt) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pt"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pt == null ? MemoryAddress.NULL : pt.handle()));
                return this;
            }
        }
        
        /**
         * the {@link MIKEYEncAlg}
         * @param encAlg The value for the {@code encAlg} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEncAlg(org.gstreamer.sdp.MIKEYEncAlg encAlg) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("enc_alg"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (encAlg == null ? MemoryAddress.NULL : encAlg.getValue()));
                return this;
            }
        }
        
        /**
         * the {@link MIKEYMacAlg}
         * @param macAlg The value for the {@code macAlg} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMacAlg(org.gstreamer.sdp.MIKEYMacAlg macAlg) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mac_alg"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (macAlg == null ? MemoryAddress.NULL : macAlg.getValue()));
                return this;
            }
        }
        
        /**
         * the subpayloads
         * @param subpayloads The value for the {@code subpayloads} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSubpayloads(java.lang.foreign.MemoryAddress[] subpayloads) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("subpayloads"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (subpayloads == null ? MemoryAddress.NULL : Interop.allocateNativeArray(subpayloads, false, SCOPE)));
                return this;
            }
        }
    }
}
