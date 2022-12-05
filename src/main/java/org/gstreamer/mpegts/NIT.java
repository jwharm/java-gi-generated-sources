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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("actual_network"),
        Interop.valueLayout.C_SHORT.withName("network_id"),
        MemoryLayout.paddingLayout(16),
        Interop.valueLayout.ADDRESS.withName("descriptors"),
        Interop.valueLayout.ADDRESS.withName("streams")
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
    public boolean actualNetwork$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("actual_network"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code actual_network}
     * @param actualNetwork The new value of the field {@code actual_network}
     */
    public void actualNetwork$set(boolean actualNetwork) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("actual_network"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), actualNetwork ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code network_id}
     * @return The value of the field {@code network_id}
     */
    public short networkId$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("network_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code network_id}
     * @param networkId The new value of the field {@code network_id}
     */
    public void networkId$set(short networkId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("network_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), networkId);
    }
    
    /**
     * Create a NIT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public NIT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private NIT struct;
        
         /**
         * A {@link NIT.Build} object constructs a {@link NIT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = NIT.allocate();
        }
        
         /**
         * Finish building the {@link NIT} struct.
         * @return A new instance of {@code NIT} with the fields 
         *         that were set in the Build object.
         */
        public NIT construct() {
            return struct;
        }
        
        /**
         * Whether this NIT corresponds to the actual stream
         * @param actualNetwork The value for the {@code actualNetwork} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setActualNetwork(boolean actualNetwork) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("actual_network"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), actualNetwork ? 1 : 0);
            return this;
        }
        
        /**
         * ID of the network that this NIT describes
         * @param networkId The value for the {@code networkId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNetworkId(short networkId) {
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
        public Build setDescriptors(org.gstreamer.mpegts.Descriptor[] descriptors) {
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
        public Build setStreams(org.gstreamer.mpegts.NITStream[] streams) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("streams"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (streams == null ? MemoryAddress.NULL : Interop.allocateNativeArray(streams, org.gstreamer.mpegts.NITStream.getMemoryLayout(), false)));
            return this;
        }
    }
}
