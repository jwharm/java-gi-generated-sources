package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Network Information Table (ISO/IEC 13818-1 / EN 300 468)
 */
public class NIT extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsNIT";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("actual_network"),
            Interop.valueLayout.C_SHORT.withName("network_id"),
            MemoryLayout.paddingLayout(16),
            Interop.valueLayout.ADDRESS.withName("descriptors"),
            Interop.valueLayout.ADDRESS.withName("streams")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link NIT}
     * @return A new, uninitialized @{link NIT}
     */
    public static NIT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        NIT newInstance = new NIT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code actual_network}
     * @return The value of the field {@code actual_network}
     */
    public boolean getActualNetwork() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("actual_network"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code actual_network}
     * @param actualNetwork The new value of the field {@code actual_network}
     */
    public void setActualNetwork(boolean actualNetwork) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("actual_network"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(actualNetwork, null).intValue());
    }
    
    /**
     * Get the value of the field {@code network_id}
     * @return The value of the field {@code network_id}
     */
    public short getNetworkId() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("network_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code network_id}
     * @param networkId The new value of the field {@code network_id}
     */
    public void setNetworkId(short networkId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("network_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), networkId);
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
    public PointerProxy<org.gstreamer.mpegts.NITStream> getStreams() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("streams"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.gstreamer.mpegts.NITStream>(RESULT, org.gstreamer.mpegts.NITStream.fromAddress);
    }
    
    /**
     * Change the value of the field {@code streams}
     * @param streams The new value of the field {@code streams}
     */
    public void setStreams(org.gstreamer.mpegts.NITStream[] streams) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("streams"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (streams == null ? MemoryAddress.NULL : Interop.allocateNativeArray(streams, org.gstreamer.mpegts.NITStream.getMemoryLayout(), false)));
    }
    
    /**
     * Create a NIT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected NIT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, NIT> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new NIT(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_nit_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates and initializes a {@link NIT}.
     */
    public NIT() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_nit_new = Interop.downcallHandle(
            "gst_mpegts_nit_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link NIT.Builder} object constructs a {@link NIT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link NIT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final NIT struct;
        
        private Builder() {
            struct = NIT.allocate();
        }
        
         /**
         * Finish building the {@link NIT} struct.
         * @return A new instance of {@code NIT} with the fields 
         *         that were set in the Builder object.
         */
        public NIT build() {
            return struct;
        }
        
        /**
         * Whether this NIT corresponds to the actual stream
         * @param actualNetwork The value for the {@code actualNetwork} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActualNetwork(boolean actualNetwork) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("actual_network"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(actualNetwork, null).intValue());
            return this;
        }
        
        /**
         * ID of the network that this NIT describes
         * @param networkId The value for the {@code networkId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNetworkId(short networkId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("network_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), networkId);
            return this;
        }
        
        /**
         * the global descriptors
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
         * the streams
         * @param streams The value for the {@code streams} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStreams(org.gstreamer.mpegts.NITStream[] streams) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("streams"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (streams == null ? MemoryAddress.NULL : Interop.allocateNativeArray(streams, org.gstreamer.mpegts.NITStream.getMemoryLayout(), false)));
            return this;
        }
    }
}
