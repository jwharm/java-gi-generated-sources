package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Selection Information Table (EN 300 468)
 * @version 1.20
 */
public class SIT extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsSIT";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("descriptors"),
            Interop.valueLayout.ADDRESS.withName("services")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SIT}
     * @return A new, uninitialized @{link SIT}
     */
    public static SIT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SIT newInstance = new SIT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
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
     * Get the value of the field {@code services}
     * @return The value of the field {@code services}
     */
    public PointerProxy<org.gstreamer.mpegts.SITService> getServices() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("services"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.gstreamer.mpegts.SITService>(RESULT, org.gstreamer.mpegts.SITService.fromAddress);
    }
    
    /**
     * Change the value of the field {@code services}
     * @param services The new value of the field {@code services}
     */
    public void setServices(org.gstreamer.mpegts.SITService[] services) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("services"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (services == null ? MemoryAddress.NULL : Interop.allocateNativeArray(services, org.gstreamer.mpegts.SITService.getMemoryLayout(), false)));
    }
    
    /**
     * Create a SIT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SIT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SIT> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SIT(input, ownership);
    
    /**
     * A {@link SIT.Builder} object constructs a {@link SIT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SIT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SIT struct;
        
        private Builder() {
            struct = SIT.allocate();
        }
        
         /**
         * Finish building the {@link SIT} struct.
         * @return A new instance of {@code SIT} with the fields 
         *         that were set in the Builder object.
         */
        public SIT build() {
            return struct;
        }
        
        /**
         * List of descriptors
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
         * List of services
         * @param services The value for the {@code services} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setServices(org.gstreamer.mpegts.SITService[] services) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("services"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (services == null ? MemoryAddress.NULL : Interop.allocateNativeArray(services, org.gstreamer.mpegts.SITService.getMemoryLayout(), false)));
            return this;
        }
    }
}
