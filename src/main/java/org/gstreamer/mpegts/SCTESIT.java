package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SCTESIT extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsSCTESIT";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("encrypted_packet"),
            Interop.valueLayout.C_BYTE.withName("encryption_algorithm"),
            MemoryLayout.paddingLayout(24),
            Interop.valueLayout.C_LONG.withName("pts_adjustment"),
            Interop.valueLayout.C_BYTE.withName("cw_index"),
            MemoryLayout.paddingLayout(8),
            Interop.valueLayout.C_SHORT.withName("tier"),
            Interop.valueLayout.C_SHORT.withName("splice_command_length"),
            MemoryLayout.paddingLayout(16),
            Interop.valueLayout.C_INT.withName("splice_command_type"),
            Interop.valueLayout.C_INT.withName("splice_time_specified"),
            Interop.valueLayout.C_LONG.withName("splice_time"),
            Interop.valueLayout.ADDRESS.withName("splices"),
            Interop.valueLayout.ADDRESS.withName("descriptors"),
            Interop.valueLayout.C_INT.withName("fully_parsed"),
            Interop.valueLayout.C_INT.withName("is_running_time")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SCTESIT}
     * @return A new, uninitialized @{link SCTESIT}
     */
    public static SCTESIT allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SCTESIT newInstance = new SCTESIT(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code encrypted_packet}
     * @return The value of the field {@code encrypted_packet}
     */
    public boolean getEncryptedPacket() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("encrypted_packet"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code encrypted_packet}
     * @param encryptedPacket The new value of the field {@code encrypted_packet}
     */
    public void setEncryptedPacket(boolean encryptedPacket) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("encrypted_packet"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(encryptedPacket, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code encryption_algorithm}
     * @return The value of the field {@code encryption_algorithm}
     */
    public byte getEncryptionAlgorithm() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("encryption_algorithm"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code encryption_algorithm}
     * @param encryptionAlgorithm The new value of the field {@code encryption_algorithm}
     */
    public void setEncryptionAlgorithm(byte encryptionAlgorithm) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("encryption_algorithm"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), encryptionAlgorithm);
        }
    }
    
    /**
     * Get the value of the field {@code pts_adjustment}
     * @return The value of the field {@code pts_adjustment}
     */
    public long getPtsAdjustment() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pts_adjustment"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code pts_adjustment}
     * @param ptsAdjustment The new value of the field {@code pts_adjustment}
     */
    public void setPtsAdjustment(long ptsAdjustment) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pts_adjustment"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), ptsAdjustment);
        }
    }
    
    /**
     * Get the value of the field {@code cw_index}
     * @return The value of the field {@code cw_index}
     */
    public byte getCwIndex() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cw_index"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code cw_index}
     * @param cwIndex The new value of the field {@code cw_index}
     */
    public void setCwIndex(byte cwIndex) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cw_index"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), cwIndex);
        }
    }
    
    /**
     * Get the value of the field {@code tier}
     * @return The value of the field {@code tier}
     */
    public short getTier() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tier"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code tier}
     * @param tier The new value of the field {@code tier}
     */
    public void setTier(short tier) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tier"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), tier);
        }
    }
    
    /**
     * Get the value of the field {@code splice_command_length}
     * @return The value of the field {@code splice_command_length}
     */
    public short getSpliceCommandLength() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (short) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice_command_length"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code splice_command_length}
     * @param spliceCommandLength The new value of the field {@code splice_command_length}
     */
    public void setSpliceCommandLength(short spliceCommandLength) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice_command_length"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), spliceCommandLength);
        }
    }
    
    /**
     * Get the value of the field {@code splice_command_type}
     * @return The value of the field {@code splice_command_type}
     */
    public org.gstreamer.mpegts.SCTESpliceCommandType getSpliceCommandType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice_command_type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.mpegts.SCTESpliceCommandType.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code splice_command_type}
     * @param spliceCommandType The new value of the field {@code splice_command_type}
     */
    public void setSpliceCommandType(org.gstreamer.mpegts.SCTESpliceCommandType spliceCommandType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice_command_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (spliceCommandType == null ? MemoryAddress.NULL : spliceCommandType.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code splice_time_specified}
     * @return The value of the field {@code splice_time_specified}
     */
    public boolean getSpliceTimeSpecified() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice_time_specified"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code splice_time_specified}
     * @param spliceTimeSpecified The new value of the field {@code splice_time_specified}
     */
    public void setSpliceTimeSpecified(boolean spliceTimeSpecified) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice_time_specified"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(spliceTimeSpecified, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code splice_time}
     * @return The value of the field {@code splice_time}
     */
    public long getSpliceTime() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice_time"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code splice_time}
     * @param spliceTime The new value of the field {@code splice_time}
     */
    public void setSpliceTime(long spliceTime) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), spliceTime);
        }
    }
    
    /**
     * Get the value of the field {@code splices}
     * @return The value of the field {@code splices}
     */
    public PointerAddress getSplices() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splices"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerAddress(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code splices}
     * @param splices The new value of the field {@code splices}
     */
    public void setSplices(java.lang.foreign.MemoryAddress[] splices) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splices"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (splices == null ? MemoryAddress.NULL : Interop.allocateNativeArray(splices, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code descriptors}
     * @return The value of the field {@code descriptors}
     */
    public PointerAddress getDescriptors() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerAddress(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code descriptors}
     * @param descriptors The new value of the field {@code descriptors}
     */
    public void setDescriptors(java.lang.foreign.MemoryAddress[] descriptors) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (descriptors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(descriptors, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code fully_parsed}
     * @return The value of the field {@code fully_parsed}
     */
    public boolean getFullyParsed() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fully_parsed"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code fully_parsed}
     * @param fullyParsed The new value of the field {@code fully_parsed}
     */
    public void setFullyParsed(boolean fullyParsed) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fully_parsed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(fullyParsed, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code is_running_time}
     * @return The value of the field {@code is_running_time}
     */
    public boolean getIsRunningTime() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_running_time"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code is_running_time}
     * @param isRunningTime The new value of the field {@code is_running_time}
     */
    public void setIsRunningTime(boolean isRunningTime) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_running_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(isRunningTime, null).intValue());
        }
    }
    
    /**
     * Create a SCTESIT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SCTESIT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SCTESIT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SCTESIT(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_scte_sit_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates and initializes a {@link SCTESIT}.
     */
    public SCTESIT() {
        super(constructNew());
        this.takeOwnership();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_scte_sit_new = Interop.downcallHandle(
                "gst_mpegts_scte_sit_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link SCTESIT.Builder} object constructs a {@link SCTESIT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SCTESIT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SCTESIT struct;
        
        private Builder() {
            struct = SCTESIT.allocate();
        }
        
        /**
         * Finish building the {@link SCTESIT} struct.
         * @return A new instance of {@code SCTESIT} with the fields 
         *         that were set in the Builder object.
         */
        public SCTESIT build() {
            return struct;
        }
        
        public Builder setEncryptedPacket(boolean encryptedPacket) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("encrypted_packet"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(encryptedPacket, null).intValue());
                return this;
            }
        }
        
        public Builder setEncryptionAlgorithm(byte encryptionAlgorithm) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("encryption_algorithm"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), encryptionAlgorithm);
                return this;
            }
        }
        
        public Builder setPtsAdjustment(long ptsAdjustment) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pts_adjustment"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), ptsAdjustment);
                return this;
            }
        }
        
        public Builder setCwIndex(byte cwIndex) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("cw_index"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), cwIndex);
                return this;
            }
        }
        
        public Builder setTier(short tier) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tier"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), tier);
                return this;
            }
        }
        
        public Builder setSpliceCommandLength(short spliceCommandLength) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("splice_command_length"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), spliceCommandLength);
                return this;
            }
        }
        
        public Builder setSpliceCommandType(org.gstreamer.mpegts.SCTESpliceCommandType spliceCommandType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("splice_command_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (spliceCommandType == null ? MemoryAddress.NULL : spliceCommandType.getValue()));
                return this;
            }
        }
        
        public Builder setSpliceTimeSpecified(boolean spliceTimeSpecified) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("splice_time_specified"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(spliceTimeSpecified, null).intValue());
                return this;
            }
        }
        
        public Builder setSpliceTime(long spliceTime) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("splice_time"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), spliceTime);
                return this;
            }
        }
        
        public Builder setSplices(java.lang.foreign.MemoryAddress[] splices) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("splices"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (splices == null ? MemoryAddress.NULL : Interop.allocateNativeArray(splices, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setDescriptors(java.lang.foreign.MemoryAddress[] descriptors) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (descriptors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(descriptors, false, SCOPE)));
                return this;
            }
        }
        
        /**
         * When encrypted, or when encountering an unknown command type,
         * we may still want to pass the sit through.
         * @param fullyParsed The value for the {@code fullyParsed} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFullyParsed(boolean fullyParsed) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("fully_parsed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(fullyParsed, null).intValue());
                return this;
            }
        }
        
        /**
         * When the SIT was constructed by the application, splice times
         * are in running_time and must be translated before packetizing.
         * @param isRunningTime The value for the {@code isRunningTime} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsRunningTime(boolean isRunningTime) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_running_time"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(isRunningTime, null).intValue());
                return this;
            }
        }
    }
}
