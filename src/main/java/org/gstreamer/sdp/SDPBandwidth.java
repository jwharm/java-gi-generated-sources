package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The contents of the SDP "b=" field which specifies the proposed bandwidth to
 * be used by the session or media.
 */
public class SDPBandwidth extends Struct {
    
    static {
        GstSdp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstSDPBandwidth";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("bwtype"),
        Interop.valueLayout.C_INT.withName("bandwidth")
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
     * Allocate a new {@link SDPBandwidth}
     * @return A new, uninitialized @{link SDPBandwidth}
     */
    public static SDPBandwidth allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SDPBandwidth newInstance = new SDPBandwidth(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code bwtype}
     * @return The value of the field {@code bwtype}
     */
    public java.lang.String bwtype$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bwtype"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code bwtype}
     * @param bwtype The new value of the field {@code bwtype}
     */
    public void bwtype$set(java.lang.String bwtype) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bwtype"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(bwtype));
    }
    
    /**
     * Get the value of the field {@code bandwidth}
     * @return The value of the field {@code bandwidth}
     */
    public int bandwidth$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bandwidth"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code bandwidth}
     * @param bandwidth The new value of the field {@code bandwidth}
     */
    public void bandwidth$set(int bandwidth) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bandwidth"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), bandwidth);
    }
    
    /**
     * Create a SDPBandwidth proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SDPBandwidth(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Reset the bandwidth information in {@code bw}.
     * @return a {@link SDPResult}.
     */
    public @NotNull org.gstreamer.sdp.SDPResult clear() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_bandwidth_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Set bandwidth information in {@code bw}.
     * @param bwtype the bandwidth modifier type
     * @param bandwidth the bandwidth in kilobits per second
     * @return a {@link SDPResult}.
     */
    public @NotNull org.gstreamer.sdp.SDPResult set(@NotNull java.lang.String bwtype, int bandwidth) {
        java.util.Objects.requireNonNull(bwtype, "Parameter 'bwtype' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_bandwidth_set.invokeExact(
                    handle(),
                    Interop.allocateNativeString(bwtype),
                    bandwidth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_sdp_bandwidth_clear = Interop.downcallHandle(
            "gst_sdp_bandwidth_clear",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_bandwidth_set = Interop.downcallHandle(
            "gst_sdp_bandwidth_set",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SDPBandwidth struct;
        
         /**
         * A {@link SDPBandwidth.Build} object constructs a {@link SDPBandwidth} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SDPBandwidth.allocate();
        }
        
         /**
         * Finish building the {@link SDPBandwidth} struct.
         * @return A new instance of {@code SDPBandwidth} with the fields 
         *         that were set in the Build object.
         */
        public SDPBandwidth construct() {
            return struct;
        }
        
        /**
         * the bandwidth modifier type
         * @param bwtype The value for the {@code bwtype} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBwtype(java.lang.String bwtype) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bwtype"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (bwtype == null ? MemoryAddress.NULL : Interop.allocateNativeString(bwtype)));
            return this;
        }
        
        /**
         * the bandwidth in kilobits per second
         * @param bandwidth The value for the {@code bandwidth} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBandwidth(int bandwidth) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bandwidth"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), bandwidth);
            return this;
        }
    }
}
