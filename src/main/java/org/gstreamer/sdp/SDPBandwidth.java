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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("bwtype"),
            Interop.valueLayout.C_INT.withName("bandwidth")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SDPBandwidth}
     * @return A new, uninitialized @{link SDPBandwidth}
     */
    public static SDPBandwidth allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SDPBandwidth newInstance = new SDPBandwidth(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code bwtype}
     * @return The value of the field {@code bwtype}
     */
    public java.lang.String getBwtype() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bwtype"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code bwtype}
     * @param bwtype The new value of the field {@code bwtype}
     */
    public void setBwtype(java.lang.String bwtype) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bwtype"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (bwtype == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(bwtype, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code bandwidth}
     * @return The value of the field {@code bandwidth}
     */
    public int getBandwidth() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bandwidth"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code bandwidth}
     * @param bandwidth The new value of the field {@code bandwidth}
     */
    public void setBandwidth(int bandwidth) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bandwidth"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), bandwidth);
        }
    }
    
    /**
     * Create a SDPBandwidth proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SDPBandwidth(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SDPBandwidth> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SDPBandwidth(input);
    
    /**
     * Reset the bandwidth information in {@code bw}.
     * @return a {@link SDPResult}.
     */
    public org.gstreamer.sdp.SDPResult clear() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_bandwidth_clear.invokeExact(handle());
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
    public org.gstreamer.sdp.SDPResult set(java.lang.String bwtype, int bandwidth) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_sdp_bandwidth_set.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(bwtype, SCOPE),
                        bandwidth);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.sdp.SDPResult.of(RESULT);
        }
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
     * A {@link SDPBandwidth.Builder} object constructs a {@link SDPBandwidth} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SDPBandwidth.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SDPBandwidth struct;
        
        private Builder() {
            struct = SDPBandwidth.allocate();
        }
        
        /**
         * Finish building the {@link SDPBandwidth} struct.
         * @return A new instance of {@code SDPBandwidth} with the fields 
         *         that were set in the Builder object.
         */
        public SDPBandwidth build() {
            return struct;
        }
        
        /**
         * the bandwidth modifier type
         * @param bwtype The value for the {@code bwtype} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBwtype(java.lang.String bwtype) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("bwtype"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (bwtype == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(bwtype, SCOPE)));
                return this;
            }
        }
        
        /**
         * the bandwidth in kilobits per second
         * @param bandwidth The value for the {@code bandwidth} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBandwidth(int bandwidth) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("bandwidth"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), bandwidth);
                return this;
            }
        }
    }
}
