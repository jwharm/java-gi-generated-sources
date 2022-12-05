package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Region Rating Table (A65)
 * @version 1.18
 */
public class AtscRRT extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsAtscRRT";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_BYTE.withName("protocol_version"),
        MemoryLayout.paddingLayout(56),
        Interop.valueLayout.ADDRESS.withName("names"),
        Interop.valueLayout.C_BYTE.withName("dimensions_defined"),
        MemoryLayout.paddingLayout(56),
        Interop.valueLayout.ADDRESS.withName("dimensions"),
        Interop.valueLayout.ADDRESS.withName("descriptors")
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
     * Allocate a new {@link AtscRRT}
     * @return A new, uninitialized @{link AtscRRT}
     */
    public static AtscRRT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AtscRRT newInstance = new AtscRRT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code protocol_version}
     * @return The value of the field {@code protocol_version}
     */
    public byte protocolVersion$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code protocol_version}
     * @param protocolVersion The new value of the field {@code protocol_version}
     */
    public void protocolVersion$set(byte protocolVersion) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), protocolVersion);
    }
    
    /**
     * Get the value of the field {@code dimensions_defined}
     * @return The value of the field {@code dimensions_defined}
     */
    public byte dimensionsDefined$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dimensions_defined"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code dimensions_defined}
     * @param dimensionsDefined The new value of the field {@code dimensions_defined}
     */
    public void dimensionsDefined$set(byte dimensionsDefined) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dimensions_defined"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), dimensionsDefined);
    }
    
    /**
     * Create a AtscRRT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AtscRRT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_atsc_rrt_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public AtscRRT() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_atsc_rrt_new = Interop.downcallHandle(
            "gst_mpegts_atsc_rrt_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AtscRRT struct;
        
         /**
         * A {@link AtscRRT.Build} object constructs a {@link AtscRRT} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AtscRRT.allocate();
        }
        
         /**
         * Finish building the {@link AtscRRT} struct.
         * @return A new instance of {@code AtscRRT} with the fields 
         *         that were set in the Build object.
         */
        public AtscRRT construct() {
            return struct;
        }
        
        /**
         * The protocol version
         * @param protocolVersion The value for the {@code protocolVersion} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setProtocolVersion(byte protocolVersion) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), protocolVersion);
            return this;
        }
        
        /**
         * the names
         * @param names The value for the {@code names} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNames(org.gstreamer.mpegts.AtscMultString[] names) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("names"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (names == null ? MemoryAddress.NULL : Interop.allocateNativeArray(names, org.gstreamer.mpegts.AtscMultString.getMemoryLayout(), false)));
            return this;
        }
        
        /**
         * the number of dimensions defined for this rating table
         * @param dimensionsDefined The value for the {@code dimensionsDefined} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDimensionsDefined(byte dimensionsDefined) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dimensions_defined"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), dimensionsDefined);
            return this;
        }
        
        /**
         * A set of dimensions
         * @param dimensions The value for the {@code dimensions} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDimensions(org.gstreamer.mpegts.AtscRRTDimension[] dimensions) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dimensions"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dimensions == null ? MemoryAddress.NULL : Interop.allocateNativeArray(dimensions, org.gstreamer.mpegts.AtscRRTDimension.getMemoryLayout(), false)));
            return this;
        }
        
        /**
         * descriptors
         * @param descriptors The value for the {@code descriptors} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDescriptors(java.lang.foreign.MemoryAddress[] descriptors) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (descriptors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(descriptors, false)));
            return this;
        }
    }
}
