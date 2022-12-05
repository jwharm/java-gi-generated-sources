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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
     * Allocate a new {@link SCTESIT}
     * @return A new, uninitialized @{link SCTESIT}
     */
    public static SCTESIT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SCTESIT newInstance = new SCTESIT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code encrypted_packet}
     * @return The value of the field {@code encrypted_packet}
     */
    public boolean encryptedPacket$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("encrypted_packet"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code encrypted_packet}
     * @param encryptedPacket The new value of the field {@code encrypted_packet}
     */
    public void encryptedPacket$set(boolean encryptedPacket) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("encrypted_packet"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), encryptedPacket ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code encryption_algorithm}
     * @return The value of the field {@code encryption_algorithm}
     */
    public byte encryptionAlgorithm$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("encryption_algorithm"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code encryption_algorithm}
     * @param encryptionAlgorithm The new value of the field {@code encryption_algorithm}
     */
    public void encryptionAlgorithm$set(byte encryptionAlgorithm) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("encryption_algorithm"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), encryptionAlgorithm);
    }
    
    /**
     * Get the value of the field {@code pts_adjustment}
     * @return The value of the field {@code pts_adjustment}
     */
    public long ptsAdjustment$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pts_adjustment"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code pts_adjustment}
     * @param ptsAdjustment The new value of the field {@code pts_adjustment}
     */
    public void ptsAdjustment$set(long ptsAdjustment) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pts_adjustment"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), ptsAdjustment);
    }
    
    /**
     * Get the value of the field {@code cw_index}
     * @return The value of the field {@code cw_index}
     */
    public byte cwIndex$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cw_index"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code cw_index}
     * @param cwIndex The new value of the field {@code cw_index}
     */
    public void cwIndex$set(byte cwIndex) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cw_index"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), cwIndex);
    }
    
    /**
     * Get the value of the field {@code tier}
     * @return The value of the field {@code tier}
     */
    public short tier$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tier"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code tier}
     * @param tier The new value of the field {@code tier}
     */
    public void tier$set(short tier) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tier"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), tier);
    }
    
    /**
     * Get the value of the field {@code splice_command_length}
     * @return The value of the field {@code splice_command_length}
     */
    public short spliceCommandLength$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("splice_command_length"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code splice_command_length}
     * @param spliceCommandLength The new value of the field {@code splice_command_length}
     */
    public void spliceCommandLength$set(short spliceCommandLength) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("splice_command_length"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), spliceCommandLength);
    }
    
    /**
     * Get the value of the field {@code splice_command_type}
     * @return The value of the field {@code splice_command_type}
     */
    public org.gstreamer.mpegts.SCTESpliceCommandType spliceCommandType$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("splice_command_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.mpegts.SCTESpliceCommandType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code splice_command_type}
     * @param spliceCommandType The new value of the field {@code splice_command_type}
     */
    public void spliceCommandType$set(org.gstreamer.mpegts.SCTESpliceCommandType spliceCommandType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("splice_command_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), spliceCommandType.getValue());
    }
    
    /**
     * Get the value of the field {@code splice_time_specified}
     * @return The value of the field {@code splice_time_specified}
     */
    public boolean spliceTimeSpecified$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("splice_time_specified"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code splice_time_specified}
     * @param spliceTimeSpecified The new value of the field {@code splice_time_specified}
     */
    public void spliceTimeSpecified$set(boolean spliceTimeSpecified) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("splice_time_specified"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), spliceTimeSpecified ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code splice_time}
     * @return The value of the field {@code splice_time}
     */
    public long spliceTime$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("splice_time"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code splice_time}
     * @param spliceTime The new value of the field {@code splice_time}
     */
    public void spliceTime$set(long spliceTime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("splice_time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), spliceTime);
    }
    
    /**
     * Get the value of the field {@code fully_parsed}
     * @return The value of the field {@code fully_parsed}
     */
    public boolean fullyParsed$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fully_parsed"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code fully_parsed}
     * @param fullyParsed The new value of the field {@code fully_parsed}
     */
    public void fullyParsed$set(boolean fullyParsed) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fully_parsed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), fullyParsed ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code is_running_time}
     * @return The value of the field {@code is_running_time}
     */
    public boolean isRunningTime$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_running_time"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code is_running_time}
     * @param isRunningTime The new value of the field {@code is_running_time}
     */
    public void isRunningTime$set(boolean isRunningTime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_running_time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), isRunningTime ? 1 : 0);
    }
    
    /**
     * Create a SCTESIT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SCTESIT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_scte_sit_new = Interop.downcallHandle(
            "gst_mpegts_scte_sit_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SCTESIT struct;
        
         /**
         * A {@link SCTESIT.Build} object constructs a {@link SCTESIT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SCTESIT.allocate();
        }
        
         /**
         * Finish building the {@link SCTESIT} struct.
         * @return A new instance of {@code SCTESIT} with the fields 
         *         that were set in the Build object.
         */
        public SCTESIT construct() {
            return struct;
        }
        
        public Build setEncryptedPacket(boolean encryptedPacket) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("encrypted_packet"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), encryptedPacket ? 1 : 0);
            return this;
        }
        
        public Build setEncryptionAlgorithm(byte encryptionAlgorithm) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("encryption_algorithm"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), encryptionAlgorithm);
            return this;
        }
        
        public Build setPtsAdjustment(long ptsAdjustment) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pts_adjustment"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), ptsAdjustment);
            return this;
        }
        
        public Build setCwIndex(byte cwIndex) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cw_index"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), cwIndex);
            return this;
        }
        
        public Build setTier(short tier) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tier"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), tier);
            return this;
        }
        
        public Build setSpliceCommandLength(short spliceCommandLength) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice_command_length"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), spliceCommandLength);
            return this;
        }
        
        public Build setSpliceCommandType(org.gstreamer.mpegts.SCTESpliceCommandType spliceCommandType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice_command_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (spliceCommandType == null ? MemoryAddress.NULL : spliceCommandType.getValue()));
            return this;
        }
        
        public Build setSpliceTimeSpecified(boolean spliceTimeSpecified) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice_time_specified"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), spliceTimeSpecified ? 1 : 0);
            return this;
        }
        
        public Build setSpliceTime(long spliceTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), spliceTime);
            return this;
        }
        
        public Build setSplices(java.lang.foreign.MemoryAddress[] splices) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splices"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (splices == null ? MemoryAddress.NULL : Interop.allocateNativeArray(splices, false)));
            return this;
        }
        
        public Build setDescriptors(java.lang.foreign.MemoryAddress[] descriptors) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (descriptors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(descriptors, false)));
            return this;
        }
        
        /**
         * When encrypted, or when encountering an unknown command type,
         * we may still want to pass the sit through.
         * @param fullyParsed The value for the {@code fullyParsed} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFullyParsed(boolean fullyParsed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fully_parsed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), fullyParsed ? 1 : 0);
            return this;
        }
        
        /**
         * When the SIT was constructed by the application, splice times
         * are in running_time and must be translated before packetizing.
         * @param isRunningTime The value for the {@code isRunningTime} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsRunningTime(boolean isRunningTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_running_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), isRunningTime ? 1 : 0);
            return this;
        }
    }
}
