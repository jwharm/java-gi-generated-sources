package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Program Map Table (ISO/IEC 13818-1). Provides the mappings between program
 * numbers and the program elements that comprise them.
 * <p>
 * The program_number is contained in the subtable_extension field of the
 * container {@link Section}.
 */
public class PMT extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsPMT";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_SHORT.withName("pcr_pid"),
            Interop.valueLayout.C_SHORT.withName("program_number"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("descriptors"),
            Interop.valueLayout.ADDRESS.withName("streams")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PMT}
     * @return A new, uninitialized @{link PMT}
     */
    public static PMT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PMT newInstance = new PMT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code pcr_pid}
     * @return The value of the field {@code pcr_pid}
     */
    public short getPcrPid() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pcr_pid"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code pcr_pid}
     * @param pcrPid The new value of the field {@code pcr_pid}
     */
    public void setPcrPid(short pcrPid) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pcr_pid"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), pcrPid);
    }
    
    /**
     * Get the value of the field {@code program_number}
     * @return The value of the field {@code program_number}
     */
    public short getProgramNumber() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("program_number"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code program_number}
     * @param programNumber The new value of the field {@code program_number}
     */
    public void setProgramNumber(short programNumber) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("program_number"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), programNumber);
    }
    
    /**
     * Get the value of the field {@code descriptors}
     * @return The value of the field {@code descriptors}
     */
    public PointerProxy<org.gstreamer.mpegts.Descriptor> getDescriptors() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.gstreamer.mpegts.Descriptor>(RESULT, org.gstreamer.mpegts.Descriptor.fromAddress);
    }
    
    /**
     * Change the value of the field {@code descriptors}
     * @param descriptors The new value of the field {@code descriptors}
     */
    public void setDescriptors(org.gstreamer.mpegts.Descriptor[] descriptors) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (descriptors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(descriptors, org.gstreamer.mpegts.Descriptor.getMemoryLayout(), false)));
    }
    
    /**
     * Get the value of the field {@code streams}
     * @return The value of the field {@code streams}
     */
    public PointerProxy<org.gstreamer.mpegts.PMTStream> getStreams() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("streams"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.gstreamer.mpegts.PMTStream>(RESULT, org.gstreamer.mpegts.PMTStream.fromAddress);
    }
    
    /**
     * Change the value of the field {@code streams}
     * @param streams The new value of the field {@code streams}
     */
    public void setStreams(org.gstreamer.mpegts.PMTStream[] streams) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("streams"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (streams == null ? MemoryAddress.NULL : Interop.allocateNativeArray(streams, org.gstreamer.mpegts.PMTStream.getMemoryLayout(), false)));
    }
    
    /**
     * Create a PMT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PMT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PMT> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PMT(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_pmt_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates and initializes a new {@link PMT}. {@link PMTStream} can be
     * added to the streams array, and global PMT {@link Descriptor} to the
     * descriptors array.
     */
    public PMT() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_pmt_new = Interop.downcallHandle(
            "gst_mpegts_pmt_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link PMT.Builder} object constructs a {@link PMT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PMT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PMT struct;
        
        private Builder() {
            struct = PMT.allocate();
        }
        
         /**
         * Finish building the {@link PMT} struct.
         * @return A new instance of {@code PMT} with the fields 
         *         that were set in the Builder object.
         */
        public PMT build() {
            return struct;
        }
        
        /**
         * PID of the stream containing the PCR for this program.
         * @param pcrPid The value for the {@code pcrPid} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPcrPid(short pcrPid) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pcr_pid"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), pcrPid);
            return this;
        }
        
        /**
         * The program to which this PMT is applicable.
         * @param programNumber The value for the {@code programNumber} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setProgramNumber(short programNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("program_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), programNumber);
            return this;
        }
        
        /**
         * Array of {@link Descriptor}
         * @param descriptors The value for the {@code descriptors} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDescriptors(org.gstreamer.mpegts.Descriptor[] descriptors) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (descriptors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(descriptors, org.gstreamer.mpegts.Descriptor.getMemoryLayout(), false)));
            return this;
        }
        
        /**
         * Array of {@link PMTStream}
         * @param streams The value for the {@code streams} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStreams(org.gstreamer.mpegts.PMTStream[] streams) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("streams"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (streams == null ? MemoryAddress.NULL : Interop.allocateNativeArray(streams, org.gstreamer.mpegts.PMTStream.getMemoryLayout(), false)));
            return this;
        }
    }
}
