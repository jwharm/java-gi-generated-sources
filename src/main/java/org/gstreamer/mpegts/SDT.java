package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Service Description Table (EN 300 468)
 */
public class SDT extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsSDT";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_SHORT.withName("original_network_id"),
            MemoryLayout.paddingLayout(16),
            Interop.valueLayout.C_INT.withName("actual_ts"),
            Interop.valueLayout.C_SHORT.withName("transport_stream_id"),
            MemoryLayout.paddingLayout(48),
            Interop.valueLayout.ADDRESS.withName("services")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SDT}
     * @return A new, uninitialized @{link SDT}
     */
    public static SDT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SDT newInstance = new SDT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code original_network_id}
     * @return The value of the field {@code original_network_id}
     */
    public short getOriginalNetworkId() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("original_network_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code original_network_id}
     * @param originalNetworkId The new value of the field {@code original_network_id}
     */
    public void setOriginalNetworkId(short originalNetworkId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("original_network_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), originalNetworkId);
    }
    
    /**
     * Get the value of the field {@code actual_ts}
     * @return The value of the field {@code actual_ts}
     */
    public boolean getActualTs() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("actual_ts"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code actual_ts}
     * @param actualTs The new value of the field {@code actual_ts}
     */
    public void setActualTs(boolean actualTs) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("actual_ts"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(actualTs, null).intValue());
    }
    
    /**
     * Get the value of the field {@code transport_stream_id}
     * @return The value of the field {@code transport_stream_id}
     */
    public short getTransportStreamId() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transport_stream_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code transport_stream_id}
     * @param transportStreamId The new value of the field {@code transport_stream_id}
     */
    public void setTransportStreamId(short transportStreamId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transport_stream_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), transportStreamId);
    }
    
    /**
     * Get the value of the field {@code services}
     * @return The value of the field {@code services}
     */
    public PointerProxy<org.gstreamer.mpegts.SDTService> getServices() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("services"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.gstreamer.mpegts.SDTService>(RESULT, org.gstreamer.mpegts.SDTService.fromAddress);
    }
    
    /**
     * Change the value of the field {@code services}
     * @param services The new value of the field {@code services}
     */
    public void setServices(org.gstreamer.mpegts.SDTService[] services) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("services"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (services == null ? MemoryAddress.NULL : Interop.allocateNativeArray(services, org.gstreamer.mpegts.SDTService.getMemoryLayout(), false)));
    }
    
    /**
     * Create a SDT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SDT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SDT> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SDT(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_sdt_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates and initializes a {@link SDT}.
     */
    public SDT() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_sdt_new = Interop.downcallHandle(
            "gst_mpegts_sdt_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link SDT.Builder} object constructs a {@link SDT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SDT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SDT struct;
        
        private Builder() {
            struct = SDT.allocate();
        }
        
         /**
         * Finish building the {@link SDT} struct.
         * @return A new instance of {@code SDT} with the fields 
         *         that were set in the Builder object.
         */
        public SDT build() {
            return struct;
        }
        
        /**
         * Network ID of the originating delivery system
         * @param originalNetworkId The value for the {@code originalNetworkId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOriginalNetworkId(short originalNetworkId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("original_network_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), originalNetworkId);
            return this;
        }
        
        /**
         * True if the table describes this transport stream
         * @param actualTs The value for the {@code actualTs} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActualTs(boolean actualTs) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("actual_ts"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(actualTs, null).intValue());
            return this;
        }
        
        /**
         * ID of this transport stream
         * @param transportStreamId The value for the {@code transportStreamId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTransportStreamId(short transportStreamId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transport_stream_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), transportStreamId);
            return this;
        }
        
        /**
         * List of services
         * @param services The value for the {@code services} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setServices(org.gstreamer.mpegts.SDTService[] services) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("services"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (services == null ? MemoryAddress.NULL : Interop.allocateNativeArray(services, org.gstreamer.mpegts.SDTService.getMemoryLayout(), false)));
            return this;
        }
    }
}
